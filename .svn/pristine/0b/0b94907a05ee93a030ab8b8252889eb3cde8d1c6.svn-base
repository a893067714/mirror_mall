package com.iwonder.tea.framework.db;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedHashSet;
import java.util.Properties;
import java.util.Set;

public class DbConnection {
	private Connection connection ;
	
	private Set<PreparedStatement> setPreparedStatement = new LinkedHashSet<PreparedStatement>() ;
	private Set<ResultSet> setResultSet = new LinkedHashSet<ResultSet>() ;
	
	public Connection getConnection() {
		if(connection != null){
			System.out.println("*************获取已有连接:" + connection + ",threadID:" + Thread.currentThread().getName());
			return this.connection ;
		}
		
		InputStream inStream  = null ;
		try {
			
			Properties properties = new Properties() ;
			
			inStream  = Thread.currentThread().getContextClassLoader().getResourceAsStream("jdbc.properties");
			
			properties.load(inStream );
			
			String dbUrl = properties.getProperty("url");
			String dbUser = properties.getProperty("user");
			String dbPassword = properties.getProperty("password");
			Class.forName( properties.getProperty("driver"));

			this.connection = DriverManager.getConnection(dbUrl, dbUser, dbPassword); 
			System.out.println("*************建立新连接:" + connection);
			return this.connection;
		} catch (Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException("数据库连接失败" ,ex) ;
		}finally{
			try {
				inStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
	
	public void setAutoCommit(boolean autoCommit) throws SQLException{
		System.out.println("*************启动事务:" + connection);
		this.connection.setAutoCommit(autoCommit);
	}
	
	public void commit() throws SQLException{
		System.out.println("*************提交事务:" + connection+ ",threadID:" + Thread.currentThread().getName());
		this.connection.commit();
	}
	
	public void rollback() throws SQLException{
		System.out.println("*************回滚事务:" + connection+ ",threadID:" + Thread.currentThread().getName());
		this.connection.rollback();
	}
	
	public PreparedStatement prepareStatement(String sql) throws SQLException{
		PreparedStatement preparedStatement =  this.connection.prepareStatement(sql) ;
		this.setPreparedStatement.add(preparedStatement) ;
		return preparedStatement ;
	}
	
	public void close(){
		try {

			if (this.connection != null) {
				System.out.println("*************关闭Connection：" + connection+ ",threadID:" + Thread.currentThread().getName());
				this.connection.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DbConnectionFactory.removeInstance();
			this.connection = null ;
		}
	}
	
	public void closeAll(){
		for(ResultSet resultSet :this.setResultSet){
			closeResultSet(resultSet) ;
		}
		setResultSet.clear();
		
		
		for(PreparedStatement preparedStatement :this.setPreparedStatement){
			closePreparedStatement(preparedStatement) ;
		}
		setPreparedStatement.clear();
		
		this.close();
	}
	
	public void closePreparedStatement(PreparedStatement preparedStatement){
		try {

			if (preparedStatement != null) {
				System.out.println("*************关闭preparedStatement：" + preparedStatement);
				preparedStatement.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void closeResultSet(ResultSet resultSet){
		try {
			if (resultSet != null) {
				System.out.println("*************关闭resultSet：" + resultSet);
				resultSet.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}


	public Set<PreparedStatement> getSetPreparedStatement() {
		return setPreparedStatement;
	}


	public void setSetPreparedStatement(Set<PreparedStatement> setPreparedStatement) {
		this.setPreparedStatement = setPreparedStatement;
	}


	public Set<ResultSet> getSetResultSet() {
		return setResultSet;
	}


	public void setSetResultSet(Set<ResultSet> setResultSet) {
		this.setResultSet = setResultSet;
	}
}
