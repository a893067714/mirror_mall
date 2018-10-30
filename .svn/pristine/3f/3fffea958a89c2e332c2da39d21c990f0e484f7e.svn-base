package com.iwonder.tea.ord.dao.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.UUID;

import com.iwonder.tea.framework.dao.imp.BaseDaoImp;
import com.iwonder.tea.framework.util.StringUtil;
import com.iwonder.tea.ord.dao.IOrderDao;
import com.iwonder.tea.ord.entity.Order;
import com.iwonder.tea.ord.view.OrderConditionView;
import com.iwonder.tea.ord.view.OrderQueryView;




public class OrderDaoImp extends BaseDaoImp implements IOrderDao{

	public ArrayList<OrderQueryView> list(OrderConditionView orderConditionView){
		ArrayList<OrderQueryView> arr = new ArrayList<OrderQueryView>();
		
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		System.out.println("date"+orderConditionView.getCreateDate());
		System.out.println("有到这来");
		try {
			
			// s4-1.执行sql
		
			StringBuilder sql = new StringBuilder();
			sql.append(" select ord_order.* , usr_user_info.`name` , usr_address_info.address_cont,bas_data_dictionary_detail.dictionary_detail_label from ord_order");
			sql.append("  JOIN usr_user_info");
			sql.append("  on ord_order.user_id= usr_user_info.user_id ");
			sql.append("  JOIN usr_address_info");
			sql.append("  on ord_order.address_id=usr_address_info.address_id");
			sql.append(" Join bas_data_dictionary_detail");
			sql.append(" ON ord_order.pay_stat=bas_data_dictionary_detail.dictionary_detail_code");
			
			// S3.获取statement(执行语句的对象)
			if(StringUtil.isNotEmpty(orderConditionView.getOrderCode())){
				
			
				sql.append(" and ord_order.order_code like ? " );
				
			}
			if(StringUtil.isNotEmpty(orderConditionView.getUserId())){
				
				sql.append(" and ord_order.user_id like ? " );
				
			}
		if(StringUtil.isNotEmpty(orderConditionView.getAddressId())){
			
				sql.append(" and ord_order.address_id like ? " );
				
			}
			
			if(StringUtil.isNotEmpty(StringUtil.dateFormat(orderConditionView.getCreateDate()))){
				
				sql.append(" and ord_order.create_date = ? " );
				
			}
			if(StringUtil.isNotEmpty(StringUtil.bigDecimalToString(orderConditionView.getTotalPrice()))){
			
				sql.append(" and ord_order.total_price = ? " );
			
			}
			if(StringUtil.isNotEmpty(orderConditionView.getPayStat())){
				
				sql.append(" and ord_order.pay_stat = ? " );
				
			}
			if(StringUtil.isNotEmpty(StringUtil.dateFormat(orderConditionView.getPayDate()))){
				
				sql.append(" and ord_order.pay_date = ? " );
				
			}
			System.out.println(sql);
			preparedStatement = super.prepareStatement(sql.toString());
			int parameterIndex=1;
			if(StringUtil.isNotEmpty(orderConditionView.getOrderCode())){
		
				
				preparedStatement.setObject(parameterIndex++,orderConditionView.getOrderCode()+"%");
			
			}
			if(StringUtil.isNotEmpty(orderConditionView.getUserId())){
				preparedStatement.setObject(parameterIndex++,orderConditionView.getUserId()+"%");
			}
			if(StringUtil.isNotEmpty(orderConditionView.getAddressId())){
				preparedStatement.setObject(parameterIndex++, orderConditionView.getAddressId()+"%");
			}
			
			if(StringUtil.isNotEmpty(StringUtil.dateFormat(orderConditionView.getCreateDate()))){
				preparedStatement.setObject(parameterIndex++, orderConditionView.getCreateDate());
			}
			if(StringUtil.isNotEmpty(StringUtil.bigDecimalToString(orderConditionView.getTotalPrice()))){
				preparedStatement.setObject(parameterIndex++, orderConditionView.getTotalPrice());
			}if(StringUtil.isNotEmpty(orderConditionView.getPayStat())){
				preparedStatement.setObject(parameterIndex++, orderConditionView.getPayStat());
			}if(StringUtil.isNotEmpty(StringUtil.dateFormat(orderConditionView.getPayDate()))){
				preparedStatement.setObject(parameterIndex++, orderConditionView.getPayDate());
			}

			System.out.println("***SQL:" + sql);
			System.out.println("***param:" + "");
			// s4-1.执行sql
			resultSet = preparedStatement.executeQuery();
			super.addResultSet(resultSet) ;//待封装 TODO
			// s4-1.遍历resultSet

			/*
			 * student_id student_name start_date max_count remark
			 * 
			 */
			System.out.println("***SQL查询结果 begin");

			while (resultSet.next()) {
				OrderQueryView order = new OrderQueryView();
				
				order.setOrderId(resultSet.getString("order_id"));
				order.setOrderCode(resultSet.getString("order_code"));
				order.setUserId(resultSet.getString("user_id"));
				order.setAddressId(resultSet.getString("address_id"));
				order.setCreateDate(resultSet.getDate("create_date"));
				order.setTotalPrice(resultSet.getBigDecimal("total_price"));
				order.setPayStat(resultSet.getString("pay_stat"));
				order.setPayDate(resultSet.getDate("pay_date"));
				order.setName(resultSet.getString("name"));
				order.setAddressCont(resultSet.getString("address_cont"));
				order.setDictionaryDetaiLabel(resultSet.getString("dictionary_detail_label"));
				System.out.println("dictionary_detail_label"+resultSet.getString("dictionary_detail_label"));
				arr.add(order);
				System.out.println(order);
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
	
	
	public ArrayList<Order> list() {
		ArrayList<Order> arr = new ArrayList<Order>();

		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			// 获取Connection
			

			// S3.获取statement(执行语句的对象)
			String sql = "select * from ord_order";
			preparedStatement = super.prepareStatement(sql);
			

			System.out.println("***SQL:" + sql);
			System.out.println("***param:" + "");
			// s4-1.执行sql
			resultSet = preparedStatement.executeQuery();
			super.addResultSet(resultSet) ;//待封装 TODO
			// s4-1.遍历resultSet

			/*
			 * student_id student_name start_date max_count remark
			 * 
			 */
			System.out.println("***SQL查询结果 begin");

			while (resultSet.next()) {
				Order order = new Order();
				
				order.setOrderId(resultSet.getString("order_id"));
				order.setOrderCode(resultSet.getString("order_code"));
				order.setUserId(resultSet.getString("user_id"));
				order.setAddressId(resultSet.getString("address_id"));
				order.setCreateDate(resultSet.getDate("create_date"));
				order.setTotalPrice(resultSet.getBigDecimal("total_price"));
				order.setPayStat(resultSet.getString("pay_stat"));
				order.setPayDate(resultSet.getDate("pay_date"));
				System.out.println(resultSet.getString("order_id"));
				arr.add(order);
				
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

	public void delete(String orderId) {
		PreparedStatement preparedStatement = null;
		// ResultSet resultSet = null;
		
		try {
			
			// S3.获取statement(执行语句的对象)
			String sql = "delete from ord_order where order_id = ?";
			preparedStatement = super.prepareStatement(sql);

			int paramIndex = 1;
			preparedStatement.setObject(paramIndex++, orderId);
			

			// s4-1.执行sql
			int rowCount = preparedStatement.executeUpdate();
			System.out.println("影响行数:" + rowCount);
			if(rowCount == 0){
				throw new RuntimeException("学生不存在:" + orderId);
			}
			

			System.out.println("操作成功");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("操作失败");
			throw new RuntimeException("删除学生失败" ,e) ;
		} 
	}

	// 不方便扩展，不方便维护
	// public void insert(String studentId , String studentName){
	//
	// }

	public Order insert(Order order) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		// ResultSet resultSet = null;、
		
		
		try {
			

			// S3.获取statement(执行语句的对象)
			String sql = "insert into ord_order(order_id,order_code,user_id,address_id,create_date,total_price,pay_stat,pay_date) values(?,?,?,?,?,?,?,?)";
			preparedStatement = super.prepareStatement(sql);

			int paramIndex = 1;

			String uuid = UUID.randomUUID().toString().replaceAll("-", "");
			order.setOrderId(uuid);
			// String studentName = "aa2" ;
			preparedStatement.setObject(paramIndex++, order.getOrderId());
			preparedStatement.setObject(paramIndex++, order.getOrderCode());
			preparedStatement.setObject(paramIndex++, order.getUserId());
			preparedStatement.setObject(paramIndex++, order.getAddressId());
			preparedStatement.setObject(paramIndex++, order.getCreateDate());
			preparedStatement.setObject(paramIndex++, order.getTotalPrice());
			preparedStatement.setObject(paramIndex++, order.getPayStat());
			preparedStatement.setObject(paramIndex++, order.getPayDate());

			System.out.println("***SQL:" + sql);
			System.out.println("***param:" + order.toString());

			// s4-1.执行sql
			int rowCount = preparedStatement.executeUpdate();

			System.out.println("***影响行数:" + rowCount);

			System.out.println("新增保存成功");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("新增保存失败");
		}
		return order; 
	}

	// 不方便扩展，不方便维护
	// public void update(String studentId , String studentName){
	//
	// }

	public void update(Order order) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		
		
		try {
			// 获取Connection

			// S3.获取statement(执行语句的对象)
			String sql = "update ord_order set order_code=?, user_id=? ,address_id=? ,create_date=?,total_price=?,pay_stat=?,pay_date=? where order_id = ?";
			preparedStatement = super.prepareStatement(sql);

			int paramIndex = 1;
			preparedStatement.setObject(paramIndex++, order.getOrderCode());
			preparedStatement.setObject(paramIndex++, order.getUserId());
			preparedStatement.setObject(paramIndex++, order.getAddressId());
			preparedStatement.setObject(paramIndex++, order.getCreateDate());
			preparedStatement.setObject(paramIndex++, order.getTotalPrice());
			preparedStatement.setObject(paramIndex++, order.getPayStat());
			preparedStatement.setObject(paramIndex++, order.getPayDate());
			preparedStatement.setObject(paramIndex++,order.getOrderId());

			// s4-1.执行sql
			int rowCount = preparedStatement.executeUpdate();

			System.out.println("影响行数:" + rowCount);

			System.out.println("操作成功");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("操作失败");
		} 
	}

	public Order load(String OrderId) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		
		try {
		

			// 获取Connection
			

			// S3.获取statement(执行语句的对象)
			String sql = "select * from ord_order where order_id = ?";
			preparedStatement = super.prepareStatement(sql);
			preparedStatement.setObject(1, OrderId);

			// s4-1.执行sql
			resultSet = preparedStatement.executeQuery();

			// s4-1.遍历resultSet

			/*
			 * student_id student_name start_date max_count remark
			 * 
			 */
			Order order = new Order();
			if (resultSet.next()) {
				order.setOrderId(resultSet.getString("order_id"));
				order.setOrderCode(resultSet.getString("order_code"));
				order.setUserId(resultSet.getString("user_id"));
				order.setAddressId(resultSet.getString("address_id"));
				order.setCreateDate(resultSet.getDate("create_date"));
				order.setTotalPrice(resultSet.getBigDecimal("total_price"));
				order.setPayStat(resultSet.getString("pay_stat"));
				order.setPayDate(resultSet.getDate("pay_date"));
			} else {
				System.out.println("ID不存在");
				throw new RuntimeException("查询失败");
			}

			System.out.println("操作成功");
			return order;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("操作失败");
			throw new RuntimeException("查询失败", e);
		} 
	}

	
}
