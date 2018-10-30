

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
				<form action="CartxServlet.do" method="get"
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
									type="hidden" name="cartId" value="${cart.cartId}" />
									<div class="control-group">
									<label class="control-label">购物车Code</label>
									<div class="controls">
										<input type="text" name="cartCode"
										 value="${cart.cartCode}"class="span11">
									</div>
								</div>
							<%-- 	<div class="control-group">
									<label class="control-label">产品SKUId</label>
									<div class="controls">
									<input type="text" name="productSkuId"
											value="${cart.productSkuId}"  class="span11">
									</div>
								</div>	 --%>		
									<div class="control-group">
									<label class="control-label">产品SKUCode</label>
									<div class="controls">
										<select name="productSkuId" class="span11">
										<c:forEach items="${listProductSKU}" var="productSKU">
										<option <c:if test='${productSkuId == productSKU.productSkuId}'>selected="selected"</c:if> value="${productSKU.productSkuId}">${productSKU.skuCode}</option>
										</c:forEach>
									</select>	
									</div>
								</div>	
								<%-- <div class="control-group">
									<label class="control-label">账号id</label>
									<div class="controls">
										<input type="text" name="userId"
											value="${cart.userId}" class="span11">
									</div>
								</div> --%>
									<div class="control-group">
									<label class="control-label">名字</label>
									
									<div class="controls">
										<select name="userId" class="span11">
										<c:forEach items="${listUserInfo}" var="userInfo">
										<option <c:if test='${userId == userInfo.userId}'>selected="selected"</c:if> value="${userInfo.userId}">${userInfo.name}</option>
										</c:forEach>
									</select>	
									</div>
								</div>	
								<div class="control-group">
									<label class="control-label">购物数量</label>
									<div class="controls">
										<input type="text" name="quantity"
										 value="${cart.quantity}"class="span11">
									</div>
								</div>
								<div class="control-group">
									<label class="control-label">选中状态</label>
									<div class="controls">
									<select name="statCheck" class="span11">
										<c:forEach items="${listDictionarySKU}" var="arr">
										<option <c:if test='${statCheck == arr.dictionaryDetailCode}'>selected="selected"</c:if> value="${arr.dictionaryDetailCode}">${arr.dictionaryDetaiLabel}</option>
										</c:forEach>
									</select>
									</div>
								</div>
								<div class="control-group">
									<label class="control-label">删除状态</label>
									<div class="controls">
									<select name="statDelete" class="span11" >
										<c:forEach items="${listDictionarySKU2}" var="arr">
										<option <c:if test='${statDelete == arr.dictionaryDetailCode}'>selected="selected"</c:if> value="${arr.dictionaryDetailCode}">${arr.dictionaryDetaiLabel}</option>
										</c:forEach>
									</select>	
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



