package com.iwonder.tea.framework.action;

import java.io.IOException;
import java.lang.reflect.Method;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iwonder.tea.framework.util.StringUtil;



public class BaseServlet extends HttpServlet{
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 设置请求与响应的编码
		String methodName = request.getParameter("method");

		if (StringUtil.isEmpty(methodName)) {
			methodName = "list";
		}

		// 反射,根据方法的字符串名称来动态调用.Method
		Class clazz = this.getClass();
		try {
			Method method = clazz.getDeclaredMethod(methodName, HttpServletRequest.class, HttpServletResponse.class);
			method.setAccessible(true);
			method.invoke(this, request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	//少一个 自己在继承类中改
}
