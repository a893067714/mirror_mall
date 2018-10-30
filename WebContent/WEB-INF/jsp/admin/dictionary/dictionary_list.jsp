

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
		<div class="row-fluid">
			<div class="widget-box">
				<div class="widget-title">
					<span class="icon"> <i class="icon-th"></i>
					</span>
					<h5>数据字典</h5>
				</div>		
				
				<form action ="DictionaryServlet.do?method=list" method="post" class="form-horizontal">
					<div class="controls">
					
					<span>数据字典编号</span>	
						<input type= "text" name = "dataDictionaryCode" value="${dictionary.dataDictionaryCode}"/>
					<span>数据字典标签</span>	
						<input type= "text" name = "dataDictionaryLabel" value="${dictionary.dataDictionaryLabel}"/>
						<input type = "submit" value="查询">
					</div>
				</form>
				<hr>
					<a href="DictionaryServlet.do?method=edit"><button
						class="btn btn-success btn-mini">新增</button></a>
				<hr>
				<div class="widget-content"
					style="position: relative; height: 800px; overflow-y: auto;">
					<table class="table table-bordered table-striped with-check">
						<thead>
							<tr>
								<th><input type="checkbox" id="title-table-checkbox"
									name="title-table-checkbox" /></th>
								<th>数据字典ID</th>
								<th>数据字典编号</th>
								<th>数据字典标签</th>
								<th>操作</th>
							</tr>
						</thead>
						<tbody>
						<c:forEach items="${arr1 }" var="dictionary">
								<tr>
									<td><input type="checkbox" /></td>
									<td>${dictionary.dataDictionaryId }</td>
									<td>${dictionary.dataDictionaryCode }</td>
									<td>${dictionary.dataDictionaryLabel }</td>
									<td><a
										href="DictionaryServlet.do?method=edit&dataDictionaryId=${dictionary.dataDictionaryId }">编辑</a>
										<a
										href="DictionaryServlet.do?method=delete&dataDictionaryId=${dictionary.dataDictionaryId }">删除</a></td>
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




