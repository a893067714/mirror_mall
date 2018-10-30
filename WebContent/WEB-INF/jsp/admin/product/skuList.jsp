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
			<div class="widget-box">
				<div class="widget-title">
					<span class="icon"> <i class="icon-th"></i>
					</span>
					<h5>产品sku表</h5>
					<span class="label label-info">iwonder</span>
				</div>
				<form class="form-horizontal" method="get"
					action="ProductSkuServlet.do?method=list">
					<div class="controls">
						<span>产品名称：</span> <select style="width: 250px" name="productId">
							<option value="0">-</option>
							<c:forEach items="${listProduct }" var="product">
								<option
									<c:if test='${skucv.productId == product.productId}'>selected="selected"</c:if>
									value="${product.productId}">${product.name}</option>
							</c:forEach>
						</select> <span>颜色：</span> <select style="width: 250px" name="colorId">
							<option value="0">-</option>
							<c:forEach items="${listColor }" var="color">
								<option
									<c:if test='${skucv.colorId == color.colorId}'>selected="selected"</c:if>
									value="${color.colorId}">${color.colorValue}</option>
							</c:forEach>
						</select> <span>尺码：</span> <select style="width: 250px" name="sizeId">
							<option value="0">-</option>
							<c:forEach items="${listSize }" var="size">
								<option
									<c:if test='${skucv.sizeId == size.sizeId}'>selected="selected"</c:if>
									value="${size.sizeId}">${size.sizeValue}</option>
							</c:forEach>
						</select> <input type="submit" value="查询" class="btn btn-success">
					</div>
					<hr>
				</form>
				<a href="ProductSkuServlet.do?method=edit"><button
						class="btn btn-success btn-mini">新增</button></a>
				<div class="widget-content"
					style="position: relative; height: 800px; overflow-y: auto;">
					<table class="table table-bordered table-striped with-check">
						<thead>
							<tr>
								<th>\</th>
								<th>产品编号</th>
								<th>产品名</th>
								<th>颜色</th>
								<th>尺码</th>
								<th>原价</th>
								<th>现价</th>
								<th>库存</th>
								<th>sku图</th>
								<th>产地</th>
								<th>操作</th>
							</tr>
						</thead>
						<tbody>
							<%
								int i = 0;
							%>
							<c:forEach items="${listSku }" var="productSku">
								<tr>
									<td><%=++i%></td>
									<td style="text-align:center;width:150px">${productSku.skuCode }</td><!-- <p style="width:300px; white-space:nowrap; text-overflow:ellipsis; overflow:hidden;"></p> -->
									<td style="text-align:center;width:300px">${productSku.productName }</td>
									<td style="text-align:center;">${productSku.colorValue }</td>
									<td style="text-align:center;">${productSku.sizeValue }</td>
									<td style="text-align:center;">${productSku.priceOrigin }</td>
									<td style="text-align:center;">${productSku.priceCurrent }</td>
									<td style="text-align:center;">${productSku.stock }</td>
									<td style="text-align:center;"><img src="<%=request.getContextPath()%>/resource/${productSku.picMid }" style="width:40px"/></td>
									<td style="text-align:center;">${productSku.origin }</td>
									<td style="text-align:center;"><a
										href="ProductSkuServlet.do?method=edit&productSkuId=${productSku.productSkuId }">编辑</a>
										<a
										href="ProductSkuServlet.do?method=delete&productSkuId=${productSku.productSkuId }">删除</a></td>
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