package com.iwonder.tea.prd.view;

import java.io.Serializable;
import java.util.Date;

public class ProductConditionView implements Serializable {
	private static final long serialVersionUID = 1L;

	private String productName;
	private String typeDtlId;
	private String brandId;
	private String shelfStat;
	private Date timePrevious;
	private Date timeLater;

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getTypeDtlId() {
		return typeDtlId;
	}

	public void setTypeDtlId(String typeDtlId) {
		this.typeDtlId = typeDtlId;
	}

	public String getBrandId() {
		return brandId;
	}

	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}

	public String getShelfStat() {
		return shelfStat;
	}

	public void setShelfStat(String shelfStat) {
		this.shelfStat = shelfStat;
	}

	public Date getTimePrevious() {
		return timePrevious;
	}

	public void setTimePrevious(Date timePrevious) {
		this.timePrevious = timePrevious;
	}

	public Date getTimeLater() {
		return timeLater;
	}

	public void setTimeLater(Date timeLater) {
		this.timeLater = timeLater;
	}

	@Override
	public String toString() {
		return "ProductConditionView [productName=" + productName + ", typeDtlId=" + typeDtlId + ", brandId=" + brandId
				+ ", shelfStat=" + shelfStat + ", timePrevious=" + timePrevious + ", timeLater=" + timeLater + "]";
	}

}
