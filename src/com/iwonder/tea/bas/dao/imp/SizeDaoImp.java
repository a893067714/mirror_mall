package com.iwonder.tea.bas.dao.imp;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.UUID;

import com.iwonder.tea.bas.dao.ISizeDao;
import com.iwonder.tea.bas.entity.Size;
import com.iwonder.tea.bas.view.SizeConditionView;
import com.iwonder.tea.framework.dao.imp.BaseDaoImp;
import com.iwonder.tea.framework.util.StringUtil;

public class SizeDaoImp extends BaseDaoImp implements ISizeDao {

	@Override
	public ArrayList<Size> list() {
		ArrayList<Size> listSize = new ArrayList<>();
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			String sql = "select * from bas_size";
			preparedStatement = super.prepareStatement(sql);
			System.out.println("***SQL:" + sql);
			resultSet = preparedStatement.executeQuery();
			super.addResultSet(resultSet);
			System.out.println("***SQL查询结果 begin");
			while (resultSet.next()) {
				Size size = new Size();

				String sizeId = resultSet.getString("size_id");
				String sizeValue = resultSet.getString("size_value");

				size.setSizeId(sizeId);
				size.setSizeValue(sizeValue);

				listSize.add(size);
				System.out.println(size);
			}
			System.out.println("***SQL查询结果 end");
			System.out.println("操作成功");

			return listSize;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("操作失败");

			throw new RuntimeException("产品查询失败", e);
		}
	}

	
	@Override
	public ArrayList<Size> list(SizeConditionView scv) {
		ArrayList<Size> listSize = new ArrayList<>();
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			StringBuilder sql = new StringBuilder();
			sql.append("select * from bas_size");
			
			if (StringUtil.isNotEmpty(scv.getSizeValue())) {
				sql.append(" where size_value like ?");
			}
			
			preparedStatement = super.prepareStatement(sql.toString());
			
			int parameterIndex = 1;
			if (StringUtil.isNotEmpty(scv.getSizeValue()))
				preparedStatement.setObject(parameterIndex++, "%" + scv.getSizeValue() + "%");
			
			System.out.println("***SQL:" + sql);
			resultSet = preparedStatement.executeQuery();
			super.addResultSet(resultSet);
			System.out.println("***SQL查询结果 begin");
			while (resultSet.next()) {
				Size size = new Size();

				String sizeId = resultSet.getString("size_id");
				String sizeValue = resultSet.getString("size_value");

				size.setSizeId(sizeId);
				size.setSizeValue(sizeValue);

				listSize.add(size);
				System.out.println(size);
			}
			System.out.println("***SQL查询结果 end");
			System.out.println("操作成功");

			return listSize;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("操作失败");

			throw new RuntimeException("产品查询失败", e);
		}
	}
	@Override
	public void insert(Size size) {
		PreparedStatement preparedStatement = null;

		try {
			String sql = "insert into bas_size values(?,?)";
			preparedStatement = super.prepareStatement(sql);
			String uuid = UUID.randomUUID().toString().replaceAll("-", "");
			int paramIndex = 1;
			preparedStatement.setObject(paramIndex++, uuid);
			preparedStatement.setObject(paramIndex++, size.getSizeValue());

			System.out.println("***SQL:" + sql);
			System.out.println("***param:" + size);
			int rowCount = preparedStatement.executeUpdate();

			System.out.println("***影响行数:" + rowCount);

			System.out.println("新增保存成功");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("新增保存失败");
		}
	}

	@Override
	public void update(Size size) {
		PreparedStatement preparedStatement = null;
		try {
			String sql = "update bas_size set size_value = ? where size_id = ?";
			preparedStatement = super.prepareStatement(sql);

			int paramIndex = 1;
			preparedStatement.setObject(paramIndex++, size.getSizeValue());
			preparedStatement.setObject(paramIndex++, size.getSizeId());

			int rowCount = preparedStatement.executeUpdate();

			System.out.println("影响行数:" + rowCount);

			System.out.println("操作成功");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("操作失败");
		}
	}

	@Override
	public void delete(String sizeId) {
		PreparedStatement preparedStatement = null;
		try {
			String sql = "delete from bas_size where size_id = ?";
			preparedStatement = super.prepareStatement(sql);

			int paramIndex = 1;
			preparedStatement.setObject(paramIndex++, sizeId);

			int rowCount = preparedStatement.executeUpdate();
			System.out.println("影响行数:" + rowCount);
			if (rowCount == 0) {
				throw new RuntimeException("产品不存在:" + sizeId);
			}
			System.out.println("操作成功");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("操作失败");
			throw new RuntimeException("删除产品失败", e);
		}
	}

	@Override
	public Size load(String sizeId) {
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		try {
			Size size = new Size();

			String sql = "select * from bas_size where size_id = ?";
			preparedStatement = super.prepareStatement(sql);
			preparedStatement.setObject(1, sizeId);

			resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
				String sizeValue = resultSet.getString("size_value");

				size.setSizeId(sizeId);
				size.setSizeValue(sizeValue);
			} else {
				System.out.println("ID不存在");
				throw new RuntimeException("查询失败");
			}
			System.out.println("操作成功" + size);
			return size;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("操作失败");
			throw new RuntimeException("查询失败", e);
		}
	}

}
