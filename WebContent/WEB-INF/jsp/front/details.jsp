<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<!--  ul没加clearfix-->

<head>
<meta charset="UTF-8">
<title>京东页面物品详情</title>
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/resource/front/css/common.css" />
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/resource/front/css/details/details.css" />
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/resource/front/iconfont/iconfont.css" />
</head>
<body>
	<div class="head">

		<!--header-->
		<%@include file="bas_header.jsp"%>

		<!--search-->
		<div id="mid_find">
			<div style="float: left; width: 400px; height: 80px;">
				<div style="float: left; height: 71px; width: 160px;">
					<img
						src="<%=request.getContextPath()%>/resource/front/img/index/京东.png" />
				</div>
				<div
					style="float: left; font-size: 24px; font-family: 宋体; color: #666666; margin: 20px 40px">女装</div>
				<div
					style="float: left; border: 1px solid #C6C6C6; padding: 1px 6px; margin: 27px -35px; color: #666666;">
					全部分类</div>
				<div style="clear: both"></div>
			</div>
			<div class="find_research">
				<div class="find_research_box">
					<div style="float: left;">
						<input type="text"
							style="width: 280px; height: 36px; margin-left: 10px; border: none; line-height: 1px;" />
					</div>
					<div style="float: right; width: 88px; height: 38px;">
						<input type="button" value="搜索"
							style="color: #FFF3D8; font-size: 17px; background: #FF4466; border: none; width: 88px; height: 38px; cursor: pointer;" />
					</div>
					<div style="clear: both"></div>
				</div>

				<div class="find_research_fast">
					<ul>
						<li><a href="#">雪纺连衣裙</a></li>
						<li><a href="#">新品衬衫</a></li>
						<li><a href="#">短袖T恤</a></li>
						<li><a href="#">蕾丝雪纺衫</a></li>
						<li><a href="#">针织衫</a></li>
						<li><a href="#">卫衣</a></li>
						<li><a href="#">牛仔裤</a></li>
						<li><a href="#">自营女装</a></li>
					</ul>
				</div>
			</div>
			<div class="find_car">
				<a href="#"
					style="color: #F30213; line-height: 34px; cursor: pointer; margin-left: 22;">我的购物车</a>
			</div>
			<div style="clear: both"></div>
		</div>

		<div class="search-img">
			<img
				src="<%=request.getContextPath()%>/resource/front/img/reformDetail/01_店招.jpg">
		</div>

		<!--three-->
		<div class="three-file">
			<img
				src="<%=request.getContextPath()%>/resource/front/img/reformDetail/02_店招.jpg">
		</div>

		<!--four-->
		<div class="four-file clearfix">
			<ul class="four-grounds">
				<li>服饰内衣></li>
				<li>女装></li>
				<li>连衣裙></li>
				<li style="width: 85px;">粉红大布娃娃></li>
				<li class="four-grounds-01" style="width: 125px;">粉红大布娃娃秋装女...</li>
				<li style="width: 140px;"><a href="//fenhongdabuwawa.jd.com"
					target="_blank" title="粉红大布娃娃官方旗舰店">粉红大布娃娃官方旗舰店</a></li>
				<li style="width: 120px;"><img
					src="<%=request.getContextPath()%>/resource/front/img/reformDetail/score.png" />
				</li>
				<li style="top: 2px;">联系卖家</li>
				<li style="top: 2px;">JIMI</li>
				<li style="top: 2px;">关注店铺</li>
			</ul>
		</div>

		<!--five-->
		<div class="five-file">
			<div class="five-frame-01 clearfix">
				<div class="five-big-img clearfix">
					<!-- /resource/front/img/reformDetail/粉红秋装女.jpg -->
					<img
						src="<%=request.getContextPath()%>
						/resource/${productSku.picMid}
						">
				</div>
				<div class="five-small-img clearfix">
					<ul class="five-grounds">
						<li style="margin-left: 40px;"><img
							src="<%=request.getContextPath()%>/resource/front/img/reformDetail/粉红女装小图01.jpg">
						</li>
						<li><img
							src="<%=request.getContextPath()%>/resource/front/img/reformDetail/粉红女装小图02.jpg">
						</li>
						<li><img
							src="<%=request.getContextPath()%>/resource/front/img/reformDetail/粉红女装小图03.jpg">
						</li>
						<li><img
							src="<%=request.getContextPath()%>/resource/front/img/reformDetail/粉红女装小图04.jpg">
						</li>
						<li><img
							src="<%=request.getContextPath()%>/resource/front/img/reformDetail/粉红女装小图05.jpg">
						</li>
					</ul>
				</div>
				<div class="five-bottom clearfix">
					<ul class="five-grounds-bottom">
						<li><i class=""></i> <span>关注</span></li>
						<li><i class=""></i> <span>分享</span></li>
						<li style="margin-left: 180px;"><span>举报</span></li>
					</ul>
				</div>
			</div>
			<div class="five-frame-02 clearfix">
				<div class="five-frame-nest-01">
					<img
						src="<%=request.getContextPath()%>/resource/front/img/reformDetail/新品.png">
					<!-- <span>粉红大布娃娃秋装女2018新款荷叶边V领收腰长款印花雪纺连衣裙 本白色印花 M</span> -->
					<span>${product.name }</span>
				</div>
				<div class="five-frame-nest-02">
					<div class="five-frame-nest-02-t">
						<div class="five-frame-nest-02-t-01 clearfix">
							<span>京东价: </span>
						</div>${productSku.priceCurrent }
						<span></span> <a href="#" style="margin: 30px;">降价通知</a>
						<div class="five-frame-nest-02-t-02 clearfix">
							<span>累计评价</span>
						</div>
					</div>
					<div class="five-frame-nest-02-b">
						<div class="five-frame-nest-02-b-01" style="margin-top: 10px;">
							<span> 促&nbsp;销 </span>
						</div>
					</div>
				</div>
				<div class="five-frame-nest-03">
					<div class="five-frame-nest-small-01">
						<span>增值业务</span>
					</div>
					<div class="five-frame-nest-small-02">
						<span>配送至</span>
						<div class="five-frame-nest-small-lice clearfix">
							<input type="text" value="北京朝阳区三环区" name="text1" />
							<div class="five-frame-nest-small-huodao clearfix">
								<span>货到付款</span>
							</div>
							<div class="five-frame-nest-small-zhichi clearfix">
								<span>支持</span>
							</div>
							<div class="five-frame-nest-small-youhuo clearfix">
								<span>有货</span>
							</div>
						</div>
					</div>
					<div class="five-frame-nest-small-03 clearfix">
						<div class="five-frame-nest-small-03-fahuo clearfix">
							由<a href="#" style="color: #0000FF;">粉红大布娃娃官方旗舰店</a>从 上海 发货,
							并提供售后服务.
						</div>
					</div>
					<div class="five-frame-nest-small-04 clear">
						<div class="five-frame-nest-small-04-xuanz">
							<span style="top: 10px;">选择尺码</span>
						</div>
						<div class="five-frame-nest-small-04-zenz">
							<span style="top: 10px;">增值保值</span>
						</div>
						<div class="five-frame-nest-small-04-baitiao">
							<span style="top: 10px;">白条分期</span>
						</div>
						<div class="five-frame-nest-small-04-gouwu">
							<input type="text" name="text2" value="1"
								style="width: 44px; height: 45px; margin-left: 10px; margin-top: 20px;" />
							<div class="five-frame-nest-small-04-gouwu-che clear">
								<form action="UpdateCartServlet.do?method=addCart" method="post">
									<input type="hidden" name="productSkuId"
										value="${productSku.productSkuId}"> <input
										class="five-frame-nest-small-04-gouwu-che-a"
										style="color: #FFFFFF;" type="submit" value="加入购物车">
								</form>
							</div>
						</div>
						<div class="five-frame-nest-small-04-tis clear">
							<span>温馨提示</span>
							<ul>
								<li>·&nbsp;支持7天无理由退货</li>
							</ul>
						</div>
					</div>
				</div>
			</div>
			<div class="five-frame-03 clearfix">
				<div class="five-frame-title clearfix">
					<h3>看了又看</h3>
				</div>
				<div class="five-frame-img clearfix">
					<ul class="five-frame-bottom">
						<li><a class="five-frame-bottom-img"
							href="//item.jd.com/30196738946.html"
							title="粉红大布娃娃秋装2018新款韩版女装时尚宽松绣花七分袖一字肩衬衫 本白色 S" target="_blank">
								<img style="position: absolute;"
								alt="粉红大布娃娃秋装2018新款韩版女装时尚宽松绣花七分袖一字肩衬衫 本白色 S"
								src="<%=request.getContextPath()%>/resource/front/img/reformDetail/看了01.jpg"
								width="150" height="150" />
								<div
									style="background-color: #e3e4e5; margin-top: 132px; width: 150px; overflow: hidden; text-overflow: ellipsis; white-space: nowrap; width: 100%;">粉红大布娃娃秋装2018新款韩版女装时尚宽松绣花七分袖一字肩衬衫
									本白色 S</div>
								<p style="color: red; text-align: center;">￥199.00</p>
						</a></li>
						<li><a class="five-frame-bottom-img"
							href="//item.jd.com/30196738946.html"
							title="粉红大布娃娃秋装2018新款韩版女装时尚宽松绣花七分袖一字肩衬衫 本白色 S" target="_blank">
								<img style="position: absolute;"
								alt="粉红大布娃娃秋装2018新款韩版女装时尚宽松绣花七分袖一字肩衬衫 本白色 S"
								src="<%=request.getContextPath()%>/resource/front/img/reformDetail/看了01.jpg"
								width="150" height="150" />
								<div
									style="background-color: #e3e4e5; margin-top: 132px; width: 150px; overflow: hidden; text-overflow: ellipsis; white-space: nowrap; width: 100%;">粉红大布娃娃秋装2018新款韩版女装时尚宽松绣花七分袖一字肩衬衫
									本白色 S</div>
								<p style="color: red; text-align: center;">￥199.00</p>
						</a></li>
						<li><a class="five-frame-bottom-img"
							href="//item.jd.com/30196738946.html"
							title="粉红大布娃娃秋装2018新款韩版女装时尚宽松绣花七分袖一字肩衬衫 本白色 S" target="_blank">
								<img style="position: absolute;"
								alt="粉红大布娃娃秋装2018新款韩版女装时尚宽松绣花七分袖一字肩衬衫 本白色 S"
								src="<%=request.getContextPath()%>/resource/front/img/reformDetail/看了01.jpg"
								width="150" height="150" />
								<div
									style="background-color: #e3e4e5; margin-top: 132px; width: 150px; overflow: hidden; text-overflow: ellipsis; white-space: nowrap; width: 100%;">粉红大布娃娃秋装2018新款韩版女装时尚宽松绣花七分袖一字肩衬衫
									本白色 S</div>
								<p style="color: red; text-align: center;">￥199.00</p>
						</a></li>
					</ul>
				</div>
				<div class="five-frame-tag clearfix">
					<a href="#none" style="margin-left: 57px;"> <i
						class="icon iconfont icon-jiantoushang" style="font-size: 48px;"></i>
					</a> <a href="#none"> <i class="icon iconfont icon-jiantouxia"
						style="font-size: 48px;"></i>
					</a>
				</div>
			</div>
		</div>

		<!--six-->
		<div class="six-file clearfix">
			<ul>
				<li class="six-file-content"><span style="top: 8px;">店长推荐</span>
				</li>
				<li class="six-file-underline"></li>
			</ul>
		</div>

		<!--seven 下面的个例外层div没加浮动，但内层ul加了浮动，为了保证代码的一致可维护性，就在外层div加了clearfix-->
		<div class="seven clearfix">
			<ul class="seven-img">
				<li><a class="seven-img-hover"
					href="//item.jd.com/30196738946.html"
					title="粉红大布娃娃秋装2018新款韩版女装时尚宽松绣花七分袖一字肩衬衫 本白色 S" target="_blank">
						<img style="position: absolute;"
						alt="粉红大布娃娃秋装2018新款韩版女装时尚宽松绣花七分袖一字肩衬衫 本白色 S"
						src="<%=request.getContextPath()%>/resource/front/img/reformDetail/店招推荐.jpg"
						width="160" height="160" />
						<div class="seven-img-content">粉红大布娃娃秋装2018新款韩版女装时尚宽松绣花七分袖</div>
						<div class="seven-img-money">
							<p style="color: red; text-align: center; font-size: 14px;">￥249.00</p>
						</div>
				</a></li>
				<li><a class="seven-img-hover"
					href="//item.jd.com/30196738946.html"
					title="粉红大布娃娃秋装2018新款韩版女装时尚宽松绣花七分袖一字肩衬衫 本白色 S" target="_blank">
						<img style="position: absolute;"
						alt="粉红大布娃娃秋装2018新款韩版女装时尚宽松绣花七分袖一字肩衬衫 本白色 S"
						src="<%=request.getContextPath()%>/resource/front/img/reformDetail/店招推荐.jpg"
						width="160" height="160" />
						<div class="seven-img-content">粉红大布娃娃秋装2018新款韩版女装时尚宽松绣花七分袖</div>
						<div class="seven-img-money">
							<p style="color: red; text-align: center; font-size: 14px;">￥249.00</p>
						</div>
				</a></li>
				<li><a class="seven-img-hover"
					href="//item.jd.com/30196738946.html"
					title="粉红大布娃娃秋装2018新款韩版女装时尚宽松绣花七分袖一字肩衬衫 本白色 S" target="_blank">
						<img style="position: absolute;"
						alt="粉红大布娃娃秋装2018新款韩版女装时尚宽松绣花七分袖一字肩衬衫 本白色 S"
						src="<%=request.getContextPath()%>/resource/front/img/reformDetail/店招推荐.jpg"
						width="160" height="160" />
						<div class="seven-img-content">粉红大布娃娃秋装2018新款韩版女装时尚宽松绣花七分袖</div>
						<div class="seven-img-money">
							<p style="color: red; text-align: center; font-size: 14px;">￥249.00</p>
						</div>
				</a></li>
				<li><a class="seven-img-hover"
					href="//item.jd.com/30196738946.html"
					title="粉红大布娃娃秋装2018新款韩版女装时尚宽松绣花七分袖一字肩衬衫 本白色 S" target="_blank">
						<img style="position: absolute;"
						alt="粉红大布娃娃秋装2018新款韩版女装时尚宽松绣花七分袖一字肩衬衫 本白色 S"
						src="<%=request.getContextPath()%>/resource/front/img/reformDetail/店招推荐.jpg"
						width="160" height="160" />
						<div class="seven-img-content">粉红大布娃娃秋装2018新款韩版女装时尚宽松绣花七分袖</div>
						<div class="seven-img-money">
							<p style="color: red; text-align: center; font-size: 14px;">￥249.00</p>
						</div>
				</a></li>
				<li><a class="seven-img-hover"
					href="//item.jd.com/30196738946.html"
					title="粉红大布娃娃秋装2018新款韩版女装时尚宽松绣花七分袖一字肩衬衫 本白色 S" target="_blank">
						<img style="position: absolute;"
						alt="粉红大布娃娃秋装2018新款韩版女装时尚宽松绣花七分袖一字肩衬衫 本白色 S"
						src="<%=request.getContextPath()%>/resource/front/img/reformDetail/店招推荐.jpg"
						width="160" height="160" />
						<div class="seven-img-content">粉红大布娃娃秋装2018新款韩版女装时尚宽松绣花七分袖</div>
						<div class="seven-img-money">
							<p style="color: red; text-align: center; font-size: 14px;">￥249.00</p>
						</div>
				</a></li>
				<li><a class="seven-img-hover"
					href="//item.jd.com/30196738946.html"
					title="粉红大布娃娃秋装2018新款韩版女装时尚宽松绣花七分袖一字肩衬衫 本白色 S" target="_blank">
						<img style="position: absolute;"
						alt="粉红大布娃娃秋装2018新款韩版女装时尚宽松绣花七分袖一字肩衬衫 本白色 S"
						src="<%=request.getContextPath()%>/resource/front/img/reformDetail/店招推荐.jpg"
						width="160" height="160" />
						<div class="seven-img-content">粉红大布娃娃秋装2018新款韩版女装时尚宽松绣花七分袖</div>
						<div class="seven-img-money">
							<p style="color: red; text-align: center; font-size: 14px;">￥249.00</p>
						</div>
				</a></li>
			</ul>
		</div>

		<!--eight-->
		<div class="eight">
			<div class="eight-left clearfix">
				<div class="eight-left-01">
					<h3>
						<a class="eight-left-01-a" href="href=//fenhongdabuwawa.jd.com"
							target="_blank">粉红大布娃娃官方旗舰</a>
					</h3>
				</div>
				<!--下面的个例外层div没加浮动，但内层ul加了浮动，为了保证代码的一致可维护性，就在外层div加了clearfix-->
				<div class="eight-left-02 clearfix">
					<ul class="eight-left-02-samll">
						<!--需要优化-->
						<li style="width: 188px; height: 92px;"><a
							class="eight-left-score"
							href="//mall.jd.com/shopLevel-10796.html">
								<div class="eight-left-score-num clearfix">
									<span>9.61</span>
								</div>
								<div class="eight-left-score-parts clearfix">
									<div class="eight-left-score-part">
										<span class="eight-left-score-desc">商品评价</span> <span
											class="eight-left-score-detail" style="left: 6px;"
											title="9.45分">9.45</span> <span
											class="eight-left-score-trend"></span>
									</div>
									<div class="eight-left-score-part">
										<span class="eight-left-score-desc">商品评价</span> <span
											class="eight-left-score-detail" style="left: 6px;"
											title="9.45分">9.45</span> <span
											class="eight-left-score-trend"></span>
									</div>
									<div class="eight-left-score-part">
										<span class="eight-left-score-desc">商品评价</span> <span
											class="eight-left-score-detail" style="left: 6px;"
											title="9.45分">9.45</span> <span
											class="eight-left-score-trend"></span>
									</div>
								</div>
						</a></li>
						<li style="width: 188px;">
							<div class="eight-left-02-btns">
								<a class="eight-left-02-btns-def" style="top: 6px;"
									href="//fenhongdabuwawa.jd.com" target="_blank"> <i
									class=""></i> <span>进店逛逛</span>
								</a>
							</div>
							<div class="eight-left-02-btns" style="margin-left: 4px;">
								<a class="eight-left-02-btns-def" style="top: 6px;"
									href="//fenhongdabuwawa.jd.com" target="_blank"> <i
									class=""></i> <span>关注店铺</span>
								</a>
							</div>
						</li>
					</ul>
				</div>
				<div class="eight-left-03">
					<h3>店内搜索</h3>
				</div>
				<div class="eight-left-04">
					<p>
						<label for="keyword">关键字：</label> <span> <input type="text"
							id="keyword" />
						</span>
					</p>
					<p>
						<label for="price">&nbsp;&nbsp;价 格：</label> <span> <input
							type="text" id="price" style="width: 46px; height: 23px;" /> 到 <input
							type="text" id="price" style="width: 46px; height: 23px;" />
						</span>
					</p>
					<p>
						<label for=""></label> <span> <input type="submit"
							id="eight-search" value="搜索"
							style="width: 43px; height: 26px; margin-top: 1px; margin-left: 50px;" />
						</span>
					</p>
				</div>
				<div class="eight-left-05">
					<h3>店内分类</h3>
				</div>
				<div class="eight-left-06">
					<ul class="eight-left-06-classify">
						<li class="eight-left-06-classify-xiala"><img
							src="<%=request.getContextPath()%>/resource/front/img/reformDetail/减号.png" />
							<a href="//mall.jd.com/view_search-15569-6139598-1-0-20-1.html"
							target="_blank">【查看所有宝贝】</a></li>
						<li class="eight-left-06-classify-xiala"><img
							src="<%=request.getContextPath()%>/resource/front/img/reformDetail/减号.png" />
							<a href="//mall.jd.com/view_search-15569-6139598-1-0-20-1.html"
							target="_blank">【TOP热销榜单】</a></li>
						<li class="eight-left-06-classify-xiala"><img
							src="<%=request.getContextPath()%>/resource/front/img/reformDetail/减号.png" />
							<a href="//mall.jd.com/view_search-15569-6139598-1-0-20-1.html"
							target="_blank">【季末清仓｜多件多折】</a></li>
						<li class="eight-left-06-classify-xiala"><img
							src="<%=request.getContextPath()%>/resource/front/img/reformDetail/减号.png" />
							<a href="//mall.jd.com/view_search-15569-6139598-1-0-20-1.html"
							target="_blank">【6月16日大促新品】</a></li>
						<li class="eight-left-06-classify-xiala"><img
							src="<%=request.getContextPath()%>/resource/front/img/reformDetail/减号.png" />
							<a href="//mall.jd.com/view_search-15569-6139598-1-0-20-1.html"
							target="_blank">【2018秋季新品合辑】</a></li>
						<li class="eight-left-06-classify-xiala"><img
							src="<%=request.getContextPath()%>/resource/front/img/reformDetail/减号.png" />
							<a href="//mall.jd.com/view_search-15569-6139598-1-0-20-1.html"
							target="_blank">7月9日新品</a></li>
						<li class="eight-left-06-classify-xiala"><img
							src="<%=request.getContextPath()%>/resource/front/img/reformDetail/减号.png" />
							<a href="//mall.jd.com/view_search-15569-6139598-1-0-20-1.html"
							target="_blank">7月16日新品</a></li>
						<li class="eight-left-06-classify-xiala"><img
							src="<%=request.getContextPath()%>/resource/front/img/reformDetail/减号.png" />
							<a href="//mall.jd.com/view_search-15569-6139598-1-0-20-1.html"
							target="_blank">7月23日新品</a></li>
						<li class="eight-left-06-classify-xiala"><img
							src="<%=request.getContextPath()%>/resource/front/img/reformDetail/减号.png" />
							<a href="//mall.jd.com/view_search-15569-6139598-1-0-20-1.html"
							target="_blank">连衣裙</a></li>
						<li class="eight-left-06-classify-xiala"><img
							src="<%=request.getContextPath()%>/resource/front/img/reformDetail/减号.png" />
							<a href="//mall.jd.com/view_search-15569-6139598-1-0-20-1.html"
							target="_blank">衬衫 | 雪纺衫</a></li>
						<li class="eight-left-06-classify-xiala"><img
							src="<%=request.getContextPath()%>/resource/front/img/reformDetail/减号.png" />
							<a href="//mall.jd.com/view_search-15569-6139598-1-0-20-1.html"
							target="_blank">T恤 | 打底衫</a></li>
						<li class="eight-left-06-classify-xiala"><img
							src="<%=request.getContextPath()%>/resource/front/img/reformDetail/减号.png" />
							<a href="//mall.jd.com/view_search-15569-6139598-1-0-20-1.html"
							target="_blank">小西装 | 外套</a></li>
						<li class="eight-left-06-classify-xiala"><img
							src="<%=request.getContextPath()%>/resource/front/img/reformDetail/减号.png" />
							<a href="//mall.jd.com/view_search-15569-6139598-1-0-20-1.html"
							target="_blank">针织</a></li>
						<li class="eight-left-06-classify-xiala"><img
							src="<%=request.getContextPath()%>/resource/front/img/reformDetail/减号.png" />
							<a href="//mall.jd.com/view_search-15569-6139598-1-0-20-1.html"
							target="_blank">风衣</a></li>
						<li class="eight-left-06-classify-xiala"><img
							src="<%=request.getContextPath()%>/resource/front/img/reformDetail/减号.png" />
							<a href="//mall.jd.com/view_search-15569-6139598-1-0-20-1.html"
							target="_blank">连体裤</a></li>
						<li class="eight-left-06-classify-xiala"><img
							src="<%=request.getContextPath()%>/resource/front/img/reformDetail/减号.png" />
							<a href="//mall.jd.com/view_search-15569-6139598-1-0-20-1.html"
							target="_blank">套装</a></li>
						<li class="eight-left-06-classify-xiala"><img
							src="<%=request.getContextPath()%>/resource/front/img/reformDetail/减号.png" />
							<a href="//mall.jd.com/view_search-15569-6139598-1-0-20-1.html"
							target="_blank">下装</a></li>
						<li class="eight-left-06-classify-xiala"><img
							src="<%=request.getContextPath()%>/resource/front/img/reformDetail/减号.png" />
							<a href="//mall.jd.com/view_search-15569-6139598-1-0-20-1.html"
							target="_blank">其他</a></li>
					</ul>
				</div>
				<!--下面的个例外层div没加浮动，但内层ul加了浮动，为了保证代码的一致可维护性，就在外层div加了clearfix-->
				<div class="eight-left-07 clearfix">
					<ul class="eight-left-07-classify">
						<li class="eight-file-content" style="margin-left: 5px;"><span
							style="top: 8px;">店铺热销</span></li>
						<li class="eight-file-underline"><span style="top: 8px">热门关注</span>
						</li>
					</ul>
				</div>
				<div class="eight-left-08 clearfix">
					<ul class="eight-left-08-img">
						<li><a class="eight-img-hover"
							href="//item.jd.com/30196738946.html"
							title="粉红大布娃娃秋装2018新款韩版女装时尚宽松绣花七分袖一字肩衬衫 本白色 S" target="_blank">
								<img style="position: absolute; margin-left: 10px;"
								alt="粉红大布娃娃秋装2018新款韩版女装时尚宽松绣花七分袖一字肩衬衫 本白色 S"
								src="<%=request.getContextPath()%>/resource/front/img/reformDetail/点不推荐.jpg"
								width="160" height="160" />
								<div class="eight-img-content">粉红大布娃娃秋装2018新款韩版女装时尚宽松绣花七分袖</div>
								<div class="eight-img-info">
									<div class="eight-img-count clearfix">
										热销 <em>274</em> 件
									</div>
									<div class="eight-img-money clearfix">
										<strong style="color: red; font-size: 14px; left: 40px;">￥249.00</strong>
									</div>
								</div>
						</a></li>
						<li><a class="eight-img-hover"
							href="//item.jd.com/30196738946.html"
							title="粉红大布娃娃秋装2018新款韩版女装时尚宽松绣花七分袖一字肩衬衫 本白色 S" target="_blank">
								<img style="position: absolute; margin-left: 10px;"
								alt="粉红大布娃娃秋装2018新款韩版女装时尚宽松绣花七分袖一字肩衬衫 本白色 S"
								src="<%=request.getContextPath()%>/resource/front/img/reformDetail/点不推荐.jpg"
								width="160" height="160" />
								<div class="eight-img-content">粉红大布娃娃秋装2018新款韩版女装时尚宽松绣花七分袖</div>
								<div class="eight-img-info">
									<div class="eight-img-count clearfix">
										热销 <em>274</em> 件
									</div>
									<div class="eight-img-money clearfix">
										<strong style="color: red; font-size: 14px; left: 40px;">￥249.00</strong>
									</div>
								</div>
						</a></li>
						<li><a class="eight-img-hover"
							href="//item.jd.com/30196738946.html"
							title="粉红大布娃娃秋装2018新款韩版女装时尚宽松绣花七分袖一字肩衬衫 本白色 S" target="_blank">
								<img style="position: absolute; margin-left: 10px;"
								alt="粉红大布娃娃秋装2018新款韩版女装时尚宽松绣花七分袖一字肩衬衫 本白色 S"
								src="<%=request.getContextPath()%>/resource/front/img/reformDetail/点不推荐.jpg"
								width="160" height="160" />
								<div class="eight-img-content">粉红大布娃娃秋装2018新款韩版女装时尚宽松绣花七分袖</div>
								<div class="eight-img-info">
									<div class="eight-img-count clearfix">
										热销 <em>274</em> 件
									</div>
									<div class="eight-img-money clearfix">
										<strong style="color: red; font-size: 14px; left: 40px;">￥249.00</strong>
									</div>
								</div>
						</a></li>
						<li><a class="eight-img-hover"
							href="//item.jd.com/30196738946.html"
							title="粉红大布娃娃秋装2018新款韩版女装时尚宽松绣花七分袖一字肩衬衫 本白色 S" target="_blank">
								<img style="position: absolute; margin-left: 10px;"
								alt="粉红大布娃娃秋装2018新款韩版女装时尚宽松绣花七分袖一字肩衬衫 本白色 S"
								src="<%=request.getContextPath()%>/resource/front/img/reformDetail/点不推荐.jpg"
								width="160" height="160" />
								<div class="eight-img-content">粉红大布娃娃秋装2018新款韩版女装时尚宽松绣花七分袖</div>
								<div class="eight-img-info">
									<div class="eight-img-count clearfix">
										热销 <em>274</em> 件
									</div>
									<div class="eight-img-money clearfix">
										<strong style="color: red; font-size: 14px; left: 40px;">￥249.00</strong>
									</div>
								</div>
						</a></li>
						<li><a class="eight-img-hover"
							href="//item.jd.com/30196738946.html"
							title="粉红大布娃娃秋装2018新款韩版女装时尚宽松绣花七分袖一字肩衬衫 本白色 S" target="_blank">
								<img style="position: absolute; margin-left: 10px;"
								alt="粉红大布娃娃秋装2018新款韩版女装时尚宽松绣花七分袖一字肩衬衫 本白色 S"
								src="<%=request.getContextPath()%>/resource/front/img/reformDetail/点不推荐.jpg"
								width="160" height="160" />
								<div class="eight-img-content">粉红大布娃娃秋装2018新款韩版女装时尚宽松绣花七分袖</div>
								<div class="eight-img-info">
									<div class="eight-img-count clearfix">
										热销 <em>274</em> 件
									</div>
									<div class="eight-img-money clearfix">
										<strong style="color: red; font-size: 14px; left: 40px;">￥249.00</strong>
									</div>
								</div>
						</a></li>
						<li><a class="eight-img-hover"
							href="//item.jd.com/30196738946.html"
							title="粉红大布娃娃秋装2018新款韩版女装时尚宽松绣花七分袖一字肩衬衫 本白色 S" target="_blank">
								<img style="position: absolute; margin-left: 10px;"
								alt="粉红大布娃娃秋装2018新款韩版女装时尚宽松绣花七分袖一字肩衬衫 本白色 S"
								src="<%=request.getContextPath()%>/resource/front/img/reformDetail/点不推荐.jpg"
								width="160" height="160" />
								<div class="eight-img-content">粉红大布娃娃秋装2018新款韩版女装时尚宽松绣花七分袖</div>
								<div class="eight-img-info">
									<div class="eight-img-count clearfix">
										热销 <em>274</em> 件
									</div>
									<div class="eight-img-money clearfix">
										<strong style="color: red; font-size: 14px; left: 40px;">￥249.00</strong>
									</div>
								</div>
						</a></li>
					</ul>
				</div>
				<div class="eight-left-03">
					<h3>店内新品</h3>
				</div>
				<div class="eight-left-10">
					<ul class="eight-left-10-img">
						<a class="seven-img-hover" href="//item.jd.com/30196738946.html"
							title="粉红大布娃娃秋装2018新款韩版女装时尚宽松绣花七分袖一字肩衬衫 本白色 S" target="_blank">
							<img style="position: absolute; left: 14px;"
							alt="粉红大布娃娃秋装2018新款韩版女装时尚宽松绣花七分袖一字肩衬衫 本白色 S"
							src="<%=request.getContextPath()%>/resource/front/img/reformDetail/店招推荐.jpg"
							width="160" height="160" />
							<div class="seven-img-content" style="margin-left: 14px;">粉红大布娃娃秋装2018新款韩版女装时尚宽松绣花七分袖</div>
							<div class="seven-img-money">
								<p
									style="color: red; text-align: center; font-size: 14px; left: 14px;">￥249.00</p>
							</div>
						</a>
					</ul>
				</div>
			</div>

			<div class="eight-right">
				<!--下面的个例外层div没加浮动，但内层ul加了浮动，为了保证代码的一致可维护性，就在外层div加了clearfix-->
				<div class="eight-right-introduce-01 clearfix">
					<ul class="eight-right-introduce-01-classify">
						<li class="eight-right-introduce-011"
							style="background-color: #E4393C;">商品介绍</li>
						<li class="eight-right-introduce-012">规格与包装</li>
						<li class="eight-right-introduce-013">售后保障</li>
						<li class="eight-right-introduce-014">商品评价</li>
						<li class="eight-right-introduce-015" style="width: 376px;">
							本店好评商品</li>
						<li class="eight-right-introduce-016" style="padding-top: 5px;">
							加入购物车</li>
					</ul>
				</div>
				<div class="eight-right-introduce-02">
					<ul>
						<li title="粉红大布娃娃" style="margin-top: 12px; margin-left: 50px;">
							品牌： <!-- <a style="color: blue;" href="//list.jd.com/list.html?cat=1315,1343,9719&ev=exbrand_6906" target="_blank">粉红大布娃娃</a> -->
							<a style="color: blue;"
							href="//list.jd.com/list.html?cat=1315,1343,9719&ev=exbrand_6906"
							target="_blank"> <span>${brand.name }</span>
						</a>
						</li>
					</ul>
				</div>
				<div class="eight-right-introduce-03">
					<ul class="eight-right-introduce-03-classify">
						<li title="${product.name }"><span
							style="width: 100px; overflow: hidden; text-overflow: ellipsis; white-space: nowrap;">${product.name }</span>
						</li>
						<li title="${productSku.skuCode }">商品编号： <span>${productSku.skuCode }</span>
						</li>
						<li title="粉红大布娃娃官方旗舰店">店铺： <a style="color: blue;"
							href="padding-top: 0px;" target="_blank">粉红大布娃娃官方旗舰店</a>
						</li>
						<li title="100.00g">商品毛重：100.00g</li>
						<li title="D18CDR099">货号：D18CDR099</li>
						<li title="松紧腰">腰型：松紧腰</li>
						<li title="甜美">风格：甜美</li>
						<li title="V领">领型：V领</li>
						<li title="25-29周岁">适用年龄：25-29周岁</li>
						<li title="其它">图案：其它</li>
						<li title="${size.sizeValue }">尺码： <span>${size.sizeValue }</span>
						</li>
						<li title="单件">组合规格：单件</li>
						<li title="修身型">版型：修身型</li>
						<li title="涤纶">主要材质：涤纶</li>
						<li title="荷叶边">流行元素：荷叶边</li>
						<li title="长袖">袖长：长袖</li>
						<li title="喇叭袖">袖型：喇叭袖</li>
						<li title="套头">衣门襟：套头</li>
						<li title="其它">裙型：其它</li>
						<li title="中长裙">裙长：中长裙</li>
						<li title="短袖连衣裙">分类：短袖连衣裙</li>
						<li title="胖mm">适用人群：胖mm</li>
						<li title="2018秋季">上市时间：2018秋季</li>
						<li></li>
					</ul>
				</div>
				<div class="eight-right-smallImg">
					<img
						src="<%=request.getContextPath()%>/resource/${ productSku.picBig }" />
				</div>
				<!--下面的个例外层div没加浮动，但内层ul加了浮动，为了保证代码的一致可维护性，就在外层div加了clearfix-->
				<div class="eight-right-bigImg clearfix">
					<ul class="eight-right-bigImg-classify">
						<li><img
							src="<%=request.getContextPath()%>/resource/front/img/reformDetail/小姐姐02.jpg" />
						</li>
						<li><img
							src="<%=request.getContextPath()%>/resource/front/img/reformDetail/小姐姐02.jpg" />
						</li>
						<li><img
							src="<%=request.getContextPath()%>/resource/front/img/reformDetail/小姐姐02.jpg" />
						</li>
					</ul>
				</div>
			</div>
			<div class="eight-bottom clearfix">
				<div class="eight-bottom-content-01">
					<h3>售后保障</h3>
				</div>
				<div class="eight-bottom-content-02">
					<div class="eight-bottom-content-02-t">
						<dl class="eight-bottom-content-02-tdl">
							<dt>
								<img
									src="<%=request.getContextPath()%>/resource/front/img/reformDetail/金盾.png" />
								<strong>卖家服务</strong>
							</dt>
							<dd></dd>
							<dt>
								<img
									src="<%=request.getContextPath()%>/resource/front/img/reformDetail/金盾.png" />
								<strong>京东承诺</strong>
							</dt>
							<dd style="margin-left: 70px;">
								京东平台卖家销售并发货的商品，由平台卖家提供发票和相应的售后服务。请您放心购买！ <br>
								注：因厂家会在没有任何提前通知的情况下更改产品包装、产地或者一些附件，本司不能确保客户收到的货物与商城图片、产地、附件说明完全一致。只能确保为原厂正货！并且保证与当时市场上同样主流新品一致。若本商城没有及时更新，请大家谅解！
							</dd>
							<dt>
								<img
									src="<%=request.getContextPath()%>/resource/front/img/reformDetail/金盾.png" />
								<strong>正品行货</strong>
							</dt>
							<dd style="margin-left: 70px;">
								京东商城向您保证所售商品均为正品行货，京东自营商品开具机打发票或电子发票。</dd>
						</dl>
					</div>
					<div class="eight-bottom-content-02-b">
						<p>
							<strong style="color: #E4393C;">权利声明：</strong> <br>
							京东上的所有商品信息、客户评价、商品咨询、网友讨论等内容，是京东重要的经营资源，未经许可，禁止非法转载使用。
						</p>
						<p>
							<b>注：</b>
							本站商品信息均来自于合作方，其真实性、准确性和合法性由信息拥有者（合作方）负责。本站不提供任何保证，并不承担任何法律责任。
						</p>
						<p style="height: 20px; margin-top: 30px; color: #E4393C;">
							<strong>价格说明：</strong>
						</p>
						<p style="height: 20px;">
							<b>京东价：</b> 京东价为商品的销售价，是您最终决定是否购买商品的依据。
						</p>
						<p>
							<b>划线价：</b> 商品展示的划横线价格为参考价，并非原价，该价格可能是品牌专柜标价、商品吊牌价或由品牌供应商提供的正品零售价
							（如厂商指导价、建议零售价等）或该商品在京东平台上曾经展示过的销售价；由于地区、时间的差异性和市场行情波动，品牌专柜标价、商品吊牌价等可能会与您购物时展示的不一致，该价格仅供您参考。
						</p>
						<p>
							<b>折扣：</b> 如无特殊说明，折扣指销售商在原价、或划线价（如品牌专柜标价、商品吊牌价、厂商指导价、厂商建议零售价）
							等某一价格基础上计算出的优惠比例或优惠金额；如有疑问，您可在购买前联系销售商进行咨询。
						</p>
						<p>
							<b>异常问题：</b> 商品促销信息以商品详情页“促销”栏中的信息为准；商品的具体售价以订单结算页价格为准；
							如您发现活动商品售价或促销信息有异常，建议购买前先联系销售商咨询。
						</p>
					</div>
				</div>
				<div class="eight-bottom-content-03">
					<h3>商品评价</h3>
				</div>
				<div class="eight-bottom-content-04">
					<div class="eight-bottom-content-04-tit">
						<strong style="color: #666;">好评度</strong>
						<div class="eight-bottom-content-04-con">
							100 <span style="font-size: 23px;">%</span>
						</div>
					</div>
					<div class="eight-bottom-content-04-info">
						<img
							src="<%=request.getContextPath()%>/resource/front/img/reformDetail/狗.png" />
						<div style="margin-left: 120px; bottom: 55px; color: #999;">
							此商品暂时还没有买家印象哦~</div>
					</div>
				</div>
				<!--
                    	作者：c曹威权
                    	时间：2018-08-03
                    	描述：不能分段触发hover
                    -->
				<!--下面的个例外层div没加浮动，但内层ul加了浮动，为了保证代码的一致可维护性，就在外层div加了clearfix-->
				<div class="eight-bottom-content-05 clearfix">
					<ul class="eight-bottom-content-05-classify">
						<li><a href="#" style="color: #E4393C;"> 全部评价 <em> <!-- (2) -->
									<c:forEach items="${listEvaluateCount}" var="EvaluateCount">
											(${EvaluateCount.evaluateNumStatus})
										</c:forEach>
							</em>
						</a></li>
						<li><a href="#" class="eight-bottom-content-05-a"> 晒图 <em>(5)</em>
						</a></li>
						<li class="eight-bottom-content-05-classify-li1"><a href="#"
							class="eight-bottom-content-05-b"> 追评 <em>(0)</em>
						</a></li>
						<li class="eight-bottom-content-05-classify-li2"><a href="#"
							class="eight-bottom-content-05-c"> 好评 <!-- <em>(2)</em> --> <em>(${product.evalGoodQty })</em>
						</a></li>
						<li class="eight-bottom-content-05-classify-li3"><a href="#"
							class="eight-bottom-content-05-d"> 中评 <em>(${product.evalGeneralQty })</em>
						</a></li>
						<li class="eight-bottom-content-05-classify-li4"><a href="#"
							class="eight-bottom-content-05-e"> 差评 <em>(${product.evalBadQty })</em>
						</a></li>
						<li style="width: 120px;"
							class="eight-bottom-content-05-classify-li5"><a href="#"
							class="eight-bottom-content-05-f"> <input type="checkbox"
								name="checkbox" id="checkbox" /> 只看当前商品评价
						</a></li>
						<li style="margin-left: 300px;">
							<div="eight-bottom-content-05-span">
								<span> 推荐排序 </span>
							</div>
						</li>
					</ul>
				</div>


				<div class="eight-bottom-content-06">
					<c:forEach items="${listEvaluateView}" var="Evaluate">
						<div class="eight-bottom-content-06-speaking">
							<div class="eight-bottom-content-06-speaking-tu">
								<img
									src="<%=request.getContextPath()%>/resource/front/img/reformDetail/b62.gif"
									/ alt="9***1" width="25" height="25">
								用户ID：${Evaluate.userId }
							</div>
							<div class="eight-bottom-content-06-speaking-con">
								<%-- <img src="<%=request.getContextPath()%>/resource/front/img/reformDetail/星.png"/> --%>
								${Evaluate.descriptionStatus }
								<p>
									<!-- 裙子很仙哦～～很美，穿上感觉自己小仙女哈哈哈。衣服料子很舒服哈，穿着凉爽透气，裙摆也很飘逸好看。星星点点的图案也好看～～挺满意的！ -->
									${Evaluate.evalContent}
								</p>
								<!-- <p style="top: 40px;">本白色印花&nbsp;&nbsp;&nbsp;M&nbsp;&nbsp;&nbsp;2018-07-30&nbsp;22:56</p> -->
								<p style="top: 20px;">${product.name}&nbsp;&nbsp;&nbsp;${Evaluate.sizeValue}&nbsp;&nbsp;&nbsp;${Evaluate.evaluateTime }</p>
							</div>
						</div>
					</c:forEach>
					<div class="eight-bottom-content-06-num"></div>
				</div>


				<div class="eight-bottom-content-07">
					<span>已忽略对购买帮助不大的评价</span> <a href="#"
						style="color: #666; top: 10px; left: 10px;">查看</a>
				</div>
				<!-- <div class="eight-bottom-content-09">
						「本店好评商品 暂无数据」
					</div> -->
			</div>
		</div>


		<!--nine-->
		<div class="nine">
			<div class="nine-top">
				<h3>猜你喜欢</h3>
				<span> <b>1</b> /2
				</span>
			</div>
			<!--下面的个例外层div没加浮动，但内层ul加了浮动，为了保证代码的一致可维护性，就在外层div加了clearfix-->
			<div class="nine-bottom clearfix">
				<ul class="nine-bottom-img">
					<li><a class="nine-img-hover"
						href="//item.jd.com/20099710.html"
						title="李宇春WhyMe ChrisLee十周年演唱会珍藏大礼包  whyme（京东专卖）（DVD）"
						target="_blank"> <img
							style="position: absolute; margin-left: 10px;"
							alt="李宇春WhyMe ChrisLee十周年演唱会珍藏大礼包  whyme（京东专卖）（DVD）"
							src="<%=request.getContextPath()%>/resource/front/img/reformDetail/春哥.jpg"
							width="160" height="160" />
							<div class="nine-img-content">李宇春WhyMe ChrisLee十周年演唱会珍藏大礼包
								whyme</div>
							<div class="nine-img-info">
								<strong style="color: red; font-size: 14px; left: 60px;">￥249.00</strong>
							</div>
					</a></li>
					<li><a class="nine-img-hover"
						href="//item.jd.com/20099710.html"
						title="李宇春WhyMe ChrisLee十周年演唱会珍藏大礼包  whyme（京东专卖）（DVD）"
						target="_blank"> <img
							style="position: absolute; margin-left: 10px;"
							alt="李宇春WhyMe ChrisLee十周年演唱会珍藏大礼包  whyme（京东专卖）（DVD）"
							src="<%=request.getContextPath()%>/resource/front/img/reformDetail/春哥.jpg"
							width="160" height="160" />
							<div class="nine-img-content">李宇春WhyMe ChrisLee十周年演唱会珍藏大礼包
								whyme</div>
							<div class="nine-img-info">
								<strong style="color: red; font-size: 14px; left: 60px;">￥249.00</strong>
							</div>
					</a></li>
					<li><a class="nine-img-hover"
						href="//item.jd.com/20099710.html"
						title="李宇春WhyMe ChrisLee十周年演唱会珍藏大礼包  whyme（京东专卖）（DVD）"
						target="_blank"> <img
							style="position: absolute; margin-left: 10px;"
							alt="李宇春WhyMe ChrisLee十周年演唱会珍藏大礼包  whyme（京东专卖）（DVD）"
							src="<%=request.getContextPath()%>/resource/front/img/reformDetail/春哥.jpg"
							width="160" height="160" />
							<div class="nine-img-content">李宇春WhyMe ChrisLee十周年演唱会珍藏大礼包
								whyme</div>
							<div class="nine-img-info">
								<strong style="color: red; font-size: 14px; left: 60px;">￥249.00</strong>
							</div>
					</a></li>
					<li><a class="nine-img-hover"
						href="//item.jd.com/20099710.html"
						title="李宇春WhyMe ChrisLee十周年演唱会珍藏大礼包  whyme（京东专卖）（DVD）"
						target="_blank"> <img
							style="position: absolute; margin-left: 10px;"
							alt="李宇春WhyMe ChrisLee十周年演唱会珍藏大礼包  whyme（京东专卖）（DVD）"
							src="<%=request.getContextPath()%>/resource/front/img/reformDetail/春哥.jpg"
							width="160" height="160" />
							<div class="nine-img-content">李宇春WhyMe ChrisLee十周年演唱会珍藏大礼包
								whyme</div>
							<div class="nine-img-info">
								<strong style="color: red; font-size: 14px; left: 60px;">￥249.00</strong>
							</div>
					</a></li>
					<li><a class="nine-img-hover"
						href="//item.jd.com/20099710.html"
						title="李宇春WhyMe ChrisLee十周年演唱会珍藏大礼包  whyme（京东专卖）（DVD）"
						target="_blank"> <img
							style="position: absolute; margin-left: 10px;"
							alt="李宇春WhyMe ChrisLee十周年演唱会珍藏大礼包  whyme（京东专卖）（DVD）"
							src="<%=request.getContextPath()%>/resource/front/img/reformDetail/春哥.jpg"
							width="160" height="160" />
							<div class="nine-img-content">李宇春WhyMe ChrisLee十周年演唱会珍藏大礼包
								whyme</div>
							<div class="nine-img-info">
								<strong style="color: red; font-size: 14px; left: 60px;">￥249.00</strong>
							</div>
					</a></li>
					<li><a class="nine-img-hover"
						href="//item.jd.com/20099710.html"
						title="李宇春WhyMe ChrisLee十周年演唱会珍藏大礼包  whyme（京东专卖）（DVD）"
						target="_blank"> <img
							style="position: absolute; margin-left: 10px;"
							alt="李宇春WhyMe ChrisLee十周年演唱会珍藏大礼包  whyme（京东专卖）（DVD）"
							src="<%=request.getContextPath()%>/resource/front/img/reformDetail/春哥.jpg"
							width="160" height="160" />
							<div class="nine-img-content">李宇春WhyMe ChrisLee十周年演唱会珍藏大礼包
								whyme</div>
							<div class="nine-img-info">
								<strong style="color: red; font-size: 14px; left: 60px;">￥249.00</strong>
							</div>
					</a></li>
				</ul>
			</div>
		</div>


		<!--tail-->
		<%@include file="bas_bottom.jsp"%>

		<!--牛皮癣-->
		<div class="niup">

			<div
				style="position: fixed; left: 1850px; top: 300px; border-right: 5px solid #7A6E6E;">
				<ul class="npx" style="margin-top: 500; padding: 5px">
					<li>
						<div style="top: 5px; margin-left: 5px">
							<img
								src="<%=request.getContextPath()%>/resource/front/img/search/npx1.png" />
						</div>
					</li>
					<li>
						<div style="top: 5px; margin-left: 5px">
							<img
								src="<%=request.getContextPath()%>/resource/front/img/search/npx2.png" />
						</div>
					</li>
					<li>
						<div style="top: 5px; margin-left: 5px">
							<img
								src="<%=request.getContextPath()%>/resource/front/img/search/npx3.png" />
						</div style="margin-top:5px;margin-left:5px">
					</li>
					<li>
						<div style="top: 5px; margin-left: 5px">
							<img
								src="<%=request.getContextPath()%>/resource/front/img/search/npx4.png" />
						</div>
					</li>
					<li>
						<div style="top: 5px; margin-left: 5px">
							<img
								src="<%=request.getContextPath()%>/resource/front/img/search/npx5.png" />
						</div>
					</li>
					<li style="margin-top: 200px">
						<div style="top: 5px; margin-left: 5px">
							<img
								src="<%=request.getContextPath()%>/resource/front/img/search/npx6.png" />
						</div>
					</li>
					<li>
						<div style="top: 5px; margin-left: 5px">
							<img
								src="<%=request.getContextPath()%>/resource/front/img/search/npx7.png" />
						</div>
					</li>
					<li>
						<div style="top: 5px; margin-left: 5px">
							<img
								src="<%=request.getContextPath()%>/resource/front/img/search/npx8.png" />
						</div>
					</li>
				</ul>
				<div></div>

			</div>
</body>
</html>