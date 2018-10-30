package com.iwonder.tea.framework.web.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.iwonder.tea.framework.service.ProxyServiceFactory;
import com.iwonder.tea.sys.entity.Staff;
import com.iwonder.tea.sys.service.IMenuService;
import com.iwonder.tea.sys.service.IRoleMenuService;
import com.iwonder.tea.sys.service.IStaffRoleService;
import com.iwonder.tea.sys.service.imp.MenuServiceImp;
import com.iwonder.tea.sys.service.imp.RoleMenuServiceImp;
import com.iwonder.tea.sys.service.imp.StaffRoleServiceImp;

/**
 * Servlet Filter implementation class AdminLoginFilter
 */
@WebFilter("/admin/*")
public class AdminLoginFilter implements Filter {
	private IStaffRoleService iStaffRoleService = (IStaffRoleService) ProxyServiceFactory
			.getProxyService(StaffRoleServiceImp.class);
	private IMenuService iMenuService = (IMenuService) ProxyServiceFactory.getProxyService(MenuServiceImp.class);
	private IRoleMenuService iRoleMenuService = (IRoleMenuService) ProxyServiceFactory
			.getProxyService(RoleMenuServiceImp.class);
	/**
	 * Default constructor.
	 */
	public AdminLoginFilter() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
			throws IOException, ServletException {
		System.out.println("AdminLoginFilter.doFilter begin");

		HttpServletRequest request = (HttpServletRequest) servletRequest;
		HttpServletResponse response = (HttpServletResponse) servletResponse;

		HttpSession session = request.getSession();
		String contextPath = servletRequest.getServletContext().getContextPath();
		System.out.println("contextPath:" + contextPath);

		String currentUrl = request.getRequestURI();
		System.out.println("currentUrl:" + currentUrl);

		String sessionId = session.getId();
		System.out.println("sessionid:" + sessionId);

		Staff staff = (Staff) session.getAttribute("staff");
		// System.out.println("customer:" +
		// customer.getCustomerCode());/jd_dynamic/WebContent/WEB-INF/jsp/admin/sys/login.jsp

		if (staff == null) {
			response.sendRedirect(request.getServletContext().getContextPath() + "/AdminLoginServlet.do");
		} else {


			
//			StaffRoleConditionView srcv = new StaffRoleConditionView();
//			srcv.setStaffId(staff.getStaffId());
//			ArrayList<StaffRoleQueryView> listStaffRole = iStaffRoleService.list(srcv);
//			ArrayList<Menu> menulist = new ArrayList<Menu>();
//			RoleMenuConditionView roleMenuConditionView = new RoleMenuConditionView();
//			for (StaffRoleQueryView staffRoleQueryView : listStaffRole) {
//				roleMenuConditionView.setRoleId(staffRoleQueryView.getRoleId());
//				ArrayList<RoleMenuQueryView> listRoleMenuQueryView = iRoleMenuService.list(roleMenuConditionView);
//				for (RoleMenuQueryView roleMenuQueryView : listRoleMenuQueryView) {
//					Menu menuLoad = iMenuService.load(roleMenuQueryView.getMenuId());
//					System.out.println(menuLoad.toString());
//					menulist.add(menuLoad);
//				}
//			}
			
			
			
			filterChain.doFilter(servletRequest, servletResponse);
		}

		System.out.println("AdminLoginFilter.doFilter end");
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
