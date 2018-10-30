package com.iwonder.tea.framework.service;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.sql.SQLException;

import com.iwonder.tea.framework.db.DbConnectionFactory;



public class TransactionInvocationHandler implements InvocationHandler {
	
	private Object target ;
	
	public TransactionInvocationHandler(Object target) {
		this.target = target ;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		try {
			System.out.println("========================================================================================");
			DbConnectionFactory.getInstance().getConnection() ;
			DbConnectionFactory.getInstance().setAutoCommit(false);

			Object result = method.invoke(this.target, args) ;
			
			DbConnectionFactory.getInstance().commit();
			
			return result ;
		} catch (Exception ex) {
			ex.printStackTrace();
			try {
				DbConnectionFactory.getInstance().rollback();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			throw new RuntimeException(ex.getMessage(), ex) ;
		}finally{
			DbConnectionFactory.getInstance().closeAll();
			System.out.println("========================================================================================");
		}
	}

}
