package com.dnt.epay.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * The persistent class for the EPAY_FPX_TRANSACTION database table.
 * 
 */
@Entity
@Table(name = "EPAY_FPX_TRANSACTION")
@NamedQueries ({
@NamedQuery(name = "EpayFpxTransaction.findAll", query = "SELECT e FROM EpayFpxTransaction e"),
@NamedQuery(name = "EpayFpxTransaction.findBySellerOrderNo", query = "SELECT e from EpayFpxTransaction e where e.eftSellerOrdNo =:sellerOrderNo")
})
public class EpayFpxTransaction implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "EFT_ID")
	private String eftId;

	@Column(name = "EFT_BUYER_ACC_NO")
	private String eftBuyerAccNo;

	@Column(name = "EFT_BUYER_BANK")
	private String eftBuyerBank;

	@Column(name = "EFT_BUYER_BNK_BRANCH")
	private String eftBuyerBnkBranch;

	@Column(name = "EFT_BUYER_IBAN")
	private String eftBuyerIban;

	@Column(name = "EFT_BUYER_ID")
	private String eftBuyerId;

	@Column(name = "EFT_BUYER_NAME")
	private String eftBuyerName;

	@Column(name = "EFT_CHG_TYPE")
	private String eftChgType;

	@Temporal(TemporalType.DATE)
	@Column(name = "EFT_CREATE_DATE")
	private Date eftCreateDate;

	@Column(name = "EFT_CREATE_USER_ID")
	private String eftCreateUserId;

	@Column(name = "EFT_CREDIT_AUTH_CODE")
	private String eftCreditAuthCode;

	@Column(name = "EFT_CREDIT_AUTH_NO")
	private String eftCreditAuthNo;

	@Temporal(TemporalType.DATE)
	@Column(name = "EFT_CREDIT_RECV_TIME")
	private Date eftCreditRecvTime;

	@Column(name = "EFT_DEBIT_AUTH_CODE")
	private String eftDebitAuthCode;

	@Column(name = "EFT_DEBIT_AUTH_NO")
	private String eftDebitAuthNo;

	@Temporal(TemporalType.DATE)
	@Column(name = "EFT_DEBIT_RECV_TIME")
	private Date eftDebitRecvTime;

	@Column(name = "EFT_EPAY_SERVICE")
	private String eftEpayService;

	@Column(name = "EFT_EPH_TXNID")
	private String eftEphTxnid;

	@Column(name = "EFT_EXG_ORD_NO")
	private String eftExgOrdNo;

	@Column(name = "EFT_FPX_TXN_ID")
	private String eftFpxTxnId;

	@Temporal(TemporalType.DATE)
	@Column(name = "EFT_LAST_RESP_TIME")
	private Date eftLastRespTime;

	@Column(name = "EFT_MAKER_NAME")
	private String eftMakerName;

	@Column(name = "EFT_MSG_AMT")
	private BigDecimal eftMsgAmt;

	@Column(name = "EFT_MSG_CRCY")
	private String eftMsgCrcy;

	@Column(name = "EFT_MSG_SNO")
	private String eftMsgNo;

	@Column(name = "EFT_MSG_STATUS")
	private String eftMsgStatus;

	@Column(name = "EFT_MSG_TOKEN")
	private String eftMsgToken;

	@Column(name = "EFT_MSG_TYPE")
	private String eftMsgType;

	@Column(name = "EFT_NO_OF_ORDERS")
	private String eftNoOfOrders;

	@Column(name = "EFT_SELLER_EXC_DESC")
	private String eftSellerExcDesc;

	@Column(name = "EFT_SELLER_EXC_ID")
	private String eftSellerExcId;

	@Column(name = "EFT_SELLER_FPX_BANK_CODE")
	private String eftSellerFpxBankCode;

	@Column(name = "EFT_SELLER_ID")
	private String eftSellerId;

	@Column(name = "EFT_SELLER_ORD_NO")
	private String eftSellerOrdNo;

	@Column(name = "EFT_SELLER_TXN_TIME")
	private String eftSellerTxnTime;

	@Temporal(TemporalType.DATE)
	@Column(name = "EFT_SYS_DATE")
	private Date eftSysDate;

	@Temporal(TemporalType.DATE)
	@Column(name = "EFT_TXN_GEN_TIME")
	private Date eftTxnGenTime;

	@Temporal(TemporalType.DATE)
	@Column(name = "EFT_TXN_SENT_TIME")
	private Date eftTxnSentTime;

	@Temporal(TemporalType.DATE)
	@Column(name = "EFT_UPDATE_DATE")
	private Date eftUpdateDate;

	@Column(name = "EFT_UPDATE_USER_ID")
	private String eftUpdateUserId;

	public EpayFpxTransaction() {
	}

	public String getEftId() {
		return eftId;
	}

	public void setEftId(String eftId) {
		this.eftId = eftId;
	}

	public String getEftBuyerAccNo() {
		return this.eftBuyerAccNo;
	}

	public void setEftBuyerAccNo(String eftBuyerAccNo) {
		this.eftBuyerAccNo = eftBuyerAccNo;
	}

	public String getEftBuyerBank() {
		return this.eftBuyerBank;
	}

	public void setEftBuyerBank(String eftBuyerBank) {
		this.eftBuyerBank = eftBuyerBank;
	}

	public String getEftBuyerBnkBranch() {
		return this.eftBuyerBnkBranch;
	}

	public void setEftBuyerBnkBranch(String eftBuyerBnkBranch) {
		this.eftBuyerBnkBranch = eftBuyerBnkBranch;
	}

	public String getEftBuyerIban() {
		return this.eftBuyerIban;
	}

	public void setEftBuyerIban(String eftBuyerIban) {
		this.eftBuyerIban = eftBuyerIban;
	}

	public String getEftBuyerId() {
		return this.eftBuyerId;
	}

	public void setEftBuyerId(String eftBuyerId) {
		this.eftBuyerId = eftBuyerId;
	}

	public String getEftBuyerName() {
		return this.eftBuyerName;
	}

	public void setEftBuyerName(String eftBuyerName) {
		this.eftBuyerName = eftBuyerName;
	}

	public String getEftChgType() {
		return this.eftChgType;
	}

	public void setEftChgType(String eftChgType) {
		this.eftChgType = eftChgType;
	}

	public Date getEftCreateDate() {
		return this.eftCreateDate;
	}

	public void setEftCreateDate(Date eftCreateDate) {
		this.eftCreateDate = eftCreateDate;
	}

	public String getEftCreateUserId() {
		return this.eftCreateUserId;
	}

	public void setEftCreateUserId(String eftCreateUserId) {
		this.eftCreateUserId = eftCreateUserId;
	}

	public String getEftCreditAuthCode() {
		return this.eftCreditAuthCode;
	}

	public void setEftCreditAuthCode(String eftCreditAuthCode) {
		this.eftCreditAuthCode = eftCreditAuthCode;
	}

	public String getEftCreditAuthNo() {
		return this.eftCreditAuthNo;
	}

	public void setEftCreditAuthNo(String eftCreditAuthNo) {
		this.eftCreditAuthNo = eftCreditAuthNo;
	}

	public Date getEftCreditRecvTime() {
		return this.eftCreditRecvTime;
	}

	public void setEftCreditRecvTime(Date eftCreditRecvTime) {
		this.eftCreditRecvTime = eftCreditRecvTime;
	}

	public String getEftDebitAuthCode() {
		return this.eftDebitAuthCode;
	}

	public void setEftDebitAuthCode(String eftDebitAuthCode) {
		this.eftDebitAuthCode = eftDebitAuthCode;
	}

	public String getEftDebitAuthNo() {
		return this.eftDebitAuthNo;
	}

	public void setEftDebitAuthNo(String eftDebitAuthNo) {
		this.eftDebitAuthNo = eftDebitAuthNo;
	}

	public Date getEftDebitRecvTime() {
		return this.eftDebitRecvTime;
	}

	public void setEftDebitRecvTime(Date eftDebitRecvTime) {
		this.eftDebitRecvTime = eftDebitRecvTime;
	}

	public String getEftEpayService() {
		return this.eftEpayService;
	}

	public void setEftEpayService(String eftEpayService) {
		this.eftEpayService = eftEpayService;
	}

	public String getEftEphTxnid() {
		return this.eftEphTxnid;
	}

	public void setEftEphTxnid(String eftEphTxnid) {
		this.eftEphTxnid = eftEphTxnid;
	}

	public String getEftExgOrdNo() {
		return this.eftExgOrdNo;
	}

	public void setEftExgOrdNo(String eftExgOrdNo) {
		this.eftExgOrdNo = eftExgOrdNo;
	}

	public String getEftFpxTxnId() {
		return this.eftFpxTxnId;
	}

	public void setEftFpxTxnId(String eftFpxTxnId) {
		this.eftFpxTxnId = eftFpxTxnId;
	}

	public Date getEftLastRespTime() {
		return this.eftLastRespTime;
	}

	public void setEftLastRespTime(Date eftLastRespTime) {
		this.eftLastRespTime = eftLastRespTime;
	}

	public String getEftMakerName() {
		return this.eftMakerName;
	}

	public void setEftMakerName(String eftMakerName) {
		this.eftMakerName = eftMakerName;
	}

	public BigDecimal getEftMsgAmt() {
		return this.eftMsgAmt;
	}

	public void setEftMsgAmt(BigDecimal eftMsgAmt) {
		this.eftMsgAmt = eftMsgAmt;
	}

	public String getEftMsgCrcy() {
		return this.eftMsgCrcy;
	}

	public void setEftMsgCrcy(String eftMsgCrcy) {
		this.eftMsgCrcy = eftMsgCrcy;
	}

	public String getEftMsgNo() {
		return this.eftMsgNo;
	}

	public void setEftMsgNo(String eftMsgNo) {
		this.eftMsgNo = eftMsgNo;
	}

	public String getEftMsgStatus() {
		return this.eftMsgStatus;
	}

	public void setEftMsgStatus(String eftMsgStatus) {
		this.eftMsgStatus = eftMsgStatus;
	}

	public String getEftMsgToken() {
		return this.eftMsgToken;
	}

	public void setEftMsgToken(String eftMsgToken) {
		this.eftMsgToken = eftMsgToken;
	}

	public String getEftMsgType() {
		return this.eftMsgType;
	}

	public void setEftMsgType(String eftMsgType) {
		this.eftMsgType = eftMsgType;
	}

	public String getEftNoOfOrders() {
		return this.eftNoOfOrders;
	}

	public void setEftNoOfOrders(String eftNoOfOrders) {
		this.eftNoOfOrders = eftNoOfOrders;
	}

	public String getEftSellerExcDesc() {
		return this.eftSellerExcDesc;
	}

	public void setEftSellerExcDesc(String eftSellerExcDesc) {
		this.eftSellerExcDesc = eftSellerExcDesc;
	}

	public String getEftSellerExcId() {
		return this.eftSellerExcId;
	}

	public void setEftSellerExcId(String eftSellerExcId) {
		this.eftSellerExcId = eftSellerExcId;
	}

	public String getEftSellerFpxBankCode() {
		return this.eftSellerFpxBankCode;
	}

	public void setEftSellerFpxBankCode(String eftSellerFpxBankCode) {
		this.eftSellerFpxBankCode = eftSellerFpxBankCode;
	}

	public String getEftSellerId() {
		return this.eftSellerId;
	}

	public void setEftSellerId(String eftSellerId) {
		this.eftSellerId = eftSellerId;
	}

	public String getEftSellerOrdNo() {
		return this.eftSellerOrdNo;
	}

	public void setEftSellerOrdNo(String eftSellerOrdNo) {
		this.eftSellerOrdNo = eftSellerOrdNo;
	}

	public String getEftSellerTxnTime() {
		return this.eftSellerTxnTime;
	}

	public void setEftSellerTxnTime(String eftSellerTxnTime) {
		this.eftSellerTxnTime = eftSellerTxnTime;
	}

	public Date getEftSysDate() {
		return this.eftSysDate;
	}

	public void setEftSysDate(Date eftSysDate) {
		this.eftSysDate = eftSysDate;
	}

	public Date getEftTxnGenTime() {
		return this.eftTxnGenTime;
	}

	public void setEftTxnGenTime(Date eftTxnGenTime) {
		this.eftTxnGenTime = eftTxnGenTime;
	}

	public Date getEftTxnSentTime() {
		return this.eftTxnSentTime;
	}

	public void setEftTxnSentTime(Date eftTxnSentTime) {
		this.eftTxnSentTime = eftTxnSentTime;
	}

	public Date getEftUpdateDate() {
		return this.eftUpdateDate;
	}

	public void setEftUpdateDate(Date eftUpdateDate) {
		this.eftUpdateDate = eftUpdateDate;
	}

	public String getEftUpdateUserId() {
		return this.eftUpdateUserId;
	}

	public void setEftUpdateUserId(String eftUpdateUserId) {
		this.eftUpdateUserId = eftUpdateUserId;
	}

}