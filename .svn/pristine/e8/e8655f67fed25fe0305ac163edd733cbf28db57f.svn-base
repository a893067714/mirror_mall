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
					<h5>大分类表</h5>
					<span class="label label-info">iwonder</span>
				</div>
				<form class="form-horizontal" method="get"
					action="TypeBigServlet.do?method=list">
					<div class="controls">
						<span>大分类名称：</span> <input type="text" name="typeBigName"
							value="${typeBigName}" /> <input type="submit" value="查询"
							class="btn btn-success">
					</div>
					<hr>
				</form>
				<a href="TypeBigServlet.do?method=edit"><button
						class="btn btn-success btn-mini">新增</button></a>
				<div class="widget-content"
					style="position: relative; height: 800px; overflow-y: auto;">
					<table class="table table-bordered table-striped with-check">
						<thead>
							<tr>
								<th>\</th>
								<th>大分类名称</th>
								<th>操作</th>
							</tr>
						</thead>
						<tbody>
							<%
								int i = 0;
							%>
							<c:forEach items="${listTypeBig }" var="typeBig">
								<tr>
									<td><%=++i%></td>
									<td>${typeBig.typeBigName }</td>
									<td><a
										href="TypeBigServlet.do?method=edit&typeBigId=${typeBig.typeBigId }">编辑</a>
										<a
										href="TypeBigServlet.do?method=delete&typeBigId=${typeBig.typeBigId }">删除</a></td>
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