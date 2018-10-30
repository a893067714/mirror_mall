package com.iwonder.tea.usr.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@SuppressWarnings("unused")
public class UserInfo implements Serializable{
	/*
	 * student_id student_name
	 * 
	 * @auther wilche
	 */
	private static final long serialVersionUID = 1L;
	private String userId;
	private String userCode;
	private String name;
	private String nickName;
	private String gender;
	private Date birthday;
	private String idCard;
	private String mobile;
	private String email;
	private String pwdLogin;
	private BigDecimal balance;
	

	public String getUserId() {
		return userId;
	}

	public void setUserId(String studentId) {
		this.userId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String studentName) {
		this.name = studentName;
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

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
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

	public String getPwdLogin() {
		return pwdLogin;
	}

	public void setPwdLogin(String pwdLogin) {
		this.pwdLogin = pwdLogin;
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

	@Override
	public String toString() {
		return "UserInfo [userId=" + userId + ", userCode=" + userCode + ", name=" + name + ", nickName=" + nickName
				+ ", gender=" + gender + ", birthday=" + birthday + ", idCard=" + idCard + ", mobile=" + mobile
				+ ", email=" + email + ", pwdLogin=" + pwdLogin + ", balance=" + balance + "]";
	}

	public String getUserCode() {
		return userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	

}
