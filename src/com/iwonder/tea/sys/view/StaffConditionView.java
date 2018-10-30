package com.iwonder.tea.sys.view;

import java.io.Serializable;
import java.util.Date;

public class StaffConditionView implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String staffName;
	private String staffGender;
	private Date staffBirthday;
	private String staffStatus;
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
	public String getStaffStatus() {
		return staffStatus;
	}
	public void setStaffStatus(String staffStatus) {
		this.staffStatus = staffStatus;
	}
	
}
