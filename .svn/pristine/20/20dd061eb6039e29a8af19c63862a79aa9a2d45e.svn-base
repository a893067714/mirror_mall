package com.iwonder.tea.dictionary.service.imp;

import java.util.ArrayList;

import com.iwonder.tea.dictionary.dao.IDictionarySKUDao;
import com.iwonder.tea.dictionary.dao.imp.DictionarySKUDaoImp;
import com.iwonder.tea.dictionary.entity.DictionarySKU;
import com.iwonder.tea.dictionary.service.IDictionarySKUService;
import com.iwonder.tea.dictionary.view.DictionarySKUConditionView;
import com.iwonder.tea.framework.service.imp.BaseServiceImp;


public class DictionarySKUServiceImp extends BaseServiceImp implements IDictionarySKUService {
	private IDictionarySKUDao dictionarySKUDao = new DictionarySKUDaoImp();


	public void insert(DictionarySKU dictionarySKU) {
		dictionarySKUDao.insert(dictionarySKU);
	}
	
	@Override
	public ArrayList<DictionarySKU> findByDictCode(String dictCode) {
		return dictionarySKUDao.findByDictCode(dictCode);
	}

	public ArrayList<DictionarySKU> list(DictionarySKUConditionView dictionarySKUConditionView) {
		return dictionarySKUDao.list(dictionarySKUConditionView);

	}

	public DictionarySKU load(String   dictionaryDetailId) {
		
	return dictionarySKUDao.load(dictionaryDetailId);
		
		
	}

	public void update(DictionarySKU dictionarySKU) {
		
		dictionarySKUDao.update(dictionarySKU);
		
		
	}

	public void delete(String dictionaryDetailId) {
		dictionarySKUDao.delete(dictionaryDetailId);
	

	}

	

	

	
}
