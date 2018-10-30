package com.iwonder.tea.prd.view;

import java.io.Serializable;

public class ProductSkuConditionView implements Serializable {
	private static final long serialVersionUID = 1L;

	private String productId;
	private String colorId;
	private String sizeId;

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getColorId() {
		return colorId;
	}

	public void setColorId(String colorId) {
		this.colorId = colorId;
	}

	public String getSizeId() {
		return sizeId;
	}

	public void setSizeId(String sizeId) {
		this.sizeId = sizeId;
	}

	@Override
	public String toString() {
		return "ProductSkuConditionView [productId=" + productId + ", colorId=" + colorId + ", sizeId=" + sizeId + "]";
	}

}
