package com.dnt.epay.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * The persistent class for the EPAY_PAYMENT_DETAILS database table.
 * 
 */
@Entity
@Table(name = "EPAY_PAYMENT_DETAILS")
@NamedQuery(name = "EpayPaymentDetail.findAll", query = "SELECT e FROM EpayPaymentDetail e")
public class EpayPaymentDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "EPD_ID")
	private String epdId;

	@Column(name = "EPD_EDECLARE_FLAG")
	private String epdEdeclareFlag;

	@Column(name = "EPD_SEQ_IND_AMT")
	private BigDecimal epdSeqIndAmt;

	@Column(name = "EPD_SEQ_NO")
	private String epdSeqNo;

	@Column(name = "EPD_SEQ_PROC_IND")
	private String epdSeqProcInd;

	@Column(name = "EPD_SEQ_REF_DESC")
	private String epdSeqRefDesc;

	@Column(name = "EPD_SEQ_REF_NO")
	private String epdSeqRefNo;

	@Column(name = "EPD_SEQ_REF_TYPE")
	private String epdSeqRefType;

	@Temporal(TemporalType.DATE)
	@Column(name = "EPD_SEQ_REG_DATE")
	private Date epdSeqRegDate;

	@Column(name = "EPD_SOURCE_SYSTEM")
	private String epdSourceSystem;

	@Column(name = "EPD_TXN_STATUS")
	private String epdTxnStatus;

	// bi-directional many-to-one association to EpayPaymentHeader
	@ManyToOne
	@JoinColumn(name = "EPD_EPH_TXNID")
	private EpayPaymentHeader epdEphTxnId;

	public EpayPaymentDetail() {
	}

	public String getEpdId() {
		return epdId;
	}

	public void setEpdId(String epdId) {
		this.epdId = epdId;
	}

	public String getEpdEdeclareFlag() {
		return this.epdEdeclareFlag;
	}

	public void setEpdEdeclareFlag(String epdEdeclareFlag) {
		this.epdEdeclareFlag = epdEdeclareFlag;
	}

	public BigDecimal getEpdSeqIndAmt() {
		return this.epdSeqIndAmt;
	}

	public void setEpdSeqIndAmt(BigDecimal epdSeqIndAmt) {
		this.epdSeqIndAmt = epdSeqIndAmt;
	}

	public String getEpdSeqNo() {
		return this.epdSeqNo;
	}

	public void setEpdSeqNo(String epdSeqNo) {
		this.epdSeqNo = epdSeqNo;
	}

	public String getEpdSeqProcInd() {
		return this.epdSeqProcInd;
	}

	public void setEpdSeqProcInd(String epdSeqProcInd) {
		this.epdSeqProcInd = epdSeqProcInd;
	}

	public String getEpdSeqRefDesc() {
		return this.epdSeqRefDesc;
	}

	public void setEpdSeqRefDesc(String epdSeqRefDesc) {
		this.epdSeqRefDesc = epdSeqRefDesc;
	}

	public String getEpdSeqRefNo() {
		return this.epdSeqRefNo;
	}

	public void setEpdSeqRefNo(String epdSeqRefNo) {
		this.epdSeqRefNo = epdSeqRefNo;
	}

	public String getEpdSeqRefType() {
		return this.epdSeqRefType;
	}

	public void setEpdSeqRefType(String epdSeqRefType) {
		this.epdSeqRefType = epdSeqRefType;
	}

	public Date getEpdSeqRegDate() {
		return this.epdSeqRegDate;
	}

	public void setEpdSeqRegDate(Date epdSeqRegDate) {
		this.epdSeqRegDate = epdSeqRegDate;
	}

	public String getEpdSourceSystem() {
		return this.epdSourceSystem;
	}

	public void setEpdSourceSystem(String epdSourceSystem) {
		this.epdSourceSystem = epdSourceSystem;
	}

	public String getEpdTxnStatus() {
		return this.epdTxnStatus;
	}

	public void setEpdTxnStatus(String epdTxnStatus) {
		this.epdTxnStatus = epdTxnStatus;
	}

	public EpayPaymentHeader getEpdEphTxnId() {
		return epdEphTxnId;
	}

	public void setEpdEphTxnId(EpayPaymentHeader epdEphTxnId) {
		this.epdEphTxnId = epdEphTxnId;
	}

}