package com.iwonder.tea.usr.entity;

import java.util.Date;

public class Evaluate {
	/**
	 * 评价类
	 * 
	 * @author wilche
	 */
	private static final long serialVersionUID = 1L;
	private String evaluateId;
	private String userId;
	private String productId;
	private String orderDtlId;//订单详情id
//	private String logStatus;
	private String serviceStatus;
	private String descriptionStatus;
	private String evalContent;
	private String imgUrl;
	private String videoUrl;
	private Date evaluateTime;
	public String getEvaluateId() {
		return evaluateId;
	}
	public void setEvaluateId(String evaluateId) {
		this.evaluateId = evaluateId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getOrderDtlId() {
		return orderDtlId;
	}
	public void setOrderDtlId(String orderDtlId) {
		this.orderDtlId = orderDtlId;
	}
//	public String getLogStatus() {
//		return logStatus;
//	}
//	public void setLogStatus(String logStatus) {
//		this.logStatus = logStatus;
//	}
	public String getServiceStatus() {
		return serviceStatus;
	}
	public void setServiceStatus(String serviceStatus) {
		this.serviceStatus = serviceStatus;
	}
	public String getDescriptionStatus() {
		return descriptionStatus;
	}
	public void setDescriptionStatus(String descriptionStatus) {
		this.descriptionStatus = descriptionStatus;
	}
	public String getEvalContent() {
		return evalContent;
	}
	public void setEvalContent(String evalContent) {
		this.evalContent = evalContent;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	public String getVideoUrl() {
		return videoUrl;
	}
	public void setVideoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Date getEvaluateTime() {
		return evaluateTime;
	}
	public void setEvaluateTime(Date evaluateTime) {
		this.evaluateTime = evaluateTime;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Evaluate [evaluateId=");
		builder.append(evaluateId);
		builder.append(", userId=");
		builder.append(userId);
		builder.append(", productId=");
		builder.append(productId);
		builder.append(", orderDtlId=");
		builder.append(orderDtlId);
		builder.append(", serviceStatus=");
		builder.append(serviceStatus);
		builder.append(", descriptionStatus=");
		builder.append(descriptionStatus);
		builder.append(", evalContent=");
		builder.append(evalContent);
		builder.append(", imgUrl=");
		builder.append(imgUrl);
		builder.append(", videoUrl=");
		builder.append(videoUrl);
		builder.append(", evaluateTime=");
		builder.append(evaluateTime);
		builder.append("]");
		return builder.toString();
	}
	
	
}
