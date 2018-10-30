package com.iwonder.tea.bas.entity;

import java.io.Serializable;

/**
 * 实体类：尺码
 * 
 * @author Tearell
 *
 */
public class Size implements Serializable {
	/**	 */
	private static final long serialVersionUID = 1L;

	/** 尺码ID */
	private String sizeId;

	/** 尺码值 */
	private String sizeValue;

	/**
	 * 获取：尺码id
	 * 
	 * @return the size_id
	 */
	public String getSizeId() {
		return sizeId;
	}

	/**
	 * 设置：尺码id
	 * 
	 * @param sizeId
	 *            the size_id to set
	 */
	public void setSizeId(String sizeId) {
		this.sizeId = sizeId;
	}

	/**
	 * 获取：尺码值
	 * 
	 * @return the size_value
	 */
	public String getSizeValue() {
		return sizeValue;
	}

	/**
	 * 设置：尺码值
	 * 
	 * @param sizeValue
	 *            the size_value to set
	 */
	public void setSizeValue(String sizeValue) {
		this.sizeValue = sizeValue;
	}

	@Override
	public String toString() {
		return "Size [sizeId=" + sizeId + ", sizeValue=" + sizeValue + "]";
	}

}
