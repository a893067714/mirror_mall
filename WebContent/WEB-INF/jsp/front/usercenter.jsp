<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<meta charset="UTF-8">
<title></title>
<link
	href="<%=request.getContextPath()%>/resource/front/css/usercenter/usercenter.css"
	rel="stylesheet" type="text/css" />
<link href="<%=request.getContextPath()%>/resource/front/css/common.css"
	rel="stylesheet" type="text/css" />
</head>
<body>
	<%@include file="bas_header.jsp"%>
	<!--中部-->
	<div style="width: 1200px; height: 1400px; margin: 0 auto;">
		<!--左边-->
		<div style="width: 170px; height: 1400px; float: left">
			<ul class="order_core">
				<li style="color: #333333;"><strong style="font-size: 17px;">订单中心</strong></li>
				<li><a href="">我的订单</a></li>
				<li><a href="">评价晒单</a></li>
				<li style="color: #333333; margin-top: 35px"><strong
					style="font-size: 17px;">我的钱包</strong></li>
				<li><a href="">优惠券</a></li>
				<li><a href="">京豆</a></li>
				<li><a href="">白条</a></li>
				<li><a href="">小金库</a></li>
				<li><a href="">礼品卡</a></li>
				<li><a href="">更多></a></li>
				<li style="color: #333333; margin-top: 35px"><strong
					style="font-size: 17px;">我的关注</strong></li>
				<li><a href="">关注商品</a></li>
				<li><a href="">关注店铺</a></li>
				<li><a href="">内容收藏</a></li>
				<li style="color: #333333; margin-top: 35px"><strong
					style="font-size: 17px;">我的活动</strong></li>
				<li><a href="">我的预约</a></li>
				<li><a href="">我的拍卖</a></li>
				<li><a href="">我的回收单</a></li>
				<li><a href="">我的必购码</a></li>
				<li><a href="">我的口令</a></li>
				<li><a href="">更多></a></li>
				<li style="color: #333333; margin-top: 35px"><strong
					style="font-size: 17px;">客户服务</strong></li>
				<li><a href="">返修退换货</a></li>
				<li><a href="">价格保护</a></li>
				<li><a href="">我的发票</a></li>
				<li><a href="">购买咨询</a></li>
				<li><a href="">交易纠纷</a></li>
				<li><a href="">更多></a></li>
				<li style="color: #333333; margin-top: 35px"><strong
					style="font-size: 17px;">特色业务</strong></li>
				<li><a href="">我的营业厅</a></li>
				<li><a href="">京东通信</a></li>
				<li><a href="">节能补贴</a></li>
				<li><a href="">医疗服务</a></li>
				<li><a href="">流量加油站</a></li>
				<li><a href="">更多</a></li>
			</ul>
		</div>
		<!--中间-->
		<div style="width: 1000px; height: 1400px; float: left; left: 25px">
			<div style="width: 1000px; height: 250px;">
				<div
					style="width: 250px; height: 250px; background: #E2231A; float: left">
					<div style="width: 250px; height: 100px;">
						<img style="margin-left: 75px" src="img/userorder/用户.png" />
					</div>
					<div>
						<strong style="font-size: 15px; color: #FFFFFF; left: 75px">${listUserInfo.name}</strong>
					</div>
					<div style="top: 15px; height: 50px">
						<div class="xiaobai" style="left: 25px">
							<span style="float: left; left: 7px; top: 4px">京东享值2015</span>
							<div style="clear: both;"></div>
						</div>
						<div class="xiaobai" style="left: 35px">
							<span style="float: left; left: 7px; top: 4px">小白信用65.7</span>

						</div>
					</div>
					<div
						style="width: 250px; height: 60px; background: #232331; top: 20px">
						<div
							style="width: 130px; height: 40px; float: left; left: 12px; top: 5px">
							<span
								style="float: left; left: 7px; top: 4px; color: #F4CA3A; font-size:"><strong
								style="left: 7px">开通PLUS会员尊享</strong></br>全年360元运费券礼包</span>
						</div>
						<div
							style="width: 70px; height: 30px; background: #F4CA3A; float: left; left: 30px; top: 12px">
							<span style="float: left; left: 9px; top: 6px">立即开通</span>
						</div>
						<div style="clear: both;"></div>
					</div>
				</div>
				<div style="width: 745px; height: 250px; float: left">
					<div style="height: 60px;">
						<span style="float: left; font-size: 17px; top: 15px; left: 20px">我的钱包</span>
					</div>
					<div style="height: 190px;">
						<ul style="top: 35px; left: 18px" class="benifit clearfix">
							<li><strong style="font-size: 22px">0</strong></li>
							<li><strong style="font-size: 22px">149</strong></li>
							<li><strong style="font-size: 22px">${listUserInfo.balance}</strong></li>
							<li><strong style="font-size: 22px">--</strong></li>
							<li><strong style="font-size: 22px">0.00</strong></li>
							<li>优惠券</li>
							<li>京豆</li>
							<li>余额</li>
							<li>暂未开通白条</li>
							<li>小金库昨日收益</br> <span style="color: #999999">总额0.00</span></li>
							<li style="color: #4184E8">领券</li>
							<li style="color: #4184E8">赚京豆|花京豆</li>
							<li style="color: #4184E8">充值</li>
							<li style="color: #4184E8">立即开通</li>
							<li style="color: #4184E8">转入小金库，马上赚钱</li>
						</ul>


					</div>


				</div>
				<div style="clear: both;"></div>
			</div>


			<div style="width: 1000px; height: 800px; top: 30px">
				<div style="width: 700px; height: 800px; float: left;">
					<div style="width: 700px; height: 60px;">
						<span style="font-size: 17px; color: #333333;"> 我的订单 </span>
					</div>
					<div style="width: 700px; height: 100px;">
						<div style="width: 137px; height: 100px; float: left;">
							<div style="left: 40px">
								<img src="img/userorder/订单1.png" />
							</div>
							<div style="width: 50px; height: 25px; left: 45px;">待付款</div>


						</div>
						<div style="width: 137px; height: 100px; float: left;">
							<div style="left: 40px">
								<img src="img/userorder/订单2.png" />
							</div>
							<div style="width: 50px; height: 25px; left: 45px;">待收货</div>

						</div>
						<div style="width: 137px; height: 100px; float: left;">
							<div style="left: 40px">
								<img src="img/userorder/订单3.png" />
							</div>
							<div style="width: 50px; height: 25px; left: 45px; top: -2px;">
								待评价</div>

						</div>
						<div style="width: 137px; height: 100px; float: left;">
							<div style="left: 40px">
								<img src="img/userorder/订单4.png" />
							</div>
							<div style="width: 70px; height: 25px; left: 45px;">退换/售后</div>

						</div>
						<div style="width: 137px; height: 100px; float: left;">
							<div style="left: 40px">
								<img src="img/userorder/订单5.png" />
							</div>
							<div style="width: 50px; height: 25px; left: 45px; top: 4px;">
								全部订单</div>

						</div>
						<div style="clear: both;"></div>
					</div>
					<div style="width: 700px; height: 220px;">
						<div
							style="float: left; width: 100px; height: 100px; left: 150px; top: 70px">
							<img src="img/userorder/灰色购物车.png" />
						</div>
						<div
							style="float: left; width: 330px; height: 25px; color: #999999; left: 150px; top: 110px">您买的东西太少了，这里都空空的，快去挑选合适的商品吧！</div>
						<div style="clear: both;"></div>
					</div>
					<div style="width: 700px; height: 360px; background: #F5CA3A;">
						<div style="width: 700px; height: 60px; top: 20px">
							<div
								style="width: 80; height: 30; float: left; font-size: 17px; left: 20px">PLUS尊享</div>
							<div
								style="width: 100px; height: 25px; background: #2C2E40; float: left; left: 500px">
								<span style="color: #F5CA3A; float: left; left: 5px; top: 3px">

									开通PLUS会员> </span>
							</div>
							<div style="clear: both;"></div>
						</div>
						<div
							style="width: 680px; height: 275px; top: 15px; background: #FFFFFF; left: 10px">
							<img src="img/userorder/偷工减料图片.png" style="left: 20px" />
						</div>
					</div>
				</div>
				<div style="width: 290px; height: 800px; float: left; left: 20px">

					<div style="height: 80px; font-size: 17px">我的关注</div>
					<div style="height: 30px;">
						<span style="font-size: 17px">0</span> <span
							style="font-size: 17px; left: 80px">0</span> <span
							style="font-size: 17px; left: 160px">0</span>
					</div>
					<div style="height: 80px;">
						<span style="color: #666666">商品关注</span> <span
							style="left: 40px; color: #666666"> 店铺关注</span> <span
							style="left: 90px; color: #666666"> 收藏内容</span>
					</div>
					<div style="height: 60px; font-size: 17px">
						浏览记录 <a href="" style="left: 160px;">更多></a>
					</div>
					<div style="height: 150px;">
						<img src="img/userorder/浏览手机.png" />
					</div>
					<div style="height: 60px; font-size: 17px">生活服务</div>
					<div style="height: 160px;">
						<ul class="shfw clearfix">
							<li><div>
									<img src="img/userorder/生活1.png" />
								</div>话费</li>
							<li><div>
									<img src="img/userorder/生活2.png" />
								</div>机票</li>
							<li><div>
									<img src="img/userorder/生活3.png" />
								</div>酒店</li>
							<li><div>
									<img src="img/userorder/生活4.png" />
								</div>企业购</li>
							<li><div>
									<img src="img/userorder/生活5.png" />
								</div>加油卡</li>
							<li><div>
									<img src="img/userorder/生活6.png" />
								</div>电影票</li>
						</ul>
					</div>



				</div>
				<div style="clear: both;"></div>
			</div>
			<div style="width: 690px; height: 350px;">
				<div style="height: 60px;">
					<span style="font-size: 17px">买什么</span> <span
						style="color: 12px; color: #999999">看看达人们都在购买的商品</span> <a href=""
						style="left: 450px"> 更多></a>
				</div>
				<div>
					<div style="width: 330px; height: 250px; float: left;">
						<div style="height: 30px; font-size: 15px">VR大世界</div>
						<div style="height: 30px; width: 100px left:30px; color: #2D87EC">
							素闻陌上花开</div>
						<div>
							<img src="img/userorder/图图1.png" />
						</div>

					</div>
					<div style="width: 330px; height: 250px; float: left;">
						<div style="height: 30px; font-size: 15px">好用不卡高性价比的手机推荐</div>
						<div style="height: 30px; width: 100px left:30px; color: #2D87EC">
							素闻陌上花开</div>
						<div>
							<img src="img/userorder/图图2.png" />
						</div>
					</div>
					<div style="clear: both;"></div>
				</div>
			</div>
		</div>
	</div>
	<!--尾部-->
	<%@include file="bas_bottom.jsp"%>
</html>
