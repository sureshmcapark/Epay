package com.dnt.epay.bean;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.dnt.epay.entities.EpayEdiFile;

@Stateless
public class EpayEdiFileBean {

	EntityManager em = Persistence.createEntityManagerFactory("JpaEpayment")
			.createEntityManager();


	public void insert(EpayEdiFile ediFile) {
		
		System.out.println("In Epay Edi File Bean. Before persisting : ");
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(ediFile);
        tx.commit();
		System.out.println("After persist statement App Name : "); // + ediFile.getEefAppName());
	}

}
