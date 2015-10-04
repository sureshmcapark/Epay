package com.dnt.epay.bean;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import com.dnt.epay.entities.EpayFpxSeller;

@Stateless
public class EpayFpxSellerBean {

	EntityManager em = Persistence.createEntityManagerFactory("JpaEpayment")
			.createEntityManager();

	public EpayFpxSeller getFpxSeller(String feCode) {

		EpayFpxSeller fpxSeller = em.find(EpayFpxSeller.class, feCode);
		return fpxSeller;

	}
}
