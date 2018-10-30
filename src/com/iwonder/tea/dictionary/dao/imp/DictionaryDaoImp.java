package com.iwonder.tea.dictionary.dao.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.UUID;

import com.iwonder.tea.dictionary.dao.IDictionaryDao;
import com.iwonder.tea.dictionary.entity.Dictionary;
import com.iwonder.tea.dictionary.view.DictionaryConditionView;
import com.iwonder.tea.framework.dao.imp.BaseDaoImp;
import com.iwonder.tea.framework.util.StringUtil;



public class DictionaryDaoImp extends BaseDaoImp implements IDictionaryDao{

	public ArrayList<Dictionary> list(DictionaryConditionView dictionaryConditionView) {
		ArrayList<Dictionary> arr = new ArrayList<Dictionary>();

		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			// 获取Connection
			
			StringBuilder sql = new StringBuilder();
			// S3.获取statement(执行语句的对象)
			
			 sql.append(" select * from bas_data_dictionary where 1=1");
			 if(StringUtil.isNotEmpty(dictionaryConditionView.getDataDictionaryCode())){
					sql.append(" and data_dictionary_code = ? " );
			}
			 if(StringUtil.isNotEmpty(dictionaryConditionView.getDataDictionaryLabel())){
					sql.append(" and data_dictionary_label = ? " );
			}

			preparedStatement = super.prepareStatement(sql.toString());
			int parameterIndex=1;
			 if(StringUtil.isNotEmpty(dictionaryConditionView.getDataDictionaryCode())){
					preparedStatement.setObject(parameterIndex++, dictionaryConditionView.getDataDictionaryCode());
			}
			 if(StringUtil.isNotEmpty(dictionaryConditionView.getDataDictionaryLabel())){
				 preparedStatement.setObject(parameterIndex++, dictionaryConditionView.getDataDictionaryLabel());
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
				Dictionary dictionary = new Dictionary();
	
				dictionary.setDataDictionaryId(resultSet.getString("data_dictionary_id"));
				dictionary.setDataDictionaryCode(resultSet.getString("data_dictionary_code"));
				dictionary.setDataDictionaryLabel(resultSet.getString("data_dictionary_label"));
				
			
				arr.add(dictionary);
				
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
	
	public ArrayList<Dictionary> list() {
		ArrayList<Dictionary> arr = new ArrayList<Dictionary>();

		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			// 获取Connection
			

			// S3.获取statement(执行语句的对象)
			String sql = "select * from bas_data_dictionary";
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
				Dictionary dictionary = new Dictionary();
	
				dictionary.setDataDictionaryId(resultSet.getString("data_dictionary_id"));
				dictionary.setDataDictionaryCode(resultSet.getString("data_dictionary_code"));
				dictionary.setDataDictionaryLabel(resultSet.getString("data_dictionary_label"));
				
			
				arr.add(dictionary);
				
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

	public void delete(String dataDictionaryId) {
		PreparedStatement preparedStatement = null;
		// ResultSet resultSet = null;
		
		try {
			
			// S3.获取statement(执行语句的对象)
			String sql = "delete from bas_data_dictionary where data_dictionary_id = ?";
			preparedStatement = super.prepareStatement(sql);

			int paramIndex = 1;
			preparedStatement.setObject(paramIndex++, dataDictionaryId);
			

			// s4-1.执行sql
			int rowCount = preparedStatement.executeUpdate();
			System.out.println("影响行数:" + rowCount);
			if(rowCount == 0){
				throw new RuntimeException("学生不存在:" + dataDictionaryId);
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

	public void insert(Dictionary dictionary) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		// ResultSet resultSet = null;、
		
		
		try {
			

			// S3.获取statement(执行语句的对象)
			String sql = "insert into bas_data_dictionary(data_dictionary_id,data_dictionary_code,data_dictionary_label) values(?,?,?)";
			preparedStatement = super.prepareStatement(sql);

			int paramIndex = 1;

			String uuid = UUID.randomUUID().toString().replaceAll("-", "");
			dictionary.setDataDictionaryId(uuid);
			// String studentName = "aa2" ;
			preparedStatement.setObject(paramIndex++, dictionary.getDataDictionaryId());
			preparedStatement.setObject(paramIndex++, dictionary.getDataDictionaryCode());
			preparedStatement.setObject(paramIndex++, dictionary.getDataDictionaryLabel());
		

			System.out.println("***SQL:" + sql);
			System.out.println("***param:" + dictionary.toString());

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

	public void update(Dictionary dictionary) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		
		
		try {
			// 获取Connection

			// S3.获取statement(执行语句的对象)
			String sql = "update bas_data_dictionary set data_dictionary_code=? ,data_dictionary_label=?  where data_dictionary_id = ?";
			preparedStatement = super.prepareStatement(sql);

			int paramIndex = 1;
			
			preparedStatement.setObject(paramIndex++, dictionary.getDataDictionaryCode());
			preparedStatement.setObject(paramIndex++, dictionary.getDataDictionaryLabel());
			preparedStatement.setObject(paramIndex++, dictionary.getDataDictionaryId());
		

			// s4-1.执行sql
			int rowCount = preparedStatement.executeUpdate();

			System.out.println("影响行数:" + rowCount);

			System.out.println("操作成功");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("操作失败");
		} 
	}

	public Dictionary load(String dataDictionaryId) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		
		try {
		

			// 获取Connection
			

			// S3.获取statement(执行语句的对象)
			String sql = "select * from bas_data_dictionary where data_dictionary_id = ?";
			preparedStatement = super.prepareStatement(sql);
			preparedStatement.setObject(1, dataDictionaryId);

			// s4-1.执行sql
			resultSet = preparedStatement.executeQuery();

			// s4-1.遍历resultSet

			/*
			 * student_id student_name start_date max_count remark
			 * 
			 */
			Dictionary dictionary = new Dictionary();
			if (resultSet.next()) {
			
				dictionary.setDataDictionaryId(resultSet.getString("data_dictionary_id"));
				dictionary.setDataDictionaryCode(resultSet.getString("data_dictionary_code"));
				dictionary.setDataDictionaryLabel(resultSet.getString("data_dictionary_label"));
			} else {
				System.out.println("ID不存在");
				throw new RuntimeException("查询失败");
			}

			System.out.println("操作成功");
			return dictionary;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("操作失败");
			throw new RuntimeException("查询失败", e);
		} 
	}

	
}
