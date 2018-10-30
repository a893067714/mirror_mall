package com.iwonder.tea.sys.view;

import java.io.Serializable;

import com.iwonder.tea.sys.entity.RoleMenu;

public class RoleMenuQueryView extends RoleMenu implements Serializable{

	private String roleName;
	private String menuName;
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	
}
