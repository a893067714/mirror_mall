package com.iwonder.tea.sys.entity;

import java.io.Serializable;

public class Menu implements Serializable{
	/**
	 * 菜单类
	 * 
	 * @author wilche
	 */
	private static final long serialVersionUID = 1L;
	private String menuId;
	private String moduleId;
	private String menuName;
	private String menuUrl;
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Menu [menuId=");
		builder.append(menuId);
		builder.append(", moduleId=");
		builder.append(moduleId);
		builder.append(", menuName=");
		builder.append(menuName);
		builder.append(", menuUrl=");
		builder.append(menuUrl);
		builder.append("]");
		return builder.toString();
	}
	public String getMenuId() {
		return menuId;
	}
	public void setMenuId(String menuId) {
		this.menuId = menuId;
	}
	public String getModuleId() {
		return moduleId;
	}
	public void setModuleId(String moduleId) {
		this.moduleId = moduleId;
	}
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	public String getMenuUrl() {
		return menuUrl;
	}
	public void setMenuUrl(String menuUrl) {
		this.menuUrl = menuUrl;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
