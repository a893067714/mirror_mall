package com.iwonder.tea.usr.service;

import java.util.ArrayList;

import com.iwonder.tea.usr.entity.Evaluate;
import com.iwonder.tea.usr.view.EvaluatConditionView;
import com.iwonder.tea.usr.view.EvaluatQueryView;
import com.iwonder.tea.usr.view.EvaluateQueryAllView;

public interface IEvaluateService {

	public ArrayList<Evaluate> list();
	
	public ArrayList<EvaluatQueryView> list(EvaluatConditionView evaluatConditionView);
	
	public ArrayList<EvaluateQueryAllView> listAllView(EvaluatConditionView evaluatConditionView);
	
	public Evaluate load(String evaluateId);
	
	public void insert(Evaluate evaluate);
	
	public void update(Evaluate evaluate);
	
	public void delete(String evaluateId);
}
