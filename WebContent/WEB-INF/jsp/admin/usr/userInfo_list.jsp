<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<title>后台管理</title>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resource/admin/css/bootstrap.min.css" />
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resource/admin/css/bootstrap-responsive.min.css" />
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resource/admin/css/uniform.css" />
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resource/admin/css/select2.css" />
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resource/admin/css/matrix-style.css" />
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resource/admin/css/matrix-media.css" />
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resource/admin/css/colorpicker.css" />
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resource/admin/css/datepicker.css" />
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resource/admin/css/bootstrap-wysihtml5.css" />
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resource/admin/css/fonts-googleapis.css" />
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resource/admin/css/fullcalendar.css" />
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resource/admin/css/fullcalendar.css" />
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resource/admin/font-awesome/css/font-awesome.css" />
</head>
<body>
<%@ include file="/WEB-INF/jsp/admin/sidebar.jsp" %>
	<div id="content">
		<div class="container-fluid">
			<hr>
			<div class="widget-box">
				<div class="widget-title">
					<span class="icon"> <i class="icon-th"></i>
					</span>
					<h5>用户信息</h5>
					<span class="label label-info">iwonder</span>
				</div>
				<form class="form-horizontal" method="post" action="UserInfoServlet.do"
					id="basic_validate" novalidate="novalidate">
					<input type="hidden" name="method" value="list" />
					<div class="controls">
						<span>姓名：</span> <input type="text" name="name" value="${userInfoConditionView.name}" id="required">
						<span>昵称：</span> <input type="text" name="nickName" value="${userInfoConditionView.nickName}" id="email">
						<span>性别：</span><input type="text" name="gender" value="${userInfoConditionView.gender}" id="date">
						<span>身份证：</span> <input type="text" name="idCard" value="${userInfoConditionView.idCard}" id="date">
					</div>
					<div class="controls">
						<span>手机：</span> <input type="text" name="mobile" value="${userInfoConditionView.mobile}" id="required">
						<span>邮箱：</span> <input type="text" name="email" value="${userInfoConditionView.email}" id="email">
						<span>余额：</span> <input type="text" name="balance" value="${userInfoConditionView.balance}" id="date">
						<span>生日：</span> <input type="text" name="timePrevious" value="${timePrevious}" style="width: 100px" /> -<input
							type="text" name="timeLater" value="${timeLater}"
							style="width: 100px" /> 						
						<input type="submit" value="查询" class="btn btn-success">
					</div>
					<hr>
				</form>
				<a href="UserInfoServlet.do?method=edit">新增</a>
				<div class="widget-content"
					style="position: relative; height: 800px; overflow-y: auto;">
					<table class="table table-bordered table-striped with-check">
						<thead>
							<tr>
								<th><input type="checkbox" id="title-table-checkbox"
									name="title-table-checkbox" /></th>
								<!-- <th>用户ID</th> -->
								<th>用户code</th>
								<th>姓名</th>
								<th>昵称</th>
								<th>性别</th>
								<th>生日</th>
								<th>身份证</th>
								<th>手机号码</th>
								<th>邮箱</th>
								<th>登入密码</th>
								<th>余额</th>
								<th>操作</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${listUserInfo }" var="user">
								<tr>
									<td><input type="checkbox" /></td>
									<%-- <td>${user.userId }</td> --%>
									<td>${user.userCode }</td>
									<td>${user.name }</td>
									<td>${user.nickName }</td>
									<td>${user.gender }</td>
									<td>${user.birthday }</td>
									<td>${user.idCard }</td>
									<td>${user.mobile }</td>
									<td>${user.email }</td>
									<td>${user.pwdLogin }</td>
									<td>${user.balance }</td>
									<td><a
										href="UserInfoServlet.do?method=edit&userId=${user.userId }">编辑</a>
										<a
										href="UserInfoServlet.do?method=delete&userId=${user.userId }">删除</a></td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>
</body>
</html>