package com.dnt.ftp;

import it.sauronsoftware.ftp4j.FTPClient;
import it.sauronsoftware.ftp4j.FTPFile;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.ejb.Stateless;

import org.milyn.Smooks;
import org.milyn.edi.unedifact.d97a.D97AInterchangeFactory;
import org.milyn.edi.unedifact.d97a.PAYMUL.Paymul;
import org.milyn.edi.unedifact.d97a.PAYMUL.SegmentGroup6;
import org.milyn.edi.unedifact.d97a.PAYMUL.SegmentGroup7;
import org.milyn.edi.unedifact.d97a.common.ControlTotal;
import org.milyn.edi.unedifact.d97a.common.Reference;
import org.milyn.smooks.edi.unedifact.UNEdifactReaderConfigurator;
import org.milyn.smooks.edi.unedifact.model.UNEdifactInterchange;
import org.milyn.smooks.edi.unedifact.model.r41.UNEdifactInterchange41;
import org.milyn.smooks.edi.unedifact.model.r41.UNEdifactMessage41;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xml.sax.SAXException;

import com.dnt.epay.bean.EpayEdiFileBean;
import com.dnt.epay.bean.EpayFpxExchangeBean;
import com.dnt.epay.bean.EpayFpxSellerBean;
import com.dnt.epay.bean.EpayFpxTransactionBean;
import com.dnt.epay.bean.EpayPaymentHeaderBean;
import com.dnt.epay.entities.EpayEdiFile;
import com.dnt.epay.entities.EpayFpxExchange;
import com.dnt.epay.entities.EpayFpxSeller;
import com.dnt.epay.entities.EpayPaymentDetail;
import com.dnt.epay.entities.EpayPaymentHeader;
import com.dnt.epay.fpx.EpayFpxMsgBuilder;
import com.dnt.epay.fpx.FpxRequestMessage;

@Stateless
public class EpayFtpEdi {

	public static Logger logger = LoggerFactory.getLogger(EpayFtpEdi.class);

	public void grapEdi() {
		// public static void main(String args[]) {
		// TODO Auto-generated method stub

		FTPClient client = new FTPClient();
		EpayFtpEdi epayEdiFtp = new EpayFtpEdi();

		try {
			logger.debug("===== Initiating FTP connection to XIB =====");

			String xibIp = "172.28.1.11";
			int port = 21;
			String username = "xib";
			String password = "xib";
			String mailbox = "/mailboxes/ediusers/EDITST2014003/mailbox";
			String paymulStorage = "C:\\workspace\\paymuls\\";
			logger.debug("FTP [" + xibIp + "," + port + "," + mailbox + "]");

			client.connect(xibIp, port);
			client.login(username, password);
			client.changeDirectory(mailbox);
			String dir = client.currentDirectory();
			logger.debug("Current dir is: " + dir);

			FTPFile[] files = client.list();
			for (FTPFile fName : files) {
				logger.debug("name: " + fName.getName());
				try {
					File paymul = new File(paymulStorage + fName.getName());
					client.download(fName.getName(), paymul);
					epayEdiFtp.fixPaymulHeader(paymul);
					epayEdiFtp.process(paymul);
				} catch (IOException | SAXException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			;
			logger.debug(e.getMessage());
		}

	}

	private void process(File file) throws IOException, SAXException {
		// TODO Auto-generated method stub
		logger.debug("***********Beginning of process Method:");
		InputStream inStrem = new FileInputStream(file.getAbsolutePath());
		BufferedInputStream ediInstream = new BufferedInputStream(inStrem);
		Smooks smooks = new Smooks("SmooksConfig.xml");
		Paymul paymul = null;
		MessageHeadHelper messageHeader = new MessageHeadHelper();

		try {
			smooks.setReaderConfig(new UNEdifactReaderConfigurator(
					"urn:org.milyn.edi.unedifact:d97a-mapping:*"));
			D97AInterchangeFactory factory = D97AInterchangeFactory
					.getInstance();
			UNEdifactInterchange interchange = factory
					.fromUNEdifact(ediInstream);
			if (interchange instanceof UNEdifactInterchange41) {
				UNEdifactInterchange41 interchange41 = (UNEdifactInterchange41) interchange;
				logger.debug("\nJava Object Values:");
				logger.debug("\tInterchange Sender ID: "
						+ interchange41.getInterchangeHeader().getSender()
								.getId());
				messageHeader.setApplicationRef(interchange41
						.getInterchangeHeader().getApplicationRef());
				messageHeader.setMsgDatePreparation(interchange41
						.getInterchangeHeader().getDate().getDate());
				messageHeader.setEdiVersionCode(interchange41
						.getInterchangeHeader().getSyntaxIdentifier()
						.getVersionNum());
				messageHeader.setInterchangeId(interchange41
						.getInterchangeHeader().getControlRef());
				messageHeader.setMsgRecipientId(interchange41
						.getInterchangeHeader().getRecipient().getId());
				messageHeader.setMsgSenderId(interchange41
						.getInterchangeHeader().getSender().getId());

				for (UNEdifactMessage41 message : interchange41.getMessages()) {
					Object messageObj = message.getMessage();
					System.out.println("\tMessage Name: "
							+ message.getMessageHeader().getMessageIdentifier()
									.getId());

					if (messageObj instanceof Paymul) {
						logger.debug("========================== PAYMUL ============================");
						paymul = (Paymul) messageObj;
					}
				}
				logger.debug("***********Smooks Paymul Object is created");
			}

		} catch (Exception e) {
			System.out.println("cannot convert the file in to java obj-----"
					+ e.getMessage());
		}
		smooks.close();
		List<EpayPaymentDetail> epayPaymentDetailList = new ArrayList<EpayPaymentDetail>();
		EpayPaymentHeader epayPaymentHeader = null;
		if (paymul != null) {
			epayPaymentHeader = fetchPaymentHeaderDetails(paymul, messageHeader);
			UUID genUUID = UUID.randomUUID();
			epayPaymentHeader.setEphId(genUUID.toString());
			EpayPaymentDetail epayPaymentDetail = fetchPaymentDetails(paymul);
			epayPaymentDetail.setEpdEphTxnId(epayPaymentHeader);
			epayPaymentDetailList.add(epayPaymentDetail);
			epayPaymentHeader.setEpayPaymentDetailsList(epayPaymentDetailList);
			EpayEdiFile auditLog = new EpayEdiFile();
			auditLog.setEefMakerId("epay system");
			auditLog.setEefMakerDt(new Date());
			auditLog.setEefDatetime(new Date());
			auditLog.setEefFileName(file.getName());
			auditLog.setEefProcStat("C");
			auditLog.setEefFiletype("EDI");
			auditLog.setEefAppName("XIB");
			auditLog.setEefServerName("APP1");
			auditLog.setEefRemarks("PROCESSED SUCCESSFULLY");
			genUUID = UUID.randomUUID();
			auditLog.setEefId(genUUID.toString());
			EpayPaymentHeaderBean headerBean = new EpayPaymentHeaderBean();
			headerBean.insertHeader(epayPaymentHeader);
			EpayEdiFileBean ediFileBean = new EpayEdiFileBean();
			ediFileBean.insert(auditLog);

		}
		FpxRequestMessage requestMessage = this
				.createFpxRequestMessage(epayPaymentHeader);
		// requestMessage.setMessageEphId(epayPaymentHeader.getEphTxnId());
		EpayFpxTransactionBean fpxTransactionBean = new EpayFpxTransactionBean();
		fpxTransactionBean.saveFpxTransaction(requestMessage);

		logger.info("***********Before craeteXMlMessageTpFPX Call");
		EpayFpxMsgBuilder messageBuilder = new EpayFpxMsgBuilder();
		messageBuilder.createXmlMessageToFpx(requestMessage);

	}

	private EpayPaymentDetail fetchPaymentDetails(Paymul paymul) {
		// TODO Auto-generated method stub

		EpayPaymentDetail epayPaymentDetail = new EpayPaymentDetail();
		paymul.getSegmentGroup4()
				.forEach(
						sg4 -> {
							sg4.getSegmentGroup11()
									.forEach(
											grp11 -> {
												epayPaymentDetail
														.setEpdSeqNo(grp11
																.getSequenceDetails()
																.getSequenceInformation()
																.getSequenceNumber());
												epayPaymentDetail
														.setEpdSeqIndAmt(grp11
																.getMonetaryAmount()
																.getMonetaryAmount()
																.getMonetaryAmount());
												epayPaymentDetail
														.setEpdSeqProcInd(grp11
																.getSegmentGroup16()
																.getProcessIdentification()
																.getProcessTypeAndDescription()
																.getProcessTypeIdentification());
												grp11.getSegmentGroup16()
														.getSegmentGroup17()
														.forEach(
																grp17 -> {
																	grp17.getDateTimePeriod()
																			.forEach(
																					dateAndTime -> {
																						SimpleDateFormat df = new SimpleDateFormat(
																								"yyyyMMdd");
																						try {
																							Date seqRegDate = df
																									.parse(dateAndTime
																											.getDateTimePeriod()
																											.getDateTimePeriod());
																							epayPaymentDetail
																									.setEpdSeqRegDate(seqRegDate);
																						} catch (Exception e) {
																							e.printStackTrace();
																						}
																					});
																	epayPaymentDetail
																			.setEpdSeqRefNo(grp17
																					.getDocumentMessageDetails()
																					.getDocumentMessageDetails()
																					.getDocumentMessageNumber());
																	epayPaymentDetail
																			.setEpdSeqRefType(grp17
																					.getDocumentMessageDetails()
																					.getDocumentMessageName()
																					.getDocumentMessageNameCoded());
																	epayPaymentDetail
																			.setEpdSeqRefDesc(grp17
																					.getDocumentMessageDetails()
																					.getDocumentMessageName()
																					.getDocumentMessageName());
																});

											});

						});

		UUID genUUID = UUID.randomUUID();
		epayPaymentDetail.setEpdId(genUUID.toString());
		epayPaymentDetail.setEpdTxnStatus("RC");

		return epayPaymentDetail;

	}

	private EpayPaymentHeader fetchPaymentHeaderDetails(Paymul paymul,
			MessageHeadHelper messageHeader) {
		// TODO Auto-generated method stub
		System.out
				.println("::::::::Inside fetchPaymentHeaderDetails method:::::::::: ");

		EpayPaymentHeader epayPaymentHeader = new EpayPaymentHeader();

		UUID genUUID = UUID.randomUUID();

		epayPaymentHeader.setEphAppRef(paymul.getBeginningOfMessage()
				.getMessageFunctionCoded());
		epayPaymentHeader.setEphJobno(paymul.getBeginningOfMessage()
				.getDocumentMessageIdentification().getDocumentMessageNumber());
		epayPaymentHeader.setEphTxnid(genUUID.toString());
		epayPaymentHeader.setEphEdiVersionCode(paymul.getBeginningOfMessage()
				.getDocumentMessageIdentification().getDocumentMessageNumber()
				+ ":"
				+ paymul.getBeginningOfMessage()
						.getDocumentMessageIdentification().getRevisionNumber()
				+ ":"
				+ paymul.getBeginningOfMessage()
						.getDocumentMessageIdentification().getVersion());
		epayPaymentHeader.setEphMsgDate(paymul.getDateTimePeriod()
				.getDateTimePeriod().getDateTimePeriod()); // TODO :Need to
															// change formate of
															// entity n table
		epayPaymentHeader.setEphMsgFunc(paymul.getBeginningOfMessage()
				.getMessageFunctionCoded());
		epayPaymentHeader.setEphMsgId(paymul.getBeginningOfMessage()
				.getDocumentMessageIdentification().getDocumentMessageNumber());
		epayPaymentHeader.setEphMsgType(paymul.getBeginningOfMessage()
				.getDocumentMessageName().getDocumentMessageNameCoded());

		paymul.getSegmentGroup1().forEach(
				srg1 -> {
					epayPaymentHeader.setEphOrgMsg(srg1.getReference()
							.getReference().getReferenceQualifier());
				});

		paymul.getSegmentGroup4()
				.forEach(
						sg4 -> {
							epayPaymentHeader.setEphValDate(sg4
									.getDateTimePeriod().getDateTimePeriod()
									.getDateTimePeriod());
							epayPaymentHeader.setEphFiCode(sg4
									.getFinancialChargesAllocation()
									.getSettlementCoded());
							epayPaymentHeader.setEphSettlementCode(sg4
									.getFinancialChargesAllocation()
									.getSettlementCoded());
							epayPaymentHeader.setEphTotaldutyCode(sg4
									.getSegmentGroup5().getMonetaryAmount()
									.getMonetaryAmount()
									.getMonetaryAmountTypeQualifier());
							Double tempRefAmt = sg4.getSegmentGroup5()
									.getMonetaryAmount().getMonetaryAmount()
									.getMonetaryAmount().doubleValue() / 100;
							epayPaymentHeader.setEphPayorRefAmt(BigDecimal
									.valueOf(tempRefAmt));
							epayPaymentHeader.setEphFiSettlementAcc(sg4
									.getFinancialChargesAllocation()
									.getChargeAllowanceAccount()
									.getAccountHolderNumber());
							epayPaymentHeader.setEphFinTxnType(sg4
									.getBusinessFunction()
									.getTypeOfFinancialTransactionCoded());
							epayPaymentHeader.setEphItemNo(sg4.getLineItem()
									.getLineItemNumber());
							epayPaymentHeader.setEphPmtDesc(sg4
									.getBusinessFunction()
									.getBusinessFunction()
									.getBusinessDescription());
							epayPaymentHeader.setEphFiSettlement(sg4
									.getFinancialChargesAllocation()
									.getSettlementCoded());
							epayPaymentHeader.setEphTotaldutyCode(sg4
									.getSegmentGroup5().getMonetaryAmount()
									.getMonetaryAmount().getStatusCoded());
							epayPaymentHeader.setEphBusFunction(sg4
									.getBusinessFunction()
									.getBusinessFunction()
									.getBusinessFunctionCoded());
							epayPaymentHeader.setEphTotaldutyTxn(sg4
									.getSegmentGroup5().getMonetaryAmount()
									.getMonetaryAmount().getMonetaryAmount());
							List<Reference> refList = sg4.getReference();
							epayPaymentHeader.setEphPayorRefNo(refList.get(0)
									.getReference().getReferenceNumber());
							epayPaymentHeader.setEphSellerOrderCode(refList
									.get(0).getReference()
									.getReferenceQualifier());
							epayPaymentHeader.setEphPmtPurpose(sg4
									.getBusinessFunction()
									.getBusinessFunction()
									.getBusinessFunctionCoded());

							SegmentGroup7 grp7_0 = sg4.getSegmentGroup7()
									.get(0);
							if (grp7_0 != null) {
								epayPaymentHeader.setEphAgentName(grp7_0
										.getNameAndAddress()
										.getNameAndAddress()
										.getNameAndAddressLine1());
								epayPaymentHeader.setEphAgentAddress(grp7_0
										.getNameAndAddress()
										.getNameAndAddress()
										.getNameAndAddressLine2()
										+ ":"
										+ grp7_0.getNameAndAddress()
												.getNameAndAddress()
												.getNameAndAddressLine3()
										+ ":"
										+ grp7_0.getNameAndAddress()
												.getNameAndAddress()
												.getNameAndAddressLine4()
										+ ":"
										+ grp7_0.getNameAndAddress()
												.getNameAndAddress()
												.getNameAndAddressLine5());

								if (grp7_0.getCommunicationContact().size() > 0) {
									grp7_0.getCommunicationContact()
											.forEach(
													communicationContact -> {
														epayPaymentHeader
																.setEphAgentContactNo(communicationContact
																		.getCommunicationContact()
																		.getCommunicationNumber());
														epayPaymentHeader
																.setEphPayeeNumber(communicationContact
																		.getCommunicationContact()
																		.getCommunicationNumber());
													});
								}

								epayPaymentHeader.setEphAgentCode(grp7_0
										.getNameAndAddress()
										.getPartyIdentificationDetails()
										.getPartyIdIdentification());
								epayPaymentHeader.setEphAgentType(grp7_0
										.getNameAndAddress()
										.getPartyQualifier());

							}
							SegmentGroup7 grp7_1 = sg4.getSegmentGroup7()
									.get(1);
							if (grp7_1 != null) {
								epayPaymentHeader.setEphSellerName(grp7_1
										.getNameAndAddress()
										.getNameAndAddress()
										.getNameAndAddressLine1());
								epayPaymentHeader.setEphFrontendCode(grp7_1
										.getNameAndAddress()
										.getPartyIdentificationDetails()
										.getPartyIdIdentification());
								epayPaymentHeader.setEphSellerAddress(grp7_1
										.getNameAndAddress()
										.getNameAndAddress()
										.getNameAndAddressLine2()
										+ ":"
										+ grp7_1.getNameAndAddress()
												.getNameAndAddress()
												.getNameAndAddressLine3()
										+ ":"
										+ grp7_1.getNameAndAddress()
												.getNameAndAddress()
												.getNameAndAddressLine4()
										+ ":"
										+ grp7_1.getNameAndAddress()
												.getNameAndAddress()
												.getNameAndAddressLine5());
								epayPaymentHeader.setEphSellerCode(grp7_1
										.getNameAndAddress()
										.getPartyIdentificationDetails()
										.getPartyIdIdentification());
							}

						});

		paymul.getSegmentGroup4()
				.forEach(sg4 -> {
					// epayPaymentHeader.setEphMakerName(); /TODO: The id will
					// be avaiable only for RHB bank
					// epayPaymentHeader.setEphBuyerBankId(); //TODO: The id
					// will be avaiable only for RHB bank
					// epayPaymentHeader.setEphSellerEpayCode(ephSellerEpayCode);
						SegmentGroup6 grp6_0 = sg4.getSegmentGroup6().get(0);
						epayPaymentHeader.setEphBuyerHolderName(grp6_0
								.getFinancialInstitutionInformation()
								.getAccountIdentification()
								.getAccountHolderName1());
						epayPaymentHeader.setEphBuyerAcctNo(grp6_0
								.getFinancialInstitutionInformation()
								.getAccountIdentification()
								.getAccountHolderNumber());
						epayPaymentHeader.setEphAmtCur(grp6_0
								.getFinancialInstitutionInformation()
								.getAccountIdentification().getCurrencyCoded());
						epayPaymentHeader.setEphBuyerBankFiCode(grp6_0
								.getFinancialInstitutionInformation()
								.getPartyQualifier());
						epayPaymentHeader.setEphBuyerBankAgency(grp6_0
								.getFinancialInstitutionInformation()
								.getInstitutionIdentification()
								.getCodeListResponsibleAgencyCoded1());
						epayPaymentHeader.setEphBuyerBankBranch(grp6_0
								.getFinancialInstitutionInformation()
								.getInstitutionIdentification()
								.getInstitutionBranchNumber());
						epayPaymentHeader.setEphBuyerBankName(grp6_0
								.getFinancialInstitutionInformation()
								.getInstitutionIdentification()
								.getInstitutionName());
						epayPaymentHeader.setEphBuyerBankCode(grp6_0
								.getFinancialInstitutionInformation()
								.getInstitutionIdentification()
								.getInstitutionNameIdentification());
						epayPaymentHeader.setEphOrderedBankFiCode(grp6_0
								.getFinancialInstitutionInformation()
								.getPartyQualifier());
						epayPaymentHeader.setEphFiSettlement(grp6_0
								.getFinancialInstitutionInformation()
								.getInstitutionIdentification()
								.getCodeListResponsibleAgencyCoded2());
						// epayPaymentHeader.setEphOrderedContactPerson(grp6.getContactInformation().getDepartmentOrEmployeeDetails().getDepartmentOrEmployee());
						if (grp6_0.getCommunicationContact().size() > 0) {
							grp6_0.getCommunicationContact()
									.forEach(
											communicationContact -> {
												epayPaymentHeader
														.setEphBuyerContactNo(communicationContact
																.getCommunicationContact()
																.getCommunicationNumber());
											});
						}
						epayPaymentHeader.setEphBuyerBankAgency(grp6_0
								.getFinancialInstitutionInformation()
								.getInstitutionIdentification()
								.getCodeListResponsibleAgencyCoded2());
						epayPaymentHeader.setEphMsgSenderId(grp6_0
								.getFinancialInstitutionInformation()
								.getInstitutionIdentification()
								.getInstitutionBranchNumber());

						SegmentGroup6 grp6_1 = sg4.getSegmentGroup6().get(1);
						epayPaymentHeader.setEphSellerAcctNo(grp6_1
								.getFinancialInstitutionInformation()
								.getAccountIdentification()
								.getAccountHolderNumber());
						// epayPaymentHeader.setEphBenContactPerson(grp6.getContactInformation().getContactFunctionCoded());
						// //TODO: Need to check with other file
						epayPaymentHeader.setEphSellerFiCode(grp6_1
								.getFinancialInstitutionInformation()
								.getInstitutionIdentification()
								.getInstitutionNameIdentification());
						if (grp6_1.getCommunicationContact().size() > 0) {
							grp6_1.getCommunicationContact()
									.forEach(
											communicationContact -> {
												epayPaymentHeader
														.setEphSellerContactNo(communicationContact
																.getCommunicationContact()
																.getCommunicationNumber());
											});
							epayPaymentHeader.setEphSellerBankAgency(grp6_1
									.getFinancialInstitutionInformation()
									.getInstitutionIdentification()
									.getCodeListResponsibleAgencyCoded2());
							epayPaymentHeader.setEphSellerBankName(grp6_1
									.getFinancialInstitutionInformation()
									.getInstitutionIdentification()
									.getInstitutionName());
						}
						// epayPaymentHeader.setEphSellerBankAgency(grp6_1
						// .getFinancialInstitutionInformation()
						// .getInstitutionIdentification()
						// .getInstitutionName());
						epayPaymentHeader.setEphMsgRecipientId(grp6_1
								.getFinancialInstitutionInformation()
								.getInstitutionIdentification()
								.getInstitutionBranchNumber());
						epayPaymentHeader.setEphHolderSellerName(grp6_1
								.getFinancialInstitutionInformation()
								.getAccountIdentification()
								.getAccountHolderName1());
						epayPaymentHeader.setEphSellerBankBranch(grp6_1
								.getFinancialInstitutionInformation()
								.getInstitutionIdentification()
								.getInstitutionBranchNumber());

					});

		paymul.getSegmentGroup4()
				.forEach(
						sg4 -> {
							sg4.getSegmentGroup11()
									.forEach(
											grp11 -> {
												epayPaymentHeader
														.setEphMsgSeqNo(grp11
																.getSequenceDetails()
																.getSequenceInformation()
																.getSequenceNumber());
												grp11.getSegmentGroup16()
														.getSegmentGroup17()
														.forEach(
																grp17 -> {
																	epayPaymentHeader
																			.setEphDocRefName(grp17
																					.getDocumentMessageDetails()
																					.getDocumentMessageName()
																					.getDocumentMessageName());
																});
											});
						});

		List<ControlTotal> cTotal = paymul.getControlTotal();
		Double tempTotAmt = cTotal.get(0).getControl().getControlValue()
				.doubleValue();
		epayPaymentHeader.setEphTotAmt(BigDecimal.valueOf(tempTotAmt / 100));
		epayPaymentHeader.setEphTotCnt(cTotal.get(1).getControl()
				.getControlValue());
		epayPaymentHeader.setEphTxnStatus("R");
		epayPaymentHeader.setEphAppRef(messageHeader.getApplicationRef());
		epayPaymentHeader.setEphEdiVersionCode(messageHeader
				.getEdiVersionCode());
		epayPaymentHeader.setEphMsgRecipientId(messageHeader
				.getMsgRecipientId());
		epayPaymentHeader.setEphInterchangeId(messageHeader.getInterchangeId());
		epayPaymentHeader.setEphMsgSenderId(messageHeader.getMsgSenderId());
		epayPaymentHeader.setEphMsgSeqNo(messageHeader.getMsgSeqNo());
		String sellerOrderNo = epayPaymentHeader.getEphSellerCode() + "-";
		sellerOrderNo = sellerOrderNo + epayPaymentHeader.getEphBusFunction()
				+ "-";

		sellerOrderNo = sellerOrderNo
				+ epayPaymentHeader.getEphPayorRefNo().substring(21, 31)
						.replaceAll("\\s", "")
				+ "-"
				+ new SimpleDateFormat("yyyyMMddHHmmssSSSS").format(new Date())
						.substring(2, 17);
		epayPaymentHeader.setEphSellerOrderNo(sellerOrderNo);
		return epayPaymentHeader;

	}

	private void fixPaymulHeader(File file) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub

		try {
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			String lineInFile = bufferedReader.readLine();
			bufferedReader.close();

			logger.debug(lineInFile);

			if (lineInFile.contains("PAYMUL:1:971")) {
				lineInFile = lineInFile.replace("PAYMUL:1:971", "PAYMUL:D:97A");
			}
			logger.debug(lineInFile);

			FileWriter fileWriter = new FileWriter(file);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

			bufferedWriter.write(lineInFile);
			bufferedWriter.flush();
			bufferedWriter.close();

		} catch (FileNotFoundException e) {
			logger.debug(e.getMessage());
		} catch (IOException e) {
			logger.debug(e.getMessage());
		}

	}

	public FpxRequestMessage createFpxRequestMessage(
			EpayPaymentHeader epayPaymentHeader) {
		FpxRequestMessage requestMessage = new FpxRequestMessage();
		logger.debug("Creating Fpx Message Request");

		requestMessage.setMessageType("AR");
		requestMessage.setMessageToken("03");
		EpayFpxExchangeBean fpxExchangeBean = new EpayFpxExchangeBean();
		EpayFpxExchange fpxExchange = fpxExchangeBean.getExchange();
		requestMessage.setSellerExcDesc(fpxExchange.getEfeExchangeName());
		requestMessage.setSellerExcId(fpxExchange.getEfeExchangeId());
		EpayFpxSellerBean fpxSellerBean = new EpayFpxSellerBean();
		EpayFpxSeller fpxSeller = fpxSellerBean.getFpxSeller(epayPaymentHeader
				.getEphFrontendCode());
		requestMessage.setSellerId(fpxSeller.getEfsSellerId());
		requestMessage.setSellerFPXBank("01");

		requestMessage.setMessageOrderNo(System.currentTimeMillis() + "");
		requestMessage.setMessageOrderCount("1");
		requestMessage.setSellerTxnTime(new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()));
		requestMessage.setSlno("1");
		requestMessage
				.setSellerOrderNo(epayPaymentHeader.getEphSellerOrderNo());

		requestMessage.setBuyerBank(epayPaymentHeader.getEphBuyerBankName());
		System.out.println("Buyer Bank Name :"
				+ epayPaymentHeader.getEphBuyerBankName());
		requestMessage.setBuyerBankBranch(epayPaymentHeader
				.getEphBuyerBankBranch());
		System.out.println("Buyer Bank Branch :"
				+ epayPaymentHeader.getEphBuyerBankBranch());
		requestMessage.setBuyerAccNo(epayPaymentHeader.getEphBuyerAcctNo());
		System.out.println("Buyer Account Number :"
				+ epayPaymentHeader.getEphBuyerAcctNo());
		requestMessage.setBuyerName(epayPaymentHeader.getEphBuyerHolderName());
		System.out.println("Holder Name : "
				+ epayPaymentHeader.getEphBuyerHolderName());
		requestMessage.setBuyerId(epayPaymentHeader.getEphAgentCode());
		System.out.println("Buyer Id :" + epayPaymentHeader.getEphAgentCode());

		requestMessage.setMakerName("EPAY_MAKER");
		//requestMessage.setBuyerIban(epayPaymentHeader.getEphBuyerIBAN());
		requestMessage.setBuyerIban("EPAY_IBAN");
		System.out.println("Buyer Iban :" + requestMessage.getBuyerIban());

		requestMessage.setChargeType("AA");
		requestMessage.setMessageCurrency(epayPaymentHeader.getEphAmtCur());
		System.out.println("Amt Currency :" + epayPaymentHeader.getEphAmtCur());
		requestMessage.setMessageAmount(epayPaymentHeader.getEphTotAmt());
		System.out.println("Tot Amount :" + epayPaymentHeader.getEphTotAmt());
		requestMessage.setMessageEphId(epayPaymentHeader.getEphId());
		requestMessage.setMessageEpayService("B2B2");

		return requestMessage;
	}

}
