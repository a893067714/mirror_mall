package com.iwonder.tea.ord.view;

import com.iwonder.tea.ord.entity.OrderSKU;

public class OrderSKUQueryView extends OrderSKU {
	private String orderCode;
	private String productSKUCode;
	private String sendStatLabel;
	private String logDoneLabel;
	private String signStatLabel;
	private String evalStatLabel;
	private String orderSKUPic;

	public String getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public String getProductSKUCode() {
		return productSKUCode;
	}

	public void setProductSKUCode(String productSKUCode) {
		this.productSKUCode = productSKUCode;
	}

	public String getSendStatLabel() {
		return sendStatLabel;
	}

	public void setSendStatLabel(String sendStatLabel) {
		this.sendStatLabel = sendStatLabel;
	}

	public String getLogDoneLabel() {
		return logDoneLabel;
	}

	public void setLogDoneLabel(String logDoneLabel) {
		this.logDoneLabel = logDoneLabel;
	}

	public String getSignStatLabel() {
		return signStatLabel;
	}

	public void setSignStatLabel(String signStatLabel) {
		this.signStatLabel = signStatLabel;
	}

	public String getEvalStatLabel() {
		return evalStatLabel;
	}

	public void setEvalStatLabel(String evalStatLabel) {
		this.evalStatLabel = evalStatLabel;
	}

	public String getOrderSKUPic() {
		return orderSKUPic;
	}

	public void setOrderSKUPic(String orderSKUPic) {
		this.orderSKUPic = orderSKUPic;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("OrderSKUQueryView [orderCode=");
		builder.append(orderCode);
		builder.append(", productSKUCode=");
		builder.append(productSKUCode);
		builder.append(", sendStatLabel=");
		builder.append(sendStatLabel);
		builder.append(", logDoneLabel=");
		builder.append(logDoneLabel);
		builder.append(", signStatLabel=");
		builder.append(signStatLabel);
		builder.append(", evalStatLabel=");
		builder.append(evalStatLabel);
		builder.append(", orderSKUPic=");
		builder.append(orderSKUPic);
		builder.append("]");
		return builder.toString();
	}

}
