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
					<h5>详细分类表</h5>
					<span class="label label-info">iwonder</span>
				</div>
				<form class="form-horizontal" method="get"
					action="TypeDetailServlet.do?method=list">
					<div class="controls">
						<span>详细分类名称：</span> <input type="text" name="typeDtlName"
							value="${typeDtlName}" /> <span>品牌：</span> <select
							style="width: 250px" name="typeBigId">
							<option value="0">空</option>
							<c:forEach items="${listTypeBig }" var="typeBig">
								<option
									<c:if test='${typeBigId == typeBig.typeBigId}'>selected="selected"</c:if>
									value="${typeBig.typeBigId}">${typeBig.typeBigName}</option>
							</c:forEach>
						</select> <input type="submit" value="查询" class="btn btn-success">
					</div>
					<hr>
				</form>
				<a href="TypeDetailServlet.do?method=edit"><button
						class="btn btn-success btn-mini">新增</button></a>
					<hr>
				<div class="widget-content" style="overflow-y:auto;height:700px">
					<table class="table table-bordered table-striped with-check" >
						<thead>
							<tr>
								<th>\</th>
								<th>详细分类名称</th>
								<th>大分类名称</th>
								<th>操作</th>
							</tr>
						</thead>
						<tbody>
							<%
								int i = 0;
							%>
							<c:forEach items="${listTypeDetail }" var="typeDetail">
								<tr >
									<td><%=++i%></td>
									<td>${typeDetail.typeDtlName }</td>
									<td>${typeDetail.typeBigName }</td>
									<td><a
										href="TypeDetailServlet.do?method=edit&typeDtlId=${typeDetail.typeDtlId }">编辑</a>
										<a
										href="TypeDetailServlet.do?method=delete&typeDtlId=${typeDetail.typeDtlId }">删除</a></td>
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