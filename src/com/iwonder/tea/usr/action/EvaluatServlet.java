package com.iwonder.tea.usr.action;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iwonder.tea.constant.DictConstant;
import com.iwonder.tea.dictionary.entity.DictionarySKU;
import com.iwonder.tea.dictionary.service.IDictionarySKUService;
import com.iwonder.tea.dictionary.service.imp.DictionarySKUServiceImp;
import com.iwonder.tea.dictionary.view.DictionarySKUConditionView;
import com.iwonder.tea.framework.action.BaseServlet;
import com.iwonder.tea.framework.service.ProxyServiceFactory;
import com.iwonder.tea.framework.util.StringUtil;
import com.iwonder.tea.ord.service.IOrderSKUService;
import com.iwonder.tea.ord.service.imp.OrderSKUServiceImp;
import com.iwonder.tea.ord.view.OrderSKUConditionView;
import com.iwonder.tea.ord.view.OrderSKUQueryView;
import com.iwonder.tea.prd.service.IProductService;
import com.iwonder.tea.prd.service.imp.ProductServiceImp;
import com.iwonder.tea.prd.view.ProductConditionView;
import com.iwonder.tea.prd.view.ProductQueryView;
import com.iwonder.tea.usr.entity.Evaluate;
import com.iwonder.tea.usr.service.IEvaluateService;
import com.iwonder.tea.usr.service.IUserInfoService;
import com.iwonder.tea.usr.service.imp.EvaluateServiceImp;
import com.iwonder.tea.usr.service.imp.UserInfoServiceImp;
import com.iwonder.tea.usr.view.EvaluatConditionView;
import com.iwonder.tea.usr.view.EvaluatQueryView;
import com.iwonder.tea.usr.view.UserInfoConditionView;
import com.iwonder.tea.usr.view.UserInfoQueryView;

/**
 * Servlet implementation class EvaluateServlet
 */
@WebServlet("/admin/usr/EvaluatServlet.do")
public class EvaluatServlet extends BaseServlet {

	private IEvaluateService iEvaluateService = (IEvaluateService) ProxyServiceFactory.getProxyService(EvaluateServiceImp.class);
	private IUserInfoService iUserInfoService = (IUserInfoService) ProxyServiceFactory.getProxyService(UserInfoServiceImp.class);
	private IProductService iProductService = (IProductService) ProxyServiceFactory.getProxyService(ProductServiceImp.class);
	private IOrderSKUService iOrderSKUService = (IOrderSKUService)ProxyServiceFactory.getProxyService(OrderSKUServiceImp.class);
	private IDictionarySKUService IDictionarySKUService = (IDictionarySKUService)ProxyServiceFactory.getProxyService(DictionarySKUServiceImp.class);
	
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EvaluatServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

	@SuppressWarnings("unused")
	private void list(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 根据业务逻辑，查询数据
		String userId = request.getParameter("userId") ;
		String productId = request.getParameter("productId") ;
		String orderDtlId = request.getParameter("orderDtlId") ;
		String serviceStatus = request.getParameter("serviceStatus") ;
		String descriptionStatus = request.getParameter("descriptionStatus") ;
		String timePrevious = request.getParameter("timePrevious");
		String timeLater = request.getParameter("timeLater");
		
		if(StringUtil.isNotEmpty(userId)){
			userId = userId.trim() ;
		}

//		ArrayList<Evaluate> listEvaluate = iEvaluateService.list();
		EvaluatConditionView evaluatConditionView = new EvaluatConditionView();
		evaluatConditionView.setUserId(userId);
		evaluatConditionView.setProductId(productId);
		evaluatConditionView.setOrderDtlId(orderDtlId);
//		evaluatConditionView.setLogStatus(logStatus);
		evaluatConditionView.setServiceStatus(serviceStatus);
		evaluatConditionView.setDescriptionStatus(descriptionStatus);
		evaluatConditionView.setTimePrevious(StringUtil.parseDate(timePrevious));
		evaluatConditionView.setTimeLater(StringUtil.parseDate(timeLater));

		ArrayList<EvaluatQueryView> listEvaluate = iEvaluateService.list(evaluatConditionView);
		// 传递对象数据
		request.setAttribute("listEvaluate", listEvaluate);
		System.out.println(listEvaluate.toString());
		
		request.setAttribute("evaluatConditionView", evaluatConditionView );
		
		request.setAttribute("timePrevious", timePrevious);
		request.setAttribute("timeLater", timeLater);
		
//		request.setAttribute("productId", productId );
//		request.setAttribute("orderDtlId", orderDtlId );
//		request.setAttribute("logStatus", logStatus );
//		request.setAttribute("serviceStatus", serviceStatus );
//		request.setAttribute("descriptionStatus", descriptionStatus );
		
		//下拉框
		request.setAttribute("listUserInfo", iUserInfoService.list(new UserInfoConditionView()));
		
		request.setAttribute("listProduct", iProductService.list(new ProductConditionView()));
		
		request.setAttribute("listOrderSKU", iOrderSKUService.list(new OrderSKUConditionView()));
		
		request.setAttribute("listDictionarySKU", IDictionarySKUService.list(new DictionarySKUConditionView()));
		
		//下拉框获取指定值
		request.setAttribute("userId",evaluatConditionView.getUserId());
		request.setAttribute("productId",evaluatConditionView.getProductId());
		request.setAttribute("orderDtlId",evaluatConditionView.getOrderDtlId());
		
		//数据字典
		request.setAttribute("listServiceStatus", IDictionarySKUService.findByDictCode(DictConstant.SERVICE_STATUS));
		request.setAttribute("listDescriptionStatus", IDictionarySKUService.findByDictCode(DictConstant.DESCRIPTION_STATUS));

		
		// 页面的跳转：转发
		request.getRequestDispatcher("/WEB-INF/jsp/admin/usr/evaluate_list.jsp").forward(request, response);

	}

	@SuppressWarnings("unused")
	private void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// s1.取参数
		String evaluateId = request.getParameter("evaluateId");

		// s2.业务逻辑

		iEvaluateService.delete(evaluateId);

		// s3.页面跳转：重定向
		response.sendRedirect("EvaluatServlet.do?method=list");

	}

	@SuppressWarnings("unused")
	private void edit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// S1.获取参数
		String evaluateId = request.getParameter("evaluateId");
		
		//下拉框
		request.setAttribute("listUserInfo", iUserInfoService.list(new UserInfoConditionView()));
		request.setAttribute("listProduct", iProductService.list(new ProductConditionView()));
		request.setAttribute("listOrderSKU", iOrderSKUService.list(new OrderSKUConditionView()));
		request.setAttribute("listDictionarySKU", IDictionarySKUService.list(new DictionarySKUConditionView()));
		//数据字典
		request.setAttribute("listServiceStatus", IDictionarySKUService.findByDictCode(DictConstant.SERVICE_STATUS));
		request.setAttribute("listDescriptionStatus", IDictionarySKUService.findByDictCode(DictConstant.DESCRIPTION_STATUS));
		
		if (StringUtil.isEmpty(evaluateId)) {// 新增

		} else {// load
				// S2.业务逻辑操作

			Evaluate evaluate = iEvaluateService.load(evaluateId);
			
			request.setAttribute("userId",evaluate.getUserId());
			request.setAttribute("productId",evaluate.getProductId());
			request.setAttribute("orderDtlId",evaluate.getOrderDtlId());
			
			request.setAttribute("evaluate", evaluate);
		}

		// S3.跳转
		request.getRequestDispatcher("/WEB-INF/jsp/admin/usr/evaluate_edit.jsp").forward(request, response);

	}

	@SuppressWarnings("unused")
	private void save(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// S1.接收请求参数
		String evaluateId = request.getParameter("evaluateId");
		String userId = request.getParameter("userId");
		String productId = request.getParameter("productId");
		String orderDtlId = request.getParameter("orderDtlId");
//		String logStatus = request.getParameter("logStatus");
		String serviceStatus = request.getParameter("serviceStatus");
		String descriptionStatus = request.getParameter("descriptionStatus");
		String evalContent = request.getParameter("evalContent");
		String imgUrl = request.getParameter("imgUrl");
		String videoUrl = request.getParameter("videoUrl");
		String evaluateTime = request.getParameter("evaluateTime");

		Evaluate evaluate = new Evaluate();
		evaluate.setEvaluateId(evaluateId);
		evaluate.setUserId(userId);
		evaluate.setProductId(productId);
		evaluate.setOrderDtlId(orderDtlId);
//		evaluate.setLogStatus(logStatus);
		evaluate.setServiceStatus(serviceStatus);
		evaluate.setDescriptionStatus(descriptionStatus);
		evaluate.setEvalContent(evalContent);
		evaluate.setImgUrl(imgUrl);
		evaluate.setVideoUrl(videoUrl);
		
		evaluate.setEvaluateTime(StringUtil.parseDate(evaluateTime));
		
		//通过date将字符串转换成时间格式
		// 业务逻辑
		if (StringUtil.isEmpty(evaluateId)) {// 新增
			iEvaluateService.insert(evaluate);
		} else {// 修改
			iEvaluateService.update(evaluate);
		}

		// S3.页面跳转：重定向
		response.sendRedirect("EvaluatServlet.do?method=list");

	}
	
	//方便用户使用
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(request, response);
	}

}
