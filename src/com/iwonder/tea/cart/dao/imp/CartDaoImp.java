package com.iwonder.tea.cart.dao.imp;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.UUID;

import com.iwonder.tea.cart.dao.ICartDao;
import com.iwonder.tea.cart.entity.Cart;
import com.iwonder.tea.cart.view.CartConditionView;
import com.iwonder.tea.cart.view.CartQueryView;
import com.iwonder.tea.framework.dao.imp.BaseDaoImp;
import com.iwonder.tea.framework.util.StringUtil;

public class CartDaoImp extends BaseDaoImp implements ICartDao {

	public ArrayList<CartQueryView> list(CartConditionView cartConditionView) {
		ArrayList<CartQueryView> arr = new ArrayList<CartQueryView>();

		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		try {

			// S3.获取statement(执行语句的对象)
			StringBuilder sql = new StringBuilder();
			sql.append(
					" select car_cart.* , prd_sku.sku_code, usr_user_info.`name` ,a.dictionary_detail_label as dictionary_detail_check_label ,b.dictionary_detail_label as dictionary_detail_delete_label  from car_cart");
			sql.append(" JOIN prd_sku");
			sql.append(" on car_cart.product_sku_id= prd_sku.product_sku_id");
			sql.append(" join usr_user_info");
			sql.append(" on car_cart.user_id = usr_user_info.user_id");
			sql.append(" join bas_data_dictionary_detail as a");
			sql.append(" on car_cart.check_status = a.dictionary_detail_code");
			sql.append(" join bas_data_dictionary_detail as b");
			sql.append(" on car_cart.delete_status = b.dictionary_detail_code");
			sql.append(" where a.data_dictionary_code='check_status'");
			sql.append(" and b.data_dictionary_code='delete_status'");
			if (StringUtil.isNotEmpty(cartConditionView.getProductSkuId())) {
				sql.append(" and car_cart.product_sku_id like ? ");
			}
			if (StringUtil.isNotEmpty(cartConditionView.getUserId())) {
				sql.append(" and car_cart.user_id like ? ");
			}
			if (StringUtil.isNotEmpty(StringUtil.IntegerToString(cartConditionView.getQuantity()))) {
				sql.append(" and car_cart.quantity like ? ");
			}
			if (StringUtil.isNotEmpty(cartConditionView.getStatCheck())) {
				sql.append(" and car_cart.check_status like ? ");
			}
			if (StringUtil.isNotEmpty(cartConditionView.getStatDelete())) {
				sql.append(" and car_cart.delete_status like ? ");
			}

			preparedStatement = super.prepareStatement(sql.toString());
			int parameterIndex = 1;
			if (StringUtil.isNotEmpty(cartConditionView.getProductSkuId())) {
				preparedStatement.setObject(parameterIndex++, cartConditionView.getProductSkuId());
			}
			if (StringUtil.isNotEmpty(cartConditionView.getUserId())) {
				preparedStatement.setObject(parameterIndex++, cartConditionView.getUserId());
			}
			if (StringUtil.isNotEmpty(StringUtil.IntegerToString(cartConditionView.getQuantity()))) {
				preparedStatement.setObject(parameterIndex++, cartConditionView.getQuantity());
			}
			if (StringUtil.isNotEmpty(cartConditionView.getStatCheck())) {
				preparedStatement.setObject(parameterIndex++, cartConditionView.getStatCheck());
			}
			if (StringUtil.isNotEmpty(cartConditionView.getStatDelete())) {
				preparedStatement.setObject(parameterIndex++, cartConditionView.getStatDelete());
			}

			System.out.println("***SQL:" + sql);
			System.out.println("***param:" + "");
			// s4-1.执行sql
			resultSet = preparedStatement.executeQuery();
			super.addResultSet(resultSet);// 待封装 TODO
			// s4-1.遍历resultSet

			/*
			 * student_id student_name start_date max_count remark
			 * 
			 */
			System.out.println("***SQL查询结果 begin");

			while (resultSet.next()) {
				CartQueryView cart = new CartQueryView();
				cart.setCartId(resultSet.getString("cart_id"));
				cart.setCartCode(resultSet.getString("cart_code"));
				cart.setProductSkuId(resultSet.getString("product_sku_id"));
				cart.setUserId(resultSet.getString("user_id"));
				cart.setQuantity(resultSet.getInt("quantity"));
				cart.setStatCheck(resultSet.getString("check_status"));
				cart.setStatDelete(resultSet.getString("delete_status"));
				cart.setProductSkuCode(resultSet.getString("sku_code"));
				cart.setName(resultSet.getString("name"));
				cart.setDictionaryDetailCheckLable(resultSet.getString("dictionary_detail_check_label"));
				cart.setDictionaryDetailDeleteLable(resultSet.getString("dictionary_detail_delete_label"));

				arr.add(cart);

			}
			System.out.println("***SQL查询结果 end");
			System.out.println("操作成功");

			return arr;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("操作失败");

			throw new RuntimeException("学生查询失败", e);
		}
	}

	public ArrayList<CartQueryView> list(String userId) {
		ArrayList<CartQueryView> arr = new ArrayList<CartQueryView>();

		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		try {
			// 获取Connection

			// S3.获取statement(执行语句的对象)
			StringBuilder sql = new StringBuilder();
			sql.append(
					" select car_cart.* , bas_color.color_value,bas_size.size_value , prd_product.`name` ,a.pic_small ,b.price_current from car_cart");
			sql.append(" JOIN prd_sku");
			sql.append(" on car_cart.product_sku_id= prd_sku.product_sku_id");
			sql.append(" join bas_color");
			sql.append(" on prd_sku.color_id=bas_color.color_id");
			sql.append(" join bas_size");
			sql.append(" on prd_sku.size_id=bas_size.size_id");
			sql.append(" join prd_product");
			sql.append(" on prd_sku.product_id = prd_product.product_id");
			sql.append(" join prd_sku as a");
			sql.append(" on car_cart.product_sku_id= a.product_sku_id");
			sql.append(" join prd_sku as b");
			sql.append(" on car_cart.product_sku_id= b.product_sku_id");

			if (StringUtil.isNotEmpty(userId)) {
				sql.append(" and car_cart.user_id = ? ");
			}

			preparedStatement = super.prepareStatement(sql.toString());

			int parameterIndex = 1;
			if (StringUtil.isNotEmpty(userId)) {
				preparedStatement.setObject(parameterIndex++, userId);
			}

			System.out.println("***SQL:" + sql);
			System.out.println("***param:" + "");
			// s4-1.执行sql
			resultSet = preparedStatement.executeQuery();
			super.addResultSet(resultSet);// 待封装 TODO
			// s4-1.遍历resultSet

			/*
			 * student_id student_name start_date max_count remark
			 * 
			 */
			System.out.println("***SQL查询结果 begin");

			while (resultSet.next()) {
				CartQueryView cart = new CartQueryView();
				cart.setCartId(resultSet.getString("cart_id"));
				cart.setCartCode(resultSet.getString("cart_code"));
				cart.setProductSkuId(resultSet.getString("product_sku_id"));
				cart.setUserId(resultSet.getString("user_id"));
				cart.setQuantity(resultSet.getInt("quantity"));
				cart.setStatCheck(resultSet.getString("check_status"));
				cart.setStatDelete(resultSet.getString("delete_status"));
				cart.setName(resultSet.getString("name"));
				cart.setColorValue(resultSet.getString("color_value"));
				cart.setSizeValue(resultSet.getString("size_value"));
				cart.setPicSmall(resultSet.getString("pic_small"));
				cart.setPriceCurrent(resultSet.getBigDecimal("price_current"));

				arr.add(cart);

			}
			System.out.println("***SQL查询结果 end");
			System.out.println("操作成功");

			return arr;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("操作失败");

			throw new RuntimeException("学生查询失败", e);
		}
	}

	public void delete(String cartId) {
		PreparedStatement preparedStatement = null;
		// ResultSet resultSet = null;

		try {

			// S3.获取statement(执行语句的对象)
			String sql = "delete from car_cart where cart_id = ?";
			preparedStatement = super.prepareStatement(sql);

			int paramIndex = 1;
			preparedStatement.setObject(paramIndex++, cartId);

			// s4-1.执行sql
			int rowCount = preparedStatement.executeUpdate();
			System.out.println("影响行数:" + rowCount);
			if (rowCount == 0) {
				throw new RuntimeException("学生不存在:" + cartId);
			}

			System.out.println("操作成功");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("操作失败");
			throw new RuntimeException("删除学生失败", e);
		}
	}

	// 不方便扩展，不方便维护
	// public void insert(String studentId , String studentName){
	//
	// }

	public void insert(Cart cart) {
		PreparedStatement preparedStatement = null;
		// ResultSet resultSet = null;、

		try {
			// S3.获取statement(执行语句的对象)
			String sql = "insert into car_cart(cart_id,cart_code,product_sku_id,user_id,quantity,check_status,delete_status) values(?,?,?,?,?,?,?)";
			preparedStatement = super.prepareStatement(sql);

			int paramIndex = 1;

			String uuid = UUID.randomUUID().toString().replaceAll("-", "");
			cart.setCartId(uuid);
			// String studentName = "aa2" ;
			preparedStatement.setObject(paramIndex++, cart.getCartId());
			preparedStatement.setObject(paramIndex++, cart.getCartCode());
			preparedStatement.setObject(paramIndex++, cart.getProductSkuId());
			preparedStatement.setObject(paramIndex++, cart.getUserId());
			preparedStatement.setObject(paramIndex++, cart.getQuantity());
			preparedStatement.setObject(paramIndex++, cart.getStatCheck());
			preparedStatement.setObject(paramIndex++, cart.getStatDelete());

			System.out.println("***SQL:" + sql);
			System.out.println("***param:" + cart.toString());

			// s4-1.执行sql
			int rowCount = preparedStatement.executeUpdate();

			System.out.println("***影响行数:" + rowCount);

			System.out.println("新增保存成功");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("新增保存失败");
		}
	}

	// 不方便扩展，不方便维护
	// public void update(String studentId , String studentName){
	//
	// }

	public void update(Cart cart) {
		PreparedStatement preparedStatement = null;

		try {
			// 获取Connection

			// S3.获取statement(执行语句的对象)
			String sql = "update car_cart set cart_code=?, product_sku_id=? ,user_id=? ,quantity=?,check_status=?,delete_status=? where cart_id = ?";
			preparedStatement = super.prepareStatement(sql);

			int paramIndex = 1;
			preparedStatement.setObject(paramIndex++, cart.getCartCode());
			preparedStatement.setObject(paramIndex++, cart.getProductSkuId());
			preparedStatement.setObject(paramIndex++, cart.getUserId());
			preparedStatement.setObject(paramIndex++, cart.getQuantity());
			preparedStatement.setObject(paramIndex++, cart.getStatCheck());
			preparedStatement.setObject(paramIndex++, cart.getStatDelete());
			preparedStatement.setObject(paramIndex++, cart.getCartId());

			// s4-1.执行sql
			int rowCount = preparedStatement.executeUpdate();

			System.out.println("影响行数:" + rowCount);

			System.out.println("操作成功");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("操作失败");
		}
	}

	public void update(String cartId, String quantity) {
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			// 获取Connection

			// S3.获取statement(执行语句的对象)
			String sql = "update car_cart set quantity=? where cart_id = ?";
			preparedStatement = super.prepareStatement(sql);

			int paramIndex = 1;
			preparedStatement.setObject(paramIndex++, quantity);
			preparedStatement.setObject(paramIndex++, cartId);

			// s4-1.执行sql
			int rowCount = preparedStatement.executeUpdate();
			System.out.println("影响行数:" + rowCount);
			super.addResultSet(resultSet);// 待封装 TODO
			System.out.println("操作成功");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("操作失败");
			throw new RuntimeException("查询数量出错", e);
		}

	}

	public Cart load(String cartId) {
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		try {

			// 获取Connection

			// S3.获取statement(执行语句的对象)
			String sql = "select * from car_cart where cart_id = ?";
			preparedStatement = super.prepareStatement(sql);
			preparedStatement.setObject(1, cartId);

			// s4-1.执行sql
			resultSet = preparedStatement.executeQuery();

			// s4-1.遍历resultSet

			/*
			 * student_id student_name start_date max_count remark
			 * 
			 */
			Cart cart = new Cart();
			if (resultSet.next()) {

				cart.setCartId(resultSet.getString("cart_id"));
				cart.setCartCode(resultSet.getString("cart_code"));
				cart.setProductSkuId(resultSet.getString("product_sku_id"));
				cart.setUserId(resultSet.getString("user_id"));
				cart.setQuantity(resultSet.getInt("quantity"));
				cart.setStatCheck(resultSet.getString("check_status"));
				cart.setStatDelete(resultSet.getString("delete_status"));

			} else {
				System.out.println("ID不存在");
				throw new RuntimeException("查询失败");
			}

			System.out.println("操作成功");
			return cart;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("操作失败");
			throw new RuntimeException("查询失败", e);
		}
	}

	@Override
	public CartQueryView loadCart(String cartId) {

		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		try {
			// 获取Connection

			// S3.获取statement(执行语句的对象)
			StringBuilder sql = new StringBuilder();
			sql.append(
					" select car_cart.* , bas_color.color_value,bas_size.size_value , prd_product.`name` ,a.pic_small ,b.price_current,b.price_origin from car_cart");
			sql.append(" JOIN prd_sku");
			sql.append(" on car_cart.product_sku_id= prd_sku.product_sku_id");
			sql.append(" join bas_color");
			sql.append(" on prd_sku.color_id=bas_color.color_id");
			sql.append(" join bas_size");
			sql.append(" on prd_sku.size_id=bas_size.size_id");
			sql.append(" join prd_product");
			sql.append(" on prd_sku.product_id = prd_product.product_id");
			sql.append(" join prd_sku as a");
			sql.append(" on car_cart.product_sku_id= a.product_sku_id");
			sql.append(" join prd_sku as b");
			sql.append(" on car_cart.product_sku_id= b.product_sku_id");

			if (StringUtil.isNotEmpty(cartId)) {
				sql.append(" and car_cart.cart_id = ? ");
			}

			preparedStatement = super.prepareStatement(sql.toString());

			int parameterIndex = 1;
			if (StringUtil.isNotEmpty(cartId)) {
				preparedStatement.setObject(parameterIndex++, cartId);
			}

			System.out.println("***SQL:" + sql);
			System.out.println("***param:" + "");
			// s4-1.执行sql
			resultSet = preparedStatement.executeQuery();
			super.addResultSet(resultSet);// 待封装 TODO
			System.out.println("***SQL查询结果 begin");
			CartQueryView cart = new CartQueryView();
			while (resultSet.next()) {
				cart.setCartId(resultSet.getString("cart_id"));
				cart.setCartCode(resultSet.getString("cart_code"));
				cart.setProductSkuId(resultSet.getString("product_sku_id"));
				cart.setUserId(resultSet.getString("user_id"));
				cart.setQuantity(resultSet.getInt("quantity"));
				cart.setStatCheck(resultSet.getString("check_status"));
				cart.setStatDelete(resultSet.getString("delete_status"));
				cart.setName(resultSet.getString("name"));
				cart.setColorValue(resultSet.getString("color_value"));
				cart.setSizeValue(resultSet.getString("size_value"));
				cart.setPicSmall(resultSet.getString("pic_small"));
				cart.setPriceCurrent(resultSet.getBigDecimal("price_current"));
				cart.setPriceOrigin(resultSet.getBigDecimal("price_origin"));
			}
			System.out.println("***SQL查询结果 end");
			System.out.println("操作成功");
			return cart;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("操作失败");
			throw new RuntimeException("查询失败", e);
		}
	}

}
