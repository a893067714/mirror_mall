package com.iwonder.tea.dictionary.view;

public class DictionaryConditionView {
	private String dataDictionaryCode;
	private String dataDictionaryLabel;
	public String getDataDictionaryCode() {
		return dataDictionaryCode;
	}
	public void setDataDictionaryCode(String dataDictionaryCode) {
		this.dataDictionaryCode = dataDictionaryCode;
	}
	public String getDataDictionaryLabel() {
		return dataDictionaryLabel;
	}
	public void setDataDictionaryLabel(String dataDictionaryLabel) {
		this.dataDictionaryLabel = dataDictionaryLabel;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DictionaryConditionView [dataDictionaryCode=");
		builder.append(dataDictionaryCode);
		builder.append(", dataDictionaryLabel=");
		builder.append(dataDictionaryLabel);
		builder.append("]");
		return builder.toString();
	}

}
