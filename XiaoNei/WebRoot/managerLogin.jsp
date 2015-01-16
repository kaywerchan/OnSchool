<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML>
<html>
<head>
<script type="text/javascript" src="js/jquery-2.1.3.min.js"></script>
<script type="text/javascript" src="js/bootstrap.js"></script>
<script type="text/javascript" src="js/user.js"></script>

<link href="css/bootstrap.css" rel="stylesheet">
<link href="css/bootstrap-theme.css" rel="stylesheet">
</head>

<body>
<div class="page-header">
  <h1>OnSchool<small>后台管理登录</small></h1>
</div>
	<div class="container" style="width: 50%;height: 50%;padding-top: 10%;">
		<form role="form" id="loginForm">
			<div class="form-group">
				<label for="userName">用户名：</label> <input type="text"
					class="form-control" id="userName" name="userName"
					placeholder="请输入用户名">
			</div>
			<div class="form-group">
				<label for="password">密码：</label> <input type="password"
					class="form-control" id="password" name="password"
					placeholder="请输入密码">
			</div>
			<button type="button" class="btn btn-primary" onclick="login()" style="text-align: center;margin-left: auto;margin-right: auto;padding-left 100%;">登录</button>
		</form>
	</div>
</body>
</html>
