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
	href="<%=request.getContextPath()%>/resource/admin/font-awesome/css/font-awesome.css" />
</head>
<body>
<%@ include file="/WEB-INF/jsp/admin/sidebar.jsp" %>
	<div id="content">
		<div class="container-fluid">
		<div class="row-fluid">
			<div class="widget-box">
				<div class="widget-title">
					<span class="icon"> <i class="icon-th"></i>
					</span>
					<h5>订单</h5>
				</div>
				<form action ="AdminOrderServlet.do?method=list" method="post" class="form-horizontal">
					<div class="controls">
						
						<span>用户名：</span>
						<select name="userId" class="span11"  style="width:150px">
						
						<c:forEach items="${arr1}" var="arr">
						<option value="${arr.userId}">${arr.name}</option>
						</c:forEach>
						</select>	
						<span>地址：</span>
						<select name="userId" class="span11"  style="width:150px">
						<c:forEach items="${arr1}" var="arr">
						<option value="${arr.addressId}">${arr.addressCont}</option>
						</c:forEach>
						</select>			
						<span>创建时间：</span>
						<input type= "text" name = "createDate" value="" style="width:150px"/>
						<span>总价格：</span>
						<input type= "text" name = "totalPrice" value="" style="width:150px"/>
						
						<span>付款状态：</span>
						<select name="payStat" class="span11"  style="width:150px">
						<c:forEach items="${listDictionarySKU}" var="listDictionarySKU">
									<option value="${listDictionarySKU.dictionaryDetailCode}">${listDictionarySKU.dictionaryDetaiLabel}</option>
								</c:forEach>
						</select>	
						
						<span>付款状态：</span>
						<input type= "text" name = "payStat" value="" style="width:150px"/>
						<span>付款日期：</span>
						<input type= "text" name = "payDate" value="" style="width:150px"/>
						<input type = "submit" class="btn btn-success" value="查询">
						</div>
				</form>
				<hr>
				<a href="AdminOrderServlet.do?method=edit"><button
						class="btn btn-success btn-mini">新增</button></a>
				<hr>
				<div class="widget-content"
					style="position: relative; height: 800px; overflow-y: auto;">
					<table class="table table-bordered table-striped with-check">
						<thead>
							<tr>
								<th><input type="checkbox" id="title-table-checkbox"
									name="title-table-checkbox" /></th>
								<th>订单code</th>
								<th>用户名</th>
								<th>地址</th>
								<th>创建时间</th>
								<th>总价格</th>
								<th>付款状态</th>
								<th>付款日期</th>
								<th>操作</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${arr1 }" var="order">
								<tr>
									<td><input type="checkbox" /></td>
									<td>${order.orderCode}</td>
									<td>${order.name}</td>
									<td>${order.addressCont}</td>
									<td>${order.createDate}</td>
									<td>${order.totalPrice}</td>
									<td>${order.dictionaryDetaiLabel}</td>
									<td>${order.payDate}</td>
								
									
									<td>
										<a href="AdminOrderServlet.do?method=edit&orderId=${order.orderId}">编辑</a>
										<a href="AdminOrderServlet.do?method=delete&orderId=${order.orderId}">删除</a></td>
								</tr>
								
		
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
			</div>
		</div>
	</div>
</body>

</html>




