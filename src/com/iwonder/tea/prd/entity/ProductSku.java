package com.iwonder.tea.prd.entity;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 实体类：商品sku
 * 
 * @author Tearell
 *
 */
public class ProductSku implements Serializable {
	private static final long serialVersionUID = 1L;

	/** 产品skuId */
	private String productSkuId;

	/** 产品编号 */
	private String skuCode;
	
	/** 产品id */
	private String productId;
	
	/** 颜色id */
	private String colorId;

	/** 尺码id */
	private String sizeId;

	/** 原价 */
	private BigDecimal priceOrigin;

	/** 现价 */
	private BigDecimal priceCurrent;

	/** 库存 */
	private Integer stock;

	/** 商品大图 */
	private String picBig;

	/** 商品中图 */
	private String picMid;

	/** 商品小图 */
	private String picSmall;

	/** 产地 */
	private String origin;

	public String getSkuCode() {
		return skuCode;
	}

	public void setSkuCode(String skuCode) {
		this.skuCode = skuCode;
	}

	/**
	 * 获取：产品skuID
	 * 
	 * @return the productSkuId
	 */
	public String getProductSkuId() {
		return productSkuId;
	}

	/**
	 * 设置：产品skuID
	 * 
	 * @param productSkuId
	 *            the productSkuId to set
	 */
	public void setProductSkuId(String productSkuId) {
		this.productSkuId = productSkuId;
	}

	/**
	 * 获取：产品id
	 * 
	 * @return the productId
	 */
	public String getProductId() {
		return productId;
	}

	/**
	 * 设置：产品id
	 * 
	 * @param productId
	 *            the productId to set
	 */
	public void setProductId(String productId) {
		this.productId = productId;
	}

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
	 * 获取：尺码id
	 * 
	 * @return the sizeId
	 */
	public String getSizeId() {
		return sizeId;
	}

	/**
	 * 设置：尺码id
	 * 
	 * @param sizeId
	 *            the sizeId to set
	 */
	public void setSizeId(String sizeId) {
		this.sizeId = sizeId;
	}

	/**
	 * 获取：原价
	 * 
	 * @return the priceOrigin
	 */
	public BigDecimal getPriceOrigin() {
		return priceOrigin;
	}

	/**
	 * 设置：原价
	 * 
	 * @param priceOrigin
	 *            the priceOrigin to set
	 */
	public void setPriceOrigin(BigDecimal priceOrigin) {
		this.priceOrigin = priceOrigin;
	}

	/**
	 * 获取：现价
	 * 
	 * @return the priceCurrent
	 */
	public BigDecimal getPriceCurrent() {
		return priceCurrent;
	}

	/**
	 * 设置：现价
	 * 
	 * @param priceCurrent
	 *            the priceCurrent to set
	 */
	public void setPriceCurrent(BigDecimal priceCurrent) {
		this.priceCurrent = priceCurrent;
	}

	/**
	 * 获取：库存
	 * 
	 * @return the stock
	 */
	public Integer getStock() {
		return stock;
	}

	/**
	 * 设置：库存
	 * 
	 * @param stock
	 *            the stock to set
	 */
	public void setStock(Integer stock) {
		this.stock = stock;
	}

	/**
	 * 获取：产品大图
	 * 
	 * @return the picBig
	 */
	public String getPicBig() {
		return picBig;
	}

	/**
	 * 设置：产品大图
	 * 
	 * @param picBig
	 *            the picBig to set
	 */
	public void setPicBig(String picBig) {
		this.picBig = picBig;
	}

	/**
	 * 获取：产品中图
	 * 
	 * @return the picMid
	 */
	public String getPicMid() {
		return picMid;
	}

	/**
	 * 设置：产品中图
	 * 
	 * @param picMid
	 *            the picMid to set
	 */
	public void setPicMid(String picMid) {
		this.picMid = picMid;
	}

	/**
	 * 获取：产品小图
	 * 
	 * @return the picSmall
	 */
	public String getPicSmall() {
		return picSmall;
	}

	/**
	 * 设置：产品小图
	 * 
	 * @param picSmall
	 *            the picSmall to set
	 */
	public void setPicSmall(String picSmall) {
		this.picSmall = picSmall;
	}

	/**
	 * 获取：产地
	 * 
	 * @return the origin
	 */
	public String getOrigin() {
		return origin;
	}

	/**
	 * 设置：产地
	 * 
	 * @param origin
	 *            the origin to set
	 */
	public void setOrigin(String origin) {
		this.origin = origin;
	}

	@Override
	public String toString() {
		return "ProductSku [productSkuId=" + productSkuId + ", skuCode=" + skuCode + ", productId=" + productId
				+ ", colorId=" + colorId + ", sizeId=" + sizeId + ", priceOrigin=" + priceOrigin + ", priceCurrent="
				+ priceCurrent + ", stock=" + stock + ", picBig=" + picBig + ", picMid=" + picMid + ", picSmall="
				+ picSmall + ", origin=" + origin + "]";
	}
}
