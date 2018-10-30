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
	<%@ include file="/WEB-INF/jsp/admin/sidebar.jsp"%>
	<div id="content">
		<div class="container-fluid">
			<hr>
			<div class="row-fluid">
				<form action="AddressInfoServlet.do" method="post"
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
									type="hidden" name="addressId" value="${addressInfo.addressId}" />
								<%-- <div class="control-group">
									<label class="control-label">地址ID：</label>
									<div class="controls">
										<input type="text" name="addressId"
											value="${addressInfo.addressId}" disabled="" class="span11">
									</div>
								</div> --%>
								<div class="control-group">
									<label class="control-label"> <span
										style="position: absolute; left: 123px;">用户名：</span> <select
										name="userId" class="span11" style="margin-left: 200px;">
											<option value="0">空</option>
											<c:forEach items="${listUserInfo }" var="UserInfo">
												<option
													<c:if test='${userId == UserInfo.userId}'>selected="selected"</c:if>
													value="${UserInfo.userId}">${UserInfo.name}</option>
											</c:forEach>
									</select>

									</label>
									<%-- <div class="controls">
										<input type="text" name="userId"
											value="${addressInfo.userId}" class="span11">
									</div> --%>
								</div>
								<div class="control-group">
									<label class="control-label">地址内容：</label>
									<div class="controls">
										<input type="text" name="addressCont"
											value="${addressInfo.addressCont}" class="span11">
									</div>
								</div>
								<div class="control-group">
									<label class="control-label">默认值：</label>
									<div class="controls">
										<input type="text" class="span11" name="addressDefault"
											value="${addressInfo.addressDefault}" />
									</div>
								</div>
								<div class="control-group">
									<label class="control-label">收件人姓名：</label>
									<div class="controls">
										<input type="text" class="span11" name="receiverName"
											value="${addressInfo.receiverName}" />
									</div>
								</div>
								<div class="control-group">
									<label class="control-label">收件人号码：</label>
									<div class="controls">
										<input class="span11" name="receiverPhone"
											value="${addressInfo.receiverPhone}">
									</div>
								</div>
								<div class="form-actions">
									<button type="submit" class="btn btn-success">保存</button>
									<a href="AddressInfoServlet.do?method=list">取消</a>
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