package com.dnt.epay.bean;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.dnt.epay.entities.EpayFpxExchange;

@Stateless
public class EpayFpxExchangeBean {

	EntityManager em = Persistence.createEntityManagerFactory("JpaEpayment")
			.createEntityManager();

	public EpayFpxExchange getExchange() {

		Query query = em.createNamedQuery("EpayFpxExchange.findAll");
		EpayFpxExchange fpxExchange = (EpayFpxExchange) query.getSingleResult();
		return fpxExchange;
	}
}
