<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="stylesheet" type="text/css"
	href="../resources/bootstrap/css/bootstrap.css">
<link rel="stylesheet" type="text/css"
	href="../resources/admin/css/AdminLTE.min.css">
<link rel="stylesheet" type="text/css"
	href="../resources/admin/css/style.css">
<link rel="stylesheet" type="text/css"
	href="../resources/admin/css/skins/_all-skins.min.css">
<link href="../resources/admin/css/font-awesome.min.css"
	rel="stylesheet" type="text/css">
<script src="/resources/js/jquery-1.11.3.min.js"></script>
<script src="/resources/bootstrap/js/bootstrap.min.js"></script>
<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
<script src="/resources/bootstrap/js/ie10-viewport-bug-workaround.js"></script>
<script src='/resources/admin/js/app.min.js' type='text/javascript'></script>
<script src='/resources/admin/js/slimScroll/jquery.slimscroll.min.js'
	type='text/javascript'></script>
<title>后台管理</title>
</head>
<body class="skin-blue fixed" data-spy="scroll"
	data-target="javascript:void(0);scrollspy">
	<header class="main-header">
		<a href="index.html" class="logo">后台管理 </a>
		<!-- Header Navbar: style can be found in header.less -->
		<nav class="navbar navbar-static-top" role="navigation">
			<a href="javascript:void(0);" class="sidebar-toggle"
				data-toggle="offcanvas" role="button"> <span class="sr-only">Toggle
					navigation</span>
			</a>
			<!-- Navbar Right Menu -->
			<div class="navbar-custom-menu">
				<ul class="nav navbar-nav">
					<!-- User Account: style can be found in dropdown.less -->
					<li class="dropdown user user-menu"><a
						href="javascript:void(0);" class="dropdown-toggle"
						data-toggle="dropdown"> <img
							src="../resources/admin/img/avatar.png" class="user-image"
							alt="User Image" /> <span class="hidden-xs">${sessionScope.admin.adminName }</span>
					</a>
						<ul class="dropdown-menu">
							<!-- User image -->
							<li class="user-header"><img
								src="../resources/admin/img/avatar.png" class="img-circle"
								alt="User Image" />
								<p>${sessionScope.admin.adminName }</p></li>

							<!-- Menu Footer-->
							<li class="user-footer">
								<div class="pull-left">
									<a href="javascript:void(0);" class="btn btn-default btn-flat">修改密码</a>
								</div>
								<div class="pull-right">
									<a href="javascript:void(0);" class="btn btn-default btn-flat">登出</a>
								</div>
							</li>
						</ul></li>
				</ul>
			</div>
		</nav>
	</header>
	<aside>
		<div class="main-sidebar">
			<!-- Inner sidebar -->
			<div class="sidebar">

				<!-- /.user-panel -->

				<!-- Search Form (Optional) -->
				<!-- <form action="javascript:void(0);" method="get" class="sidebar-form">
				<div class="input-group">
					<input type="text" name="q" class="form-control"
						placeholder="Search..." /> <span class="input-group-btn">
						<button type='submit' name='search' id='search-btn'
							class="btn btn-flat">
							<i class="fa fa-search"></i>
						</button>
					</span>
				</div>
			</form> -->
				<!-- /.sidebar-form -->

				<!-- Sidebar Menu -->
				<ul class="sidebar-menu">
					<li class="header">Dashboard</li>
					<li class="treeview"><a href="javascript:void(0);"><span>概览</span>
							<i class="fa fa-angle-left pull-right"></i></a>
						<ul class="treeview-menu">
							<li><a href="javascript:void(0);">Dashboard</a></li>
							<li><a href="javascript:void(0);">流量统计</a></li>
							<li><a href="javascript:void(0);">服务器日志</a></li>
							<li><a href="javascript:void(0);"
								onclick="changeFrame(this)">异常报告</a></li>
						</ul></li>
					<li class="header">首页设置</li>
					<!-- Optionally, you can add icons to the links -->
					<li class="treeview active"><a href="javascript:void(0);"><span>新闻管理</span>
							<i class="fa fa-angle-left pull-right"></i></a>
						<ul class="treeview-menu">
							<li class="active"><a href="javascript:void(0);"
								id="addNews" onclick="changeFrame(this)">添加新闻</a></li>
							<li><a href="javascript:void(0);" id="modifyNews_0_1"
								onclick="changeFrame(this)">修改或删除新闻</a></li>
							<li><a href="javascript:void(0);">添加新闻类别</a></li>
							<li><a href="javascript:void(0);">修改或删除新闻类别</a></li>
						</ul></li>
					<li class="treeview"><a href="javascript:void(0);"><span>业务管理</span>
							<i class="fa fa-angle-left pull-right"></i></a>
						<ul class="treeview-menu">
							<li><a href="javascript:void(0);">添加业务</a></li>
							<li><a href="javascript:void(0);">修改或删除业务</a></li>
						</ul></li>
					<li class="treeview"><a href="javascript:void(0);"><span>合作伙伴管理</span>
							<i class="fa fa-angle-left pull-right"></i></a>
						<ul class="treeview-menu">
							<li><a href="javascript:void(0);">添加合作伙伴</a></li>
							<li><a href="javascript:void(0);">修改或删除合作伙伴</a></li>
						</ul></li>
					<li class="header">后台设置</li>
					<!-- Optionally, you can add icons to the links -->
					<li class="treeview"><a href="javascript:void(0);"><span>安全设置</span>
							<i class="fa fa-angle-left pull-right"></i></a>
						<ul class="treeview-menu">
							<li><a href="javascript:void(0);">修改密码</a></li>
							<li><a href="javascript:void(0);">安全退出</a></li>
						</ul></li>

					<li class="header"><p>Powered by Jheng Yuen</p> © 2015 Jheng,
						All rights reserved.</li>
				</ul>
				<!-- /.sidebar-menu -->

			</div>
			<!-- /.sidebar -->
		</div>
	</aside>
	<div style="" class="content-wrapper">
		<div class="content body embed-responsive" id="frdiv">
			<!-- <iframe id="myfr" src="addNews.html" class="embed-responsive-item"
				style="overflow: hidden; "
				seamless="seamless" onLoad="iFrameHeight()"></iframe> -->
		</div>
	</div>
	<script type="text/javascript">
		function changeFrame(ctrl) {
			var file = $(ctrl).attr("id");
			$("li").removeClass("active");
			$(ctrl).parent().addClass("active");
			$(ctrl).parent().parent().parent().addClass("active");
			$("#myfr").attr("src", file + ".html");
		}
	</script>
	<script type="text/javascript">
		$("#myfr").load(function() {
			var mainheight = $(this).contents().find("body").height();
			//alert($(this).contents().find("body").height());
			$(this).height(mainheight);
			$("#frdiv").height($(this).height());
		});
	</script>
</body>
</html>