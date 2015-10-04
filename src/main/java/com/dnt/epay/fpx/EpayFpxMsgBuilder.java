package com.dnt.epay.fpx;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.dnt.ftp.EpayFtpEdi;
import com.fpx.seller.transaction.OrderComponent;
import com.fpx.seller.transaction.TxnComponent;
import com.fpx.seller.transaction.TxnInitiator;

public class EpayFpxMsgBuilder {

	public static Logger logger = LoggerFactory.getLogger(EpayFtpEdi.class);

	public void createXmlMessageToFpx(FpxRequestMessage message) {

		try {
			System.out
					.println("***********Beginning of Create XML Message for FPX****************");
			String str = System.getProperty("fpxplugin");
			System.out.println("Plugin Location "+str);
			TxnInitiator txnInitiator = TxnInitiator.getTxnInitiator();
			System.out.println("txnInitiator --------  :" + txnInitiator);
			TxnComponent txnComponent = txnInitiator.getTxnComponent();
			System.out.println("txnComponent --------  :" + txnComponent);

			txnComponent.setMessageType(message.getMessageType());
			txnComponent.setMessageToken(message.getMessageToken());
			txnComponent.setSellerDesc(message.getSellerExcDesc());
			txnComponent.setSellerID(message.getSellerExcId());
			txnComponent.setSellerOrdNo(message.getMessageOrderNo());
			txnComponent.setOrderCount(Integer.parseInt(message
					.getMessageOrderCount()));
			txnComponent.setSellerTxnTime(message.getSellerTxnTime());
			
			OrderComponent orderComponent = new OrderComponent();
			System.out.println("orderComponent --------  :" + orderComponent);

			orderComponent.setSellerOrderNo(message.getSellerOrderNo());
			orderComponent.setSellerID(message.getSellerId());
			orderComponent.setSellerFPXBank(message.getSellerFPXBank());

			orderComponent.setBuyerBank(message.getBuyerBank());
			orderComponent.setBuyerBankBranch(message.getBuyerBankBranch());
			orderComponent.setBuyerAccNo(message.getBuyerAccNo());
			orderComponent.setBuyerName(message.getBuyerName());
			orderComponent.setBuyerID(message.getBuyerId());
			orderComponent.setMakerName(message.getMakerName());
			orderComponent.setBuyerIBAN(message.getBuyerIban());
			orderComponent.setChargeType(message.getChargeType());
			orderComponent.setTxnCurrency(message.getMessageCurrency());
			orderComponent.setTxnAmount(message.getMessageAmount()
					.doubleValue());
			orderComponent.setSerialNo(1);

			txnComponent.setOrderDetails(orderComponent);
			System.out
					.println("***********End of Create XML Message for FPX****************");

			this.transmitToFpx(txnInitiator, txnComponent);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void transmitToFpx(TxnInitiator txnInitiator,
			TxnComponent txnComponent) {

		try {
			String xmlMessage = txnInitiator.generateXML(txnComponent);
			System.out.println("xmlMessage generated for FPX:" + xmlMessage);
			logger.debug(xmlMessage);

			String xmlAckMessage = txnInitiator
					.generateAndSendXML(txnComponent);
			System.out.println("xmlMessage Acknowledged from FPX:"
					+ xmlAckMessage);
			logger.debug(xmlAckMessage);

		} catch (Exception e) {

			System.out
					.println(">>>>>>>>>>>>>>>>>>>Entering Exception transmitToFpx");

			e.printStackTrace();
		}
	}

}
