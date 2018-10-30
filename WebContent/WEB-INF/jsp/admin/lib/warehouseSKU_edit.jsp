
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<title>后台管理-入库SKU页面-编辑</title>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resource/admin/css/bootstrap.min.css" />
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resource/admin/css/bootstrap-responsive.min.css" />
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resource/admin/css/colorpicker.css" />
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resource/admin/css/datepicker.css" />
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resource/admin/css/uniform.css" />
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resource/admin/css/select2.css" />
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resource/admin/css/matrix-style.css" />
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resource/admin/css/matrix-media.css" />
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resource/admin/css/bootstrap-wysihtml5.css" />
<link
	href="<%=request.getContextPath()%>/resource/admin/font-awesome/css/font-awesome.css"
	rel="stylesheet" />
</head>

<body>
<%@ include file="/WEB-INF/jsp/admin/sidebar.jsp" %>
	<div id="content">
		<div class="container-fluid">
			<hr>
			<div class="row-fluid">
				<form action="WarehouseSKUServlet.do" method="get"
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
									type="hidden" name="warehouseDtlId" value="${warehouseSKU.warehouseDtlId}" />
								<div class="control-group">
									<label class="control-label">入库SKUCode</label>
									<div class="controls">
										<input type="text" name="warehouseDtlCode"
											value="${warehouseSKU.warehouseDtlCode}" class="span11">
									</div>
								</div>
							<%-- 	<div class="control-group">
									<label class="control-label">产品SKUId</label>
									<div class="controls">
										<input type="text" name="productSkuId"
											value="${warehouseSKU.productSkuId}"  class="span11">
									</div>
								</div>	 --%>		
								<div class="control-group">
									<label class="control-label">产品SKUCode</label>
									
									<div class="controls">
										<select name="productSkuId" class="span11">
										<c:forEach items="${listProductSKU}" var="productSKU">
										
										<option <c:if test='${productSkuId == productSKU.productSkuId}'>selected="selected"</c:if>	 value="${productSKU.productSkuId}">
										
										${productSKU.skuCode}</option>
										</c:forEach>
									</select>		
									</div>
								</div>	
							
								
								<div class="control-group">
									<label class="control-label">入库Code</label>
									
									<div class="controls">
										<select name="warehouseId" class="span11">
										<c:forEach items="${listWarehouse}" var="warehouse">
										<option <c:if test='${warehouseId == warehouse.warehouseId}'>selected="selected"</c:if> value="${warehouse.warehouseId}">${warehouse.warehouseCode}</option>
										</c:forEach>
									</select>	
									</div>
								</div>	
								
								
								
								<div class="control-group">
									<label class="control-label">个件单价</label>
									<div class="controls">
										<input type="text" name="unitPrice"
										 value="${warehouseSKU.unitPrice}"class="span11">
									</div>
								</div>
								<div class="control-group">
									<label class="control-label">数量</label>
									<div class="controls">
										<input type="text" class="span11" name="quantity"
											value="${warehouseSKU.quantity}" />
									</div>
								</div>
								<div class="control-group">
									<label class="control-label">总价</label>
									<div class="controls">
										<input type="text" class="span11" name="totalPrice"
											value="${warehouseSKU.totalPrice}" />
									</div>
								</div>
									<div class="control-group">
									<label class="control-label">备注</label>
									<div class="controls">
										<input type="text" class="span11" name="remark"
											value="${warehouseSKU.remark}" />
									</div>
								</div>
								
								
								
								
								<div class="form-actions">
									<button type="submit" class="btn btn-success">保存</button>
									<a href="CartxServlet.do?method=list">取消</a>
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





