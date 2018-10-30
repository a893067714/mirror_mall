package com.iwonder.tea.bas.view;

import java.io.Serializable;

public class BrandConditionView implements Serializable {

	private static final long serialVersionUID = 1L;

	private String brandName;

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	@Override
	public String toString() {
		return "BrandConditionView [brandName=" + brandName + "]";
	}

}
