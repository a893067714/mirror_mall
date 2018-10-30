<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<link href="<%=request.getContextPath()%>/resource/front/css/common.css"
	rel="stylesheet" type="text/css" />
<link
	href="<%=request.getContextPath()%>/resource/front/css/index/index.css"
	rel="stylesheet" type="text/css" />
<link
	href="<%=request.getContextPath()%>/resource/front/fronticonfont/iconfont.css"
	rel="stylesheet" type="text/css" />
<title>京东女装首页</title>
</head>

<body>
	<%@include file="bas_header.jsp"%>

	<!--
        	作者：秦雷
        	时间：2018-08-02
        	描述：中部
        -->
	<div id="mid">
		<div id="mid_img">
			<a href="#"> <img
				src="<%=request.getContextPath()%>/resource/front/img/index/head.jpg" />
			</a>
		</div>
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
							style="width: 280; height: 36; margin-left: 10; border: none; line-height: 1; outline: none;" />
					</div>
					<div style="float: right; width: 88px; height: 38px;">
						<input type="button" value="搜索"
							onclick="location.href='SearchServlet.do' "
							style="color: #FFF3D8; font-size: 17px; background: #FF4466; border: none; width: 88; height: 38; cursor: pointer;" />
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
				<a href="AddCartServlet.do"
					style="color: #F30213; line-height: 34px; cursor: pointer; margin-left: 22;">我的购物车</a>
			</div>
			<div style="clear: both"></div>
		</div>





		<!--
        	作者：秦雷
        	时间：2018-08-02
        	描述：大家都在穿01
       		 -->
		<div id="mid_cont_01">
			<div class="mid_cont_01_left">
				<div style="background: #FF4466; height: 33px">
					<p
						style="color: #ffffff; line-height: 33px; font-size: 14px; padding: 0px 10px;">女装商品分类</p>
				</div>
				<c:forEach items="${tbvList}" var="typeBigView">
					<div
						style="border-bottom: 1px solid #FCADBC; background: #FF5B79; height: 150px; padding-right: 20px;">

						<div class="mid_cont_01_left_title">${typeBigView.typeBigName}</div>

						<c:forEach items="${typeBigView.listTypeDetail}" var="typeDetailQueryView">
							<ul>
								<li><a href="SearchServlet.do?typeDtlId=${typeDetailQueryView.typeDtlId}">${typeDetailQueryView.typeDtlName}</a></li>
							</ul>
						</c:forEach>
					</div>
				</c:forEach>
				<!-- <div
					style="border-bottom: 1px solid #FCADBC; background: #FF5B79; height: 115px; padding-right: 20px;">
					<div class="mid_cont_01_left_title">大家都在穿</div>
					<ul>
						<li><a href="#">18精品</a></li>
						<li><a href="#">连衣裙</a></li>
						<li><a href="#">短袖衬衫</a></li>
						<li><a href="#">T恤</a></li>
						<li><a href="#">雪纺连衣裙</a></li>
						<li><a href="#">防晒衣</a></li>
						<li><a href="#">卫衣</a></li>
						<li><a href="#">牛仔短外套</a></li>
						<li><a href="#">自营女装</a></li>
					</ul>
				</div>

				<div
					style="border-bottom: 1px solid #FCADBC; background: #FF5B79; height: 165px; padding-right: 30px;">
					<div class="mid_cont_01_left_title">女士裙装</div>
					<ul>
						<li><a href="#">哥弟新品</a></li>
						<li><a href="#">热卖新品</a></li>
						<li><a href="#">碎花连衣裙</a></li>
						<li><a href="#">背带裙</a></li>
						<li><a href="#">蕾丝裙</a></li>
						<li><a href="#">印花连衣裙</a></li>
						<li><a href="#">长裙</a></li>
						<li><a href="#">短袖连衣裙</a></li>
						<li><a href="#">衬衫裙</a></li>
						<li><a href="#">一字肩连衣裙</a></li>
						<li><a href="#">吊带连衣裙</a></li>
						<li><a href="#">春季新品</a></li>
						<li><a href="#">T恤裙</a></li>
					</ul>
				</div>
				<div
					style="border-bottom: 1px solid #FCADBC; background: #FF5B79; height: 140px; padding-right: 15px;">
					<div class="mid_cont_01_left_title">女士上装</div>
					<ul>
						<li><a href="#">针织衫</a></li>
						<li><a href="#">卫衣</a></li>
						<li><a href="#">衬衫</a></li>
						<li><a href="#">T恤</a></li>
						<li><a href="#">雪纺衫</a></li>
						<li><a href="#">短外套</a></li>
						<li><a href="#">风衣</a></li>
						<li><a href="#">毛衣</a></li>
						<li><a href="#">小西装</a></li>
						<li><a href="#">打底裤</a></li>
						<li><a href="#">棉服</a></li>
						<li><a href="#">皮衣</a></li>
						<li><a href="#">皮草</a></li>
						<li><a href="#">羽绒服</a></li>
						<li><a href="#">毛绒大衣</a></li>
					</ul>
				</div>
				<div
					style="border-bottom: 1px solid #FCADBC; background: #FF5B79; height: 115px; padding-right: 20px;">
					<div class="mid_cont_01_left_title">女士下装</div>
					<ul>
						<li><a href="#">牛仔裤</a></li>
						<li><a href="#">休闲裤</a></li>
						<li><a href="#">阔腿裤</a></li>
						<li><a href="#">哈伦裤</a></li>
						<li><a href="#">小脚裤</a></li>
						<li><a href="#">背带裤</a></li>
						<li><a href="#">喇叭裤</a></li>
						<li><a href="#">运动裤</a></li>
						<li><a href="#">黑色牛仔</a></li>
					</ul>
				</div>
				<div style="background: #FF5B79; height: 67px">
					<div class="mid_cont_01_left_title">特色品类</div>
					<ul>
						<li><a href="#">大码女装</a></li>
						<li><a href="#">中老年女装</a></li>
						<li><a href="#">旗袍</a></li>
					</ul>
				</div> -->
			</div>
			<div class="mid_cont_01_right">
				<div style="height: 380px; width: 968px;">
					<a href="#" style="display: block; height: 385px; width: 968;"><img
						src="<%=request.getContextPath()%>/resource/front/img/index/main.jpg;" /></a>
				</div>
				<div class="mid_cont_01_right_content">
					<div class="mid_cont_01_right_content_img">
						<a href="#"><img
							src="<%=request.getContextPath()%>/resource/front/img/index/main_01.png" /></a>
					</div>
					<div class="mid_cont_01_right_content_img">
						<a href="#"><img
							src="<%=request.getContextPath()%>/resource/front/img/index/main_01.png" /></a>
					</div>
					<div class="mid_cont_01_right_content_img">
						<a href="#"><img
							src="<%=request.getContextPath()%>/resource/front/img/index/main_01.png" /></a>
					</div>
					<div class="mid_cont_01_right_content_img">
						<a href="#"><img
							src="<%=request.getContextPath()%>/resource/front/img/index/main_01.png" /></a>
					</div>
					<div style="clear: both"></div>
				</div>
			</div>
			<div style="clear: both"></div>
		</div>
		<!--
            	作者：秦雷
            	时间：2018-08-02
            	描述：精选品牌02
            -->
		<div id="mid_cont_02">
			<div>
				<span style="color: #434343; font-size: 28px;">精选品牌</span> <span
					style="color: #b9b9b9; font-size: 14px;">SELECTED</span>
			</div>
			<div class="mid_cont_02_left">
				<img
					src="<%=request.getContextPath()%>/resource/front/img/index/content/brand/brand_main.jpg" />
			</div>
			<div class="mid_cont_02_right">
				<div class="mid_cont_02_right_top clearfix">
					<div>知名大牌</div>
					<div>品牌二</div>
					<div>品牌三</div>
				</div>
				<div class="mid_cont_02_right_content">
					<div class="mid_cont_02_right_content_table clearfix">
						<%-- <div>
							<a href="#"><img
								src="<%=request.getContextPath()%>/resource/front/img/index/content/brand/girdear.jpg" /></a>
						</div> --%>
						<c:forEach items="${brandList}" var="brand">
							<div>
								<a href="SearchServlet.do?brandId=${brand.brandId}"><img
									src="<%=request.getContextPath()%>/resource/${brand.brandPic}" /></a>
							</div>
						</c:forEach>
					</div>

				</div>
			</div>
		</div>
		<!--
            	作者：秦雷
            	时间：2018-08-02
            	描述：品牌上新03
            -->
		<div class="mid_cont_03 clearfix">
			
			<div>
				<span style="color: #434343; font-size: 28px;">品牌上新</span> <span
					style="color: #b9b9b9; font-size: 14px;">NEW</span>
			</div>
			<c:forEach items="${productList}" var="productSku">
				<div class="mid_cont_03_main">
					<a href="DetailsServlet.do?skuId=${productSku.productSkuId}"><img
						src="<%=request.getContextPath()%>/resource/${productSku.picMid}" /></a>
				</div>
			</c:forEach>
			<%-- <div class="mid_cont_03_main">
				<a href="#"><img
					src="<%=request.getContextPath()%>/resource/front/img/index/content/new/main.jpg"></a>
			</div>
			<div class="mid_cont_03_main">
				<a href="#"><img
					src="<%=request.getContextPath()%>/resource/front/img/index/content/new/2.jpg"></a>
			</div>
			<div class="mid_cont_03_main">
				<a href="#"><img
					src="<%=request.getContextPath()%>/resource/front/img/index/content/new/main.jpg"></a>
			</div>
			<div class="mid_cont_03_main">
				<a href="#"><img
					src="<%=request.getContextPath()%>/resource/front/img/index/content/new/main.jpg"></a>
			</div>
			<div class="mid_cont_03_main">
				<a href="#"><img
					src="<%=request.getContextPath()%>/resource/front/img/index/content/new/main.jpg"></a>
			</div> --%>
		</div>

		<!--
            	作者：秦雷
            	时间：2018-08-02
            	描述：潮流穿搭04
            -->
		<div class="mid_cont_04 clearfix">
			<div>
				<span style="color: #434343; font-size: 28px;">潮流穿搭</span> <span
					style="color: #b9b9b9; font-size: 14px;">TREND</span>
			</div>
			<div class="mid_cont_04_left">
				<div>
					<a href="#"><img
						src="<%=request.getContextPath()%>/resource/front/img/index/content/trend/1.jpg"></a>
				</div>
			</div>
			<div class="mid_cont_04_mid">
				<div class="mid_cont_04_mid_top">
					<div>
						<a href="#"><img
							src="<%=request.getContextPath()%>/resource/front/img/index/content/trend/2.jpg"></a>
					</div>
				</div>
				<div class="mid_cont_04_mid_bottom clearfix">
					<div>
						<div>
							<a href="#"><img
								src="<%=request.getContextPath()%>/resource/front/img/index/content/trend/3.jpg"></a>
						</div>
					</div>
					<div>
						<div>
							<a href="#"><img
								src="<%=request.getContextPath()%>/resource/front/img/index/content/trend/4.jpg"></a>
						</div>
					</div>
				</div>
			</div>
			<div class="mid_cont_04_right">
				<a href="#"><img
					src="<%=request.getContextPath()%>/resource/front/img/index/content/trend/5.jpg"></a>
			</div>
		</div>

		<!--
            	作者：秦雷
            	时间：2018-08-02
            	描述：国际大牌05
           -->
		<div class="mid_cont_05 clearfix">

			<div>
				<span style="color: #434343; font-size: 28px;">国际大牌</span> <span
					style="color: #b9b9b9; font-size: 14px;">INTERNATIONAL</span>
			</div>
			<div class="mid_cont_05_left">
				<div style="">
					<a href="#"><img
						src="<%=request.getContextPath()%>/resource/front/img/index/content/international/1.jpg"></a>
				</div>
			</div>
			<div class="mid_cont_05_right">
				<div>
					<a href="#"> <img
						src="<%=request.getContextPath()%>/resource/front/img/index/content/international/2.jpg"></a>
				</div>

			</div>
			<div class="mid_cont_05_right">
				<div>
					<a href="#"><img
						src="<%=request.getContextPath()%>/resource/front/img/index/content/international/2.jpg"></a>
				</div>
			</div>
			<div class="mid_cont_05_right">
				<div>
					<a href="#"><img
						src="<%=request.getContextPath()%>/resource/front/img/index/content/international/2.jpg"></a>
				</div>
			</div>
			<div class="mid_cont_05_right">
				<div>
					<a href="#"><img
						src="<%=request.getContextPath()%>/resource/front/img/index/content/international/2.jpg"></a>
				</div>
			</div>
		</div>

		<!--
            	作者：秦雷
            	时间：2018-08-02
            	描述：商场大牌06
          -->
		<div class="mid_cont_06 clearfix">
			<div>
				<span style="color: #434343; font-size: 28px;">商场大牌</span> <span
					style="color: #b9b9b9; font-size: 14px;">MARKET</span>
			</div>
			<div class="mid_cont_06_left">
				<div>
					<a href="#"><img
						src="<%=request.getContextPath()%>/resource/front/img/index/content/market/1.jpg"></a>
				</div>
			</div>
			<div class="mid_cont_06_right">
				<div>
					<a href="#"><img
						src="<%=request.getContextPath()%>/resource/front/img/index/content/market/2.png"></a>
				</div>
			</div>
			<div class="mid_cont_06_right">
				<div>
					<a href="#"><img
						src="<%=request.getContextPath()%>/resource/front/img/index/content/market/2.png"></a>
				</div>
			</div>
			<div class="mid_cont_06_right">
				<div>
					<a href="#"><img
						src="<%=request.getContextPath()%>/resource/front/img/index/content/market/2.png"></a>
				</div>
			</div>
			<div class="mid_cont_06_right">
				<div>
					<a href="#"><img
						src="<%=request.getContextPath()%>/resource/front/img/index/content/market/2.png"></a>
				</div>
			</div>
			<div class="mid_cont_06_right">
				<div>
					<a href="#"><img
						src="<%=request.getContextPath()%>/resource/front/img/index/content/market/2.png"></a>
				</div>
			</div>
			<div class="mid_cont_06_right">
				<div>
					<a href="#"><img
						src="<%=request.getContextPath()%>/resource/front/img/index/content/market/2.png"></a>
				</div>
			</div>
		</div>

		<!--
            	作者：秦雷
            	时间：2018-08-02
            	描述：温婉淑女07
          -->
		<div class="mid_cont_07 clearfix">
			<div>
				<span style="color: #434343; font-size: 28px;">温婉淑女</span> <span
					style="color: #b9b9b9; font-size: 14px;">LADY</span>
			</div>
			<div class="mid_cont_07_left1">
				<div class="mid_cont_07_left_nav">
					<ul>
						<li><a href="#">淑女风</a></li>
						<li><a href="#">粉色外套</a></li>
						<li><a href="#">荷叶边</a></li>
						<li><a href="#">灯笼袖衬衫</a></li>
						<li><a href="#">长袖连衣裙</a></li>
						<li><a href="#">套装连衣裙</a></li>
						<li><a href="#">木耳边</a></li>
						<li><a href="#">开衫</a></li>
						<li><a href="#">烟管裤</a></li>
					</ul>
				</div>
				<div class="mid_cont_07_left_img">
					<a href="#"><img
						src="<%=request.getContextPath()%>/resource/front/img/index/content/lady/1.jpg"></a>
				</div>
			</div>
			<div class="mid_cont_07_left2">
				<a href="#"><img
					src="<%=request.getContextPath()%>/resource/front/img/index/content/lady/2.jpg"></a>
			</div>
			<div class="mid_cont_07_left2">
				<a href="#"><img
					src="<%=request.getContextPath()%>/resource/front/img/index/content/lady/2.jpg"></a>
			</div>
			<div class="mid_cont_07_left3">
				<a href="#"><img
					src="<%=request.getContextPath()%>/resource/front/img/index/content/lady/3.jpg"></a>
			</div>
		</div>

		<!--
            	作者：秦雷
            	时间：2018-08-02
            	描述：青春时尚08
            -->
		<div class="mid_cont_07 clearfix">
			<div>
				<span style="color: #434343; font-size: 28px;">青春时尚</span> <span
					style="color: #b9b9b9; font-size: 14px;">FASHION</span>
			</div>
			<div class="mid_cont_07_left1">
				<div class="mid_cont_07_left_nav">
					<ul>
						<li><a href="#">淑女风</a></li>
						<li><a href="#">粉色外套</a></li>
						<li><a href="#">荷叶边</a></li>
						<li><a href="#">灯笼袖衬衫</a></li>
						<li><a href="#">长袖连衣裙</a></li>
						<li><a href="#">套装连衣裙</a></li>
						<li><a href="#">木耳边</a></li>
						<li><a href="#">开衫</a></li>
						<li><a href="#">烟管裤</a></li>
					</ul>
				</div>
				<div class="mid_cont_07_left_img">
					<a href="#"><img
						src="<%=request.getContextPath()%>/resource/front/img/index/content/lady/1.jpg"></a>
				</div>
			</div>
			<div class="mid_cont_07_left2">
				<a href="#"><img
					src="<%=request.getContextPath()%>/resource/front/img/index/content/lady/2.jpg"></a>
			</div>
			<div class="mid_cont_07_left2">
				<a href="#"><img
					src="<%=request.getContextPath()%>/resource/front/img/index/content/lady/2.jpg"></a>
			</div>
			<div class="mid_cont_07_left3">
				<a href="#"><img
					src="<%=request.getContextPath()%>/resource/front/img/index/content/lady/3.jpg"></a>
			</div>
		</div>

		<!--
            	作者：秦雷
            	时间：2018-08-02
            	描述：优雅格调09
            -->
		<div class="mid_cont_03 clearfix">
			<div>
				<span style="color: #434343; font-size: 28px;">优雅格调</span> <span
					style="color: #b9b9b9; font-size: 14px;">GRACE</span>
			</div>
			<div class="mid_cont_03_main">
				<a href="#"><img
					src="<%=request.getContextPath()%>/resource/front/img/index/content/new/main.jpg"></a>
			</div>
			<div class="mid_cont_03_main">
				<a href="#"><img
					src="<%=request.getContextPath()%>/resource/front/img/index/content/new/2.jpg"></a>
			</div>
			<div class="mid_cont_03_main">
				<a href="#"><img
					src="<%=request.getContextPath()%>/resource/front/img/index/content/new/main.jpg"></a>
			</div>
			<div class="mid_cont_03_main">
				<a href="#"><img
					src="<%=request.getContextPath()%>/resource/front/img/index/content/new/main.jpg"></a>
			</div>
			<div class="mid_cont_03_main">
				<a href="#"><img
					src="<%=request.getContextPath()%>/resource/front/img/index/content/new/main.jpg"></a>
			</div>
		</div>

		<%-- <!--
            	作者：秦雷
            	时间：2018-08-02
            	描述：原创设计10
            -->
		<div class="mid_cont_03 clearfix">
			<div>
				<span style="color: #434343; font-size: 28px;">原创设计</span> <span
					style="color: #b9b9b9; font-size: 14px;">DESIGN</span>
			</div>
			<div class="mid_cont_03_main">
				<a href="#"><img
					src="<%=request.getContextPath()%>/resource/front/img/index/content/new/main.jpg"></a>
			</div>
			<div class="mid_cont_03_main">
				<a href="#"><img
					src="<%=request.getContextPath()%>/resource/front/img/index/content/new/2.jpg"></a>
			</div>
			<div class="mid_cont_03_main">
				<a href="#"><img
					src="<%=request.getContextPath()%>/resource/front/img/index/content/new/main.jpg"></a>
			</div>
			<div class="mid_cont_03_main">
				<a href="#"><img
					src="<%=request.getContextPath()%>/resource/front/img/index/content/new/main.jpg"></a>
			</div>
			<div class="mid_cont_03_main">
				<a href="#"><img
					src="<%=request.getContextPath()%>/resource/front/img/index/content/new/main.jpg"></a>
			</div>
		</div> --%>

		<!--
            	作者：秦雷
            	时间：2018-08-02
            	描述：潮流时尚11
            -->
		<div class="mid_cont_03 clearfix">
			<div>
				<span style="color: #434343; font-size: 28px;">潮流时尚</span> <span
					style="color: #b9b9b9; font-size: 14px;">REND</span>
			</div>
			<div class="mid_cont_03_main">
				<a href="#"><img
					src="<%=request.getContextPath()%>/resource/front/img/index/content/new/main.jpg"></a>
			</div>
			<div class="mid_cont_03_main">
				<a href="#"><img
					src="<%=request.getContextPath()%>/resource/front/img/index/content/new/2.jpg"></a>
			</div>
			<div class="mid_cont_03_main">
				<a href="#"><img
					src="<%=request.getContextPath()%>/resource/front/img/index/content/new/main.jpg"></a>
			</div>
			<div class="mid_cont_03_main">
				<a href="#"><img
					src="<%=request.getContextPath()%>/resource/front/img/index/content/new/main.jpg"></a>
			</div>
			<div class="mid_cont_03_main">
				<a href="#"><img
					src="<%=request.getContextPath()%>/resource/front/img/index/content/new/main.jpg"></a>
			</div>
		</div>

		<!--
            	作者：秦雷
            	时间：2018-08-02
            	描述：主题市场12
            -->
		<div class="mid_cont_12">
			<div>
				<span style="color: #434343; font-size: 28px;">主题市场</span> <span
					style="color: #b9b9b9; font-size: 14px;">THEME</span>
			</div>
			<div class="mid_cont_12_top">
				<a href="#"><img
					src="<%=request.getContextPath()%>/resource/front/img/index/content/theme/1.jpg"></a>
			</div>
			<div class="mid_cont_12_top">
				<a href="#"><img
					src="<%=request.getContextPath()%>/resource/front/img/index/content/theme/1.jpg"></a>
			</div>
			<div class="mid_cont_12_top">
				<a href="#"><img
					src="<%=request.getContextPath()%>/resource/front/img/index/content/theme/1.jpg"></a>
			</div>
			<div class="mid_cont_12_top">
				<a href="#"><img
					src="<%=request.getContextPath()%>/resource/front/img/index/content/theme/1.jpg"></a>
			</div>
			<div class="mid_cont_12_top">
				<a href="#"><img
					src="<%=request.getContextPath()%>/resource/front/img/index/content/theme/1.jpg"></a>
			</div>
		</div>


		<!--
            	作者：秦雷
            	时间：2018-08-02
            	描述：热销精品13
            -->
		<div class="mid_cont_13 clearfix">
			<div>
				<span style="color: #434343; font-size: 28px;">热销精品</span> <span
					style="color: #b9b9b9; font-size: 14px;">HOT</span>
			</div>
			<div class="mid_cont_13_top clearfix">
				<ul>
					<li><span>连衣裙</span></li>
					<li><span>连衣裙</span></li>
					<li><span>连衣裙</span></li>
					<li><span>连衣裙</span></li>
					<li style="border-right: none;"><span>连衣裙</span></li>
				</ul>
			</div>
			<div class="mid_cont_13_bottom">
				<div>
					<div>
						<a href="#"><img
							src="<%=request.getContextPath()%>/resource/front/img/index/content/hot/1.jpg"></a>
						<p style="text-align: center; line-height: 30px;">南极人
							连衣裙女2018夏季新款大码女</p>
						<p style="text-align: center;">405人评价</p>
					</div>
					<div>
						<a href="#"><img
							src="<%=request.getContextPath()%>/resource/front/img/index/content/hot/1.jpg"></a>
					</div>
					<div>
						<a href="#"><img
							src="<%=request.getContextPath()%>/resource/front/img/index/content/hot/1.jpg"></a>
					</div>
					<div>
						<a href="#"><img
							src="<%=request.getContextPath()%>/resource/front/img/index/content/hot/1.jpg"></a>
					</div>
					<div style="border-right: none;">
						<a href="#"><img
							src="<%=request.getContextPath()%>/resource/front/img/index/content/hot/1.jpg"></a>
					</div>
				</div>
				<div>
					<div>
						<a href="#"><img
							src="<%=request.getContextPath()%>/resource/front/img/index/content/hot/1.jpg"></a>
					</div>
					<div>
						<a href="#"><img
							src="<%=request.getContextPath()%>/resource/front/img/index/content/hot/1.jpg"></a>
					</div>
					<div>
						<a href="#"><img
							src="<%=request.getContextPath()%>/resource/front/img/index/content/hot/1.jpg"></a>
					</div>
					<div>
						<a href="#"><img
							src="<%=request.getContextPath()%>/resource/front/img/index/content/hot/1.jpg"></a>
					</div>
					<div style="border-right: none;">
						<a href="#"><img
							src="<%=request.getContextPath()%>/resource/front/img/index/content/hot/1.jpg"></a>
					</div>
				</div>
			</div>
		</div>

		<!--
            	作者：秦雷
            	时间：2018-08-02
            	描述：内容末尾14
            -->
		<div class="mid_cont_14 clearfix">
			<div>
				<div class="mid_cont_14_top">
					<a href="#">连衣裙</a>
				</div>
				<div class="mid_cont_14_body">
					<a href="#"> <img
						src="<%=request.getContextPath()%>/resource/front/img/index/content/contfoot/1.jpg" />
					</a>
				</div>
				<div class="mid_cont_14_bottom">
					<ul class="mid_cont_14_bottom_cont">
						<li style="float: left;">
							<ul>
								<li><a href="#">新品裙装</a></li>
								<li><a href="#">针织系列</a></li>
								<li><a href="#">套装系列</a></li>
								<li><a href="#">原创系列</a></li>
								<li><a href="#">印花系列</a></li>
							</ul>
						</li>
						<li style="float: right;">
							<ul>
								<li><a href="#">长袖系列</a></li>
								<li><a href="#">蕾丝系列</a></li>
								<li><a href="#">雪纺系列</a></li>
								<li><a href="#">红色系列</a></li>
								<li><a href="#">露肩系列</a></li>
							</ul>
						</li>
					</ul>
				</div>
			</div>
			<div>
				<div class="mid_cont_14_top">
					<a href="#">连衣裙</a>
				</div>
				<div class="mid_cont_14_body">
					<a href="#"> <img src="img/index/content/contfoot/2.jpg" />
					</a>
				</div>
				<div class="mid_cont_14_bottom">
					<ul class="mid_cont_14_bottom_cont">
						<li style="float: left;">
							<ul>
								<li><a href="#">新品针织</a></li>
								<li><a href="#">针织开衫</a></li>
								<li><a href="#">套装系列</a></li>
								<li><a href="#">原创系列</a></li>
							</ul>
						</li>
						<li style="float: right;">
							<ul>
								<li><a href="#">长袖系列</a></li>
								<li><a href="#">蕾丝系列</a></li>
								<li><a href="#">雪纺系列</a></li>
								<li><a href="#">红色系列</a></li>
							</ul>
						</li>
					</ul>
				</div>
			</div>
			<div>
				<div class="mid_cont_14_top">
					<a href="#">连衣裙</a>
				</div>
				<div class="mid_cont_14_body">
					<a href="#"> <img
						src="<%=request.getContextPath()%>/resource/front/img/index/content/contfoot/3.jpg" />
					</a>
				</div>
				<div class="mid_cont_14_bottom">
					<ul class="mid_cont_14_bottom_cont">
						<li style="float: left;">
							<ul>
								<li><a href="#">新品裙装</a></li>
								<li><a href="#">针织系列</a></li>
								<li><a href="#">套装系列</a></li>
								<li><a href="#">原创系列</a></li>
								<li><a href="#">印花系列</a></li>
							</ul>
						</li>
						<li style="float: right;">
							<ul>
								<li><a href="#">长袖系列</a></li>
								<li><a href="#">蕾丝系列</a></li>
								<li><a href="#">雪纺系列</a></li>
								<li><a href="#">红色系列</a></li>
								<li><a href="#">露肩系列</a></li>
							</ul>
						</li>
					</ul>
				</div>
			</div>
			<div>
				<div class="mid_cont_14_top">
					<a href="#">连衣裙</a>
				</div>
				<div class="mid_cont_14_body">
					<a href="#"> <img
						src="<%=request.getContextPath()%>/resource/front/img/index/content/contfoot/4.jpg" />
					</a>
				</div>
				<div class="mid_cont_14_bottom">
					<ul class="mid_cont_14_bottom_cont">
						<li style="float: left;">
							<ul>
								<li><a href="#">新品裙装</a></li>
								<li><a href="#">针织系列</a></li>
								<li><a href="#">套装系列</a></li>
								<li><a href="#">原创系列</a></li>
								<li><a href="#">印花系列</a></li>
							</ul>
						</li>
						<li style="float: right;">
							<ul>
								<li><a href="#">长袖系列</a></li>
								<li><a href="#">蕾丝系列</a></li>
								<li><a href="#">雪纺系列</a></li>
								<li><a href="#">红色系列</a></li>
								<li><a href="#">露肩系列</a></li>
							</ul>
						</li>
					</ul>
				</div>
			</div>
			<div>
				<div class="mid_cont_14_top">
					<a href="#">连衣裙</a>
				</div>
				<div class="mid_cont_14_body">
					<a href="#"> <img
						src="<%=request.getContextPath()%>/resource/front/img/index/content/contfoot/5.jpg" />
					</a>
				</div>
				<div class="mid_cont_14_bottom">
					<ul class="mid_cont_14_bottom_cont">
						<li style="float: left;">
							<ul>
								<li><a href="#">新品裙装</a></li>
								<li><a href="#">针织系列</a></li>
								<li><a href="#">套装系列</a></li>
								<li><a href="#">原创系列</a></li>
								<li><a href="#">印花系列</a></li>
							</ul>
						</li>
						<li style="float: right;">
							<ul>
								<li><a href="#">长袖系列</a></li>
								<li><a href="#">蕾丝系列</a></li>
								<li><a href="#">雪纺系列</a></li>
								<li><a href="#">红色系列</a></li>
								<li><a href="#">露肩系列</a></li>
							</ul>
						</li>
					</ul>
				</div>
			</div>
			<div>
				<div class="mid_cont_14_top">
					<a href="#">连衣裙</a>
				</div>
				<div class="mid_cont_14_body">
					<a href="#"> <img
						src="<%=request.getContextPath()%>/resource/front/img/index/content/contfoot/6.jpg" />
					</a>
				</div>
				<div class="mid_cont_14_bottom">
					<ul class="mid_cont_14_bottom_cont">
						<li style="float: left;">
							<ul>
								<li><a href="#">新品裙装</a></li>
								<li><a href="#">针织系列</a></li>
								<li><a href="#">套装系列</a></li>
								<li><a href="#">原创系列</a></li>
								<li><a href="#">印花系列</a></li>
							</ul>
						</li>
						<li style="float: right;">
							<ul>
								<li><a href="#">长袖系列</a></li>
								<li><a href="#">蕾丝系列</a></li>
								<li><a href="#">雪纺系列</a></li>
								<li><a href="#">红色系列</a></li>
								<li><a href="#">露肩系列</a></li>
							</ul>
						</li>
					</ul>
				</div>
			</div>
			<div>
				<div class="mid_cont_14_top">
					<a href="#">连衣裙</a>
				</div>
				<div class="mid_cont_14_body">
					<a href="#"> <img
						src="<%=request.getContextPath()%>/resource/front/img/index/content/contfoot/7.jpg" />
					</a>
				</div>
				<div class="mid_cont_14_bottom">
					<ul class="mid_cont_14_bottom_cont">
						<li style="float: left;">
							<ul>
								<li><a href="#">新品裙装</a></li>
								<li><a href="#">针织系列</a></li>
								<li><a href="#">套装系列</a></li>
								<li><a href="#">原创系列</a></li>
								<li><a href="#">印花系列</a></li>
							</ul>
						</li>
						<li style="float: right;">
							<ul>
								<li><a href="#">长袖系列</a></li>
								<li><a href="#">蕾丝系列</a></li>
								<li><a href="#">雪纺系列</a></li>
								<li><a href="#">红色系列</a></li>
								<li><a href="#">露肩系列</a></li>
							</ul>
						</li>
					</ul>
				</div>
			</div>
		</div>
	</div>

	<!--尾部-->
	<%@include file="bas_bottom.jsp"%>
</body>

</html>