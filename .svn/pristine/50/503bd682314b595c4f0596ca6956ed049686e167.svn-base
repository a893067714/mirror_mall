

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
	href="<%=request.getContextPath()%>/resource/admin/font-awesome/css/font-awesome.css" />
	<style>
		.img_prd{
			width:100px;
			height:100px;
		}
		
	</style>
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
					<h5>订单sku</h5>
				</div>
				<form action ="AdminOrderSKUServlet.do?method=list" method="post" class="form-horizontal">
			
					<div class="controls">
							<span>订单code：</span>
							<select name="orderId" class="span11"  style="width:150px">
							<c:forEach items="${arr1}" var="arr">
							<option value="${arr.orderId}">${arr.orderCode}</option>
							</c:forEach>
							</select>	
							<span>产品SKUCode：</span>
							<select name="productSkuId" class="span11"  style="width:150px">
							<c:forEach items="${arr1}" var="arr">
							<option value="${arr.productSkuId}">${arr.productSKUCode}</option>
							</c:forEach>
							</select>	

							<span>价格</span>
							<input type= "text" name = "price" value="${orderSKU.price}" style="width:150px"/>
							<span>数量</span>
							<input type= "text" name = "amount" value="${orderSKU.amount}" style="width:150px"/>
								<span>发货状态</span>
								<select name="sendStat" class="span11"  style="width:150px">
								<c:forEach items="${listSendStatSKU}" var="SendStatSKU">
								<option value="${SendStatSKU.dictionaryDetailCode}">${SendStatSKU.dictionaryDetaiLabel}</option>
								</c:forEach>
								</select>		
					
							<span>发货日期</span>
							<input type= "text" name = "sendDate" value="${orderSKU.sendDate}" style="width:150px"/>
							<span>物流运输</span>
							<input type= "text" name = "logDoing" value="${orderSKU.logDoing}" style="width:150px"/>
								<span>物流到达</span>
								<select name="logDone" class="span11"  style="width:150px">
								<c:forEach items="${listLogDoneSKU}" var="LogDoneSKU">
								<option value="${LogDoneSKU.dictionaryDetailCode}">${LogDoneSKU.dictionaryDetaiLabel}</option>
								</c:forEach>
								</select>	
								<span>签收状态</span>
								<select name="signStat" class="span11"  style="width:150px">
								<c:forEach items="${listSignStatSKU}" var="SignStatSKU">
								<option value="${SignStatSKU.dictionaryDetailCode}">${SignStatSKU.dictionaryDetaiLabel}</option>
								</c:forEach>
								</select>

								<span>签收日期</span>
								<input type= "text" name = "signDate" value="${orderSKU.signDate}" style="width:150px"/>
								<span>评价状态</span>
								<select name="evalStat" class="span11"  style="width:150px">
								<c:forEach items="${listEvalStatSKU}" var="EvalStatSKU">
								<option value="${EvalStatSKU.dictionaryDetailCode}">${EvalStatSKU.dictionaryDetaiLabel}</option>
								</c:forEach>
								</select>
						
							<span>评价日期</span>
							<input type= "text" name = "evalDate" value="${orderSKU.evalDate}" style="width:150px"/>
	
							
							<input type = "submit" value="查询">
						</div>
				</form>
				<hr>
				<a href="AdminOrderSKUServlet.do?method=edit"><button
						class="btn btn-success btn-mini">新增</button></a>
				<hr>
				<div class="widget-content"
					style="position: relative; height: 800px; overflow-y: auto;">
					<table class="table table-bordered table-striped with-check">
						<thead>
							<tr>
								<th><input type="checkbox" id="title-table-checkbox"
									name="title-table-checkbox" /></th>
							<th>订单明细code</th>
							<th>订单code</th>
							<th>图片</th>
							<th>产品SKUCode</th>
							<th>价格</th>
							<th>数量</th>	
							<th>发货状态</th>
							<th>发货日期</th>
							<th>物流运输</th>
							<th>物流到达</th>
							<th>签收状态</th>		
							<th>签收日期</th>
							<th>评价状态</th>
							<th>评价日期</th>
							
							
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${arr1 }" var="orderSKU">
								<tr>
									<td><input type="checkbox" /></td>
									<td>${orderSKU.orderDtlCode}</td>
									<td>${orderSKU.orderCode}</td>
									<td><img class="img_prd" src="<%=request.getContextPath()%>/resource/${orderSKU.orderSKUPic}" /></td>
									<td>${orderSKU.productSKUCode}</td>
									<td>${orderSKU.price}</td>
									<td>${orderSKU.amount}</td>
									
									<td>${orderSKU.sendStatLabel}</td>
									<td>${orderSKU.sendDate}</td>
									<td>${orderSKU.logDoing}</td>
									<td>${orderSKU.logDoneLabel}</td>
									<td>${orderSKU.signStatLabel}</td>
									
									<td>${orderSKU.signDate}</td>
									<td>${orderSKU.evalStatLabel}</td>
									<td>${orderSKU.evalDate}</td>
									
									
									<td>
									<a href="AdminOrderSKUServlet.do?method=edit&orderDtlId=${orderSKU.orderDtlId}">编辑</a>			
									<a href="AdminOrderSKUServlet.do?method=delete&orderDtlId=${orderSKU.orderDtlId}">删除</a></td>
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




