package com.iwonder.tea.usr.dao.imp;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.UUID;

import com.iwonder.tea.framework.dao.imp.BaseDaoImp;
import com.iwonder.tea.framework.util.StringUtil;
import com.iwonder.tea.usr.dao.IUserInfoDao;
import com.iwonder.tea.usr.entity.UserInfo;
import com.iwonder.tea.usr.view.UserInfoConditionView;
import com.iwonder.tea.usr.view.UserInfoQueryView;

public class UserInfoDaoImp extends BaseDaoImp implements IUserInfoDao {

	public ArrayList<UserInfo> list() {

		ArrayList<UserInfo> listUserInfo = new ArrayList<UserInfo>();

		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		try {
			// S1.加载Driver
			System.out.println("连接成功");

			// S3.获取statement(执行语句的对象)
			StringBuilder sql = new StringBuilder();
			sql.append("select * from usr_user_info ");

			preparedStatement = super.prepareStatement(sql.toString());
			int parameterIndex = 1;

			System.out.println("***SQL:" + sql);
			System.out.println("***param:" + "");
			// s4-1.执行sql
			resultSet = preparedStatement.executeQuery();
			super.addResultSet(resultSet);// 待封装
											// TODO..................

			// s4-1.遍历resultSet
			System.out.println("***SQL查询结果 begin");
			while (resultSet.next()) {
				UserInfoQueryView userInfo = new UserInfoQueryView();
				userInfo.setUserId(resultSet.getString("user_id"));
				userInfo.setUserCode(resultSet.getString("user_code"));
				userInfo.setName(resultSet.getString("name"));
				userInfo.setNickName(resultSet.getString("nickname"));
				userInfo.setGender(resultSet.getString("gender"));
				userInfo.setBirthday(resultSet.getDate("birthday"));
				userInfo.setIdCard(resultSet.getString("id_card"));
				userInfo.setMobile(resultSet.getString("mobile"));
				userInfo.setEmail(resultSet.getString("email"));
				userInfo.setPwdLogin(resultSet.getString("pwd_login"));
				userInfo.setBalance(resultSet.getBigDecimal("balance"));

				listUserInfo.add(userInfo);

				System.out.println(userInfo.toString());
			}
			System.out.println("***SQL查询结果 end");
			System.out.println("操作成功");

			return listUserInfo;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("操作失败");
			throw new RuntimeException("查询失败");
		}
	}

	public ArrayList<UserInfoQueryView> list(UserInfoConditionView userInfoConditionView) {

		ArrayList<UserInfoQueryView> listUserInfo = new ArrayList<UserInfoQueryView>();

		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		try {
			// S1.加载Driver
			System.out.println("连接成功");

			// S3.获取statement(执行语句的对象)
			StringBuilder sql = new StringBuilder();
			sql.append("select * from usr_user_info where 1=1 ");

			if (StringUtil.isNotEmpty(userInfoConditionView.getName())) {
				sql.append(" and name like ?");
			}
			if (StringUtil.isNotEmpty(userInfoConditionView.getNickName())) {
				sql.append(" and nickname like ?");
			}
			if (StringUtil.isNotEmpty(userInfoConditionView.getGender())) {
				sql.append(" and gender = ?");
			}
			if (StringUtil.isNotEmpty(userInfoConditionView.getIdCard())) {
				sql.append(" and id_card = ?");
			}
			if (StringUtil.isNotEmpty(userInfoConditionView.getMobile())) {
				sql.append(" and mobile like ?");
			}
			if (StringUtil.isNotEmpty(userInfoConditionView.getEmail())) {
				sql.append(" and email = ?");
			}
			if (StringUtil.isNotEmpty(StringUtil.bigDecimalToString(userInfoConditionView.getBalance()))) {
				sql.append(" and balance >= ?");
			}
			if (userInfoConditionView.getTimePrevious() != null && userInfoConditionView.getTimeLater() != null) {
				sql.append(" and birthday > ?");
				sql.append(" and birthday < ?");
			}

			preparedStatement = super.prepareStatement(sql.toString());
			int parameterIndex = 1;

			if (StringUtil.isNotEmpty(userInfoConditionView.getName()))
				preparedStatement.setObject(parameterIndex++, "%" + userInfoConditionView.getName() + "%");

			if (StringUtil.isNotEmpty(userInfoConditionView.getNickName()))
				preparedStatement.setObject(parameterIndex++, "%" + userInfoConditionView.getNickName() + "%");

			if (StringUtil.isNotEmpty(userInfoConditionView.getGender()))
				preparedStatement.setObject(parameterIndex++, userInfoConditionView.getGender());

			if (StringUtil.isNotEmpty(userInfoConditionView.getIdCard()))
				preparedStatement.setObject(parameterIndex++, userInfoConditionView.getIdCard());

			if (StringUtil.isNotEmpty(userInfoConditionView.getMobile()))
				preparedStatement.setObject(parameterIndex++, "%" + userInfoConditionView.getMobile() + "%");

			if (StringUtil.isNotEmpty(userInfoConditionView.getEmail()))
				preparedStatement.setObject(parameterIndex++, userInfoConditionView.getEmail());

			if (StringUtil.isNotEmpty(StringUtil.bigDecimalToString(userInfoConditionView.getBalance())))
				preparedStatement.setObject(parameterIndex++, userInfoConditionView.getBalance());

			if (userInfoConditionView.getTimePrevious() != null && userInfoConditionView.getTimeLater() != null) {
				preparedStatement.setObject(parameterIndex++, userInfoConditionView.getTimePrevious());
				preparedStatement.setObject(parameterIndex++, userInfoConditionView.getTimeLater());
			}

			System.out.println("***SQL:" + sql);
			System.out.println("***param:" + "");
			// s4-1.执行sql
			resultSet = preparedStatement.executeQuery();
			super.addResultSet(resultSet);// 待封装
											// TODO..................

			// s4-1.遍历resultSet
			System.out.println("***SQL查询结果 begin");
			while (resultSet.next()) {
				UserInfoQueryView userInfo = new UserInfoQueryView();
				userInfo.setUserId(resultSet.getString("user_id"));
				userInfo.setUserCode(resultSet.getString("user_code"));
				userInfo.setName(resultSet.getString("name"));
				userInfo.setNickName(resultSet.getString("nickname"));
				userInfo.setGender(resultSet.getString("gender"));
				userInfo.setBirthday(resultSet.getDate("birthday"));
				userInfo.setIdCard(resultSet.getString("id_card"));
				userInfo.setMobile(resultSet.getString("mobile"));
				userInfo.setEmail(resultSet.getString("email"));
				userInfo.setPwdLogin(resultSet.getString("pwd_login"));
				userInfo.setBalance(resultSet.getBigDecimal("balance"));

				listUserInfo.add(userInfo);
				System.out.println(userInfo.toString());
				System.out.println(userInfo.toString());

			}
			System.out.println("***SQL查询结果 end");
			System.out.println("操作成功");

			return listUserInfo;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("操作失败");
			throw new RuntimeException("查询失败");

		}
	}

	public void delete(String userId) {
		System.out.println("删除ID:" + userId);

		PreparedStatement preparedStatement = null;

		try {

			System.out.println("连接成功");

			// S3.获取statement(执行语句的对象)
			String sql = "delete from usr_user_info where user_id = ?";
			preparedStatement = super.prepareStatement(sql);

			int paramIndex = 1;
			preparedStatement.setObject(paramIndex++, userId);

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

	public UserInfo load(String userId) {
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		UserInfo userInfo = new UserInfo();

		try {
			// S1.加载Driver
			System.out.println("连接成功");

			// S3.获取statement(执行语句的对象)
			String sql = "select * from usr_user_info where user_id = ?";
			preparedStatement = super.prepareStatement(sql);
			preparedStatement.setObject(1, userId);

			// s4-1.执行sql
			resultSet = preparedStatement.executeQuery();
			super.addResultSet(resultSet);// 待封装
											// TODO..................

			System.out.println("***SQL:" + sql);
			System.out.println("***param:" + "");

			// s4-1.遍历resultSet

			System.out.println("***SQL查询结果 begin");
			if (resultSet.next()) {
				userInfo.setUserId(resultSet.getString("user_id"));
				userInfo.setUserCode(resultSet.getString("user_code"));
				userInfo.setName(resultSet.getString("name"));
				userInfo.setNickName(resultSet.getString("nickname"));
				userInfo.setGender(resultSet.getString("gender"));
				userInfo.setBirthday(resultSet.getDate("birthday"));
				userInfo.setIdCard(resultSet.getString("id_card"));
				userInfo.setMobile(resultSet.getString("mobile"));
				userInfo.setEmail(resultSet.getString("email"));
				userInfo.setPwdLogin(resultSet.getString("pwd_login"));
				userInfo.setBalance(resultSet.getBigDecimal("Balance"));
				System.out.println(userInfo.toString());
			} else {
				System.out.println("ID不存在");
				throw new RuntimeException("查询id失败");
			}
			System.out.println("***SQL查询结果 end");
			System.out.println("操作成功");
			return userInfo;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("操作失败");
			throw new RuntimeException("查询id失败");
		}
	}

	public void insert(UserInfo userInfo) {
		System.out.println("新增保存:" + userInfo.getName());

		PreparedStatement preparedStatement = null;

		try {
			// S1.加载Driver
			System.out.println("连接成功");

			// S3.获取statement(执行语句的对象)
			String sql = "insert into usr_user_info(user_id,user_code,name,nickname,gender,birthday,id_card,mobile,email,pwd_login,balance) values(?,?,?,?,?,?,?,?,?,?,?)";
			preparedStatement = super.prepareStatement(sql);

			int paramIndex = 1;

			String uuid = UUID.randomUUID().toString().replaceAll("-", "");
			preparedStatement.setObject(paramIndex++, uuid);
			preparedStatement.setObject(paramIndex++, userInfo.getUserCode());
			preparedStatement.setObject(paramIndex++, userInfo.getName());
			preparedStatement.setObject(paramIndex++, userInfo.getNickName());
			preparedStatement.setObject(paramIndex++, userInfo.getGender());
			preparedStatement.setObject(paramIndex++, userInfo.getBirthday());
			preparedStatement.setObject(paramIndex++, userInfo.getIdCard());
			preparedStatement.setObject(paramIndex++, userInfo.getMobile());
			preparedStatement.setObject(paramIndex++, userInfo.getEmail());
			preparedStatement.setObject(paramIndex++, userInfo.getPwdLogin());
			preparedStatement.setObject(paramIndex++, userInfo.getBalance());

			System.out.println("***SQL:" + sql);
			System.out.println("***param:uuid:" + uuid + ",userName:" + userInfo.getName());

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

	public void update(UserInfo userInfo) {
		PreparedStatement preparedStatement = null;

		try {
			// S1.加载Driver
			System.out.println("连接成功");

			// S3.获取statement(执行语句的对象)
			String sql = "update usr_user_info set user_code= ?, name = ? ,nickname = ?,gender = ?,birthday = ?,id_card = ?,mobile = ?,email = ?,pwd_login = ?,balance = ? where user_id = ?";
			preparedStatement = super.prepareStatement(sql);

			int paramIndex = 1;
			preparedStatement.setObject(paramIndex++, userInfo.getUserCode());
			System.out.println(userInfo.getUserCode());
			preparedStatement.setObject(paramIndex++, userInfo.getName());
			preparedStatement.setObject(paramIndex++, userInfo.getNickName());
			preparedStatement.setObject(paramIndex++, userInfo.getGender());
			preparedStatement.setObject(paramIndex++, userInfo.getBirthday());
			preparedStatement.setObject(paramIndex++, userInfo.getIdCard());
			preparedStatement.setObject(paramIndex++, userInfo.getMobile());
			preparedStatement.setObject(paramIndex++, userInfo.getEmail());
			preparedStatement.setObject(paramIndex++, userInfo.getPwdLogin());
			preparedStatement.setObject(paramIndex++, userInfo.getBalance());
			preparedStatement.setObject(paramIndex++, userInfo.getUserId());
			System.out.println("***SQL:" + sql);
			System.out.println("***param:" + "userName:" + userInfo.getName());

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

		System.out.println(userInfo.toString());
	}

	@Override
	public UserInfo login(UserInfo userInfo) {
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			String sql = "select * from usr_user_info where email = ? AND pwd_login =?";
			preparedStatement = super.prepareStatement(sql);

			int paramIndex = 1;
			preparedStatement.setObject(paramIndex++, userInfo.getEmail());
			preparedStatement.setObject(paramIndex++, userInfo.getPwdLogin());
			resultSet = preparedStatement.executeQuery();
			super.addResultSet(resultSet);
			if (resultSet.next()) {
				userInfo.setUserId(resultSet.getString("user_id"));
				userInfo.setUserCode(resultSet.getString("user_code"));
				userInfo.setName(resultSet.getString("name"));
				userInfo.setNickName(resultSet.getString("nickname"));
				userInfo.setGender(resultSet.getString("gender"));
				userInfo.setBirthday(resultSet.getDate("birthday"));
				userInfo.setIdCard(resultSet.getString("id_card"));
				userInfo.setMobile(resultSet.getString("mobile"));
				userInfo.setEmail(resultSet.getString("email"));
				userInfo.setPwdLogin(resultSet.getString("pwd_login"));
				userInfo.setBalance(resultSet.getBigDecimal("Balance"));
				System.out.println(userInfo.toString());
				return userInfo;
			} else {
				System.out.println("该用户不存在");
				return null;
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("操作失败");
			throw new RuntimeException("查询失败");
		}
	}
}
