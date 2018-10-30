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
			<div class="widget-box">
				<div class="widget-title">
					<span class="icon"> <i class="icon-th"></i>
					</span>
					<h5>评价</h5>
					<span class="label label-info">iwonder</span>
				</div>
				<form class="form-horizontal" method="post"
					action="EvaluatServlet.do" id="basic_validate"
					novalidate="novalidate">
					<input type="hidden" name="method" value="list" />
					<div class="controls">
						<span>用户名：</span>
						<!-- <span style="position:absolute;left: 123px;">用户名：</span> -->
						<select name="userId">
						<option value="0">空</option>
							<c:forEach items="${listUserInfo }" var="UserInfo">
								<option
									<c:if test='${userId == UserInfo.userId}'>selected="selected"</c:if>
									value="${UserInfo.userId}">${UserInfo.name}</option>
							</c:forEach>
						</select>
						<%-- <input type="text" name="userId" value="${evaluatConditionView.userId}" id="required"> --%>
						<span>产品名称：</span> <select name="productId">
						<option value="0">空</option>
							<c:forEach items="${listProduct }" var="Product">
								<option
									<c:if test='${productId == Product.productId}'>selected="selected"</c:if>
									value="${Product.productId}">${Product.name}</option>
							</c:forEach>
						</select> 
						<%-- <input type="text" name="productId"
							value="${evaluatConditionView.productId}" id="email"> --%> 
						<span>订单详细编号：</span>
						<select name="orderDtlId">
						<option value="0">空</option>
							<c:forEach items="${listOrderSKU }" var="OrderSKU">
								<option
									<c:if test='${orderDtlId == OrderSKU.orderDtlId}'>selected="selected"</c:if>
									value="${OrderSKU.orderDtlId}">${OrderSKU.orderDtlCode}</option>
							</c:forEach>
						</select> 
						<%-- <input type="text" name="orderDtlId"
							value="${evaluatConditionView.orderDtlId}" id="date">  <span>物流状态：</span>
						<input type="text" name="logStatus"
							value="${evaluatConditionView.logStatus}" id="date">--%>
					</div>
					<div class="controls">
					
						<%-- <span>服务是否满意：</span>
						 <input type="text" name="serviceStatus"
							value="${evaluatConditionView.serviceStatus}" id="required"> --%>
					
						<%-- <span>服务是否满意：</span> <select name="serviceStatus">
						<option value="0">空</option>
							<c:forEach items="${listDictionarySKU }" var="DictionarySKU">
								<option
									<c:if test='${serviceStatus == DictionarySKU.dictionaryDetailCode}'>selected="selected"</c:if>
									value="${DictionarySKU.dictionaryDetailCode}">${DictionarySKU.dictionaryDetaiLabel}</option>
							</c:forEach>
						</select> --%>
						
						<span>服务是否满意：</span> <select name="serviceStatus">
						<option value="0">空</option>
							<c:forEach items="${listServiceStatus }" var="ServiceStatus">
								<option
									<c:if test='${evaluatConditionView.serviceStatus == ServiceStatus.dictionaryDetailCode}'>selected="selected"</c:if>
									value="${ServiceStatus.dictionaryDetailCode}">${ServiceStatus.dictionaryDetaiLabel}</option>
							</c:forEach>
						</select>
						
						<%-- <span>描述是否符合：</span> <select name="descriptionStatus">
						<option value="0">空</option>
							<c:forEach items="${listDictionarySKU }" var="DictionarySKU">
								<option
									<c:if test='${descriptionStatus == DictionarySKU.dictionaryDetailCode}'>selected="selected"</c:if>
									value="${DictionarySKU.dictionaryDetailCode}">${DictionarySKU.dictionaryDetaiLabel}</option>
							</c:forEach>
						</select> --%> 
						
						<span>描述是否符合：</span> <select name="descriptionStatus">
						<option value="0">空</option>
							<c:forEach items="${listDescriptionStatus }" var="descriptionStatus">
								<option
									<c:if test='${evaluatConditionView.descriptionStatus == descriptionStatus.dictionaryDetailCode}'>selected="selected"</c:if>
									value="${descriptionStatus.dictionaryDetailCode}">${descriptionStatus.dictionaryDetaiLabel}</option>
							</c:forEach>
						</select> 
						
						<%-- <span>描述是否符合：</span> 
						<input type="text" name="descriptionStatus"
							value="${evaluatConditionView.descriptionStatus}" id="email"> --%>
							
							评价时间：<input type="text" name="timePrevious"
							value="${timePrevious}" style="width: 100px" /> -<input
							type="text" name="timeLater" value="${timeLater}"
							style="width: 100px" />
							
						<input type="submit" value="查询" class="btn btn-success">
					</div>
					<hr>
				</form>
				<a href="EvaluatServlet.do?method=edit">新增</a>
				<div class="widget-content"
					style="position: relative; height: 800px; overflow-y: auto;">
					<table class="table table-bordered table-striped with-check">
						<thead>
							<tr>
								<th><input type="checkbox" id="title-table-checkbox"
									name="title-table-checkbox" /></th>
								<!-- <th>评价ID</th> -->
								<th>用户名</th>
								<th>产品名称</th>
								<th>订单详情编号</th>
								<!-- <th>物流状态</th> -->
								<th>服务是否满意</th>
								<th>描述是否符合</th>
								<th>评价内容</th>
								<th>图片地址</th>
								<th>视频地址</th>
								<th>评价时间</th>
								<th>操作</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${listEvaluate }" var="evaluate">
								<tr>
									<td><input type="checkbox" /></td>
									<%-- <td>${evaluate.evaluateId }</td> --%>
									<td>${evaluate.userName }</td>
									<td>${evaluate.productName }</td>
									<td>${evaluate.orderDtlCode }</td>
									<%-- <td>${evaluate.logStatus }</td> --%>
									<td>${evaluate.serviceStatusName }</td>
									<td>${evaluate.descriptionStatusName }</td>
									<td>${evaluate.evalContent }</td>
									<td>${evaluate.imgUrl }</td>
									<td>${evaluate.videoUrl }</td>
									<td>${evaluate.evaluateTime }</td>
									<td><a
										href="EvaluatServlet.do?method=edit&evaluateId=${evaluate.evaluateId }">编辑</a>
										<a
										href="EvaluatServlet.do?method=delete&evaluateId=${evaluate.evaluateId }">删除</a></td>
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