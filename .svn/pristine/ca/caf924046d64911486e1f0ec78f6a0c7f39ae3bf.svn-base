package com.iwonder.tea.sys.service.imp;

import java.util.ArrayList;

import com.iwonder.tea.sys.dao.IModuleDao;
import com.iwonder.tea.sys.dao.imp.ModuleDaoImp;
import com.iwonder.tea.sys.entity.Module;
import com.iwonder.tea.sys.service.IModuleService;
import com.iwonder.tea.sys.view.ModuleConditionView;
import com.iwonder.tea.sys.view.ModuleQueryView;

public class ModuleServiceImp implements IModuleService{
	private IModuleDao moduleDao = new ModuleDaoImp();

	public ArrayList<ModuleQueryView> list(ModuleConditionView moduleConditionView) {

		return moduleDao.list(moduleConditionView);

	}
	public ArrayList<Module> list() {
		
		return moduleDao.list();
		
	}

	public Module load(String moduleId) {

		return moduleDao.load(moduleId);

	}

	public void insert(Module module) {

		moduleDao.insert(module);

	}

	public void update(Module module) {

		moduleDao.update(module);

	}

	public void delete(String moduleId) {

		moduleDao.delete(moduleId);
//		addressInfoDao.deleteByStudentId(userId);

	}
}
