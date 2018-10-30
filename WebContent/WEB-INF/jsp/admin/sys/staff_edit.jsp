<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
				<form action="StaffServlet.do" method="get"
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
									type="hidden" name="staffId" value="${staff.staffId}" />
								<div class="control-group">
									<label class="control-label">员工编号：</label>
									<div class="controls">
										<input type="text" name="staffCode"
											value="${staff.staffCode}" class="span11">
									</div>
								</div>
								<div class="control-group">
									<label class="control-label">员工姓名：</label>
									<div class="controls">
										<input type="text" name="staffName" value="${staff.staffName}"
											class="span11">
									</div>
								</div>
								<div class="control-group">
									<label class="control-label">员工性别：</label>
									<div class="controls">
										<input type="text" class="span11" name="staffGender"
											value="${staff.staffGender}" />
									</div>
								</div>
								<div class="control-group">
									<label class="control-label">员工生日：</label>
									<div class="controls">
										<input type="text" class="span11" name="staffBirthday"
											value="${staff.staffBirthday}" /> 
									</div>
								</div>
								<div class="control-group">
									<label class="control-label">员工手机：</label>
									<div class="controls">
										<input class="span11" name="staffMoblie"
											value="${staff.staffMoblie}">
									</div>
								</div>
								<div class="control-group">
									<label class="control-label">员工住址：</label>
									<div class="controls">
										<input type="text" class="span11" name="staffAddress"
											value="${staff.staffAddress}" />
									</div>
								</div>
								<div class="control-group">
									<label class="control-label">员工在职状态：</label>
									<div class="controls">
										<input type="text" class="span11" name="staffStatus"
											value="${staff.staffStatus}" />
									</div>
								</div>
								<div class="control-group">
									<label class="control-label">登入密码：</label>
									<div class="controls">
										<input type="text" class="span11" name="pwdLogin"
											value="${staff.pwdLogin}" />
									</div>
								</div>
								<div class="control-group">
									<label class="control-label">员工简介：</label>
									<div class="controls">
										<input type="text" class="span11" name="staffInfo"
											value="${staff.staffInfo}" />
									</div>
								</div>
								<div class="form-actions">
									<button type="submit" class="btn btn-success">保存</button>
									<a href="StaffServlet.do?method=list">取消</a>
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