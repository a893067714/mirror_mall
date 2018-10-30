package com.iwonder.tea.sys.view;

import java.io.Serializable;

public class MenuConditionView implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String moduleId;
	private String menuName;
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
