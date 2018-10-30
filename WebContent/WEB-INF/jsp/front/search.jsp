<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>京东搜索页框架</title>


<meta charset="utf-8" />

<link
	href="<%=request.getContextPath()%>/resource/front/css/search/test.css"
	rel="stylesheet" type="text/css" />
<link href="<%=request.getContextPath()%>/resource/front/css/common.css"
	rel="stylesheet" type="text/css" />
</head>

<link href="css/search/test.css" rel="stylesheet" type="text/css" />



<body>

	<%@include file="bas_header.jsp"%>

	<div style="height: 87;">
		<!--第二版-->

		<div style="width: 134; height: 42; float: left; left: 255; top: -15">
			<!--京东图标-->
			<img src="resource/front/img/search/京东.png" />


		</div>
		<div style="margin-top: 30px">
			<div>
				<form action="" method="post" style="margin-left: 470; float: left;">
					<input type="text" name=""
						style="width: 620; height: 34; border: 1px solid #F30213" /> <input
						type="submit" value="搜索"
						style="width: 82; height: 36; background: #F30213; color: #FFFFFF; border: 0;" />
				</form>
			</div>
			<div
				style="width: 140; height: 36; float: left; left: 30; border: 1px solid #DFDFDF; float: left">
				<!--购物车-->
				<div style="width: 80; height: 34; float: left;">
					<span style="font-size: 15px;">我的购物车</span>
				</div>
				<div style="float: left; width: 55; height: 34;">
					<img src="resource/front/img/search/小购物车.png" />
				</div>
				<div style="clear: both;"></div>
			</div>
			<div style="clear: both;"></div>
		</div>
		<div style="margin-left: -350">

			<ul class="jdnz clearfix">
				<li><a href="">2018新品女装</a>|</li>
				<li><a href="">连衣裙2018</a>|</li>
				<li><a href="">中老年女装</a>|</li>
				<li><a href="">连衣裙</a>|</li>
				<li><a href="">连衣裙短袖</a>|</li>
				<li><a href="">蕾丝雪纺衫</a>|</li>
				<li><a href="">t恤女</a>|</li>
				<li><a href="">连衣裙碎花</a>|</li>
				<li><a href="">连衣裙春</a>|</li>
			</ul>
		</div>

	</div>
	<!--第三版-->
	<!--全部商品分类-->
	<div style="height: 35; border-bottom: 3px solid #F30213">
		<div style="left: 232; height: 35; z-index: 1;">
			<ul class="qbspfl clearfix" style="font-size: 14px; color: #333333">
				<li class="qbsp"
					style="width: 210; background: #F30213; color: #F4F4F4; padding: 2;">
					<a href="" style="margin-left: 65"> 全部商品分类</a> <!--
					<ul class="qbsp_1">
					
				    	<li class="liebiao1"style="height:25;margin-top:10;">
				    		<div  class="dakuang1" style="width:1000;height:455;left:170">	
				    			
				    		</div>		    	
				    	</li>
				    	<li class="liebiao2"style="height:25;">
				    		<div  class="dakuang2" style="width:1000;height:455;left:170;margin-top:-25">	
				    		</div>
				    	</li>
				    	<li class="liebiao3"style="height:25;">
				    		<div  class="dakuang3" style="width:1000;height:455;left:170;margin-top:-50">	
				    		</div>
				    	</li >
				    	<li class="liebiao4"style="height:25;">
				    		<div  class="dakuang4" style="width:1000;height:455;left:170;margin-top:-75">	
				    		</div>
				    	</li>
				    	<li class="liebiao5"style="height:25;">
				    		<div  class="dakuang5" style="width:1000;height:455;left:170;margin-top:-100">	
				    		</div>
				    	</li>
				    	
				    	<li class="liebiao6"style="height:25;">
				    		<div  class="dakuang6" style="width:1000;height:455;left:170;margin-top:-125">	
				    		</div>
				    	</li>
				    	<li class="liebiao7"style="height:25;">
				    		<div  class="dakuang7" style="width:1000;height:455;left:170;margin-top:-150">	
				    		</div>
				    	</li>
				    	<li class="liebiao8"style="height:25;">
				    		<div  class="dakuang8" style="width:1000;height:455;left:170;margin-top:-175">	
				    		</div>
				    	</li>
				    	<li class="liebiao9"style="height:25;">
				    		<div  class="dakuang9" style="width:1000;height:455;left:170;margin-top:-200">	
				    		</div>
				    	</li>
				    	<li class="liebiao10"style="height:25;">
				    		<div  class="dakuang10" style="width:1000;height:455;left:170;margin-top:-225">	
				    		</div>
				    	</li>
				    	
				    	<li class="liebiao11"style="height:25;">
				    		<div  class="dakuang11" style="width:1000;height:455;left:170;margin-top:-250">	
				    		</div>
				    	</li>
				    	<li class="liebiao12"style="height:25;">
				    		<div  class="dakuang12" style="width:1000;height:455;left:170;margin-top:-275">	
				    		</div>
				    	</li>
				    	<li class="liebiao13"style="height:25;">
				    		<div  class="dakuang13" style="width:1000;height:455;left:170;margin-top:-300">	
				    		</div>
				    	</li>
				    	<li class="liebiao14"style="height:25;">
				    		<div  class="dakuang14" style="width:1000;height:455;left:170;margin-top:-325">	
				    		</div>
				    	</li>
				    	<li class="liebiao15"style="height:25;">
				    		<div  class="dakuang15" style="width:1000;height:455;left:170;margin-top:-350">	
				    		</div>
				    	</li>
				    	
				    	<li class="liebiao16"style="height:25;">
				    		<div  class="dakuang16" style="width:1000;height:455;left:170;margin-top:-375">	
				    		</div>
				    	</li>
				    	<li class="liebiao17"style="height:25;">
				    		<div  class="dakuang17" style="width:1000;height:455;left:170;margin-top:-400">	
				    		</div>
				    	</li>				    					    					    									    	
				    </ul>
				   -->
				</li>

				<li style="width: 86; up: 32; margin-left: 25;"><a href="">
						京东服饰</a></li>
				<li><a href=""> 美妆馆</a></li>
				<li><a href=""> 超市</li>
				<li style="width: 86;"><a href=""> 生鲜</a></li>
				<li><a href=""> 全球购</a></li>
				<li><a href=""> 闪购</a></li>
				<li><a href=""> 拍卖</a></li>
				<li><a href=""> 金融</a></li>

			</ul>




		</div>
	</div>
	<!--  第四版全部结果>"2018商品"-->
	<div
		style="left: 232; height: 50; font-size: 12px; color: #666666; margin-top: 15;">
		<span style=""> 全部结果> </span> <span style=""> "2018新品" </span> <span
			style="left: 100px"><a href="SearchServlet.do">查詢所有</a></span>
	</div>
	<!-- 第五版品牌-->
	<div style="height: 120; width: 1400; margin: 0 auto; margin-top: -15;">
		<div
			style="height: 34; width: 110; float: left; font-size: 12px; color: #666666;">
			<strong>品牌</strong>：
		</div>
		<div style="width: 1070; height: 109; float: left; margin-top: 5px">
			<ul class="pinpai clearfix">
				<c:forEach items="${listBrand}" var="brand">
					<a href="SearchServlet.do?brandId=${brand.brandId}">
						<li><img src="resource/${brand.brandPic}" /></li>
					</a>
				</c:forEach>

				<!-- <li></li>
				<li><img src="img/search/品牌3.png"/></li>
				<li><img src="img/search/品牌4.png"/></li>
				<li><img src="img/search/品牌5.png"/></li>
				<li><img src="img/search/品牌6.png"/></li>
				<li><img src="img/search/品牌7.png"/></li>
				<li><img src="img/search/品牌8.png"/></li>
				<li><img src="img/search/品牌9.png"/></li>
				<li><img src="img/search/品牌10.png"/></li>
				
				<li><img src="img/search/品牌11.png"/></li> 
				<li><img src="img/search/品牌12.png"/></li>
				<li><img src="img/search/品牌13.png"/></li>
				<li><img src="img/search/品牌14.png"/></li>
				<li><img src="img/search/品牌15.png"/></li>
				<li><img src="img/search/品牌16.png"/></li>	
				<li><img src="img/search/品牌17.png"/></li>
				<li><img src="img/search/品牌18.png"/></li> -->
			</ul>


		</div>
		<div
			style="height: 22; width: 50; float: left; border: 1px solid #999999; margin-left: 70">
			<span style="font-size: 12px; color: #333333">更多</span>
		</div>
		<div
			style="height: 22; width: 50; float: left; border: 1px solid #999999;">
			<span style="font-size: 12px; color: #333333">多选</span>
		</div>
		<div style="clear: both"></div>
	</div>
	<!--女装-->
	<div style="height: 34; width: 1400;; margin: 0 auto">
		<ul class="nz clearfix" style="color: #005AA0; font-size: 12px">
			<a><li style="width: 110px; color: #666666;"><strong>女装:</strong></li></a>
			<a href="SearchServlet.do?typeDtlId=1"><li>连衣裙</li></a>
			<a href="SearchServlet.do?typeDtlId=8"><li>T恤</li></a>
			<a href="SearchServlet.do?typeDtlId=25"><li>休闲裤</li></a>
			<a href="SearchServlet.do?typeDtlId=10"><li>衬衫</li></a>
			<a href="SearchServlet.do?typeDtlId=6"><li>半身裙</li></a>
			<a href="SearchServlet.do?typeDtlId=19"><li>牛仔裤</li></a>
			<a href="SearchServlet.do?typeDtlId=27"><li>中老年女装</li></a>
			<a><li
				style="width: 50px; height: 20px; margin-left: 305; border: 1px solid #999999; color: #333333">更多</li></a>
			<ul>
	</div>
	<!--尺码-->
	<div style="height: 34; width: 1400;; margin: 0 auto">
		<ul class="cm clearfix" style="color: #005AA0; font-size: 12px">
			<a><li style="width: 110px; color: #666666;">尺码:</li></a>
			<a href="SearchServlet.do?sizeId=17"><li>38</li></a>
			<a href="SearchServlet.do?sizeId=16"><li>40</li></a>
			<a href="SearchServlet.do?sizeId=15"><li>42</li></a>
			<a href="SearchServlet.do?sizeId=14"><li>44</li></a>
			<a href="SearchServlet.do?sizeId=13"><li>150</li></a>
			<a href="SearchServlet.do?sizeId=12"><li>155</li></a>
			<a href="SearchServlet.do?sizeId=11"><li>160</li></a>
			<a href="SearchServlet.do?sizeId=10"><li>165</li></a>
			<a href="SearchServlet.do?sizeId=09"><li>170</li></a>
			<a href="SearchServlet.do?sizeId=08"><li>175</li></a>
			<a href="SearchServlet.do?sizeId=07"><li>180</li></a>
			<a href="SearchServlet.do?sizeId=06"><li>185</li></a>
			<a href="SearchServlet.do?sizeId=05"><li>XXS</li></a>
			<a href="SearchServlet.do?sizeId=04"><li>XS</li></a>
			<a href="SearchServlet.do?sizeId=03"><li>S</li></a>
			<a href="SearchServlet.do?sizeId=02"><li>M</li></a>
			<a href="SearchServlet.do?sizeId=01"><li>L</li></a>
			<a><li
				style="width: 50px; height: 20px; margin-left: 125; color: #333333; border: 1px solid #999999;">更多</li>
			</a>
			<a><li
				style="width: 50px; height: 20px; color: #333333; border: 1px solid #999999;">多选</li></a>
			<ul>
	</div>
	<!--颜色-->
	<div style="height: 34; width: 1400; margin: 0 auto">
		<ul class="ys clearfix">
			<a><li
				style="width: 110px; margin-left: 0px; color: #666666; font-size: 12px">颜色:</li>
			</a>
			<a href="SearchServlet.do?colorId=02"><li
				style="background: #333333;"></li></a>
			<a href="SearchServlet.do?colorId=19"><li
				style="background: #DDDDDD;"></li></a>
			<a href="SearchServlet.do?colorId=01"><li
				style="background: #FFFFFF;"></li></a>
			<a href="SearchServlet.do?colorId=11"><li
				style="background: #FFD8D8;"></li></a>
			<a href="SearchServlet.do?colorId=03"><li
				style="background: #FF0000;"></li></a>
			<a href="SearchServlet.do?colorId=08"><li
				style="background: #B237F1;"></li></a>
			<a href="SearchServlet.do?colorId=04"><li
				style="background: #2A8CFA;"></li></a>
			<a href="SearchServlet.do?colorId=07"><li
				style="background: #17BC32;"></li></a>
			<a href="SearchServlet.do?colorId=06"><li
				style="background: #FFCC00;"></li></a>
			<a href="SearchServlet.do?colorId=16"><li
				style="background: #C69C81;"></li></a>

			<a href="SearchServlet.do?colorId=15"><li
				style="background: #FF028B;"></li></a>
			<a href="SearchServlet.do?colorId=17"><li
				style="background: #814312;"></li></a>
			<a href="SearchServlet.do?colorId=09"><li
				style="background: #F3DCC9;"></li></a>
			<a><li
				style="width: 40; height: 20; border: 1px solid #999999; margin-left: 815; font-size: 12px; color: #333333;">多选
			<li></a>
			<ul>
	</div>
	<!--高级选项-->
	<div style="height: 34; width: 1400;; margin: 0 auto">

		<ul class="gjxx clearfix" style="color: #005AA0; font-size: 12px">
			<li style="width: 110px; margin-left: 0; color: #666666;">高级选项：</li>
			<li>厚度</li>
			<li>衣门襟</li>
			<li>使用年龄</li>
			<li>版型</li>
			<li>裙长</li>
			<li>风格</li>
			<li>分类</li>
			<li>袖长</li>
			<li>袖型</li>
			<li>领型</li>
			<li>其他分类</li>
		</ul>



	</div>

	<!--大板-->
	<div style="width: 1400;; margin: 0 auto">
		<!--左大板块-->
		<div style="width: 170; float: left">
			<div style="height: 5680; color: #666666; font-size: 15px">

				商品精选
				<ul class="spjx" style="margin-top: 30px">

					<%-- 	<c:forEach items="${listProductSku}" var="productSku">
				<li>
					<div><img src="resource/front/img/search/上左一.png"/></div>
					<div style="margin-top:10px">
					<span style="font-size:20px;color:#F82C21;">￥${productSku.priceCurrent}</span>
					</div>
					<div style="margin-top:10px;">
						<a href="" hover="#F82C21"><span style="font-size:12px;">${productSku.productName}<span style="color:#F82C21">2018新款</span>
						夏装休</span></a>
					</div>
					<div style="font-size:15px;margin-top:10px;">
				 	<span style="color:#999999">已经有<a href="" style="color:#6485CB;">${productSku.qtyTotal}</a>评价</span>
				 	</div>
				</li>
				</c:forEach> --%>
					<li><img src="resource/front/img/search/全上左一.png" /></li>
					<li><img src="resource/front/img/search/全上左一.png" /></li>
					<li><img src="resource/front/img/search/全上左一.png" /></li>
					<li><img src="resource/front/img/search/全上左一.png" /></li>
					<li><img src="resource/front/img/search/全上左一.png" /></li>
					<li><img src="resource/front/img/search/全上左一.png" /></li>
					<li><img src="resource/front/img/search/全上左一.png" /></li>
					<li><img src="resource/front/img/search/全上左一.png" /></li>
					<li><img src="resource/front/img/search/全上左一.png" /></li>

					<li><img src="resource/front/img/search/全上左一.png" /></li>
					<li><img src="resource/front/img/search/全上左一.png" /></li>
					<li><img src="resource/front/img/search/全上左一.png" /></li>
					<li><img src="resource/front/img/search/全上左一.png" /></li>
					<li><img src="resource/front/img/search/全上左一.png" /></li>
					<li><img src="resource/front/img/search/全上左一.png" /></li>
					<li><img src="resource/front/img/search/全上左一.png" /></li>
					<li><img src="resource/front/img/search/全上左一.png" /></li>
					<li><img src="resource/front/img/search/全上左一.png" /></li>
					<li><img src="resource/front/img/search/全上左一.png" /></li>


				</ul>
			</div>
			<div style="color: #666666; font-size: 15px">
				商品推荐
				<div style="margin-top: 20px;">
					<img src="resource/front/img/search/全上左一.png" />
				</div>
				<div style="">
					<img src="resource/front/img/search/全上左一.png" />
				</div>
				<div style="right: 10px">
					<img src="resource/front/img/search/京东超市.jpg" />
				</div>
			</div>
		</div>
		<!--上一-->
		<div
			style="width: 1200; float: left; left: 15px; color: #666666; font-size: 15px">
			<div>
				<ul class="kdu2 clearfix ">
					<li>综合</li>
					<li>销量</li>
					<li>评论数</li>
					<li>新品</li>
					<li>价格</li>

					<li style="margin-left: 10"></li>
					<li style="margin-left: 10"></li>
					<li style="width: 165px; margin-left: 475; border: 0;">共85万+件商品
						1/100</li>
					<li style=""></li>
					<li style=""></li>
				</ul>

			</div>
		</div>
		<!--上二-->
		<div
			style="height: 38; width: 1200; float: left; left: 15px; margin-top: 10;">
			<ul class="peisong clearfix" style="color: #666666; font-size: 14px">
				<li>配送至</li>
				<li><select>
						<option>北京三环以内</option>
				</select> <input type="checkbox" name="jdwl" />京东物流 <input type="checkbox"
					name="jdwl" />货到付款 <input type="checkbox" name="jdwl" />仅显示有货 <input
					type="checkbox" name="jdwl" />可配送至全球 <input type="checkbox"
					name="jdwl" />新品</li>
				<li style="margin-left: 480">
					<form method="post" action="">
						<input type="text" name="shousuo" style="width: 115; height: 23;" />
						<input type="submit" value="确定" style="width: 50; height: 23;" />
					</form>
				</li>

				<ul>
		</div>
		<!--上三-->
		<div style="height: 7200; width: 1200; float: left; left: 15px">

			<ul class="shangsan clearfix">
				<c:forEach items="${listProductSku}" var="productSku">


					<li>


						<div style="width: 220; height: 280">
							<a href="DetailsServlet.do?skuId=${productSku.productSkuId}"><img
								style="width: 210; height: 270"
								src="resource/${productSku.picBig}" /></a>
						</div>
						<div style="width: 30; border: 2px solid #E4393C; margin-top: 5px">
							<img style="width: 30; height: 30"
								src="resource/${productSku.picSmall} " />
						</div>
						<div style="margin-top: 10px">
							<span style="font-size: 20px; color: #F82C21;">￥${productSku.priceCurrent}</span>

						</div>
						<div style="margin-top: 10px">
							<span style="font-size: 12px;">${productSku.productName}<span
								style="color: #F82C21">${productSku.timeToMarket}</span> 夏装<span
								style="color: #F82C21">新</span></span>
						</div>
						<div style="font-size: 15px; margin-top: 10px;">
							<a href="" style="color: #6485CB;">${productSku.qtyTotal}</a><span
								style="color: #999999">条评论</span>
						</div>
						<div style="font-size: 15px; margin-top: 10px;">

							<a href="" style="color: #999999">甘甘的世界旗舰店</a> <img
								src="resource/front/img/search/黄色铃铛.png" />
						</div>
						<div style="margin-top: 10px">
							<div
								style="font-size: 10px; background: #31C19E; width: 30; height: 15; float: left">
								<span style="color: #FFFFFF">新品</span>
							</div>
							<div
								style="font-size: 10px; height: 15; width: 45; float: left; margin-left: 2px; border: 1px solid #E4393C;">
								<span style="color: #E4393C">2件8折</span>
							</div>
							<div style="clear: both"></div>
						</div>


					</li>

				</c:forEach>
				<!-- <li><img src="img/search/小三图片.png"></li>
			<li><img src="img/search/小三图片.png"></li>
			<li><img src="img/search/小三图片.png"></li>
			<li><img src="img/search/小三图片.png"></li>
			<li><img src="img/search/小三图片.png"></li>
			<li><img src="img/search/小三图片.png"></li>
			<li><img src="img/search/小三图片.png"></li>
			<li><img src="img/search/小三图片.png"></li>
			<li><img src="img/search/小三图片.png"></li>
			
			<li><img src="img/search/小三图片.png"></li>
			<li><img src="img/search/小三图片.png"></li>
			<li><img src="img/search/小三图片.png"></li>
			<li><img src="img/search/小三图片.png"></li>
			<li><img src="img/search/小三图片.png"></li>
			<li><img src="img/search/小三图片.png"></li>
			<li><img src="img/search/小三图片.png"></li>
			<li><img src="img/search/小三图片.png"></li>
			<li><img src="img/search/小三图片.png"></li>
			<li><img src="img/search/小三图片.png"></li>
			
			<li><img src="img/search/小三图片.png"></li>
			<li><img src="img/search/小三图片.png"></li>
			<li><img src="img/search/小三图片.png"></li>
			<li><img src="img/search/小三图片.png"></li>
			<li><img src="img/search/小三图片.png"></li>
			<li><img src="img/search/小三图片.png"></li>
			<li><img src="img/search/小三图片.png"></li>
			<li><img src="img/search/小三图片.png"></li>
			<li><img src="img/search/小三图片.png"></li>
			<li><img src="img/search/小三图片.png"></li>
			
			<li><img src="img/search/小三图片.png"></li>
			<li><img src="img/search/小三图片.png"></li>
			<li><img src="img/search/小三图片.png"></li>
			<li><img src="img/search/小三图片.png"></li>
			<li><img src="img/search/小三图片.png"></li>
			<li><img src="img/search/小三图片.png"></li>
			<li><img src="img/search/小三图片.png"></li>
			<li><img src="img/search/小三图片.png"></li>
			<li><img src="img/search/小三图片.png"></li>
			<li><img src="img/search/小三图片.png"></li>
			
			<li><img src="img/search/小三图片.png"></li>
			<li><img src="img/search/小三图片.png"></li>
			<li><img src="img/search/小三图片.png"></li>
			<li><img src="img/search/小三图片.png"></li>
			<li><img src="img/search/小三图片.png"></li>
			<li><img src="img/search/小三图片.png"></li>
			<li><img src="img/search/小三图片.png"></li>
			<li><img src="img/search/小三图片.png"></li>
			<li><img src="img/search/小三图片.png"></li>
			<li><img src="img/search/小三图片.png"></li>
			
			<li><img src="img/search/小三图片.png"></li>
			<li><img src="img/search/小三图片.png"></li>
			<li><img src="img/search/小三图片.png"></li>
			<li><img src="img/search/小三图片.png"></li>
			<li><img src="img/search/小三图片.png"></li>
			<li><img src="img/search/小三图片.png"></li>
			<li><img src="img/search/小三图片.png"></li>
			<li><img src="img/search/小三图片.png"></li>
			<li><img src="img/search/小三图片.png"></li>
			<li><img src="img/search/小三图片.png"></li> -->

			</ul>



		</div>
		<div style="clear: both"></div>

		<ul class="fengye clearfix" style="margin-left: 680">
			<li style="width: 55;"><span style="color: #DDDDDD">上一页</span></li>
			<li>1</li>
			<li>2</li>
			<li>3</li>
			<li>4</li>
			<li>5</li>
			<li>6</li>
			<li>7</li>
			<li style="border: 0;">...</li>
			<li style="width: 55;">下一页</li>

			<li style="width: 100; border: 0;">共100页 到第</li>
			<li>1</li>
			<li style="border: 0;">页</li>
			<li style="width: 55;">确定</li>
		</ul>





	</div>
	<div style="width: 1400; margin: 0 auto">
		<div style="width: 1400; height: 33; margin: 0 auto">商品精选</div>
		<%-- 		<ul  calss="spjx4 clearfix" style="margin-top:30px;">
			<c:forEach items="${listProductSku}" var="productSku">
				<li style="float:left; width:250px">
					<div><img src="resource/front/img/search/上左一.png"/></div>
					<div style="margin-top:10px">
					<span style="font-size:20px;color:#F82C21;">￥${productSku.priceCurrent}</span>
					</div>
					<div style="margin-top:10px;width:200px">
						<a href="" hover="#F82C21"><span style="font-size:12px;">${productSku.productName}<span style="color:#F82C21">2018新款</span>
						夏装休</span></a>
					</div>
					<div style="font-size:15px;margin-top:10px;">
				 	<span style="color:#999999">已经有<a href="" style="color:#6485CB;"></a>评价</span>
				 	</div>
				</li>
				</c:forEach>
				<div style="clear: both;"></div>
		</ul> --%>

		<div style="width: 1310; height: 306; margin: 0 auto">
			<div style="width: 236; height: 306; float: left;">
				<img src="resource/front/img/search/商品精选.png">
			</div>
			<div style="width: 236; height: 306; float: left; margin-left: 30">
				<img src="resource/front/img/search/商品精选.png">
			</div>
			<div style="width: 236; height: 306; float: left; margin-left: 30">
				<img src="resource/front/img/search/商品精选.png">
			</div>
			<div style="width: 236; height: 306; float: left; margin-left: 30">
				<img src="resource/front/img/search/商品精选.png">
			</div>
			<div style="width: 236; height: 306; float: left; margin-left: 30">
				<img src="img/search/商品精选.png">
			</div>
			-->
			<div style="clear: both"></div>
		</div>

		<div style="width: 1400; height: 111;">

			<ul class=" spjx2 clearfix"
				style="margin-left: 40; margin-top: 10px; color: #005AA0">
				<li>您是不是要找:</li>
				<li>2018新品女装</li>
				<li>连衣裙2018</li>
				<li>中老年女装</li>
				<li>连衣裙</li>
				<li>连衣裙短袖</li>

				<li>蕾丝雪纺衫</li>
				<li>t恤女</li>
				<li>连衣裙碎花</li>
				<li>连衣裙春</li>
				<li>自营女装</li>

				<li>2018新品二件</li>
				<li>休闲套装夏女</li>
				<li>阔腿裤女</li>
				<li>衬衫女2018</li>
				<li>蕾丝裙</li>
			</ul>

			<from method="post" action=""> <strong><span
				style="font-size: 12px; margin-right: 30; margin-left: 50">重新搜索:</span></strong>
			<input type="text" name="shou" style="width: 400; height: 40" /> <input
				type="submit" value="搜索"
				style="width: 70; height: 35; border: 0; background: #E74649; color: #FFFFFF" />
			<span style="color: #005AA0; font-size: 12px; margin-left: 20px">说说我使用搜索的感受</span>
			</from>
		</div>
	</div>

	<div style="width: 1400; margin: 0 auto">
		<div style="font-size: 14px; color: #666666; width: 70; float: left;">猜你喜欢:</div>
		<div style="height: 32; left: 1280; float: left;">换一批</div>
		<div style="clear: both;"></div>

	</div>
	<!--俩张图片-->
	<div style="width: 1400; margin: 0 auto">
		<div style="width: 186; height: 270; float: left;">
			<img src="resource/front/img/search/盘子.png">
			<div style="margin-top: 5px">
				<a href=""><span style="font-size: 12px;">皇纯 威海淡干海参 4g 1只
						简装 海鲜水产</span>
			</div>
			</a>
			<div style="font-size: 15px; margin-top: 5px;">
				<a href="" style="color: #6485CB;">(已有7.8万+人评价)</a>
			</div>
			<div style="margin-top: 5px">
				<span style="font-size: 20px; color: #F82C21;">￥458.00</span>
			</div>
		</div>
		<div style="width: 186; height: 270; float: left; margin-left: 50">
			<div style="margin-bottom: 5px;">
				<img src="resource/front/img/search/超人总动员.png">
			</div>
			<div style="margin-top: 5px; height: 30">
				<a href=""><span style="font-size: 12px;">超人总动员（DVD9）</span>
			</div>
			</a>
			<div style="font-size: 15px; margin-top: 5px;">
				<a href="" style="color: #6485CB;">(已有7.8万+人评价)</a>
			</div>
			<div style="margin-top: 5px">
				<span style="font-size: 20px; color: #F82C21;">￥458.00</span>
			</div>


		</div>
		<div style="clear: both"></div>
	</div>
	<!--大图片-->
	<div style="width: 1400; margin: 0 auto">
		<img src="resource/front/img/search/每个人.jpg" />
	</div>
	<!--尾部-->
	<%@include file="bas_bottom.jsp"%>

	<div>
		<div style="width: 70; height: 25; float: left;"></div>
		<div style="width: 43; height: 25; float: left;"></div>
		<div style="clear: both"></div>
	</div>
	<div
		style="width: 35; height: 1000; position: fixed; left: 1850; top: 0; border-right: 5px solid #7A6E6E;">
		<ul class="npx" style="margin-top: 500; padding: 5px">
			<li>
				<div style="top: 5px; margin-left: 5px">
					<img src="resource/front/img/search/npx1.png" />
				</div>
			</li>
			<li>
				<div style="top: 5px; margin-left: 5px">
					<img src="resource/front/img/search/npx2.png" />
				</div>
			</li>
			<li>
				<div style="top: 5px; margin-left: 5px">
					<img src="resource/front/img/search/npx3.png" />
				</div style="margin-top:5px;margin-left:5px">
			</li>
			<li>
				<div style="top: 5px; margin-left: 5px">
					<img src="resource/front/img/search/npx4.png" />
				</div>
			</li>
			<li>
				<div style="top: 5px; margin-left: 5px">
					<img src="resource/front/img/search/npx5.png" />
				</div>
			</li>
			<li style="margin-top: 200">
				<div style="top: 5px; margin-left: 5px">
					<img src="resource/front/img/search/npx6.png" />
				</div>
			</li>
			<li>
				<div style="top: 5px; margin-left: 5px">
					<img src="resource/front/img/search/npx7.png" />
				</div>
			</li>
			<li>
				<div style="top: 5px; margin-left: 5px">
					<img src="resource/front/img/search/npx8.png" />
				</div>
			</li>
		</ul>
		<div>

			<div
				style="width: 125; height: 155; position: fixed; left: 1728; top: 715; border: 1px solid #FF0000; background: #E4393C; color: FFFFFF; font-size: 14px">
				<div
					style="width: 110; height: 40; margin-left: 10px; margin-top: 7px">
					去APP上探索你<span style="margin-left: 10">查找的商品~</span>
				</div>
				<div style="margin-left: 10">
					<img src="resource/front/img/search/二维码.png" />
				</div>


			</div>
</body>
</html>