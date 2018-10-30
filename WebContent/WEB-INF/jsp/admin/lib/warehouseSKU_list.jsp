

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<title>后台管理-入库SKU页面</title>
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
					<h5>入库sku</h5>
				</div>
			
				<form action ="WarehouseSKUServlet.do?method=list" method="post" class="form-horizontal">
					<div class="controls">	
					
						<span>产品SkuCode：</span>
						<select name="productSkuId" class="span11"  style="width:150px">
						<c:forEach items="${arr1}" var="arr">
						<option value="${arr.productSkuId}">${arr.productSKUCode}</option>
						</c:forEach>
						</select>	
						<span>入库Code：</span>
						<select name="warehouseId" class="span11"  style="width:150px">
						<c:forEach items="${arr1}" var="arr">
						<option value="${arr.warehouseId}">${arr.warehouseCode}</option>
						</c:forEach>
						</select>	
						<span>个件单价</span>
						<input type= "text" name = "unitPrice" value="${warehouseSKU.unitPrice}" style="width:150px"/>
						<span>数量</span>
						<input type= "text" name = "quantity" value="${warehouseSKU.quantity}" style="width:150px"/>
						<span>总价</span>
						<input type= "text" name = "totalPrice" value="${warehouseSKU.totalPrice}" style="width:150px"/>
						<span>备注</span>
						<input type= "text" name = "remark" value="${warehouseSKU.remark}" style="width:150px"/>
						<input type = "submit" value="查询">
						</div>
				</form>
				<hr>
				<a href="WarehouseSKUServlet.do?method=edit"><button
						class="btn btn-success btn-mini">新增</button></a>
				<hr>
				<div class="widget-content"
					style="position: relative; height: 800px; overflow-y: auto;">
					<table class="table table-bordered table-striped with-check">
						<thead>
							<tr>
								<th><input type="checkbox" id="title-table-checkbox"
									name="title-table-checkbox" /></th>
								<th>入库明细code</th>
								<th>产品SKUCode</th>
								<th>入库code</th>
								<th>个件单价</th>
								<th>数量</th>
								<th>总价</th>
								<th>备注</th>
								<th>操作</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${arr1 }" var="warehouseSKU">
								<tr>
									<td><input type="checkbox" /></td>

										<td>${warehouseSKU.warehouseDtlCode}</td>
										<td>${warehouseSKU.productSKUCode}</td>
										<td>${warehouseSKU.warehouseCode}</td>
										<td>${warehouseSKU.unitPrice}</td>
										<td>${warehouseSKU.quantity}</td>
										<td>${warehouseSKU.totalPrice}</td>
										<td>${warehouseSKU.remark}</td>

										
									<td><a href="WarehouseSKUServlet.do?method=edit&warehouseDtlId=${warehouseSKU.warehouseDtlId}">编辑</a>
										<a href="WarehouseSKUServlet.do?method=delete&warehouseDtlId=${warehouseSKU.warehouseDtlId}">删除</a></td>
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




