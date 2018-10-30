package com.iwonder.tea.lib.action;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iwonder.tea.constant.DictConstant;
import com.iwonder.tea.dictionary.dao.IDictionaryDao;
import com.iwonder.tea.dictionary.service.IDictionarySKUService;
import com.iwonder.tea.dictionary.service.IDictionaryService;
import com.iwonder.tea.dictionary.service.imp.DictionarySKUServiceImp;
import com.iwonder.tea.dictionary.service.imp.DictionaryServiceImp;
import com.iwonder.tea.dictionary.view.DictionaryConditionView;
import com.iwonder.tea.framework.action.BaseServlet;
import com.iwonder.tea.framework.service.ProxyServiceFactory;
import com.iwonder.tea.framework.util.StringUtil;
import com.iwonder.tea.lib.entity.Warehouse;
import com.iwonder.tea.lib.service.IWarehouseService;
import com.iwonder.tea.lib.service.imp.WarehouseServiceImp;
import com.iwonder.tea.lib.view.WarehouseConditionView;
import com.iwonder.tea.lib.view.WarehouseQueryView;
import com.iwonder.tea.sys.service.IStaffService;
import com.iwonder.tea.sys.service.imp.StaffServiceImp;
import com.iwonder.tea.sys.view.StaffConditionView;
import com.iwonder.tea.sys.view.StaffQueryView;

/**
 * Servlet implementation class StudentServlet
 */
@WebServlet("/admin/lib/WarehouseServlet.do")
public class WarehouseServlet extends BaseServlet {

	private IWarehouseService warehouseService = (IWarehouseService) ProxyServiceFactory
			.getProxyService(WarehouseServiceImp.class);
	private IStaffService iStaffService = (IStaffService) ProxyServiceFactory.getProxyService(StaffServiceImp.class);
	private IDictionaryService dictionaryService = (IDictionaryService) ProxyServiceFactory
			.getProxyService(DictionaryServiceImp.class);
	private IDictionarySKUService dictionarySKUService = (IDictionarySKUService) ProxyServiceFactory
			.getProxyService(DictionarySKUServiceImp.class);

	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public WarehouseServlet() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		super.doGet(request, response);
	}

	@SuppressWarnings("unused")
	protected void list(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 根据业务逻辑，查询数据

		String warehouseCode = request.getParameter("warehouseCode");
		String staffId = request.getParameter("staffId");
		String price1 = request.getParameter("price");
		System.out.println("price" + price1);
		BigDecimal price = StringUtil.parseBigDecimal(price1);
		String payStat = request.getParameter("payStat");
		String purchaseDate1 = request.getParameter("purchaseDate");
		Date purchaseDate = StringUtil.parseDate(purchaseDate1);
		String warehouseDate1 = request.getParameter("warehouseDate");
		Date warehouseDate = StringUtil.parseDate(warehouseDate1);
		String remark = request.getParameter("remark");
		/* cjz update */
		String purchaseDateStart = request.getParameter("purchaseDateStart");
		String warehouseDateStart = request.getParameter("warehouseDateStart");
		String purchaseDateEnd = request.getParameter("purchaseDateEnd");
		String warehouseDateEnd = request.getParameter("warehouseDateEnd");
		/* cjz */
		WarehouseConditionView warehouseConditionView = new WarehouseConditionView();
		warehouseConditionView.setWarehouseCode(warehouseCode);
		warehouseConditionView.setStaffId(staffId);
		warehouseConditionView.setPrice(price);
		warehouseConditionView.setPayStat(payStat);
		/* cjz */
		warehouseConditionView.setPurchaseDateStart(purchaseDateStart);
		warehouseConditionView.setWarehouseDateStart(warehouseDateStart);
		warehouseConditionView.setPurchaseDateEnd(purchaseDateEnd);
		warehouseConditionView.setWarehouseDateEnd(warehouseDateEnd);
		/* cjz */
		warehouseConditionView.setRemark(remark);
		request.setAttribute("listDictionarySku", dictionarySKUService.findByDictCode(DictConstant.PAY_STATUS));

		ArrayList<WarehouseQueryView> arr = warehouseService.list(warehouseConditionView);

		// request.setAttribute("listPaystate", dictionarySKUService.list(d));
		// ArrayList<DictionaryConditionView> dictionaryConditionView =
		// dictionaryService.list(dictionaryConditionView);
		// 传递对象数据
		request.setAttribute("arr1", arr);
		request.setAttribute("price", price);
		request.setAttribute("payStat", payStat);
		request.setAttribute("remark", remark);
		request.setAttribute("purchaseDateStart", purchaseDateStart);
		request.setAttribute("purchaseDateEnd", purchaseDateEnd);
		request.setAttribute("warehouseDateStart", warehouseDateStart);
		request.setAttribute("warehouseDateEnd", warehouseDateEnd);
		System.out.println(arr.toString());
		System.out.println("执行这里");
		// 页面的跳转：转发
		request.getRequestDispatcher("/WEB-INF/jsp/admin/lib/warehouse_list.jsp").forward(request, response);

	}

	@SuppressWarnings("unused")
	protected void delete(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// s1.取参数
		String warehouseId = request.getParameter("warehouseId");
		warehouseService.delete(warehouseId);
		// s3.页面跳转：重定向
		response.sendRedirect("WarehouseServlet.do?method=list");

	}

	@SuppressWarnings("unused")
	protected void edit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// S1.获取参数

		String warehouseId = request.getParameter("warehouseId");
		Warehouse warehouse = new Warehouse();

		// 根据studentId是否为空判断是新增还是修改的编辑

		StaffConditionView staff = new StaffConditionView();
		// 根据studentId是否为空判断是新增还是修改的编辑
		ArrayList<StaffQueryView> listStaff = iStaffService.list(staff);

		request.setAttribute("listStaff", listStaff);

		if (StringUtil.isEmpty(warehouseId)) {// 新增

		} else {// 修改
			// S2.业务逻辑操作
			System.out.println(warehouseId);
			System.out.println("有到这里");

			warehouse = warehouseService.load(warehouseId);

			request.setAttribute("warehouse", warehouse);
			request.setAttribute("staffId", warehouse.getStaffId());

		}
		request.setAttribute("listDictionarySku", dictionarySKUService.findByDictCode(DictConstant.PAY_STATUS));
		// S3.跳转warehouse_edit.jsp
		request.getRequestDispatcher("/WEB-INF/jsp/admin/lib/warehouse_edit.jsp").forward(request, response);

	}

	@SuppressWarnings("unused")
	protected void save(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// S1.接收请求参数

		String warehouseId = request.getParameter("warehouseId");
		String warehouseCode = request.getParameter("warehouseCode");
		String staffId = request.getParameter("staffId");
		String price1 = request.getParameter("price");
		BigDecimal price = StringUtil.parseBigDecimal(price1);
		String payStat = request.getParameter("payStat");
		String purchaseDate1 = request.getParameter("purchaseDate");
		Date purchaseDate = StringUtil.parseDate(purchaseDate1);
		String warehouseDate1 = request.getParameter("warehouseDate");
		Date warehouseDate = StringUtil.parseDate(warehouseDate1);
		String remark = request.getParameter("remark");

		Warehouse warehouse = new Warehouse();
		warehouse.setWarehouseId(warehouseId);
		warehouse.setWarehouseCode(warehouseCode);
		warehouse.setStaffId(staffId);
		warehouse.setPrice(price);
		warehouse.setPayStat(payStat);
		warehouse.setPurchaseDate(purchaseDate);
		warehouse.setWarehouseDate(warehouseDate);
		warehouse.setRemark(remark);
		System.out.println(warehouseId);
		System.out.println(warehouseCode);
		System.out.println(staffId);
		System.out.println(price);
		System.out.println(payStat);
		System.out.println(purchaseDate);
		System.out.println(warehouseDate);
		System.out.println(remark);

		// 根据studentId是否为空判断是新增还是修改的编辑
		if (StringUtil.isEmpty(warehouseId)) {// 新增
			System.out.println("新增保存:" + warehouseId);
			warehouseService.insert(warehouse);
			System.out.println("id为空啊");

		} else {// 修改
			// S2.业务处理：调数据库,略
			warehouseService.update(warehouse);

		}

		// S3.页面跳转：重定向
		response.sendRedirect("WarehouseServlet.do?method=list");

	}

}
