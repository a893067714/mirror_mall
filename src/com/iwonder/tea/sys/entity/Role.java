package com.iwonder.tea.sys.entity;

import java.io.Serializable;

public class Role implements Serializable{

	/**
	 * 角色类
	 * 
	 * @author wilche
	 */
	private static final long serialVersionUID = 1L;
	private String roleId;
	private String roleName;
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Role [roleId=");
		builder.append(roleId);
		builder.append(", roleName=");
		builder.append(roleName);
		builder.append("]");
		return builder.toString();
	}
	public String getRoleId() {
		return roleId;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
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
	
}
