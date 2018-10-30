<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<title>Iwonder后台登录界面</title>
<meta charset="UTF-8" />
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resource/admin/css/bootstrap.min.css" />
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resource/admin/css/bootstrap-responsive.min.css" />
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resource/admin/css/matrix-login.css" />
<link
	href="<%=request.getContextPath()%>/resource/admin/font-awesome/css/font-awesome.css"
	rel="stylesheet" />
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resource/admin/css/fonts-googleapis.css" />
</head>
<body>
	<div id="loginbox">
		<form id="loginform" class="form-vertical" action="UserLogRegServlet.do?method=adminLogin" method="post">
			<div class="control-group normal_text">
				<h3>
					<img src="img/logo.png" alt="Logo" />
				</h3>
			</div>
			<div class="control-group">
			<p>${msg }</p>
				<div class="controls">
					<div class="main_input_box">
						<span class="add-on bg_lg"><i class="icon-user"></i></span><input
							type="text" name="staffName" placeholder="用户名" />
					</div>
				</div>
			</div>
			<div class="control-group">
				<div class="controls">
					<div class="main_input_box">
						<span class="add-on bg_ly"><i class="icon-lock"></i></span><input
							type="password" name="pwdLogin"placeholder="密码" />
					</div>
				</div>
			</div>
			<div class="form-actions">
				<span class="pull-left"><a href="#"
					class="flip-link btn btn-info" id="to-recover">忘记密码?</a></span> <span
					class="pull-right"><input type="submit" 
					class="btn btn-success" value="登录"  /> </span>
			</div>
		</form>
		<form id="recoverform" action="#" class="form-vertical">
			<p class="normal_text">请输入正确的用户名密码.</p>

			<div class="controls">
				<div class="main_input_box">
					<span class="add-on bg_lo"><i class="icon-envelope"></i></span><input
						type="text" placeholder="E-mail address" />
				</div>
			</div>

			<div class="form-actions">
				<span class="pull-left"><a href="#"
					class="flip-link btn btn-success" id="to-login">&laquo; 返回登录</a></span> <span
					class="pull-right"><a class="btn btn-info" />提交</a></span>
			</div>
		</form>
	</div>

	<script src="js/jquery.min.js"></script>
	<script src="js/matrix.login.js"></script>
</body>

</html>
