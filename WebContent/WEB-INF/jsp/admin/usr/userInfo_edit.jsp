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
				<form action="UserInfoServlet.do" method="post"
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
									type="hidden" name="userId" value="${userInfo.userId}" />
								<div class="control-group">
									<label class="control-label">用户Code：</label>
									<div class="controls">
										<input type="text" name="userCode" value="${userInfo.userCode}"
											class="span11">
									</div>
								</div>
								<div class="control-group">
									<label class="control-label">用户名：</label>
									<div class="controls">
										<input type="text" name="userName" value="${userInfo.name}"
											class="span11">
									</div>
								</div>
								<div class="control-group">
									<label class="control-label">昵称：</label>
									<div class="controls">
										<input type="text" name="userNickName"
											value="${userInfo.nickName}" class="span11">
									</div>
								</div>
								<div class="control-group">
									<label class="control-label">性别：</label>
									<div class="controls">
										<%-- <input type="text" class="span11" name="userGender"
											value="${userInfo.gender}" /> --%>

										
											<input type="text" class="span11" name="userGender"
											value="${userInfo.gender}" />
										<%-- <select name="userGender">
											<option value="男" <c:if test='${gender == userInfo.gender}'>selected="selected"</c:if>>男</option>
											<option value="女" <c:if test='${gender == userInfo.gender}'>selected="selected"</c:if>>女</option>
										</select> --%>
									</div>
								</div>
								<div class="control-group">
									<label class="control-label">生日：</label>
									<div class="controls">
										<input type="text" class="datepicker span11"
											data-date-format="yyyy-mm-dd" data-date="1996-02-19"
											name="userBirthday" value="${userInfo.birthday}" />
									</div>
								</div>
								<div class="control-group">
									<label class="control-label">身份证：</label>
									<div class="controls">
										<input class="span11" name="userIdCard"
											value="${userInfo.idCard}">
										</textarea>
									</div>
								</div>
								<div class="control-group">
									<label class="control-label">手机号：</label>
									<div class="controls">
										<input type="text" class="span11" name="userMobile"
											value="${userInfo.mobile}" />
									</div>
								</div>
								<div class="control-group">
									<label class="control-label">邮箱：</label>
									<div class="controls">
										<input type="text" class="span11" name="userEmail"
											value="${userInfo.email}" />
									</div>
								</div>
								<div class="control-group">
									<label class="control-label">登入密码：</label>
									<div class="controls">
										<input type="text" class="span11" name="userPwdLogin"
											value="${userInfo.pwdLogin}" />
									</div>
								</div>
								<div class="control-group">
									<label class="control-label">余额：</label>
									<div class="controls">
										<input type="text" class="span11" name="userBalance"
											value="${userInfo.balance}" />
									</div>
								</div>
								<div class="form-actions">
									<button type="submit" class="btn btn-success">保存</button>
									<a href="UserInfoServlet.do?method=list">取消</a>
								</div>
							</div>
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>
	<!--end-Footer-part-->
	<%-- <script
		src="<%=request.getContextPath()%>/resource/admin/js/jquery.min.js"></script>
	<script
		src="<%=request.getContextPath()%>/resource/admin/js/jquery.ui.custom.js"></script>
	<script
		src="<%=request.getContextPath()%>/resource/admin/js/bootstrap.min.js"></script>
	<script
		src="<%=request.getContextPath()%>/resource/admin/js/bootstrap-colorpicker.js"></script>
	<script
		src="<%=request.getContextPath()%>/resource/admin/js/bootstrap-datepicker.js"></script>
	<script
		src="<%=request.getContextPath()%>/resource/admin/js/jquery.toggle.buttons.html"></script>
	<script src="<%=request.getContextPath()%>/resource/admin/js/masked.js"></script>
	<script
		src="<%=request.getContextPath()%>/resource/admin/js/jquery.uniform.js"></script>
	<script
		src="<%=request.getContextPath()%>/resource/admin/js/select2.min.js"></script>
	<script src="<%=request.getContextPath()%>/resource/admin/js/matrix.js"></script>
	<script
		src="<%=request.getContextPath()%>/resource/admin/js/matrix.form_common.js"></script>
	<script
		src="<%=request.getContextPath()%>/resource/admin/js/wysihtml5-0.3.0.js"></script>
	<script
		src="<%=request.getContextPath()%>/resource/admin/js/jquery.peity.min.js"></script>
	<script
		src="<%=request.getContextPath()%>/resource/admin/js/bootstrap-wysihtml5.js"></script>
	<script>
		$('.textarea_editor').wysihtml5();
	</script> --%>
</body>

</html>