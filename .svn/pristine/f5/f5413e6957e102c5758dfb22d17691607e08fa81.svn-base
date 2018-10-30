package com.iwonder.tea.sys.dao.imp;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.UUID;

import com.iwonder.tea.framework.dao.imp.BaseDaoImp;
import com.iwonder.tea.framework.util.StringUtil;
import com.iwonder.tea.sys.dao.IStaffRoleDao;
import com.iwonder.tea.sys.entity.StaffRole;
import com.iwonder.tea.sys.view.StaffRoleConditionView;
import com.iwonder.tea.sys.view.StaffRoleQueryView;

public class StaffRoleDaoImp extends BaseDaoImp implements IStaffRoleDao{

	public ArrayList<StaffRoleQueryView> list(StaffRoleConditionView staffRoleConditionView) {
		ArrayList<StaffRoleQueryView> listStaffRole = new ArrayList<StaffRoleQueryView>();

		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		try {
			// S1.加载Driver
			System.out.println("连接成功");

			// S3.获取statement(执行语句的对象)
			StringBuilder sql = new StringBuilder();
			sql.append(" select sys_staff_role.*,sys_staff.staff_name,sys_role.role_name from sys_staff_role");
			sql.append(" JOIN sys_staff");
			sql.append(" on sys_staff_role.staff_id = sys_staff.staff_id");
			sql.append(" JOIN sys_role");
			sql.append(" on sys_staff_role.role_id = sys_role.role_id");

			if (StringUtil.isNotEmpty(staffRoleConditionView.getStaffId())) {
				if(!staffRoleConditionView.getStaffId().equals("0"))
					sql.append(" and sys_staff_role.staff_id = ?");
			}
			if (StringUtil.isNotEmpty(staffRoleConditionView.getRoleId())) {
				if(!staffRoleConditionView.getRoleId().equals("0"))
					sql.append(" and sys_staff_role.role_id = ?");
			}
			preparedStatement = super.prepareStatement(sql.toString());
			int parameterIndex = 1;

			if (StringUtil.isNotEmpty(staffRoleConditionView.getStaffId()))
				if(!staffRoleConditionView.getStaffId().equals("0"))
					preparedStatement.setObject(parameterIndex++, staffRoleConditionView.getStaffId());

			if (StringUtil.isNotEmpty(staffRoleConditionView.getRoleId()))
				if(!staffRoleConditionView.getRoleId().equals("0"))
					preparedStatement.setObject(parameterIndex++, staffRoleConditionView.getRoleId());

			System.out.println("***SQL:" + sql);
			System.out.println("***param:" + "");
			// s4-1.执行sql
			resultSet = preparedStatement.executeQuery();
			super.addResultSet(resultSet);// 待封装
															// TODO..................

			// s4-1.遍历resultSet
			System.out.println("***SQL查询结果 begin");
			while (resultSet.next()) {
				StaffRoleQueryView staffRole = new StaffRoleQueryView();
				staffRole.setStaffRoleId(resultSet.getString("staff_role_id"));
				staffRole.setStaffName(resultSet.getString("staff_name"));
				staffRole.setRoleName(resultSet.getString("role_name"));

				listStaffRole.add(staffRole);

				System.out.println(staffRole.toString());
			}
			System.out.println("***SQL查询结果 end");
			System.out.println("操作成功");

			return listStaffRole;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("操作失败");
			throw new RuntimeException("查询失败");
		}
	}
	
	public ArrayList<StaffRole> list() {
		ArrayList<StaffRole> listStaffRole = new ArrayList<StaffRole>();

		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		try {
			// S1.加载Driver
			System.out.println("连接成功");

			// S3.获取statement(执行语句的对象)
			String sql = "select * from sys_staff_role";
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
				StaffRole staffRole = new StaffRole();
				staffRole.setStaffRoleId(resultSet.getString("staff_role_id"));
				staffRole.setStaffId(resultSet.getString("staff_id"));
				staffRole.setRoleId(resultSet.getString("role_id"));

				listStaffRole.add(staffRole);

				System.out.println(staffRole.toString());
			}
			System.out.println("***SQL查询结果 end");
			System.out.println("操作成功");

			return listStaffRole;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("操作失败");
			throw new RuntimeException("查询失败");
		}
	}

	public void delete(String staffRoleId) {
		System.out.println("删除ID:" + staffRoleId);

		PreparedStatement preparedStatement = null;

		try {

			System.out.println("连接成功");

			// S3.获取statement(执行语句的对象)
			String sql = "delete from sys_staff_role where staff_role_id = ?";
			preparedStatement = super.prepareStatement(sql);

			int paramIndex = 1;
			preparedStatement.setObject(paramIndex++, staffRoleId);

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

	public StaffRole load(String staffRoleId) {
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		StaffRole staffRole = new StaffRole();

		try {
			// S1.加载Driver
			System.out.println("连接成功");

			// S3.获取statement(执行语句的对象)
			String sql = "select * from sys_staff_role where staff_role_id = ?";
			preparedStatement = super.prepareStatement(sql);
			preparedStatement.setObject(1, staffRoleId);

			// s4-1.执行sql
			resultSet = preparedStatement.executeQuery();
			super.addResultSet(resultSet);// 待封装
															// TODO..................

			System.out.println("***SQL:" + sql);
			System.out.println("***param:" + "");

			// s4-1.遍历resultSet

			System.out.println("***SQL查询结果 begin");
			if (resultSet.next()) {
				staffRole.setStaffRoleId(resultSet.getString("staff_role_id"));
				staffRole.setStaffId(resultSet.getString("staff_id"));
				staffRole.setRoleId(resultSet.getString("role_id"));
				System.out.println(staffRole.toString());
			} else {
				System.out.println("ID不存在");
				throw new RuntimeException("查询id失败");
			}
			System.out.println("***SQL查询结果 end");
			System.out.println("操作成功");
			return staffRole;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("操作失败");
			throw new RuntimeException("查询id失败");
		}
	}

	public void insert(StaffRole staffRole) {
		System.out.println("新增保存:" + staffRole.getStaffRoleId());

		PreparedStatement preparedStatement = null;

		try {
			// S1.加载Driver
			System.out.println("连接成功");

			// S3.获取statement(执行语句的对象)
			String sql = "insert into sys_staff_role(staff_role_id,staff_id,role_id) values(?,?,?)";
			preparedStatement = super.prepareStatement(sql);

			int paramIndex = 1;

			String uuid = UUID.randomUUID().toString().replaceAll("-", "");
			preparedStatement.setObject(paramIndex++, uuid);
			preparedStatement.setObject(paramIndex++, staffRole.getStaffId());
			preparedStatement.setObject(paramIndex++, staffRole.getRoleId());

			System.out.println("***SQL:" + sql);
			System.out.println("***param:uuid:" + uuid + ",roleId:" + staffRole.getRoleId());

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

	public void update(StaffRole staffRole) {
		PreparedStatement preparedStatement = null;

		try {
			// S1.加载Driver
			System.out.println("连接成功");

			// S3.获取statement(执行语句的对象)
			String sql = "update sys_staff_role set staff_id = ?,role_id = ? where staff_role_id = ?";
			preparedStatement = super.prepareStatement(sql);

			int paramIndex = 1;
			preparedStatement.setObject(paramIndex++, staffRole.getStaffId());
			preparedStatement.setObject(paramIndex++, staffRole.getRoleId());
			preparedStatement.setObject(paramIndex++, staffRole.getStaffRoleId());
			System.out.println("***SQL:" + sql);
			System.out.println("***param:" + "roleId:" + staffRole.getRoleId());

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

		System.out.println(staffRole.toString());
	}

}
