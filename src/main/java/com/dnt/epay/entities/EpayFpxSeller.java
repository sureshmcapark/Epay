package com.dnt.epay.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
@Table(name = "EPAY_FPX_SELLER")
public class EpayFpxSeller {
	@Id
	@Column(name = "EFS_FRONTEND_CODE", length = 40)
	private String efsFrontendCode;
	@Column(name = "EFS_SELLER_ID", length = 40)
	private String efsSellerId;
	@Column(name = "EFS_SELLER_NAME", length = 100)
	private String efsSellerName;
	@Column(name = "EFS_ACC_NO_1", length = 20)
	private String efsSellerAcct1;
	@Column(name = "EFS_ACC_NO_2", length = 20)
	private String efsSellerAcct2;
	@Column(name = "EFS_ACC_NO_3", length = 20)
	private String efsSellerAcct3;
	@Column(name = "EFS_ACC_NO_4", length = 20)
	private String efsSellerAcct4;
	@Column(name = "EFS_ESTAB_NAME", length = 100)
	private String efsEstabName;
	@Column(name = "EFS_DESC", length = 30)
	private String efsDesc;
	@Column(name = "EFS_EFL_BANK_ID", length = 15)
	private String efsEflBankId;
	@Column(name = "EFS_ROC_ROB_NO", length = 15)
	private String efsRocRobNo;
	@Column(name = "EFS_FAX_NO", length = 15)
	private String efsFaxNo;
	@Column(name = "EFS_EMP_NAME1", length = 30)
	private String efsEmpName1;
	@Column(name = "EFS_EMP_EMAIL1", length = 50)
	private String efsEmpEmail1;
	@Column(name = "EFS_EMP_CONTACTNO1", length = 15)
	private String efsEmpContactno1;
	@Column(name = "EFS_EFE_EXCHANGE_ID", length = 20)
	private String efsEfeExchangeId;
	@Column(name = "EFS_REG_DATE")
	private String efsRegDate;
	@Column(name = "EFS_EMP_NAME2", length = 30)
	private String efsEmpName2;
	@Column(name = "EFS_EMP_EMAIL2", length = 50)
	private String efsEmpEmail2;
	@Column(name = "EFS_EMP_CONTACTNO2", length = 15)
	private String efsEmpContactno2;
	@Column(name = "EFS_HOME_URL", length = 50)
	private String efsHomeUrl;
	@Column(name = "EFS_ADDRESS1", length = 60)
	private String efsAddress1;
	@Column(name = "EFS_ADDRESS2", length = 60)
	private String efsAddress2;
	@Column(name = "EFS_ADDRESS3", length = 60)
	private String efsAddress3;
	@Column(name = "EFS_POSTCODE", length = 15)
	private String efsPostcode;
	@Column(name = "EFS_STATE", length = 40)
	private String efsState;
	@Column(name = "EFS_EFL_BRANCH_ID", length = 25)
	private String efsEflBranchId;
	@Column(name = "EFS_BUSFUNC", length = 5)
	private String efsBusfunc;
	@Column(name = "EFS_MAKER_ID", length = 20)
	private String efsMakerId;
	@Column(name = "EFS_MAKER_DT")
	@Temporal(javax.persistence.TemporalType.DATE)
	private Date efsMakerDt;
	@Column(name = "EFS_AUTH_ID", length = 20)
	private String efsAuthId;
	@Column(name = "EFS_AUTH_DT")
	@Temporal(javax.persistence.TemporalType.DATE)
	private Date efsAuthDt;

	public EpayFpxSeller() {
		super();
	}

	public String getEfsSellerId() {
		return efsSellerId;
	}

	public void setEfsSellerId(String efsSellerId) {
		this.efsSellerId = efsSellerId;
	}

	public String getEfsSellerName() {
		return efsSellerName;
	}

	public void setEfsSellerName(String efsSellerName) {
		this.efsSellerName = efsSellerName;
	}

	public String getEfsSellerAcct1() {
		return efsSellerAcct1;
	}

	public void setEfsSellerAcct1(String efsSellerAcct1) {
		this.efsSellerAcct1 = efsSellerAcct1;
	}

	public String getEfsSellerAcct2() {
		return efsSellerAcct2;
	}

	public void setEfsSellerAcct2(String efsSellerAcct2) {
		this.efsSellerAcct2 = efsSellerAcct2;
	}

	public String getEfsSellerAcct3() {
		return efsSellerAcct3;
	}

	public void setEfsSellerAcct3(String efsSellerAcct3) {
		this.efsSellerAcct3 = efsSellerAcct3;
	}

	public String getEfsSellerAcct4() {
		return efsSellerAcct4;
	}

	public void setEfsSellerAcct4(String efsSellerAcct4) {
		this.efsSellerAcct4 = efsSellerAcct4;
	}

	public String getEfsEstabName() {
		return efsEstabName;
	}

	public void setEfsEstabName(String efsEstabName) {
		this.efsEstabName = efsEstabName;
	}

	public String getEfsFrontendCode() {
		return efsFrontendCode;
	}

	public void setEfsFrontendCode(String efsFrontendCode) {
		this.efsFrontendCode = efsFrontendCode;
	}

	public String getEfsDesc() {
		return efsDesc;
	}

	public void setEfsDesc(String efsDesc) {
		this.efsDesc = efsDesc;
	}

	public String getEfsEflBankId() {
		return efsEflBankId;
	}

	public void setEfsEflBankId(String efsEflBankId) {
		this.efsEflBankId = efsEflBankId;
	}

	public String getEfsRocRobNo() {
		return efsRocRobNo;
	}

	public void setEfsRocRobNo(String efsRocRobNo) {
		this.efsRocRobNo = efsRocRobNo;
	}

	public String getEfsFaxNo() {
		return efsFaxNo;
	}

	public void setEfsFaxNo(String efsFaxNo) {
		this.efsFaxNo = efsFaxNo;
	}

	public String getEfsEmpName1() {
		return efsEmpName1;
	}

	public void setEfsEmpName1(String efsEmpName1) {
		this.efsEmpName1 = efsEmpName1;
	}

	public String getEfsEmpEmail1() {
		return efsEmpEmail1;
	}

	public void setEfsEmpEmail1(String efsEmpEmail1) {
		this.efsEmpEmail1 = efsEmpEmail1;
	}

	public String getEfsEmpContactno1() {
		return efsEmpContactno1;
	}

	public void setEfsEmpContactno1(String efsEmpContactno1) {
		this.efsEmpContactno1 = efsEmpContactno1;
	}

	public String getEfsEfeExchangeId() {
		return efsEfeExchangeId;
	}

	public void setEfsEfeExchangeId(String efsEfeExchangeId) {
		this.efsEfeExchangeId = efsEfeExchangeId;
	}

	public String getEfsRegDate() {
		return efsRegDate;
	}

	public void setEfsRegDate(String efsRegDate) {
		this.efsRegDate = efsRegDate;
	}

	public String getEfsEmpName2() {
		return efsEmpName2;
	}

	public void setEfsEmpName2(String efsEmpName2) {
		this.efsEmpName2 = efsEmpName2;
	}

	public String getEfsEmpEmail2() {
		return efsEmpEmail2;
	}

	public void setEfsEmpEmail2(String efsEmpEmail2) {
		this.efsEmpEmail2 = efsEmpEmail2;
	}

	public String getEfsEmpContactno2() {
		return efsEmpContactno2;
	}

	public void setEfsEmpContactno2(String efsEmpContactno2) {
		this.efsEmpContactno2 = efsEmpContactno2;
	}

	public String getEfsHomeUrl() {
		return efsHomeUrl;
	}

	public void setEfsHomeUrl(String efsHomeUrl) {
		this.efsHomeUrl = efsHomeUrl;
	}

	public String getEfsAddress1() {
		return efsAddress1;
	}

	public void setEfsAddress1(String efsAddress1) {
		this.efsAddress1 = efsAddress1;
	}

	public String getEfsAddress2() {
		return efsAddress2;
	}

	public void setEfsAddress2(String efsAddress2) {
		this.efsAddress2 = efsAddress2;
	}

	public String getEfsAddress3() {
		return efsAddress3;
	}

	public void setEfsAddress3(String efsAddress3) {
		this.efsAddress3 = efsAddress3;
	}

	public String getEfsPostcode() {
		return efsPostcode;
	}

	public void setEfsPostcode(String efsPostcode) {
		this.efsPostcode = efsPostcode;
	}

	public String getEfsState() {
		return efsState;
	}

	public void setEfsState(String efsState) {
		this.efsState = efsState;
	}

	public String getEfsEflBranchId() {
		return efsEflBranchId;
	}

	public void setEfsEflBranchId(String efsEflBranchId) {
		this.efsEflBranchId = efsEflBranchId;
	}

	public String getEfsBusfunc() {
		return efsBusfunc;
	}

	public void setEfsBusfunc(String efsBusfunc) {
		this.efsBusfunc = efsBusfunc;
	}

	public String getEfsMakerId() {
		return efsMakerId;
	}

	public void setEfsMakerId(String efsMakerId) {
		this.efsMakerId = efsMakerId;
	}

	public Date getEfsMakerDt() {
		return efsMakerDt;
	}

	public void setEfsMakerDt(Date efsMakerDt) {
		this.efsMakerDt = efsMakerDt;
	}

	public String getEfsAuthId() {
		return efsAuthId;
	}

	public void setEfsAuthId(String efsAuthId) {
		this.efsAuthId = efsAuthId;
	}

	public Date getEfsAuthDt() {
		return efsAuthDt;
	}

	public void setEfsAuthDt(Date efsAuthDt) {
		this.efsAuthDt = efsAuthDt;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((efsAddress1 == null) ? 0 : efsAddress1.hashCode());
		result = prime * result
				+ ((efsAddress2 == null) ? 0 : efsAddress2.hashCode());
		result = prime * result
				+ ((efsAddress3 == null) ? 0 : efsAddress3.hashCode());
		result = prime * result
				+ ((efsAuthDt == null) ? 0 : efsAuthDt.hashCode());
		result = prime * result
				+ ((efsAuthId == null) ? 0 : efsAuthId.hashCode());
		result = prime * result
				+ ((efsBusfunc == null) ? 0 : efsBusfunc.hashCode());
		result = prime * result + ((efsDesc == null) ? 0 : efsDesc.hashCode());
		result = prime
				* result
				+ ((efsEfeExchangeId == null) ? 0 : efsEfeExchangeId.hashCode());
		result = prime * result
				+ ((efsEflBankId == null) ? 0 : efsEflBankId.hashCode());
		result = prime * result
				+ ((efsEflBranchId == null) ? 0 : efsEflBranchId.hashCode());
		result = prime
				* result
				+ ((efsEmpContactno1 == null) ? 0 : efsEmpContactno1.hashCode());
		result = prime
				* result
				+ ((efsEmpContactno2 == null) ? 0 : efsEmpContactno2.hashCode());
		result = prime * result
				+ ((efsEmpEmail1 == null) ? 0 : efsEmpEmail1.hashCode());
		result = prime * result
				+ ((efsEmpEmail2 == null) ? 0 : efsEmpEmail2.hashCode());
		result = prime * result
				+ ((efsEmpName1 == null) ? 0 : efsEmpName1.hashCode());
		result = prime * result
				+ ((efsEmpName2 == null) ? 0 : efsEmpName2.hashCode());
		result = prime * result
				+ ((efsEstabName == null) ? 0 : efsEstabName.hashCode());
		result = prime * result
				+ ((efsFaxNo == null) ? 0 : efsFaxNo.hashCode());
		result = prime * result
				+ ((efsFrontendCode == null) ? 0 : efsFrontendCode.hashCode());
		result = prime * result
				+ ((efsHomeUrl == null) ? 0 : efsHomeUrl.hashCode());
		result = prime * result
				+ ((efsMakerDt == null) ? 0 : efsMakerDt.hashCode());
		result = prime * result
				+ ((efsMakerId == null) ? 0 : efsMakerId.hashCode());
		result = prime * result
				+ ((efsPostcode == null) ? 0 : efsPostcode.hashCode());
		result = prime * result
				+ ((efsRegDate == null) ? 0 : efsRegDate.hashCode());
		result = prime * result
				+ ((efsRocRobNo == null) ? 0 : efsRocRobNo.hashCode());
		result = prime * result
				+ ((efsSellerAcct1 == null) ? 0 : efsSellerAcct1.hashCode());
		result = prime * result
				+ ((efsSellerAcct2 == null) ? 0 : efsSellerAcct2.hashCode());
		result = prime * result
				+ ((efsSellerAcct3 == null) ? 0 : efsSellerAcct3.hashCode());
		result = prime * result
				+ ((efsSellerAcct4 == null) ? 0 : efsSellerAcct4.hashCode());
		result = prime * result
				+ ((efsSellerId == null) ? 0 : efsSellerId.hashCode());
		result = prime * result
				+ ((efsSellerName == null) ? 0 : efsSellerName.hashCode());
		result = prime * result
				+ ((efsState == null) ? 0 : efsState.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EpayFpxSeller other = (EpayFpxSeller) obj;
		if (efsAddress1 == null) {
			if (other.efsAddress1 != null)
				return false;
		} else if (!efsAddress1.equals(other.efsAddress1))
			return false;
		if (efsAddress2 == null) {
			if (other.efsAddress2 != null)
				return false;
		} else if (!efsAddress2.equals(other.efsAddress2))
			return false;
		if (efsAddress3 == null) {
			if (other.efsAddress3 != null)
				return false;
		} else if (!efsAddress3.equals(other.efsAddress3))
			return false;
		if (efsAuthDt == null) {
			if (other.efsAuthDt != null)
				return false;
		} else if (!efsAuthDt.equals(other.efsAuthDt))
			return false;
		if (efsAuthId == null) {
			if (other.efsAuthId != null)
				return false;
		} else if (!efsAuthId.equals(other.efsAuthId))
			return false;
		if (efsBusfunc == null) {
			if (other.efsBusfunc != null)
				return false;
		} else if (!efsBusfunc.equals(other.efsBusfunc))
			return false;
		if (efsDesc == null) {
			if (other.efsDesc != null)
				return false;
		} else if (!efsDesc.equals(other.efsDesc))
			return false;
		if (efsEfeExchangeId == null) {
			if (other.efsEfeExchangeId != null)
				return false;
		} else if (!efsEfeExchangeId.equals(other.efsEfeExchangeId))
			return false;
		if (efsEflBankId == null) {
			if (other.efsEflBankId != null)
				return false;
		} else if (!efsEflBankId.equals(other.efsEflBankId))
			return false;
		if (efsEflBranchId == null) {
			if (other.efsEflBranchId != null)
				return false;
		} else if (!efsEflBranchId.equals(other.efsEflBranchId))
			return false;
		if (efsEmpContactno1 == null) {
			if (other.efsEmpContactno1 != null)
				return false;
		} else if (!efsEmpContactno1.equals(other.efsEmpContactno1))
			return false;
		if (efsEmpContactno2 == null) {
			if (other.efsEmpContactno2 != null)
				return false;
		} else if (!efsEmpContactno2.equals(other.efsEmpContactno2))
			return false;
		if (efsEmpEmail1 == null) {
			if (other.efsEmpEmail1 != null)
				return false;
		} else if (!efsEmpEmail1.equals(other.efsEmpEmail1))
			return false;
		if (efsEmpEmail2 == null) {
			if (other.efsEmpEmail2 != null)
				return false;
		} else if (!efsEmpEmail2.equals(other.efsEmpEmail2))
			return false;
		if (efsEmpName1 == null) {
			if (other.efsEmpName1 != null)
				return false;
		} else if (!efsEmpName1.equals(other.efsEmpName1))
			return false;
		if (efsEmpName2 == null) {
			if (other.efsEmpName2 != null)
				return false;
		} else if (!efsEmpName2.equals(other.efsEmpName2))
			return false;
		if (efsEstabName == null) {
			if (other.efsEstabName != null)
				return false;
		} else if (!efsEstabName.equals(other.efsEstabName))
			return false;
		if (efsFaxNo == null) {
			if (other.efsFaxNo != null)
				return false;
		} else if (!efsFaxNo.equals(other.efsFaxNo))
			return false;
		if (efsFrontendCode == null) {
			if (other.efsFrontendCode != null)
				return false;
		} else if (!efsFrontendCode.equals(other.efsFrontendCode))
			return false;
		if (efsHomeUrl == null) {
			if (other.efsHomeUrl != null)
				return false;
		} else if (!efsHomeUrl.equals(other.efsHomeUrl))
			return false;
		if (efsMakerDt == null) {
			if (other.efsMakerDt != null)
				return false;
		} else if (!efsMakerDt.equals(other.efsMakerDt))
			return false;
		if (efsMakerId == null) {
			if (other.efsMakerId != null)
				return false;
		} else if (!efsMakerId.equals(other.efsMakerId))
			return false;
		if (efsPostcode == null) {
			if (other.efsPostcode != null)
				return false;
		} else if (!efsPostcode.equals(other.efsPostcode))
			return false;
		if (efsRegDate == null) {
			if (other.efsRegDate != null)
				return false;
		} else if (!efsRegDate.equals(other.efsRegDate))
			return false;
		if (efsRocRobNo == null) {
			if (other.efsRocRobNo != null)
				return false;
		} else if (!efsRocRobNo.equals(other.efsRocRobNo))
			return false;
		if (efsSellerAcct1 == null) {
			if (other.efsSellerAcct1 != null)
				return false;
		} else if (!efsSellerAcct1.equals(other.efsSellerAcct1))
			return false;
		if (efsSellerAcct2 == null) {
			if (other.efsSellerAcct2 != null)
				return false;
		} else if (!efsSellerAcct2.equals(other.efsSellerAcct2))
			return false;
		if (efsSellerAcct3 == null) {
			if (other.efsSellerAcct3 != null)
				return false;
		} else if (!efsSellerAcct3.equals(other.efsSellerAcct3))
			return false;
		if (efsSellerAcct4 == null) {
			if (other.efsSellerAcct4 != null)
				return false;
		} else if (!efsSellerAcct4.equals(other.efsSellerAcct4))
			return false;
		if (efsSellerId == null) {
			if (other.efsSellerId != null)
				return false;
		} else if (!efsSellerId.equals(other.efsSellerId))
			return false;
		if (efsSellerName == null) {
			if (other.efsSellerName != null)
				return false;
		} else if (!efsSellerName.equals(other.efsSellerName))
			return false;
		if (efsState == null) {
			if (other.efsState != null)
				return false;
		} else if (!efsState.equals(other.efsState))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "EpayFpxSeller [efsSellerId=" + efsSellerId + ", efsSellerName="
				+ efsSellerName + ", efsSellerAcct1=" + efsSellerAcct1
				+ ", efsSellerAcct2=" + efsSellerAcct2 + ", efsSellerAcct3="
				+ efsSellerAcct3 + ", efsSellerAcct4=" + efsSellerAcct4
				+ ", efsEstabName=" + efsEstabName + ", efsFrontendCode="
				+ efsFrontendCode + ", efsDesc=" + efsDesc + ", efsEflBankId="
				+ efsEflBankId + ", efsRocRobNo=" + efsRocRobNo + ", efsFaxNo="
				+ efsFaxNo + ", efsEmpName1=" + efsEmpName1 + ", efsEmpEmail1="
				+ efsEmpEmail1 + ", efsEmpContactno1=" + efsEmpContactno1
				+ ", efsEfeExchangeId=" + efsEfeExchangeId + ", efsRegDate="
				+ efsRegDate + ", efsEmpName2=" + efsEmpName2
				+ ", efsEmpEmail2=" + efsEmpEmail2 + ", efsEmpContactno2="
				+ efsEmpContactno2 + ", efsHomeUrl=" + efsHomeUrl
				+ ", efsAddress1=" + efsAddress1 + ", efsAddress2="
				+ efsAddress2 + ", efsAddress3=" + efsAddress3
				+ ", efsPostcode=" + efsPostcode + ", efsState=" + efsState
				+ ", efsEflBranchId=" + efsEflBranchId + ", efsBusfunc="
				+ efsBusfunc + ", efsMakerId=" + efsMakerId + ", efsMakerDt="
				+ efsMakerDt + ", efsAuthId=" + efsAuthId + ", efsAuthDt="
				+ efsAuthDt + "]";
	}

	
	
}
