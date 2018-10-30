package com.iwonder.tea.usr.view;

import java.io.Serializable;

public class AddressInfoConditionView implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String userId;
	private String addressCont;
	private String addressDefault;
	private String receiverName;
	private String receiverPhone;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getAddressCont() {
		return addressCont;
	}
	public void setAddressCont(String addressCont) {
		this.addressCont = addressCont;
	}
	public String getAddressDefault() {
		return addressDefault;
	}
	public void setAddressDefault(String addressDefault) {
		this.addressDefault = addressDefault;
	}
	public String getReceiverName() {
		return receiverName;
	}
	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}
	public String getReceiverPhone() {
		return receiverPhone;
	}
	public void setReceiverPhone(String receiverPhone) {
		this.receiverPhone = receiverPhone;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AddressInfoConditionView [userId=");
		builder.append(userId);
		builder.append(", addressCont=");
		builder.append(addressCont);
		builder.append(", addressDefault=");
		builder.append(addressDefault);
		builder.append(", receiverName=");
		builder.append(receiverName);
		builder.append(", receiverPhone=");
		builder.append(receiverPhone);
		builder.append("]");
		return builder.toString();
	}
	
}
