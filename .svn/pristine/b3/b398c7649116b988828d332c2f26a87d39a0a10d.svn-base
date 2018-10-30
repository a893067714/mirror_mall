package com.iwonder.tea.framework.db;

public class DbConnectionFactory {
	private static ThreadLocal<DbConnection> singleton = new ThreadLocal<DbConnection>() ;
	
	public static DbConnection getInstance(){
		if(singleton.get() == null){
			DbConnection dbConnection = new DbConnection() ;
			singleton.set(dbConnection);
		}
		
		return singleton.get() ;
	}
	
	public static void removeInstance(){
		singleton.remove();
	}
}
