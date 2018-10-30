package com.iwonder.tea.bas.view;

import java.io.Serializable;

public class SizeConditionView implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String sizeValue;

	public String getSizeValue() {
		return sizeValue;
	}

	public void setSizeValue(String sizeValue) {
		this.sizeValue = sizeValue;
	}

	@Override
	public String toString() {
		return "SizeConditionView [sizeValue=" + sizeValue + "]";
	}
	
}
