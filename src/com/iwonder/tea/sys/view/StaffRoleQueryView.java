package com.iwonder.tea.sys.view;

import java.io.Serializable;

import com.iwonder.tea.sys.entity.StaffRole;

public class StaffRoleQueryView extends StaffRole implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String staffName;
	private String roleName;

	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("StaffRoleQueryView [staffName=");
		builder.append(staffName);
		builder.append(", roleName=");
		builder.append(roleName);
		builder.append("]");
		return builder.toString();
	}

}
