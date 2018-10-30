<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	
	<!--Header-part-->
		<div id="header">
			<h1></h1>
		</div>
	<!--close-Header-part-->
		<!--top-Header-menu-->
<div id="user-nav" class="navbar navbar-inverse">
<ul class="nav">
<c:if test="${not empty staff}">
<liclass="dropdown" id="profile-messages" ><a class="dropdown-toggle"><i class="icon icon-user"></i><span class="text">欢迎,${staff.staffName}</span><b class="caret"></b></a>
<ul class="dropdown-menu">
<li><a href="#"><i class="icon-user"></i> 我的资料</a></li>
<li class="divider"></li>
<li><a href="#"><i class="icon-check"></i> 我的任务</a></li>
<li class="divider"></li>
</ul>
</li>
</c:if>

<li class="dropdown" id="menu-messages"><a href="#" data-toggle="dropdown" data-target="#menu-messages" class="dropdown-toggle">
	<i class="icon icon-envelope"></i> 
	<span class="text">消息</span> <span class="label label-important">0</span> <b class="caret"></b></a>
<ul class="dropdown-menu">
<li><a class="sAdd" title="" href="#"><i class="icon-plus"></i> 新消息</a></li>
<li class="divider"></li>
<li><a class="sInbox" title="" href="#"><i class="icon-envelope"></i> 收件箱</a></li>
<li class="divider"></li>
<li><a class="sOutbox" title="" href="#"><i class="icon-arrow-up"></i> 发件箱</a></li>
<li class="divider"></li>
<li><a class="sTrash" title="" href="#"><i class="icon-trash"></i> 发送</a></li>
</ul>
</li>

<li class=""><a href="AdminLoginServlet.do"><i class="icon icon-cog"></i> <span class="text">退出</span></a></li>
<li class=""><a title="" href="#"><i class="icon icon-cog"></i> <span class="text">设置</span></a></li>
<!-- <li class=""><a title="" href="login.html"><i class="icon icon-share-alt"></i> <span class="text">退出</span></a></li> -->
</ul>
</div>
<!--close-top-Header-menu-->
	<!--sidebar-menu-->
	<div id="sidebar">
		<a href="#" class="visible-phone"><i class="icon icon-home"></i>
			控制台</a>
		<ul><!-- menulist -->
			<li><a href="<%=request.getContextPath()%>/nav.jsp"><span>导航首页</span></a></li>
			<c:forEach items="${menulist }" var="c">
				<li><a href="<%=request.getContextPath()%>/${c.menuUrl}"><span>${c.menuName}</span></a></li>
			</c:forEach>
		</ul>
	</div>
	<!--sidebar-menu-->
