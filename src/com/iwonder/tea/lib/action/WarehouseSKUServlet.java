package com.iwonder.tea.lib.action;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iwonder.tea.framework.action.BaseServlet;
import com.iwonder.tea.framework.service.ProxyServiceFactory;
import com.iwonder.tea.framework.util.StringUtil;
import com.iwonder.tea.lib.entity.WarehouseSKU;
import com.iwonder.tea.lib.service.IWarehouseSKUService;
import com.iwonder.tea.lib.service.IWarehouseService;
import com.iwonder.tea.lib.service.imp.WarehouseSKUServiceImp;
import com.iwonder.tea.lib.service.imp.WarehouseServiceImp;
import com.iwonder.tea.lib.view.WarehouseConditionView;
import com.iwonder.tea.lib.view.WarehouseQueryView;
import com.iwonder.tea.lib.view.WarehouseSKUConditionView;
import com.iwonder.tea.lib.view.WarehouseSKUQueryView;
import com.iwonder.tea.prd.service.IProductSkuService;
import com.iwonder.tea.prd.service.imp.ProductSkuServiceImp;
import com.iwonder.tea.prd.view.ProductSkuConditionView;
import com.iwonder.tea.prd.view.ProductSkuQueryView;

/**
 * Servlet implementation class StudentServlet
 */
@WebServlet("/admin/lib/WarehouseSKUServlet.do")
public class WarehouseSKUServlet extends BaseServlet {

	private IWarehouseSKUService warehouseSKUService = (IWarehouseSKUService) ProxyServiceFactory
			.getProxyService(WarehouseSKUServiceImp.class);
	private IWarehouseService warehouseService = (IWarehouseService) ProxyServiceFactory
			.getProxyService(WarehouseServiceImp.class);
	private IProductSkuService productSkuService = (IProductSkuService) ProxyServiceFactory
			.getProxyService(ProductSkuServiceImp.class);
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public WarehouseSKUServlet() {
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
		String warehouseDtlCode = request.getParameter("warehouseDtlCode");
		String productSkuId = request.getParameter("productSkuId");
		String warehouseId = request.getParameter("warehouseId");
		String unitPrice1 = request.getParameter("unitPrice");
		BigDecimal unitPrice = StringUtil.parseBigDecimal(unitPrice1);
		String quantity1 = request.getParameter("quantity");
		Integer quantity = StringUtil.Integer(quantity1);
		String totalPrice1 = request.getParameter("totalPrice");
		BigDecimal totalPrice = StringUtil.parseBigDecimal(totalPrice1);
		String remark = request.getParameter("remark");
		WarehouseSKUConditionView warehouseSKUConditionView = new WarehouseSKUConditionView();
		warehouseSKUConditionView.setWarehouseDtlCode(warehouseDtlCode);
		warehouseSKUConditionView.setProductSkuId(productSkuId);
		warehouseSKUConditionView.setWarehouseId(warehouseId);
		warehouseSKUConditionView.setUnitPrice(unitPrice);
		warehouseSKUConditionView.setQuantity(quantity);
		warehouseSKUConditionView.setTotalPrice(totalPrice);
		warehouseSKUConditionView.setRemark(remark);

		ArrayList<WarehouseSKUQueryView> arr = warehouseSKUService.list(warehouseSKUConditionView);
		// 传递对象数据
	
		request.setAttribute("arr1", arr);
		System.out.println(arr.toString());
		System.out.println("执行这里");
		// 页面的跳转：转发
		request.getRequestDispatcher("/WEB-INF/jsp/admin/lib/warehouseSKU_list.jsp").forward(request, response);

	}

	@SuppressWarnings("unused")
	protected void delete(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// s1.取参数
		String warehouseDtlId = request.getParameter("warehouseDtlId");
		warehouseSKUService.delete(warehouseDtlId);
		// s3.页面跳转：重定向
		response.sendRedirect("WarehouseSKUServlet.do?method=list");

	}

	@SuppressWarnings("unused")
	protected void edit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// S1.获取参数

		String warehouseDtlId = request.getParameter("warehouseDtlId");
		WarehouseSKU warehouseSKU = new WarehouseSKU();
	
		// 根据studentId是否为空判断是新增还是修改的编辑

		WarehouseConditionView warehouse = new WarehouseConditionView();
		// 根据studentId是否为空判断是新增还是修改的编辑
		ArrayList<WarehouseQueryView> listWarehouse = warehouseService.list(warehouse);
		request.setAttribute("listWarehouse", listWarehouse);
		ProductSkuConditionView productSku = new ProductSkuConditionView();
		
		ArrayList<ProductSkuQueryView> listProductSKU = productSkuService.list(productSku);
		request.setAttribute("listProductSKU", listProductSKU);
	
		
		if (StringUtil.isEmpty(warehouseDtlId)) {// 新增

		} else {// 修改
			// S2.业务逻辑操作
			System.out.println(warehouseDtlId);
			System.out.println("有到这里");

			warehouseSKU = warehouseSKUService.load(warehouseDtlId);

			request.setAttribute("warehouseSKU", warehouseSKU);
			request.setAttribute("productSkuId",warehouseSKU.getProductSkuId());
			request.setAttribute("warehouseId", warehouseSKU.getWarehouseId());
			System.out.println("getWarehouseId()"+warehouseSKU.getWarehouseId());
		}	

		// S3.跳转
		request.getRequestDispatcher("/WEB-INF/jsp/admin/lib/warehouseSKU_edit.jsp").forward(request, response);

	}

	@SuppressWarnings("unused")
	protected void save(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// S1.接收请求参数

		String warehouseDtlId = request.getParameter("warehouseDtlId");
		String warehouseDtlCode = request.getParameter("warehouseDtlCode");
		String productSkuId = request.getParameter("productSkuId");
		String warehouseId = request.getParameter("warehouseId");
		String unitPrice1 = request.getParameter("unitPrice");
		BigDecimal unitPrice = StringUtil.parseBigDecimal(unitPrice1);
		String quantity1 = request.getParameter("quantity");
		Integer quantity = StringUtil.Integer(quantity1);
		String totalPrice1 = request.getParameter("totalPrice");
		BigDecimal totalPrice = StringUtil.parseBigDecimal(totalPrice1);
		String remark = request.getParameter("remark");
		WarehouseSKU warehouseSKU = new WarehouseSKU();
		warehouseSKU.setWarehouseDtlId(warehouseDtlId);
		warehouseSKU.setWarehouseDtlCode(warehouseDtlCode);
		warehouseSKU.setProductSkuId(productSkuId);
		warehouseSKU.setWarehouseId(warehouseId);
		warehouseSKU.setUnitPrice(unitPrice);
		warehouseSKU.setQuantity(quantity);
		warehouseSKU.setTotalPrice(totalPrice);
		warehouseSKU.setRemark(remark);
		System.out.println(warehouseDtlId);
		System.out.println(warehouseDtlCode);
		System.out.println(productSkuId);
		System.out.println(warehouseId);
		System.out.println(unitPrice);
		System.out.println(quantity);
		System.out.println("********");
		System.out.println(warehouseDtlId);
		System.out.println(productSkuId);
		System.out.println(warehouseId);
		System.out.println(unitPrice1);
		System.out.println(quantity1);
		System.out.println(totalPrice1);
		System.out.println(remark);

		// 根据studentId是否为空判断是新增还是修改的编辑
		if (StringUtil.isEmpty(warehouseDtlId)) {// 新增
			System.out.println("新增保存:" + warehouseDtlId);
			System.out.println(warehouseSKU.toString());
			warehouseSKUService.insert(warehouseSKU);
			

		} else {// 修改
			// S2.业务处理：调数据库,略
			warehouseSKUService.update(warehouseSKU);

		}

		// S3.页面跳转：重定向
		response.sendRedirect("WarehouseSKUServlet.do?method=list");

	}

}
