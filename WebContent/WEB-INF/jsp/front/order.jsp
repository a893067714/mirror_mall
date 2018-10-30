<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>我的订单</title>
<link
	href="<%=request.getContextPath()%>/resource/front/css/order/order.css"
	rel="stylesheet" type="text/css" />
<link href="<%=request.getContextPath()%>/resource/front/css/common.css"
	rel="stylesheet" type="text/css" />
</head>
<style>
.img_prd {
	width: 75px;
	height: 75px;
}

#listorder td {
	width: 200px;
}
</style>
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
			<li style="top: -5px; left: -20px"><from method="post" action="">
				<input type="text" name="shoushuokuang"
					style="width: 140px; height: 32px; left: 4px; border: 0;" /> <input
					type="submit" value="搜索"
					style="width: 50px; height: 32px; border: 0px; background: #FFFFFF; top: -1px" />
				</from></li>
			<li
				style="background: #FFFFFF; width: 140px; height: 32px; color: #666666; top: -5px; margin-left: 210px;">

				<span style="margin-left: 30px; margin-top: 5">我的购物车 > </span>
			</li>
		</ul>
	</div>

	<div style="margin: 0 auto; width: 1300px; margin-top: 20px">
		<div style="width: 120px; height: auto; float: left;">

			<ul class="order_core">
				<li style="color: #333333"><strong>订单中心</strong></li>
				<li><a href="" style="color: #E4393C"><strong>我的订单</strong></a></li>
				<li><a href="">我的活动</a></li>
				<li><a href="">评价晒单</a></li>
				<li><a href="">我的常购商品</a></li>
				<li><a href="">购物助手</a></li>
				<li style="color: #333333; margin-top: 20px"><strong>关注中心</strong></li>
				<li><a href="">关注的商品</a></li>
				<li><a href="">关注的店铺</a></li>
				<li><a href="">关注的专辑</a></li>
				<li><a href="">收藏的内容</a></li>
				<li><a href="">关注的活动</a></li>
				<li style="color: #333333; margin-top: 20px"><strong>资产中心</strong></li>
				<li><a href="">小金库</a></li>
				<li><a href="">京东白条</a></li>
				<li><a href="">领货码</a></li>
				<li><a href="">余额</a></li>
				<li><a href="">优惠券</a></li>
				<li><a href="">礼品卡</a></li>
				<li><a href="">京豆</a></li>
				<li><a href="">京东钢镚</a></li>
				<li style="color: #333333; margin-top: 20px"><strong>特色业务</strong></li>
				<li><a href="">我的营业厅</a></li>
				<li><a href="">京东通信</a></li>
				<li><a href="">定期购</a></li>
				<li><a href="">我的回收单</a></li>
				<li><a href="">节能补贴</a></li>
				<li><a href="">医药服务</a></li>
				<li><a href="">流量加油站</a></li>
				<li><a href="">黄金托管</a></li>
				<li><a href="">视频教育订单</a></li>
				<li><a href="">海外房产预约</a></li>
				<li><a href="">我的全球购</a></li>
				<li><a href="">装修服务</a></li>
				<li><a href="">我的拍卖</a></li>
				<li><a href="">我的集运</a></li>
				<li style="color: #333333; margin-top: 20px"><strong>客户服务</strong></li>
				<li><a href="">返修退换货</a></li>
				<li><a href="">价格保护</a></li>
				<li><a href="">意见建议</a></li>
				<li><a href="">我的问答</a></li>
				<li><a href="">购买咨询</a></li>
				<li><a href="">交易纠纷</a></li>
				<li><a href="">京东维修</a></li>
				<li><a href="">上门预约服务</a></li>
				<li><a href="">我的发票</a></li>
				<li><a href="">举报中心</a></li>
				<li style="color: #333333; margin-top: 20px"><strong>设置</strong></li>
				<li><a href="">个人信息</a></li>
				<li><a href="">收货地址</a></li>
			</ul>
			<div style="margin-left: 20px">
				<img src="img/order/被绿.jpg" />
			</div>
		</div>
		<div
			style="width: 1100px; height: auto; float: left; margin-left: 20px">
			<div style="height: 50px; margin-bottom: 50px;">
				<span style="float: left; margin-top: 15px;"> 我的订单 </span>
				<div style="clear: both;"></div>
			</div>
			<div id="olderlist" style="width: 1100px; height: auto;">
				<ul class="all_orders clearfix">
					<li><a href=""
						style="color: #E4393C; border-bottom: 1px solid #E4393C;"><strong>全部订单</strong></a></li>
					<li><a href=""><span>待付款</span></a></li>
					<li><a href=""><span>待收货</span></a></li>
					<li><a href="" style="margin-right: 60px"><span>待评价</span></a></li>
					<li><a href="" style="margin-right: 60px"><strong><span>我的常购商品</span></strong></a></li>
					<li><a href="" style="margin-right: 60px"><strong><span>好货·清仓</span></strong></a></li>
					<li><a href="" style="color: #999999;"><span>订单回收站</span></a></li>
					<li style="margin-left: 140px"><from method="post" action="">
						<input type="text" name="shoushuokuang"
							style="width: 170px; height: 23px; left: 4px; border: 1px solid #CCCCCC;" />
						<input type="submit" value="搜索"
							style="width: 50px; height: 26px; border: 0px; border: 1px solid #DDDDDD;" />
						</from></li>

					<li
						style="height: 25px; border: 1px solid #DDDDDD; width: 50px; right: 1px; position: absolute;">
						<span style="float: left; margin-top: 2px; margin-left: 13px">
							高级 </span>
						<div style="clear: both;"></div>
					</li>
				</ul>
				<ul class="recent_orders clearfix" style="margin-top: 30px">
					<li style="margin-left: 30px; margin-right: 230px">近三个月的订单</li>
					<li style="margin-right: 235px">订单详情</li>
					<li style="margin-right: 120px">收货人</li>
					<li style="margin-right: 50px">金额</li>
					<li style="margin-right: 100px">全部状态</li>
					<li>操作</li>
				</ul>
				<!-- <span style="float:left;font-size:18px;top:170px;left:450px;color:#666666">最近还没有下订单哦~</span> -->

				<form action="" style="border: 1px solid #000000">
					<c:forEach items="${orderViews}" var="orderView">
						<div style="border: 1px solid #000000">
							订单编号<span>${orderView.orderCode}</span>
							&nbsp;&nbsp;&nbsp;&nbsp;订单创建时间<span>${orderView.createDate}</span>
							&nbsp;&nbsp;&nbsp;&nbsp;订单总金额<span>${orderView.totalPrice}</span>

							<a
								href="OrderServlet.do?method=delOrder&orderId=${orderView.orderId}">删除</a>
							<hr>





							<table style="border: 1px solid #000000">
								<tr>
									<th>图片</th>
									<th>时间</th>
									<th>数量</th>
									<th>价格</th>
									<th>签收时间</th>
									<th>评价状态</th>
									<th>快递公司</th>
									<th>快递状态</th>
									<th>签收状态</th>
									<th>发货状态</th>
									<th>付款状态</th>
									<th>操作</th>
								</tr>
								<c:forEach items="${orderView.listOrderSKU}" var="c">
									<tbody>
										<tr id="listorder">
											<td><img class="img_prd"
												src="<%=request.getContextPath()%>/resource/${c.orderSKUPic}" /></td>
											<td>${c.evalDate}</td>
											<td>${c.amount}</td>
											<td>${c.price}</td>
											<td>${c.signDate}</td>
											<td>${c.evalStatLabel}</td>
											<td>${c.logDoing}</td>
											<td>${c.logDoneLabel}</td>
											<td>${c.signStatLabel}</td>
											<td>${c.sendStatLabel}</td>
											<td>${orderView.payStat}</td>
											<td><a
												href="OrderServlet.do?method=delOrderSKU&orderDtlId=${c.orderDtlId}">删除</a></td>
										</tr>
									</tbody>
								</c:forEach>
							</table>

						</div>
					</c:forEach>
				</form>










				<div style="top: 200px; left: 251px">
					<!-- <div style="float:left;width:100px;height:25px;border: 1px solid #DDDDDD">
					<a href="" style="color:#333333"><span style="float:left;left:15px;top:5px">查看全部订单</span></a>
				</div>
				<div style="float:left;width:100px;height:25px;background:#E64346;">
					<a href="" style="color:#FFFFFF"><span style="float:left;left:20px;top:5px;">去首页看看</span></a>
					
				</div>
				<div style="clear: both;"></div> -->


				</div>
			</div>


		</div>
		<div style="clear: both;"></div>
	</div>



	<!--尾部-->
	<%@include file="bas_bottom.jsp"%>

</body>
</html>
