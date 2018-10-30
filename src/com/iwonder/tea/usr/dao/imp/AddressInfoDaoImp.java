package com.iwonder.tea.usr.dao.imp;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.UUID;

import com.iwonder.tea.framework.dao.imp.BaseDaoImp;
import com.iwonder.tea.framework.util.StringUtil;
import com.iwonder.tea.usr.dao.IAddressInfoDao;
import com.iwonder.tea.usr.entity.AddressInfo;
import com.iwonder.tea.usr.view.AddressInfoConditionView;
import com.iwonder.tea.usr.view.AddressInfoQueryView;

public class AddressInfoDaoImp extends BaseDaoImp implements IAddressInfoDao {

	public ArrayList<AddressInfoQueryView> list(AddressInfoConditionView addressInfoConditionView) {
		ArrayList<AddressInfoQueryView> listAddressInfo = new ArrayList<AddressInfoQueryView>();

		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		try {
			// S1.加载Driver
			System.out.println("连接成功");

			// S3.获取statement(执行语句的对象)
			StringBuilder sql = new StringBuilder();
			sql.append(" select usr_address_info.* , usr_user_info.name from usr_address_info ");
			sql.append(" JOIN usr_user_info");
			sql.append(" on usr_user_info.user_id = usr_address_info.user_id");

			if (StringUtil.isNotEmpty(addressInfoConditionView.getUserId())) {
				if (!addressInfoConditionView.getUserId().equals("0"))
					sql.append(" and usr_address_info.user_id = ?");
			}
			if (StringUtil.isNotEmpty(addressInfoConditionView.getAddressCont())) {
				sql.append(" and address_cont like ?");
			}
			if (StringUtil.isNotEmpty(addressInfoConditionView.getAddressDefault())) {
				sql.append(" and address_default = ?");
			}
			if (StringUtil.isNotEmpty(addressInfoConditionView.getReceiverName())) {
				sql.append(" and receiver_name like ?");
			}
			if (StringUtil.isNotEmpty(addressInfoConditionView.getReceiverPhone())) {
				sql.append(" and receiver_phone like ?");
			}

			preparedStatement = super.prepareStatement(sql.toString());
			int parameterIndex = 1;

			if (StringUtil.isNotEmpty(addressInfoConditionView.getUserId()))
				if (!addressInfoConditionView.getUserId().equals("0"))
					preparedStatement.setObject(parameterIndex++, addressInfoConditionView.getUserId());

			if (StringUtil.isNotEmpty(addressInfoConditionView.getAddressCont()))
				preparedStatement.setObject(parameterIndex++, "%" + addressInfoConditionView.getAddressCont() + "%");

			if (StringUtil.isNotEmpty(addressInfoConditionView.getAddressDefault()))
				preparedStatement.setObject(parameterIndex++, addressInfoConditionView.getAddressDefault());

			if (StringUtil.isNotEmpty(addressInfoConditionView.getReceiverName()))
				preparedStatement.setObject(parameterIndex++, "%" + addressInfoConditionView.getReceiverName() + "%");

			if (StringUtil.isNotEmpty(addressInfoConditionView.getReceiverPhone()))
				preparedStatement.setObject(parameterIndex++, "%" + addressInfoConditionView.getReceiverPhone() + "%");

			System.out.println("***SQL:" + sql);
			System.out.println("***param:" + "");
			// s4-1.执行sql
			resultSet = preparedStatement.executeQuery();
			super.addResultSet(resultSet);// 待封装

			// s4-1.遍历resultSet
			System.out.println("***SQL查询结果 begin");
			while (resultSet.next()) {
				AddressInfoQueryView addressInfo = new AddressInfoQueryView();
				addressInfo.setAddressId(resultSet.getString("address_id"));
				addressInfo.setName(resultSet.getString("name"));
				addressInfo.setAddressCont(resultSet.getString("address_cont"));
				addressInfo.setAddressDefault(resultSet.getString("address_default"));
				addressInfo.setReceiverName(resultSet.getString("receiver_name"));
				addressInfo.setReceiverPhone(resultSet.getString("receiver_phone"));

				listAddressInfo.add(addressInfo);

				System.out.println(addressInfo.toString());
			}
			System.out.println("***SQL查询结果 end");
			System.out.println("操作成功");

			return listAddressInfo;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("操作失败");
			throw new RuntimeException("查询失败");
		}
	}

	public ArrayList<AddressInfo> list() {
		ArrayList<AddressInfo> listAddressInfo = new ArrayList<AddressInfo>();

		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		try {
			// S1.加载Driver
			System.out.println("连接成功");

			// S3.获取statement(执行语句的对象)
			String sql = "select * from usr_address_info";
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
				AddressInfo addressInfo = new AddressInfo();
				addressInfo.setAddressId(resultSet.getString("address_id"));
				addressInfo.setUserId(resultSet.getString("user_id"));
				addressInfo.setAddressCont(resultSet.getString("address_cont"));
				addressInfo.setAddressDefault(resultSet.getString("address_default"));
				addressInfo.setReceiverName(resultSet.getString("receiver_name"));
				addressInfo.setReceiverPhone(resultSet.getString("receiver_phone"));

				listAddressInfo.add(addressInfo);

				System.out.println(addressInfo.toString());
			}
			System.out.println("***SQL查询结果 end");
			System.out.println("操作成功");

			return listAddressInfo;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("操作失败");
			throw new RuntimeException("查询失败");
		}
	}

	public void delete(String addressId) {
		System.out.println("删除ID:" + addressId);

		PreparedStatement preparedStatement = null;

		try {
			// S1.加载Driver
			System.out.println("连接成功");

			// S3.获取statement(执行语句的对象)
			String sql = "delete from usr_address_info where address_id = ?";
			preparedStatement = super.prepareStatement(sql);

			int paramIndex = 1;
			preparedStatement.setObject(paramIndex++, addressId);

			System.out.println("***SQL:" + sql);
			System.out.println("***param:" + "");

			// s4-1.执行sql
			int rowCount = preparedStatement.executeUpdate();

			System.out.println("***SQL查询结果 begin");
			System.out.println("影响行数:" + rowCount);
			if (rowCount == 0) {
				throw new RuntimeException("学生不存在:" + addressId);
			}
			System.out.println("***SQL查询结果 end");
			System.out.println("操作成功");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("删除失败");
			throw new RuntimeException("删除失败" + addressId);
		}
	}

	public void deleteByStudentId(String UserInfoId) {

		PreparedStatement preparedStatement = null;

		try {
			// S1.加载Driver
			System.out.println("连接成功");

			// S3.获取statement(执行语句的对象)
			String sql = "delete from usr_address_info where user_id = ?";
			preparedStatement = super.prepareStatement(sql);

			int paramIndex = 1;
			preparedStatement.setObject(paramIndex++, UserInfoId);

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
			throw new RuntimeException("删除失败");
		}
	}

	public AddressInfo load(String addressId) {
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		AddressInfo addressInfo = new AddressInfo();

		try {
			// S1.加载Driver
			System.out.println("连接成功");

			// S3.获取statement(执行语句的对象)
			String sql = "select * from usr_address_info where address_id = ?";
			preparedStatement = super.prepareStatement(sql);
			preparedStatement.setObject(1, addressId);

			// s4-1.执行sql
			resultSet = preparedStatement.executeQuery();
			super.addResultSet(resultSet);// 待封装
											// TODO..................

			System.out.println("***SQL:" + sql);
			System.out.println("***param:" + "");

			// s4-1.遍历resultSet

			System.out.println("***SQL查询结果 begin");
			if (resultSet.next()) {
				addressInfo.setAddressId(resultSet.getString("address_id"));
				addressInfo.setUserId(resultSet.getString("user_id"));
				addressInfo.setAddressCont(resultSet.getString("address_cont"));
				addressInfo.setAddressDefault(resultSet.getString("address_default"));
				addressInfo.setReceiverName(resultSet.getString("receiver_name"));
				addressInfo.setReceiverPhone(resultSet.getString("receiver_phone"));

				System.out.println(addressInfo.toString());
			} else {
				System.out.println("ID不存在");
				throw new RuntimeException("查询id失败");
			}
			System.out.println("***SQL查询结果 end");
			System.out.println("操作成功");
			return addressInfo;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("操作失败");
			throw new RuntimeException("查询id失败");
		}
	}

	public void insert(AddressInfo addressInfo) {
		System.out.println("新增保存:" + addressInfo.getAddressId());

		PreparedStatement preparedStatement = null;

		try {
			System.out.println("连接成功");

			// S3.获取statement(执行语句的对象)
			String sql = "insert into usr_address_info values(?,?,?,?,?,?)";
			preparedStatement = super.prepareStatement(sql);

			int paramIndex = 1;

			String uuid = UUID.randomUUID().toString().replaceAll("-", "");
			// String girlName = "aa2";
			preparedStatement.setObject(paramIndex++, uuid);
			preparedStatement.setObject(paramIndex++, addressInfo.getUserId());
			preparedStatement.setObject(paramIndex++, addressInfo.getAddressCont());
			preparedStatement.setObject(paramIndex++, addressInfo.getAddressDefault());
			preparedStatement.setObject(paramIndex++, addressInfo.getReceiverName());
			preparedStatement.setObject(paramIndex++, addressInfo.getReceiverPhone());

			System.out.println("***SQL:" + sql);
			System.out.println("***param:uuid:" + uuid + ",userId:" + addressInfo.getUserId());

			// s4-1.执行sql
			int rowCount = preparedStatement.executeUpdate();

			System.out.println("***SQL查询结果 begin");
			System.out.println("***影响行数:" + rowCount);
			System.out.println("***SQL查询结果 end");

			System.out.println("操作成功");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("操作失败");
			throw new RuntimeException("插入失败");
		}
	}
	

	public void update(AddressInfo addressInfo) {
		PreparedStatement preparedStatement = null;

		try {
			// S1.加载Driver
			System.out.println("连接成功");

			// S3.获取statement(执行语句的对象)
			String sql = "update usr_address_info set user_id = ?, address_cont = ? ,address_default = ? ,receiver_name = ? , receiver_phone = ? where address_id = ?";
			preparedStatement = super.prepareStatement(sql);

			int paramIndex = 1;
			preparedStatement.setObject(paramIndex++, addressInfo.getUserId());
			preparedStatement.setObject(paramIndex++, addressInfo.getAddressCont());
			preparedStatement.setObject(paramIndex++, addressInfo.getAddressDefault());
			preparedStatement.setObject(paramIndex++, addressInfo.getReceiverName());
			preparedStatement.setObject(paramIndex++, addressInfo.getReceiverPhone());
			preparedStatement.setObject(paramIndex++, addressInfo.getAddressId());
			System.out.println("***SQL:" + sql);
			System.out.println(addressInfo.toString());

			// s4-1.执行sql
			int rowCount = preparedStatement.executeUpdate();
			System.out.println("***SQL查询结果 begin");

			System.out.println("影响行数:" + rowCount);
			System.out.println("***SQL查询结果 end");
			System.out.println("操作成功");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("操作失败");
			throw new RuntimeException("修改失败");
		}

		System.out.println(addressInfo.toString());
	}

}
