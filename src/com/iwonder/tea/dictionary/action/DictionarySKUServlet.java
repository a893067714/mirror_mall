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

import com.iwonder.tea.dictionary.dao.imp.DictionarySKUDaoImp;
import com.iwonder.tea.dictionary.entity.DictionarySKU;
import com.iwonder.tea.dictionary.service.IDictionarySKUService;
import com.iwonder.tea.dictionary.service.imp.DictionarySKUServiceImp;
import com.iwonder.tea.dictionary.view.DictionarySKUConditionView;
import com.iwonder.tea.framework.action.BaseServlet;
import com.iwonder.tea.framework.service.ProxyServiceFactory;
import com.iwonder.tea.framework.util.StringUtil;




/**
 * Servlet implementation class StudentServlet
 */
@WebServlet("/admin/dictionary/DictionarySKUServlet.do")
public class DictionarySKUServlet  extends BaseServlet {
	
	private IDictionarySKUService dictionarySKUService = (IDictionarySKUService)ProxyServiceFactory.getProxyService(DictionarySKUServiceImp.class) ; ;
	
	
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DictionarySKUServlet() {
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
		 String dataDictionaryId=request.getParameter("dataDictionaryId");
		 String dataDictionaryCode=request.getParameter("dataDictionaryCode");
		 String dictionaryDetailCode=request.getParameter("dictionaryDetailCode");
		 String dictionaryDetaiLabel=request.getParameter("dictionaryDetaiLabel");
		 String dictionaryDetailNumber=request.getParameter("dictionaryDetailNumber");
		 DictionarySKUConditionView dictionarySKUConditionView = new DictionarySKUConditionView();
		 dictionarySKUConditionView.setDataDictionaryId(dataDictionaryId);
		 dictionarySKUConditionView.setDataDictionaryCode(dataDictionaryCode);
		 dictionarySKUConditionView.setDataDictionaryCode(dataDictionaryCode);
		 dictionarySKUConditionView.setDictionaryDetaiLabel(dictionaryDetaiLabel);
		 dictionarySKUConditionView.setDictionaryDetailNumber(dictionaryDetailNumber);
		 ArrayList<DictionarySKU> arr=dictionarySKUService.list(dictionarySKUConditionView);
		// 传递对象数据
		request.setAttribute("arr1", arr);
		System.out.println(arr.toString());
		System.out.println("执行这里");
		// 页面的跳转：转发
		request.getRequestDispatcher("/WEB-INF/jsp/admin/dictionary/dictionarySKU_list.jsp").forward(request, response);

	}

	@SuppressWarnings("unused")
	protected void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// s1.取参数
		String dictionaryDetailId= request.getParameter("dictionaryDetailId");	
		dictionarySKUService.delete(dictionaryDetailId);
		// s3.页面跳转：重定向
		response.sendRedirect("DictionarySKUServlet.do?method=list");

	}

	@SuppressWarnings("unused")
	protected void edit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// S1.获取参数
		
		String dictionaryDetailId = request.getParameter("dictionaryDetailId");
		DictionarySKU dictionarySKU = new DictionarySKU() ;
		
		// 根据studentId是否为空判断是新增还是修改的编辑
		

		if (StringUtil.isEmpty(dictionaryDetailId)) {// 新增

		} else {// 修改
			// S2.业务逻辑操作
			System.out.println(dictionaryDetailId);
			System.out.println("有到这里");
			
			dictionarySKU=dictionarySKUService.load(dictionaryDetailId) ;

			request.setAttribute("dictionarySKU", dictionarySKU);

		}

		// S3.跳转
		request.getRequestDispatcher("/WEB-INF/jsp/admin/dictionary/dictionarySKU_edit.jsp").forward(request, response);

		
		
	}

	@SuppressWarnings("unused")
	protected void save(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		 String dictionaryDetailId=request.getParameter("dictionaryDetailId");
		 String dataDictionaryId=request.getParameter("dataDictionaryId");
		 String dataDictionaryCode=request.getParameter("dataDictionaryCode");
		 String dictionaryDetailCode=request.getParameter("dictionaryDetailCode");
		 String dictionaryDetaiLabel=request.getParameter("dictionaryDetaiLabel");
		 String dictionaryDetailNumber=request.getParameter("dictionaryDetailNumber");
		// S1.接收请求参数
		
		DictionarySKU dictionarySKU = new DictionarySKU();
		dictionarySKU.setDictionaryDetailId(dictionaryDetailId);
		dictionarySKU.setDataDictionaryId(dataDictionaryId);
		dictionarySKU.setDataDictionaryCode(dataDictionaryCode);
		dictionarySKU.setDictionaryDetailCode(dictionaryDetailCode);
		dictionarySKU.setDictionaryDetaiLabel(dictionaryDetaiLabel);
		dictionarySKU.setDictionaryDetailNumber(dictionaryDetailNumber);
	
	
		System.out.println(dictionaryDetailId);
		System.out.println(dataDictionaryId);
		System.out.println(dataDictionaryCode);
		System.out.println(dictionaryDetailCode);
		System.out.println(dictionaryDetaiLabel);
		System.out.println(dictionaryDetailNumber);
	

		
		
		// 根据studentId是否为空判断是新增还是修改的编辑
		if (StringUtil.isEmpty(dictionaryDetailId)) {// 新增
			System.out.println("新增保存:" + dictionaryDetailId);
			dictionarySKUService.insert(dictionarySKU);
			System.out.println("id为空啊");
		
		} else {// 修改
			// S2.业务处理：调数据库,略
			dictionarySKUService.update(dictionarySKU);
		
		}

		// S3.页面跳转：重定向
		response.sendRedirect("DictionarySKUServlet.do?method=list");
		
		
		
		
		

	}

	



}
