package com.iwonder.tea.sys.dao.imp;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.UUID;

import com.iwonder.tea.framework.dao.imp.BaseDaoImp;
import com.iwonder.tea.framework.util.StringUtil;
import com.iwonder.tea.sys.dao.IRoleDao;
import com.iwonder.tea.sys.entity.Role;
import com.iwonder.tea.sys.view.RoleConditionView;
import com.iwonder.tea.sys.view.RoleQueryView;

public class RoleDaoImp extends BaseDaoImp implements IRoleDao{

	public ArrayList<RoleQueryView> list(RoleConditionView roleConditionView) {	
		ArrayList<RoleQueryView> listRole = new ArrayList<RoleQueryView>();

		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		try {
			// S1.加载Driver
			System.out.println("连接成功");

			// S3.获取statement(执行语句的对象)
			StringBuilder sql = new StringBuilder();
			sql.append("select * from sys_role where 1=1") ;
			
			if (StringUtil.isNotEmpty(roleConditionView.getRoleName())) {
				sql.append(" and role_name like ?");
			}
			
			preparedStatement = super.prepareStatement(sql.toString());
			int parameterIndex = 1;

			if (StringUtil.isNotEmpty(roleConditionView.getRoleName()))
				preparedStatement.setObject(parameterIndex++, "%" + roleConditionView.getRoleName() + "%");

			System.out.println("***SQL:" + sql);
			System.out.println("***param:" + "");
			// s4-1.执行sql
			resultSet = preparedStatement.executeQuery();
			super.addResultSet(resultSet);// 待封装
															// TODO..................

			// s4-1.遍历resultSet
			System.out.println("***SQL查询结果 begin");
			while (resultSet.next()) {
				RoleQueryView role = new RoleQueryView();
				role.setRoleId(resultSet.getString("role_id"));
				role.setRoleName(resultSet.getString("role_name"));

				listRole.add(role);
				System.out.println(role.toString());
			}
			System.out.println("***SQL查询结果 end");
			System.out.println("操作成功");

			return listRole;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("操作失败");
			throw new RuntimeException("查询失败");
		}
	}
	
	public ArrayList<Role> list() {	
		ArrayList<Role> listRole = new ArrayList<Role>();

		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		try {
			// S1.加载Driver
			System.out.println("连接成功");

			// S3.获取statement(执行语句的对象)
			String sql = "select * from sys_role";
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
				Role role = new Role();
				role.setRoleId(resultSet.getString("role_id"));
				role.setRoleName(resultSet.getString("role_name"));

				listRole.add(role);
				System.out.println(role.toString());
			}
			System.out.println("***SQL查询结果 end");
			System.out.println("操作成功");

			return listRole;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("操作失败");
			throw new RuntimeException("查询失败");
		}
	}

	public void delete(String roleId) {
		System.out.println("删除ID:" + roleId);

		PreparedStatement preparedStatement = null;

		try {

			System.out.println("连接成功");

			// S3.获取statement(执行语句的对象)
			String sql = "delete from sys_role where role_id = ?";
			preparedStatement = super.prepareStatement(sql);

			int paramIndex = 1;
			preparedStatement.setObject(paramIndex++, roleId);

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

	public Role load(String roleId) {
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		Role role = new Role();

		try {
			// S1.加载Driver
			System.out.println("连接成功");

			// S3.获取statement(执行语句的对象)
			String sql = "select * from sys_role where role_id = ?";
			preparedStatement = super.prepareStatement(sql);
			preparedStatement.setObject(1, roleId);

			// s4-1.执行sql
			resultSet = preparedStatement.executeQuery();
			super.addResultSet(resultSet);// 待封装
															// TODO..................

			System.out.println("***SQL:" + sql);
			System.out.println("***param:" + "");

			// s4-1.遍历resultSet

			System.out.println("***SQL查询结果 begin");
			if (resultSet.next()) {
				role.setRoleId(resultSet.getString("role_id"));
				role.setRoleName(resultSet.getString("role_name"));
				System.out.println(role.toString());
			} else {
				System.out.println("ID不存在");
				throw new RuntimeException("查询id失败");
			}
			System.out.println("***SQL查询结果 end");
			System.out.println("操作成功");
			return role;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("操作失败");
			throw new RuntimeException("查询id失败");
		}
	}

	public void insert(Role role) {
		System.out.println("新增保存:" + role.getRoleName());

		PreparedStatement preparedStatement = null;

		try {
			// S1.加载Driver
			System.out.println("连接成功");

			// S3.获取statement(执行语句的对象)
			String sql = "insert into sys_role(role_id,role_name) values(?,?)";
			preparedStatement = super.prepareStatement(sql);

			int paramIndex = 1;

			String uuid = UUID.randomUUID().toString().replaceAll("-", "");
			preparedStatement.setObject(paramIndex++, uuid);
			preparedStatement.setObject(paramIndex++, role.getRoleName());

			System.out.println("***SQL:" + sql);
			System.out.println("***param:uuid:" + uuid + ",roleName:" + role.getRoleName());

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

	public void update(Role role) {
		PreparedStatement preparedStatement = null;

		try {
			// S1.加载Driver
			System.out.println("连接成功");

			// S3.获取statement(执行语句的对象)
			String sql = "update sys_role set role_name = ? where role_id = ?";
			preparedStatement = super.prepareStatement(sql);

			int paramIndex = 1;
			preparedStatement.setObject(paramIndex++, role.getRoleName());
			preparedStatement.setObject(paramIndex++, role.getRoleId());
			System.out.println("***SQL:" + sql);
			System.out.println("***param:" + "roleId:" + role.getRoleId());

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

		System.out.println(role.toString());
	}

}
