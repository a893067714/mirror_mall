package com.iwonder.tea.sys.service;

import java.util.ArrayList;

import com.iwonder.tea.sys.entity.Module;
import com.iwonder.tea.sys.view.ModuleConditionView;
import com.iwonder.tea.sys.view.ModuleQueryView;

public interface IModuleService {

	public ArrayList<Module> list();
	
	public ArrayList<ModuleQueryView> list(ModuleConditionView moduleConditionView);
	
	public void delete(String moduleId);
	
	public Module load(String moduleId);
	
	public void insert(Module module);
	
	public void update(Module module);
}
