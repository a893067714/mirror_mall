package com.iwonder.tea.sys.entity;

import java.io.Serializable;

public class StaffRole implements Serializable{
	
	/**
	 * 员工角色类
	 * 
	 * @author wilche
	 */
	private static final long serialVersionUID = 1L;
	private String staffRoleId;
	private String staffId;
	private String roleId;
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("StaffRole [staffRoleId=");
		builder.append(staffRoleId);
		builder.append(", staffId=");
		builder.append(staffId);
		builder.append(", roleId=");
		builder.append(roleId);
		builder.append("]");
		return builder.toString();
	}
	public String getStaffRoleId() {
		return staffRoleId;
	}
	public void setStaffRoleId(String staffRoleId) {
		this.staffRoleId = staffRoleId;
	}
	public String getStaffId() {
		return staffId;
	}
	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}
	public String getRoleId() {
		return roleId;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
