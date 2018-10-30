package com.iwonder.tea.usr.view;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class UserInfoConditionView implements Serializable{

	private static final long serialVersionUID = 1L;
	private String userCode;
	private String name;
	private String nickName;
	private String gender;
	private String idCard;
	private String mobile;
	private String email;
	private BigDecimal balance;
	private Date timePrevious;
	private Date timeLater;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getIdCard() {
		return idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public BigDecimal getBalance() {
		return balance;
	}
	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Date getTimePrevious() {
		return timePrevious;
	}
	public void setTimePrevious(Date timePrevious) {
		this.timePrevious = timePrevious;
	}
	public Date getTimeLater() {
		return timeLater;
	}
	public void setTimeLater(Date timeLater) {
		this.timeLater = timeLater;
	}
	public String getUserCode() {
		return userCode;
	}
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	
}
