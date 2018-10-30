<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="UTF-8">
		<title>京东-发表评价</title>
		<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resource/front/css/common.css"/>
		<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resource/front/css/evaluate/evaluate.css"/>
	</head>
	<body>
		<div class="all">
			<!--header-->
			<%@include file="bas_header.jsp"%>

			<!--search-->
			<div style="width:1903px;height: 80px;background:#E2231A;">
					<ul class="wdjd_list" style="left:500px;top:28px" >
						<li style="top:-20px"><img src="<%=request.getContextPath()%>/resource/front/img/order/京东图标.png"/></li>
						<li style="font-size:20px;top:-17px;left:-270px">我的京东</li>
						
						<li class="wdjd_list_li" style="font-size: 12px;width: 80px;text-align: center;">返回京东首页</li>
						<li>首页</li>
						<li>账户设置</li>
						<li>社区</li>
						<li>消息</li>	
						<li style="top:-5px;left:-20px">	
							<from method="post" action="">
							<input type="text" name="shoushuokuang"  style="width:140px;height: 32px;left:4px;border: 0px;"/>
							<input type="submit" value="搜索" style="width:50px;height: 32px;border: 0px;background: #FFFFFF;top: 1px;"/>
							</from>
						</li>
						<li style=" background:#FFFFFF; width:140px; height:32px;color:#666666;top:-5px;margin-left: 210px;">
							
							<span style="left: 30px;top: 3px;">我的购物车  > </span>
						</li>
					</ul>		
			</div>
		
			<div class="middle">
				<div class="middle-01">
					<h3>评价订单</h3>
					<span style="right: 20px;">订单号：999999999</span>
					<span>2018-07-20 19:00:43</span>
				</div>
				<div class="middle-02">
					<div class="middle-02-left clearfix">
						<img src="<%=request.getContextPath()%>/resource/front/img/evaluate/kuaidiyuan.jpg"/>
						<div class="middle-02-left-con clearfix">
							<span style="font-size: 14px;">物流服务评价</span><br>
							<span>快递员   2222-333333</span><br>
							<span>福建厦门市厦门杏林中心站员工</span>
						</div>
					</div>
					<div class="middle-02-right clearfix">
						<span>快递包装</span>
						<img src="<%=request.getContextPath()%>/resource/front/img/evaluate/星级.png"/>
						<span>送货速度</span>
						<img src="<%=request.getContextPath()%>/resource/front/img/evaluate/星级.png"/>
						<span>配送员服务态度</span>
						<img src="<%=request.getContextPath()%>/resource/front/img/evaluate/星级.png"/>
					</div>
				</div>
				<div class="middle-03">
					<div class="middle-03-left clearfix">
						<img src="<%=request.getContextPath()%>/resource/front/img/evaluate/huabi.jpg"/>
						<p>对方立刻就更好使国家牛市的开发建设的皮哦但是发烧的方式</p>
						<span>¥189.00</span>
					</div>
					<div class="middle-03-right clearfix">
						<div class="middle-03-right-top">
							<span>商品评分</span>
							<img src="<%=request.getContextPath()%>/resource/front/img/evaluate/星级.png"/>
						</div>
						<div class="middle-03-right-centre">
							<div class="middle-03-right-centre-info">
								买家印象
							</div>
							<div class="middle-03-right-centre-impress clearfix">
								<span>我的印象</span>
								<span>我的印象</span>
								<span>我的印象</span>
								<span>我的印象</span>
								<span>我的印象</span>
								<span>我的印象</span>
								<span>我的印象</span>
								<span>我的印象</span>
								<span>我的印象</span>
								<span>我的印象</span>
								<span>自定义印象</span>			
							</div>		
						</div>
						<div class="middle-03-right-bottom">
							<div class="middle-03-right-bottom-info">
								<span>评价晒单</span>
							</div>
							<div class="middle-03-right-bottom-impress clearfix">
								<div class="middle-03-right-bottom-impress-1">
									<textarea name="" rows="" cols=""></textarea>
									<div class="middle-03-right-bottom-impress-1-a">
										<span>0 / 500（评价多于10个字,有机会奖励京豆哦~）</span>
									</div>
								</div>
								<div class="middle-03-right-bottom-impress-2 clearfix">
									<span>电脑传图</span>
								</div>
								<div class="middle-03-right-bottom-impress-3 clearfix">
									<span>手机传图</span>
								</div>
								<div class="middle-03-right-bottom-impress-4">
									<span>
										共
										<em>0</em>
										 张,还能上传 
										<em>10</em>
										张			
									</span>
								</div>
							</div>		
						</div>
					</div>
				</div>
				<div class="middle-04">
					<a href="">发表</a>
					<input type="checkbox" checked="checked" />
					<span>匿名评价</span>
				</div>
			</div>
			<!--tail-->
			<%@include file="bas_bottom.jsp"%>
		</div>
	</body>
</html>
