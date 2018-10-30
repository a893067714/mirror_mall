package com.iwonder.tea.sys.entity;

import java.io.Serializable;

public class RoleMenu implements Serializable{

	/**
	 * 角色菜单类
	 * 
	 * @author wilche
	 */
	private static final long serialVersionUID = 1L;
	private String roleMenuId;
	private String roleId;
	private String menuId;
	public String getRoleMenuId() {
		return roleMenuId;
	}
	public void setRoleMenuId(String roleMenuId) {
		this.roleMenuId = roleMenuId;
	}
	public String getRoleId() {
		return roleId;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	public String getMenuId() {
		return menuId;
	}
	public void setMenuId(String menuId) {
		this.menuId = menuId;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("RoleMenu [roleMenuId=");
		builder.append(roleMenuId);
		builder.append(", roleId=");
		builder.append(roleId);
		builder.append(", menuId=");
		builder.append(menuId);
		builder.append("]");
		return builder.toString();
	}

	
}
