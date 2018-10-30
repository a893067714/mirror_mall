package com.iwonder.tea.ord.view;

import com.iwonder.tea.ord.entity.Order;

public class OrderQueryView extends Order{
	private String name;
	private String addressCont;
	private String dictionaryDetaiLabel;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddressCont() {
		return addressCont;
	}

	public void setAddressCont(String addressCont) {
		this.addressCont = addressCont;
	}

	public String getDictionaryDetaiLabel() {
		return dictionaryDetaiLabel;
	}

	public void setDictionaryDetaiLabel(String dictionaryDetaiLabel) {
		this.dictionaryDetaiLabel = dictionaryDetaiLabel;
	}



	
	
}
