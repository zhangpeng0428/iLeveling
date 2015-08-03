<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="stylesheet" type="text/css"
	href="../resources/bootstrap/css/bootstrap.css">
<script src="/resources/js/jquery-1.11.3.min.js"></script>
<script src="/resources/bootstrap/js/bootstrap.min.js"></script>
<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
<script src="/resources/bootstrap/js/ie10-viewport-bug-workaround.js"></script>
<title>管理员登录</title>
<style type="text/css">
#inputAdminName, #inputPassword {
	margin-bottom: 5px;
}

button {
	width: 90px;
}
</style>
</head>
<body>
	<div class="container">
		<div class="panel panel-primary"
			style="background-color: rgba(0, 30, 99, 0.75); margin-top: 50px;">
			<div class="row" style="padding: 30px;">
				<div class="col-md-4">
					<form class="form-signin" method="post" action="loginchk.html">
						<h2 class="form-signin-heading" style="color: white;">登录后台</h2>
						<label for="inputText" class="sr-only">用户名</label> <input
							type="text" id="inputAdminName" name="aaName"
							class="form-control" placeholder="用户名" required autofocus>
						<label for="inputPassword" class="sr-only">口令</label> <input
							type="password" id="inputPassword" name="aaPwd"
							class="form-control" placeholder="口令" required>

						<button class="btn btn-primary btn-block col-md-1" type="submit">登入</button>
					</form>
				</div>
				<div class="col-md-8"
					style="background-image: url('../resources/img/logo128.png'); height: 200px; background-repeat: no-repeat; background-position: center center;"></div>
			</div>
		</div>

	</div>
</body>
</html>