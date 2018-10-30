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
			<div class="row-fluid">
				<form action="ProductServlet.do" method="get"
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
									type="hidden" name="productId" value="${product.productId}" />
								<div class="control-group">
									<label class="control-label">产品名称：</label>
									<div class="controls">
										<input type="text" class="span11" name="name"
											style="width: 800px" value="${product.name}" />
									</div>
								</div>
								<div class="control-group">
									<label class="control-label">类型：</label>
									<div class="controls">
										<select style="width: 250px" name="typeDtlId">
											<c:forEach items="${listTypeDetail }" var="typeDetail">
												<option
													<c:if test="${product.typeDtlId == typeDetail.typeDtlId}">selected="selected"</c:if>
													value="${typeDetail.typeDtlId}">${typeDetail.typeDtlName}</option>
											</c:forEach>
										</select>
									</div>
								</div>
								<div class="control-group">
									<label class="control-label">品牌：</label>
									<div class="controls">
										<select style="width: 250px" name="brandId">
											<c:forEach items="${listBrand }" var="brand">
												<option
													<c:if test="${product.brandId == brand.brandId}">selected="selected"</c:if>
													value="${brand.brandId}">${brand.name}</option>
											</c:forEach>
										</select>
									</div>
								</div>
								<div class="control-group">
									<label class="control-label">生日：</label>
									<div class="controls">
										<input type="date" name="timeToMarket" value="${product.timeToMarket}"/>
									</div>
								</div>
								<div class="control-group">
									<label class="control-label">介绍：</label>
									<div class="controls">
										<input class="span11" name="introduce"
											value="${product.introduce}">
									</div>
								</div>
								<div class="control-group">
									<label class="control-label">上架状态：</label>
									<div class="controls">
										<select name="shelfStat">
											<c:forEach items="${listDictionarySku }" var="dictionarySku">
												<option <c:if test="${product.shelfStat == dictionarySku.dictionaryDetailCode}">selected="selected"</c:if>
													value="${dictionarySku.dictionaryDetailCode}">${dictionarySku.dictionaryDetaiLabel}</option>
											</c:forEach>
									</div>
									</select>
								</div>
								<div class="control-group">
									<label class="control-label">好评数：</label>
									<div class="controls">
										<input type="text" class="span11" name="evalGoodQty"
											style="width: 300px" value="${product.evalGoodQty}" />
									</div>
								</div>
								<div class="control-group">
									<label class="control-label">中评数：</label>
									<div class="controls">
										<input type="text" class="span11" name="evalGeneralQty"
											style="width: 300px" value="${product.evalGeneralQty}" />
									</div>
								</div>
								<div class="control-group">
									<label class="control-label">差评数：</label>
									<div class="controls">
										<input type="text" class="span11" name="evalBadQty"
											style="width: 300px" value="${product.evalBadQty}" />
									</div>
								</div>
								<div class="control-group">
									<label class="control-label">销售数量：</label>
									<div class="controls">
										<input type="text" class="span11" name="saleQty"
											style="width: 300px" value="${product.saleQty}" />
									</div>
								</div>
								<div class="control-group">
									<label class="control-label">主SKU设置：</label>
									<div class="controls">
										<select style="width: 250px" name="skuCode">
											<c:forEach items="${productSku }" var="productSku">
												<option
													<c:if test="${product.majorSkuCode == productSku.skuCode}">selected="selected"</c:if>
													value="${productSku.skuCode}">${productSku.skuCode}/${productSku.colorValue}/${productSku.sizeValue}</option>
											</c:forEach>
										</select>
									</div>
								</div>
								<div class="control-group">
									<label class="control-label">图片地址：</label>
									<div class="controls">
										<input type="text" class="span11" name="picture"
											value="${product.picture}" />
									</div>
								</div>
								<div class="form-actions">
									<button type="submit" class="btn btn-success">保存</button>
									<a href="ProductServlet.do?method=list">取消</a>
								</div>
							</div>
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>
	<!--end-Footer-part-->
	<script
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
	</script>
</body>

</html>