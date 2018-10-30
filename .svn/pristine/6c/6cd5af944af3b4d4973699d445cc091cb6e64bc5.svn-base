package com.iwonder.tea.lib.dao.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.UUID;

import com.iwonder.tea.framework.dao.imp.BaseDaoImp;
import com.iwonder.tea.framework.util.StringUtil;
import com.iwonder.tea.lib.dao.IWarehouseDao;
import com.iwonder.tea.lib.entity.Warehouse;
import com.iwonder.tea.lib.view.WarehouseConditionView;
import com.iwonder.tea.lib.view.WarehouseQueryView;

public class WarehouseDaoImp extends BaseDaoImp implements IWarehouseDao {
	public ArrayList<WarehouseQueryView> list(WarehouseConditionView warehouseConditionView) {
		ArrayList<WarehouseQueryView> arr = new ArrayList<WarehouseQueryView>();

		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		try {
			// 获取Connection
			// S3.获取statement(执行语句的对象)
			StringBuilder sql = new StringBuilder();

			sql.append(
					" select lib_warehouse.* , sys_staff.staff_name,bas_data_dictionary_detail.dictionary_detail_label");
			sql.append(" from lib_warehouse");
			sql.append(" JOIN sys_staff");
			sql.append(" on lib_warehouse.staff_id= sys_staff.staff_id");
			sql.append(" JOIN bas_data_dictionary_detail");
			sql.append(" on lib_warehouse.pay_stat = bas_data_dictionary_detail.dictionary_detail_code");
			if (StringUtil.isNotEmpty(warehouseConditionView.getWarehouseCode())) {
				sql.append(" and lib_warehouse.warehouse_code like ? ");
			}
			if (StringUtil.isNotEmpty(warehouseConditionView.getStaffId())) {
				sql.append(" and lib_warehouse.staff_id = ? ");
			}
			if (StringUtil.isNotEmpty(StringUtil.bigDecimalToString(warehouseConditionView.getPrice()))) {
				sql.append(" and lib_warehouse.price = ? ");
			}
			if (StringUtil.isNotEmpty(warehouseConditionView.getPayStat())) {
				if (!warehouseConditionView.getPayStat().equals("0"))
					sql.append(" and lib_warehouse.pay_stat = ? ");
			}
			if (StringUtil.isNotEmpty(StringUtil.dateFormat(warehouseConditionView.getPurchaseDate()))) {
				sql.append(" and lib_warehouse.purchase_date = ? ");
			}
			if (StringUtil.isNotEmpty(StringUtil.dateFormat(warehouseConditionView.getWarehouseDate()))) {
				sql.append(" and lib_warehouse.warehouse_date = ? ");
			}
			if (StringUtil.isNotEmpty(warehouseConditionView.getRemark())) {// 备注模糊
				sql.append(" and lib_warehouse.remark like ? ");
			}

			/* cjz */
			if (StringUtil.isNotEmpty(warehouseConditionView.getPurchaseDateStart())) {// 采购日期
				sql.append(" and lib_warehouse.purchase_date >= ?");
			}
			if (StringUtil.isNotEmpty(warehouseConditionView.getPurchaseDateEnd())) {
				sql.append(" and lib_warehouse.purchase_date <= ?");
			}
			if (StringUtil.isNotEmpty(warehouseConditionView.getWarehouseDateStart())) {// 入库日期
				sql.append(" and lib_warehouse.warehouse_date >= ?");
			}
			if (StringUtil.isNotEmpty(warehouseConditionView.getWarehouseDateEnd())) {
				sql.append(" and lib_warehouse.warehouse_date <= ?");
			}
			/* cjz */
			preparedStatement = super.prepareStatement(sql.toString());
			int parameterIndex = 1;
			if (StringUtil.isNotEmpty(warehouseConditionView.getWarehouseCode())) {
				preparedStatement.setObject(parameterIndex++, warehouseConditionView.getWarehouseCode());
			}
			if (StringUtil.isNotEmpty(warehouseConditionView.getStaffId())) {
				preparedStatement.setObject(parameterIndex++, warehouseConditionView.getStaffId());
			}
			if (StringUtil.isNotEmpty(StringUtil.bigDecimalToString(warehouseConditionView.getPrice()))) {
				preparedStatement.setObject(parameterIndex++, warehouseConditionView.getPrice());
			}
			if (StringUtil.isNotEmpty(warehouseConditionView.getPayStat())) {
				if (!warehouseConditionView.getPayStat().equals("0"))
					preparedStatement.setObject(parameterIndex++, warehouseConditionView.getPayStat());
			}
			if (StringUtil.isNotEmpty(StringUtil.dateFormat(warehouseConditionView.getPurchaseDate()))) {
				preparedStatement.setObject(parameterIndex++, warehouseConditionView.getPurchaseDate());
			}
			if (StringUtil.isNotEmpty(StringUtil.dateFormat(warehouseConditionView.getWarehouseDate()))) {
				preparedStatement.setObject(parameterIndex++, warehouseConditionView.getWarehouseDate());
			}
			if (StringUtil.isNotEmpty(warehouseConditionView.getRemark())) {
				preparedStatement.setObject(parameterIndex++, "%" + warehouseConditionView.getRemark() + "%");
			}

			/* cjz */
			if (StringUtil.isNotEmpty(warehouseConditionView.getPurchaseDateStart())) {
				preparedStatement.setObject(parameterIndex++, warehouseConditionView.getPurchaseDateStart());
			}
			if (StringUtil.isNotEmpty(warehouseConditionView.getPurchaseDateEnd())) {
				preparedStatement.setObject(parameterIndex++, warehouseConditionView.getPurchaseDateEnd());
			}
			if (StringUtil.isNotEmpty(warehouseConditionView.getWarehouseDateStart())) {
				preparedStatement.setObject(parameterIndex++, warehouseConditionView.getWarehouseDateStart());
			}
			if (StringUtil.isNotEmpty(warehouseConditionView.getWarehouseDateEnd())) {
				preparedStatement.setObject(parameterIndex++, warehouseConditionView.getWarehouseDateEnd());
			}
			/* cjz */

			System.out.println("***SQL:" + sql);
			System.out.println("***param:" + warehouseConditionView.toString());
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

				WarehouseQueryView warehouse = new WarehouseQueryView();
				warehouse.setWarehouseId(resultSet.getString("warehouse_id"));
				warehouse.setWarehouseCode(resultSet.getString("warehouse_code"));
				warehouse.setStaffId(resultSet.getString("staff_id"));
				warehouse.setPrice(resultSet.getBigDecimal("price"));
				warehouse.setPayStat(resultSet.getString("pay_stat"));
				warehouse.setPurchaseDate(resultSet.getDate("purchase_date"));
				warehouse.setWarehouseDate(resultSet.getDate("warehouse_date"));
				warehouse.setRemark(resultSet.getString("remark"));
				warehouse.setName(resultSet.getString("staff_name"));
				warehouse.setDictionaryDetailLabel(resultSet.getString("dictionary_detail_label"));
				arr.add(warehouse);
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

	public ArrayList<Warehouse> list() {
		ArrayList<Warehouse> arr = new ArrayList<Warehouse>();

		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		try {
			// 获取Connection

			// S3.获取statement(执行语句的对象)
			String sql = "select * from lib_warehouse";
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

				Warehouse warehouse = new Warehouse();
				warehouse.setWarehouseId(resultSet.getString("warehouse_id"));
				warehouse.setWarehouseCode(resultSet.getString("warehouse_code"));
				warehouse.setStaffId(resultSet.getString("staff_id"));
				warehouse.setPrice(resultSet.getBigDecimal("price"));
				warehouse.setPayStat(resultSet.getString("pay_stat"));
				warehouse.setPurchaseDate(resultSet.getDate("purchase_date"));
				warehouse.setWarehouseDate(resultSet.getDate("warehouse_date"));
				warehouse.setRemark(resultSet.getString("remark"));

				arr.add(warehouse);

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

	public void delete(String warehouseId) {
		PreparedStatement preparedStatement = null;
		// ResultSet resultSet = null;

		try {

			// S3.获取statement(执行语句的对象)
			String sql = "delete from lib_warehouse where warehouse_id = ?";
			preparedStatement = super.prepareStatement(sql);

			int paramIndex = 1;
			preparedStatement.setObject(paramIndex++, warehouseId);

			// s4-1.执行sql
			int rowCount = preparedStatement.executeUpdate();
			System.out.println("影响行数:" + rowCount);
			if (rowCount == 0) {
				throw new RuntimeException("学生不存在:" + warehouseId);
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

	public void insert(Warehouse warehouse) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		// ResultSet resultSet = null;、

		try {

			// S3.获取statement(执行语句的对象)
			String sql = "insert into lib_warehouse(warehouse_id,warehouse_code,staff_id,price,pay_stat,purchase_date,warehouse_date,remark) values(?,?,?,?,?,?,?,?)";
			preparedStatement = super.prepareStatement(sql);

			int paramIndex = 1;

			String uuid = UUID.randomUUID().toString().replaceAll("-", "");
			warehouse.setWarehouseId(uuid);
			// String studentName = "aa2" ;
			preparedStatement.setObject(paramIndex++, warehouse.getWarehouseId());
			preparedStatement.setObject(paramIndex++, warehouse.getWarehouseCode());
			preparedStatement.setObject(paramIndex++, warehouse.getStaffId());
			preparedStatement.setObject(paramIndex++, warehouse.getPrice());
			preparedStatement.setObject(paramIndex++, warehouse.getPayStat());
			preparedStatement.setObject(paramIndex++, warehouse.getPurchaseDate());
			preparedStatement.setObject(paramIndex++, warehouse.getWarehouseDate());
			preparedStatement.setObject(paramIndex++, warehouse.getRemark());

			System.out.println("***SQL:" + sql);
			System.out.println("***param:" + warehouse.toString());

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

	public void update(Warehouse warehouse) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;

		try {
			// 获取Connection

			// S3.获取statement(执行语句的对象)

			String sql = "update lib_warehouse set warehouse_code=? ,staff_id=? ,price=? ,pay_stat=?,purchase_date=?,warehouse_date=?,remark=? where warehouse_id = ?";
			preparedStatement = super.prepareStatement(sql);

			int paramIndex = 1;
			preparedStatement.setObject(paramIndex++, warehouse.getWarehouseCode());
			preparedStatement.setObject(paramIndex++, warehouse.getStaffId());
			preparedStatement.setObject(paramIndex++, warehouse.getPrice());
			preparedStatement.setObject(paramIndex++, warehouse.getPayStat());
			preparedStatement.setObject(paramIndex++, warehouse.getPurchaseDate());
			preparedStatement.setObject(paramIndex++, warehouse.getWarehouseDate());
			preparedStatement.setObject(paramIndex++, warehouse.getRemark());
			preparedStatement.setObject(paramIndex++, warehouse.getWarehouseId());

			// s4-1.执行sql
			int rowCount = preparedStatement.executeUpdate();

			System.out.println("影响行数:" + rowCount);

			System.out.println("操作成功");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("操作失败");
		}
	}

	public Warehouse load(String warehouseId) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		try {

			// 获取Connection

			// S3.获取statement(执行语句的对象)
			String sql = "select * from lib_warehouse where warehouse_id = ?";
			preparedStatement = super.prepareStatement(sql);
			preparedStatement.setObject(1, warehouseId);

			// s4-1.执行sql
			resultSet = preparedStatement.executeQuery();

			// s4-1.遍历resultSet

			/*
			 * student_id student_name start_date max_count remark
			 * 
			 */
			Warehouse warehouse = new Warehouse();

			if (resultSet.next()) {
				warehouse.setWarehouseId(resultSet.getString("warehouse_id"));
				warehouse.setWarehouseCode(resultSet.getString("warehouse_code"));
				warehouse.setStaffId(resultSet.getString("staff_id"));
				warehouse.setPrice(resultSet.getBigDecimal("price"));
				warehouse.setPayStat(resultSet.getString("pay_stat"));
				warehouse.setPurchaseDate(resultSet.getDate("purchase_date"));
				warehouse.setWarehouseDate(resultSet.getDate("warehouse_date"));
				warehouse.setRemark(resultSet.getString("remark"));
			} else {
				System.out.println("ID不存在");
				throw new RuntimeException("查询失败");
			}

			System.out.println("操作成功");
			return warehouse;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("操作失败");
			throw new RuntimeException("查询失败", e);
		}
	}

}
