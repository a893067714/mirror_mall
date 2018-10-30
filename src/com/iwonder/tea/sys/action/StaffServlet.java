package com.iwonder.tea.sys.action;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iwonder.tea.framework.action.BaseServlet;
import com.iwonder.tea.framework.service.ProxyServiceFactory;
import com.iwonder.tea.framework.util.StringUtil;
import com.iwonder.tea.sys.entity.Staff;
import com.iwonder.tea.sys.service.IStaffService;
import com.iwonder.tea.sys.service.imp.StaffServiceImp;
import com.iwonder.tea.sys.view.StaffConditionView;
import com.iwonder.tea.sys.view.StaffQueryView;

/**
 * Servlet implementation class StaffServlet
 */
@WebServlet("/admin/sys/StaffServlet.do")
public class StaffServlet extends BaseServlet {

	private IStaffService iStaffService = (IStaffService) ProxyServiceFactory.getProxyService(StaffServiceImp.class);

	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public StaffServlet() {
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
		String staffName = request.getParameter("staffName") ;
		String staffGender = request.getParameter("staffGender") ;
		String staffBirthday = request.getParameter("staffBirthday") ;
		String staffStatus = request.getParameter("staffStatus") ;
		
		if(StringUtil.isNotEmpty(staffName)){
			staffName = staffName.trim() ;
		}

//		ArrayList<Staff> listStaff = iStaffService.list();
		StaffConditionView staffConditionView = new StaffConditionView();
		staffConditionView.setStaffName(staffName);
		staffConditionView.setStaffGender(staffGender);
		
		Date date = StringUtil.parseDate(staffBirthday);
		staffConditionView.setStaffBirthday(date);
		
		staffConditionView.setStaffStatus(staffStatus);
		ArrayList<StaffQueryView> listStaff = iStaffService.list(staffConditionView);

		// 传递对象数据
		request.setAttribute("listStaff", listStaff);

		//回显
		request.setAttribute("staffConditionView", staffConditionView );
		request.setAttribute("staffBirthday", staffBirthday);
		
		// 页面的跳转：转发
		request.getRequestDispatcher("/WEB-INF/jsp/admin/sys/staff_list.jsp").forward(request, response);

	}

	@SuppressWarnings("unused")
	private void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// s1.取参数
		String staffId = request.getParameter("staffId");

		// s2.业务逻辑

		iStaffService.delete(staffId);

		// s3.页面跳转：重定向
		response.sendRedirect("StaffServlet.do?method=list");

	}

	@SuppressWarnings("unused")
	private void edit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// S1.获取参数
		String staffId = request.getParameter("staffId");

		if (StringUtil.isEmpty(staffId)) {// 新增

		} else {// load
				// S2.业务逻辑操作

			Staff staff = iStaffService.load(staffId);

			request.setAttribute("staff", staff);
		}

		// S3.跳转
		request.getRequestDispatcher("/WEB-INF/jsp/admin/sys/staff_edit.jsp").forward(request, response);

	}

	@SuppressWarnings("unused")
	private void save(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// S1.接收请求参数
		String staffId = request.getParameter("staffId");
		String staffCode = request.getParameter("staffCode");
		String staffName = request.getParameter("staffName");
		String staffGender = request.getParameter("staffGender");
		String staffBirthday = request.getParameter("staffBirthday");
		String staffMoblie = request.getParameter("staffMoblie");
		String staffAddress = request.getParameter("staffAddress");
		String staffStatus = request.getParameter("staffStatus");
		String pwdLogin = request.getParameter("pwdLogin");
		String staffInfo = request.getParameter("staffInfo");

		
		Staff staff = new Staff();
		staff.setStaffId(staffId);
		staff.setStaffCode(staffCode);
		staff.setStaffName(staffName);
		staff.setStaffGender(staffGender);
		
		Date date = StringUtil.parseDate(staffBirthday);
		staff.setStaffBirthday(date);
		
		staff.setStaffMoblie(staffMoblie);
		staff.setStaffAddress(staffAddress);
		staff.setStaffStatus(staffStatus);
		staff.setPwdLogin(pwdLogin);
		staff.setStaffInfo(staffInfo);
		
		// 业务逻辑
		if (StringUtil.isEmpty(staffId)) {// 新增
			iStaffService.insert(staff);
		} else {// 修改
			iStaffService.update(staff);
		}

		// S3.页面跳转：重定向
		response.sendRedirect("StaffServlet.do?method=list");

	}
	
	//方便用户使用
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(request, response);
	}

}
