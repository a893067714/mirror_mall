package com.iwonder.tea.framework.service;

import java.lang.reflect.Proxy;

public class ProxyServiceFactory {
	public static Object getProxyService(Class clazz) {
		Object object;
		try {
			object = clazz.newInstance();
			TransactionInvocationHandler transactionInvocationHandler = new TransactionInvocationHandler(object);

			Object proxyService = Proxy.newProxyInstance(object.getClass().getClassLoader(),
					object.getClass().getInterfaces(), transactionInvocationHandler);
			return proxyService;

		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e.getMessage(), e);
		}

	}
}
