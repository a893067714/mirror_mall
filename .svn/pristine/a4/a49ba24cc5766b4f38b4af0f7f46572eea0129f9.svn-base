package com.iwonder.tea.sys.dao.imp;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.UUID;

import com.iwonder.tea.framework.dao.imp.BaseDaoImp;
import com.iwonder.tea.framework.util.StringUtil;
import com.iwonder.tea.sys.dao.IModuleDao;
import com.iwonder.tea.sys.entity.Module;
import com.iwonder.tea.sys.view.ModuleConditionView;
import com.iwonder.tea.sys.view.ModuleQueryView;

public class ModuleDaoImp extends BaseDaoImp implements IModuleDao{

	public ArrayList<ModuleQueryView> list(ModuleConditionView moduleConditionView) {
		ArrayList<ModuleQueryView> listModule = new ArrayList<ModuleQueryView>();

		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		try {
			// S1.加载Driver
			System.out.println("连接成功");

			// S3.获取statement(执行语句的对象)
			StringBuilder sql = new StringBuilder();
			sql.append("select * from sys_module where 1=1 ");

			if (StringUtil.isNotEmpty(moduleConditionView.getModuleName())) {
				sql.append(" and module_name like ?");
			}
			preparedStatement = super.prepareStatement(sql.toString());
			int parameterIndex = 1;

			if (StringUtil.isNotEmpty(moduleConditionView.getModuleName()))
				preparedStatement.setObject(parameterIndex++, "%" + moduleConditionView.getModuleName() + "%");

			System.out.println("***SQL:" + sql);
			System.out.println("***param:" + "");
			// s4-1.执行sql
			resultSet = preparedStatement.executeQuery();
			super.addResultSet(resultSet);// 待封装
															// TODO..................

			// s4-1.遍历resultSet
			System.out.println("***SQL查询结果 begin");
			while (resultSet.next()) {
				ModuleQueryView module = new ModuleQueryView();
				module.setModuleId(resultSet.getString("module_id"));
				module.setModuleName(resultSet.getString("module_name"));

				listModule.add(module);
				System.out.println(module.toString());
			}
			System.out.println("***SQL查询结果 end");
			System.out.println("操作成功");

			return listModule;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("操作失败");
			throw new RuntimeException("查询失败");
		}
	}
	
	public ArrayList<Module> list() {
		ArrayList<Module> listModule = new ArrayList<Module>();

		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		try {
			// S1.加载Driver
			System.out.println("连接成功");

			// S3.获取statement(执行语句的对象)
			String sql = "select * from sys_module";
			preparedStatement = super.prepareStatement(sql);

			System.out.println("***SQL:" + sql);
			System.out.println("***param:" + "");
			// s4-1.执行sql
			resultSet = preparedStatement.executeQuery();
			super.addResultSet(resultSet);// 待封装
															// TODO..................

			// s4-1.遍历resultSet
			System.out.println("***SQL查询结果 begin");
			while (resultSet.next()) {
				Module module = new Module();
				module.setModuleId(resultSet.getString("module_id"));
				module.setModuleName(resultSet.getString("module_name"));

				listModule.add(module);
				System.out.println(module.toString());
			}
			System.out.println("***SQL查询结果 end");
			System.out.println("操作成功");

			return listModule;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("操作失败");
			throw new RuntimeException("查询失败");
		}
	}

	public void delete(String moduleId) {
		System.out.println("删除ID:" + moduleId);

		PreparedStatement preparedStatement = null;

		try {

			System.out.println("连接成功");

			// S3.获取statement(执行语句的对象)
			String sql = "delete from sys_module where module_id = ?";
			preparedStatement = super.prepareStatement(sql);

			int paramIndex = 1;
			preparedStatement.setObject(paramIndex++, moduleId);

			System.out.println("***SQL:" + sql);
			System.out.println("***param:" + "");

			// s4-1.执行sql
			int rowCount = preparedStatement.executeUpdate();

			System.out.println("***SQL查询结果 begin");
			System.out.println("影响行数:" + rowCount);
			System.out.println("***SQL查询结果 end");
			System.out.println("操作成功");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("操作失败");
			throw new RuntimeException("删除学生失败", e);
		}
	}

	public Module load(String moduleId) {
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		Module module = new Module();

		try {
			// S1.加载Driver
			System.out.println("连接成功");

			// S3.获取statement(执行语句的对象)
			String sql = "select * from sys_module where module_id = ?";
			preparedStatement = super.prepareStatement(sql);
			preparedStatement.setObject(1, moduleId);

			// s4-1.执行sql
			resultSet = preparedStatement.executeQuery();
			super.addResultSet(resultSet);// 待封装
															// TODO..................

			System.out.println("***SQL:" + sql);
			System.out.println("***param:" + "");

			// s4-1.遍历resultSet

			System.out.println("***SQL查询结果 begin");
			if (resultSet.next()) {
				module.setModuleId(resultSet.getString("module_id"));
				module.setModuleName(resultSet.getString("module_name"));
				System.out.println(module.toString());
			} else {
				System.out.println("ID不存在");
				throw new RuntimeException("查询id失败");
			}
			System.out.println("***SQL查询结果 end");
			System.out.println("操作成功");
			return module;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("操作失败");
			throw new RuntimeException("查询id失败");
		}
	}

	public void insert(Module module) {
		System.out.println("新增保存:" + module.getModuleId());

		PreparedStatement preparedStatement = null;

		try {
			// S1.加载Driver
			System.out.println("连接成功");

			// S3.获取statement(执行语句的对象)
			String sql = "insert into sys_module(module_id,module_name) values(?,?)";
			preparedStatement = super.prepareStatement(sql);

			int paramIndex = 1;

			String uuid = UUID.randomUUID().toString().replaceAll("-", "");
			preparedStatement.setObject(paramIndex++, uuid);
			preparedStatement.setObject(paramIndex++, module.getModuleName());

			System.out.println("***SQL:" + sql);
			System.out.println("***param:uuid:" + uuid + ",moduleName:" + module.getModuleName());

			// s4-1.执行sql
			int rowCount = preparedStatement.executeUpdate();

			System.out.println("***SQL查询结果 begin");
			System.out.println("***影响行数:" + rowCount);
			System.out.println("***SQL查询结果 end");

			System.out.println("操作成功");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("操作失败");
		}
	}

	public void update(Module module) {
		PreparedStatement preparedStatement = null;

		try {
			// S1.加载Driver
			System.out.println("连接成功");

			// S3.获取statement(执行语句的对象)
			String sql = "update sys_module set module_name = ? where module_id = ?";
			preparedStatement = super.prepareStatement(sql);

			int paramIndex = 1;
			preparedStatement.setObject(paramIndex++, module.getModuleName());
			preparedStatement.setObject(paramIndex++, module.getModuleId());
			System.out.println("***SQL:" + sql);
			System.out.println("***param:" + "moduleId:" + module.getModuleId());

			// s4-1.执行sql
			int rowCount = preparedStatement.executeUpdate();
			System.out.println("***SQL查询结果 begin");

			System.out.println("影响行数:" + rowCount);
			System.out.println("***SQL查询结果 end");
			System.out.println("操作成功");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("操作失败");
		}

		System.out.println(module.toString());
	}

}
