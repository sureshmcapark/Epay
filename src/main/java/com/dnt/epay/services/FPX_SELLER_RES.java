package com.dnt.epay.services;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement (name = "FPX_SELLER_RES" )
@XmlType(propOrder = { "MSG_TYPE", "MESG_TOKEN", "FPX_TXN_ID", "SELLER_EX_DESC", "SELLER_EX_ID", "ORDER_NO", "NO_OF_ORDERS", "TXN_TIME", "SELLER_TXN_TIME", "SERIALNO", "CHECKSUM", "fPXResOrderList" })
public class FPX_SELLER_RES {

    private String MSG_TYPE;
    private String MESG_TOKEN;
    private String FPX_TXN_ID;
    private String SELLER_EX_DESC;
    private String SELLER_EX_ID;
    private String ORDER_NO;
    private String NO_OF_ORDERS;
    private String TXN_TIME;
    private String SELLER_TXN_TIME;
    private String SERIALNO;
    private String CHECKSUM;
    private FPXResOrderList fPXResOrderList;
    
	/**
	 * @return the mSG_TYPE
	 */
	public String getMSG_TYPE() {
		return MSG_TYPE;
	}
	/**
	 * @param mSG_TYPE the mSG_TYPE to set
	 */
	@XmlElement
	public void setMSG_TYPE(String mSG_TYPE) {
		MSG_TYPE = mSG_TYPE;
	}
	/**
	 * @return the mESG_TOKEN
	 */
	public String getMESG_TOKEN() {
		return MESG_TOKEN;
	}
	/**
	 * @param mESG_TOKEN the mESG_TOKEN to set
	 */
	@XmlElement
	public void setMESG_TOKEN(String mESG_TOKEN) {
		MESG_TOKEN = mESG_TOKEN;
	}
	/**
	 * @return the fPX_TXN_ID
	 */
	public String getFPX_TXN_ID() {
		return FPX_TXN_ID;
	}
	/**
	 * @param fPX_TXN_ID the fPX_TXN_ID to set
	 */
	@XmlElement
	public void setFPX_TXN_ID(String fPX_TXN_ID) {
		FPX_TXN_ID = fPX_TXN_ID;
	}
	/**
	 * @return the sELLER_EX_DESC
	 */
	public String getSELLER_EX_DESC() {
		return SELLER_EX_DESC;
	}
	/**
	 * @param sELLER_EX_DESC the sELLER_EX_DESC to set
	 */
	@XmlElement
	public void setSELLER_EX_DESC(String sELLER_EX_DESC) {
		SELLER_EX_DESC = sELLER_EX_DESC;
	}
	/**
	 * @return the sELLER_EX_ID
	 */
	public String getSELLER_EX_ID() {
		return SELLER_EX_ID;
	}
	/**
	 * @param sELLER_EX_ID the sELLER_EX_ID to set
	 */
	@XmlElement
	public void setSELLER_EX_ID(String sELLER_EX_ID) {
		SELLER_EX_ID = sELLER_EX_ID;
	}
	/**
	 * @return the oRDER_NO
	 */
	public String getORDER_NO() {
		return ORDER_NO;
	}
	/**
	 * @param oRDER_NO the oRDER_NO to set
	 */
	@XmlElement
	public void setORDER_NO(String oRDER_NO) {
		ORDER_NO = oRDER_NO;
	}
	/**
	 * @return the nO_OF_ORDERS
	 */
	public String getNO_OF_ORDERS() {
		return NO_OF_ORDERS;
	}
	/**
	 * @param nO_OF_ORDERS the nO_OF_ORDERS to set
	 */
	@XmlElement
	public void setNO_OF_ORDERS(String nO_OF_ORDERS) {
		NO_OF_ORDERS = nO_OF_ORDERS;
	}
	/**
	 * @return the tXN_TIME
	 */
	public String getTXN_TIME() {
		return TXN_TIME;
	}
	/**
	 * @param tXN_TIME the tXN_TIME to set
	 */
	@XmlElement
	public void setTXN_TIME(String tXN_TIME) {
		TXN_TIME = tXN_TIME;
	}
	/**
	 * @return the fPXResOrderList
	 */
	public FPXResOrderList getfPXResOrderList() {
		return fPXResOrderList;
	}
	/**
	 * @param fPXResOrderList the fPXResOrderList to set
	 */
	 @XmlElement(name = "ORDER_LIST")
	public void setfPXResOrderList(FPXResOrderList fPXResOrderList) {
		this.fPXResOrderList = fPXResOrderList;
	}
	/**
	 * @return the sELLER_TXN_TIME
	 */
	public String getSELLER_TXN_TIME() {
		return SELLER_TXN_TIME;
	}
	/**
	 * @param sELLER_TXN_TIME the sELLER_TXN_TIME to set
	 */
	@XmlElement
	public void setSELLER_TXN_TIME(String sELLER_TXN_TIME) {
		SELLER_TXN_TIME = sELLER_TXN_TIME;
	}
	/**
	 * @return the sERIALNO
	 */
	public String getSERIALNO() {
		return SERIALNO;
	}
	/**
	 * @param sERIALNO the sERIALNO to set
	 */
	@XmlElement
	public void setSERIALNO(String sERIALNO) {
		SERIALNO = sERIALNO;
	}
	/**
	 * @return the cHECKSUM
	 */
	public String getCHECKSUM() {
		return CHECKSUM;
	}
	/**
	 * @param cHECKSUM the cHECKSUM to set
	 */
	@XmlElement
	public void setCHECKSUM(String cHECKSUM) {
		CHECKSUM = cHECKSUM;
	}
    
	
	
    /**
     * Implementation for the below fields are in files FPXResBuyerList.java, FPXResOrderList.java, FPXResSellerList.java
     */
/*    private String slno;
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
    private String messageAmount;
    private String messageVersion;
    private String messageOSInfo;
    private String debitAuthCode;
    private String debitAuthNo;
    private String creditAuthCode;
    private String creditAuthNo;
    
    private EpayExchangeInfo epayExchangeInfo;
    
    
    private EpaySellerBank epaySellerBank;
    
	public EpayExchangeInfo getEpayExchangeInfo() {
		return epayExchangeInfo;
	}
	public void setEpayExchangeInfo(EpayExchangeInfo epayExchangeInfo) {
		this.epayExchangeInfo = epayExchangeInfo;
	}
	
	public EpaySellerBank getEpaySellerBank() {
		return epaySellerBank;
	}
	public void setEpaySellerBank(EpaySellerBank epaySellerBank) {
		this.epaySellerBank = epaySellerBank;
	}*/
/*	
	*//**
	 * @return the slno
	 *//*
	public String getSlno() {
		return slno;
	}
	*//**
	 * @param slno the slno to set
	 *//*
	@XmlElement
	public void setSlno(String slno) {
		this.slno = slno;
	}
	*//**
	 * @return the sellerOrderNo
	 *//*
	public String getSellerOrderNo() {
		return sellerOrderNo;
	}
	*//**
	 * @param sellerOrderNo the sellerOrderNo to set
	 *//*
	@XmlElement
	public void setSellerOrderNo(String sellerOrderNo) {
		this.sellerOrderNo = sellerOrderNo;
	}
	*//**
	 * @return the sellerId
	 *//*
	public String getSellerId() {
		return sellerId;
	}
	*//**
	 * @param sellerId the sellerId to set
	 *//*
	@XmlElement
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}
	*//**
	 * @return the sellerBankCode
	 *//*
	public String getSellerFPXBank() {
		return sellerFPXBank;
	}
	*//**
	 * @param sellerBankCode the sellerBankCode to set
	 *//*
	@XmlElement
	public void setSellerFPXBank(String sellerFPXBank) {
		this.sellerFPXBank = sellerFPXBank;
	}
	*//**
	 * @return the buyerBank
	 *//*
	public String getBuyerBank() {
		return buyerBank;
	}
	*//**
	 * @param buyerBank the buyerBank to set
	 *//*
	@XmlElement
	public void setBuyerBank(String buyerBank) {
		this.buyerBank = buyerBank;
	}
	*//**
	 * @return the buyerBankBranch
	 *//*
	public String getBuyerBankBranch() {
		return buyerBankBranch;
	}
	*//**
	 * @param buyerBankBranch the buyerBankBranch to set
	 *//*
	@XmlElement
	public void setBuyerBankBranch(String buyerBankBranch) {
		this.buyerBankBranch = buyerBankBranch;
	}
	*//**
	 * @return the buyerAccNo
	 *//*
	public String getBuyerAccNo() {
		return buyerAccNo;
	}
	*//**
	 * @param buyerAccNo the buyerAccNo to set
	 *//*
	@XmlElement
	public void setBuyerAccNo(String buyerAccNo) {
		this.buyerAccNo = buyerAccNo;
	}
	*//**
	 * @return the buyerName
	 *//*
	public String getBuyerName() {
		return buyerName;
	}
	*//**
	 * @param buyerName the buyerName to set
	 *//*
	@XmlElement
	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}
	*//**
	 * @return the buyerId
	 *//*
	public String getBuyerId() {
		return buyerId;
	}
	*//**
	 * @param buyerId the buyerId to set
	 *//*
	@XmlElement
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}
	*//**
	 * @return the makerName
	 *//*
	public String getMakerName() {
		return makerName;
	}
	*//**
	 * @param makerName the makerName to set
	 *//*
	@XmlElement
	public void setMakerName(String makerName) {
		this.makerName = makerName;
	}
	*//**
	 * @return the buyerIban
	 *//*
	public String getBuyerIban() {
		return buyerIban;
	}
	*//**
	 * @param buyerIban the buyerIban to set
	 *//*
	@XmlElement
	public void setBuyerIban(String buyerIban) {
		this.buyerIban = buyerIban;
	}
	*//**
	 * @return the chargeType
	 *//*
	public String getChargeType() {
		return chargeType;
	}
	*//**
	 * @param chargeType the chargeType to set
	 *//*
	@XmlElement
	public void setChargeType(String chargeType) {
		this.chargeType = chargeType;
	}
	*//**
	 * @return the messageCurrency
	 *//*
	public String getMessageCurrency() {
		return messageCurrency;
	}
	*//**
	 * @param messageCurrency the messageCurrency to set
	 *//*
	@XmlElement
	public void setMessageCurrency(String messageCurrency) {
		this.messageCurrency = messageCurrency;
	}
	*//**
	 * @return the messageAmount
	 *//*
	public String getMessageAmount() {
		return messageAmount;
	}
	*//**
	 * @param messageAmount the messageAmount to set
	 *//*
	@XmlElement
	public void setMessageAmount(String messageAmount) {
		this.messageAmount = messageAmount;
	}
	
	*//**
	 * @return the messageVersion
	 *//*
	public String getMessageVersion() {
		return messageVersion;
	}
	*//**
	 * @param messageVersion the messageVersion to set
	 *//*
	@XmlElement
	public void setMessageVersion(String messageVersion) {
		this.messageVersion = messageVersion;
	}
	*//**
	 * @return the messageOSInfo
	 *//*
	public String getMessageOSInfo() {
		return messageOSInfo;
	}
	*//**
	 * @param messageOSInfo the messageOSInfo to set
	 *//*
	@XmlElement
	public void setMessageOSInfo(String messageOSInfo) {
		this.messageOSInfo = messageOSInfo;
	}
	
	
	public String getDebitAuthCode() {
		return debitAuthCode;
	}
	@XmlElement
	public void setDebitAuthCode(String debitAuthCode) {
		this.debitAuthCode = debitAuthCode;
	}
	public String getDebitAuthNo() {
		return debitAuthNo;
	}
	@XmlElement
	public void setDebitAuthNo(String debitAuthNo) {
		this.debitAuthNo = debitAuthNo;
	}
	public String getCreditAuthCode() {
		return creditAuthCode;
	}
	@XmlElement
	public void setCreditAuthCode(String creditAuthCode) {
		this.creditAuthCode = creditAuthCode;
	}
	public String getCreditAuthNo() {
		return creditAuthNo;
	}
	@XmlElement
	public void setCreditAuthNo(String creditAuthNo) {
		this.creditAuthNo = creditAuthNo;
	}
    */

}
