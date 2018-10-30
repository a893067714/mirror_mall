package com.iwonder.tea.usr.service.imp;

import java.util.ArrayList;

import com.iwonder.tea.dictionary.view.DictionarySKUConditionView;
import com.iwonder.tea.usr.dao.IEvaluateDao;
import com.iwonder.tea.usr.dao.imp.EvaluateDaoImp;
import com.iwonder.tea.usr.entity.Evaluate;
import com.iwonder.tea.usr.service.IEvaluateService;
import com.iwonder.tea.usr.view.EvaluatConditionView;
import com.iwonder.tea.usr.view.EvaluatQueryView;
import com.iwonder.tea.usr.view.EvaluateQueryAllView;

public class EvaluateServiceImp implements IEvaluateService{
	private IEvaluateDao evaluateDao = new EvaluateDaoImp();
	
//	IDictionarySKUService dictionarySKUService = new DictionarySKUServiceImp();
//	ArrayList<DictionarySKU> list = dictionarySKUService.findByDictCode(DictConstant.SERVICE_STATUS) ;
	
	/*public ArrayList<EvaluateView> listView() {
		ArrayList<EvaluateView> listEvaluateView = new ArrayList<EvaluateView>();
		ArrayList<EvaluatQueryView> EvaluatQueryViewew = this.list(new EvaluatConditionView());
		for (Evaluate evaluate : listEvaluateView) {
			EvaluateView evaluateView = new EvaluateView();

			DictionarySKUConditionView dictionarySKUConditionView = new DictionarySKUConditionView();
			dictionarySKUConditionView.setDictionaryDetaiLabel(evaluate.getServiceStatus());

			evaluateView.setEvaluateId(evaluate.getEvaluateId());
			evaluateView.setUserId(evaluate.getUserId()) ;
			evaluateView.setProductId(evaluate.getProductId());
			evaluateView.setOrderDtlId(evaluate.getOrderDtlId());
			evaluateView.setServiceStatus(evaluate.getServiceStatus());
			evaluateView.setDescriptionStatus(evaluate.getDescriptionStatus());
			evaluateView.setCreateDate(evaluate.getCreateDate());
			evaluateView.setListOrderSKU(evaluateSKUService.list(evaluateSKUConditionView));
			listOrderView.add(evaluateView);
		}
		System.out.println(listOrderView);
		return listOrderView;
	}*/
	
	public ArrayList<Evaluate> list() {

		return evaluateDao.list();

	}
	
	public ArrayList<EvaluatQueryView> list(EvaluatConditionView evaluatConditionView) {

		return evaluateDao.list(evaluatConditionView);

	}
	
	public ArrayList<EvaluateQueryAllView> listAllView(EvaluatConditionView evaluatConditionView){
		return evaluateDao.listAllView(evaluatConditionView);
	}

	public Evaluate load(String evaluateId) {

		return evaluateDao.load(evaluateId);

	}

	public void insert(Evaluate evaluate) {

		evaluateDao.insert(evaluate);

	}

	public void update(Evaluate evaluate) {

		evaluateDao.update(evaluate);

	}

	public void delete(String evaluateId) {

		evaluateDao.delete(evaluateId);
//		addressInfoDao.deleteByStudentId(userId);

	}
}
