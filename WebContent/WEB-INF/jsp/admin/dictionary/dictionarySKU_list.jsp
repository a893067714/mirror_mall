

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
				
				<form action ="DictionarySKUServlet.do?method=list" method="post" class="form-horizontal">
					<div class="controls">
				<span>dataDictionaryId</span>
				<input type= "text" name = "dataDictionaryId" value="${dictionarySKU.dataDictionaryId} "Style="width:120px"/>
				<span>dataDictionaryCode</span>
				<input type= "text" name = "dataDictionaryCode" value="${dictionarySKU.dataDictionaryCode} " Style="width:120px"/>
				<span>dictionaryDetailCode</span>
				<input type= "text" name = "dictionaryDetailCode" value="${dictionarySKU.dictionaryDetailCode} " Style="width:120px"/>
				<span>dictionaryDetaiLabel</span>
				<input type= "text" name = "dictionaryDetaiLabel" value="${dictionarySKU.dictionaryDetaiLabel} " Style="width:120px"/>
				<span>dictionaryDetailNumber</span>
				<input type= "text" name = "dictionaryDetailNumber" value="${dictionarySKU.dictionaryDetailNumber} " Style="width:120px"/>
						<input type = "submit" value="查询">
					</div>
				</form>
				<hr>
					<a href="DictionarySKUServlet.do?method=edit"><button
						class="btn btn-success btn-mini">新增</button></a>
				<hr>
				<div class="widget-content"
					style="position: relative; height: 800px; overflow-y: auto;">
					<table class="table table-bordered table-striped with-check">
						<thead>
							<tr>
								<th><input type="checkbox" id="title-table-checkbox"
									name="title-table-checkbox" /></th>
									
								<th>dictionaryDetailId</th>
								<th>dataDictionaryId</th>
								<th>dataDictionaryCode</th>
								<th>dictionaryDetailCode</th>
								<th>dictionaryDetaiLabel</th>
								<th>dictionaryDetailNumber</th>
								<th>操作</th>
							</tr>
						</thead>
						<tbody>
					<c:forEach items="${arr1}" var="dictionarySKU">
								<tr>
							<th><input type="checkbox" id="title-table-checkbox"
									name="title-table-checkbox" /></th>
								<td>${dictionarySKU.dictionaryDetailId}</td>
								<td>${dictionarySKU.dataDictionaryId}</td>
								<td>${dictionarySKU.dataDictionaryCode}</td>
								<td>${dictionarySKU.dictionaryDetailCode}</td>
								<td>${dictionarySKU.dictionaryDetaiLabel}</td>
								<td>${dictionarySKU.dictionaryDetailNumber}</td>
								<td>
								<a href="DictionarySKUServlet.do?method=edit&dictionaryDetailId=${dictionarySKU.dictionaryDetailId}">编辑</a>
								<a href="DictionarySKUServlet.do?method=delete&dictionaryDetailId=${dictionarySKU.dictionaryDetailId}">删除</a>
								</td>
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




