package com.iwonder.tea.sys.view;

import java.io.Serializable;

import com.iwonder.tea.sys.entity.Menu;

public class MenuQueryView extends Menu implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String moduleName;
	public String getModuleName() {
		return moduleName;
	}
	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
