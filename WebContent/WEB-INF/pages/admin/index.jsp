<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>后台管理</title>

<link rel="stylesheet" type="text/css" href="../resources/css/main.css">
<link rel="stylesheet" type="text/css"
	href="../resources/css/admin_main.css">
<link rel="stylesheet" type="text/css"
	href="../resources/css/jquery-ui.css">
<link rel="stylesheet" type="text/css"
	href="../resources/css/jquery-ui.structure.css">
<link rel="stylesheet" type="text/css"
	href="../resources/css/jquery-ui.theme.css">

<script type="text/javascript"
	src="../resources/js/jquery-1.11.3.min.js"></script>

</head>
<body>
	<div class="container">
		<div class="leftsidebar_box">
			<div class="line"></div>
			<dl class="system_log">
				<dt onClick="changeImage()">
					系统记录<img src="../resources/images/left/select_xl01.png">
				</dt>
				<dd class="first_dd">
					<a href="#">充值记录</a>
				</dd>
				<dd>
					<a href="#">短信充值记录</a>
				</dd>
				<dd>
					<a href="#">消费记录</a>
				</dd>
				<dd>
					<a href="#">操作记录</a>
				</dd>
			</dl>

			<dl class="custom">
				<dt onClick="changeImage()">
					客户管理<img src="../resources/images/left/select_xl01.png">
				</dt>
				<dd class="first_dd">
					<a href="#">客户管理</a>
				</dd>
				<dd>
					<a href="#">试用/成交客户管理</a>
				</dd>
				<dd>
					<a href="#">未成交客户管理</a>
				</dd>
				<dd>
					<a href="#">即将到期客户管理</a>
				</dd>
			</dl>

			<dl class="channel">
				<dt>
					渠道管理<img src="../resources/images/left/select_xl01.png">
				</dt>
				<dd class="first_dd">
					<a href="#">渠道主页</a>
				</dd>
				<dd>
					<a href="#">渠道标准管理</a>
				</dd>
				<dd>
					<a href="#">系统通知</a>
				</dd>
				<dd>
					<a href="#">渠道商管理</a>
				</dd>
				<dd>
					<a href="#">渠道商链接</a>
				</dd>
			</dl>

			<dl class="app">
				<dt onClick="changeImage()">
					APP管理<img src="../resources/images/left/select_xl01.png">
				</dt>
				<dd class="first_dd">
					<a href="#">App运营商管理</a>
				</dd>
				<dd>
					<a href="#">开放接口管理</a>
				</dd>
				<dd>
					<a href="#">接口类型管理</a>
				</dd>
			</dl>

			<dl class="cloud">
				<dt>
					大数据云平台<img src="../resources/images/left/select_xl01.png">
				</dt>
				<dd class="first_dd">
					<a href="#">平台运营商管理</a>
				</dd>
			</dl>

			<dl class="syetem_management">
				<dt>
					系统管理<img src="../resources/images/left/select_xl01.png">
				</dt>
				<dd class="first_dd">
					<a href="#">后台用户管理</a>
				</dd>
				<dd>
					<a href="#">角色管理</a>
				</dd>
				<dd>
					<a href="#">客户类型管理</a>
				</dd>
				<dd>
					<a href="#">栏目管理</a>
				</dd>
				<dd>
					<a href="#">微官网模板组管理</a>
				</dd>
				<dd>
					<a href="#">商城模板管理</a>
				</dd>
				<dd>
					<a href="#">微功能管理</a>
				</dd>
				<dd>
					<a href="#">修改用户密码</a>
				</dd>
			</dl>

			<dl class="source">
				<dt>
					素材库管理<img src="../resources/images/left/select_xl01.png">
				</dt>
				<dd class="first_dd">
					<a href="#">图片库</a>
				</dd>
				<dd>
					<a href="#">链接库</a>
				</dd>
				<dd>
					<a href="#">推广管理</a>
				</dd>
			</dl>

			<dl class="statistics">
				<dt>
					统计分析<img src="../resources/images/left/select_xl01.png">
				</dt>
				<dd class="first_dd">
					<a href="#">客户统计</a>
				</dd>
			</dl>
		</div>
	</div>

	
	<script type="text/javascript">
		$(".leftsidebar_box dt").css({
			"background-color" : "rgba(0, 30, 99, 0.6)"
		});
		$(".leftsidebar_box dt img").attr("src", "../resources/images/left/select_xl01.png");
		$(function() {
			$(".leftsidebar_box dd").hide();
			$(".leftsidebar_box dt").click(
					function() {
						$(".leftsidebar_box dt").css({
							"background-color" : "rgba(0, 30, 99, 0.6)"
						})
						$(this).css({
							"background-color" : "#317eb4"
						});
						$(this).parent().find('dd').removeClass("menu_chioce");
						$(".leftsidebar_box dt img").attr("src",
								"../resources/images/left/select_xl01.png");
						$(this).parent().find('img').attr("src",
								"../resources/images/left/select_xl.png");
						$(".menu_chioce").slideUp();
						$(this).parent().find('dd').slideToggle();
						$(this).parent().find('dd').addClass("menu_chioce");
					});
		})
	</script>
	
<div id="footerdiv">
		<jsp:include page="../common/footer.jsp"></jsp:include>
	</div>
</body>
</html>