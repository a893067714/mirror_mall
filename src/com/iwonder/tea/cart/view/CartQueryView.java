package com.iwonder.tea.cart.view;

import java.math.BigDecimal;

import com.iwonder.tea.cart.entity.Cart;

public class CartQueryView extends Cart {

	private String productSkuCode;
	private String name;
	private String dictionaryDetailCheckLable;
	private String dictionaryDetailDeleteLable;
	private BigDecimal priceCurrent;
	private BigDecimal priceOrigin;
	private String picSmall;
	private String colorValue;
	private String sizeValue;

	public String getProductSkuCode() {
		return productSkuCode;
	}

	public void setProductSkuCode(String productSkuCode) {
		this.productSkuCode = productSkuCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDictionaryDetailCheckLable() {
		return dictionaryDetailCheckLable;
	}

	public void setDictionaryDetailCheckLable(String dictionaryDetailCheckLable) {
		this.dictionaryDetailCheckLable = dictionaryDetailCheckLable;
	}

	public String getDictionaryDetailDeleteLable() {
		return dictionaryDetailDeleteLable;
	}

	public void setDictionaryDetailDeleteLable(String dictionaryDetailDeleteLable) {
		this.dictionaryDetailDeleteLable = dictionaryDetailDeleteLable;
	}

	public BigDecimal getPriceCurrent() {
		return priceCurrent;
	}

	public void setPriceCurrent(BigDecimal priceCurrent) {
		this.priceCurrent = priceCurrent;
	}

	public String getPicSmall() {
		return picSmall;
	}

	public void setPicSmall(String picSmall) {
		this.picSmall = picSmall;
	}

	public String getColorValue() {
		return colorValue;
	}

	public void setColorValue(String colorValue) {
		this.colorValue = colorValue;
	}

	public String getSizeValue() {
		return sizeValue;
	}

	public void setSizeValue(String sizeValue) {
		this.sizeValue = sizeValue;
	}

	public BigDecimal getPriceOrigin() {
		return priceOrigin;
	}

	public void setPriceOrigin(BigDecimal priceOrigin) {
		this.priceOrigin = priceOrigin;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CartQueryView [productSkuCode=");
		builder.append(productSkuCode);
		builder.append(", name=");
		builder.append(name);
		builder.append(", dictionaryDetailCheckLable=");
		builder.append(dictionaryDetailCheckLable);
		builder.append(", dictionaryDetailDeleteLable=");
		builder.append(dictionaryDetailDeleteLable);
		builder.append(", priceCurrent=");
		builder.append(priceCurrent);
		builder.append(", priceOrigin=");
		builder.append(priceOrigin);
		builder.append(", picSmall=");
		builder.append(picSmall);
		builder.append(", colorValue=");
		builder.append(colorValue);
		builder.append(", sizeValue=");
		builder.append(sizeValue);
		builder.append("]");
		return builder.toString();
	}

}
