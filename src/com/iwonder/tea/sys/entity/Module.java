package com.iwonder.tea.sys.entity;

import java.io.Serializable;

public class Module implements Serializable{
	/**
	 * 模块类
	 * 
	 * @author wilche
	 */
	private static final long serialVersionUID = 1L;
	private String moduleId;
	private String moduleName;
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Module [moduleId=");
		builder.append(moduleId);
		builder.append(", moduleName=");
		builder.append(moduleName);
		builder.append("]");
		return builder.toString();
	}
	public String getModuleId() {
		return moduleId;
	}
	public void setModuleId(String moduleId) {
		this.moduleId = moduleId;
	}
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
