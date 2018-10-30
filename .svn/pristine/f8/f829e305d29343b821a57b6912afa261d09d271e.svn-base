package com.iwonder.tea.sys.dao.imp;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.UUID;

import com.iwonder.tea.framework.dao.imp.BaseDaoImp;
import com.iwonder.tea.framework.util.StringUtil;
import com.iwonder.tea.sys.dao.IRoleMenuDao;
import com.iwonder.tea.sys.entity.RoleMenu;
import com.iwonder.tea.sys.view.RoleMenuConditionView;
import com.iwonder.tea.sys.view.RoleMenuQueryView;

public class RoleMenuDaoImp extends BaseDaoImp implements IRoleMenuDao {

	public ArrayList<RoleMenuQueryView> list(RoleMenuConditionView roleMenuConditionView) {
		ArrayList<RoleMenuQueryView> listRoleMenu = new ArrayList<RoleMenuQueryView>();

		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		try {
			// S1.加载Driver
			System.out.println("连接成功");

			// S3.获取statement(执行语句的对象)
			StringBuilder sql = new StringBuilder();
			sql.append(" select sys_role_menu.*,sys_role.role_name,sys_menu.menu_name from sys_role_menu");
			sql.append("  JOIN sys_role");
			sql.append(" on sys_role_menu.role_id = sys_role.role_id");
			sql.append(" JOIN sys_menu");
			sql.append(" on sys_role_menu.menu_id = sys_menu.menu_id");

			if (StringUtil.isNotEmpty(roleMenuConditionView.getRoleId())) {
				if (!roleMenuConditionView.getRoleId().equals("0"))
					sql.append(" and sys_role_menu.role_id = ?");
			}
			if (StringUtil.isNotEmpty(roleMenuConditionView.getMenuId())) {
				if (!roleMenuConditionView.getMenuId().equals("0"))
					sql.append(" and sys_role_menu.menu_id = ?");
			}
			preparedStatement = super.prepareStatement(sql.toString());
			int parameterIndex = 1;

			if (StringUtil.isNotEmpty(roleMenuConditionView.getRoleId()))
				if (!roleMenuConditionView.getRoleId().equals("0"))
					preparedStatement.setObject(parameterIndex++, roleMenuConditionView.getRoleId());

			if (StringUtil.isNotEmpty(roleMenuConditionView.getMenuId()))
				if (!roleMenuConditionView.getMenuId().equals("0"))
					preparedStatement.setObject(parameterIndex++, roleMenuConditionView.getMenuId());

			System.out.println("***SQL:" + sql);
			System.out.println("***param:" + "");
			// s4-1.执行sql
			resultSet = preparedStatement.executeQuery();
			super.addResultSet(resultSet);// 待封装

			// s4-1.遍历resultSet
			System.out.println("***SQL查询结果 begin");
			while (resultSet.next()) {
				RoleMenuQueryView roleMenu = new RoleMenuQueryView();
				roleMenu.setRoleMenuId(resultSet.getString("role_menu_id"));
				roleMenu.setRoleName(resultSet.getString("role_name"));
				roleMenu.setMenuName(resultSet.getString("menu_name"));
				roleMenu.setMenuId(resultSet.getString("menu_id"));
				roleMenu.setRoleId(resultSet.getString("role_id"));
				listRoleMenu.add(roleMenu);
				System.out.println(roleMenu.toString());
			}
			System.out.println("***SQL查询结果 end");
			System.out.println("操作成功");

			return listRoleMenu;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("操作失败");
			throw new RuntimeException("查询失败");
		}
	}

	public ArrayList<RoleMenu> list() {
		ArrayList<RoleMenu> listRoleMenu = new ArrayList<RoleMenu>();

		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		try {
			// S1.加载Driver
			System.out.println("连接成功");

			// S3.获取statement(执行语句的对象)
			String sql = "select * from sys_role_menu";
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
				RoleMenu roleMenu = new RoleMenu();
				roleMenu.setRoleMenuId(resultSet.getString("role_menu_id"));
				roleMenu.setRoleId(resultSet.getString("role_id"));
				roleMenu.setMenuId(resultSet.getString("menu_id"));

				listRoleMenu.add(roleMenu);
				System.out.println(roleMenu.toString());
			}
			System.out.println("***SQL查询结果 end");
			System.out.println("操作成功");

			return listRoleMenu;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("操作失败");
			throw new RuntimeException("查询失败");
		}
	}

	public void delete(String roleMenuId) {
		System.out.println("删除ID:" + roleMenuId);

		PreparedStatement preparedStatement = null;

		try {

			System.out.println("连接成功");

			// S3.获取statement(执行语句的对象)
			String sql = "delete from sys_role_menu where role_menu_id = ?";
			preparedStatement = super.prepareStatement(sql);

			int paramIndex = 1;
			preparedStatement.setObject(paramIndex++, roleMenuId);

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

	public RoleMenu load(String roleMenuId) {
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		RoleMenu roleMenu = new RoleMenu();

		try {
			// S1.加载Driver
			System.out.println("连接成功");

			// S3.获取statement(执行语句的对象)
			String sql = "select * from sys_role_menu where role_menu_id = ?";
			preparedStatement = super.prepareStatement(sql);
			preparedStatement.setObject(1, roleMenuId);

			// s4-1.执行sql
			resultSet = preparedStatement.executeQuery();
			super.addResultSet(resultSet);// 待封装
											// TODO..................

			System.out.println("***SQL:" + sql);
			System.out.println("***param:" + "");

			// s4-1.遍历resultSet

			System.out.println("***SQL查询结果 begin");
			if (resultSet.next()) {
				roleMenu.setRoleMenuId(resultSet.getString("role_menu_id"));
				roleMenu.setRoleId(resultSet.getString("role_id"));
				roleMenu.setMenuId(resultSet.getString("menu_id"));
				System.out.println(roleMenu.toString());
			} else {
				System.out.println("ID不存在");
				throw new RuntimeException("查询id失败");
			}
			System.out.println("***SQL查询结果 end");
			System.out.println("操作成功");
			return roleMenu;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("操作失败");
			throw new RuntimeException("查询id失败");
		}
	}

	public void insert(RoleMenu roleMenu) {
		System.out.println("新增保存:" + roleMenu.getRoleMenuId());

		PreparedStatement preparedStatement = null;

		try {
			// S1.加载Driver
			System.out.println("连接成功");

			// S3.获取statement(执行语句的对象)
			String sql = "insert into sys_role_menu(role_menu_id,role_id,menu_id) values(?,?,?)";
			preparedStatement = super.prepareStatement(sql);

			int paramIndex = 1;

			String uuid = UUID.randomUUID().toString().replaceAll("-", "");
			preparedStatement.setObject(paramIndex++, uuid);
			preparedStatement.setObject(paramIndex++, roleMenu.getRoleId());
			preparedStatement.setObject(paramIndex++, roleMenu.getMenuId());

			System.out.println("***SQL:" + sql);
			System.out.println("***param:uuid:" + uuid + ",roleId:" + roleMenu.getRoleId());

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

	public void update(RoleMenu roleMenu) {
		PreparedStatement preparedStatement = null;

		try {
			// S1.加载Driver
			System.out.println("连接成功");

			// S3.获取statement(执行语句的对象)
			String sql = "update sys_role_menu set role_id = ?,menu_id = ? where role_menu_id = ?";
			preparedStatement = super.prepareStatement(sql);

			int paramIndex = 1;
			preparedStatement.setObject(paramIndex++, roleMenu.getRoleId());
			preparedStatement.setObject(paramIndex++, roleMenu.getMenuId());
			preparedStatement.setObject(paramIndex++, roleMenu.getRoleMenuId());
			System.out.println("***SQL:" + sql);
			System.out.println("***param:" + "roleMenuId:" + roleMenu.getRoleMenuId());

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

		System.out.println(roleMenu.toString());
	}

}
