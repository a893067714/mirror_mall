
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
				<form action="AdminOrderServlet.do" method="get"
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
									type="hidden" name="orderId" value="${order.orderId}" />
								<div class="control-group">
									<label class="control-label">订单code</label>
									<div class="controls">
										<input type="text" name="orderCode"
										 value="${order.orderCode}"class="span11">
									</div>
								</div>	
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
									<label class="control-label">地址</label>
									<div class="controls">
									<select name="addressId" class="span11">
										<c:forEach items="${listAddressInfo}" var="addressInfo">
										<option <c:if test='${addressId == addressInfo.addressId}'>selected="selected"</c:if> value="${addressInfo.addressId}">${addressInfo.addressCont}</option>
										</c:forEach>
										</select>
									</div>
								</div>
								<div class="control-group">
									<label class="control-label">创建时间</label>
									<div class="controls">
										<input type="text" name="createDate"
										 value="${order.createDate}"class="span11">
									</div>
								</div>
								<div class="control-group">
									<label class="control-label">总价格</label>
									<div class="controls">
										<input type="text" class="span11" name="totalPrice"
											value="${order.totalPrice}" />
									</div>
								</div>
								
								<div class="control-group">
									<label class="control-label">付款状态</label>
									<div class="controls">
									<select name="payStat" class="span11">
										<c:forEach items="${listDictionarySKU}" var="listDictionarySKU">
										<option value="${listDictionarySKU.dictionaryDetailCode}">${listDictionarySKU.dictionaryDetaiLabel}</option>
										</c:forEach>
										</select>
									</div>
								</div>
								
								<div class="control-group">
									<label class="control-label">付款日期</label>
									<div class="controls">
										<input type="text" class="span11" name="payDate"
											value="${order.payDate}" />
									</div>
								</div>
										
								<div class="form-actions">
									<button type="submit" class="btn btn-success">保存</button>
									<a href="AdminOrderServlet.do?method=list">取消</a>
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






