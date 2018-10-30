package com.iwonder.tea.bas.view;

import java.io.Serializable;

public class ColorConditionView implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String colorValue;

	public String getColorValue() {
		return colorValue;
	}

	public void setColorValue(String colorValue) {
		this.colorValue = colorValue;
	}

	@Override
	public String toString() {
		return "ColorConditionView [colorValue=" + colorValue + "]";
	}
	
}
