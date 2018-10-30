package com.iwonder.tea.dictionary.view;

public class DictionarySKUConditionView {
	private String dataDictionaryId;
	private String dataDictionaryCode;
	private String dictionaryDetailCode;
	private String dictionaryDetaiLabel;
	private String dictionaryDetailNumber;
	public String getDataDictionaryId() {
		return dataDictionaryId;
	}
	public void setDataDictionaryId(String dataDictionaryId) {
		this.dataDictionaryId = dataDictionaryId;
	}
	public String getDataDictionaryCode() {
		return dataDictionaryCode;
	}
	public void setDataDictionaryCode(String dataDictionaryCode) {
		this.dataDictionaryCode = dataDictionaryCode;
	}
	public String getDictionaryDetailCode() {
		return dictionaryDetailCode;
	}
	public void setDictionaryDetailCode(String dictionaryDetailCode) {
		this.dictionaryDetailCode = dictionaryDetailCode;
	}
	public String getDictionaryDetaiLabel() {
		return dictionaryDetaiLabel;
	}
	public void setDictionaryDetaiLabel(String dictionaryDetaiLabel) {
		this.dictionaryDetaiLabel = dictionaryDetaiLabel;
	}
	public String getDictionaryDetailNumber() {
		return dictionaryDetailNumber;
	}
	public void setDictionaryDetailNumber(String dictionaryDetailNumber) {
		this.dictionaryDetailNumber = dictionaryDetailNumber;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DictionarySKUConditionView [dataDictionaryId=");
		builder.append(dataDictionaryId);
		builder.append(", dataDictionaryCode=");
		builder.append(dataDictionaryCode);
		builder.append(", dictionaryDetailCode=");
		builder.append(dictionaryDetailCode);
		builder.append(", dictionaryDetaiLabel=");
		builder.append(dictionaryDetaiLabel);
		builder.append(", dictionaryDetailNumber=");
		builder.append(dictionaryDetailNumber);
		builder.append("]");
		return builder.toString();
	}
	
}
