package com.iwonder.tea.dictionary.entity;

public class DictionarySKU {
	
	private String dictionaryDetailId;
	private String dataDictionaryId;
	private String dataDictionaryCode;
	private String dictionaryDetailCode;
	private String dictionaryDetaiLabel;
	private String dictionaryDetailNumber;
	public String getDictionaryDetailId() {
		return dictionaryDetailId;
	}
	public void setDictionaryDetailId(String dictionaryDetailId) {
		this.dictionaryDetailId = dictionaryDetailId;
	}
	public String getDataDictionaryId() {
		return dataDictionaryId;
	}
	public void setDataDictionaryId(String dataDictionaryId) {
		this.dataDictionaryId = dataDictionaryId;
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
	public String getDataDictionaryCode() {
		return dataDictionaryCode;
	}
	public void setDataDictionaryCode(String dataDictionaryCode) {
		this.dataDictionaryCode = dataDictionaryCode;
	}
	@Override
	public String toString() {
		return "DictionarySKU [dictionaryDetailId=" + dictionaryDetailId + ", dataDictionaryId=" + dataDictionaryId
				+ ", dataDictionaryCode=" + dataDictionaryCode + ", dictionaryDetailCode=" + dictionaryDetailCode
				+ ", dictionaryDetaiLabel=" + dictionaryDetaiLabel + ", dictionaryDetailNumber="
				+ dictionaryDetailNumber + "]";
	}
	


	

}
