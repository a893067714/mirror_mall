package com.iwonder.tea.lib.dao.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.UUID;

import com.iwonder.tea.framework.dao.imp.BaseDaoImp;
import com.iwonder.tea.framework.util.StringUtil;
import com.iwonder.tea.lib.dao.IWarehouseSKUDao;
import com.iwonder.tea.lib.entity.WarehouseSKU;
import com.iwonder.tea.lib.view.WarehouseSKUConditionView;
import com.iwonder.tea.lib.view.WarehouseSKUQueryView;

public class WarehouseSKUDaoImp extends BaseDaoImp implements IWarehouseSKUDao {
	public ArrayList<WarehouseSKUQueryView> list(WarehouseSKUConditionView warehouseSKUConditionView) {
		ArrayList<WarehouseSKUQueryView> arr = new ArrayList<WarehouseSKUQueryView>();

		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		try {
			// 获取Connection

			// S3.获取statement(执行语句的对象)
			StringBuilder sql = new StringBuilder();
			sql.append(
					" select lib_warehouse_detail.* , prd_sku.sku_code, lib_warehouse.warehouse_code from lib_warehouse_detail");
			sql.append("  JOIN prd_sku");
			sql.append(" on lib_warehouse_detail.product_sku_id= prd_sku.product_sku_id");
			sql.append(" join lib_warehouse");
			sql.append(" on lib_warehouse_detail.warehouse_id = lib_warehouse.warehouse_id");
			if (StringUtil.isNotEmpty(warehouseSKUConditionView.getWarehouseDtlCode())) {
				sql.append(" and lib_warehouse_detail.warehouse_dtl_code = ? ");
			}
			if (StringUtil.isNotEmpty(warehouseSKUConditionView.getProductSkuId())) {
				sql.append(" and lib_warehouse_detail.product_sku_id = ? ");
			}
			if (StringUtil.isNotEmpty(warehouseSKUConditionView.getWarehouseId())) {
				sql.append(" and lib_warehouse_detail.warehouse_id = ? ");
			}
			if (StringUtil.isNotEmpty(StringUtil.bigDecimalToString(warehouseSKUConditionView.getUnitPrice()))) {
				sql.append(" and lib_warehouse_detail.unit_price = ? ");
			}
			if (StringUtil.isNotEmpty(StringUtil.IntegerToString(warehouseSKUConditionView.getQuantity()))) {
				sql.append(" and lib_warehouse_detail.quantity = ? ");
			}
			if (StringUtil.isNotEmpty(StringUtil.bigDecimalToString(warehouseSKUConditionView.getTotalPrice()))) {
				sql.append(" and lib_warehouse_detail.total_price = ? ");
			}
			if (StringUtil.isNotEmpty(warehouseSKUConditionView.getRemark())) {
				sql.append(" and lib_warehouse_detail.remark like ? ");
			}

			preparedStatement = super.prepareStatement(sql.toString());
			int parameterIndex = 1;
			if (StringUtil.isNotEmpty(warehouseSKUConditionView.getWarehouseDtlCode())) {
				preparedStatement.setObject(parameterIndex++, warehouseSKUConditionView.getWarehouseDtlCode());
			}
			if (StringUtil.isNotEmpty(warehouseSKUConditionView.getProductSkuId())) {
				preparedStatement.setObject(parameterIndex++, warehouseSKUConditionView.getProductSkuId());
			}
			if (StringUtil.isNotEmpty(warehouseSKUConditionView.getWarehouseId())) {
				preparedStatement.setObject(parameterIndex++, warehouseSKUConditionView.getWarehouseId());
			}
			if (StringUtil.isNotEmpty(StringUtil.bigDecimalToString(warehouseSKUConditionView.getUnitPrice()))) {
				preparedStatement.setObject(parameterIndex++, warehouseSKUConditionView.getUnitPrice());
			}
			if (StringUtil.isNotEmpty(StringUtil.IntegerToString(warehouseSKUConditionView.getQuantity()))) {
				preparedStatement.setObject(parameterIndex++, warehouseSKUConditionView.getQuantity());
			}
			if (StringUtil.isNotEmpty(StringUtil.bigDecimalToString(warehouseSKUConditionView.getTotalPrice()))) {
				preparedStatement.setObject(parameterIndex++, warehouseSKUConditionView.getTotalPrice());
			}
			if (StringUtil.isNotEmpty(warehouseSKUConditionView.getRemark())) {
				preparedStatement.setObject(parameterIndex++, "%" + warehouseSKUConditionView.getRemark() + "%");//加入备注模糊查询
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

				WarehouseSKUQueryView warehouseSKU = new WarehouseSKUQueryView();
				warehouseSKU.setWarehouseDtlId(resultSet.getString("warehouse_dtl_id"));
				warehouseSKU.setWarehouseDtlCode(resultSet.getString("warehouse_dtl_code"));
				warehouseSKU.setProductSkuId(resultSet.getString("product_sku_id"));
				warehouseSKU.setWarehouseId(resultSet.getString("warehouse_id"));
				warehouseSKU.setUnitPrice(resultSet.getBigDecimal("unit_price"));
				warehouseSKU.setQuantity(resultSet.getInt("quantity"));
				warehouseSKU.setTotalPrice(resultSet.getBigDecimal("total_price"));
				warehouseSKU.setRemark(resultSet.getString("remark"));
				warehouseSKU.setProductSKUCode(resultSet.getString("sku_code"));
				warehouseSKU.setWarehouseCode(resultSet.getString("warehouse_code"));
				arr.add(warehouseSKU);

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

	public ArrayList<WarehouseSKU> list() {
		ArrayList<WarehouseSKU> arr = new ArrayList<WarehouseSKU>();

		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		try {
			// 获取Connection

			// S3.获取statement(执行语句的对象)
			String sql = "select * from lib_warehouse_detail";
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

				WarehouseSKU warehouseSKU = new WarehouseSKU();
				warehouseSKU.setWarehouseDtlId(resultSet.getString("warehouse_dtl_id"));
				warehouseSKU.setWarehouseDtlCode(resultSet.getString("warehouse_dtl_code"));
				warehouseSKU.setProductSkuId(resultSet.getString("product_sku_id"));
				warehouseSKU.setWarehouseId(resultSet.getString("warehouse_id"));
				warehouseSKU.setUnitPrice(resultSet.getBigDecimal("unit_price"));
				warehouseSKU.setQuantity(resultSet.getInt("quantity"));
				warehouseSKU.setTotalPrice(resultSet.getBigDecimal("total_price"));
				warehouseSKU.setRemark(resultSet.getString("remark"));

				arr.add(warehouseSKU);

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

	public void delete(String warehouseDtlId) {
		PreparedStatement preparedStatement = null;
		// ResultSet resultSet = null;

		try {

			// S3.获取statement(执行语句的对象)
			String sql = "delete from lib_warehouse_detail where warehouse_dtl_id = ?";
			preparedStatement = super.prepareStatement(sql);

			int paramIndex = 1;
			preparedStatement.setObject(paramIndex++, warehouseDtlId);

			// s4-1.执行sql
			int rowCount = preparedStatement.executeUpdate();
			System.out.println("影响行数:" + rowCount);
			if (rowCount == 0) {
				throw new RuntimeException("学生不存在:" + warehouseDtlId);
			}

			System.out.println("操作成功");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("操作失败");
			throw new RuntimeException("删除学生失败", e);
		}
	}


	public void insert(WarehouseSKU warehouseSKU) {
		PreparedStatement preparedStatement = null;

		try {

			// S3.获取statement(执行语句的对象)
			String sql = "insert into lib_warehouse_detail(warehouse_dtl_id,warehouse_dtl_code,product_sku_id,warehouse_id,unit_price,quantity,total_price,remark) values(?,?,?,?,?,?,?,?)";
			preparedStatement = super.prepareStatement(sql);

			int paramIndex = 1;
			System.out.println("insert"+warehouseSKU.toString());
			String uuid = UUID.randomUUID().toString().replaceAll("-", "");
			warehouseSKU.setWarehouseDtlId(uuid);
			preparedStatement.setObject(paramIndex++, warehouseSKU.getWarehouseDtlId());
			preparedStatement.setObject(paramIndex++, warehouseSKU.getWarehouseDtlCode());
			preparedStatement.setObject(paramIndex++, warehouseSKU.getProductSkuId());
			preparedStatement.setObject(paramIndex++, warehouseSKU.getWarehouseId());
			preparedStatement.setObject(paramIndex++, warehouseSKU.getUnitPrice());
			preparedStatement.setObject(paramIndex++, warehouseSKU.getQuantity());
			preparedStatement.setObject(paramIndex++, warehouseSKU.getTotalPrice());
			preparedStatement.setObject(paramIndex++, warehouseSKU.getRemark());

			System.out.println("***SQL:" + sql);
			System.out.println("***param:" + warehouseSKU.toString());

			// s4-1.执行sql
			int rowCount = preparedStatement.executeUpdate();

			System.out.println("***影响行数:" + rowCount);

			System.out.println("新增保存成功");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("新增保存失败");
		}
	}

	public void update(WarehouseSKU warehouseSKU) {
		PreparedStatement preparedStatement = null;

		try {

			String sql = "update lib_warehouse_detail set warehouse_dtl_code =?, product_sku_id=? ,warehouse_id=? ,unit_price=?,quantity=?,total_price=?,remark=? where warehouse_dtl_id = ?";
			preparedStatement = super.prepareStatement(sql);

			int paramIndex = 1;

			preparedStatement.setObject(paramIndex++, warehouseSKU.getWarehouseDtlCode());
			preparedStatement.setObject(paramIndex++, warehouseSKU.getProductSkuId());
			preparedStatement.setObject(paramIndex++, warehouseSKU.getWarehouseId());
			preparedStatement.setObject(paramIndex++, warehouseSKU.getUnitPrice());
			preparedStatement.setObject(paramIndex++, warehouseSKU.getQuantity());
			preparedStatement.setObject(paramIndex++, warehouseSKU.getTotalPrice());
			preparedStatement.setObject(paramIndex++, warehouseSKU.getRemark());
			preparedStatement.setObject(paramIndex++, warehouseSKU.getWarehouseDtlId());

			// s4-1.执行sql
			int rowCount = preparedStatement.executeUpdate();

			System.out.println("影响行数:" + rowCount);

			System.out.println("操作成功");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("操作失败");
		}
	}

	public WarehouseSKU load(String warehouseDtlId) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		try {

			// 获取Connection

			// S3.获取statement(执行语句的对象)
			String sql = "select * from lib_warehouse_detail where warehouse_dtl_id = ?";
			preparedStatement = super.prepareStatement(sql);
			preparedStatement.setObject(1, warehouseDtlId);

			// s4-1.执行sql
			resultSet = preparedStatement.executeQuery();

			// s4-1.遍历resultSet

			/*
			 * student_id student_name start_date max_count remark
			 * 
			 */
			WarehouseSKU warehouseSKU = new WarehouseSKU();

			if (resultSet.next()) {

				warehouseSKU.setWarehouseDtlId(resultSet.getString("warehouse_dtl_id"));
				warehouseSKU.setWarehouseDtlCode(resultSet.getString("warehouse_dtl_code"));
				warehouseSKU.setProductSkuId(resultSet.getString("product_sku_id"));
				warehouseSKU.setWarehouseId(resultSet.getString("warehouse_id"));
				warehouseSKU.setUnitPrice(resultSet.getBigDecimal("unit_price"));
				warehouseSKU.setQuantity(resultSet.getInt("quantity"));
				warehouseSKU.setTotalPrice(resultSet.getBigDecimal("total_price"));
				warehouseSKU.setRemark(resultSet.getString("remark"));

			} else {
				System.out.println("ID不存在");
				throw new RuntimeException("查询失败");
			}

			System.out.println("操作成功");
			return warehouseSKU;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("操作失败");
			throw new RuntimeException("查询失败", e);
		}
	}

}
