package com.iwonder.tea.usr.view;

import java.io.Serializable;

import com.iwonder.tea.usr.entity.AddressInfo;

public class AddressInfoQueryView extends AddressInfo implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

}
