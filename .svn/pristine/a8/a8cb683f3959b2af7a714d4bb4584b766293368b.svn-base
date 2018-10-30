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
			<div class="row-fluid">
				<form action="ProductSkuServlet.do" method="get"
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
									type="hidden" name="productSkuId"
									value="${productSku.productSkuId}" />
								<div class="control-group">
									<label class="control-label">产品编号：</label>
									<div class="controls">
										<input type="text" class="span11" name="skuCode"
											style="width: 400px" value="${productSku.skuCode}" />
									</div>
								</div>
								<div class="control-group">
									<label class="control-label">产品：</label>
									<div class="controls">
										<select style="width: 800px" name="productId">
											<c:forEach items="${listProduct }" var="product">
												<option
													<c:if test='${productSku.productId == product.productId}'>selected="selected"</c:if>
													value="${product.productId}">${product.name}</option>
											</c:forEach>
										</select>
									</div>
								</div>
								<div class="control-group">
									<label class="control-label">颜色：</label>
									<div class="controls">
										<select style="width: 250px" name="colorId">
											<c:forEach items="${listColor }" var="color">
												<option
													<c:if test='${productSku.colorId == color.colorId}'>selected="selected"</c:if>
													value="${color.colorId}">${color.colorValue}</option>
											</c:forEach>
										</select>
									</div>
								</div>
								<div class="control-group">
									<label class="control-label">尺码：</label>
									<div class="controls">
										<select style="width: 250px" name="sizeId">
											<c:forEach items="${listSize }" var="size">
												<option
													<c:if test='${productSku.sizeId == size.sizeId}'>selected="selected"</c:if>
													value="${size.sizeId}">${size.sizeValue}</option>
											</c:forEach>
										</select>
									</div>
								</div>
								<div class="control-group">
									<label class="control-label">原价：</label>
									<div class="controls">
										<input type="text" class="span11" name="priceOrigin"
											value="${productSku.priceOrigin}" />
									</div>
								</div>
								<div class="control-group">
									<label class="control-label">现价：</label>
									<div class="controls">
										<input type="text" class="span11" name="priceCurrent"
											value="${productSku.priceCurrent}" /> <span
											class="help-block">1000-1000000</span>
									</div>
								</div>
								<div class="control-group">
									<label class="control-label">库存：</label>
									<div class="controls">
										<input class="span11" name="stock" value="${productSku.stock}">
									</div>
								</div>
								<div class="control-group">
									<label class="control-label">产品大图：</label>
									<div class="controls">
										<input type="text" class="span11" name="picBig"
											value="${productSku.picBig}" />
									</div>
								</div>
								<div class="control-group">
									<label class="control-label">产品中图：</label>
									<div class="controls">
										<input type="text" class="span11" name="picMid"
											value="${productSku.picMid}" />
									</div>
								</div>
								<div class="control-group">
									<label class="control-label">产品小图：</label>
									<div class="controls">
										<input type="text" class="span11" name="picSmall"
											value="${productSku.picSmall}" />
									</div>
								</div>
								<div class="control-group">
									<label class="control-label">产地：</label>
									<div class="controls">
										<input type="text" class="span11" name="origin"
											value="${productSku.origin}" />
									</div>
								</div>
								<div class="form-actions">
									<button type="submit" class="btn btn-success">保存</button>
									<a href="ProductSkuServlet.do?method=list">取消</a>
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