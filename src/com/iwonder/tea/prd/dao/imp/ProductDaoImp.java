package com.iwonder.tea.prd.dao.imp;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

import com.iwonder.tea.framework.dao.imp.BaseDaoImp;
import com.iwonder.tea.framework.util.StringUtil;
import com.iwonder.tea.prd.dao.IProductDao;
import com.iwonder.tea.prd.entity.Product;
import com.iwonder.tea.prd.view.ProductConditionView;
import com.iwonder.tea.prd.view.ProductQueryView;

public class ProductDaoImp extends BaseDaoImp implements IProductDao {

	@Override
	public ArrayList<Product> list() {
		ArrayList<Product> listProduct = new ArrayList<>();
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			String sql = "select * from prd_product";
			preparedStatement = super.prepareStatement(sql);
			System.out.println("***SQL:" + sql);
			resultSet = preparedStatement.executeQuery();
			super.addResultSet(resultSet);
			System.out.println("***SQL查询结果 begin");
			while (resultSet.next()) {
				Product product = new Product();

				String productId = resultSet.getString("product_id");
				String typeDtlId = resultSet.getString("type_dtl_id");
				String brandId = resultSet.getString("brand_id");
				String name = resultSet.getString("name");
				Date timeToMarket = resultSet.getDate("time_to_market");
				String introduce = resultSet.getString("introduce");
				String shelfStat = resultSet.getString("shelf_stat");
				Integer evalGoodQty = resultSet.getInt("eval_good_qty");
				Integer evalGeneralQty = resultSet.getInt("eval_general_qty");
				Integer evalBadQty = resultSet.getInt("eval_bad_qty");
				Integer saleQty = resultSet.getInt("sale_qty");
				String picture = resultSet.getString("picture");
				String majorSkuCode = resultSet.getString("major_sku_code");

				product.setProductId(productId);
				product.setTypeDtlId(typeDtlId);
				product.setBrandId(brandId);
				product.setName(name);
				product.setTimeToMarket(timeToMarket);
				product.setIntroduce(introduce);
				product.setShelfStat(shelfStat);
				product.setEvalGoodQty(evalGoodQty);
				product.setEvalGeneralQty(evalGeneralQty);
				product.setEvalBadQty(evalBadQty);
				product.setSaleQty(saleQty);
				product.setPicture(picture);
				product.setMajorSkuCode(majorSkuCode);

				listProduct.add(product);

				System.out.println("ID:" + productId + "," + "name:" + name);
			}
			System.out.println("***SQL查询结果 end");
			System.out.println("操作成功");

			return listProduct;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("操作失败");

			throw new RuntimeException("产品查询失败", e);
		}
	}

	@Override
	public ArrayList<ProductQueryView> list(ProductConditionView pcv) {

		ArrayList<ProductQueryView> listProduct = new ArrayList<>();
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			StringBuilder sql = new StringBuilder();
			sql.append(
					"select a.*,a.`name` as product_name,b.`name` as brand_name,c.type_dtl_name,d.dictionary_detail_label");
			sql.append(" from prd_product a");
			sql.append(" join bas_brand b");
			sql.append(" on a.brand_id= b.brand_id");
			sql.append(" join bas_type_detail c");
			sql.append(" on a.type_dtl_id = c.type_dtl_id");
			sql.append(" join bas_data_dictionary_detail d");
			sql.append(" on a.shelf_stat = d.dictionary_detail_code");

			if (StringUtil.isNotEmpty(pcv.getProductName())) {
				sql.append(" and a.`name` like ? ");
			}

			if (StringUtil.isNotEmpty(pcv.getBrandId())) {
				if (!pcv.getBrandId().equals("0"))
					sql.append(" and b.brand_id = ?");
			}

			if (StringUtil.isNotEmpty(pcv.getTypeDtlId())) {
				if (!pcv.getTypeDtlId().equals("0"))
					sql.append(" and c.type_dtl_id = ?");
			}

			if (StringUtil.isNotEmpty(pcv.getShelfStat())) {
				if (!pcv.getShelfStat().equals("0"))
					sql.append(" and a.shelf_stat = ?");
			}
			if (pcv.getTimePrevious() != null && pcv.getTimeLater() != null) {
				sql.append(" and time_to_market >= ?");
				sql.append(" and time_to_market <= ?");
			}

			preparedStatement = super.prepareStatement(sql.toString());

			int parameterIndex = 1;

			if (StringUtil.isNotEmpty(pcv.getProductName()))
				preparedStatement.setObject(parameterIndex++, "%" + pcv.getProductName() + "%");

			if (StringUtil.isNotEmpty(pcv.getBrandId())) {
				if (!pcv.getBrandId().equals("0"))
					preparedStatement.setObject(parameterIndex++, pcv.getBrandId());
			}

			if (StringUtil.isNotEmpty(pcv.getTypeDtlId())) {
				if (!pcv.getTypeDtlId().equals("0"))
					preparedStatement.setObject(parameterIndex++, pcv.getTypeDtlId());
			}
			if (StringUtil.isNotEmpty(pcv.getShelfStat())) {
				if (!pcv.getShelfStat().equals("0"))
					preparedStatement.setObject(parameterIndex++, pcv.getShelfStat());
			}
			if (pcv.getTimePrevious() != null && pcv.getTimeLater() != null) {
				preparedStatement.setObject(parameterIndex++, pcv.getTimePrevious());
				preparedStatement.setObject(parameterIndex++, pcv.getTimeLater());
			}

			System.out.println("***SQL:" + sql);
			resultSet = preparedStatement.executeQuery();
			super.addResultSet(resultSet);
			System.out.println("***SQL查询结果 begin");
			while (resultSet.next()) {
				ProductQueryView product = new ProductQueryView();

				String productId = resultSet.getString("product_id");
				String typeDtlId = resultSet.getString("type_dtl_id");
				String brandId = resultSet.getString("brand_id");
				String productName = resultSet.getString("product_name");
				String brandName = resultSet.getString("brand_name");
				String typeDtlName = resultSet.getString("type_dtl_name");
				Date timeToMarket = resultSet.getDate("time_to_market");
				String introduce = resultSet.getString("introduce");
				String shelfStat = resultSet.getString("shelf_stat");
				Integer evalGoodQty = resultSet.getInt("eval_good_qty");
				Integer evalGeneralQty = resultSet.getInt("eval_general_qty");
				Integer evalBadQty = resultSet.getInt("eval_bad_qty");
				Integer saleQty = resultSet.getInt("sale_qty");
				String picture = resultSet.getString("picture");
				String majorSkuCode = resultSet.getString("major_sku_code");
				String dictionaryDetailLabel = resultSet.getString("dictionary_detail_label");

				product.setProductId(productId);
				product.setTypeDtlId(typeDtlId);
				product.setBrandId(brandId);
				product.setName(productName);
				product.setBrandName(brandName);
				product.setTypeDtlName(typeDtlName);
				product.setTimeToMarket(timeToMarket);
				product.setIntroduce(introduce);
				product.setShelfStat(shelfStat);
				product.setEvalGoodQty(evalGoodQty);
				product.setEvalGeneralQty(evalGeneralQty);
				product.setEvalBadQty(evalBadQty);
				product.setSaleQty(saleQty);
				product.setPicture(picture);
				product.setMajorSkuCode(majorSkuCode);
				product.setDictionaryDetailLabel(dictionaryDetailLabel);

				listProduct.add(product);

				System.out.println(product);
			}
			System.out.println("***SQL查询结果 end");
			System.out.println("操作成功");

			return listProduct;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("操作失败");

			throw new RuntimeException("产品查询失败", e);
		}
	}

	@Override
	public void insert(Product product) {
		PreparedStatement preparedStatement = null;

		try {
			String sql = "insert into prd_product values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
			preparedStatement = super.prepareStatement(sql);

			int paramIndex = 1;
			String uuid = UUID.randomUUID().toString().replaceAll("-", "");
			product.setProductId(uuid);
			preparedStatement.setObject(paramIndex++, uuid);
			preparedStatement.setObject(paramIndex++, product.getTypeDtlId());
			preparedStatement.setObject(paramIndex++, product.getBrandId());
			preparedStatement.setObject(paramIndex++, product.getName());
			preparedStatement.setObject(paramIndex++, product.getTimeToMarket());
			preparedStatement.setObject(paramIndex++, product.getIntroduce());
			preparedStatement.setObject(paramIndex++, product.getShelfStat());
			preparedStatement.setObject(paramIndex++, product.getEvalGoodQty());
			preparedStatement.setObject(paramIndex++, product.getEvalGeneralQty());
			preparedStatement.setObject(paramIndex++, product.getEvalBadQty());
			preparedStatement.setObject(paramIndex++, product.getSaleQty());
			preparedStatement.setObject(paramIndex++, product.getPicture());
			preparedStatement.setObject(paramIndex++, product.getMajorSkuCode());

			System.out.println("***SQL:" + sql);
			System.out.println("***param:" + product);

			int rowCount = preparedStatement.executeUpdate();

			System.out.println("***影响行数:" + rowCount);

			System.out.println("新增保存成功");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("新增保存失败");
		}
	}

	@Override
	public void update(Product product) {
		PreparedStatement preparedStatement = null;
		try {
			String sql = "update prd_product set name = ?,type_dtl_id = ?,brand_id = ?,time_to_market = ?,introduce = ?,shelf_stat = ?,eval_good_qty = ?,eval_general_qty = ?,eval_bad_qty = ?,sale_qty = ?,picture = ? ,major_sku_code = ?  where product_id = ?";
			preparedStatement = super.prepareStatement(sql);

			int paramIndex = 1;
			preparedStatement.setObject(paramIndex++, product.getName());
			preparedStatement.setObject(paramIndex++, product.getTypeDtlId());
			preparedStatement.setObject(paramIndex++, product.getBrandId());
			preparedStatement.setObject(paramIndex++, product.getTimeToMarket());
			preparedStatement.setObject(paramIndex++, product.getIntroduce());
			preparedStatement.setObject(paramIndex++, product.getShelfStat());
			preparedStatement.setObject(paramIndex++, product.getEvalGoodQty());
			preparedStatement.setObject(paramIndex++, product.getEvalGeneralQty());
			preparedStatement.setObject(paramIndex++, product.getEvalBadQty());
			preparedStatement.setObject(paramIndex++, product.getSaleQty());
			preparedStatement.setObject(paramIndex++, product.getPicture());
			preparedStatement.setObject(paramIndex++, product.getMajorSkuCode());
			preparedStatement.setObject(paramIndex++, product.getProductId());

			int rowCount = preparedStatement.executeUpdate();

			System.out.println("影响行数:" + rowCount);

			System.out.println("操作成功");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("操作失败");
		}
	}

	@Override
	public void delete(String productId) {
		PreparedStatement preparedStatement = null;
		try {
			String sql = "delete from prd_product where product_id = ?";
			preparedStatement = super.prepareStatement(sql);

			int paramIndex = 1;
			preparedStatement.setObject(paramIndex++, productId);

			int rowCount = preparedStatement.executeUpdate();
			System.out.println("影响行数:" + rowCount);
			if (rowCount == 0) {
				throw new RuntimeException("产品不存在:" + productId);
			}
			System.out.println("操作成功");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("操作失败");
			throw new RuntimeException("删除产品失败", e);
		}
	}

	@Override
	public Product load(String productId) {
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		try {
			Product product = new Product();

			String sql = "select * from prd_product where product_id = ?";
			preparedStatement = super.prepareStatement(sql);
			preparedStatement.setObject(1, productId);

			resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
				String typeDtlId = resultSet.getString("type_dtl_id");
				String brandId = resultSet.getString("brand_id");
				String name = resultSet.getString("name");
				Date timeToMarket = resultSet.getDate("time_to_market");
				String introduce = resultSet.getString("introduce");
				String shelfStat = resultSet.getString("shelf_stat");
				Integer evalGoodQty = resultSet.getInt("eval_good_qty");
				Integer evalGeneralQty = resultSet.getInt("eval_general_qty");
				Integer evalBadQty = resultSet.getInt("eval_bad_qty");
				Integer saleQty = resultSet.getInt("sale_qty");
				String picture = resultSet.getString("picture");
				String majorSkuCode = resultSet.getString("major_sku_code");

				product.setProductId(productId);
				product.setTypeDtlId(typeDtlId);
				product.setBrandId(brandId);
				product.setName(name);
				product.setTimeToMarket(timeToMarket);
				product.setIntroduce(introduce);
				product.setShelfStat(shelfStat);
				product.setEvalGoodQty(evalGoodQty);
				product.setEvalGeneralQty(evalGeneralQty);
				product.setEvalBadQty(evalBadQty);
				product.setSaleQty(saleQty);
				product.setPicture(picture);
				product.setMajorSkuCode(majorSkuCode);

			} else {
				System.out.println("ID不存在");
				throw new RuntimeException("查询失败");
			}

			System.out.println("操作成功" + product);
			return product;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("操作失败");
			throw new RuntimeException("查询失败", e);
		}
	}

	@Override
	public ArrayList<ProductQueryView> list(ProductConditionView pcv, int pageIndex, int pageSize) {

		ArrayList<ProductQueryView> listProduct = new ArrayList<>();
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			StringBuilder sql = new StringBuilder();
			sql.append(
					" select a.*,a.`name` as product_name,b.`name` as brand_name,c.type_dtl_name,d.dictionary_detail_label");
			sql.append(" from prd_product a");
			sql.append(" join bas_brand b");
			sql.append(" on a.brand_id= b.brand_id");
			sql.append(" join bas_type_detail c");
			sql.append(" on a.type_dtl_id = c.type_dtl_id");
			sql.append(" join bas_data_dictionary_detail d");
			sql.append(" on a.shelf_stat = d.dictionary_detail_code");

			if (StringUtil.isNotEmpty(pcv.getProductName())) {
				sql.append(" and a.`name` like ? ");
			}

			if (StringUtil.isNotEmpty(pcv.getBrandId())) {
				if (!pcv.getBrandId().equals("0"))
					sql.append(" and b.brand_id = ?");
			}

			if (StringUtil.isNotEmpty(pcv.getTypeDtlId())) {
				if (!pcv.getTypeDtlId().equals("0"))
					sql.append(" and c.type_dtl_id = ?");
			}

			if (StringUtil.isNotEmpty(pcv.getShelfStat())) {
				if (!pcv.getShelfStat().equals("0"))
					sql.append(" and a.shelf_stat = ?");
			}
			if (pcv.getTimePrevious() != null && pcv.getTimeLater() != null) {
				sql.append(" and time_to_market >= ?");
				sql.append(" and time_to_market <= ?");
			}
			sql.append(" limit ").append(pageIndex * pageSize).append(",").append(pageSize);
			System.out.println(sql);
			preparedStatement = super.prepareStatement(sql.toString());

			int parameterIndex = 1;

			if (StringUtil.isNotEmpty(pcv.getProductName()))
				preparedStatement.setObject(parameterIndex++, "%" + pcv.getProductName() + "%");

			if (StringUtil.isNotEmpty(pcv.getBrandId())) {
				if (!pcv.getBrandId().equals("0"))
					preparedStatement.setObject(parameterIndex++, pcv.getBrandId());
			}

			if (StringUtil.isNotEmpty(pcv.getTypeDtlId())) {
				if (!pcv.getTypeDtlId().equals("0"))
					preparedStatement.setObject(parameterIndex++, pcv.getTypeDtlId());
			}
			if (StringUtil.isNotEmpty(pcv.getShelfStat())) {
				if (!pcv.getShelfStat().equals("0"))
					preparedStatement.setObject(parameterIndex++, pcv.getShelfStat());
			}
			if (pcv.getTimePrevious() != null && pcv.getTimeLater() != null) {
				preparedStatement.setObject(parameterIndex++, pcv.getTimePrevious());
				preparedStatement.setObject(parameterIndex++, pcv.getTimeLater());
			}

			System.out.println("***SQL:" + sql);
			resultSet = preparedStatement.executeQuery();
			super.addResultSet(resultSet);
			System.out.println("***SQL查询结果 begin");
			while (resultSet.next()) {
				ProductQueryView product = new ProductQueryView();
				String productId = resultSet.getString("product_id");
				String typeDtlId = resultSet.getString("type_dtl_id");
				String brandId = resultSet.getString("brand_id");
				String productName = resultSet.getString("product_name");
				String brandName = resultSet.getString("brand_name");
				String typeDtlName = resultSet.getString("type_dtl_name");
				Date timeToMarket = resultSet.getDate("time_to_market");
				String introduce = resultSet.getString("introduce");
				String shelfStat = resultSet.getString("shelf_stat");
				Integer evalGoodQty = resultSet.getInt("eval_good_qty");
				Integer evalGeneralQty = resultSet.getInt("eval_general_qty");
				Integer evalBadQty = resultSet.getInt("eval_bad_qty");
				Integer saleQty = resultSet.getInt("sale_qty");
				String picture = resultSet.getString("picture");
				String majorSkuCode = resultSet.getString("major_sku_code");
				String dictionaryDetailLabel = resultSet.getString("dictionary_detail_label");

				product.setProductId(productId);
				product.setTypeDtlId(typeDtlId);
				product.setBrandId(brandId);
				product.setName(productName);
				product.setBrandName(brandName);
				product.setTypeDtlName(typeDtlName);
				product.setTimeToMarket(timeToMarket);
				product.setIntroduce(introduce);
				product.setShelfStat(shelfStat);
				product.setEvalGoodQty(evalGoodQty);
				product.setEvalGeneralQty(evalGeneralQty);
				product.setEvalBadQty(evalBadQty);
				product.setSaleQty(saleQty);
				product.setPicture(picture);
				product.setMajorSkuCode(majorSkuCode);
				product.setDictionaryDetailLabel(dictionaryDetailLabel);

				listProduct.add(product);
				System.out.println(product);
			}
			System.out.println("***SQL查询结果 end");
			System.out.println("操作成功");
			return listProduct;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("操作失败");
			throw new RuntimeException("产品查询失败", e);
		}
	}

	@Override
	public int recordCount(ProductConditionView pcv) {

		ArrayList<ProductQueryView> listProduct = new ArrayList<>();
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			StringBuilder sql = new StringBuilder();
			sql.append(" select count(*)");
			sql.append(" from prd_product a");
			sql.append(" join bas_brand b");
			sql.append(" on a.brand_id= b.brand_id");
			sql.append(" join bas_type_detail c");
			sql.append(" on a.type_dtl_id = c.type_dtl_id");
			sql.append(" join bas_data_dictionary_detail d");
			sql.append(" on a.shelf_stat = d.dictionary_detail_code");

			if (StringUtil.isNotEmpty(pcv.getProductName())) {
				sql.append(" and a.`name` like ? ");
			}

			if (StringUtil.isNotEmpty(pcv.getBrandId())) {
				if (!pcv.getBrandId().equals("0"))
					sql.append(" and b.brand_id = ?");
			}

			if (StringUtil.isNotEmpty(pcv.getTypeDtlId())) {
				if (!pcv.getTypeDtlId().equals("0"))
					sql.append(" and c.type_dtl_id = ?");
			}

			if (StringUtil.isNotEmpty(pcv.getShelfStat())) {
				if (!pcv.getShelfStat().equals("0"))
					sql.append(" and a.shelf_stat = ?");
			}
			if (pcv.getTimePrevious() != null && pcv.getTimeLater() != null) {
				sql.append(" and time_to_market >= ?");
				sql.append(" and time_to_market <= ?");
			}

			preparedStatement = super.prepareStatement(sql.toString());

			int parameterIndex = 1;

			if (StringUtil.isNotEmpty(pcv.getProductName()))
				preparedStatement.setObject(parameterIndex++, "%" + pcv.getProductName() + "%");

			if (StringUtil.isNotEmpty(pcv.getBrandId())) {
				if (!pcv.getBrandId().equals("0"))
					preparedStatement.setObject(parameterIndex++, pcv.getBrandId());
			}

			if (StringUtil.isNotEmpty(pcv.getTypeDtlId())) {
				if (!pcv.getTypeDtlId().equals("0"))
					preparedStatement.setObject(parameterIndex++, pcv.getTypeDtlId());
			}
			if (StringUtil.isNotEmpty(pcv.getShelfStat())) {
				if (!pcv.getShelfStat().equals("0"))
					preparedStatement.setObject(parameterIndex++, pcv.getShelfStat());
			}
			if (pcv.getTimePrevious() != null && pcv.getTimeLater() != null) {
				preparedStatement.setObject(parameterIndex++, pcv.getTimePrevious());
				preparedStatement.setObject(parameterIndex++, pcv.getTimeLater());
			}

			System.out.println("***SQL:" + sql);
			resultSet = preparedStatement.executeQuery();
			super.addResultSet(resultSet);// 待封装 TODO
			if (resultSet.next()) {
				int recordCount = resultSet.getInt(1);
				return recordCount;
			} else {
				throw new RuntimeException("查询记录数失败");
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("操作失败");

			throw new RuntimeException("产品查询失败", e);
		}
	}

}
