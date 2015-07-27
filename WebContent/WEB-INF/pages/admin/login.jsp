<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html  style="background-image: url('../resources/img/bg_tile.png');">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="../resources/css/main.css">
<link rel="stylesheet" type="text/css" href="../resources/css/admin.css">
<title>管理员登录</title>
</head>
<body>
	<div id="admin_headerdiv">
		<h1 id="admin_header_title">后台管理</h1>
	</div>
	<div id="contentdiv" class="content">
		<div class="left_col">
			<img alt="logo" src="../resources/img/mbp.jpg"
				style="width: 300px; margin-top: 40px; margin-left: 50px;">
			<div style="margin: 50px auto auto 50px">
				<h2>登录以进行后台管理</h2>
				<p style="font-size: 12px">要查看和修改Web配置，您必须以后台管理员身份登录</p>
			</div>
		</div>
		<div class="right_col">
			<div id="login">
				<h2 style="font-size: 20px; font-weight: normal;">请输入登录信息</h2>

				<form id="formLogin" action="loginchk.html" method="post">
					<div class="formwrap" style="margin-top: 22px;">

						<input size="30" class="txt" id="aaName" type="text" value=""
							name="aaName">
						<div id="lblAdminAccount" class="label-text"
							style="display: none; color: rgb(170, 170, 170); position: absolute; top: 0px; left: 0px; width: 294px; padding: 5px; text-align: start; font-size: 13px;">管理员帐号</div>


					</div>
					<div class="formwrap">

						<input size="30" maxlength="128" tabindex="1" class="txt"
							id="aaPwd" type="password" value="" name="aaPwd">
						<div id="lblAdminPwd" class="label-text"
							style="display: none; color: rgb(170, 170, 170); position: absolute; top: 0px; left: 0px; width: 294px; padding: 5px; text-align: start; font-size: 13px;">密码</div>

					</div>
					<div class="formwrap2"
						style="border-bottom: 1px solid #ddd; height: 30px">
						<a href="#">忘记密码？</a>
					</div>
					<div class="formwrap2">
						<input type="submit" value="登 录" class="btn">
					</div>
				</form>
			</div>
		</div>
	</div>
	<div id="footerdiv">
		<jsp:include page="../common/footer.jsp"></jsp:include>
	</div>
</body>
</html>