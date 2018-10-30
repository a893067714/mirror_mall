package com.iwonder.tea.dictionary.service;

import java.util.ArrayList;

import com.iwonder.tea.dictionary.entity.DictionarySKU;
import com.iwonder.tea.dictionary.view.DictionarySKUConditionView;

public interface IDictionarySKUService {
	public void insert(DictionarySKU dictionarySKU) ;
	
	public void update(DictionarySKU dictionarySKU) ;
	
	public ArrayList<DictionarySKU> findByDictCode(String dictCode);
	
	public DictionarySKU load(String dictionaryDetailId);
	
	public void delete(String dictionaryDetailId) ;

	public ArrayList<DictionarySKU> list(DictionarySKUConditionView dictionarySKUConditionView);

	
}
