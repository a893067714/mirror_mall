package com.iwonder.tea.bas.view;

import java.io.Serializable;

public class TypeDetailConditionView implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String typeBigId;
	
	private String typeDtlName;

	public String getTypeBigId() {
		return typeBigId;
	}

	public void setTypeBigId(String typeBigId) {
		this.typeBigId = typeBigId;
	}

	public String getTypeDtlName() {
		return typeDtlName;
	}

	public void setTypeDtlName(String typeDtlName) {
		this.typeDtlName = typeDtlName;
	}

	@Override
	public String toString() {
		return "TypeDetailConditionView [typeBigId=" + typeBigId + ", typeDtlName=" + typeDtlName + "]";
	}
	
}
