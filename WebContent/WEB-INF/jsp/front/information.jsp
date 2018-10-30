<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title></title>

<link
	href="<%=request.getContextPath()%>/resource/front/css/information/information.css"
	rel="stylesheet" type="text/css" />
<link href="<%=request.getContextPath()%>/resource/front/css/common.css"
	rel="stylesheet" type="text/css" />
</head>
<body>
	<%@include file="bas_header.jsp"%>
	<!--我的京东 -->
	<div style="width: 1900px; height: 80px; background: #E2231A;">

		<ul class="wdjd_list" style="left: 500px; top: 28px">
			<li style="top: -20px"><img src="img/order/京东图标.png" /></li>
			<li style="font-size: 20px; top: -17px; left: -270px">我的京东</li>

			<li class="wdjd_list_li" style="border-radius: 20px; font-size: 12px">返回京东首页</li>
			<li>首页</li>
			<li>账户设置</li>
			<li>社区</li>
			<li>消息</li>
			<li style="top: -5px; left: -20px">
				<form method="post" action="">
					<input type="text" name="shoushuokuang"
						style="width: 140px; height: 32px; left: 4px; border: 0;" /> <input
						type="submit" value="搜索"
						style="width: 50px; height: 32px; border: 0px; background: #FFFFFF;" />
				</form>
			</li>
			<li
				style="background: #FFFFFF; width: 140px; height: 32px; color: #666666; top: -5px; margin-left: 210px;">

				<span style="margin-left: 30px; margin-top: 5">我的购物车 > </span>
			</li>
		</ul>
	</div>

	<div style="width: 1100px; height: 650px; margin: 0 auto">
		<div style="width: 180px; height: 650px; float: left">


			<ul class="set" style="margin-top: 20px">
				<li style="color: #333333"><strong>设置</strong></li>
				<li><a href="" style="color: #E4393C">个人信息</a></li>
				<li><a href="">账户安全</a></li>
				<li><a href="">我的尺码</a></li>
				<li><a href="">账号绑定</a></li>
				<li><a href="AddressServlet.do"><strong>收货地址</strong></a></li>
				<li><a href="">健康档案</a></li>
				<li><a href="">分享绑定</a></li>
				<li><a href="">邮件订阅</a></li>
				<li><a href="">应用授权</a></li>
				<li><a href="">快捷支付</a></li>
				<li><a href="">增票资质</a></li>
				<li><a href="">企业发票</a></li>
				<li><a href="">采购需求单</a></li>

			</ul>




		</div>
		<div style="width: 900px; height: 650px; float: left">
			
		<form action="InformationServlet.do" method="post">
			<ul class="add" style="margin-top: 50px">
				<li>基本信息 头像照片更多个人信息</li>
				<li>用户名：<input type="text" name="name" value="${listUserInfo.name}" /></li>
				
				
				<li>登录邮箱：${listUserInfo.email} 可用于登录，请牢记哦~</li>
				<li><input type="hidden" name="method" value="save" /> <%-- <input type="hidden" name="userId" value="${listUserInfo.userId}" />  --%>
				昵称:<input type="text" name="nickName" value="${listUserInfo.nickName}" style="height: 25px margin-bottom: 15px" /> 
				性别:<input type="radio" name="gender" checked="checked" value="男" /> 男<input type="radio" name="gender" value="女" />女<input type="radio" name="gender"vaLue="保密" />保密 <br>
					<label style="margin-top: 10px"></label>
					<div style="margin-top: 10px;margin-bottom:15px">
						生日：<input type="date" name="birthday" value="${listUserDate}" style="width: 300px" />
					</div> 
						<span>编号：</span> <input type="text" name="userCode" value="${listUserInfo.userCode}" style="margin-bottom:15px"></br>
						<span>昵称：</span> <input type="text" name="nickName" value="${listUserInfo.nickName}" style="margin-bottom:15px"></br>
						<span>身份证：</span> <input type="text" name="idCard" value="${listUserInfo.idCard}" style="margin-bottom:15px"></br>
						<span>手机：</span> <input type="text" name="mobile" value="${listUserInfo.mobile}" style="margin-bottom:15px"></br>
						<span>余额：${listUserInfo.balance}</span> <!-- <input type="text" name="balance" value=""style="margin-bottom:15px"></br> -->
					
					
					
					
					
					<%-- 邮箱: <input type="text" name="mail" value="${listUserInfo.email}" style="height: 25px; margin-top: 25px" /> --%> <br> <input type="submit" value="提交" class="botton" /></li>
		
			</ul>
		</form>
		</div>


		<div style="clear: both"></div>


	</div>




	<!--尾部-->
	<%@include file="bas_bottom.jsp"%>



</body>
</html>
