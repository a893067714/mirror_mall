package com.iwonder.tea.bas.view;

import java.io.Serializable;

public class TypeBigConditionView implements Serializable{

	private static final long serialVersionUID = 1L;

	private String typeBigName;

	public String getTypeBigName() {
		return typeBigName;
	}

	public void setTypeBigName(String typeBigName) {
		this.typeBigName = typeBigName;
	}

	@Override
	public String toString() {
		return "TypeBigConditionView [typeBigName=" + typeBigName + "]";
	}
	
}
