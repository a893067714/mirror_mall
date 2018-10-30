

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<title>后台管理-入库页面</title>
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
			<div class="row-fluid">
				<div class="widget-box">
					<div class="widget-title">
						<span class="icon"> <i class="icon-th"></i>
						</span>
						<h5>订单</h5>
					</div>
					<form action="WarehouseServlet.do?method=list" method="post"
						class="form-horizontal">

						<div class="controls">
							<div class="controls">
								<span>员工名字：</span> <select name="staffId" class="span11"
									style="width: 150px">
									<c:forEach items="${arr1}" var="arr">
										<option value="${arr.staffId}">${arr.name}</option>
									</c:forEach>
								</select> <span>付款金额：</span> <input type="text" name="price"
									value="${price}" style="width: 150px" /> 
									<span>付款状态：</span> 
									<%-- <input type="text" name="payStat" value="${payStat}" style="width: 150px" />  --%>
							<select style="width: 100px" name="payStat">
								<option value="0">-</option>
								<c:forEach items="${listDictionarySku }" var="c">
									<option <c:if test='${payStat == c.dictionaryDetailCode}'>selected="selected"</c:if>
										value="${c.dictionaryDetailCode}">${c.dictionaryDetaiLabel}</option>
								</c:forEach>
							</select>							
									<span>备注：</span> <input type="text" name="remark" value="${remark}" style="width: 150px" />
							</div>
							<div class="controls">
								<span>采购日期：</span> 
								<input type="date" name="purchaseDateStart"
									value="${purchaseDateStart}" style="width: 150px" /> <span>到</span>
								<input type="date" name="purchaseDateEnd"
									value="${purchaseDateEnd}" style="width: 150px" /> 
								<span>入库时间：</span>
								<input type="date" name="warehouseDateStart"
									value="${warehouseDateStart}" style="width: 150px" /><span>到</span>
								<input type="date" name="warehouseDateEnd"
									value="${warehouseDateEnd}" style="width: 150px" /> <input
									type="submit" value="查询">
							</div>

						</div>
					</form>
					<hr>
					<a href="WarehouseServlet.do?method=edit"><button
							class="btn btn-success btn-mini">新增</button></a>
					<hr>
					<div class="widget-content"
						style="position: relative; height: 800px; overflow-y: auto;">
						<table class="table table-bordered table-striped with-check">
							<thead>
								<tr>
									<th><input type="checkbox" id="title-table-checkbox"
										name="title-table-checkbox" /></th>

									<th>入库code</th>
									<th>员工名字</th>
									<th>付款金额</th>
									<th>付款状态</th>
									<th>采购日期</th>
									<th>入库时间</th>
									<th>备注</th>
									<th>操作</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${arr1}" var="warehouse">
									<tr>
										<td><input type="checkbox" /></td>
										<td>${warehouse.warehouseCode}</td>
										<td>${warehouse.name}</td>
										<td>${warehouse.price}</td>
										<td>${warehouse.dictionaryDetailLabel}</td>
										<td>${warehouse.purchaseDate}</td>
										<td>${warehouse.warehouseDate}</td>
										<td>${warehouse.remark}</td>

										<td><a
											href="WarehouseServlet.do?method=edit&warehouseId=${warehouse.warehouseId}">编辑</a>
											<a
											href="WarehouseServlet.do?method=delete&warehouseId=${warehouse.warehouseId}">删除</a>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>

</html>




