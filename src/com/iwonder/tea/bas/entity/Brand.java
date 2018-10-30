package com.iwonder.tea.bas.entity;

import java.io.Serializable;

/**
 * 实体类：品牌
 * 
 * @author Tearell
 *
 */
public class Brand implements Serializable {
	/** */
	private static final long serialVersionUID = 1L;

	/** 品牌id */
	private String brandId;

	/** 品牌名称 */
	private String name;
	
	/** 品牌图片*/
	private String brandPic;

	/**
	 * 获取：品牌id
	 * 
	 * @return the brandId
	 */
	public String getBrandId() {
		return brandId;
	}

	/**
	 * 设置：品牌id
	 * 
	 * @param brandId
	 *            the brandId to set
	 */
	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}

	/**
	 * 获取：品牌名称
	 * 
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * 设置：品牌名称
	 * 
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	public String getBrandPic() {
		return brandPic;
	}

	public void setBrandPic(String brandPic) {
		this.brandPic = brandPic;
	}

	@Override
	public String toString() {
		return "Brand [brandId=" + brandId + ", name=" + name + ", brandPic=" + brandPic + "]";
	}

}
