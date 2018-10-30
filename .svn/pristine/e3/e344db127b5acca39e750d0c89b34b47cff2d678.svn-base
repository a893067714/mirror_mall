package com.iwonder.tea.dictionary.service.imp;

import java.util.ArrayList;

import com.iwonder.tea.dictionary.dao.IDictionaryDao;
import com.iwonder.tea.dictionary.dao.imp.DictionaryDaoImp;
import com.iwonder.tea.dictionary.entity.Dictionary;
import com.iwonder.tea.dictionary.service.IDictionaryService;
import com.iwonder.tea.dictionary.view.DictionaryConditionView;
import com.iwonder.tea.framework.service.imp.BaseServiceImp;


public class DictionaryServiceImp extends BaseServiceImp implements IDictionaryService {
	private IDictionaryDao dictionaryDao = new DictionaryDaoImp();


	public void insert(Dictionary dictionary) {
		
		dictionaryDao.insert(dictionary);
		
	}

	public ArrayList<Dictionary> list() {
		return dictionaryDao.list();

	}
	public ArrayList<Dictionary> list(DictionaryConditionView dictionaryConditionView) {
		return dictionaryDao.list(dictionaryConditionView);

	}

	public Dictionary load(String   dataDictionaryId) {
		
	return dictionaryDao.load(dataDictionaryId);
		
		
	}

	public void update(Dictionary dictionary) {
		
		dictionaryDao.update(dictionary);
		
		
	}

	public void delete(String dataDictionaryId) {
		dictionaryDao.delete(dataDictionaryId);
	

	}

	

	
}
