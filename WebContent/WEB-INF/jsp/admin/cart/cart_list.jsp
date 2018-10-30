

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
					<h5>购物车</h5>
				</div>		
				<form action ="CartxServlet.do?method=list" method="post" class="form-horizontal">
					<div class="controls">
						<span>产品SKUCode：</span>
						<select name="productSkuId" class="span11"  style="width:150px">
						<option></option>
						<c:forEach items="${arr1}" var="arr">
						<option value="${arr.productSkuId}">${arr.productSkuCode}</option>
						</c:forEach>
						</select>	
							<span>用户名：</span>
						<select name="userId" class="span11"  style="width:150px">
						<option></option>
						<c:forEach items="${arr1}" var="arr">
						<option value="${arr.userId}">${arr.name}</option>
						</c:forEach>
						</select>	

	
					<span>购物数量</span>	
					<input type= "text" name = "quantity" value="${cart.quantity}" style="width:150px"/>
					<span>选中状态</span>
					<select name="statCheck" class="span11"  style="width:150px">
						<option></option>
						<c:forEach items="${listDictionarySKU}" var="arr">
						<option value="${arr.dictionaryDetailCode}">${arr.dictionaryDetaiLabel}</option>
						</c:forEach>
					</select>	
					<%-- <input type= "text" name = "statCheck" value="${cart.statCheck}" style="width:150px"/> --%>
					<span>删除状态</span>
					<select name="statDelete" class="span11"  style="width:150px">
						<option></option>
						<c:forEach items="${listDictionarySKU2}" var="arr">
						<option value="${arr.dictionaryDetailCode}">${arr.dictionaryDetaiLabel}</option>
						</c:forEach>
					</select>	
					<%-- <input type= "text" name = "statDelete" value="${cart.statDelete}" style="width:150px"/> --%>
					<input type = "submit" value="查询">
						</div>
				</form>
				<hr>
				<a href="CartxServlet.do?method=edit"><button
						class="btn btn-success btn-mini">新增</button></a>
				<hr>
				<div class="widget-content"
					style="position: relative; height: 800px; overflow-y: auto;">
					<table class="table table-bordered table-striped with-check">
						<thead>
							<tr>
								<th><input type="checkbox" id="title-table-checkbox"
									name="title-table-checkbox" /></th>
								<th>购物车code</th>
								<th>产品SKUCode</th>
								<th>名字</th>
								<th>购物数量</th>
								<th>选中状态</th>
								<th>删除状态</th>

							
								<th>操作</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${arr1}" var="cart">
								<tr>
									<td><input type="checkbox" /></td>
									<td>${cart.cartCode}</td>
									<td>${cart.productSkuCode}</td>
									<td>${cart.name}</td>
									<td>${cart.quantity}</td>
									<td>${cart.dictionaryDetailCheckLable}</td>
									<td>${cart.dictionaryDetailDeleteLable}</td>

									<td>
										<a href="CartxServlet.do?method=edit&cartId=${cart.cartId}">编辑</a>
										<a href="CartxServlet.do?method=delete&cartId=${cart.cartId}">删除</a></td>
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




