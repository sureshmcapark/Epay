package com.dnt.epay.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The persistent class for the EPAY_PAYMENT_HEADER database table.
 * 
 */
@Entity
@Table(name = "EPAY_PAYMENT_HEADER")
@NamedQuery(name = "EpayPaymentHeader.findAll", query = "SELECT e FROM EpayPaymentHeader e")
public class EpayPaymentHeader implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "EPH_ID")
	private String ephId;

	@Column(name = "EPH_AGENT_ADDRESS")
	private String ephAgentAddress;

	@Column(name = "EPH_AGENT_CODE")
	private String ephAgentCode;

	@Column(name = "EPH_AGENT_CONTACT")
	private String ephAgentContact;

	@Column(name = "EPH_AGENT_CONTACT_NO")
	private String ephAgentContactNo;

	@Column(name = "EPH_AGENT_NAME")
	private String ephAgentName;

	@Column(name = "EPH_AGENT_TYPE")
	private String ephAgentType;

	@Column(name = "EPH_AMT_CUR")
	private String ephAmtCur;

	@Column(name = "EPH_APP_REF")
	private String ephAppRef;

	@Temporal(TemporalType.DATE)
	@Column(name = "EPH_AUTH_DT")
	private Date ephAuthDt;

	@Column(name = "EPH_AUTH_ID")
	private String ephAuthId;

	@Column(name = "EPH_BUS_FUNCTION")
	private String ephBusFunction;

	@Column(name = "EPH_BUYER_ACCT_NO")
	private String ephBuyerAcctNo;

	@Column(name = "EPH_BUYER_BANK_AGENCY")
	private String ephBuyerBankAgency;

	@Column(name = "EPH_BUYER_BANK_BRANCH")
	private String ephBuyerBankBranch;

	@Column(name = "EPH_BUYER_BANK_BRANCH_ID")
	private String ephBuyerBankBranchId;

	@Column(name = "EPH_BUYER_BANK_CODE")
	private String ephBuyerBankCode;

	@Column(name = "EPH_BUYER_BANK_CONTACT_NO")
	private String ephBuyerBankContactNo;

	@Column(name = "EPH_BUYER_BANK_FI_CODE")
	private String ephBuyerBankFiCode;

	@Column(name = "EPH_BUYER_BANK_ID")
	private String ephBuyerBankId;

	@Column(name = "EPH_BUYER_BANK_NAME")
	private String ephBuyerBankName;

	@Column(name = "EPH_BUYER_CONTACT_NO")
	private String ephBuyerContactNo;

	@Column(name = "EPH_BUYER_CONTACT_PERSON")
	private String ephBuyerContactPerson;

	@Column(name = "EPH_BUYER_HOLDER_NAME")
	private String ephBuyerHolderName;

	@Column(name = "EPH_BUYER_IBAN")
	private String ephBuyerIban;

	@Column(name = "EPH_CODE_LIST_AGENCY")
	private String ephCodeListAgency;

	@Column(name = "EPH_CREDIT_AUTH_CODE")
	private String ephCreditAuthCode;

	@Column(name = "EPH_CREDIT_AUTH_NO")
	private String ephCreditAuthNo;

	@Column(name = "EPH_DATE_PREPARATION")
	private String ephDatePreparation;

	@Column(name = "EPH_DEBIT_AUTH_CODE")
	private String ephDebitAuthCode;

	@Column(name = "EPH_DEBIT_AUTH_NO")
	private String ephDebitAuthNo;

	@Column(name = "EPH_DOC_REF_NAME")
	private String ephDocRefName;

	@Column(name = "EPH_EDI_VERSION_CODE")
	private String ephEdiVersionCode;

	@Column(name = "EPH_FI_CODE")
	private String ephFiCode;

	@Column(name = "EPH_FI_SETTLEMENT")
	private String ephFiSettlement;

	@Column(name = "EPH_FI_SETTLEMENT_ACC")
	private String ephFiSettlementAcc;

	@Column(name = "EPH_FIN_TXN_TYPE")
	private String ephFinTxnType;

	@Column(name = "EPH_FPX_TXN_ID")
	private String ephFpxTxnId;

	@Column(name = "EPH_FRONTEND_CODE")
	private String ephFrontendCode;

	@Column(name = "EPH_HOLDER_SELLER_NAME")
	private String ephHolderSellerName;

	@Column(name = "EPH_INTERCHANGE_ID")
	private String ephInterchangeId;

	@Column(name = "EPH_ITEM_NO")
	private String ephItemNo;

	@Column(name = "EPH_JOBNO")
	private String ephJobno;

	@Temporal(TemporalType.DATE)
	@Column(name = "EPH_LAST_RESP_TIME")
	private Date ephLastRespTime;

	@Temporal(TemporalType.DATE)
	@Column(name = "EPH_MAKER_DT")
	private Date ephMakerDt;

	@Column(name = "EPH_MAKER_ID")
	private String ephMakerId;

	@Column(name = "EPH_MAKER_NAME")
	private String ephMakerName;

	@Column(name = "EPH_MSG_DATE")
	private String ephMsgDate;

	@Temporal(TemporalType.DATE)
	@Column(name = "EPH_MSG_DATETIME")
	private Date ephMsgDatetime;

	@Column(name = "EPH_MSG_FUNC")
	private String ephMsgFunc;

	@Column(name = "EPH_MSG_ID")
	private String ephMsgId;

	@Column(name = "EPH_MSG_RECIPIENT_ID")
	private String ephMsgRecipientId;

	@Column(name = "EPH_MSG_SENDER_ID")
	private String ephMsgSenderId;

	@Column(name = "EPH_MSG_SEQ_NO")
	private String ephMsgSeqNo;

	@Column(name = "EPH_MSG_TYPE")
	private String ephMsgType;

	@Column(name = "EPH_ORDERED_BANK_FI_CODE")
	private String ephOrderedBankFiCode;

	@Column(name = "EPH_ORG_MSG")
	private String ephOrgMsg;

	@Column(name = "EPH_PAYEE_CONTACT")
	private String ephPayeeContact;

	@Column(name = "EPH_PAYEE_NUMBER")
	private String ephPayeeNumber;

	@Column(name = "EPH_PAYMENT_NO")
	private String ephPaymentNo;

	@Column(name = "EPH_PAYOR_REF_AMT")
	private BigDecimal ephPayorRefAmt;

	@Temporal(TemporalType.DATE)
	@Column(name = "EPH_PAYOR_REF_DT")
	private Date ephPayorRefDt;

	@Column(name = "EPH_PAYOR_REF_NO")
	private String ephPayorRefNo;

	@Column(name = "EPH_PMT_DESC")
	private String ephPmtDesc;

	@Column(name = "EPH_PMT_PURPOSE")
	private String ephPmtPurpose;

	@Column(name = "EPH_REF_ORG_MSG")
	private String ephRefOrgMsg;

	@Column(name = "EPH_REF_ORG_NO")
	private String ephRefOrgNo;

	@Column(name = "EPH_ROC_ROB_CODE")
	private String ephRocRobCode;

	@Column(name = "EPH_ROUTING_ADDRESS")
	private String ephRoutingAddress;

	@Column(name = "EPH_SELLER_ACCT_NO")
	private String ephSellerAcctNo;

	@Column(name = "EPH_SELLER_ADDRESS")
	private String ephSellerAddress;

	@Column(name = "EPH_SELLER_BANK_AGENCY")
	private String ephSellerBankAgency;

	@Column(name = "EPH_SELLER_BANK_BRANCH")
	private String ephSellerBankBranch;

	@Column(name = "EPH_SELLER_BANK_BRANCH_ID")
	private String ephSellerBankBranchId;

	@Column(name = "EPH_SELLER_BANK_NAME")
	private String ephSellerBankName;

	@Column(name = "EPH_SELLER_CODE")
	private String ephSellerCode;

	@Column(name = "EPH_SELLER_CONTACT_NO")
	private String ephSellerContactNo;

	@Column(name = "EPH_SELLER_CONTACT_PERSON")
	private String ephSellerContactPerson;

	@Column(name = "EPH_SELLER_FI_CODE")
	private String ephSellerFiCode;

	@Column(name = "EPH_SELLER_NAME")
	private String ephSellerName;

	@Column(name = "EPH_SELLER_ORDER_CODE")
	private String ephSellerOrderCode;

	@Column(name = "EPH_SELLER_ORDER_NO")
	private String ephSellerOrderNo;

	@Column(name = "EPH_SEQ_NO")
	private String ephSeqNo;

	@Column(name = "EPH_SETTLEMENT_CODE")
	private String ephSettlementCode;

	@Column(name = "EPH_TOT_AMT")
	private BigDecimal ephTotAmt;

	@Column(name = "EPH_TOT_CNT")
	private BigDecimal ephTotCnt;

	@Column(name = "EPH_TOT_DEB_AMT")
	private BigDecimal ephTotDebAmt;

	@Column(name = "EPH_TOTAL_DUTY_CODE")
	private String ephTotalDutyCode;

	@Column(name = "EPH_TOTALDUTY_CODE")
	private String ephTotaldutyCode;

	@Column(name = "EPH_TOTALDUTY_TXN")
	private BigDecimal ephTotaldutyTxn;

	@Column(name = "EPH_TXN_STATUS")
	private String ephTxnStatus;

	@Column(name = "EPH_TXNID")
	private String ephTxnid;

	@Column(name = "EPH_VAL_DATE")
	private String ephValDate;

	@OneToMany(mappedBy = "epdEphTxnId", orphanRemoval = true, cascade = CascadeType.ALL)
	private List<EpayPaymentDetail> epayPaymentDetailsList;

	public EpayPaymentHeader() {
	}

	public String getEphId() {
		return ephId;
	}

	public void setEphId(String ephId) {
		this.ephId = ephId;
	}

	public String getEphAgentAddress() {
		return this.ephAgentAddress;
	}

	public void setEphAgentAddress(String ephAgentAddress) {
		this.ephAgentAddress = ephAgentAddress;
	}

	public String getEphAgentCode() {
		return this.ephAgentCode;
	}

	public void setEphAgentCode(String ephAgentCode) {
		this.ephAgentCode = ephAgentCode;
	}

	public String getEphAgentContact() {
		return this.ephAgentContact;
	}

	public void setEphAgentContact(String ephAgentContact) {
		this.ephAgentContact = ephAgentContact;
	}

	public String getEphAgentContactNo() {
		return this.ephAgentContactNo;
	}

	public void setEphAgentContactNo(String ephAgentContactNo) {
		this.ephAgentContactNo = ephAgentContactNo;
	}

	public String getEphAgentName() {
		return this.ephAgentName;
	}

	public void setEphAgentName(String ephAgentName) {
		this.ephAgentName = ephAgentName;
	}

	public String getEphAgentType() {
		return this.ephAgentType;
	}

	public void setEphAgentType(String ephAgentType) {
		this.ephAgentType = ephAgentType;
	}

	public String getEphAmtCur() {
		return this.ephAmtCur;
	}

	public void setEphAmtCur(String ephAmtCur) {
		this.ephAmtCur = ephAmtCur;
	}

	public String getEphAppRef() {
		return this.ephAppRef;
	}

	public void setEphAppRef(String ephAppRef) {
		this.ephAppRef = ephAppRef;
	}

	public Date getEphAuthDt() {
		return this.ephAuthDt;
	}

	public void setEphAuthDt(Date ephAuthDt) {
		this.ephAuthDt = ephAuthDt;
	}

	public String getEphAuthId() {
		return this.ephAuthId;
	}

	public void setEphAuthId(String ephAuthId) {
		this.ephAuthId = ephAuthId;
	}

	public String getEphBusFunction() {
		return this.ephBusFunction;
	}

	public void setEphBusFunction(String ephBusFunction) {
		this.ephBusFunction = ephBusFunction;
	}

	public String getEphBuyerAcctNo() {
		return this.ephBuyerAcctNo;
	}

	public void setEphBuyerAcctNo(String ephBuyerAcctNo) {
		this.ephBuyerAcctNo = ephBuyerAcctNo;
	}

	public String getEphBuyerBankAgency() {
		return this.ephBuyerBankAgency;
	}

	public void setEphBuyerBankAgency(String ephBuyerBankAgency) {
		this.ephBuyerBankAgency = ephBuyerBankAgency;
	}

	public String getEphBuyerBankBranch() {
		return this.ephBuyerBankBranch;
	}

	public void setEphBuyerBankBranch(String ephBuyerBankBranch) {
		this.ephBuyerBankBranch = ephBuyerBankBranch;
	}

	public String getEphBuyerBankBranchId() {
		return this.ephBuyerBankBranchId;
	}

	public void setEphBuyerBankBranchId(String ephBuyerBankBranchId) {
		this.ephBuyerBankBranchId = ephBuyerBankBranchId;
	}

	public String getEphBuyerBankCode() {
		return this.ephBuyerBankCode;
	}

	public void setEphBuyerBankCode(String ephBuyerBankCode) {
		this.ephBuyerBankCode = ephBuyerBankCode;
	}

	public String getEphBuyerBankContactNo() {
		return this.ephBuyerBankContactNo;
	}

	public void setEphBuyerBankContactNo(String ephBuyerBankContactNo) {
		this.ephBuyerBankContactNo = ephBuyerBankContactNo;
	}

	public String getEphBuyerBankFiCode() {
		return this.ephBuyerBankFiCode;
	}

	public void setEphBuyerBankFiCode(String ephBuyerBankFiCode) {
		this.ephBuyerBankFiCode = ephBuyerBankFiCode;
	}

	public String getEphBuyerBankId() {
		return this.ephBuyerBankId;
	}

	public void setEphBuyerBankId(String ephBuyerBankId) {
		this.ephBuyerBankId = ephBuyerBankId;
	}

	public String getEphBuyerBankName() {
		return this.ephBuyerBankName;
	}

	public void setEphBuyerBankName(String ephBuyerBankName) {
		this.ephBuyerBankName = ephBuyerBankName;
	}

	public String getEphBuyerContactNo() {
		return this.ephBuyerContactNo;
	}

	public void setEphBuyerContactNo(String ephBuyerContactNo) {
		this.ephBuyerContactNo = ephBuyerContactNo;
	}

	public String getEphBuyerContactPerson() {
		return this.ephBuyerContactPerson;
	}

	public void setEphBuyerContactPerson(String ephBuyerContactPerson) {
		this.ephBuyerContactPerson = ephBuyerContactPerson;
	}

	public String getEphBuyerHolderName() {
		return this.ephBuyerHolderName;
	}

	public void setEphBuyerHolderName(String ephBuyerHolderName) {
		this.ephBuyerHolderName = ephBuyerHolderName;
	}

	public String getEphBuyerIban() {
		return this.ephBuyerIban;
	}

	public void setEphBuyerIban(String ephBuyerIban) {
		this.ephBuyerIban = ephBuyerIban;
	}

	public String getEphCodeListAgency() {
		return this.ephCodeListAgency;
	}

	public void setEphCodeListAgency(String ephCodeListAgency) {
		this.ephCodeListAgency = ephCodeListAgency;
	}

	public String getEphCreditAuthCode() {
		return this.ephCreditAuthCode;
	}

	public void setEphCreditAuthCode(String ephCreditAuthCode) {
		this.ephCreditAuthCode = ephCreditAuthCode;
	}

	public String getEphCreditAuthNo() {
		return this.ephCreditAuthNo;
	}

	public void setEphCreditAuthNo(String ephCreditAuthNo) {
		this.ephCreditAuthNo = ephCreditAuthNo;
	}

	public String getEphDatePreparation() {
		return this.ephDatePreparation;
	}

	public void setEphDatePreparation(String ephDatePreparation) {
		this.ephDatePreparation = ephDatePreparation;
	}

	public String getEphDebitAuthCode() {
		return this.ephDebitAuthCode;
	}

	public void setEphDebitAuthCode(String ephDebitAuthCode) {
		this.ephDebitAuthCode = ephDebitAuthCode;
	}

	public String getEphDebitAuthNo() {
		return this.ephDebitAuthNo;
	}

	public void setEphDebitAuthNo(String ephDebitAuthNo) {
		this.ephDebitAuthNo = ephDebitAuthNo;
	}

	public String getEphDocRefName() {
		return this.ephDocRefName;
	}

	public void setEphDocRefName(String ephDocRefName) {
		this.ephDocRefName = ephDocRefName;
	}

	public String getEphEdiVersionCode() {
		return this.ephEdiVersionCode;
	}

	public void setEphEdiVersionCode(String ephEdiVersionCode) {
		this.ephEdiVersionCode = ephEdiVersionCode;
	}

	public String getEphFiCode() {
		return this.ephFiCode;
	}

	public void setEphFiCode(String ephFiCode) {
		this.ephFiCode = ephFiCode;
	}

	public String getEphFiSettlement() {
		return this.ephFiSettlement;
	}

	public void setEphFiSettlement(String ephFiSettlement) {
		this.ephFiSettlement = ephFiSettlement;
	}

	public String getEphFiSettlementAcc() {
		return this.ephFiSettlementAcc;
	}

	public void setEphFiSettlementAcc(String ephFiSettlementAcc) {
		this.ephFiSettlementAcc = ephFiSettlementAcc;
	}

	public String getEphFinTxnType() {
		return this.ephFinTxnType;
	}

	public void setEphFinTxnType(String ephFinTxnType) {
		this.ephFinTxnType = ephFinTxnType;
	}

	public String getEphFpxTxnId() {
		return this.ephFpxTxnId;
	}

	public void setEphFpxTxnId(String ephFpxTxnId) {
		this.ephFpxTxnId = ephFpxTxnId;
	}

	public String getEphFrontendCode() {
		return this.ephFrontendCode;
	}

	public void setEphFrontendCode(String ephFrontendCode) {
		this.ephFrontendCode = ephFrontendCode;
	}

	public String getEphHolderSellerName() {
		return this.ephHolderSellerName;
	}

	public void setEphHolderSellerName(String ephHolderSellerName) {
		this.ephHolderSellerName = ephHolderSellerName;
	}

	public String getEphInterchangeId() {
		return this.ephInterchangeId;
	}

	public void setEphInterchangeId(String ephInterchangeId) {
		this.ephInterchangeId = ephInterchangeId;
	}

	public String getEphItemNo() {
		return this.ephItemNo;
	}

	public void setEphItemNo(String ephItemNo) {
		this.ephItemNo = ephItemNo;
	}

	public String getEphJobno() {
		return this.ephJobno;
	}

	public void setEphJobno(String ephJobno) {
		this.ephJobno = ephJobno;
	}

	public Date getEphLastRespTime() {
		return this.ephLastRespTime;
	}

	public void setEphLastRespTime(Date ephLastRespTime) {
		this.ephLastRespTime = ephLastRespTime;
	}

	public Date getEphMakerDt() {
		return this.ephMakerDt;
	}

	public void setEphMakerDt(Date ephMakerDt) {
		this.ephMakerDt = ephMakerDt;
	}

	public String getEphMakerId() {
		return this.ephMakerId;
	}

	public void setEphMakerId(String ephMakerId) {
		this.ephMakerId = ephMakerId;
	}

	public String getEphMakerName() {
		return this.ephMakerName;
	}

	public void setEphMakerName(String ephMakerName) {
		this.ephMakerName = ephMakerName;
	}

	public String getEphMsgDate() {
		return this.ephMsgDate;
	}

	public void setEphMsgDate(String ephMsgDate) {
		this.ephMsgDate = ephMsgDate;
	}

	public Date getEphMsgDatetime() {
		return this.ephMsgDatetime;
	}

	public void setEphMsgDatetime(Date ephMsgDatetime) {
		this.ephMsgDatetime = ephMsgDatetime;
	}

	public String getEphMsgFunc() {
		return this.ephMsgFunc;
	}

	public void setEphMsgFunc(String ephMsgFunc) {
		this.ephMsgFunc = ephMsgFunc;
	}

	public String getEphMsgId() {
		return this.ephMsgId;
	}

	public void setEphMsgId(String ephMsgId) {
		this.ephMsgId = ephMsgId;
	}

	public String getEphMsgRecipientId() {
		return this.ephMsgRecipientId;
	}

	public void setEphMsgRecipientId(String ephMsgRecipientId) {
		this.ephMsgRecipientId = ephMsgRecipientId;
	}

	public String getEphMsgSenderId() {
		return this.ephMsgSenderId;
	}

	public void setEphMsgSenderId(String ephMsgSenderId) {
		this.ephMsgSenderId = ephMsgSenderId;
	}

	public String getEphMsgSeqNo() {
		return this.ephMsgSeqNo;
	}

	public void setEphMsgSeqNo(String ephMsgSeqNo) {
		this.ephMsgSeqNo = ephMsgSeqNo;
	}

	public String getEphMsgType() {
		return this.ephMsgType;
	}

	public void setEphMsgType(String ephMsgType) {
		this.ephMsgType = ephMsgType;
	}

	public String getEphOrderedBankFiCode() {
		return this.ephOrderedBankFiCode;
	}

	public void setEphOrderedBankFiCode(String ephOrderedBankFiCode) {
		this.ephOrderedBankFiCode = ephOrderedBankFiCode;
	}

	public String getEphOrgMsg() {
		return this.ephOrgMsg;
	}

	public void setEphOrgMsg(String ephOrgMsg) {
		this.ephOrgMsg = ephOrgMsg;
	}

	public String getEphPayeeContact() {
		return this.ephPayeeContact;
	}

	public void setEphPayeeContact(String ephPayeeContact) {
		this.ephPayeeContact = ephPayeeContact;
	}

	public String getEphPayeeNumber() {
		return this.ephPayeeNumber;
	}

	public void setEphPayeeNumber(String ephPayeeNumber) {
		this.ephPayeeNumber = ephPayeeNumber;
	}

	public String getEphPaymentNo() {
		return this.ephPaymentNo;
	}

	public void setEphPaymentNo(String ephPaymentNo) {
		this.ephPaymentNo = ephPaymentNo;
	}

	public BigDecimal getEphPayorRefAmt() {
		return this.ephPayorRefAmt;
	}

	public void setEphPayorRefAmt(BigDecimal ephPayorRefAmt) {
		this.ephPayorRefAmt = ephPayorRefAmt;
	}

	public Date getEphPayorRefDt() {
		return this.ephPayorRefDt;
	}

	public void setEphPayorRefDt(Date ephPayorRefDt) {
		this.ephPayorRefDt = ephPayorRefDt;
	}

	public String getEphPayorRefNo() {
		return this.ephPayorRefNo;
	}

	public void setEphPayorRefNo(String ephPayorRefNo) {
		this.ephPayorRefNo = ephPayorRefNo;
	}

	public String getEphPmtDesc() {
		return this.ephPmtDesc;
	}

	public void setEphPmtDesc(String ephPmtDesc) {
		this.ephPmtDesc = ephPmtDesc;
	}

	public String getEphPmtPurpose() {
		return this.ephPmtPurpose;
	}

	public void setEphPmtPurpose(String ephPmtPurpose) {
		this.ephPmtPurpose = ephPmtPurpose;
	}

	public String getEphRefOrgMsg() {
		return this.ephRefOrgMsg;
	}

	public void setEphRefOrgMsg(String ephRefOrgMsg) {
		this.ephRefOrgMsg = ephRefOrgMsg;
	}

	public String getEphRefOrgNo() {
		return this.ephRefOrgNo;
	}

	public void setEphRefOrgNo(String ephRefOrgNo) {
		this.ephRefOrgNo = ephRefOrgNo;
	}

	public String getEphRocRobCode() {
		return this.ephRocRobCode;
	}

	public void setEphRocRobCode(String ephRocRobCode) {
		this.ephRocRobCode = ephRocRobCode;
	}

	public String getEphRoutingAddress() {
		return this.ephRoutingAddress;
	}

	public void setEphRoutingAddress(String ephRoutingAddress) {
		this.ephRoutingAddress = ephRoutingAddress;
	}

	public String getEphSellerAcctNo() {
		return this.ephSellerAcctNo;
	}

	public void setEphSellerAcctNo(String ephSellerAcctNo) {
		this.ephSellerAcctNo = ephSellerAcctNo;
	}

	public String getEphSellerAddress() {
		return this.ephSellerAddress;
	}

	public void setEphSellerAddress(String ephSellerAddress) {
		this.ephSellerAddress = ephSellerAddress;
	}

	public String getEphSellerBankAgency() {
		return this.ephSellerBankAgency;
	}

	public void setEphSellerBankAgency(String ephSellerBankAgency) {
		this.ephSellerBankAgency = ephSellerBankAgency;
	}

	public String getEphSellerBankBranch() {
		return this.ephSellerBankBranch;
	}

	public void setEphSellerBankBranch(String ephSellerBankBranch) {
		this.ephSellerBankBranch = ephSellerBankBranch;
	}

	public String getEphSellerBankBranchId() {
		return this.ephSellerBankBranchId;
	}

	public void setEphSellerBankBranchId(String ephSellerBankBranchId) {
		this.ephSellerBankBranchId = ephSellerBankBranchId;
	}

	public String getEphSellerBankName() {
		return this.ephSellerBankName;
	}

	public void setEphSellerBankName(String ephSellerBankName) {
		this.ephSellerBankName = ephSellerBankName;
	}

	public String getEphSellerCode() {
		return this.ephSellerCode;
	}

	public void setEphSellerCode(String ephSellerCode) {
		this.ephSellerCode = ephSellerCode;
	}

	public String getEphSellerContactNo() {
		return this.ephSellerContactNo;
	}

	public void setEphSellerContactNo(String ephSellerContactNo) {
		this.ephSellerContactNo = ephSellerContactNo;
	}

	public String getEphSellerContactPerson() {
		return this.ephSellerContactPerson;
	}

	public void setEphSellerContactPerson(String ephSellerContactPerson) {
		this.ephSellerContactPerson = ephSellerContactPerson;
	}

	public String getEphSellerFiCode() {
		return this.ephSellerFiCode;
	}

	public void setEphSellerFiCode(String ephSellerFiCode) {
		this.ephSellerFiCode = ephSellerFiCode;
	}

	public String getEphSellerName() {
		return this.ephSellerName;
	}

	public void setEphSellerName(String ephSellerName) {
		this.ephSellerName = ephSellerName;
	}

	public String getEphSellerOrderCode() {
		return this.ephSellerOrderCode;
	}

	public void setEphSellerOrderCode(String ephSellerOrderCode) {
		this.ephSellerOrderCode = ephSellerOrderCode;
	}

	public String getEphSellerOrderNo() {
		return this.ephSellerOrderNo;
	}

	public void setEphSellerOrderNo(String ephSellerOrderNo) {
		this.ephSellerOrderNo = ephSellerOrderNo;
	}

	public String getEphSeqNo() {
		return this.ephSeqNo;
	}

	public void setEphSeqNo(String ephSeqNo) {
		this.ephSeqNo = ephSeqNo;
	}

	public String getEphSettlementCode() {
		return this.ephSettlementCode;
	}

	public void setEphSettlementCode(String ephSettlementCode) {
		this.ephSettlementCode = ephSettlementCode;
	}

	public BigDecimal getEphTotAmt() {
		return this.ephTotAmt;
	}

	public void setEphTotAmt(BigDecimal ephTotAmt) {
		this.ephTotAmt = ephTotAmt;
	}

	public BigDecimal getEphTotCnt() {
		return this.ephTotCnt;
	}

	public void setEphTotCnt(BigDecimal ephTotCnt) {
		this.ephTotCnt = ephTotCnt;
	}

	public BigDecimal getEphTotDebAmt() {
		return this.ephTotDebAmt;
	}

	public void setEphTotDebAmt(BigDecimal ephTotDebAmt) {
		this.ephTotDebAmt = ephTotDebAmt;
	}

	public String getEphTotalDutyCode() {
		return this.ephTotalDutyCode;
	}

	public void setEphTotalDutyCode(String ephTotalDutyCode) {
		this.ephTotalDutyCode = ephTotalDutyCode;
	}

	public String getEphTotaldutyCode() {
		return this.ephTotaldutyCode;
	}

	public void setEphTotaldutyCode(String ephTotaldutyCode) {
		this.ephTotaldutyCode = ephTotaldutyCode;
	}

	public BigDecimal getEphTotaldutyTxn() {
		return this.ephTotaldutyTxn;
	}

	public void setEphTotaldutyTxn(BigDecimal ephTotaldutyTxn) {
		this.ephTotaldutyTxn = ephTotaldutyTxn;
	}

	public String getEphTxnStatus() {
		return this.ephTxnStatus;
	}

	public void setEphTxnStatus(String ephTxnStatus) {
		this.ephTxnStatus = ephTxnStatus;
	}

	public String getEphTxnid() {
		return this.ephTxnid;
	}

	public void setEphTxnid(String ephTxnid) {
		this.ephTxnid = ephTxnid;
	}

	public String getEphValDate() {
		return this.ephValDate;
	}

	public void setEphValDate(String ephValDate) {
		this.ephValDate = ephValDate;
	}

	public List<EpayPaymentDetail> getEpayPaymentDetailsList() {
		return epayPaymentDetailsList;
	}

	public void setEpayPaymentDetailsList(
			List<EpayPaymentDetail> epayPaymentDetailsList) {
		this.epayPaymentDetailsList = epayPaymentDetailsList;
	}

}