



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
				<form action="AdminOrderSKUServlet.do" method="get"
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
									type="hidden" name="orderDtlId" value="${orderSKU.orderDtlId}" />
									
								<div class="control-group">
									<label class="control-label">订单SKUCode</label>
									<div class="controls">
										<input type="text" name="orderDtlCode"
											value="${orderSKU.orderDtlCode}"  class="span11">
									</div>
								</div>		
									
									
								
								<div class="control-group">
									<label class="control-label">订单code</label>
									
									<div class="controls">
										<select name="orderId" class="span11">
										<c:forEach items="${listOrder}" var="order">
										<option  <c:if test='${orderId == order.orderId}'>selected="selected"</c:if> value="${order.orderId}">${order.orderCode}</option>
										</c:forEach>
									</select>	
									</div>
								</div>	
									<div class="control-group">
									<label class="control-label">产品SKUCode</label>
									
									<div class="controls">
										<select name="productSkuId" class="span11">
										<c:forEach items="${listProductSKU}" var="ProductSKU">
										<option <c:if test='${productSkuId == ProductSKU.productSkuId}'>selected="selected"</c:if> value="${ProductSKU.productSkuId}">${ProductSKU.skuCode}</option>
										</c:forEach>
									</select>	
									</div>
								</div>	
								
							
								<div class="control-group">
									<label class="control-label">价格</label>
									<div class="controls">
										<input type="text" name="price"
										 value="${orderSKU.price}"class="span11">
									</div>
								</div>
								<div class="control-group">
									<label class="control-label">数量</label>
									<div class="controls">
										<input type="text" class="span11" name="amount"
											value="${orderSKU.amount}" />
									</div>
								</div>
								
								<div class="control-group">
									<label class="control-label">发货状态</label>
									
									<div class="controls">
										<select name="sendStat" class="span11">
											<c:forEach items="${listSendStatSKU}" var="SendStatSKU">
											<option <c:if test='${sendStat == SendStatSKU.dictionaryDetailCode}'>selected="selected"</c:if> value="${SendStatSKU.dictionaryDetailCode}">${SendStatSKU.dictionaryDetaiLabel}</option>
											</c:forEach>
									</select>	
									</div>
								</div>	
											
								<%-- <div class="control-group">
									<label class="control-label">发货状态</label>
									<div class="controls">
										<input type="text" class="span11" name="sendStat"
											value="${orderSKU.sendStat}" />
									</div>
								</div> --%>
								<div class="control-group">
									<label class="control-label">发货日期</label>
									<div class="controls">
										<input type="text" class="span11" name="sendDate"
											value="${orderSKU.sendDate}" />
									</div>
								</div>
								<div class="control-group">
									<label class="control-label">物流运输</label>
									<div class="controls">
										<input type="text" class="span11" name="logDoing"
											value="${orderSKU.logDoing}" />
									</div>
								</div>
								
								<div class="control-group">
									<label class="control-label">物流到达</label>
									
									<div class="controls">
										<select name="logDone" class="span11">	
												<c:forEach items="${listLogDoneSKU}" var="LogDoneSKU">
												<option <c:if test='${logDone == LogDoneSKU.dictionaryDetailCode}'>selected="selected"</c:if>  value="${LogDoneSKU.dictionaryDetailCode}">${LogDoneSKU.dictionaryDetaiLabel}</option>
												</c:forEach>
										</select>	
									</div>
								</div>	
								
								
								<%-- <div class="control-group">
									<label class="control-label">物流到达</label>
									<div class="controls">
										<input type="text" class="span11" name="logDone"
											value="${orderSKU.logDone}" />
									</div>
								</div> --%>
								<div class="control-group">
									<label class="control-label">签收状态</label>
									
									<div class="controls">
										<select name="signStat" class="span11">
											
												<c:forEach items="${listSignStatSKU}" var="SignStatSKU">
												<option <c:if test='${signStat == SignStatSKU.dictionaryDetailCode}'>selected="selected"</c:if>  value="${SignStatSKU.dictionaryDetailCode}">${SignStatSKU.dictionaryDetaiLabel}</option>
												</c:forEach>
										</select>	
									</div>
								</div>	
							<%-- 	<div class="control-group">
									<label class="control-label">签收状态</label>
									<div class="controls">
										<input type="text" class="span11" name="signStat"
											value="${orderSKU.signStat}" />
									</div>
								</div> --%>
								<div class="control-group">
									<label class="control-label">签收日期</label>
									<div class="controls">
										<input type="text" class="span11" name="signDate"
											value="${orderSKU.signDate}" />
									</div>
								</div>
								
								<div class="control-group">
									<label class="control-label">评价状态</label>
									
									<div class="controls">
										<select name="evalStat" class="span11">
												<c:forEach items="${listEvalStatSKU}" var="EvalStatSKU">
												<option <c:if test='${evalStat == EvalStatSKU.dictionaryDetailCode}'>selected="selected"</c:if> value="${EvalStatSKU.dictionaryDetailCode}">${EvalStatSKU.dictionaryDetaiLabel}</option>
												</c:forEach>
										</select>	
									</div>
								</div>
								<%-- <div class="control-group">
									<label class="control-label">评价状态</label>
									<div class="controls">
										<input type="text" class="span11" name="evalStat"
											value="${orderSKU.evalStat}" />
									</div>
								</div> --%>
								<div class="control-group">
									<label class="control-label">评价日期</label>
									<div class="controls">
										<input type="text" class="span11" name="evalDate"
											value="${orderSKU.evalDate}" />
									</div>
								</div>
								<div class="form-actions">
									<button type="submit" class="btn btn-success">保存</button>
									<a href="AdminOrderSKUServlet.do?method=list">取消</a>
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





