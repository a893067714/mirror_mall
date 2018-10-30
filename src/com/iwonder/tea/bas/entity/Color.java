package com.iwonder.tea.bas.entity;

import java.io.Serializable;

/**
 * 实体类：颜色
 * 
 * @author Tearell
 *
 */
public class Color implements Serializable {
	/**	 */
	private static final long serialVersionUID = 1L;

	/** 颜色ID */
	private String colorId;

	/** 颜色值 */
	private String colorValue;

	/**
	 * 获取：颜色id
	 * 
	 * @return the colorId
	 */
	public String getColorId() {
		return colorId;
	}

	/**
	 * 设置：颜色id
	 * 
	 * @param colorId
	 *            the colorId to set
	 */
	public void setColorId(String colorId) {
		this.colorId = colorId;
	}

	/**
	 * 获取：颜色值
	 * 
	 * @return the colorValue
	 */
	public String getColorValue() {
		return colorValue;
	}

	/**
	 * 设置：颜色值
	 * 
	 * @param colorValue
	 *            the colorValue to set
	 */
	public void setColorValue(String colorValue) {
		this.colorValue = colorValue;
	}

	@Override
	public String toString() {
		return "Color [colorId=" + colorId + ", colorValue=" + colorValue + "]";
	}

}
