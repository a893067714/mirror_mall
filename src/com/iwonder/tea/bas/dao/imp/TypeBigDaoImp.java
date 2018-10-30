package com.iwonder.tea.bas.dao.imp;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.UUID;

import com.iwonder.tea.bas.dao.ITypeBigDao;
import com.iwonder.tea.bas.entity.TypeBig;
import com.iwonder.tea.bas.view.TypeBigConditionView;
import com.iwonder.tea.framework.dao.imp.BaseDaoImp;
import com.iwonder.tea.framework.util.StringUtil;

public class TypeBigDaoImp extends BaseDaoImp implements ITypeBigDao {

	@Override
	public ArrayList<TypeBig> list() {
		ArrayList<TypeBig> listTypeBig = new ArrayList<>();
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			String sql = "select * from bas_type_big";
			preparedStatement = super.prepareStatement(sql);
			System.out.println("***SQL:" + sql);
			resultSet = preparedStatement.executeQuery();
			super.addResultSet(resultSet);
			System.out.println("***SQL查询结果 begin");
			while (resultSet.next()) {
				TypeBig typeBig = new TypeBig();

				String typeBigId = resultSet.getString("type_big_id");
				String typeBigName = resultSet.getString("type_big_name");

				typeBig.setTypeBigId(typeBigId);
				typeBig.setTypeBigName(typeBigName);

				listTypeBig.add(typeBig);
				System.out.println(typeBig);
			}
			System.out.println("***SQL查询结果 end");
			System.out.println("操作成功");

			return listTypeBig;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("操作失败");

			throw new RuntimeException("产品查询失败", e);
		}
	}

	@Override
	public ArrayList<TypeBig> list(TypeBigConditionView tbcv) {
		ArrayList<TypeBig> listTypeBig = new ArrayList<>();
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			StringBuilder sql = new StringBuilder();
			sql.append("select * from bas_type_big");

			if (StringUtil.isNotEmpty(tbcv.getTypeBigName())) {
				sql.append(" where type_big_name like ?");
			}
			
			preparedStatement = super.prepareStatement(sql.toString());
			
			int parameterIndex = 1;
			if (StringUtil.isNotEmpty(tbcv.getTypeBigName()))
				preparedStatement.setObject(parameterIndex++, "%" + tbcv.getTypeBigName() + "%");

			System.out.println("***SQL:" + sql);
			resultSet = preparedStatement.executeQuery();
			super.addResultSet(resultSet);
			System.out.println("***SQL查询结果 begin");
			while (resultSet.next()) {
				TypeBig typeBig = new TypeBig();

				String typeBigId = resultSet.getString("type_big_id");
				String typeBigName = resultSet.getString("type_big_name");

				typeBig.setTypeBigId(typeBigId);
				typeBig.setTypeBigName(typeBigName);

				listTypeBig.add(typeBig);
				System.out.println(typeBig);
			}
			System.out.println("***SQL查询结果 end");
			System.out.println("操作成功");

			return listTypeBig;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("操作失败");

			throw new RuntimeException("产品查询失败", e);
		}
	}

	@Override
	public void insert(TypeBig typeBig) {
		PreparedStatement preparedStatement = null;

		try {
			String sql = "insert into bas_type_big values(?,?)";
			preparedStatement = super.prepareStatement(sql);

			String uuid = UUID.randomUUID().toString().replaceAll("-", "");
			int paramIndex = 1;
			preparedStatement.setObject(paramIndex++, uuid);
			preparedStatement.setObject(paramIndex++, typeBig.getTypeBigName());

			System.out.println("***SQL:" + sql);
			System.out.println("***param:" + typeBig);
			int rowCount = preparedStatement.executeUpdate();

			System.out.println("***影响行数:" + rowCount);

			System.out.println("新增保存成功");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("新增保存失败");
		}
	}

	@Override
	public void update(TypeBig typeBig) {
		PreparedStatement preparedStatement = null;
		try {
			String sql = "update bas_type_big set type_big_name = ? where type_big_id = ?";
			preparedStatement = super.prepareStatement(sql);

			int paramIndex = 1;

			preparedStatement.setObject(paramIndex++, typeBig.getTypeBigName());
			preparedStatement.setObject(paramIndex++, typeBig.getTypeBigId());

			int rowCount = preparedStatement.executeUpdate();

			System.out.println("影响行数:" + rowCount);

			System.out.println("操作成功");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("操作失败");
		}
	}

	@Override
	public void delete(String typeBigId) {
		PreparedStatement preparedStatement = null;
		try {
			String sql = "delete from bas_type_big where type_big_id = ?";
			preparedStatement = super.prepareStatement(sql);

			int paramIndex = 1;
			preparedStatement.setObject(paramIndex++, typeBigId);

			int rowCount = preparedStatement.executeUpdate();
			System.out.println("影响行数:" + rowCount);
			if (rowCount == 0) {
				throw new RuntimeException("产品不存在:" + typeBigId);
			}
			System.out.println("操作成功");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("操作失败");
			throw new RuntimeException("删除产品失败", e);
		}
	}

	@Override
	public TypeBig load(String typeBigId) {
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		try {
			TypeBig typeBig = new TypeBig();

			String sql = "select * from bas_type_big where type_big_id = ?";
			preparedStatement = super.prepareStatement(sql);
			preparedStatement.setObject(1, typeBigId);

			resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
				String typeBigName = resultSet.getString("type_big_name");

				typeBig.setTypeBigId(typeBigId);
				typeBig.setTypeBigName(typeBigName);
			} else {
				System.out.println("ID不存在");
				throw new RuntimeException("查询失败");
			}
			System.out.println("操作成功" + typeBig);
			return typeBig;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("操作失败");
			throw new RuntimeException("查询失败", e);
		}
	}

}
