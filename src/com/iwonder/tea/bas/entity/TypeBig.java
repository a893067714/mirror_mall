package com.iwonder.tea.bas.entity;

import java.io.Serializable;

/**
 * 实体类：大分类
 * 
 * @author Tearell
 *
 */
public class TypeBig implements Serializable {
	/**	 */
	private static final long serialVersionUID = 1L;

	/** 大分类id */
	private String typeBigId;

	/** 大分类名称 */
	private String typeBigName;

	/**
	 * 获取：大分类id
	 * 
	 * @return the type_big_id
	 */
	public String getTypeBigId() {
		return typeBigId;
	}

	/**
	 * 设置：大分类id
	 * 
	 * @param type_big_id
	 *            the type_big_id to set
	 */
	public void setTypeBigId(String typeBigId) {
		this.typeBigId = typeBigId;
	}

	/**
	 * 获取：大分类名称
	 * 
	 * @return the type_big_name
	 */
	public String getTypeBigName() {
		return typeBigName;
	}

	/**
	 * 设置：大分类名称
	 * 
	 * @param type_big_name
	 *            the type_big_name to set
	 */
	public void setTypeBigName(String typeBigName) {
		this.typeBigName = typeBigName;
	}

	@Override
	public String toString() {
		return "TypeBig [typeBigId=" + typeBigId + ", typeBigName=" + typeBigName + "]";
	}

}
