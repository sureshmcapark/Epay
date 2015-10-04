package com.dnt.epay.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;

/**
 * The persistent class for the EPAY_FPX_EXCHANGE database table.
 * 
 */
@Entity
@Table(name = "EPAY_FPX_EXCHANGE")
@NamedQuery(name = "EpayFpxExchange.findAll", query = "SELECT e FROM EpayFpxExchange e")
public class EpayFpxExchange implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "EFE_EXCHANGE_ID")
	private String efeExchangeId;

	@Column(name = "EFE_ACC_NO_1")
	private String efeAccNo1;

	@Column(name = "EFE_ACC_NO_2")
	private String efeAccNo2;

	@Column(name = "EFE_ACC_NO_3")
	private String efeAccNo3;

	@Column(name = "EFE_ACC_NO_4")
	private String efeAccNo4;

	@Temporal(TemporalType.DATE)
	@Column(name = "EFE_AUTH_DT")
	private Date efeAuthDt;

	@Column(name = "EFE_AUTH_ID")
	private String efeAuthId;

	@Column(name = "EFE_CITY")
	private String efeCity;

	@Column(name = "EFE_COMPANY_NAME")
	private String efeCompanyName;

	@Column(name = "EFE_COUNTRY")
	private String efeCountry;

	@Column(name = "EFE_DESC")
	private String efeDesc;

	@Column(name = "EFE_EFL_BANK_ID")
	private String efeEflBankId;

	@Column(name = "EFE_EXCHANGE_NAME")
	private String efeExchangeName;

	@Column(name = "EFE_FAX_NO")
	private String efeFaxNo;

	@Column(name = "EFE_HOME_URL")
	private String efeHomeUrl;

	@Column(name = "EFE_IP_ADDRESS")
	private String efeIpAddress;

	@Column(name = "EFE_MAILBOX_NO")
	private String efeMailboxNo;

	@Temporal(TemporalType.DATE)
	@Column(name = "EFE_MAKER_DT")
	private Date efeMakerDt;

	@Column(name = "EFE_MAKER_ID")
	private String efeMakerId;

	@Column(name = "EFE_POST_CODE")
	private String efePostCode;

	@Temporal(TemporalType.DATE)
	@Column(name = "EFE_REG_DATE")
	private Date efeRegDate;

	@Column(name = "EFE_ROC_ROB_NO")
	private String efeRocRobNo;

	@Column(name = "EFE_STATE")
	private String efeState;

	public EpayFpxExchange() {
	}

	public String getEfeExchangeId() {
		return this.efeExchangeId;
	}

	public void setEfeExchangeId(String efeExchangeId) {
		this.efeExchangeId = efeExchangeId;
	}

	public String getEfeAccNo1() {
		return this.efeAccNo1;
	}

	public void setEfeAccNo1(String efeAccNo1) {
		this.efeAccNo1 = efeAccNo1;
	}

	public String getEfeAccNo2() {
		return this.efeAccNo2;
	}

	public void setEfeAccNo2(String efeAccNo2) {
		this.efeAccNo2 = efeAccNo2;
	}

	public String getEfeAccNo3() {
		return this.efeAccNo3;
	}

	public void setEfeAccNo3(String efeAccNo3) {
		this.efeAccNo3 = efeAccNo3;
	}

	public String getEfeAccNo4() {
		return this.efeAccNo4;
	}

	public void setEfeAccNo4(String efeAccNo4) {
		this.efeAccNo4 = efeAccNo4;
	}

	public Date getEfeAuthDt() {
		return this.efeAuthDt;
	}

	public void setEfeAuthDt(Date efeAuthDt) {
		this.efeAuthDt = efeAuthDt;
	}

	public String getEfeAuthId() {
		return this.efeAuthId;
	}

	public void setEfeAuthId(String efeAuthId) {
		this.efeAuthId = efeAuthId;
	}

	public String getEfeCity() {
		return this.efeCity;
	}

	public void setEfeCity(String efeCity) {
		this.efeCity = efeCity;
	}

	public String getEfeCompanyName() {
		return this.efeCompanyName;
	}

	public void setEfeCompanyName(String efeCompanyName) {
		this.efeCompanyName = efeCompanyName;
	}

	public String getEfeCountry() {
		return this.efeCountry;
	}

	public void setEfeCountry(String efeCountry) {
		this.efeCountry = efeCountry;
	}

	public String getEfeDesc() {
		return this.efeDesc;
	}

	public void setEfeDesc(String efeDesc) {
		this.efeDesc = efeDesc;
	}

	public String getEfeEflBankId() {
		return this.efeEflBankId;
	}

	public void setEfeEflBankId(String efeEflBankId) {
		this.efeEflBankId = efeEflBankId;
	}

	public String getEfeExchangeName() {
		return this.efeExchangeName;
	}

	public void setEfeExchangeName(String efeExchangeName) {
		this.efeExchangeName = efeExchangeName;
	}

	public String getEfeFaxNo() {
		return this.efeFaxNo;
	}

	public void setEfeFaxNo(String efeFaxNo) {
		this.efeFaxNo = efeFaxNo;
	}

	public String getEfeHomeUrl() {
		return this.efeHomeUrl;
	}

	public void setEfeHomeUrl(String efeHomeUrl) {
		this.efeHomeUrl = efeHomeUrl;
	}

	public String getEfeIpAddress() {
		return this.efeIpAddress;
	}

	public void setEfeIpAddress(String efeIpAddress) {
		this.efeIpAddress = efeIpAddress;
	}

	public String getEfeMailboxNo() {
		return this.efeMailboxNo;
	}

	public void setEfeMailboxNo(String efeMailboxNo) {
		this.efeMailboxNo = efeMailboxNo;
	}

	public Date getEfeMakerDt() {
		return this.efeMakerDt;
	}

	public void setEfeMakerDt(Date efeMakerDt) {
		this.efeMakerDt = efeMakerDt;
	}

	public String getEfeMakerId() {
		return this.efeMakerId;
	}

	public void setEfeMakerId(String efeMakerId) {
		this.efeMakerId = efeMakerId;
	}

	public String getEfePostCode() {
		return this.efePostCode;
	}

	public void setEfePostCode(String efePostCode) {
		this.efePostCode = efePostCode;
	}

	public Date getEfeRegDate() {
		return this.efeRegDate;
	}

	public void setEfeRegDate(Date efeRegDate) {
		this.efeRegDate = efeRegDate;
	}

	public String getEfeRocRobNo() {
		return this.efeRocRobNo;
	}

	public void setEfeRocRobNo(String efeRocRobNo) {
		this.efeRocRobNo = efeRocRobNo;
	}

	public String getEfeState() {
		return this.efeState;
	}

	public void setEfeState(String efeState) {
		this.efeState = efeState;
	}

}