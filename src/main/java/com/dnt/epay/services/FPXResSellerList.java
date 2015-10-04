package com.dnt.epay.services;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(namespace = "com.jaxb.FPXResOrderList")
public class FPXResSellerList {

	private String SELLER_ORDER_NO;
	private String SELLER_ID;
	
	/**
	 * @return the sELLER_ORDER_NO
	 */
	public String getSELLER_ORDER_NO() {
		return SELLER_ORDER_NO;
	}
	/**
	 * @param sELLER_ORDER_NO the sELLER_ORDER_NO to set
	 */
	public void setSELLER_ORDER_NO(String sELLER_ORDER_NO) {
		SELLER_ORDER_NO = sELLER_ORDER_NO;
	}
	/**
	 * @return the sELLER_ID
	 */
	public String getSELLER_ID() {
		return SELLER_ID;
	}
	/**
	 * @param sELLER_ID the sELLER_ID to set
	 */
	public void setSELLER_ID(String sELLER_ID) {
		SELLER_ID = sELLER_ID;
	}
	
}
