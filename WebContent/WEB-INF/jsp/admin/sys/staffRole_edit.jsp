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
			<div class="row-fluid">
				<form action="StaffRoleServlet.do" method="get"
					class="form-horizontal">
					<div class="span12">
						<div class="widget-box">
							<div class="widget-title">
								<span class="icon"> <i class="icon-align-justify"></i>
								</span>
								<h5>编辑</h5>
							</div>
							<div class="widget-content nopadding">
								<input type="hidden" name="method" value="save" /> <input
									type="hidden" name="staffRoleId"
									value="${staffRole.staffRoleId}" />
								<div class="control-group">
									<label class="control-label"> <span
										style="position: absolute; left: 123px;">员工名：</span> <select
										name="staffId" class="span11" style="margin-left: 200px">
											<option value="0">空</option>
											<c:forEach items="${listStaff }" var="Staff">
												<option
													<c:if test='${staffId == Staff.staffId}'>selected="selected"</c:if>
													value="${Staff.staffId}">${Staff.staffName}</option>
											</c:forEach>
									</select>

									</label>
								</div>
								<div class="control-group">
									<label class="control-label"> <span
										style="position: absolute; left: 123px;">角色名：</span> <select
										name="roleId" class="span11" style="margin-left: 200px" name="roleId">
											<option value="0">空</option>
											<c:forEach items="${listRole }" var="Role">
												<option
													<c:if test='${roleId == Role.roleId}'>selected="selected"</c:if>
													value="${Role.roleId}">${Role.roleName}</option>
											</c:forEach>
									</select>

									</label>
								</div>
								<div class="form-actions">
										<button type="submit" class="btn btn-success">保存</button>
										<a href="StaffRoleServlet.do?method=list">取消</a>
								</div>
							</div>
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>

</html>