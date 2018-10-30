package com.iwonder.tea.dictionary.dao.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.UUID;

import com.iwonder.tea.dictionary.dao.IDictionarySKUDao;
import com.iwonder.tea.dictionary.entity.DictionarySKU;
import com.iwonder.tea.dictionary.view.DictionarySKUConditionView;
import com.iwonder.tea.framework.dao.imp.BaseDaoImp;
import com.iwonder.tea.framework.util.StringUtil;

public class DictionarySKUDaoImp extends BaseDaoImp implements IDictionarySKUDao {

	public ArrayList<DictionarySKU> list(DictionarySKUConditionView dictionarySKUConditionView) {
		ArrayList<DictionarySKU> arr = new ArrayList<DictionarySKU>();

		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		try {
			StringBuilder sql = new StringBuilder();
			sql.append("select *  from bas_data_dictionary_detail where 1=1");
			if (StringUtil.isNotEmpty(dictionarySKUConditionView.getDataDictionaryId())) {
				sql.append(" and data_dictionary_id = ? ");
			}
			if (StringUtil.isNotEmpty(dictionarySKUConditionView.getDataDictionaryCode())) {
				sql.append(" and data_dictionary_code = ? ");
			}
			if (StringUtil.isNotEmpty(dictionarySKUConditionView.getDictionaryDetailCode())) {
				sql.append(" and dictionary_detail_code = ? ");
			}
			if (StringUtil.isNotEmpty(dictionarySKUConditionView.getDictionaryDetaiLabel())) {
				sql.append(" and dictionary_detail_label = ? ");
			}
			if (StringUtil.isNotEmpty(dictionarySKUConditionView.getDictionaryDetailNumber())) {
				sql.append(" and dictionary_detail_number = ? ");
			}

			int parameterIndex = 1;
			preparedStatement = super.prepareStatement(sql.toString());
			if (StringUtil.isNotEmpty(dictionarySKUConditionView.getDataDictionaryId())) {
				preparedStatement.setObject(parameterIndex++, dictionarySKUConditionView.getDataDictionaryId());
			}
			if (StringUtil.isNotEmpty(dictionarySKUConditionView.getDataDictionaryCode())) {
				preparedStatement.setObject(parameterIndex++, dictionarySKUConditionView.getDataDictionaryCode());
			}
			if (StringUtil.isNotEmpty(dictionarySKUConditionView.getDictionaryDetailCode())) {
				preparedStatement.setObject(parameterIndex++, dictionarySKUConditionView.getDictionaryDetailCode());
			}
			if (StringUtil.isNotEmpty(dictionarySKUConditionView.getDictionaryDetaiLabel())) {
				preparedStatement.setObject(parameterIndex++, dictionarySKUConditionView.getDictionaryDetaiLabel());
			}
			if (StringUtil.isNotEmpty(dictionarySKUConditionView.getDictionaryDetailNumber())) {
				preparedStatement.setObject(parameterIndex++, dictionarySKUConditionView.getDictionaryDetailNumber());
			}

			System.out.println("***SQL:" + sql);
			System.out.println("***param:" + "");
			resultSet = preparedStatement.executeQuery();
			super.addResultSet(resultSet);

			System.out.println("***SQL查询结果 begin");

			while (resultSet.next()) {
				DictionarySKU dictionarySKU = new DictionarySKU();
				dictionarySKU.setDictionaryDetailId(resultSet.getString("dictionary_detail_id"));
				dictionarySKU.setDataDictionaryId(resultSet.getString("data_dictionary_id"));
				dictionarySKU.setDataDictionaryCode(resultSet.getString("data_dictionary_code"));
				dictionarySKU.setDictionaryDetailCode(resultSet.getString("dictionary_detail_code"));
				dictionarySKU.setDictionaryDetaiLabel(resultSet.getString("dictionary_detail_label"));
				dictionarySKU.setDictionaryDetailNumber(resultSet.getString("dictionary_detail_number"));
				arr.add(dictionarySKU);

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

	@Override
	public ArrayList<DictionarySKU> findByDictCode(String dictCode) {
		ArrayList<DictionarySKU> arr = new ArrayList<DictionarySKU>();

		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		try {
			StringBuilder sql = new StringBuilder();
			sql.append("select *  from bas_data_dictionary_detail");
			if (StringUtil.isNotEmpty(dictCode)) {
				sql.append(" where data_dictionary_code = ? ");
			}

			int parameterIndex = 1;
			preparedStatement = super.prepareStatement(sql.toString());
			if (StringUtil.isNotEmpty(dictCode)) {
				preparedStatement.setObject(parameterIndex++, dictCode);
			}

			System.out.println("***SQL:" + sql);
			resultSet = preparedStatement.executeQuery();
			super.addResultSet(resultSet);

			System.out.println("***SQL查询结果 begin");

			while (resultSet.next()) {
				DictionarySKU dictionarySKU = new DictionarySKU();
				dictionarySKU.setDictionaryDetailId(resultSet.getString("dictionary_detail_id"));
				dictionarySKU.setDataDictionaryId(resultSet.getString("data_dictionary_id"));
				dictionarySKU.setDataDictionaryCode(resultSet.getString("data_dictionary_code"));
				dictionarySKU.setDictionaryDetailCode(resultSet.getString("dictionary_detail_code"));
				dictionarySKU.setDictionaryDetaiLabel(resultSet.getString("dictionary_detail_label"));
				dictionarySKU.setDictionaryDetailNumber(resultSet.getString("dictionary_detail_number"));
				arr.add(dictionarySKU);
				System.out.println(dictionarySKU);
			}
			System.out.println("操作成功");

			return arr;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("操作失败");

			throw new RuntimeException("学生查询失败", e);
		}

	}

	public void delete(String dictionaryDetailId) {
		PreparedStatement preparedStatement = null;

		try {

			String sql = "delete from bas_data_dictionary_detail where dictionary_detail_id = ?";
			preparedStatement = super.prepareStatement(sql);

			int paramIndex = 1;
			preparedStatement.setObject(paramIndex++, dictionaryDetailId);

			int rowCount = preparedStatement.executeUpdate();
			System.out.println("影响行数:" + rowCount);
			if (rowCount == 0) {
				throw new RuntimeException("学生不存在:" + dictionaryDetailId);
			}

			System.out.println("操作成功");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("操作失败");
			throw new RuntimeException("删除学生失败", e);
		}
	}

	public void insert(DictionarySKU dictionarySKU) {
		PreparedStatement preparedStatement = null;

		try {
			String sql = "insert into bas_data_dictionary_detail(dictionary_detail_id,data_dictionary_id,data_dictionary_code,dictionary_detail_code,dictionary_detail_label,dictionary_detail_number) values(?,?,?,?,?,?)";
			preparedStatement = super.prepareStatement(sql);

			int paramIndex = 1;

			String uuid = UUID.randomUUID().toString().replaceAll("-", "");
			dictionarySKU.setDictionaryDetailId(uuid);
			// String studentName = "aa2" ;
			preparedStatement.setObject(paramIndex++, dictionarySKU.getDictionaryDetailId());
			preparedStatement.setObject(paramIndex++, dictionarySKU.getDataDictionaryId());
			preparedStatement.setObject(paramIndex++, dictionarySKU.getDataDictionaryCode());
			preparedStatement.setObject(paramIndex++, dictionarySKU.getDictionaryDetailCode());
			preparedStatement.setObject(paramIndex++, dictionarySKU.getDictionaryDetaiLabel());
			preparedStatement.setObject(paramIndex++, dictionarySKU.getDictionaryDetailNumber());

			System.out.println("***SQL:" + sql);
			System.out.println("***param:" + dictionarySKU.toString());

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

	public void update(DictionarySKU dictionarySKU) {
		PreparedStatement preparedStatement = null;

		try {
			// 获取Connection

			// S3.获取statement(执行语句的对象)
			String sql = "update bas_data_dictionary_detail set data_dictionary_id=? ,data_dictionary_code=? ,dictionary_detail_code=? ,dictionary_detail_label=?,dictionary_detail_number=? where dictionary_detail_id = ?";
			preparedStatement = super.prepareStatement(sql);

			int paramIndex = 1;

			preparedStatement.setObject(paramIndex++, dictionarySKU.getDataDictionaryId());
			preparedStatement.setObject(paramIndex++, dictionarySKU.getDataDictionaryCode());
			preparedStatement.setObject(paramIndex++, dictionarySKU.getDictionaryDetailCode());
			preparedStatement.setObject(paramIndex++, dictionarySKU.getDictionaryDetaiLabel());
			preparedStatement.setObject(paramIndex++, dictionarySKU.getDictionaryDetailNumber());
			preparedStatement.setObject(paramIndex++, dictionarySKU.getDictionaryDetailId());

			// s4-1.执行sql
			int rowCount = preparedStatement.executeUpdate();

			System.out.println("影响行数:" + rowCount);

			System.out.println("操作成功");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("操作失败");
		}
	}

	public DictionarySKU load(String dictionaryDetailId) {
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		try {

			// 获取Connection
			StringBuilder sql = new StringBuilder();
			sql.append("select * from bas_data_dictionary_detail");

			sql.append("  where dictionary_detail_id = ?");

			// S3.获取statement(执行语句的对象)

			preparedStatement = super.prepareStatement(sql.toString());
			preparedStatement.setObject(1, dictionaryDetailId);

			// s4-1.执行sql
			resultSet = preparedStatement.executeQuery();

			// s4-1.遍历resultSet

			/*
			 * student_id student_name start_date max_count remark
			 * 
			 */
			DictionarySKU dictionarySKU = new DictionarySKU();
			if (resultSet.next()) {

				dictionarySKU.setDictionaryDetailId(resultSet.getString("dictionary_detail_id"));
				dictionarySKU.setDataDictionaryId(resultSet.getString("data_dictionary_id"));
				dictionarySKU.setDataDictionaryCode(resultSet.getString("data_dictionary_code"));
				dictionarySKU.setDictionaryDetailCode(resultSet.getString("dictionary_detail_code"));
				dictionarySKU.setDictionaryDetaiLabel(resultSet.getString("dictionary_detail_label"));
				dictionarySKU.setDictionaryDetailNumber(resultSet.getString("dictionary_detail_number"));
			} else {
				System.out.println("ID不存在");
				throw new RuntimeException("查询失败");
			}

			System.out.println("操作成功");
			return dictionarySKU;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("操作失败");
			throw new RuntimeException("查询失败", e);
		}
	}

}
