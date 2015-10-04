package com.dnt.ftp;

public class MessageHeadHelper {

	private String applicationRef;
	private String interchangeId;
	private String ediVersionCode;
	private String msgSenderId;
	private String msgRecipientId;
	private String msgSeqNo;
	private String msgDatePreparation;
	private String msgTime;	
	public String getApplicationRef() {
		return applicationRef;
	}
	public void setApplicationRef(String applicationRef) {
		this.applicationRef = applicationRef;
	}
	public String getInterchangeId() {
		return interchangeId;
	}
	public void setInterchangeId(String interchangeId) {
		this.interchangeId = interchangeId;
	}
	public String getEdiVersionCode() {
		return ediVersionCode;
	}
	public void setEdiVersionCode(String ediVersionCode) {
		this.ediVersionCode = ediVersionCode;
	}
	public String getMsgSenderId() {
		return msgSenderId;
	}
	public void setMsgSenderId(String msgSenderId) {
		this.msgSenderId = msgSenderId;
	}
	public String getMsgRecipientId() {
		return msgRecipientId;
	}
	public void setMsgRecipientId(String msgRecipientId) {
		this.msgRecipientId = msgRecipientId;
	}
	public String getMsgSeqNo() {
		return msgSeqNo;
	}
	public void setMsgSeqNo(String msgSeqNo) {
		this.msgSeqNo = msgSeqNo;
	}
	public String getMsgDatePreparation() {
		return msgDatePreparation;
	}
	public void setMsgDatePreparation(String msgDatePreparation) {
		this.msgDatePreparation = msgDatePreparation;
	}
	public String getMsgTime() {
		return msgTime;
	}
	public void setMsgTime(String msgTime) {
		this.msgTime = msgTime;
	}
	
}
