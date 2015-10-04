package com.dnt.epay.services;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(namespace = "com.jaxb.FPX_SELLER_RES")
public class FPXResOrderList {

	private String SLNO;
	private String CHARGE_TYPE;
	private String TXN_CCY;
	private String TXN_AMT;
	private String DEBIT_AUTH_CODE;
	private String DEBIT_AUTH_NO;
	private String CREDIT_AUTH_CODE;
	private String CREDIT_AUTH_NO;
	
	private FPXResSellerList fPXResSellerList;
	
	private FPXResBuyerList fPXResBuyerList;
	
	/**
	 * @return the fPXResBuyerList
	 */
	public FPXResBuyerList getfPXResBuyerList() {
		return fPXResBuyerList;
	}
	/**
	 * @param fPXResBuyerList the fPXResBuyerList to set
	 */
	@XmlElement(name = "BUYER")
	public void setfPXResBuyerList(FPXResBuyerList fPXResBuyerList) {
		this.fPXResBuyerList = fPXResBuyerList;
	}
	
	/**
	 * @return the sLNO
	 */
	public String getSLNO() {
		return SLNO;
	}
	/**
	 * @param sLNO the sLNO to set
	 */
	public void setSLNO(String sLNO) {
		SLNO = sLNO;
	}
	/**
	 * @return the cHARGE_TYPE
	 */
	public String getCHARGE_TYPE() {
		return CHARGE_TYPE;
	}
	/**
	 * @param cHARGE_TYPE the cHARGE_TYPE to set
	 */
	public void setCHARGE_TYPE(String cHARGE_TYPE) {
		CHARGE_TYPE = cHARGE_TYPE;
	}
	/**
	 * @return the tXN_CCY
	 */
	public String getTXN_CCY() {
		return TXN_CCY;
	}
	/**
	 * @param tXN_CCY the tXN_CCY to set
	 */
	public void setTXN_CCY(String tXN_CCY) {
		TXN_CCY = tXN_CCY;
	}
	/**
	 * @return the tXN_AMT
	 */
	public String getTXN_AMT() {
		return TXN_AMT;
	}
	/**
	 * @param tXN_AMT the tXN_AMT to set
	 */
	public void setTXN_AMT(String tXN_AMT) {
		TXN_AMT = tXN_AMT;
	}
	/**
	 * @return the dEBIT_AUTH_CODE
	 */
	public String getDEBIT_AUTH_CODE() {
		return DEBIT_AUTH_CODE;
	}
	/**
	 * @param dEBIT_AUTH_CODE the dEBIT_AUTH_CODE to set
	 */
	public void setDEBIT_AUTH_CODE(String dEBIT_AUTH_CODE) {
		DEBIT_AUTH_CODE = dEBIT_AUTH_CODE;
	}
	/**
	 * @return the dEBIT_AUTH_NO
	 */
	public String getDEBIT_AUTH_NO() {
		return DEBIT_AUTH_NO;
	}
	/**
	 * @param dEBIT_AUTH_NO the dEBIT_AUTH_NO to set
	 */
	public void setDEBIT_AUTH_NO(String dEBIT_AUTH_NO) {
		DEBIT_AUTH_NO = dEBIT_AUTH_NO;
	}
	/**
	 * @return the cREDIT_AUTH_CODE
	 */
	public String getCREDIT_AUTH_CODE() {
		return CREDIT_AUTH_CODE;
	}
	/**
	 * @param cREDIT_AUTH_CODE the cREDIT_AUTH_CODE to set
	 */
	public void setCREDIT_AUTH_CODE(String cREDIT_AUTH_CODE) {
		CREDIT_AUTH_CODE = cREDIT_AUTH_CODE;
	}
	/**
	 * @return the cREDIT_AUTH_NO
	 */
	public String getCREDIT_AUTH_NO() {
		return CREDIT_AUTH_NO;
	}
	/**
	 * @param cREDIT_AUTH_NO the cREDIT_AUTH_NO to set
	 */
	public void setCREDIT_AUTH_NO(String cREDIT_AUTH_NO) {
		CREDIT_AUTH_NO = cREDIT_AUTH_NO;
	}
	public FPXResSellerList getfPXResSellerList() {
		return fPXResSellerList;
	}
	
	@XmlElement(name = "SELLER")
	public void setfPXResSellerList(FPXResSellerList fPXResSellerList) {
		this.fPXResSellerList = fPXResSellerList;
	}
	
	
}
