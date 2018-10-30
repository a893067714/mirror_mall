package com.iwonder.tea.prd.dao.imp;

import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

import com.iwonder.tea.framework.dao.imp.BaseDaoImp;
import com.iwonder.tea.framework.util.StringUtil;
import com.iwonder.tea.prd.dao.IProductSkuDao;
import com.iwonder.tea.prd.entity.ProductSku;
import com.iwonder.tea.prd.view.ProductSkuAllConditionView;
import com.iwonder.tea.prd.view.ProductSkuAllQueryView;
import com.iwonder.tea.prd.view.ProductSkuConditionView;
import com.iwonder.tea.prd.view.ProductSkuQueryView;

public class ProductSkuDaoImp extends BaseDaoImp implements IProductSkuDao {

	@Override
	public ArrayList<ProductSku> list() {
		ArrayList<ProductSku> listProductSku = new ArrayList<>();
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			String sql = "select * from prd_sku";
			preparedStatement = super.prepareStatement(sql);
			System.out.println("***SQL:" + sql);
			resultSet = preparedStatement.executeQuery();
			super.addResultSet(resultSet);
			System.out.println("***SQL查询结果 begin");
			while (resultSet.next()) {
				ProductSku productSku = new ProductSku();

				String productSkuId = resultSet.getString("product_sku_id");
				String skuCode = resultSet.getString("sku_code");
				String productId = resultSet.getString("product_id");
				String colorId = resultSet.getString("color_id");
				String sizeId = resultSet.getString("size_id");
				BigDecimal priceOrigin = resultSet.getBigDecimal("price_origin");
				BigDecimal priceCurrent = resultSet.getBigDecimal("price_current");
				Integer stock = resultSet.getInt("stock");
				String picBig = resultSet.getString("pic_big");
				String picMid = resultSet.getString("pic_mid");
				String picSmall = resultSet.getString("pic_small");
				String origin = resultSet.getString("origin");

				productSku.setProductSkuId(productSkuId);
				productSku.setSkuCode(skuCode);
				productSku.setProductId(productId);
				productSku.setColorId(colorId);
				productSku.setSizeId(sizeId);
				productSku.setPriceOrigin(priceOrigin);
				productSku.setPriceCurrent(priceCurrent);
				productSku.setStock(stock);
				productSku.setPicBig(picBig);
				productSku.setPicMid(picMid);
				productSku.setPicSmall(picSmall);
				productSku.setOrigin(origin);

				listProductSku.add(productSku);
				System.out.println(productSku);
			}
			System.out.println("***SQL查询结果 end");
			System.out.println("操作成功");

			return listProductSku;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("操作失败");

			throw new RuntimeException("产品查询失败", e);
		}
	}

	public ArrayList<ProductSkuAllQueryView> listAll() {
		ArrayList<ProductSkuAllQueryView> psaqv = new ArrayList<>();
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			StringBuffer sql = new StringBuffer();
			sql.append(
					"select a.*,b.*,c.color_value,d.size_value,e.`name` as brand_name,e.brand_pic,f.type_dtl_name,g.type_big_name,h.dictionary_detail_label,(b.eval_bad_qty+b.eval_general_qty+eval_good_qty) as qty_total");
			sql.append(" from prd_sku a");
			sql.append(" join prd_product b on a.product_id=b.product_id");
			sql.append(" join bas_color c on a.color_id = c.color_id");
			sql.append(" join bas_size d on a.size_id = d.size_id");
			sql.append(" join bas_brand e on b.brand_id = e.brand_id");
			sql.append(" join bas_type_detail f on b.type_dtl_id = f.type_dtl_id");
			sql.append(" join bas_type_big g on f.type_big_id = g.type_big_id");
			sql.append(" join bas_data_dictionary_detail h on b.shelf_stat = h.dictionary_detail_code");
			preparedStatement = super.prepareStatement(sql.toString());
			System.out.println("***SQL:" + sql);
			resultSet = preparedStatement.executeQuery();
			super.addResultSet(resultSet);
			System.out.println("***SQL查询结果 begin");

			while (resultSet.next()) {
				ProductSkuAllQueryView psa = new ProductSkuAllQueryView();

				String productSkuId = resultSet.getString("product_sku_id");
				String skuCode = resultSet.getString("sku_code");
				String productId = resultSet.getString("product_id");
				String colorId = resultSet.getString("color_id");
				String sizeId = resultSet.getString("size_id");
				BigDecimal priceOrigin = resultSet.getBigDecimal("price_origin");
				BigDecimal priceCurrent = resultSet.getBigDecimal("price_current");
				Integer stock = resultSet.getInt("stock");
				String picBig = resultSet.getString("pic_big");
				String picMid = resultSet.getString("pic_mid");
				String picSmall = resultSet.getString("pic_small");
				String origin = resultSet.getString("origin");
				String productName = resultSet.getString("name");
				Date timeToMarket = resultSet.getDate("time_to_market");
				String introduce = resultSet.getString("introduce");
				String shelfStat = resultSet.getString("shelf_stat");
				Integer evalGoodQty = resultSet.getInt("eval_good_qty");
				Integer evalGeneralQty = resultSet.getInt("eval_general_qty");
				Integer evalBadQty = resultSet.getInt("eval_bad_qty");
				Integer saleQty = resultSet.getInt("sale_qty");
				String picture = resultSet.getString("picture");
				String colorValue = resultSet.getString("color_value");
				String sizeValue = resultSet.getString("size_value");
				String brandName = resultSet.getString("brand_name");
				String brandPic = resultSet.getString("brand_pic");
				String typeDtlName = resultSet.getString("type_dtl_name");
				String typeBigName = resultSet.getString("type_big_name");
				String dictionaryDetailLabel = resultSet.getString("dictionary_detail_label");
				Integer qtyTotal = resultSet.getInt("qty_total");

				psa.setProductSkuId(productSkuId);
				psa.setSkuCode(skuCode);
				psa.setProductId(productId);
				psa.setColorId(colorId);
				psa.setSizeId(sizeId);
				psa.setPriceOrigin(priceOrigin);
				psa.setPriceCurrent(priceCurrent);
				psa.setStock(stock);
				psa.setPicBig(picBig);
				psa.setPicMid(picMid);
				psa.setPicSmall(picSmall);
				psa.setOrigin(origin);
				psa.setBrandName(brandName);
				psa.setProductName(productName);
				psa.setTimeToMarket(timeToMarket);
				psa.setIntroduce(introduce);
				psa.setIntroduce(introduce);
				psa.setShelfStat(shelfStat);
				psa.setProductName(productName);
				psa.setEvalBadQty(evalBadQty);
				psa.setEvalGeneralQty(evalGeneralQty);
				psa.setEvalGoodQty(evalGoodQty);
				psa.setSaleQty(saleQty);
				psa.setPicture(picture);
				psa.setColorValue(colorValue);
				psa.setSizeValue(sizeValue);
				psa.setBrandName(brandName);
				psa.setBrandPic(brandPic);
				psa.setTypeBigName(typeBigName);
				psa.setTypeDtlName(typeDtlName);
				psa.setDictionaryDetailLabel(dictionaryDetailLabel);
				psa.setQtyTotal(qtyTotal);

				psaqv.add(psa);
				System.out.println(psa);
			}
			System.out.println("***SQL查询结果 end");
			System.out.println("操作成功");

			return psaqv;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("操作失败");

			throw new RuntimeException("产品查询失败", e);
		}
	}

	public ArrayList<ProductSkuAllQueryView> listAll(ProductSkuAllConditionView pscv) {
		ArrayList<ProductSkuAllQueryView> psaqv = new ArrayList<>();
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			StringBuffer sql = new StringBuffer();
			sql.append(
					"select a.*,b.*,c.color_value,d.size_value,e.`name` as brand_name,e.brand_pic,f.type_dtl_name,g.type_big_name,h.dictionary_detail_label,(b.eval_bad_qty+b.eval_general_qty+eval_good_qty) as qty_total");
			sql.append(" from prd_sku a");
			sql.append(" join prd_product b on a.product_id=b.product_id");
			sql.append(" join bas_color c on a.color_id = c.color_id");
			sql.append(" join bas_size d on a.size_id = d.size_id");
			sql.append(" join bas_brand e on b.brand_id = e.brand_id");
			sql.append(" join bas_type_detail f on b.type_dtl_id = f.type_dtl_id");
			sql.append(" join bas_type_big g on f.type_big_id = g.type_big_id");
			sql.append(" join bas_data_dictionary_detail h on b.shelf_stat = h.dictionary_detail_code");

			if (StringUtil.isNotEmpty(pscv.getProductName())) {
				sql.append(" and b.`name` like ? ");
			}
			if (StringUtil.isNotEmpty(pscv.getColorId())) {
				if (!pscv.getColorId().equals("0"))
					sql.append(" and c.color_id = ? ");
			}
			if (StringUtil.isNotEmpty(pscv.getSizeId())) {
				if (!pscv.getSizeId().equals("0"))
					sql.append(" and d.size_id = ? ");
			}
			if (StringUtil.isNotEmpty(pscv.getBrandId())) {
				if (!pscv.getBrandId().equals("0"))
					sql.append(" and e.brand_id = ? ");
			}
			if (StringUtil.isNotEmpty(pscv.getTypeBigId())) {
				if (!pscv.getTypeBigId().equals("0"))
					sql.append(" and g.type_big_id = ? ");
			}
			if (StringUtil.isNotEmpty(pscv.getTypeDtlId())) {
				if (!pscv.getTypeDtlId().equals("0"))
					sql.append(" and g.type_big_id = ? ");
			}

			if (StringUtil.isNotEmpty(pscv.getMajor())) {
				sql.append(" and a.sku_code = b.major_sku_code");
			}

			if (pscv.getTimePrevious() != null && pscv.getTimeLater() != null) {
				sql.append(" and time_to_market >= ?");
				sql.append(" and time_to_market <= ?");
			}

			if (StringUtil.isNotEmpty(pscv.getSaleQtyDesc())) {
				sql.append(" ORDER BY sale_qty desc");
			}
			if (StringUtil.isNotEmpty(pscv.getEvalGoodQtyDesc())) {
				sql.append(" ORDER BY eval_good_qty DESC");
			}
			if (StringUtil.isNotEmpty(pscv.getSaleQtyAsc())) {
				sql.append(" ORDER BY sale_qty");
			}
			if (StringUtil.isNotEmpty(pscv.getEvalGoodQtyAsc())) {
				sql.append(" ORDER BY eval_good_qty");
			}
			if (StringUtil.isNotEmpty(pscv.getLimit())) {
				sql.append(" LIMIT ?,?");
			}

			preparedStatement = super.prepareStatement(sql.toString());
			int parameterIndex = 1;
			if (StringUtil.isNotEmpty(pscv.getProductName())) {
				preparedStatement.setObject(parameterIndex++, "%" + pscv.getProductName() + "%");
			}
			if (StringUtil.isNotEmpty(pscv.getColorId())) {
				if (!pscv.getColorId().equals("0"))
					preparedStatement.setObject(parameterIndex++, pscv.getColorId());
			}
			if (StringUtil.isNotEmpty(pscv.getSizeId())) {
				if (!pscv.getSizeId().equals("0"))
					preparedStatement.setObject(parameterIndex++, pscv.getSizeId());
			}
			if (StringUtil.isNotEmpty(pscv.getBrandId())) {
				if (!pscv.getBrandId().equals("0"))
					preparedStatement.setObject(parameterIndex++, pscv.getBrandId());
			}
			if (StringUtil.isNotEmpty(pscv.getTypeBigId())) {
				if (!pscv.getTypeBigId().equals("0"))
					preparedStatement.setObject(parameterIndex++, pscv.getTypeBigId());
			}
			if (StringUtil.isNotEmpty(pscv.getTypeDtlId())) {
				if (!pscv.getTypeDtlId().equals("0"))
					preparedStatement.setObject(parameterIndex++, pscv.getTypeDtlId());
			}

			if (pscv.getTimePrevious() != null && pscv.getTimeLater() != null) {
				preparedStatement.setObject(parameterIndex++, pscv.getTimePrevious());
				preparedStatement.setObject(parameterIndex++, pscv.getTimeLater());
			}

			if (StringUtil.isNotEmpty(pscv.getLimit())) {
				preparedStatement.setObject(parameterIndex++, pscv.getLimitPage());
				preparedStatement.setObject(parameterIndex++, pscv.getLimitIndex());
			}

			System.out.println("***SQL:" + sql);
			resultSet = preparedStatement.executeQuery();
			super.addResultSet(resultSet);
			System.out.println("***SQL查询结果 begin");

			while (resultSet.next()) {
				ProductSkuAllQueryView psa = new ProductSkuAllQueryView();

				String productSkuId = resultSet.getString("product_sku_id");
				String skuCode = resultSet.getString("sku_code");
				String productId = resultSet.getString("product_id");
				String colorId = resultSet.getString("color_id");
				String sizeId = resultSet.getString("size_id");
				BigDecimal priceOrigin = resultSet.getBigDecimal("price_origin");
				BigDecimal priceCurrent = resultSet.getBigDecimal("price_current");
				Integer stock = resultSet.getInt("stock");
				String picBig = resultSet.getString("pic_big");
				String picMid = resultSet.getString("pic_mid");
				String picSmall = resultSet.getString("pic_small");
				String origin = resultSet.getString("origin");
				String productName = resultSet.getString("name");
				Date timeToMarket = resultSet.getDate("time_to_market");
				String introduce = resultSet.getString("introduce");
				String shelfStat = resultSet.getString("shelf_stat");
				Integer evalGoodQty = resultSet.getInt("eval_good_qty");
				Integer evalGeneralQty = resultSet.getInt("eval_general_qty");
				Integer evalBadQty = resultSet.getInt("eval_bad_qty");
				Integer saleQty = resultSet.getInt("sale_qty");
				String picture = resultSet.getString("picture");
				String colorValue = resultSet.getString("c.color_value");
				String sizeValue = resultSet.getString("d.size_value");
				String brandName = resultSet.getString("brand_name");
				String brandPic = resultSet.getString("brand_pic");
				String typeDtlName = resultSet.getString("type_dtl_name");
				String typeBigName = resultSet.getString("type_big_name");
				String dictionaryDetailLabel = resultSet.getString("dictionary_detail_label");
				Integer qtyTotal = resultSet.getInt("qty_total");

				psa.setProductSkuId(productSkuId);
				psa.setSkuCode(skuCode);
				psa.setProductId(productId);
				psa.setColorId(colorId);
				psa.setSizeId(sizeId);
				psa.setPriceOrigin(priceOrigin);
				psa.setPriceCurrent(priceCurrent);
				psa.setStock(stock);
				psa.setPicBig(picBig);
				psa.setPicMid(picMid);
				psa.setPicSmall(picSmall);
				psa.setOrigin(origin);
				psa.setBrandName(brandName);
				psa.setProductName(productName);
				psa.setTimeToMarket(timeToMarket);
				psa.setIntroduce(introduce);
				psa.setIntroduce(introduce);
				psa.setShelfStat(shelfStat);
				psa.setProductName(productName);
				psa.setEvalBadQty(evalBadQty);
				psa.setEvalGeneralQty(evalGeneralQty);
				psa.setEvalGoodQty(evalGoodQty);
				psa.setSaleQty(saleQty);
				psa.setPicture(picture);
				psa.setColorValue(colorValue);
				psa.setSizeValue(sizeValue);
				psa.setBrandName(brandName);
				psa.setBrandPic(brandPic);
				psa.setTypeBigName(typeBigName);
				psa.setTypeDtlName(typeDtlName);
				psa.setDictionaryDetailLabel(dictionaryDetailLabel);
				psa.setQtyTotal(qtyTotal);

				psaqv.add(psa);
				System.out.println(psa);
			}
			System.out.println("***SQL查询结果 end");
			System.out.println("操作成功");

			return psaqv;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("操作失败");

			throw new RuntimeException("产品查询失败", e);
		}
	}

	@Override
	public ArrayList<ProductSkuQueryView> list(ProductSkuConditionView skucv) {
		ArrayList<ProductSkuQueryView> listProductSku = new ArrayList<>();
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			StringBuffer sql = new StringBuffer();
			sql.append("select a.*,p.`name` as product_name,c.color_value,s.size_value");
			sql.append(" from prd_sku a");
			sql.append(" join bas_color c");
			sql.append(" on c.color_id = a.color_id");
			sql.append(" join bas_size s");
			sql.append(" on a.size_id = s.size_id");
			sql.append(" join prd_product p");
			sql.append(" on a.product_id = p.product_id");

			if (StringUtil.isNotEmpty(skucv.getProductId())) {
				if (!skucv.getProductId().equals("0"))
					sql.append(" and p.product_id = ? ");
			}

			if (StringUtil.isNotEmpty(skucv.getColorId())) {
				if (!skucv.getColorId().equals("0"))
					sql.append(" and c.color_id = ?");
			}

			if (StringUtil.isNotEmpty(skucv.getSizeId())) {
				if (!skucv.getSizeId().equals("0"))
					sql.append(" and s.size_id = ?");
			}

			preparedStatement = super.prepareStatement(sql.toString());
			int parameterIndex = 1;
			if (StringUtil.isNotEmpty(skucv.getProductId())) {
				if (!skucv.getProductId().equals("0"))
					preparedStatement.setObject(parameterIndex++, skucv.getProductId());
			}

			if (StringUtil.isNotEmpty(skucv.getColorId())) {
				if (!skucv.getColorId().equals("0"))
					preparedStatement.setObject(parameterIndex++, skucv.getColorId());
			}

			if (StringUtil.isNotEmpty(skucv.getSizeId())) {
				if (!skucv.getSizeId().equals("0"))
					preparedStatement.setObject(parameterIndex++, skucv.getSizeId());
			}

			System.out.println("***SQL:" + sql);
			resultSet = preparedStatement.executeQuery();
			super.addResultSet(resultSet);
			System.out.println("***SQL查询结果 begin");
			while (resultSet.next()) {
				ProductSkuQueryView productSku = new ProductSkuQueryView();

				String productSkuId = resultSet.getString("product_sku_id");
				String skuCode = resultSet.getString("sku_code");
				String productName = resultSet.getString("product_name");
				String colorValue = resultSet.getString("color_value");
				String sizeValue = resultSet.getString("size_value");
				BigDecimal priceOrigin = resultSet.getBigDecimal("price_origin");
				BigDecimal priceCurrent = resultSet.getBigDecimal("price_current");
				Integer stock = resultSet.getInt("stock");
				String picBig = resultSet.getString("pic_big");
				String picMid = resultSet.getString("pic_mid");
				String picSmall = resultSet.getString("pic_small");
				String origin = resultSet.getString("origin");

				productSku.setProductSkuId(productSkuId);
				productSku.setSkuCode(skuCode);
				productSku.setProductName(productName);
				productSku.setColorValue(colorValue);
				productSku.setSizeValue(sizeValue);
				productSku.setPriceOrigin(priceOrigin);
				productSku.setPriceCurrent(priceCurrent);
				productSku.setStock(stock);
				productSku.setPicBig(picBig);
				productSku.setPicMid(picMid);
				productSku.setPicSmall(picSmall);
				productSku.setOrigin(origin);

				listProductSku.add(productSku);
				System.out.println(productSku);
			}
			System.out.println("***SQL查询结果 end");
			System.out.println("操作成功");

			return listProductSku;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("操作失败");

			throw new RuntimeException("产品查询失败", e);
		}
	}

	@Override
	public void insert(ProductSku productSku) {
		PreparedStatement preparedStatement = null;

		try {
			String sql = "insert into prd_sku values(?,?,?,?,?,?,?,?,?,?,?,?)";
			preparedStatement = super.prepareStatement(sql);

			String uuid = UUID.randomUUID().toString().replaceAll("-", "");
			productSku.setProductSkuId(uuid);
			int paramIndex = 1;
			preparedStatement.setObject(paramIndex++, uuid);
			preparedStatement.setObject(paramIndex++, productSku.getSkuCode());
			preparedStatement.setObject(paramIndex++, productSku.getProductId());
			preparedStatement.setObject(paramIndex++, productSku.getColorId());
			preparedStatement.setObject(paramIndex++, productSku.getSizeId());
			preparedStatement.setObject(paramIndex++, productSku.getPriceOrigin());
			preparedStatement.setObject(paramIndex++, productSku.getPriceCurrent());
			preparedStatement.setObject(paramIndex++, productSku.getStock());
			preparedStatement.setObject(paramIndex++, productSku.getPicBig());
			preparedStatement.setObject(paramIndex++, productSku.getPicMid());
			preparedStatement.setObject(paramIndex++, productSku.getPicSmall());
			preparedStatement.setObject(paramIndex++, productSku.getOrigin());

			System.out.println("***SQL:" + sql);
			System.out.println("***param:" + productSku);
			int rowCount = preparedStatement.executeUpdate();

			System.out.println("***影响行数:" + rowCount);

			System.out.println("新增保存成功");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("新增保存失败");
		}
	}

	@Override
	public void update(ProductSku productSku) {
		PreparedStatement preparedStatement = null;
		try {
			String sql = "update prd_sku set product_id = ?,sku_code = ?,color_id = ?,size_id = ?,price_origin = ?,price_current = ?,stock = ?,pic_big = ?,pic_mid = ?,pic_small = ?,origin = ?  where product_sku_id = ?";
			preparedStatement = super.prepareStatement(sql);

			int paramIndex = 1;
			preparedStatement.setObject(paramIndex++, productSku.getProductId());
			preparedStatement.setObject(paramIndex++, productSku.getSkuCode());
			preparedStatement.setObject(paramIndex++, productSku.getColorId());
			preparedStatement.setObject(paramIndex++, productSku.getSizeId());
			preparedStatement.setObject(paramIndex++, productSku.getPriceOrigin());
			preparedStatement.setObject(paramIndex++, productSku.getPriceCurrent());
			preparedStatement.setObject(paramIndex++, productSku.getStock());
			preparedStatement.setObject(paramIndex++, productSku.getPicBig());
			preparedStatement.setObject(paramIndex++, productSku.getPicMid());
			preparedStatement.setObject(paramIndex++, productSku.getPicSmall());
			preparedStatement.setObject(paramIndex++, productSku.getOrigin());
			preparedStatement.setObject(paramIndex++, productSku.getProductSkuId());

			int rowCount = preparedStatement.executeUpdate();

			System.out.println("影响行数:" + rowCount);

			System.out.println("操作成功");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("操作失败");
		}
	}

	@Override
	public void delete(String skuId) {
		PreparedStatement preparedStatement = null;
		try {
			String sql = "delete from prd_sku where product_sku_id = ?";
			preparedStatement = super.prepareStatement(sql);

			int paramIndex = 1;
			preparedStatement.setObject(paramIndex++, skuId);

			int rowCount = preparedStatement.executeUpdate();
			System.out.println("影响行数:" + rowCount);
			if (rowCount == 0) {
				throw new RuntimeException("产品不存在:" + skuId);
			}
			System.out.println("操作成功");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("操作失败");
			throw new RuntimeException("删除产品失败", e);
		}
	}

	@Override
	public ProductSku load(String productSkuId) {
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		try {
			ProductSku productSku = new ProductSku();

			String sql = "select * from prd_sku where product_sku_id = ?";
			preparedStatement = super.prepareStatement(sql);
			preparedStatement.setObject(1, productSkuId);

			resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
				String skuCode = resultSet.getString("sku_code");
				String productId = resultSet.getString("product_id");
				String colorId = resultSet.getString("color_id");
				String sizeId = resultSet.getString("size_id");
				BigDecimal priceOrigin = resultSet.getBigDecimal("price_origin");
				BigDecimal priceCurrent = resultSet.getBigDecimal("price_current");
				Integer stock = resultSet.getInt("stock");
				String picBig = resultSet.getString("pic_big");
				String picMid = resultSet.getString("pic_mid");
				String picSmall = resultSet.getString("pic_small");
				String origin = resultSet.getString("origin");

				productSku.setSkuCode(skuCode);
				productSku.setProductSkuId(productSkuId);
				productSku.setProductId(productId);
				productSku.setColorId(colorId);
				productSku.setSizeId(sizeId);
				productSku.setPriceOrigin(priceOrigin);
				productSku.setPriceCurrent(priceCurrent);
				productSku.setStock(stock);
				productSku.setPicBig(picBig);
				productSku.setPicMid(picMid);
				productSku.setPicSmall(picSmall);
				productSku.setOrigin(origin);

			} else {
				System.out.println("ID不存在");
				throw new RuntimeException("查询失败");
			}
			System.out.println("操作成功" + productSku);
			return productSku;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("操作失败");
			throw new RuntimeException("查询失败", e);
		}
	}

	@Override
	public ProductSkuQueryView loadView(String proSkuId) {
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			StringBuffer sql = new StringBuffer();
			sql.append("select a.*,p.`name` as product_name,c.color_value,s.size_value");
			sql.append(" from prd_sku a");
			sql.append(" join bas_color c");
			sql.append(" on c.color_id = a.color_id");
			sql.append(" join bas_size s");
			sql.append(" on a.size_id = s.size_id");
			sql.append(" join prd_product p");
			sql.append(" on a.product_id = p.product_id");

			if (StringUtil.isNotEmpty(proSkuId)) {
				sql.append(" WHERE product_sku_id = ? ");
			}

			preparedStatement = super.prepareStatement(sql.toString());

			if (StringUtil.isNotEmpty(proSkuId)) {
				preparedStatement.setObject(1, proSkuId);
			}

			System.out.println("***SQL:" + sql);
			resultSet = preparedStatement.executeQuery();
			super.addResultSet(resultSet);
			System.out.println("***SQL查询结果 begin");
			ProductSkuQueryView productSku = new ProductSkuQueryView();
			while (resultSet.next()) {

				String productSkuId = resultSet.getString("product_sku_id");
				String skuCode = resultSet.getString("sku_code");
				String productName = resultSet.getString("product_name");
				String colorValue = resultSet.getString("color_value");
				String sizeValue = resultSet.getString("size_value");
				BigDecimal priceOrigin = resultSet.getBigDecimal("price_origin");
				BigDecimal priceCurrent = resultSet.getBigDecimal("price_current");
				Integer stock = resultSet.getInt("stock");
				String picBig = resultSet.getString("pic_big");
				String picMid = resultSet.getString("pic_mid");
				String picSmall = resultSet.getString("pic_small");
				String origin = resultSet.getString("origin");

				productSku.setProductSkuId(productSkuId);
				productSku.setSkuCode(skuCode);
				productSku.setProductName(productName);
				productSku.setColorValue(colorValue);
				productSku.setSizeValue(sizeValue);
				productSku.setPriceOrigin(priceOrigin);
				productSku.setPriceCurrent(priceCurrent);
				productSku.setStock(stock);
				productSku.setPicBig(picBig);
				productSku.setPicMid(picMid);
				productSku.setPicSmall(picSmall);
				productSku.setOrigin(origin);

				System.out.println(productSku.toString());

			}
			System.out.println("***SQL查询结果 end");
			System.out.println("操作成功");
			return productSku;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("操作失败");

			throw new RuntimeException("产品查询失败", e);
		}

	}
}
