<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>结算页</title>
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/resource/front/css/common.css" />
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/resource/front/css/balance/balance.css" />
</head>
<body>
	<div class="all">
		<!--头-->
		<%@include file="bas_header.jsp"%>

		<!--结算-->
		<div class="deal">
			<div class="deal-img clearfix">
				<img
					src="<%=request.getContextPath()%>/resource/front/img/index/京东.png" />
				<a href="" style="color: #666; bottom: 25px; left: 10px;"> <span
					style="font-size: 18px;">结算页</span>
				</a>
			</div>
			<div class="deal-infor clearfix">
				<img
					src="<%=request.getContextPath()%>/resource/front/img/balance/订单流程.png" /><br>
				<dl class="deal-infor-dl">
					<dd style="color: #caecb6;">1.我的购物车</dd>
					<dd style="color: #7abd54;">2.填写核对订单信息</dd>
					<dd style="color: #ccc;">3.成功提交订单</dd>
				</dl>
			</div>
		</div>

		<!--孤儿-->
		<div class="middle-checked">
			<span>填写并核对订单信息</span>
		</div>

		<!--middle-->
		<div class="middle">
			<div class="middle-infor" style="height: 800px">
				<div class="middle-infor-con">
					<!--
                        	作者：offline
                        	时间：2018-08-03
                        	描述：middle-infor-con-01超链接问题，下回改
                        -->
					<div class="middle-infor-con-01">
						<h3>收货人信息</h3>
						<a href="">新增收货地址</a>
					</div>

					<div class="middle-infor-con-02">
						<ul>
							<li class="middle-infor-con-02-li">
								<div class="middle-infor-con-02-span1">
									<span style="top: 5px;" title="雷雷酱">${userInfo.name}&nbsp;江西</span>
								</div>
								<div class="middle-infor-con-02-mar">
									<div class="middle-infor-con-02-span2">
										<span title="雷雷酱">${userInfo.name}</span> <span
											title="江西 上饶市 鄱阳县 昌洲乡 昌洲乡张家张家">${a.addressCont} </span> <span
											style="left: 15px;">${a.receiverName}&nbsp;${a.receiverPhone}</span>
											<input type="hidden" name = "addressId" value="${a.addressId}"/>
										<span
											style="left: 30px; color: #FFFFFF; background-color: #b6b6b6;">默认地址</span>
									</div>
									<a href="" style="color: blue; left: 700px; bottom: 10px;">编辑</a>
								</div>
							</li>
						</ul>
					</div>

					<div class="middle-infor-con-03">
						<span style="color: #666;"> 更多地址 </span>
					</div>

					<div class="middle-infor-con-04">
						<span
							style="background-color: #E4393C; color: #FFFFFF; padding: 3px;">京东自提</span>
						<span style="color: #E4393C; margin-left: 5px;">抱歉，存在不支持自提的商品或该地址下没有可用的自提点</span>
						<a href="" target="_blank" style="margin-left: 10px;">详情</a>
					</div>
				</div>

				<div class="middle-infor-deal">
					<div class="middle-infor-deal-01">
						<h3>支付方式</h3>
					</div>
					<div class="middle-infor-deal-02">
						<div class="middle-infor-deal-02-t clearfix">
							<span style="top: 5px;">货到付款</span>
						</div>
						<div class="middle-infor-deal-02-b clearfix">
							<span style="top: 5px;">在线支付</span>
						</div>
						<span style="color: #666; left: 20px; top: 5px;">更多</span>
					</div>
				</div>

				<div class="middle-infor-list">
					<div class="middle-infor-list-shang">
						<h3>送货清单</h3>
						<div class="middle-infor-list-shang-form">
							<a href="">价格说明</a> <a href="" style="left: 35px;">返回修改购物车</a>
						</div>
					</div>

					<form action="OrderServlet.do?method=addOrderAndOrderSKU" method="post">

						<div style="overflow-y: auto; width: auto; height: 500px;">
							<c:forEach items="${carts }" var="carts">
								<div class="middle-infor-list-xia">
									<div class="middle-infor-list-xia-zuo clearfix">
										<h4 style="color: #666; left: 25px; top: 5px;">配送方式</h4>
										<span class="middle-infor-list-xia-zuo-span"> 快递运输 </span> <span
											style="color: #666666; top: 90px; width: 100px; right: 127px;">
											配送时间：均可送货 </span>
											<input type="hidden" value="${carts.productSkuId }" name = "productSkuId">
											<input type="hidden" value="${carts.priceCurrent }" name = "priceCurrent">
											<input type="hidden" value="${carts.cartId }" name = "cartId">
											<input type="hidden" name = "addressId" value="${a.addressId}"/>
										<div class="middle-infor-list-xia-zuo-b">
											<a href="" style="color: blue;">运费险</a>
										</div>
									</div>
									<div class="middle-infor-list-xia-you clearfix">
										<div class="middle-infor-list-xia-you01">
											<h4 style="color: #666666; left: 20px; top: 5px;">商家：鳄鱼恤羊绒衫旗舰店</h4>
										</div>
										<div class="middle-infor-list-xia-you02">
											<div class="middle-infor-list-xia-you02-t">
												<strong style="color: #666666; left: 20px; top: 5px;">活动商品已购满1件，已减119.90元现金</strong>
												<span
													style="left: 40px; color: #7abd54; border: 1px solid #7abd54; padding: 3px;">
													返现：￥119.90 </span>
											</div>
											<div class="middle-infor-list-xia-you02-b">
												<img
													style="left: 20px; top: 10px; border: 1px solid #f0f0f0;"
													src="<%=request.getContextPath()%>/resource/front/img/balance/鳄鱼.jpg"
													width="80px" height="80px" />
												<div style="width: 245px;">
													<a href="" target="_blank"
														style="color: #666666; left: 115px; bottom: 75px">
														${carts.name }
														${carts.colorValue }${carts.sizeValue }</a>
												</div>
												<strong style="color: #E4393C; left: 400px; bottom: 110px;">
													<span style="text-decoration: line-through;">原价:${carts.priceOrigin }</span>现价:${carts.priceCurrent }
												</strong> <span style="color: #666666; left: 430px; bottom: 110px;">x${carts.quantity }</span>
												<span style="color: #666666; left: 460px; bottom: 110px;">有货</span>
												<span style="color: #6679b3; bottom: 65px; right: 5px;">支持7天无理由退货</span>小计:${carts.priceCurrent*carts.quantity}
											</div>
										</div>
										<!-- <div class="middle-infor-list-xia-you03">
									<span style="left: 20px; top: 10px;">商家备注:</span> <span
										style="left: 20px; top: 10px; border: 1px solid #e6e6e6; background-color: #f4fbfe; color: #000000; padding: 9px;">（定制类商品，请将购买需求在备注上做详细说明）请勿填写与支付、收货、发票有关信息</span>
								</div> -->
									</div>
								</div>

							</c:forEach>
						</div>
				</div>

				<%-- 				<div class="middle-infor-bill" style="margin-top: 25px;">
					<div class="middle-infor-bill-t">
						<h3 style="font-size: 14px; color: #333333; top: 10px;">发票信息</h3>
						<span
							style="bottom: 10px; left: 80px; border: 1px solid #DDDDDD; color: #333333; box-shadow: 0px 0px 1px 0px; padding: 9px;">
							<img
							src="<%=request.getContextPath()%>/resource/front/img/balance/light-icon.png" />
							开企业抬头发票须填写纳税人识别号，以免影响报销
						</span>
					</div>
					<div class="middle-infor-bill-b">
						<span style="color: #666666; top: 10px; left: 20px;">不开发票</span> <a
							href="" class="middle-infor-bill-b-a"
							style="top: 10px; left: 20px;">修改</a>
					</div>
				</div> --%>

				<%-- 				<div class="middle-infor-favour">
					<h3 style="color: #333333; font-size: 14px; top: 15px;">使用优惠/礼品卡/抵用</h3>
					<img
						src="<%=request.getContextPath()%>/resource/front/img/balance/arrow-down.png"
						style="left: 150px; bottom: 7px;" />
				</div> --%>

			</div>
			<div class="middle-number">
				<div class="middle-numbe-infor clearfix">
					<div class="middle-numbe-infor-01 clearfix">
						<span style="color: #666666; left: 40px;"> <em
							style="color: #E4393C;">1</em> 件商品，总商品金额：
						</span> <span style="left: 100px;">￥${totalPrice }</span>
						<input type="hidden" value="${totalPrice }" name = "totalPrice">
					</div>
					<div class="middle-numbe-infor-01 clearfix">
						<span style="color: #666666; left: 136px;"> 返现： </span> <span
							style="left: 200px;"> -￥119.90</span>
					</div>
					<div class="middle-numbe-infor-01 clearfix">
						<span style="color: #666666; left: 136px;"> 运费： </span> <img
							src="<%=request.getContextPath()%>/resource/front/img/balance/freight-icon.png"
							style="left: 200px;" /> <span style="left: 200px;">￥0.00</span>
					</div>
					<div class="middle-numbe-infor-01 clearfix">
						<span style="color: #666666; left: 124px;"> 服务费： </span> <span
							style="left: 209px;">￥0.00</span>
					</div>
					<div class="middle-numbe-infor-01 clearfix">
						<span style="color: #666666; left: 112px;"> 退换无忧： </span> <span
							style="left: 197px;">￥0.00</span>
					</div>
				</div>
			</div>
			<div class="middle-money">
				<div class="middle-money-num" style="margin-top: 14px;">
					<span style="color: #666666; left: 755px; top: 10px;">应付总额：</span>
					<span
						style="color: #e4343c; font-size: 18px; left: 785px; top: 10px;">￥${totalPrice }</span>
				</div>
				<div class="middle-money-num">
					<span style="color: #999; left: 470px; top: 20px">寄送至：${a.addressCont}</span>
					<span style="color: #999; left: 500px; top: 20px">收货人：${userInfo.name}
						${a.receiverPhone}</span>
				</div>
				<input type="hidden" name="sumPrice" value="${totalPrice }">
				<%-- <input type="hidden" name="productSkuId"
					value="${carts.productSkuId }"> --%>
			</div>
			<div class="middle-submit">
				<input type="submit" name="button" id="button" value="提交订单" />
			</div>
		</div>
		</form>
		<!--tail-->
		<%-- <%@include file="bas_bottom.jsp"%> --%>
	</div>
</body>
</html>