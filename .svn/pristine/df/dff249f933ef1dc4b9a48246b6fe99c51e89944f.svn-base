package com.iwonder.tea.usr.dao.imp;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.UUID;

import com.iwonder.tea.framework.dao.imp.BaseDaoImp;
import com.iwonder.tea.framework.util.StringUtil;
import com.iwonder.tea.usr.dao.IEvaluateDao;
import com.iwonder.tea.usr.entity.Evaluate;
import com.iwonder.tea.usr.view.EvaluatConditionView;
import com.iwonder.tea.usr.view.EvaluatQueryView;
import com.iwonder.tea.usr.view.EvaluateQueryAllView;

public class EvaluateDaoImp extends BaseDaoImp implements IEvaluateDao {

	public ArrayList<EvaluateQueryAllView> listAllView(EvaluatConditionView evaluatConditionView) {
		ArrayList<EvaluateQueryAllView> listEvaluateView = new ArrayList<EvaluateQueryAllView>();

		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		try {
			// S1.加载Driver
			System.out.println("连接成功");

			// S3.获取statement(执行语句的对象)
			StringBuilder sql = new StringBuilder();

			sql.append(
					" select a.*,c.product_sku_id,d.size_value,e.dictionary_detail_label as label1,f.dictionary_detail_label as label2 ");

			// if(evaluatConditionView.getEvaluateNumStatus() != null)
			// sql.append(",COUNT(a.evaluate_id) as count");

			sql.append(" FROM usr_evaluate a");
			sql.append(" join ord_order_detail b");
			sql.append(" on a.order_dtl_id = b.order_dtl_id");
			sql.append(" join prd_sku c");
			sql.append(" on c.product_sku_id = b.product_sku_id");
			sql.append(" join bas_size d");
			sql.append(" on d.size_id = c.size_id");
			sql.append(" join bas_data_dictionary_detail e");
			sql.append(" on e.dictionary_detail_code = a.service_status");
			sql.append(" join bas_data_dictionary_detail f");
			sql.append(" on f.dictionary_detail_code = a.description_status");

			if (StringUtil.isNotEmpty(evaluatConditionView.getProductId())) {
				if (!evaluatConditionView.getProductId().equals("0"))
					sql.append(" and a.product_id = ?");
			}
			preparedStatement = super.prepareStatement(sql.toString());
			int parameterIndex = 1;
			if (StringUtil.isNotEmpty(evaluatConditionView.getProductId()))
				if (!evaluatConditionView.getProductId().equals("0"))
					preparedStatement.setObject(parameterIndex++, evaluatConditionView.getProductId());

			System.out.println("***SQL:" + sql);
			System.out.println("***param:" + "");
			// s4-1.执行sql
			resultSet = preparedStatement.executeQuery();
			super.addResultSet(resultSet);// 待封装

			// s4-1.遍历resultSet
			System.out.println("***SQL查询结果 begin");
			while (resultSet.next()) {
				EvaluateQueryAllView evaluate = new EvaluateQueryAllView();
				evaluate.setEvaluateId(resultSet.getString("evaluate_id"));
				evaluate.setProductId(resultSet.getString("product_id"));
				evaluate.setUserId(resultSet.getString("user_id"));
				evaluate.setSizeValue(resultSet.getString("size_value"));
				evaluate.setServiceStatusName(resultSet.getString("label1"));
				evaluate.setDescriptionStatusName(resultSet.getString("label2"));
				evaluate.setServiceStatus(resultSet.getString("label1"));
				evaluate.setDescriptionStatus(resultSet.getString("label2"));
				evaluate.setEvalContent(resultSet.getString("eval_content"));
				evaluate.setImgUrl(resultSet.getString("img_url"));
				evaluate.setVideoUrl(resultSet.getString("video_url"));
				evaluate.setEvaluateTime(resultSet.getDate("evaluate_time"));

				if (evaluatConditionView.getEvaluateNumStatus() != null)
					evaluate.setEvaluateNumStatus(resultSet.getString("count"));

				listEvaluateView.add(evaluate);
				System.out.println(evaluate.toString());
				System.out.println(resultSet.getString("label2"));
				System.out.println(evaluate.getDescriptionStatus());
			}
			System.out.println("***SQL查询结果 end");
			System.out.println("操作成功");

			return listEvaluateView;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("操作失败");
			throw new RuntimeException("查询失败");
		}
	}

	public ArrayList<EvaluatQueryView> list(EvaluatConditionView evaluatConditionView) {
		ArrayList<EvaluatQueryView> listEvaluate = new ArrayList<EvaluatQueryView>();

		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		try {
			// S1.加载Driver
			System.out.println("连接成功");

			// S3.获取statement(执行语句的对象)
			StringBuilder sql = new StringBuilder();

			/*
			 * sql.append(
			 * " select usr_evaluate.* , usr_user_info.name as user_name,prd_product.name as product_name,ord_order_detail.order_dtl_code from usr_evaluate "
			 * ); sql.append(" JOIN usr_user_info");
			 * sql.append(" on usr_user_info.user_id = usr_evaluate.user_id");
			 * sql.append(" JOIN prd_product");
			 * sql.append(" on prd_product.product_id = usr_evaluate.product_id"
			 * ); sql.append(" JOIN ord_order_detail"); sql.
			 * append(" on ord_order_detail.order_dtl_id = usr_evaluate.order_dtl_id"
			 * );
			 */

			sql.append(
					" select b.*,a.dictionary_detail_label as label1,c.dictionary_detail_label as label2, d.name as user_name,e.name as product_name,f.order_dtl_code ");
			sql.append(" from usr_evaluate b");
			sql.append(" JOIN usr_user_info d");
			sql.append(" on d.user_id = b.user_id");
			sql.append(" JOIN prd_product e");
			sql.append(" on e.product_id = b.product_id");
			sql.append(" JOIN ord_order_detail f");
			sql.append(" on f.order_dtl_id = b.order_dtl_id");
			sql.append(" join bas_data_dictionary_detail a");
			sql.append(" on b.service_status = a.dictionary_detail_code ");
			sql.append(" join bas_data_dictionary_detail c");
			sql.append(" on b.description_status = c.dictionary_detail_code");
			sql.append(
					" where a.data_dictionary_code='service_status' and c.data_dictionary_code='description_status'");

			if (StringUtil.isNotEmpty(evaluatConditionView.getUserId())) {
				if (!evaluatConditionView.getUserId().equals("0"))
					sql.append(" and d.user_id = ?");
			}
			if (StringUtil.isNotEmpty(evaluatConditionView.getProductId())) {
				if (!evaluatConditionView.getProductId().equals("0"))
					sql.append(" and e.product_id = ?");
			}
			if (StringUtil.isNotEmpty(evaluatConditionView.getOrderDtlId())) {
				if (!evaluatConditionView.getOrderDtlId().equals("0"))
					sql.append(" and b.order_dtl_id = ?");
			}
			// if (StringUtil.isNotEmpty(evaluatConditionView.getLogStatus())) {
			// sql.append(" and log_status = ?");
			// }
			if (StringUtil.isNotEmpty(evaluatConditionView.getServiceStatus())) {
				if (!evaluatConditionView.getServiceStatus().equals("0"))
					sql.append(" and service_status = ?");
			}
			if (StringUtil.isNotEmpty(evaluatConditionView.getDescriptionStatus())) {
				if (!evaluatConditionView.getDescriptionStatus().equals("0"))
					sql.append(" and description_status = ?");
			}
			if (evaluatConditionView.getTimePrevious() != null && evaluatConditionView.getTimeLater() != null) {
				sql.append(" and evaluate_time > ?");
				sql.append(" and evaluate_time < ?");
			}

			preparedStatement = super.prepareStatement(sql.toString());
			int parameterIndex = 1;

			if (StringUtil.isNotEmpty(evaluatConditionView.getUserId()))
				if (!evaluatConditionView.getUserId().equals("0"))
					preparedStatement.setObject(parameterIndex++, evaluatConditionView.getUserId());

			if (StringUtil.isNotEmpty(evaluatConditionView.getProductId()))
				if (!evaluatConditionView.getProductId().equals("0"))
					preparedStatement.setObject(parameterIndex++, evaluatConditionView.getProductId());

			if (StringUtil.isNotEmpty(evaluatConditionView.getOrderDtlId()))
				if (!evaluatConditionView.getOrderDtlId().equals("0"))
					preparedStatement.setObject(parameterIndex++, evaluatConditionView.getOrderDtlId());

			// if (StringUtil.isNotEmpty(evaluatConditionView.getLogStatus()))
			// preparedStatement.setObject(parameterIndex++,
			// evaluatConditionView.getLogStatus());

			if (StringUtil.isNotEmpty(evaluatConditionView.getServiceStatus()))
				if (!evaluatConditionView.getServiceStatus().equals("0"))
					preparedStatement.setObject(parameterIndex++, evaluatConditionView.getServiceStatus());

			if (StringUtil.isNotEmpty(evaluatConditionView.getDescriptionStatus()))
				if (!evaluatConditionView.getDescriptionStatus().equals("0"))
					preparedStatement.setObject(parameterIndex++, evaluatConditionView.getDescriptionStatus());
			if (evaluatConditionView.getTimePrevious() != null && evaluatConditionView.getTimeLater() != null) {
				preparedStatement.setObject(parameterIndex++, evaluatConditionView.getTimePrevious());
				preparedStatement.setObject(parameterIndex++, evaluatConditionView.getTimeLater());
			}

			System.out.println("***SQL:" + sql);
			System.out.println("***param:" + "");
			// s4-1.执行sql
			resultSet = preparedStatement.executeQuery();
			super.addResultSet(resultSet);// 待封装

			// s4-1.遍历resultSet
			System.out.println("***SQL查询结果 begin");
			while (resultSet.next()) {
				EvaluatQueryView evaluate = new EvaluatQueryView();
				evaluate.setEvaluateId(resultSet.getString("evaluate_id"));
				evaluate.setProductId(resultSet.getString("product_id"));
				evaluate.setUserId(resultSet.getString("user_id"));
				evaluate.setUserName(resultSet.getString("user_name"));
				evaluate.setProductName(resultSet.getString("product_Name"));
				evaluate.setOrderDtlCode(resultSet.getString("order_dtl_code"));
				evaluate.setServiceStatusName(resultSet.getString("label1"));
				evaluate.setDescriptionStatusName(resultSet.getString("label2"));
				evaluate.setServiceStatus(resultSet.getString("label1"));
				evaluate.setDescriptionStatus(resultSet.getString("label2"));
				evaluate.setEvalContent(resultSet.getString("eval_content"));
				evaluate.setImgUrl(resultSet.getString("img_url"));
				evaluate.setVideoUrl(resultSet.getString("video_url"));
				evaluate.setEvaluateTime(resultSet.getDate("evaluate_time"));

				listEvaluate.add(evaluate);
				System.out.println(evaluate.toString());
				System.out.println(resultSet.getString("label2"));
				System.out.println(evaluate.getDescriptionStatus());
			}
			System.out.println("***SQL查询结果 end");
			System.out.println("操作成功");

			return listEvaluate;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("操作失败");
			throw new RuntimeException("查询失败");
		}
	}

	public ArrayList<Evaluate> list() {
		ArrayList<Evaluate> listEvaluate = new ArrayList<Evaluate>();

		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		try {
			// S1.加载Driver
			System.out.println("连接成功");

			// S3.获取statement(执行语句的对象)
			String sql = "select * from usr_evaluate";
			preparedStatement = super.prepareStatement(sql);

			System.out.println("***SQL:" + sql);
			System.out.println("***param:" + "");
			// s4-1.执行sql
			resultSet = preparedStatement.executeQuery();
			super.addResultSet(resultSet);// 待封装

			// s4-1.遍历resultSet
			System.out.println("***SQL查询结果 begin");
			while (resultSet.next()) {
				Evaluate evaluate = new Evaluate();
				evaluate.setEvaluateId(resultSet.getString("evaluate_id"));
				evaluate.setUserId(resultSet.getString("user_id"));
				evaluate.setProductId(resultSet.getString("product_id"));
				evaluate.setOrderDtlId(resultSet.getString("order_dtl_id"));
				evaluate.setServiceStatus(resultSet.getString("service_status"));
				evaluate.setDescriptionStatus(resultSet.getString("description_status"));
				evaluate.setEvalContent(resultSet.getString("eval_content"));
				evaluate.setImgUrl(resultSet.getString("img_url"));
				evaluate.setVideoUrl(resultSet.getString("video_url"));
				evaluate.setEvaluateTime(resultSet.getDate("evaluate_time"));

				listEvaluate.add(evaluate);

				System.out.println(evaluate.toString());
			}
			System.out.println("***SQL查询结果 end");
			System.out.println("操作成功");

			return listEvaluate;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("操作失败");
			throw new RuntimeException("查询失败");
		}
	}

	public void delete(String evaluateId) {
		System.out.println("删除ID:" + evaluateId);

		PreparedStatement preparedStatement = null;

		try {

			System.out.println("连接成功");

			// S3.获取statement(执行语句的对象)
			String sql = "delete from usr_evaluate where evaluate_id = ?";
			preparedStatement = super.prepareStatement(sql);

			int paramIndex = 1;
			preparedStatement.setObject(paramIndex++, evaluateId);

			System.out.println("***SQL:" + sql);
			System.out.println("***param:" + "");

			// s4-1.执行sql
			int rowCount = preparedStatement.executeUpdate();

			System.out.println("***SQL查询结果 begin");
			System.out.println("影响行数:" + rowCount);
			System.out.println("***SQL查询结果 end");
			System.out.println("操作成功");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("操作失败");
			throw new RuntimeException("删除学生失败", e);
		}
	}

	public Evaluate load(String evaluateId) {
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		Evaluate evaluate = new Evaluate();

		try {
			// S1.加载Driver
			System.out.println("连接成功");

			// S3.获取statement(执行语句的对象)
			String sql = "select * from usr_evaluate where evaluate_id = ?";
			preparedStatement = super.prepareStatement(sql);
			preparedStatement.setObject(1, evaluateId);

			// s4-1.执行sql
			resultSet = preparedStatement.executeQuery();
			super.addResultSet(resultSet);// 待封装

			System.out.println("***SQL:" + sql);
			System.out.println("***param:" + "");

			// s4-1.遍历resultSet

			System.out.println("***SQL查询结果 begin");
			if (resultSet.next()) {
				evaluate.setEvaluateId(resultSet.getString("evaluate_id"));
				evaluate.setUserId(resultSet.getString("user_id"));
				evaluate.setProductId(resultSet.getString("product_id"));
				evaluate.setOrderDtlId(resultSet.getString("order_dtl_id"));
				// evaluate.setLogStatus(resultSet.getString("log_status"));
				evaluate.setServiceStatus(resultSet.getString("service_status"));
				evaluate.setDescriptionStatus(resultSet.getString("description_status"));
				evaluate.setEvalContent(resultSet.getString("eval_content"));
				evaluate.setImgUrl(resultSet.getString("img_url"));
				evaluate.setVideoUrl(resultSet.getString("video_url"));
				evaluate.setEvaluateTime(resultSet.getDate("evaluate_time"));
				System.out.println(evaluate.toString());
			} else {
				System.out.println("ID不存在");
				throw new RuntimeException("查询id失败");
			}
			System.out.println("***SQL查询结果 end");
			System.out.println("操作成功");
			return evaluate;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("操作失败");
			throw new RuntimeException("查询id失败");
		}
	}

	public void insert(Evaluate evaluate) {
		System.out.println("新增保存:" + evaluate.getUserId());

		PreparedStatement preparedStatement = null;

		try {
			// S1.加载Driver
			System.out.println("连接成功");

			// S3.获取statement(执行语句的对象)
			String sql = "insert into usr_evaluate(evaluate_id,user_id,product_id,order_dtl_id,service_status,description_status,eval_content,img_url,video_url,evaluate_time) values(?,?,?,?,?,?,?,?,?,?)";
			preparedStatement = super.prepareStatement(sql);

			int paramIndex = 1;

			String uuid = UUID.randomUUID().toString().replaceAll("-", "");
			preparedStatement.setObject(paramIndex++, uuid);
			preparedStatement.setObject(paramIndex++, evaluate.getUserId());
			preparedStatement.setObject(paramIndex++, evaluate.getProductId());
			preparedStatement.setObject(paramIndex++, evaluate.getOrderDtlId());
			// preparedStatement.setObject(paramIndex++,
			// evaluate.getLogStatus());
			preparedStatement.setObject(paramIndex++, evaluate.getServiceStatus());
			preparedStatement.setObject(paramIndex++, evaluate.getDescriptionStatus());
			preparedStatement.setObject(paramIndex++, evaluate.getEvalContent());
			preparedStatement.setObject(paramIndex++, evaluate.getImgUrl());
			preparedStatement.setObject(paramIndex++, evaluate.getVideoUrl());
			preparedStatement.setObject(paramIndex++, evaluate.getEvaluateTime());

			System.out.println("***SQL:" + sql);
			System.out.println("***param:uuid:" + uuid + ",userId:" + evaluate.getUserId());

			// s4-1.执行sql
			int rowCount = preparedStatement.executeUpdate();

			System.out.println("***SQL查询结果 begin");
			System.out.println("***影响行数:" + rowCount);
			System.out.println("***SQL查询结果 end");

			System.out.println("操作成功");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("操作失败");
		}
	}

	public void update(Evaluate evaluate) {
		PreparedStatement preparedStatement = null;

		try {
			// S1.加载Driver
			System.out.println("连接成功");

			// S3.获取statement(执行语句的对象)
			String sql = "update usr_evaluate set user_id = ? ,product_id = ?,order_dtl_id = ?,service_status = ?,description_status = ?,eval_content = ?,img_url = ?,video_url = ?,evaluate_time = ? where evaluate_id = ?";
			preparedStatement = super.prepareStatement(sql);

			int paramIndex = 1;
			preparedStatement.setObject(paramIndex++, evaluate.getUserId());
			preparedStatement.setObject(paramIndex++, evaluate.getProductId());
			preparedStatement.setObject(paramIndex++, evaluate.getOrderDtlId());
			// preparedStatement.setObject(paramIndex++,
			// evaluate.getLogStatus());
			preparedStatement.setObject(paramIndex++, evaluate.getServiceStatus());
			preparedStatement.setObject(paramIndex++, evaluate.getDescriptionStatus());
			preparedStatement.setObject(paramIndex++, evaluate.getEvalContent());
			preparedStatement.setObject(paramIndex++, evaluate.getImgUrl());
			preparedStatement.setObject(paramIndex++, evaluate.getVideoUrl());
			preparedStatement.setObject(paramIndex++, evaluate.getEvaluateTime());
			preparedStatement.setObject(paramIndex++, evaluate.getEvaluateId());

			System.out.println("***SQL:" + sql);
			System.out.println("***param:" + "userId:" + evaluate.getUserId());

			// s4-1.执行sql
			int rowCount = preparedStatement.executeUpdate();
			System.out.println("***SQL查询结果 begin");

			System.out.println("影响行数:" + rowCount);
			System.out.println("***SQL查询结果 end");
			System.out.println("操作成功");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("操作失败");
		}

		System.out.println(evaluate.toString());
	}

}