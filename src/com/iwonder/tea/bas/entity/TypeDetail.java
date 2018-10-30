package com.iwonder.tea.bas.entity;

import java.io.Serializable;

/**
 * 实体类：详细分类（小分类）
 * 
 * @author Tearell
 *
 */
public class TypeDetail implements Serializable{
	/**	 */
	private static final long serialVersionUID = 1L;

	/** 小分类id */
	private String typeDtlId;

	/** 大分类id */
	private String typeBigId;

	/** 小分类名称 */
	private String typeDtlName;

	/**
	 * 获取：小分类id
	 * 
	 * @return the typeDtlId
	 */
	public String getTypeDtlId() {
		return typeDtlId;
	}

	/**
	 * 设置：小分类id
	 * 
	 * @param typeDtlId
	 *            the typeDtlId to set
	 */
	public void setTypeDtlId(String typeDtlId) {
		this.typeDtlId = typeDtlId;
	}

	/**
	 * 获取：大分类id
	 * 
	 * @return the typeBigId
	 */
	public String getTypeBigId() {
		return typeBigId;
	}

	/**
	 * 设置：大分类id
	 * 
	 * @param typeBigId
	 *            the typeBigId to set
	 */
	public void setTypeBigId(String typeBigId) {
		this.typeBigId = typeBigId;
	}

	/**
	 * 获取：小分类名称
	 * 
	 * @return the typeDtlName
	 */
	public String getTypeDtlName() {
		return typeDtlName;
	}

	/**
	 * 设置：小分类名称
	 * 
	 * @param typeDtlName
	 *            the typeDtlName to set
	 */
	public void setTypeDtlName(String typeDtlName) {
		this.typeDtlName = typeDtlName;
	}

	@Override
	public String toString() {
		return "TypeDetail [typeDtlId=" + typeDtlId + ", typeBigId=" + typeBigId + ", typeDtlName=" + typeDtlName + "]";
	}


}
