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
			<div class="row-fluid">
				<form action="EvaluatServlet.do" method="post"
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
									type="hidden" name="evaluateId" value="${evaluate.evaluateId}" />
								<div class="control-group">
									<label class="control-label"> <span
										style="position: absolute; left: 123px;">用户名：</span> <select
										name="userId" class="span11" style="margin-left: 200px;">
											<option value="0">空</option>
											<c:forEach items="${listUserInfo }" var="UserInfo">
												<option
													<c:if test='${userId == UserInfo.userId}'>selected="selected"</c:if>
													value="${UserInfo.userId}">${UserInfo.name}</option>
											</c:forEach>
									</select>

									</label>
								</div>
								<div class="control-group">
									<label class="control-label"> <span
										style="position: absolute; left: 110px;">产品名称：</span> <select
										name="productId" class="span11" style="margin-left: 200px;">
											<option value="0">空</option>
											<c:forEach items="${listProduct }" var="Product">
												<option
													<c:if test='${productId == Product.productId}'>selected="selected"</c:if>
													value="${Product.productId}">${Product.name}</option>
											</c:forEach>
									</select>

									</label>
								</div>
								<div class="control-group">
									<label class="control-label"> <span
										style="position: absolute; left: 85px;">订单详情编号：</span> <select
										name="orderDtlId" class="span11" style="margin-left: 200px;">
											<option value="0">空</option>
											<c:forEach items="${listOrderSKU }" var="OrderSKU">
												<option
													<c:if test='${orderDtlId == OrderSKU.orderDtlId}'>selected="selected"</c:if>
													value="${OrderSKU.orderDtlId}">${OrderSKU.orderDtlCode}</option>
											</c:forEach>
									</select>

									</label>
								</div>
								<%-- <div class="control-group">
									<label class="control-label">物流状态：</label>
									<div class="controls">
										<input type="text" class="span11" name="logStatus"
											value="${evaluate.logStatus}" />
									</div>
								</div> --%>
								<div class="control-group">

									<%-- <label class="control-label"> <span
										style="position: absolute; left: 85px;">服务是否满意：</span> <select
										name="serviceStatus" class="span11"
										style="margin-left: 200px;">
											<option value="0">空</option>
											<c:forEach items="${listDictionarySKU }" var="DictionarySKU">
												<option
													<c:if test='${serviceStatus == DictionarySKU.dictionaryDetailCode}'>selected="selected"</c:if>
													value="${DictionarySKU.dictionaryDetailCode}">${DictionarySKU.dictionaryDetaiLabel}</option>
											</c:forEach>
									</select>

									</label> --%>

									<%-- <div class="controls">
										<input type="text" class="span11" name="serviceStatus"
											value="${evaluate.serviceStatus}" />
									</div> --%>
									
									<label class="control-label"> <span
										style="position: absolute; left: 85px;">服务是否满意：</span> <select
										name="serviceStatus" class="span11"
										style="margin-left: 200px;">
											<option value="0">空</option>
											<c:forEach items="${listServiceStatus }" var="ServiceStatus">
												<option
													<c:if test='${evaluate.serviceStatus == ServiceStatus.dictionaryDetailCode}'>selected="selected"</c:if>
													value="${ServiceStatus.dictionaryDetailCode}">${ServiceStatus.dictionaryDetaiLabel}</option>
											</c:forEach>
									</select>

									</label>
								</div>
								<div class="control-group">
									<%-- <label class="control-label"> <span
										style="position: absolute; left: 85px;">服务是否符合：</span> <select
										name="descriptionStatus" class="span11"
										style="margin-left: 200px;">
											<option value="0">空</option>
											<c:forEach items="${listDictionarySKU }" var="DictionarySKU">
												<option
													<c:if test='${descriptionStatus == DictionarySKU.dictionaryDetailCode}'>selected="selected"</c:if>
													value="${DictionarySKU.dictionaryDetailCode}">${DictionarySKU.dictionaryDetaiLabel}</option>
											</c:forEach>
									</select>

									</label> --%>
	
									<label class="control-label"> <span
									style="position: absolute; left: 85px;">服务是否符合：</span> <select
									name="descriptionStatus" class="span11"
									style="margin-left: 200px;">
										<option value="0">空</option>
										<c:forEach items="${listDescriptionStatus }" var="descriptionStatus">
											<option
												<c:if test='${evaluate.descriptionStatus == descriptionStatus.dictionaryDetailCode}'>selected="selected"</c:if>
												value="${descriptionStatus.dictionaryDetailCode}">${descriptionStatus.dictionaryDetaiLabel}</option>
										</c:forEach>
									</select>

									</label>
									<%-- <div class="controls">
										<input class="span11" name="descriptionStatus"
											value="${evaluate.descriptionStatus}">
										</textarea>
									</div> --%>
								</div>
								<div class="control-group">
									<label class="control-label">评价内容：</label>
									<div class="controls">
										<input type="text" class="span11" name="evalContent"
											value="${evaluate.evalContent}" />
									</div>
								</div>
								<div class="control-group">
									<label class="control-label">图片地址：</label>
									<div class="controls">
										<input type="text" class="span11" name="imgUrl"
											value="${evaluate.imgUrl}" />
									</div>
								</div>
								<div class="control-group">
									<label class="control-label">视频地址：</label>
									<div class="controls">
										<input type="text" class="span11" name="videoUrl"
											value="${evaluate.videoUrl}" />
									</div>
								</div>
								<div class="control-group">
									<label class="control-label">评价时间：</label>
									<div class="controls">
										<input type="text" class="span11"
											name="evaluateTime" value="${evaluate.evaluateTime}" />
									</div>
								</div>
								<div class="form-actions">
									<button type="submit" class="btn btn-success">保存</button>
									<a href="EvaluatServlet.do?method=list">取消</a>
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