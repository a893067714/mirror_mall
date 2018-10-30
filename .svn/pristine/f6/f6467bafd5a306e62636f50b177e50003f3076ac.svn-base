package com.iwonder.tea.framework.web.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("*.do")
public class EncodingFilter implements Filter {

	public EncodingFilter() {
	}

	public void destroy() {
	}

	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
			throws IOException, ServletException {
		System.out.println("EncodingFilter.doFilter begin");

		// 设置请求与响应的编码
		servletRequest.setCharacterEncoding("utf-8");
		servletResponse.setCharacterEncoding("utf-8");
		servletResponse.setContentType("text/html;charset=utf-8");

		filterChain.doFilter(servletRequest, servletResponse);

		System.out.println("EncodingFilter.doFilter end");
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
