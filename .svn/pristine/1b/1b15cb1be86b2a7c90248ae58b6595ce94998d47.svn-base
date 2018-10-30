package com.iwonder.tea.framework.dao.imp;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.iwonder.tea.framework.dao.IBaseDao;
import com.iwonder.tea.framework.db.DbConnectionFactory;


public class BaseDaoImp implements IBaseDao{
	public PreparedStatement prepareStatement(String sql) throws SQLException{
		return DbConnectionFactory.getInstance().prepareStatement(sql) ;
	}
	
	public void addResultSet(ResultSet resultSet) throws SQLException{
		DbConnectionFactory.getInstance().getSetResultSet().add(resultSet);
	}
}
