package com.iwonder.tea.framework.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public interface IBaseDao {
	public PreparedStatement prepareStatement(String sql) throws SQLException ;
	

}
