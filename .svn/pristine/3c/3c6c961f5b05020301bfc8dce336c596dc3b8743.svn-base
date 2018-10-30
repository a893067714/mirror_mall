package com.iwonder.tea.bas.dao.imp;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.UUID;

import com.iwonder.tea.bas.dao.IColorDao;
import com.iwonder.tea.bas.entity.Color;
import com.iwonder.tea.bas.view.ColorConditionView;
import com.iwonder.tea.framework.dao.imp.BaseDaoImp;
import com.iwonder.tea.framework.util.StringUtil;

public class ColorDaoImp extends BaseDaoImp implements IColorDao {

	@Override
	public ArrayList<Color> list() {
		ArrayList<Color> listColor = new ArrayList<>();
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			String sql = "select * from bas_color";
			preparedStatement = super.prepareStatement(sql);
			System.out.println("***SQL:" + sql);
			resultSet = preparedStatement.executeQuery();
			super.addResultSet(resultSet);
			System.out.println("***SQL查询结果 begin");
			while (resultSet.next()) {
				Color color = new Color();

				String colorId = resultSet.getString("color_id");
				String colorValue = resultSet.getString("color_value");

				color.setColorId(colorId);
				color.setColorValue(colorValue);

				listColor.add(color);
				System.out.println(color);
			}
			System.out.println("***SQL查询结果 end");
			System.out.println("操作成功");

			return listColor;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("操作失败");

			throw new RuntimeException("产品查询失败", e);
		}
	}
	
	@Override
	public ArrayList<Color> list(ColorConditionView ccv) {
		ArrayList<Color> listColor = new ArrayList<>();
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			
			StringBuilder sql = new StringBuilder();
			sql.append("select * from bas_color");
			
			if (StringUtil.isNotEmpty(ccv.getColorValue())) {
				sql.append(" where color_value like ?");
			}
			preparedStatement = super.prepareStatement(sql.toString());
			int parameterIndex = 1;
			if (StringUtil.isNotEmpty(ccv.getColorValue()))
				preparedStatement.setObject(parameterIndex++, "%" + ccv.getColorValue() + "%");
			
			System.out.println("***SQL:" + sql);
			resultSet = preparedStatement.executeQuery();
			super.addResultSet(resultSet);
			System.out.println("***SQL查询结果 begin");
			while (resultSet.next()) {
				Color color = new Color();

				String colorId = resultSet.getString("color_id");
				String colorValue = resultSet.getString("color_value");

				color.setColorId(colorId);
				color.setColorValue(colorValue);

				listColor.add(color);
				System.out.println(color);
			}
			System.out.println("***SQL查询结果 end");
			System.out.println("操作成功");

			return listColor;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("操作失败");

			throw new RuntimeException("产品查询失败", e);
		}
	}


	@Override
	public void insert(Color color) {
		PreparedStatement preparedStatement = null;

		try {
			String sql = "insert into bas_color values(?,?)";
			preparedStatement = super.prepareStatement(sql);
			String uuid = UUID.randomUUID().toString().replaceAll("-", "");
			int paramIndex = 1;
			preparedStatement.setObject(paramIndex++, uuid);
			preparedStatement.setObject(paramIndex++, color.getColorValue());

			System.out.println("***SQL:" + sql);
			System.out.println("***param:" + color);
			int rowCount = preparedStatement.executeUpdate();

			System.out.println("***影响行数:" + rowCount);

			System.out.println("新增保存成功");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("新增保存失败");
		}
	}

	@Override
	public void update(Color color) {
		PreparedStatement preparedStatement = null;
		try {
			String sql = "update bas_color set color_value = ? where color_id = ?";
			preparedStatement = super.prepareStatement(sql);

			int paramIndex = 1;
			
			preparedStatement.setObject(paramIndex++, color.getColorValue());
			preparedStatement.setObject(paramIndex++, color.getColorId());

			int rowCount = preparedStatement.executeUpdate();

			System.out.println("影响行数:" + rowCount);

			System.out.println("操作成功");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("操作失败");
		}
	}

	@Override
	public void delete(String colorId) {
		PreparedStatement preparedStatement = null;
		try {
			String sql = "delete from bas_color where color_id = ?";
			preparedStatement = super.prepareStatement(sql);

			int paramIndex = 1;
			preparedStatement.setObject(paramIndex++, colorId);

			int rowCount = preparedStatement.executeUpdate();
			System.out.println("影响行数:" + rowCount);
			if (rowCount == 0) {
				throw new RuntimeException("产品不存在:" + colorId);
			}
			System.out.println("操作成功");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("操作失败");
			throw new RuntimeException("删除产品失败", e);
		}
	}

	@Override
	public Color load(String colorId) {
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		try {
			Color color = new Color();

			String sql = "select * from bas_color where color_id = ?";
			preparedStatement = super.prepareStatement(sql);
			preparedStatement.setObject(1, colorId);

			resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
				String colorName = resultSet.getString("color_value");

				color.setColorId(colorId);
				color.setColorValue(colorName);
			} else {
				System.out.println("ID不存在");
				throw new RuntimeException("查询失败");
			}
			System.out.println("操作成功" + color);
			return color;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("操作失败");
			throw new RuntimeException("查询失败", e);
		}
	}

	
}
