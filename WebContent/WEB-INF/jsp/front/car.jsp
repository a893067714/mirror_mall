<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<link href="<%=request.getContextPath()%>/resource/front/css/common.css" rel="stylesheet" type="text/css"/>
		<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resource/front/css/car/car.css"/>
		<title>京东结算页面</title>
	</head>

	<body>
		<!--tou-->
		<%@include file="bas_header.jsp"%>
		
		<!--search-->
		<div  style="height:87px;" >
		<!--第二版-->
		
			<div  style="width:134px;height:42px;float:left;left:255px;top:-15px" >
			<!--京东图标-->
				<img src="<%=request.getContextPath()%>/resource/front/img/search/京东.png" style="left: 85px"/>
			</div>
			<div style="margin-top:30px">
				<div>
					<form action=""method="post"style="margin-left:470px;float: left;">
						<input type="text" name="" style="width:620px;height:34px;border: 1px solid #F30213"/>
						<input type="submit"  value="搜索" style="width:82px;height:36px;background: #F30213;color:#FFFFFF;border: 0px;"/>
					</form>
				</div>
				<div  style="width:140px;height:36px;float:left;left:30px; border: 1px solid #DFDFDF;float:left" >
				<!--购物车--><div style="width:80px;height:34px;float:left;">
							<span style="font-size: 15px;top: 7px;left: 10px;">我的购物车</span>
							</div>
							<div style="float:left;width:50px;height: 28px;">
								<img src="<%=request.getContextPath()%>/resource/front/img/search/小购物车.png" style="left: 10px;top: 5px;"/>
							</div>
							<div style="clear: both;"></div>
				</div>	
				<div style="clear: both;"></div>
			</div>					
		</div>
		
		
		<!--中部-->
		<div class="content">
			<div class="nav">
				<div class="top_first_01 clearfix">
					<a href="">全部商品分类</a>
				</div>
				<div class="navitem clearfix"  >
					<ul class="navitem-grounds">
						<li>
							<a href="" target="_blank" style="color: #333333;font-size: 14px;">京东服饰</a>
						</li>
						<li>
							<a href="" target="_blank" style="color: #333333;font-size: 14px;">美妆馆</a>						
						</li>
						<li>
							<a href="" target="_blank" style="color: #333333;font-size: 14px;">超市</a>
						</li>
						<li>
							<a href="" target="_blank" style="color: #333333;font-size: 14px;">生鲜</a>
						</li>
						<li>
							<a href="" target="_blank" style="color: #333333;font-size: 14px;">全球购</a>
						</li>
						<li>
							<a href="" target="_blank" style="color: #333333;font-size: 14px;">闪购</a>
						</li>
						<li>
							<a href="" target="_blank" style="color: #333333;font-size: 14px;">拍卖</a>
						</li>
						<li>
							<a href="" target="_blank" style="color: #333333;font-size: 14px;">金融</a>
						</li>
					</ul>
				</div>	
			</div>
			<div class="de-frame">
				<div class="de-frame-side">
					<div class="de-frame-left clearfix">
						<div class="de-frame-left-h">
							<h3>商品已成功加入购物车！</h3>
						</div>
						<div class="de-frame-left-infor">
							<div class="de-frame-left-infor-img clearfix">
								<img src="<%=request.getContextPath()%>/resource/front/img/deal/huabi.jpg"/>
							</div>
							<div class="de-frame-left-infor-con1 clearfix">
								<a href="" target="_blank" title="【30天无理由退】ILISYA柔色眉笔眉粉双头造型笔 自动防水防汗不易晕染 06棕褐色">【30天无理由退】ILISYA柔色眉笔眉粉双头造型笔 自动防水防汗不易晕染 06棕褐色</a>
							</div>
							<div class="de-frame-left-infor-con2 clearfix">
								<span title="06棕褐色">颜色：06棕褐色</span>
								<span>/  数量：1</span>
							</div>
						</div>
					</div>
					<div class="de-frame-right clearfix">
						<a class="de-frame-right-1" href="" target="_blank">查看商品详情</a>
						<a class="de-frame-right-2" href="AddCartServlet.do" target="_blank">去购物车结算</a>
					</div>			
				</div>				
			</div>
			<div class="de-big-frame">
				<div class="de-samll-frame">
					<h3 class="de-samll-frame-1">购买了该商品的用户还购买了</h3>
				</div>
				<ul class="navitem-img clearfix">
					<li>						
						<div class="navitem-img-1">
							<img src="<%=request.getContextPath()%>/resource/front/img/deal/bibi.jpg" style="border: 1px solid #DDDDDD;"/>
						</div>
						<div class="navitem-img-2" title="韩后(Hanhoo) 三角形自动眉笔 #01 深棕色 0.26g ( 防水 持久 不晕染 自然立体 易上色)">
							<a href="" target="_blank">韩后(Hanhoo) 三角形自动眉笔 #01 深棕色 0.26g ( 防水 </a>
						</div>
						<div class="navitem-img-3">
							<span>
								<em style="font-size: 14px;">￥</em>
								<i style="font-size: 14px;">29.00</i>
							</span>															
							<a href="" title="购买本商品送赠品">赠品</a>
						</div>
						<div class="navitem-img-4">
							<a href="">加入购物车</a>
						</div>						
					</li>
					<li>
						<div class="navitem-img-1">
							<img src="<%=request.getContextPath()%>/resource/front/img/deal/bibi.jpg" style="border: 1px solid #DDDDDD;"/>
						</div>
						<div class="navitem-img-2" title="韩后(Hanhoo) 三角形自动眉笔 #01 深棕色 0.26g ( 防水 持久 不晕染 自然立体 易上色)">
							<a href="" target="_blank">韩后(Hanhoo) 三角形自动眉笔 #01 深棕色 0.26g ( 防水 </a>
						</div>
						<div class="navitem-img-3">
							<span>
								<em style="font-size: 14px;">￥</em>
								<i style="font-size: 14px;">29.00</i>
							</span>															
							<a href="" title="购买本商品送赠品">赠品</a>
						</div>
						<div class="navitem-img-4">
							<a href="">加入购物车</a>
						</div>						
					</li>
					<li>
						<div class="navitem-img-1">
							<img src="<%=request.getContextPath()%>/resource/front/img/deal/bibi.jpg" style="border: 1px solid #DDDDDD;"/>
						</div>
						<div class="navitem-img-2" title="韩后(Hanhoo) 三角形自动眉笔 #01 深棕色 0.26g ( 防水 持久 不晕染 自然立体 易上色)">
							<a href="" target="_blank">韩后(Hanhoo) 三角形自动眉笔 #01 深棕色 0.26g ( 防水 </a>
						</div>
						<div class="navitem-img-3">
							<span>
								<em style="font-size: 14px;">￥</em>
								<i style="font-size: 14px;">29.00</i>
							</span>															
							<a href="" title="购买本商品送赠品">赠品</a>
						</div>
						<div class="navitem-img-4">
							<a href="">加入购物车</a>
						</div>						
					</li>
					<li>
						<div class="navitem-img-1">
							<img src="<%=request.getContextPath()%>/resource/front/img/deal/bibi.jpg" style="border: 1px solid #DDDDDD;"/>
						</div>
						<div class="navitem-img-2" title="韩后(Hanhoo) 三角形自动眉笔 #01 深棕色 0.26g ( 防水 持久 不晕染 自然立体 易上色)">
							<a href="" target="_blank">韩后(Hanhoo) 三角形自动眉笔 #01 深棕色 0.26g ( 防水 </a>
						</div>
						<div class="navitem-img-3">
							<span>
								<em style="font-size: 14px;">￥</em>
								<i style="font-size: 14px;">29.00</i>
							</span>															
							<a href="" title="购买本商品送赠品">赠品</a>
						</div>
						<div class="navitem-img-4">
							<a href="">加入购物车</a>
						</div>						
					</li>
					<li>
						<div class="navitem-img-1">
							<img src="<%=request.getContextPath()%>/resource/front/img/deal/bibi.jpg" style="border: 1px solid #DDDDDD;"/>
						</div>
						<div class="navitem-img-2" title="韩后(Hanhoo) 三角形自动眉笔 #01 深棕色 0.26g ( 防水 持久 不晕染 自然立体 易上色)">
							<a href="" target="_blank">韩后(Hanhoo) 三角形自动眉笔 #01 深棕色 0.26g ( 防水 </a>
						</div>
						<div class="navitem-img-3">
							<span>
								<em style="font-size: 14px;">￥</em>
								<i style="font-size: 14px;">29.00</i>
							</span>															
							<a href="" title="购买本商品送赠品">赠品</a>
						</div>
						<div class="navitem-img-4">
							<a href="">加入购物车</a>
						</div>						
					</li>
					<li>
						<div class="navitem-img-1">
							<img src="<%=request.getContextPath()%>/resource/front/img/deal/bibi.jpg" style="border: 1px solid #DDDDDD;"/>
						</div>
						<div class="navitem-img-2" title="韩后(Hanhoo) 三角形自动眉笔 #01 深棕色 0.26g ( 防水 持久 不晕染 自然立体 易上色)">
							<a href="" target="_blank">韩后(Hanhoo) 三角形自动眉笔 #01 深棕色 0.26g ( 防水 </a>
						</div>
						<div class="navitem-img-3">
							<span>
								<em style="font-size: 14px;">￥</em>
								<i style="font-size: 14px;">29.00</i>
							</span>															
							<a href="" title="购买本商品送赠品">赠品</a>
						</div>
						<div class="navitem-img-4">
							<a href="">加入购物车</a>
						</div>						
					</li>
					<li>
						<div class="navitem-img-1">
							<img src="<%=request.getContextPath()%>/resource/front/img/deal/bibi.jpg" style="border: 1px solid #DDDDDD;"/>
						</div>
						<div class="navitem-img-2" title="韩后(Hanhoo) 三角形自动眉笔 #01 深棕色 0.26g ( 防水 持久 不晕染 自然立体 易上色)">
							<a href="" target="_blank">韩后(Hanhoo) 三角形自动眉笔 #01 深棕色 0.26g ( 防水 </a>
						</div>
						<div class="navitem-img-3">
							<span>
								<em style="font-size: 14px;">￥</em>
								<i style="font-size: 14px;">29.00</i>
							</span>															
							<a href="" title="购买本商品送赠品">赠品</a>
						</div>
						<div class="navitem-img-4">
							<a href="">加入购物车</a>
						</div>						
					</li>
					<li>
						<div class="navitem-img-1">
							<img src="<%=request.getContextPath()%>/resource/front/img/deal/bibi.jpg" style="border: 1px solid #DDDDDD;"/>
						</div>
						<div class="navitem-img-2" title="韩后(Hanhoo) 三角形自动眉笔 #01 深棕色 0.26g ( 防水 持久 不晕染 自然立体 易上色)">
							<a href="" target="_blank">韩后(Hanhoo) 三角形自动眉笔 #01 深棕色 0.26g ( 防水 </a>
						</div>
						<div class="navitem-img-3">
							<span>
								<em style="font-size: 14px;">￥</em>
								<i style="font-size: 14px;">29.00</i>
							</span>															
							<a href="" title="购买本商品送赠品">赠品</a>
						</div>
						<div class="navitem-img-4">
							<a href="">加入购物车</a>
						</div>						
					</li>
				</ul>
				<div class="de-big-frame-list">
					<div class="de-big-frame-list-inner clearfix">
						<ul>
							<li>1</li>
							<li>2</li>
							<li>3</li>
							<li>4</li>							
						</ul>
					</div>
				</div>
			</div>
			<div class="de-big-frame">
				<div class="de-samll-frame">
					<h3 class="de-samll-frame-2">您可能还需要</h3>
				</div>
				<ul class="navitem-img clearfix">
					<li>						
						<div class="navitem-img-1">
							<img src="<%=request.getContextPath()%>/resource/front/img/deal/bibi.jpg" style="border: 1px solid #DDDDDD;"/>
						</div>
						<div class="navitem-img-2" title="韩后(Hanhoo) 三角形自动眉笔 #01 深棕色 0.26g ( 防水 持久 不晕染 自然立体 易上色)">
							<a href="" target="_blank">韩后(Hanhoo) 三角形自动眉笔 #01 深棕色 0.26g ( 防水 </a>
						</div>
						<div class="navitem-img-3">
							<span>
								<em style="font-size: 14px;">￥</em>
								<i style="font-size: 14px;">29.00</i>
							</span>															
							<a href="" title="购买本商品送赠品">赠品</a>
						</div>
						<div class="navitem-img-4">
							<a href="">加入购物车</a>
						</div>						
					</li>
					<li>
						<div class="navitem-img-1">
							<img src="<%=request.getContextPath()%>/resource/front/img/deal/bibi.jpg" style="border: 1px solid #DDDDDD;"/>
						</div>
						<div class="navitem-img-2" title="韩后(Hanhoo) 三角形自动眉笔 #01 深棕色 0.26g ( 防水 持久 不晕染 自然立体 易上色)">
							<a href="" target="_blank">韩后(Hanhoo) 三角形自动眉笔 #01 深棕色 0.26g ( 防水 </a>
						</div>
						<div class="navitem-img-3">
							<span>
								<em style="font-size: 14px;">￥</em>
								<i style="font-size: 14px;">29.00</i>
							</span>															
							<a href="" title="购买本商品送赠品">赠品</a>
						</div>
						<div class="navitem-img-4">
							<a href="">加入购物车</a>
						</div>						
					</li>
					<li>
						<div class="navitem-img-1">
							<img src="<%=request.getContextPath()%>/resource/front/img/deal/bibi.jpg" style="border: 1px solid #DDDDDD;"/>
						</div>
						<div class="navitem-img-2" title="韩后(Hanhoo) 三角形自动眉笔 #01 深棕色 0.26g ( 防水 持久 不晕染 自然立体 易上色)">
							<a href="" target="_blank">韩后(Hanhoo) 三角形自动眉笔 #01 深棕色 0.26g ( 防水 </a>
						</div>
						<div class="navitem-img-3">
							<span>
								<em style="font-size: 14px;">￥</em>
								<i style="font-size: 14px;">29.00</i>
							</span>															
							<a href="" title="购买本商品送赠品">赠品</a>
						</div>
						<div class="navitem-img-4">
							<a href="">加入购物车</a>
						</div>						
					</li>
					<li>
						<div class="navitem-img-1">
							<img src="<%=request.getContextPath()%>/resource/front/img/deal/bibi.jpg" style="border: 1px solid #DDDDDD;"/>
						</div>
						<div class="navitem-img-2" title="韩后(Hanhoo) 三角形自动眉笔 #01 深棕色 0.26g ( 防水 持久 不晕染 自然立体 易上色)">
							<a href="" target="_blank">韩后(Hanhoo) 三角形自动眉笔 #01 深棕色 0.26g ( 防水 </a>
						</div>
						<div class="navitem-img-3">
							<span>
								<em style="font-size: 14px;">￥</em>
								<i style="font-size: 14px;">29.00</i>
							</span>															
							<a href="" title="购买本商品送赠品">赠品</a>
						</div>
						<div class="navitem-img-4">
							<a href="">加入购物车</a>
						</div>						
					</li>
					<li>
						<div class="navitem-img-1">
							<img src="<%=request.getContextPath()%>/resource/front/img/deal/bibi.jpg" style="border: 1px solid #DDDDDD;"/>
						</div>
						<div class="navitem-img-2" title="韩后(Hanhoo) 三角形自动眉笔 #01 深棕色 0.26g ( 防水 持久 不晕染 自然立体 易上色)">
							<a href="" target="_blank">韩后(Hanhoo) 三角形自动眉笔 #01 深棕色 0.26g ( 防水 </a>
						</div>
						<div class="navitem-img-3">
							<span>
								<em style="font-size: 14px;">￥</em>
								<i style="font-size: 14px;">29.00</i>
							</span>															
							<a href="" title="购买本商品送赠品">赠品</a>
						</div>
						<div class="navitem-img-4">
							<a href="">加入购物车</a>
						</div>						
					</li>
					<li>
						<div class="navitem-img-1">
							<img src="<%=request.getContextPath()%>/resource/front/img/deal/bibi.jpg" style="border: 1px solid #DDDDDD;"/>
						</div>
						<div class="navitem-img-2" title="韩后(Hanhoo) 三角形自动眉笔 #01 深棕色 0.26g ( 防水 持久 不晕染 自然立体 易上色)">
							<a href="" target="_blank">韩后(Hanhoo) 三角形自动眉笔 #01 深棕色 0.26g ( 防水 </a>
						</div>
						<div class="navitem-img-3">
							<span>
								<em style="font-size: 14px;">￥</em>
								<i style="font-size: 14px;">29.00</i>
							</span>															
							<a href="" title="购买本商品送赠品">赠品</a>
						</div>
						<div class="navitem-img-4">
							<a href="">加入购物车</a>
						</div>						
					</li>
					<li>
						<div class="navitem-img-1">
							<img src="<%=request.getContextPath()%>/resource/front/img/deal/bibi.jpg" style="border: 1px solid #DDDDDD;"/>
						</div>
						<div class="navitem-img-2" title="韩后(Hanhoo) 三角形自动眉笔 #01 深棕色 0.26g ( 防水 持久 不晕染 自然立体 易上色)">
							<a href="" target="_blank">韩后(Hanhoo) 三角形自动眉笔 #01 深棕色 0.26g ( 防水 </a>
						</div>
						<div class="navitem-img-3">
							<span>
								<em style="font-size: 14px;">￥</em>
								<i style="font-size: 14px;">29.00</i>
							</span>															
							<a href="" title="购买本商品送赠品">赠品</a>
						</div>
						<div class="navitem-img-4">
							<a href="">加入购物车</a>
						</div>						
					</li>
					<li>
						<div class="navitem-img-1">
							<img src="<%=request.getContextPath()%>/resource/front/img/deal/bibi.jpg" style="border: 1px solid #DDDDDD;"/>
						</div>
						<div class="navitem-img-2" title="韩后(Hanhoo) 三角形自动眉笔 #01 深棕色 0.26g ( 防水 持久 不晕染 自然立体 易上色)">
							<a href="" target="_blank">韩后(Hanhoo) 三角形自动眉笔 #01 深棕色 0.26g ( 防水 </a>
						</div>
						<div class="navitem-img-3">
							<span>
								<em style="font-size: 14px;">￥</em>
								<i style="font-size: 14px;">29.00</i>
							</span>															
							<a href="" title="购买本商品送赠品">赠品</a>
						</div>
						<div class="navitem-img-4">
							<a href="">加入购物车</a>
						</div>						
					</li>
				</ul>
				<div class="de-big-frame-list">
					<div class="de-big-frame-list-inner clearfix">
						<ul>
							<li>1</li>
							<li>2</li>
							<li>3</li>
							<li>4</li>							
						</ul>
					</div>
				</div>
			</div>
			
		</div>
			

	<!--tail-->
		<%@include file="bas_bottom.jsp"%>
	</body>
</html>