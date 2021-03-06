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

import com.iwonder.tea.usr.entity.UserInfo;

//@WebFilter("/AddCartServlet.do", "/InformationServlet.do")
@WebFilter(urlPatterns = { "/AddCartServlet.do", "/InformationServlet.do" ,"/OrderServlet.do"})
public class FrontLoginFilter implements Filter {

	public FrontLoginFilter() {
	}

	public void destroy() {
	}

	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
			throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) servletRequest;
		HttpServletResponse response = (HttpServletResponse) servletResponse;

		HttpSession session = request.getSession();

		// String currentUrl = request.getRequestURI();
		// System.out.println("currentUrl:" + currentUrl);

		UserInfo userInfo = (UserInfo) session.getAttribute("userInfo");

		if (userInfo == null) {
			response.sendRedirect(request.getServletContext().getContextPath() + "/LoginServlet.do");
		} else {
			filterChain.doFilter(servletRequest, servletResponse);
		}
	}

	public void init(FilterConfig fConfig) throws ServletException {

	}

}
