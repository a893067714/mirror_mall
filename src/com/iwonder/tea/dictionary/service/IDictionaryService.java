package com.iwonder.tea.dictionary.service;

import java.util.ArrayList;

import com.iwonder.tea.dictionary.entity.Dictionary;
import com.iwonder.tea.dictionary.view.DictionaryConditionView;

public interface IDictionaryService {
	public void insert(Dictionary dictionary) ;
	
	public void update(Dictionary dictionary) ;
	
	public ArrayList<Dictionary> list();
	public ArrayList<Dictionary> list(DictionaryConditionView dictionaryConditionView);
	
	public Dictionary load(String dataDictionaryId);
	
	public void delete(String dataDictionaryId) ;
	
}
