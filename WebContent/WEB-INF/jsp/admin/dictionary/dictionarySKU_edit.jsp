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
				<form action="DictionarySKUServlet.do" method="get"
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
									type="hidden" name="dictionaryDetailId" value="${dictionarySKU.dictionaryDetailId}" />
								<div class="control-group">
									<label class="control-label">dataDictionaryId</label>
									<div class="controls">
										<input type="text" name="dataDictionaryId"
											value="${dictionarySKU.dataDictionaryId}"  class="span11">
									</div>
								</div>
								<div class="control-group">
									<label class="control-label">dataDictionaryCode</label>
									<div class="controls">
										<input type="text" name="dataDictionaryCode"
											value="${dictionarySKU.dataDictionaryCode}" class="span11">
									</div>
								</div>
								<div class="control-group">
									<label class="control-label">dictionaryDetailCode</label>
									<div class="controls">
										<input type="text" name="dictionaryDetailCode" value="${dictionarySKU.dictionaryDetailCode}"
											class="span11">
									</div>
								</div>
								<div class="control-group">
									<label class="control-label">dictionaryDetaiLabel</label>
									<div class="controls">
										<input type="text" name="dictionaryDetaiLabel" value="${dictionarySKU.dictionaryDetaiLabel}"
											class="span11">
									</div>
								</div>
								<div class="control-group">
									<label class="control-label">dictionaryDetailNumber</label>
									<div class="controls">
										<input type="text" name="dictionaryDetailNumber" value="${dictionarySKU.dictionaryDetailNumber}"
											class="span11">
									</div>
								</div>
								<div class="form-actions">
									<button type="submit" class="btn btn-success">保存</button>
									<a href="DictionaryServlet.do?method=list">取消</a>
									
									

									
									
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