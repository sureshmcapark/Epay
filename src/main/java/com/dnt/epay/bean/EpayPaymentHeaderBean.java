package com.dnt.epay.bean;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.dnt.epay.entities.EpayPaymentHeader;

@Stateless
public class EpayPaymentHeaderBean {

	EntityManager em = Persistence.createEntityManagerFactory("JpaEpayment")
			.createEntityManager();

	public void insertHeader(EpayPaymentHeader paymentHeader) {
		System.out.println("In Epay Payment Header Bean. Before persisting : ");
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(paymentHeader);
        tx.commit();
		System.out.println("After persist statement App Name : ");

		
	}
}
