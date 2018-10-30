package com.iwonder.tea.bas.dao.imp;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.UUID;

import com.iwonder.tea.bas.dao.IBrandDao;
import com.iwonder.tea.bas.entity.Brand;
import com.iwonder.tea.bas.view.BrandConditionView;
import com.iwonder.tea.framework.dao.imp.BaseDaoImp;
import com.iwonder.tea.framework.util.StringUtil;

public class BrandDaoImp extends BaseDaoImp implements IBrandDao {

	@Override
	public ArrayList<Brand> list() {
		ArrayList<Brand> listBrand = new ArrayList<>();
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			String sql = "select * from bas_brand";
			preparedStatement = super.prepareStatement(sql);
			System.out.println("***SQL:" + sql);
			resultSet = preparedStatement.executeQuery();
			super.addResultSet(resultSet);
			System.out.println("***SQL查询结果 begin");
			while (resultSet.next()) {
				Brand brand = new Brand();

				String brandId = resultSet.getString("brand_id");
				String name = resultSet.getString("name");
				String brandPic = resultSet.getString("brand_pic");

				brand.setBrandId(brandId);
				brand.setName(name);
				brand.setBrandPic(brandPic);

				listBrand.add(brand);
				System.out.println(brand);
			}
			System.out.println("***SQL查询结果 end");
			System.out.println("操作成功");

			return listBrand;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("操作失败");

			throw new RuntimeException("产品查询失败", e);
		}
	}

	@Override
	public ArrayList<Brand> list(BrandConditionView bcv) {
		ArrayList<Brand> listBrand = new ArrayList<>();
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			StringBuilder sql = new StringBuilder();
			sql.append("select * from bas_brand");

			if (StringUtil.isNotEmpty(bcv.getBrandName())) {
				sql.append(" where `name` like ?");
			}
			
			preparedStatement = super.prepareStatement(sql.toString());
			
			int parameterIndex = 1;
			if (StringUtil.isNotEmpty(bcv.getBrandName()))
				preparedStatement.setObject(parameterIndex++, "%" + bcv.getBrandName() + "%");
			
			System.out.println("***SQL:" + sql);
			resultSet = preparedStatement.executeQuery();
			super.addResultSet(resultSet);
			System.out.println("***SQL查询结果 begin");
			
			while (resultSet.next()) {
				Brand brand = new Brand();

				String brandId = resultSet.getString("brand_id");
				String name = resultSet.getString("name");
				String brandPic = resultSet.getString("brand_pic");

				brand.setBrandId(brandId);
				brand.setName(name);
				brand.setBrandPic(brandPic);

				listBrand.add(brand);
				System.out.println(brand);
			}
			System.out.println("***SQL查询结果 end");
			System.out.println("操作成功");

			return listBrand;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("操作失败");

			throw new RuntimeException("产品查询失败", e);
		}
	}

	@Override
	public void insert(Brand brand) {
		PreparedStatement preparedStatement = null;

		try {
			String sql = "insert into bas_brand values(?,?,?)";
			preparedStatement = super.prepareStatement(sql);
			String uuid = UUID.randomUUID().toString().replaceAll("-", "");
			int paramIndex = 1;
			preparedStatement.setObject(paramIndex++, uuid);
			preparedStatement.setObject(paramIndex++, brand.getName());
			preparedStatement.setObject(paramIndex++, brand.getBrandPic());

			System.out.println("***SQL:" + sql);
			System.out.println("***param:" + brand);
			int rowCount = preparedStatement.executeUpdate();

			System.out.println("***影响行数:" + rowCount);

			System.out.println("新增保存成功");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("新增保存失败");
		}
	}

	@Override
	public void update(Brand brand) {
		PreparedStatement preparedStatement = null;
		try {
			String sql = "update bas_brand set name = ?,brand_pic = ? where brand_id = ?";
			preparedStatement = super.prepareStatement(sql);

			int paramIndex = 1;

			preparedStatement.setObject(paramIndex++, brand.getName());
			preparedStatement.setObject(paramIndex++, brand.getBrandPic());
			preparedStatement.setObject(paramIndex++, brand.getBrandId());

			int rowCount = preparedStatement.executeUpdate();

			System.out.println("影响行数:" + rowCount);

			System.out.println("操作成功");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("操作失败");
		}
	}

	@Override
	public void delete(String brandId) {
		PreparedStatement preparedStatement = null;
		try {
			String sql = "delete from bas_brand where brand_id = ?";
			preparedStatement = super.prepareStatement(sql);

			int paramIndex = 1;
			preparedStatement.setObject(paramIndex++, brandId);

			int rowCount = preparedStatement.executeUpdate();
			System.out.println("影响行数:" + rowCount);
			if (rowCount == 0) {
				throw new RuntimeException("产品不存在:" + brandId);
			}
			System.out.println("操作成功");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("操作失败");
			throw new RuntimeException("删除产品失败", e);
		}
	}

	@Override
	public Brand load(String brandId) {
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		try {
			Brand brand = new Brand();

			String sql = "select * from bas_brand where brand_Id = ?";
			preparedStatement = super.prepareStatement(sql);
			preparedStatement.setObject(1, brandId);

			resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
				String name = resultSet.getString("name");
				String brandPic = resultSet.getString("brand_pic");
				brand.setBrandId(brandId);
				brand.setName(name);
				brand.setBrandPic(brandPic);
			} else {
				System.out.println("ID不存在");
				throw new RuntimeException("查询失败");
			}
			System.out.println("操作成功" + brand);
			return brand;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("操作失败");
			throw new RuntimeException("查询失败", e);
		}
	}

}
