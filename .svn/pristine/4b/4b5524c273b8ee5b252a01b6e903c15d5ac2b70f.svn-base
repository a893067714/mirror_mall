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
					<h5>员工角色</h5>
					<span class="label label-info">iwonder</span>
				</div>
				
				<form class="form-horizontal" method="post" action="StaffRoleServlet.do"
					id="basic_validate" novalidate="novalidate">
					<input type="hidden" name="method" value="list" />
					<div class="controls">
					
					
						<span>员工名：</span>
						<!-- <span style="position:absolute;left: 123px;">用户名：</span> -->
						<select name="staffId">
							<option value="0">空</option>
							<c:forEach items="${listStaff }" var="Staff">
								<option
									<c:if test='${staffId == Staff.staffId}'>selected="selected"</c:if>
									value="${Staff.staffId}">${Staff.staffName}</option>
							</c:forEach>
						</select>
						<%-- <input type="text" name="staffId" value="${staffRoleConditionView.staffId}" id="required"> --%>
						
						<span>角色名：</span> 
						<select name="roleId">
							<option value="0">空</option>
							<c:forEach items="${listRole }" var="Role">
								<option
									<c:if test='${roleId == Role.roleId}'>selected="selected"</c:if>
									value="${Role.roleId}">${Role.roleName}</option>
							</c:forEach>
						</select>
						<%-- <input type="text" name="roleId" value="${staffRoleConditionView.roleId}" id="email"> --%>
						<input type="submit" value="查询" class="btn btn-success">					</div>
					<hr>
				</form>
				
				<a href="StaffRoleServlet.do?method=edit">新增</a>
				<div class="widget-content"
					style="position: relative; height: 800px; overflow-y: auto;">
					<table class="table table-bordered table-striped with-check">
						<thead>
							<tr>
								<th><input type="checkbox" id="title-table-checkbox"
									name="title-table-checkbox" /></th>
								<!-- <th>员工角色ID</th> -->
								<th>员工名</th>
								<th>角色名</th>
								<th>操作</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${listStaffRole }" var="staffRole">
								<tr>
									<td><input type="checkbox" /></td>
									<%-- <td>${staffRole.staffRoleId }</td> --%>
									<td>${staffRole.staffName }</td>
									<td>${staffRole.roleName }</td>
									<td><a
										href="StaffRoleServlet.do?method=edit&staffRoleId=${staffRole.staffRoleId }">编辑</a>
										<a
										href="StaffRoleServlet.do?method=delete&staffRoleId=${staffRole.staffRoleId }">删除</a></td>
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