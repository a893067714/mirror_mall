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
					<h5>员工</h5>
					<span class="label label-info">iwonder</span>
				</div>
				
				<form class="form-horizontal" method="post" action="StaffServlet.do"
					id="basic_validate" novalidate="novalidate">
					<input type="hidden" name="method" value="list" />
					<div class="controls">
						<span>员工姓名：</span> <input type="text" name="staffName" value="${staffConditionView.staffName}" id="required">
						<span>性别：</span> <input type="text" name="staffGender" value="${staffConditionView.staffGender}" id="email">
						<span>生日大于：</span> <input type="text" name="staffBirthday" value="${staffBirthday}" id="date">
						<span>在职状态：</span> <input type="text" name="staffStatus" value="${staffConditionView.staffStatus}" id="date">
					</div>
					<div class="controls">
						<input type="submit" value="查询" class="btn btn-success">
					</div>
					<hr>
				</form>
				
				<a href="StaffServlet.do?method=edit">新增</a>
				<div class="widget-content"
					style="position: relative; height: 800px; overflow-y: auto;">
					<table class="table table-bordered table-striped with-check">
						<thead>
							<tr>
								<th><input type="checkbox" id="title-table-checkbox"
									name="title-table-checkbox" /></th>
								<!-- <th>员工ID</th> -->
								<th>员工编号</th>
								<th>员工姓名</th>
								<th>员工性别</th>
								<th>员工生日</th>
								<th>员工手机</th>
								<th>员工住址</th>
								<th>员工在职状态</th>
								<th>登录密码</th>
								<th>员工简介</th>
								<th>操作</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${listStaff }" var="staff">
								<tr>
									<td><input type="checkbox" /></td>
									<%-- <td>${staff.staffId }</td> --%>
									<td>${staff.staffCode }</td>
									<td>${staff.staffName }</td>
									<td>${staff.staffGender }</td>
									<td>${staff.staffBirthday }</td>
									<td>${staff.staffMoblie }</td>
									<td>${staff.staffAddress }</td>
									<td>${staff.staffStatus }</td>
									<td>${staff.pwdLogin }</td>
									<td>${staff.staffInfo }</td>
									<td><a
										href="StaffServlet.do?method=edit&staffId=${staff.staffId }">编辑</a>
										<a
										href="StaffServlet.do?method=delete&staffId=${staff.staffId }">删除</a></td>
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