package com.iwonder.tea.bas.dao.imp;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.UUID;

import com.iwonder.tea.bas.dao.ITypeDetailDao;
import com.iwonder.tea.bas.entity.TypeDetail;
import com.iwonder.tea.bas.view.TypeDetailConditionView;
import com.iwonder.tea.bas.view.TypeDetailQueryView;
import com.iwonder.tea.framework.dao.imp.BaseDaoImp;
import com.iwonder.tea.framework.util.StringUtil;

public class TypeDetailDaoImp extends BaseDaoImp implements ITypeDetailDao {

	@Override
	public ArrayList<TypeDetail> list() {
		ArrayList<TypeDetail> listTypeDetail = new ArrayList<>();
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			String sql = "select * from bas_type_detail";
			preparedStatement = super.prepareStatement(sql);
			System.out.println("***SQL:" + sql);
			resultSet = preparedStatement.executeQuery();
			super.addResultSet(resultSet);
			System.out.println("***SQL查询结果 begin");
			while (resultSet.next()) {
				TypeDetail typeDetail = new TypeDetail();

				String typeDtlId = resultSet.getString("type_dtl_id");
				String typeBigId = resultSet.getString("type_big_id");
				String typeDtlName = resultSet.getString("type_dtl_name");

				typeDetail.setTypeDtlId(typeDtlId);
				typeDetail.setTypeBigId(typeBigId);
				typeDetail.setTypeDtlName(typeDtlName);

				listTypeDetail.add(typeDetail);
				System.out.println(typeDetail);
			}
			System.out.println("***SQL查询结果 end");
			System.out.println("操作成功");

			return listTypeDetail;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("操作失败");

			throw new RuntimeException("产品查询失败", e);
		}
	}

	@Override
	public ArrayList<TypeDetailQueryView> list(TypeDetailConditionView tdcv) {
		ArrayList<TypeDetailQueryView> listTypeDetail = new ArrayList<>();
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			StringBuilder sql = new StringBuilder();
			sql.append("select a.* ,b.type_big_name");
			sql.append(" from bas_type_detail a");
			sql.append(" join bas_type_big b");
			sql.append(" on a.type_big_id = b.type_big_id");

			if (StringUtil.isNotEmpty(tdcv.getTypeDtlName())) {
				sql.append(" and type_dtl_name like ? ");
			}
			if (StringUtil.isNotEmpty(tdcv.getTypeBigId())) {
				if (!tdcv.getTypeBigId().equals("0"))
					sql.append(" and a.type_big_id = ?");
			}

			preparedStatement = super.prepareStatement(sql.toString());

			int parameterIndex = 1;
			if (StringUtil.isNotEmpty(tdcv.getTypeDtlName())) {
				preparedStatement.setObject(parameterIndex++, "%" + tdcv.getTypeDtlName() + "%");
			}
			if (StringUtil.isNotEmpty(tdcv.getTypeBigId())) {
				if (!tdcv.getTypeBigId().equals("0")) {
					preparedStatement.setObject(parameterIndex++, tdcv.getTypeBigId());
				}
			}

			System.out.println("***SQL:" + sql);
			resultSet = preparedStatement.executeQuery();
			super.addResultSet(resultSet);
			System.out.println("***SQL查询结果 begin");
			while (resultSet.next()) {
				TypeDetailQueryView typeDetail = new TypeDetailQueryView();

				String typeDtlId = resultSet.getString("type_dtl_id");
				String typeBigId = resultSet.getString("type_big_id");
				String typeBigName = resultSet.getString("type_big_name");
				String typeDtlName = resultSet.getString("type_dtl_name");

				typeDetail.setTypeDtlId(typeDtlId);
				typeDetail.setTypeBigId(typeBigId);
				typeDetail.setTypeBigName(typeBigName);
				typeDetail.setTypeDtlName(typeDtlName);

				listTypeDetail.add(typeDetail);
				System.out.println(typeDetail);
			}
			System.out.println("***SQL查询结果 end");
			System.out.println("操作成功");

			return listTypeDetail;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("操作失败");

			throw new RuntimeException("产品查询失败", e);
		}
	}

	@Override
	public void insert(TypeDetail typeDetail) {
		PreparedStatement preparedStatement = null;

		try {
			String sql = "insert into bas_type_detail(type_dtl_id,type_big_id,type_dtl_name) values(?,?,?)";
			preparedStatement = super.prepareStatement(sql);
			String uuid = UUID.randomUUID().toString().replaceAll("-", "");
			int paramIndex = 1;
			preparedStatement.setObject(paramIndex++, uuid);
			preparedStatement.setObject(paramIndex++, typeDetail.getTypeBigId());
			preparedStatement.setObject(paramIndex++, typeDetail.getTypeDtlName());

			System.out.println("***SQL:" + sql);
			System.out.println("***param:" + typeDetail);
			int rowCount = preparedStatement.executeUpdate();

			System.out.println("***影响行数:" + rowCount);

			System.out.println("新增保存成功");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("新增保存失败");
		}
	}

	@Override
	public void update(TypeDetail typeDetail) {
		PreparedStatement preparedStatement = null;
		try {
			String sql = "update bas_type_detail set type_big_id = ?,type_dtl_name = ? where type_dtl_id = ?";
			preparedStatement = super.prepareStatement(sql);

			int paramIndex = 1;
			preparedStatement.setObject(paramIndex++, typeDetail.getTypeBigId());
			preparedStatement.setObject(paramIndex++, typeDetail.getTypeDtlName());
			preparedStatement.setObject(paramIndex++, typeDetail.getTypeDtlId());
			int rowCount = preparedStatement.executeUpdate();

			System.out.println("影响行数:" + rowCount);

			System.out.println("操作成功");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("操作失败");
		}
	}

	@Override
	public void delete(String typeDetailId) {
		PreparedStatement preparedStatement = null;
		try {
			String sql = "delete from bas_type_detail where type_dtl_id = ?";
			preparedStatement = super.prepareStatement(sql);

			int paramIndex = 1;
			preparedStatement.setObject(paramIndex++, typeDetailId);

			int rowCount = preparedStatement.executeUpdate();
			System.out.println("影响行数:" + rowCount);
			if (rowCount == 0) {
				throw new RuntimeException("产品不存在:" + typeDetailId);
			}
			System.out.println("操作成功");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("操作失败");
			throw new RuntimeException("删除产品失败", e);
		}
	}

	@Override
	public TypeDetail load(String typeDtlId) {
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		try {
			TypeDetail typeDetail = new TypeDetail();

			String sql = "select * from bas_type_detail where type_dtl_id = ?";
			preparedStatement = super.prepareStatement(sql);
			preparedStatement.setObject(1, typeDtlId);

			resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
				String typeBigId = resultSet.getString("type_big_id");
				String typeDtlName = resultSet.getString("type_dtl_name");

				typeDetail.setTypeDtlId(typeDtlId);
				typeDetail.setTypeBigId(typeBigId);
				typeDetail.setTypeDtlName(typeDtlName);

			} else {
				System.out.println("ID不存在");
				throw new RuntimeException("查询失败");
			}
			System.out.println("操作成功" + typeDetail);
			return typeDetail;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("操作失败");
			throw new RuntimeException("查询失败", e);
		}
	}

}
