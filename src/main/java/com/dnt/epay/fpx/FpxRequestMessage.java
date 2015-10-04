package com.dnt.epay.fpx;

import java.math.BigDecimal;

/**
 * Created with IntelliJ IDEA Ultimate 13.1 Author: Mohd Solehuddin Abdul Wahab
 * Date: 26/8/2014 Time: 11:22
 */
public class FpxRequestMessage {

	private String messageType;
	private String messageToken;
	private String sellerExcDesc;
	private String sellerExcId;
	private String messageOrderNo;
	private String messageOrderCount;
	private String sellerTxnTime;
	private String slno;
	private String sellerOrderNo;
	private String sellerId;
	private String sellerFPXBank;
	private String buyerBank;
	private String buyerBankBranch;
	private String buyerAccNo;
	private String buyerName;
	private String buyerId;
	private String makerName;
	private String buyerIban;
	private String chargeType;
	private String messageCurrency;
	private BigDecimal messageAmount;
	private String messageSerialNo;
	private String messageVersion;
	private String messageOSInfo;
	private String messageChkSum;
	private String messageEphId;
	private String messageEpayService;

	// private EpayFpxSeller epayFpxSeller;
	// private EpayFpxBank epayFpxBank;
	public String getMessageType() {
		return messageType;
	}

	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}

	public String getMessageToken() {
		return messageToken;
	}

	public void setMessageToken(String messageToken) {
		this.messageToken = messageToken;
	}

	public String getSellerExcDesc() {
		return sellerExcDesc;
	}

	public void setSellerExcDesc(String sellerExcDesc) {
		this.sellerExcDesc = sellerExcDesc;
	}

	public String getSellerExcId() {
		return sellerExcId;
	}

	public void setSellerExcId(String sellerExcId) {
		this.sellerExcId = sellerExcId;
	}

	public String getMessageOrderNo() {
		return messageOrderNo;
	}

	public void setMessageOrderNo(String messageOrderNo) {
		this.messageOrderNo = messageOrderNo;
	}

	public String getMessageOrderCount() {
		return messageOrderCount;
	}

	public void setMessageOrderCount(String messageOrderCount) {
		this.messageOrderCount = messageOrderCount;
	}

	public String getSellerTxnTime() {
		return sellerTxnTime;
	}

	public void setSellerTxnTime(String sellerTxnTime) {
		this.sellerTxnTime = sellerTxnTime;
	}

	public String getSlno() {
		return slno;
	}

	public void setSlno(String slno) {
		this.slno = slno;
	}

	public String getSellerOrderNo() {
		return sellerOrderNo;
	}

	public void setSellerOrderNo(String sellerOrderNo) {
		this.sellerOrderNo = sellerOrderNo;
	}

	public String getSellerId() {
		return sellerId;
	}

	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

	public String getSellerFPXBank() {
		return sellerFPXBank;
	}

	public void setSellerFPXBank(String sellerFPXBank) {
		this.sellerFPXBank = sellerFPXBank;
	}

	public String getBuyerBank() {
		return buyerBank;
	}

	public void setBuyerBank(String buyerBank) {
		this.buyerBank = buyerBank;
	}

	public String getBuyerBankBranch() {
		return buyerBankBranch;
	}

	public void setBuyerBankBranch(String buyerBankBranch) {
		this.buyerBankBranch = buyerBankBranch;
	}

	public String getBuyerAccNo() {
		return buyerAccNo;
	}

	public void setBuyerAccNo(String buyerAccNo) {
		this.buyerAccNo = buyerAccNo;
	}

	public String getBuyerName() {
		return buyerName;
	}

	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}

	public String getBuyerId() {
		return buyerId;
	}

	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	public String getMakerName() {
		return makerName;
	}

	public void setMakerName(String makerName) {
		this.makerName = makerName;
	}

	public String getBuyerIban() {
		return buyerIban;
	}

	public void setBuyerIban(String buyerIban) {
		this.buyerIban = buyerIban;
	}

	public String getChargeType() {
		return chargeType;
	}

	public void setChargeType(String chargeType) {
		this.chargeType = chargeType;
	}

	public String getMessageCurrency() {
		return messageCurrency;
	}

	public void setMessageCurrency(String messageCurrency) {
		this.messageCurrency = messageCurrency;
	}

	public BigDecimal getMessageAmount() {
		return messageAmount;
	}

	public void setMessageAmount(BigDecimal messageAmount) {
		this.messageAmount = messageAmount;
	}

	public String getMessageSerialNo() {
		return messageSerialNo;
	}

	public void setMessageSerialNo(String messageSerialNo) {
		this.messageSerialNo = messageSerialNo;
	}

	public String getMessageVersion() {
		return messageVersion;
	}

	public void setMessageVersion(String messageVersion) {
		this.messageVersion = messageVersion;
	}

	public String getMessageOSInfo() {
		return messageOSInfo;
	}

	public void setMessageOSInfo(String messageOSInfo) {
		this.messageOSInfo = messageOSInfo;
	}

	public String getMessageChkSum() {
		return messageChkSum;
	}

	public void setMessageChkSum(String messageChkSum) {
		this.messageChkSum = messageChkSum;
	}

	public String getMessageEphId() {
		return messageEphId;
	}

	public void setMessageEphId(String messageEphId) {
		this.messageEphId = messageEphId;
	}

	public String getMessageEpayService() {
		return messageEpayService;
	}

	public void setMessageEpayService(String messageEpayService) {
		this.messageEpayService = messageEpayService;
	}

}
