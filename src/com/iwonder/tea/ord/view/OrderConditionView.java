package com.iwonder.tea.ord.view;

import java.math.BigDecimal;
import java.util.Date;

public class OrderConditionView {

	private String userId;
	private String orderCode;
	private String addressId;
	private Date createDate;
	private BigDecimal totalPrice;
	private String  payStat;
	private Date payDate;
	public String getOrderCode() {
		return orderCode;
	}
	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getAddressId() {
		return addressId;
	}
	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public BigDecimal getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(BigDecimal totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getPayStat() {
		return payStat;
	}
	public void setPayStat(String payStat) {
		this.payStat = payStat;
	}
	public Date getPayDate() {
		return payDate;
	}
	public void setPayDate(Date payDate) {
		this.payDate = payDate;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("OrderConditionView [orderCode=");
		builder.append(orderCode);
		builder.append(", userId=");
		builder.append(userId);
		builder.append(", addressId=");
		builder.append(addressId);
		builder.append(", createDate=");
		builder.append(createDate);
		builder.append(", totalPrice=");
		builder.append(totalPrice);
		builder.append(", payStat=");
		builder.append(payStat);
		builder.append(", payDate=");
		builder.append(payDate);
		builder.append("]");
		return builder.toString();
	}

}
