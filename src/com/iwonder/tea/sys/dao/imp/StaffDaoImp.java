package com.iwonder.tea.sys.dao.imp;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.UUID;

import com.iwonder.tea.framework.dao.imp.BaseDaoImp;
import com.iwonder.tea.framework.util.StringUtil;
import com.iwonder.tea.sys.dao.IStaffDao;
import com.iwonder.tea.sys.entity.Staff;
import com.iwonder.tea.sys.view.StaffConditionView;
import com.iwonder.tea.sys.view.StaffQueryView;

public class StaffDaoImp extends BaseDaoImp implements IStaffDao {

	public ArrayList<StaffQueryView> list(StaffConditionView staffConditionView) {
		ArrayList<StaffQueryView> listStaff = new ArrayList<StaffQueryView>();

		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		try {
			// S1.加载Driver
			System.out.println("连接成功");

			// S3.获取statement(执行语句的对象)
			StringBuilder sql = new StringBuilder();
			sql.append("select * from sys_staff where 1=1 ");

			if (StringUtil.isNotEmpty(staffConditionView.getStaffName())) {
				sql.append(" and staff_name like ?");
			}
			if (StringUtil.isNotEmpty(staffConditionView.getStaffGender())) {
				sql.append(" and staff_gender = ?");
			}
			if (StringUtil.isNotEmpty(StringUtil.dateFormat(staffConditionView.getStaffBirthday()))) {
				sql.append(" and staff_birthday >= ?");
			}
			if (StringUtil.isNotEmpty(staffConditionView.getStaffStatus())) {
				sql.append(" and staff_status = ?");
			}
			preparedStatement = super.prepareStatement(sql.toString());
			int parameterIndex = 1;

			if (StringUtil.isNotEmpty(staffConditionView.getStaffName()))
				preparedStatement.setObject(parameterIndex++, "%" + staffConditionView.getStaffName() + "%");

			if (StringUtil.isNotEmpty(staffConditionView.getStaffGender()))
				preparedStatement.setObject(parameterIndex++, staffConditionView.getStaffGender());

			if (StringUtil.isNotEmpty(StringUtil.dateFormat(staffConditionView.getStaffBirthday())))
				preparedStatement.setObject(parameterIndex++, staffConditionView.getStaffBirthday());

			if (StringUtil.isNotEmpty(staffConditionView.getStaffStatus()))
				preparedStatement.setObject(parameterIndex++, staffConditionView.getStaffStatus());

			System.out.println("***SQL:" + sql);
			System.out.println("***param:" + "");
			// s4-1.执行sql
			resultSet = preparedStatement.executeQuery();
			super.addResultSet(resultSet);// 待封装
											// TODO..................

			// s4-1.遍历resultSet
			System.out.println("***SQL查询结果 begin");
			while (resultSet.next()) {
				StaffQueryView staff = new StaffQueryView();
				staff.setStaffId(resultSet.getString("staff_id"));
				staff.setStaffCode(resultSet.getString("staff_code"));
				staff.setStaffName(resultSet.getString("staff_name"));
				staff.setStaffGender(resultSet.getString("staff_gender"));
				staff.setStaffBirthday(resultSet.getDate("staff_birthday"));
				staff.setStaffMoblie(resultSet.getString("staff_moblie"));
				staff.setStaffAddress(resultSet.getString("staff_address"));
				staff.setStaffStatus(resultSet.getString("staff_status"));
				staff.setPwdLogin(resultSet.getString("pwd_login"));
				staff.setStaffInfo(resultSet.getString("staff_info"));

				listStaff.add(staff);
				System.out.println(staff.toString());
			}
			System.out.println("***SQL查询结果 end");
			System.out.println("操作成功");

			return listStaff;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("操作失败");
			throw new RuntimeException("查询失败");
		}
	}

	public ArrayList<Staff> list() {
		ArrayList<Staff> listStaff = new ArrayList<Staff>();

		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		try {
			// S1.加载Driver
			System.out.println("连接成功");

			// S3.获取statement(执行语句的对象)
			String sql = "select * from sys_staff";
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
				Staff staff = new Staff();
				staff.setStaffId(resultSet.getString("staff_id"));
				staff.setStaffCode(resultSet.getString("staff_code"));
				staff.setStaffName(resultSet.getString("staff_name"));
				staff.setStaffGender(resultSet.getString("staff_gender"));
				staff.setStaffBirthday(resultSet.getDate("staff_birthday"));
				staff.setStaffMoblie(resultSet.getString("staff_moblie"));
				staff.setStaffAddress(resultSet.getString("staff_address"));
				staff.setStaffStatus(resultSet.getString("staff_status"));
				staff.setPwdLogin(resultSet.getString("pwd_login"));
				staff.setStaffInfo(resultSet.getString("staff_info"));

				listStaff.add(staff);
				System.out.println(staff.toString());
			}
			System.out.println("***SQL查询结果 end");
			System.out.println("操作成功");

			return listStaff;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("操作失败");
			throw new RuntimeException("查询失败");
		}
	}

	public void delete(String staffId) {
		System.out.println("删除ID:" + staffId);

		PreparedStatement preparedStatement = null;

		try {

			System.out.println("连接成功");

			// S3.获取statement(执行语句的对象)
			String sql = "delete from sys_staff where staff_id = ?";
			preparedStatement = super.prepareStatement(sql);

			int paramIndex = 1;
			preparedStatement.setObject(paramIndex++, staffId);

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

	public Staff load(String staffId) {
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		Staff staff = new Staff();

		try {
			// S1.加载Driver
			System.out.println("连接成功");

			// S3.获取statement(执行语句的对象)
			String sql = "select * from sys_staff where staff_id = ?";
			preparedStatement = super.prepareStatement(sql);
			preparedStatement.setObject(1, staffId);

			// s4-1.执行sql
			resultSet = preparedStatement.executeQuery();
			super.addResultSet(resultSet);// 待封装
											// TODO..................

			System.out.println("***SQL:" + sql);
			System.out.println("***param:" + "");

			// s4-1.遍历resultSet

			System.out.println("***SQL查询结果 begin");
			if (resultSet.next()) {
				staff.setStaffId(resultSet.getString("staff_id"));
				staff.setStaffCode(resultSet.getString("staff_code"));
				staff.setStaffName(resultSet.getString("staff_name"));
				staff.setStaffGender(resultSet.getString("staff_gender"));
				staff.setStaffBirthday(resultSet.getDate("staff_birthday"));
				staff.setStaffMoblie(resultSet.getString("staff_moblie"));
				staff.setStaffAddress(resultSet.getString("staff_address"));
				staff.setStaffStatus(resultSet.getString("staff_status"));
				staff.setPwdLogin(resultSet.getString("pwd_login"));
				staff.setStaffInfo(resultSet.getString("staff_info"));
				System.out.println(staff.toString());
			} else {
				System.out.println("ID不存在");
				throw new RuntimeException("查询id失败");
			}
			System.out.println("***SQL查询结果 end");
			System.out.println("操作成功");
			return staff;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("操作失败");
			throw new RuntimeException("查询id失败");
		}
	}

	public void insert(Staff staff) {
		System.out.println("新增保存:" + staff.getStaffId());

		PreparedStatement preparedStatement = null;

		try {
			// S1.加载Driver
			System.out.println("连接成功");

			// S3.获取statement(执行语句的对象)
			String sql = "insert into sys_staff(staff_id,staff_code,staff_name,staff_gender,staff_birthday,staff_moblie,staff_address,staff_status,pwd_login,staff_info) values(?,?,?,?,?,?,?,?,?,?)";
			preparedStatement = super.prepareStatement(sql);

			int paramIndex = 1;

			String uuid = UUID.randomUUID().toString().replaceAll("-", "");
			preparedStatement.setObject(paramIndex++, uuid);
			preparedStatement.setObject(paramIndex++, staff.getStaffCode());
			preparedStatement.setObject(paramIndex++, staff.getStaffName());
			preparedStatement.setObject(paramIndex++, staff.getStaffGender());
			preparedStatement.setObject(paramIndex++, staff.getStaffBirthday());
			preparedStatement.setObject(paramIndex++, staff.getStaffMoblie());
			preparedStatement.setObject(paramIndex++, staff.getStaffAddress());
			preparedStatement.setObject(paramIndex++, staff.getStaffStatus());
			preparedStatement.setObject(paramIndex++, staff.getPwdLogin());
			preparedStatement.setObject(paramIndex++, staff.getStaffInfo());

			System.out.println("***SQL:" + sql);
			System.out.println("***param:uuid:" + uuid + ",staffCode:" + staff.getStaffCode());

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

	public void update(Staff staff) {
		PreparedStatement preparedStatement = null;

		try {
			// S1.加载Driver
			System.out.println("连接成功");

			// S3.获取statement(执行语句的对象)
			String sql = "update sys_staff set staff_code = ?,staff_name = ?,staff_gender = ?,staff_birthday = ?,staff_moblie = ?,staff_address = ?,staff_status = ?,pwd_login = ?,staff_info = ? where staff_id = ?";
			preparedStatement = super.prepareStatement(sql);

			int paramIndex = 1;
			preparedStatement.setObject(paramIndex++, staff.getStaffCode());
			preparedStatement.setObject(paramIndex++, staff.getStaffName());
			preparedStatement.setObject(paramIndex++, staff.getStaffGender());
			preparedStatement.setObject(paramIndex++, staff.getStaffBirthday());
			preparedStatement.setObject(paramIndex++, staff.getStaffMoblie());
			preparedStatement.setObject(paramIndex++, staff.getStaffAddress());
			preparedStatement.setObject(paramIndex++, staff.getStaffStatus());
			preparedStatement.setObject(paramIndex++, staff.getPwdLogin());
			preparedStatement.setObject(paramIndex++, staff.getStaffInfo());
			preparedStatement.setObject(paramIndex++, staff.getStaffId());
			System.out.println("***SQL:" + sql);
			System.out.println("***param:" + "staffId:" + staff.getStaffId());

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

		System.out.println(staff.toString());
	}

	@Override
	public Staff login(Staff staff) {
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			// S1.加载Driver
			System.out.println("连接成功");

			// S3.获取statement(执行语句的对象)
			String sql = "select * from sys_staff where staff_name = ? and pwd_login = ?";
			preparedStatement = super.prepareStatement(sql);
			preparedStatement.setObject(1, staff.getStaffName());
			preparedStatement.setObject(2, staff.getPwdLogin());

			// s4-1.执行sql
			resultSet = preparedStatement.executeQuery();
			super.addResultSet(resultSet);// 待封装
											// TODO..................

			System.out.println("***SQL:" + sql);
			System.out.println("***param:" + "");

			// s4-1.遍历resultSet

			System.out.println("***SQL查询结果 begin");
			if (resultSet.next()) {
				staff.setStaffId(resultSet.getString("staff_id"));
				staff.setStaffCode(resultSet.getString("staff_code"));
				staff.setStaffName(resultSet.getString("staff_name"));
				staff.setStaffGender(resultSet.getString("staff_gender"));
				staff.setStaffBirthday(resultSet.getDate("staff_birthday"));
				staff.setStaffMoblie(resultSet.getString("staff_moblie"));
				staff.setStaffAddress(resultSet.getString("staff_address"));
				staff.setStaffStatus(resultSet.getString("staff_status"));
				staff.setPwdLogin(resultSet.getString("pwd_login"));
				staff.setStaffInfo(resultSet.getString("staff_info"));
				System.out.println(staff.toString());
				return staff;
			} else {
				System.out.println("ID不存在");
				return null;
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("操作失败");
			throw new RuntimeException("查询失败");
		}
	}

}
