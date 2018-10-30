


<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<title>后台管理-入库页面-编辑</title>
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
				<form action="WarehouseServlet.do" method="get"	class="form-horizontal">
					<div class="span12">
						<div class="widget-box">
							<div class="widget-title">
								<span class="icon"> <i class="icon-align-justify"></i>
								</span>
								<h5>编辑</h5>
							</div>
							<div class="widget-content nopadding">
								<input type="hidden" name="method" value="save" /> <input
									type="hidden" name="warehouseId" value="${warehouse.warehouseId}" />
								<div class="control-group">
									<label class="control-label">入库code</label>
									<div class="controls">
										<input type="text" name="warehouseCode"
										 value="${warehouse.warehouseCode}"class="span11">
									</div>
								</div>
							</div>	
								<div class="control-group">
									<label class="control-label">员工名字</label>
									
									<div class="controls">
										<select name="staffId" class="span11">
											<c:forEach items="${listStaff}" var="warehouse">
												<option <c:if test='${staffId == warehouse.staffId}'>selected="selected"</c:if> 
												value="${warehouse.staffId}">${warehouse.staffName}</option>
											</c:forEach>
										</select>	
									</div>
								</div>	
								<div class="control-group">
									<label class="control-label">付款金额</label>
									<div class="controls">
										<input type="text" name="price"
											value="${warehouse.price}" class="span11">
									</div>
								</div>
								<div class="control-group">
									<label class="control-label">付款状态</label>
									<div class="controls">
										<%-- <input type="text" name="payStat" value="${warehouse.payStat}"class="span11"> --%>
										 
										 <select name="payStat" class="span11">
											<c:forEach items="${listDictionarySku}" var="c">
												<option <%-- <c:if test='${warehouse.payStat == c.dictionaryDetailCode}'>selected="selected"</c:if> --%> 
												value="${c.dictionaryDetailCode}">${c.dictionaryDetaiLabel}</option>
											</c:forEach>
										 </select>
									</div>
								</div>
								<div class="control-group">
									<label class="control-label">采购日期</label>
									<div class="controls">
										<input type="date" class="span11" name="purchaseDate"
											value="${warehouse.purchaseDate}" />
									</div>
								</div>
								<div class="control-group">
									<label class="control-label">入库时间</label>
									<div class="controls">
										<input type="date" class="span11" name="warehouseDate"
											value="${warehouse.warehouseDate}" />
									</div>
									
								</div>
								<div class="control-group">
									<label class="control-label">备注</label>
									<div class="controls">
										<input type="text" class="span11" name="remark"
											value="${warehouse.remark}" />
									</div>
								</div>
								<div class="form-actions">
									<button type="submit" class="btn btn-success">保存</button>
									<a href="WarehouseServlet.do?method=list">取消</a>
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



