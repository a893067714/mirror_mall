package com.iwonder.tea.ord.dao.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.UUID;

import com.iwonder.tea.framework.dao.imp.BaseDaoImp;
import com.iwonder.tea.framework.util.StringUtil;
import com.iwonder.tea.ord.dao.IOrderSKUDao;
import com.iwonder.tea.ord.entity.OrderSKU;
import com.iwonder.tea.ord.view.OrderSKUConditionView;
import com.iwonder.tea.ord.view.OrderSKUQueryView;

public class OrderSKUDaoImp extends BaseDaoImp implements IOrderSKUDao {

	public ArrayList<OrderSKUQueryView> list(OrderSKUConditionView orderSKUConditionView) {
		ArrayList<OrderSKUQueryView> arr = new ArrayList<OrderSKUQueryView>();

		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		try {

			// S3.获取statement(执行语句的对象)
			StringBuilder sql = new StringBuilder();
			/*
			 * sql.
			 * append("  select ord_order_detail.* , ord_order.order_code , prd_sku.sku_code from ord_order_detail"
			 * ) ; sql.append("  JOIN ord_order");
			 * sql.append("  on ord_order_detail.order_id= ord_order.order_id");
			 * sql.append("  join prd_sku"); sql.
			 * append("  on ord_order_detail.product_sku_id=prd_sku.product_sku_id"
			 * );
			 */
			sql.append(" select ord_order_detail.* , ord_order.order_code , prd_sku.sku_code ,");
			sql.append(
					" a.dictionary_detail_label as send_status ,b.dictionary_detail_label AS done_status ,c.dictionary_detail_label as sign_status,d.dictionary_detail_label as eval_status,");
			sql.append(
					" a.data_dictionary_code as send_code,b.data_dictionary_code as log_code ,c.data_dictionary_code as sign_code,c.data_dictionary_code as eval_code,e.pic_small");
			sql.append(" from ord_order_detail");
			sql.append(" JOIN ord_order");
			sql.append(" on ord_order_detail.order_id= ord_order.order_id");
			sql.append(" join prd_sku");
			sql.append(" on ord_order_detail.product_sku_id=prd_sku.product_sku_id");
			sql.append(" join bas_data_dictionary_detail as a");
			sql.append(" on a.dictionary_detail_code=ord_order_detail.send_stat");
			sql.append(" join bas_data_dictionary_detail as b");
			sql.append(" on b.dictionary_detail_code=ord_order_detail.log_done");
			sql.append(" join bas_data_dictionary_detail as c ");
			sql.append(" on c.dictionary_detail_code=ord_order_detail.sign_stat");
			sql.append(" join bas_data_dictionary_detail as d");
			sql.append(" on d.dictionary_detail_code=ord_order_detail.eval_stat");

			// 修改
			sql.append("  join prd_sku as e");
			sql.append("  on e.product_sku_id = ord_order_detail.product_sku_id");

			sql.append(
					" where a.data_dictionary_code='send_status' and b.data_dictionary_code = 'log_done' and c.data_dictionary_code='sign_status' and d.data_dictionary_code='eval_status'");

			if (StringUtil.isNotEmpty(orderSKUConditionView.getOrderDtlCode())) {
				sql.append(" and ord_order_detail.order_dtl_code = ? ");
			}
			if (StringUtil.isNotEmpty(orderSKUConditionView.getOrderId())) {
				sql.append(" and ord_order_detail.order_id = ? ");
			}
			if (StringUtil.isNotEmpty(orderSKUConditionView.getProductSkuId())) {
				sql.append(" and ord_order_detail.product_sku_id = ? ");
			}
			if (StringUtil.isNotEmpty(StringUtil.bigDecimalToString(orderSKUConditionView.getPrice()))) {
				sql.append(" and ord_order_detail.price = ? ");
			}
			if (StringUtil.isNotEmpty(StringUtil.IntegerToString(orderSKUConditionView.getAmount()))) {
				sql.append(" and ord_order_detail.amount = ? ");
			}
			if (StringUtil.isNotEmpty(orderSKUConditionView.getSendStat())) {
				sql.append(" and ord_order_detail.send_stat = ? ");
			}
			if (StringUtil.isNotEmpty(StringUtil.dateFormat(orderSKUConditionView.getSendDate()))) {
				sql.append(" and ord_order_detail.send_date = ? ");
			}
			if (StringUtil.isNotEmpty(orderSKUConditionView.getLogDoing())) {
				sql.append(" and ord_order_detail.log_doing = ? ");
			}
			if (StringUtil.isNotEmpty(orderSKUConditionView.getLogDone())) {
				sql.append(" and ord_order_detail.log_done = ? ");
			}
			if (StringUtil.isNotEmpty(orderSKUConditionView.getSignStat())) {
				sql.append(" and ord_order_detail.sign_stat = ? ");
			}
			if (StringUtil.isNotEmpty(StringUtil.dateFormat(orderSKUConditionView.getSignDate()))) {
				sql.append(" and ord_order_detail.sign_date = ? ");
			}
			if (StringUtil.isNotEmpty(orderSKUConditionView.getEvalStat())) {
				sql.append(" and ord_order_detail.eval_stat = ? ");
			}
			if (StringUtil.isNotEmpty(StringUtil.dateFormat(orderSKUConditionView.getEvalDate()))) {
				sql.append(" and ord_order_detail.eval_date = ? ");
			}
			preparedStatement = super.prepareStatement(sql.toString());
			int parameterIndex = 1;
			if (StringUtil.isNotEmpty(orderSKUConditionView.getOrderDtlCode())) {
				preparedStatement.setObject(parameterIndex++, orderSKUConditionView.getOrderDtlCode());
			}
			if (StringUtil.isNotEmpty(orderSKUConditionView.getOrderId())) {
				preparedStatement.setObject(parameterIndex++, orderSKUConditionView.getOrderId());
			}
			if (StringUtil.isNotEmpty(orderSKUConditionView.getProductSkuId())) {
				preparedStatement.setObject(parameterIndex++, orderSKUConditionView.getProductSkuId());
			}
			if (StringUtil.isNotEmpty(StringUtil.bigDecimalToString(orderSKUConditionView.getPrice()))) {
				preparedStatement.setObject(parameterIndex++, orderSKUConditionView.getPrice());
			}
			if (StringUtil.isNotEmpty(StringUtil.IntegerToString(orderSKUConditionView.getAmount()))) {
				preparedStatement.setObject(parameterIndex++, orderSKUConditionView.getAmount());
			}
			if (StringUtil.isNotEmpty(orderSKUConditionView.getSendStat())) {
				preparedStatement.setObject(parameterIndex++, orderSKUConditionView.getSendStat());
			}
			if (StringUtil.isNotEmpty(StringUtil.dateFormat(orderSKUConditionView.getSendDate()))) {
				preparedStatement.setObject(parameterIndex++, orderSKUConditionView.getSendDate());
			}
			if (StringUtil.isNotEmpty(orderSKUConditionView.getLogDoing())) {
				preparedStatement.setObject(parameterIndex++, orderSKUConditionView.getLogDoing());
			}
			if (StringUtil.isNotEmpty(orderSKUConditionView.getLogDone())) {
				preparedStatement.setObject(parameterIndex++, orderSKUConditionView.getLogDone());
			}
			if (StringUtil.isNotEmpty(orderSKUConditionView.getSignStat())) {
				preparedStatement.setObject(parameterIndex++, orderSKUConditionView.getSignStat());
			}
			if (StringUtil.isNotEmpty(StringUtil.dateFormat(orderSKUConditionView.getSignDate()))) {
				preparedStatement.setObject(parameterIndex++, orderSKUConditionView.getSignDate());
			}
			if (StringUtil.isNotEmpty(orderSKUConditionView.getEvalStat())) {
				preparedStatement.setObject(parameterIndex++, orderSKUConditionView.getEvalStat());
			}
			if (StringUtil.isNotEmpty(StringUtil.dateFormat(orderSKUConditionView.getEvalDate()))) {
				preparedStatement.setObject(parameterIndex++, orderSKUConditionView.getEvalDate());
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
				OrderSKUQueryView orderSKU = new OrderSKUQueryView();
				orderSKU.setOrderDtlId(resultSet.getString("order_dtl_id"));
				orderSKU.setOrderDtlCode(resultSet.getString("order_dtl_code"));
				orderSKU.setOrderId(resultSet.getString("order_id"));
				orderSKU.setProductSkuId(resultSet.getString("product_sku_id"));
				orderSKU.setPrice(resultSet.getBigDecimal("price"));
				orderSKU.setAmount(resultSet.getInt("amount"));
				orderSKU.setSendStat(resultSet.getString("send_stat"));
				orderSKU.setSendDate(resultSet.getDate("send_date"));
				orderSKU.setLogDoing(resultSet.getString("log_doing"));
				orderSKU.setLogDone(resultSet.getString("log_done"));
				orderSKU.setSignStat(resultSet.getString("sign_stat"));
				orderSKU.setSignDate(resultSet.getDate("sign_date"));
				orderSKU.setEvalStat(resultSet.getString("eval_stat"));
				orderSKU.setEvalDate(resultSet.getDate("eval_date"));
				orderSKU.setProductSKUCode(resultSet.getString("sku_code"));
				orderSKU.setOrderCode(resultSet.getString("order_code"));
				orderSKU.setSendStatLabel(resultSet.getString("send_status"));
				orderSKU.setLogDoneLabel(resultSet.getString("done_status"));
				orderSKU.setSignStatLabel(resultSet.getString("sign_status"));
				orderSKU.setEvalStatLabel(resultSet.getString("eval_status"));
				// xiugai
				orderSKU.setOrderSKUPic(resultSet.getString("pic_small"));
				arr.add(orderSKU);
				System.out.println(orderSKU);
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

	public ArrayList<OrderSKU> list() {
		ArrayList<OrderSKU> arr = new ArrayList<OrderSKU>();

		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		try {
			// 获取Connection

			// S3.获取statement(执行语句的对象)
			String sql = "select * from ord_order_detail";
			preparedStatement = super.prepareStatement(sql);

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
				OrderSKU orderSKU = new OrderSKU();
				orderSKU.setOrderDtlId(resultSet.getString("order_dtl_id"));
				orderSKU.setOrderDtlCode(resultSet.getString("order_dtl_code"));
				orderSKU.setOrderId(resultSet.getString("order_id"));
				orderSKU.setProductSkuId(resultSet.getString("product_sku_id"));
				orderSKU.setPrice(resultSet.getBigDecimal("price"));
				orderSKU.setAmount(resultSet.getInt("amount"));
				orderSKU.setSendStat(resultSet.getString("send_stat"));
				orderSKU.setSendDate(resultSet.getDate("send_date"));
				orderSKU.setLogDoing(resultSet.getString("log_doing"));
				orderSKU.setLogDone(resultSet.getString("log_done"));
				orderSKU.setSignStat(resultSet.getString("sign_stat"));
				orderSKU.setSignDate(resultSet.getDate("sign_date"));
				orderSKU.setEvalStat(resultSet.getString("eval_stat"));
				orderSKU.setEvalDate(resultSet.getDate("eval_date"));
				arr.add(orderSKU);
				System.out.println(orderSKU);
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

	public void delete(String orderDtlId) {
		PreparedStatement preparedStatement = null;
		// ResultSet resultSet = null;

		try {

			// S3.获取statement(执行语句的对象)
			String sql = "delete from ord_order_detail where order_dtl_id = ?";
			preparedStatement = super.prepareStatement(sql);

			int paramIndex = 1;
			preparedStatement.setObject(paramIndex++, orderDtlId);

			// s4-1.执行sql
			int rowCount = preparedStatement.executeUpdate();
			System.out.println("影响行数:" + rowCount);
			if (rowCount == 0) {
				throw new RuntimeException("学生不存在:" + orderDtlId);
			}

			System.out.println("操作成功");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("操作失败");
			throw new RuntimeException("删除学生失败", e);
		}
	}

	public void deleteByOrderId(String orderId) {
		PreparedStatement preparedStatement = null;
		// ResultSet resultSet = null;
		try {
			// S3.获取statement(执行语句的对象)
			String sql = "delete from ord_order_detail where order_id = ?";
			preparedStatement = super.prepareStatement(sql);

			int paramIndex = 1;
			preparedStatement.setObject(paramIndex++, orderId);

			// s4-1.执行sql
			int rowCount = preparedStatement.executeUpdate();
			System.out.println("影响行数:" + rowCount);

			System.out.println("操作成功");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("操作失败");
		}
	}

	// 不方便扩展，不方便维护
	// public void insert(String studentId , String studentName){
	//
	// }

	public void insert(OrderSKU orderSKU) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		// ResultSet resultSet = null;、
		System.out.println(orderSKU.toString());

		try {

			// S3.获取statement(执行语句的对象)
			String sql = "insert into ord_order_detail(order_dtl_id,order_dtl_code,order_id,product_sku_id,price,amount,send_stat,send_date,log_doing,log_done,sign_stat,sign_date,eval_stat,eval_date) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			preparedStatement = super.prepareStatement(sql);

			int paramIndex = 1;

			String uuid = UUID.randomUUID().toString().replaceAll("-", "");
			orderSKU.setOrderDtlId(uuid);
			;
			// String studentName = "aa2" ;

			preparedStatement.setObject(paramIndex++, orderSKU.getOrderDtlId());
			preparedStatement.setObject(paramIndex++, orderSKU.getOrderDtlCode());
			preparedStatement.setObject(paramIndex++, orderSKU.getOrderId());
			preparedStatement.setObject(paramIndex++, orderSKU.getProductSkuId());
			preparedStatement.setObject(paramIndex++, orderSKU.getPrice());
			preparedStatement.setObject(paramIndex++, orderSKU.getAmount());
			preparedStatement.setObject(paramIndex++, orderSKU.getSendStat());
			preparedStatement.setObject(paramIndex++, orderSKU.getSendDate());
			preparedStatement.setObject(paramIndex++, orderSKU.getLogDoing());
			preparedStatement.setObject(paramIndex++, orderSKU.getLogDone());
			preparedStatement.setObject(paramIndex++, orderSKU.getSignStat());
			preparedStatement.setObject(paramIndex++, orderSKU.getSignDate());
			preparedStatement.setObject(paramIndex++, orderSKU.getEvalStat());
			preparedStatement.setObject(paramIndex++, orderSKU.getEvalDate());

			System.out.println("***SQL:" + sql);
			System.out.println("***param:" + orderSKU.toString());

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

	public void update(OrderSKU orderSKU) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;

		try {
			// 获取Connection

			// S3.获取statement(执行语句的对象)

			String sql = "update ord_order_detail set order_dtl_code=? ,order_id=?,product_sku_id=?,price=?,amount=?,send_stat=?,send_date=?,log_doing=?,log_done=?,sign_stat=?,sign_date=?,eval_stat=?,eval_date=? where order_dtl_id = ?";
			preparedStatement = super.prepareStatement(sql);

			int paramIndex = 1;

			preparedStatement.setObject(paramIndex++, orderSKU.getOrderDtlCode());
			preparedStatement.setObject(paramIndex++, orderSKU.getOrderId());
			preparedStatement.setObject(paramIndex++, orderSKU.getProductSkuId());
			preparedStatement.setObject(paramIndex++, orderSKU.getPrice());
			preparedStatement.setObject(paramIndex++, orderSKU.getAmount());
			preparedStatement.setObject(paramIndex++, orderSKU.getSendStat());
			preparedStatement.setObject(paramIndex++, orderSKU.getSendDate());
			preparedStatement.setObject(paramIndex++, orderSKU.getLogDoing());
			preparedStatement.setObject(paramIndex++, orderSKU.getLogDone());
			preparedStatement.setObject(paramIndex++, orderSKU.getSignStat());
			preparedStatement.setObject(paramIndex++, orderSKU.getSignDate());
			preparedStatement.setObject(paramIndex++, orderSKU.getEvalStat());
			preparedStatement.setObject(paramIndex++, orderSKU.getEvalDate());
			preparedStatement.setObject(paramIndex++, orderSKU.getOrderDtlId());

			// s4-1.执行sql
			int rowCount = preparedStatement.executeUpdate();

			System.out.println("影响行数:" + rowCount);

			System.out.println("操作成功");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("操作失败");
		}
	}

	public OrderSKU load(String orderDtlId) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		try {

			// 获取Connection

			// S3.获取statement(执行语句的对象)
			String sql = "select * from ord_order_detail where order_dtl_id = ?";
			preparedStatement = super.prepareStatement(sql);
			preparedStatement.setObject(1, orderDtlId);

			// s4-1.执行sql
			resultSet = preparedStatement.executeQuery();

			// s4-1.遍历resultSet

			/*
			 * student_id student_name start_date max_count remark
			 * 
			 */
			OrderSKU orderSKU = new OrderSKU();
			if (resultSet.next()) {
				orderSKU.setOrderDtlId(resultSet.getString("order_dtl_id"));
				orderSKU.setOrderDtlCode(resultSet.getString("order_dtl_code"));
				orderSKU.setOrderId(resultSet.getString("order_id"));
				orderSKU.setProductSkuId(resultSet.getString("product_sku_id"));
				orderSKU.setPrice(resultSet.getBigDecimal("price"));
				orderSKU.setAmount(resultSet.getInt("amount"));
				orderSKU.setSendStat(resultSet.getString("send_stat"));
				orderSKU.setSendDate(resultSet.getDate("send_date"));
				orderSKU.setLogDoing(resultSet.getString("log_doing"));
				orderSKU.setLogDone(resultSet.getString("log_done"));
				orderSKU.setSignStat(resultSet.getString("sign_stat"));
				orderSKU.setSignDate(resultSet.getDate("sign_date"));
				orderSKU.setEvalStat(resultSet.getString("eval_stat"));
				orderSKU.setEvalDate(resultSet.getDate("eval_date"));
			} else {
				System.out.println("ID不存在");
				throw new RuntimeException("查询失败");
			}
			System.out.println("操作成功");
			return orderSKU;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("操作失败");
			throw new RuntimeException("查询失败", e);
		}
	}

}
