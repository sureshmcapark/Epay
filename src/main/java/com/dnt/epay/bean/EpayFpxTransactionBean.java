package com.dnt.epay.bean;

import java.util.Date;
import java.util.UUID;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.dnt.epay.entities.EpayFpxTransaction;
import com.dnt.epay.fpx.FpxRequestMessage;
import com.dnt.epay.services.FPX_SELLER_RES;

@Stateless
public class EpayFpxTransactionBean {

	// @PersistenceUnit(name = "JpaEpayment")
	// EntityManagerFactory emf;
	EntityManager em = Persistence.createEntityManagerFactory("JpaEpayment")
			.createEntityManager();

	public void saveFpxTransaction(FpxRequestMessage requestMessage) {

		// EntityManager em = emf.createEntityManager();
		EpayFpxTransaction epayFpxTransaction = new EpayFpxTransaction();
		UUID genUUID = UUID.randomUUID();
		epayFpxTransaction.setEftId(genUUID.toString());
		epayFpxTransaction.setEftMsgType(requestMessage.getMessageType());
		epayFpxTransaction.setEftMsgToken(requestMessage.getMessageToken());
		epayFpxTransaction.setEftSellerExcDesc(requestMessage
				.getSellerExcDesc());
		epayFpxTransaction.setEftSellerExcId(requestMessage.getSellerExcId());
//		epayFpxTransaction.setEftMsgNo(requestMessage.getMessageOrderNo());
		epayFpxTransaction.setEftNoOfOrders(requestMessage
				.getMessageOrderCount());
		epayFpxTransaction.setEftSellerTxnTime(requestMessage
				.getSellerTxnTime());
		epayFpxTransaction.setEftSellerOrdNo(requestMessage.getSellerOrderNo());
		epayFpxTransaction.setEftSellerId(requestMessage.getSellerId());
		epayFpxTransaction.setEftSellerFpxBankCode(requestMessage
				.getSellerFPXBank());
		epayFpxTransaction.setEftBuyerBank(requestMessage.getBuyerBank());
		epayFpxTransaction.setEftBuyerBnkBranch(requestMessage
				.getBuyerBankBranch());
		epayFpxTransaction.setEftBuyerAccNo(requestMessage.getBuyerAccNo());
		epayFpxTransaction.setEftBuyerName(requestMessage.getBuyerName());
		epayFpxTransaction.setEftBuyerId(requestMessage.getBuyerId());
		epayFpxTransaction.setEftMakerName(requestMessage.getMakerName());
		epayFpxTransaction.setEftBuyerIban(requestMessage.getBuyerIban());
		epayFpxTransaction.setEftChgType(requestMessage.getChargeType());
		epayFpxTransaction.setEftMsgCrcy(requestMessage.getMessageCurrency());
		epayFpxTransaction.setEftMsgAmt(requestMessage.getMessageAmount());
		epayFpxTransaction.setEftEphTxnid(requestMessage.getMessageEphId());
		epayFpxTransaction.setEftEpayService(requestMessage
				.getMessageEpayService());
		epayFpxTransaction.setEftCreateDate(new Date());
		epayFpxTransaction.setEftCreateUserId("epay");
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(epayFpxTransaction);
		tx.commit();
		em.close();

	}
	
	public void updateFpxTransaction(FPX_SELLER_RES fpxSellerRes){
		String sellerOrderNo = fpxSellerRes.getfPXResOrderList().getfPXResSellerList().getSELLER_ORDER_NO();
		EpayFpxTransaction epayFpxTransaction = new EpayFpxTransaction();
		Query query = em.createNamedQuery("EpayFpxTransaction.findBySellerOrderNo", EpayFpxTransaction.class);
		query.setParameter("sellerOrderNo", sellerOrderNo);
		epayFpxTransaction = (EpayFpxTransaction) query.getSingleResult();
		
		epayFpxTransaction.setEftFpxTxnId(fpxSellerRes.getFPX_TXN_ID());
		
		/*EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.merge(epayFpxTransaction);
		tx.commit();
		em.close();*/
		
	}

}
