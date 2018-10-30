package com.iwonder.tea.dictionary.action;

import java.io.IOException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iwonder.tea.dictionary.entity.Dictionary;
import com.iwonder.tea.dictionary.service.IDictionaryService;
import com.iwonder.tea.dictionary.service.imp.DictionaryServiceImp;
import com.iwonder.tea.dictionary.view.DictionaryConditionView;
import com.iwonder.tea.framework.action.BaseServlet;
import com.iwonder.tea.framework.service.ProxyServiceFactory;
import com.iwonder.tea.framework.util.StringUtil;




/**
 * Servlet implementation class StudentServlet
 */
@WebServlet("/admin/dictionary/DictionaryServlet.do")
public class DictionaryServlet  extends BaseServlet {
	
	private IDictionaryService dictionaryService = (IDictionaryService)ProxyServiceFactory.getProxyService(DictionaryServiceImp.class) ; ;
	
	
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DictionaryServlet() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		super.doGet(request, response);
	}
	

	@SuppressWarnings("unused")
	protected void list(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 根据业务逻辑，查询数据
		String dataDictionaryCode= request.getParameter("dataDictionaryCode");
		String dataDictionaryLabel= request.getParameter("dataDictionaryLabel");
		DictionaryConditionView dictionaryConditionView = new DictionaryConditionView();
		dictionaryConditionView.setDataDictionaryCode(dataDictionaryCode);
		dictionaryConditionView.setDataDictionaryLabel(dataDictionaryLabel);
	
		
		ArrayList<Dictionary> arr=dictionaryService.list(dictionaryConditionView);
		// 传递对象数据
		request.setAttribute("arr1", arr);
		System.out.println(arr.toString());
		System.out.println("执行这里");
		// 页面的跳转：转发
		request.getRequestDispatcher("/WEB-INF/jsp/admin/dictionary/dictionary_list.jsp").forward(request, response);
		
	}

	@SuppressWarnings("unused")
	protected void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// s1.取参数
		String dataDictionaryId= request.getParameter("dataDictionaryId");	
		dictionaryService.delete(dataDictionaryId);
		// s3.页面跳转：重定向
		response.sendRedirect("DictionaryServlet.do?method=list");

	}

	@SuppressWarnings("unused")
	protected void edit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// S1.获取参数
		
		String dataDictionaryId = request.getParameter("dataDictionaryId");
		Dictionary dictionary = new Dictionary() ;
		
		// 根据studentId是否为空判断是新增还是修改的编辑
		

		if (StringUtil.isEmpty(dataDictionaryId)) {// 新增

		} else {// 修改
			// S2.业务逻辑操作
			System.out.println(dataDictionaryId);
			System.out.println("有到这里");
			
			dictionary=dictionaryService.load(dataDictionaryId) ;

			request.setAttribute("dictionary", dictionary);

		}

		// S3.跳转
		request.getRequestDispatcher("/WEB-INF/jsp/admin/dictionary/dictionary_edit.jsp").forward(request, response);

		
		
	}

	@SuppressWarnings("unused")
	protected void save(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// S1.接收请求参数
		String dataDictionaryId= request.getParameter("dataDictionaryId");
		String dataDictionaryCode= request.getParameter("dataDictionaryCode");
		String dataDictionaryLabel= request.getParameter("dataDictionaryLabel");
	
		Dictionary dictionary = new Dictionary();
		dictionary.setDataDictionaryId(dataDictionaryId);
		dictionary.setDataDictionaryCode(dataDictionaryCode);
		dictionary.setDataDictionaryLabel(dataDictionaryLabel);
		System.out.println(dataDictionaryId);
		System.out.println(dataDictionaryCode);
		System.out.println(dataDictionaryLabel);
	

		
		
		// 根据studentId是否为空判断是新增还是修改的编辑
		if (StringUtil.isEmpty(dataDictionaryId)) {// 新增
			System.out.println("新增保存:" + dataDictionaryId);
			dictionaryService.insert(dictionary);
			System.out.println("id为空啊");
		
		} else {// 修改
			// S2.业务处理：调数据库,略
			dictionaryService.update(dictionary);
		
		}

		// S3.页面跳转：重定向
		response.sendRedirect("DictionaryServlet.do?method=list");
		
		
		
		
		

	}

	



}
