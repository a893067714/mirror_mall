package com.iwonder.tea.sys.view;

import java.io.Serializable;

public class RoleMenuConditionView implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String roleId;
	private String menuId;
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
	
}
