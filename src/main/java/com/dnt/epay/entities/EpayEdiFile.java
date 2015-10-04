package com.dnt.epay.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The persistent class for the EPAY_EDI_FILE database table.
 * 
 */
@Entity
@Table(name = "EPAY_EDI_FILE")
@NamedQuery(name = "EpayEdiFile.findAll", query = "SELECT e FROM EpayEdiFile e")
public class EpayEdiFile implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "EEF_ID")
	private String eefId;

	@Column(name = "EEF_APP_NAME")
	private String eefAppName;

	@Temporal(TemporalType.DATE)
	@Column(name = "EEF_AUTH_DT")
	private Date eefAuthDt;

	@Column(name = "EEF_AUTH_ID")
	private String eefAuthId;

	@Temporal(TemporalType.DATE)
	@Column(name = "EEF_DATETIME")
	private Date eefDatetime;

	@Column(name = "EEF_EEC_CODE")
	private String eefEecCode;

	@Column(name = "EEF_ERR_CATEGORY")
	private String eefErrCategory;

	@Temporal(TemporalType.DATE)
	@Column(name = "EEF_ERR_DATETIME")
	private Date eefErrDatetime;

	@Column(name = "EEF_ERR_SEGMENT")
	private String eefErrSegment;

	@Column(name = "EEF_FILE_ID")
	private String eefFileId;

	@Column(name = "EEF_FILE_NAME")
	private String eefFileName;

	@Column(name = "EEF_FILETYPE")
	private String eefFiletype;

	@Temporal(TemporalType.DATE)
	@Column(name = "EEF_MAKER_DT")
	private Date eefMakerDt;

	@Column(name = "EEF_MAKER_ID")
	private String eefMakerId;

	@Column(name = "EEF_PROC_STAT")
	private String eefProcStat;

	@Column(name = "EEF_REMARKS")
	private String eefRemarks;

	@Column(name = "EEF_SERVER_NAME")
	private String eefServerName;

	@Column(name = "EEF_SELLER_ORDER_NO")
	private String eefSellerOrderNo;
	
	
	public EpayEdiFile() {
	}

	public String getEefAppName() {
		return this.eefAppName;
	}

	public void setEefAppName(String eefAppName) {
		this.eefAppName = eefAppName;
	}

	public Date getEefAuthDt() {
		return this.eefAuthDt;
	}

	public void setEefAuthDt(Date eefAuthDt) {
		this.eefAuthDt = eefAuthDt;
	}

	public String getEefAuthId() {
		return this.eefAuthId;
	}

	public void setEefAuthId(String eefAuthId) {
		this.eefAuthId = eefAuthId;
	}

	public String getEefEecCode() {
		return this.eefEecCode;
	}

	public void setEefEecCode(String eefEecCode) {
		this.eefEecCode = eefEecCode;
	}

	public String getEefErrCategory() {
		return this.eefErrCategory;
	}

	public void setEefErrCategory(String eefErrCategory) {
		this.eefErrCategory = eefErrCategory;
	}

	public Date getEefDatetime() {
		return eefDatetime;
	}

	public void setEefDatetime(Date eefDatetime) {
		this.eefDatetime = eefDatetime;
	}

	public Date getEefErrDatetime() {
		return eefErrDatetime;
	}

	public void setEefErrDatetime(Date eefErrDatetime) {
		this.eefErrDatetime = eefErrDatetime;
	}

	public String getEefErrSegment() {
		return this.eefErrSegment;
	}

	public void setEefErrSegment(String eefErrSegment) {
		this.eefErrSegment = eefErrSegment;
	}

	public String getEefFileId() {
		return this.eefFileId;
	}

	public void setEefFileId(String eefFileId) {
		this.eefFileId = eefFileId;
	}

	public String getEefFileName() {
		return this.eefFileName;
	}

	public void setEefFileName(String eefFileName) {
		this.eefFileName = eefFileName;
	}

	public String getEefFiletype() {
		return eefFiletype;
	}

	public void setEefFiletype(String eefFiletype) {
		this.eefFiletype = eefFiletype;
	}

	public String getEefId() {
		return eefId;
	}

	public void setEefId(String eefId) {
		this.eefId = eefId;
	}

	public Date getEefMakerDt() {
		return this.eefMakerDt;
	}

	public void setEefMakerDt(Date eefMakerDt) {
		this.eefMakerDt = eefMakerDt;
	}

	public String getEefMakerId() {
		return this.eefMakerId;
	}

	public void setEefMakerId(String eefMakerId) {
		this.eefMakerId = eefMakerId;
	}

	public String getEefProcStat() {
		return this.eefProcStat;
	}

	public void setEefProcStat(String eefProcStat) {
		this.eefProcStat = eefProcStat;
	}

	public String getEefRemarks() {
		return this.eefRemarks;
	}

	public void setEefRemarks(String eefRemarks) {
		this.eefRemarks = eefRemarks;
	}

	public String getEefServerName() {
		return this.eefServerName;
	}

	public void setEefServerName(String eefServerName) {
		this.eefServerName = eefServerName;
	}

}