package com.iwonder.tea.sys.entity;

import java.io.Serializable;
import java.util.Date;

public class Staff implements Serializable{
	/**
	 * 员工类
	 * 
	 * @author wilche
	 */
	private static final long serialVersionUID = 1L;
	private String staffId;
	private String staffCode;
	private String staffName;
	private String staffGender;
	private Date staffBirthday;
	private String staffMoblie;
	private String staffAddress;
	private String staffStatus;
	private String pwdLogin;
	private String staffInfo;
	public String getStaffId() {
		return staffId;
	}
	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}
	public String getStaffCode() {
		return staffCode;
	}
	public void setStaffCode(String staffCode) {
		this.staffCode = staffCode;
	}
	public String getStaffName() {
		return staffName;
	}
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}
	public String getStaffGender() {
		return staffGender;
	}
	public void setStaffGender(String staffGender) {
		this.staffGender = staffGender;
	}
	public Date getStaffBirthday() {
		return staffBirthday;
	}
	public void setStaffBirthday(Date staffBirthday) {
		this.staffBirthday = staffBirthday;
	}
	public String getStaffMoblie() {
		return staffMoblie;
	}
	public void setStaffMoblie(String staffMoblie) {
		this.staffMoblie = staffMoblie;
	}
	public String getStaffAddress() {
		return staffAddress;
	}
	public void setStaffAddress(String staffAddress) {
		this.staffAddress = staffAddress;
	}
	public String getStaffStatus() {
		return staffStatus;
	}
	public void setStaffStatus(String staffStatus) {
		this.staffStatus = staffStatus;
	}
	public String getPwdLogin() {
		return pwdLogin;
	}
	public void setPwdLogin(String pwdLogin) {
		this.pwdLogin = pwdLogin;
	}
	public String getStaffInfo() {
		return staffInfo;
	}
	public void setStaffInfo(String staffInfo) {
		this.staffInfo = staffInfo;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Staff [staffId=");
		builder.append(staffId);
		builder.append(", staffCode=");
		builder.append(staffCode);
		builder.append(", staffName=");
		builder.append(staffName);
		builder.append(", staffGender=");
		builder.append(staffGender);
		builder.append(", staffBirthday=");
		builder.append(staffBirthday);
		builder.append(", staffMoblie=");
		builder.append(staffMoblie);
		builder.append(", staffAddress=");
		builder.append(staffAddress);
		builder.append(", staffStatus=");
		builder.append(staffStatus);
		builder.append(", pwdLogin=");
		builder.append(pwdLogin);
		builder.append(", staffInfo=");
		builder.append(staffInfo);
		builder.append("]");
		return builder.toString();
	}
	
}
