package com.dnt.epay.services;

import java.io.StringReader;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.dnt.epay.bean.EpayFpxTransactionBean;
import com.dnt.epay.services.FPX_SELLER_RES;

//http://localhost:8080/epayment_master/rest/message/hello%20world
@Path("/message")
public class FPXDirectResponseService {

	@POST
	@Produces(MediaType.APPLICATION_XHTML_XML)
	public Response getFpxDirectResponse(String fpxResponseMsg) {
		FPX_SELLER_RES fPX_SELLER_RES=null;
		String fpxXmlMessage = fpxResponseMsg;
		System.out.println("XML Message:"+fpxXmlMessage);
		
		/*
         * Java Object constructed from FPX response XML Message
         */
		// create JAXB context and initializing Marshaller
		JAXBContext jaxbContext;
		try {
			jaxbContext = JAXBContext.newInstance(FPX_SELLER_RES.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			StringReader xmlReader = new StringReader(fpxXmlMessage);
			// this will create Java object - FPX_SELLER_RES from the XML Message string
			fPX_SELLER_RES = (FPX_SELLER_RES)jaxbUnmarshaller.unmarshal(xmlReader);
			System.out.println("FPX_Trans ID:"+fPX_SELLER_RES.getFPX_TXN_ID());
			System.out.println("Seller Order No:"+fPX_SELLER_RES.getfPXResOrderList().getfPXResSellerList().getSELLER_ORDER_NO());
			EpayFpxTransactionBean epayFpxTransactionBean = new EpayFpxTransactionBean();
			epayFpxTransactionBean.updateFpxTransaction(fPX_SELLER_RES);
		} catch (JAXBException e) {
			System.out.println("Entering into JAXB Exception catch block:"+e);
			e.printStackTrace();
		}
		return Response.status(200).entity(fpxXmlMessage).build();
	}
}