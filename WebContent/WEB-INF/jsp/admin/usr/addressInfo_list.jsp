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
					<h5>地址信息</h5>
					<span class="label label-info">iwonder</span>
				</div>

				<form class="form-horizontal" method="post"
					action="AddressInfoServlet.do" id="basic_validate"
					novalidate="novalidate">
					<input type="hidden" name="method" value="list" />
					<div class="controls">
						<span>用户名：</span> <select name="userId">
						<option value="0">空</option>
							<c:forEach items="${listUserInfo }" var="UserInfo">
								<option
									<c:if test='${userId == UserInfo.userId}'>selected="selected"</c:if>
									value="${UserInfo.userId}">${UserInfo.name}</option>
							</c:forEach>
						</select>

						<%-- <input type="text" name="userId" value="${userId}" id="required"> --%>
						<span>地址名：</span> <input type="text" name="addressCont"
							value="${addressInfoConditionView.addressCont}" id="email">
						<span>默认值：</span> <input type="text" name="addressDefault"
							value="${addressInfoConditionView.addressDefault}" id="date">
						<span>收件人姓名：</span> <input type="text" name="receiverName"
							value="${addressInfoConditionView.receiverName}" id="date">
					</div>
					<div class="controls">
						<span>收件人号码：</span> <input type="text" name="receiverPhone"
							value="${addressInfoConditionView.receiverPhone}" id="required">
						<input type="submit" value="查询" class="btn btn-success">
					</div>
					<hr>
				</form>

				<a href="AddressInfoServlet.do?method=edit">新增</a>
				<div class="widget-content"
					style="position: relative; height: 800px; overflow-y: auto;">
					<table class="table table-bordered table-striped with-check">
						<thead>
							<tr>
								<th><input type="checkbox" id="title-table-checkbox"
									name="title-table-checkbox" /></th>
								<!-- <th>地址ID</th> -->
								<th>用户名</th>
								<th>地址名</th>
								<th>默认值</th>
								<th>收件人姓名</th>
								<th>收件人号码</th>
								<th>操作</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${listAddressInfo }" var="addressInfo">
								<tr>
									<td><input type="checkbox" /></td>
									<%-- <td>${addressInfo.addressId }</td> --%>
									<td>${addressInfo.name }</td>
									<td>${addressInfo.addressCont }</td>
									<td>${addressInfo.addressDefault }</td>
									<td>${addressInfo.receiverName }</td>
									<td>${addressInfo.receiverPhone }</td>
									<td><a
										href="AddressInfoServlet.do?method=edit&addressId=${addressInfo.addressId }">编辑</a>
										<a
										href="AddressInfoServlet.do?method=delete&addressId=${addressInfo.addressId }">删除</a></td>
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