package com.dnt.epay.services;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(namespace = "com.jaxb.FPXResOrderList")
public class FPXResBuyerList {

	private String BUYER_BANK;
	private String BUYER_BANK_BRANCH;
	private String BUYER_ACC_NO;
	private String BUYER_NAME;
	private String BUYER_ID;
	private String MAKER_NAME;
	private String BUYER_IBAN;
	/**
	 * @return the bUYER_BANK
	 */
	public String getBUYER_BANK() {
		return BUYER_BANK;
	}
	/**
	 * @param bUYER_BANK the bUYER_BANK to set
	 */
	public void setBUYER_BANK(String bUYER_BANK) {
		BUYER_BANK = bUYER_BANK;
	}
	/**
	 * @return the bUYER_BANK_BRANCH
	 */
	public String getBUYER_BANK_BRANCH() {
		return BUYER_BANK_BRANCH;
	}
	/**
	 * @param bUYER_BANK_BRANCH the bUYER_BANK_BRANCH to set
	 */
	public void setBUYER_BANK_BRANCH(String bUYER_BANK_BRANCH) {
		BUYER_BANK_BRANCH = bUYER_BANK_BRANCH;
	}
	/**
	 * @return the bUYER_ACC_NO
	 */
	public String getBUYER_ACC_NO() {
		return BUYER_ACC_NO;
	}
	/**
	 * @param bUYER_ACC_NO the bUYER_ACC_NO to set
	 */
	public void setBUYER_ACC_NO(String bUYER_ACC_NO) {
		BUYER_ACC_NO = bUYER_ACC_NO;
	}
	/**
	 * @return the bUYER_NAME
	 */
	public String getBUYER_NAME() {
		return BUYER_NAME;
	}
	/**
	 * @param bUYER_NAME the bUYER_NAME to set
	 */
	public void setBUYER_NAME(String bUYER_NAME) {
		BUYER_NAME = bUYER_NAME;
	}
	/**
	 * @return the bUYER_ID
	 */
	public String getBUYER_ID() {
		return BUYER_ID;
	}
	/**
	 * @param bUYER_ID the bUYER_ID to set
	 */
	public void setBUYER_ID(String bUYER_ID) {
		BUYER_ID = bUYER_ID;
	}
	/**
	 * @return the mAKER_NAME
	 */
	public String getMAKER_NAME() {
		return MAKER_NAME;
	}
	/**
	 * @param mAKER_NAME the mAKER_NAME to set
	 */
	public void setMAKER_NAME(String mAKER_NAME) {
		MAKER_NAME = mAKER_NAME;
	}
	/**
	 * @return the bUYER_IBAN
	 */
	public String getBUYER_IBAN() {
		return BUYER_IBAN;
	}
	/**
	 * @param bUYER_IBAN the bUYER_IBAN to set
	 */
	public void setBUYER_IBAN(String bUYER_IBAN) {
		BUYER_IBAN = bUYER_IBAN;
	}
	
	
	
}
