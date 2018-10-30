package com.iwonder.tea.ord.view;

public class UserInfoConditionView {
	private String userId;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("UserInfoConditionView [name=");
		builder.append(name);
		builder.append("]");
		return builder.toString();
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	
}
