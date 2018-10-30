package com.iwonder.tea.dictionary.dao;

import java.util.ArrayList;

import com.iwonder.tea.dictionary.entity.DictionarySKU;
import com.iwonder.tea.dictionary.view.DictionarySKUConditionView;


public interface IDictionarySKUDao {

	public ArrayList<DictionarySKU> list(DictionarySKUConditionView dictionarySKUConditionView)  ;
	
	public ArrayList<DictionarySKU> findByDictCode(String dictCode);
	
	public void delete(String dictionaryDetailId) ;
	
	public void insert(DictionarySKU dictionarySKU) ;
	
	public void update(DictionarySKU dictionarySKU) ;
	
	public DictionarySKU load(String dictionaryDetailId) ;
	
}
