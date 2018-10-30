package com.iwonder.tea.sys.dao.imp;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.UUID;

import com.iwonder.tea.framework.dao.imp.BaseDaoImp;
import com.iwonder.tea.framework.util.StringUtil;
import com.iwonder.tea.sys.dao.IMenuDao;
import com.iwonder.tea.sys.entity.Menu;
import com.iwonder.tea.sys.view.MenuConditionView;
import com.iwonder.tea.sys.view.MenuQueryView;

public class MenuDaoImp extends BaseDaoImp implements IMenuDao {

	public ArrayList<MenuQueryView> list(MenuConditionView menuConditionView) {
		ArrayList<MenuQueryView> listMenu = new ArrayList<MenuQueryView>();

		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		try {
			// S1.加载Driver
			System.out.println("连接成功");

			// S3.获取statement(执行语句的对象)
			StringBuilder sql = new StringBuilder();
			sql.append(" select sys_menu.*,sys_module.module_name from sys_menu");
			sql.append("  JOIN sys_module");
			sql.append(" on sys_menu.module_id = sys_module.module_id");

			if (StringUtil.isNotEmpty(menuConditionView.getModuleId())) {
				if (!menuConditionView.getModuleId().equals("0"))
					sql.append(" and sys_menu.module_id = ?");
			}
			if (StringUtil.isNotEmpty(menuConditionView.getMenuName())) {
				if (!menuConditionView.getMenuName().equals("0"))
					sql.append(" and sys_menu.menu_name like ?");
			}
			preparedStatement = super.prepareStatement(sql.toString());
			int parameterIndex = 1;

			if (StringUtil.isNotEmpty(menuConditionView.getModuleId()))
				if (!menuConditionView.getModuleId().equals("0"))
					preparedStatement.setObject(parameterIndex++, menuConditionView.getModuleId());

			if (StringUtil.isNotEmpty(menuConditionView.getMenuName()))
				if (!menuConditionView.getMenuName().equals("0"))
					preparedStatement.setObject(parameterIndex++, "%" + menuConditionView.getMenuName() + "%");

			System.out.println("***SQL:" + sql);
			System.out.println("***param:" + "");
			// s4-1.执行sql
			resultSet = preparedStatement.executeQuery();
			super.addResultSet(resultSet);// 待封装
											// TODO..................

			// s4-1.遍历resultSet
			System.out.println("***SQL查询结果 begin");
			while (resultSet.next()) {
				MenuQueryView menu = new MenuQueryView();
				menu.setMenuId(resultSet.getString("menu_id"));
				menu.setModuleName(resultSet.getString("module_name"));
				menu.setMenuName(resultSet.getString("menu_name"));
				menu.setMenuUrl(resultSet.getString("menu_url"));

				listMenu.add(menu);
				System.out.println(menu.toString());
			}
			System.out.println("***SQL查询结果 end");
			System.out.println("操作成功");

			return listMenu;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("操作失败");
			throw new RuntimeException("查询失败");
		}
	}

	public ArrayList<Menu> list() {
		ArrayList<Menu> listMenu = new ArrayList<Menu>();

		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		try {
			// S1.加载Driver
			System.out.println("连接成功");

			// S3.获取statement(执行语句的对象)
			String sql = "select * from sys_menu";
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
				Menu menu = new Menu();
				menu.setMenuId(resultSet.getString("menu_id"));
				menu.setModuleId(resultSet.getString("module_id"));
				menu.setMenuName(resultSet.getString("menu_name"));
				menu.setMenuUrl(resultSet.getString("menu_url"));

				listMenu.add(menu);
				System.out.println(menu.toString());
			}
			System.out.println("***SQL查询结果 end");
			System.out.println("操作成功");

			return listMenu;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("操作失败");
			throw new RuntimeException("查询失败");
		}
	}

	public void delete(String menuId) {
		System.out.println("删除ID:" + menuId);

		PreparedStatement preparedStatement = null;

		try {

			System.out.println("连接成功");

			// S3.获取statement(执行语句的对象)
			String sql = "delete from sys_menu where menu_id = ?";
			preparedStatement = super.prepareStatement(sql);

			int paramIndex = 1;
			preparedStatement.setObject(paramIndex++, menuId);

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

	public Menu load(String menuId) {
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		Menu menu = new Menu();

		try {
			// S1.加载Driver
			System.out.println("连接成功");

			// S3.获取statement(执行语句的对象)
			String sql = "select * from sys_menu where menu_id = ?";
			preparedStatement = super.prepareStatement(sql);
			preparedStatement.setObject(1, menuId);

			// s4-1.执行sql
			resultSet = preparedStatement.executeQuery();
			super.addResultSet(resultSet);// 待封装
											// TODO..................

			System.out.println("***SQL:" + sql);
			System.out.println("***param:" + "");

			// s4-1.遍历resultSet

			System.out.println("***SQL查询结果 begin");
			if (resultSet.next()) {
				menu.setMenuId(resultSet.getString("menu_id"));
				menu.setModuleId(resultSet.getString("module_id"));
				menu.setMenuName(resultSet.getString("menu_name"));
				menu.setMenuUrl(resultSet.getString("menu_url"));
				System.out.println(menu.toString());
			} else {
				System.out.println("ID不存在");
			}
			System.out.println("***SQL查询结果 end");
			System.out.println("操作成功");
			return menu;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("操作失败");
			throw new RuntimeException("查询id失败");
		}
	}

	public void insert(Menu menu) {
		System.out.println("新增保存:" + menu.getMenuId());

		PreparedStatement preparedStatement = null;

		try {
			// S1.加载Driver
			System.out.println("连接成功");

			// S3.获取statement(执行语句的对象)
			String sql = "insert into sys_menu(menu_id,module_id,menu_name,menu_url) values(?,?,?,?)";
			preparedStatement = super.prepareStatement(sql);

			int paramIndex = 1;

			String uuid = UUID.randomUUID().toString().replaceAll("-", "");
			preparedStatement.setObject(paramIndex++, uuid);
			preparedStatement.setObject(paramIndex++, menu.getModuleId());
			preparedStatement.setObject(paramIndex++, menu.getMenuName());
			preparedStatement.setObject(paramIndex++, menu.getMenuUrl());

			System.out.println("***SQL:" + sql);
			System.out.println("***param:uuid:" + uuid + ",menuName:" + menu.getMenuName());

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

	public void update(Menu menu) {
		PreparedStatement preparedStatement = null;

		try {
			// S1.加载Driver
			System.out.println("连接成功");

			// S3.获取statement(执行语句的对象)
			String sql = "update sys_menu set module_id = ?,menu_name = ?,menu_url = ? where menu_id = ?";
			preparedStatement = super.prepareStatement(sql);

			int paramIndex = 1;
			preparedStatement.setObject(paramIndex++, menu.getModuleId());
			preparedStatement.setObject(paramIndex++, menu.getMenuName());
			preparedStatement.setObject(paramIndex++, menu.getMenuUrl());
			preparedStatement.setObject(paramIndex++, menu.getMenuId());
			System.out.println("***SQL:" + sql);
			System.out.println("***param:" + "menuId:" + menu.getMenuId());

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

		System.out.println(menu.toString());
	}

}
