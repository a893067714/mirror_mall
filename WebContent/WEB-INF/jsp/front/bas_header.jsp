<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<head>
<link href="<%=request.getContextPath()%>/resource/front/css/common.css"
	rel="stylesheet" type="text/css" />
<link
	href="<%=request.getContextPath()%>/resource/front/css/index/index.css"
	rel="stylesheet" type="text/css" />
<link
	href="<%=request.getContextPath()%>/resource/front/fronticonfont/iconfont.css"
	rel="stylesheet" type="text/css" />

</head>


	<div class="header">
		<div class="header_nav">
			<div class="header_nav_left">
				<a href="IndexServlet.do"> <i class="icon iconfont icon-shouye"></i>
					京东首页
				</a> <a href="#"> <i class="icon iconfont icon-dizhiguanli"></i> 定位
				</a>
			</div>
			<div class="header_nav_right">
				<ul>
					<c:if test="${not empty userInfo}">
						<li><a href="InformationServlet.do">欢迎,${userInfo.name}</a></li>
						<li><a href="UserLogRegServlet.do?method=logout">退出</a></li>
					</c:if>
					<c:if test="${empty userInfo }">
						<li><a href="LoginServlet.do">你好，请登录</a></li>
						<li><a href="RegServlet.do" style="color: #FF3E1F;">免费注册</a></li>
					</c:if>
					<li><a href="OrderServlet.do">我的订单</a></li>
					<li>|</li>
					<li><a href="#">我的京东</a></li>
					<li>|</li>
					<li><a href="#">京东会员</a></li>
					<li>|</li>
					<li><a href="#">企业采购</a></li>
					<li>|</li>
					<li><a href="#">客户服务</a></li>
					<li>|</li>
					<li><a href="#">网站导航</a></li>
					<li>|</li>
					<li><a href="#">手机京东</a></li>
				</ul>
			</div>
			<div style="clear: both;"></div>
		</div>
	</div>




