<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>注册用户</title>
    <script type="text/javascript" src="js/jquery-2.1.3.min.js"></script>
	<script type="text/javascript" src="js/bootstrap.js"></script>
	<script type="text/javascript" src="js/user.js"></script>
	
	<link href="css/bootstrap.css" rel="stylesheet">
	<link href="css/bootstrap-theme.css" rel="stylesheet">
  </head>
  
  <body>
    <form role="form" id="registerUserForm">
	    <div class="container" style="width:55%; height:50%;">
		  <div class="form-group" >
		    <label for="userName">用户名：</label>
		    <input type="text"  class="form-control" id="userName" name="userName" placeholder="请输入用户名"> 
		  </div>
		  <div class="form-group">
		    <label for="password">密码：</label>
		    <input type="password" class="form-control" id="password" name="password" placeholder="请输入密码">
		  </div>
		  <div class="form-group">
		    <label for="password_">确认密码：</label>
		    <input type="password" class="form-control" id="password_" name="password_" placeholder="请 输入确认密码">
		  </div>
		  <div class="form-group">
		    <label for="email">邮箱：</label>
		    <input type="email" class="form-control" id="email" name="email" placeholder="请输入邮箱地址">
		  </div>
		  <div class="form-group">
		    <label for="phone">联系电话：</label>
		    <input type="text" class="form-control" id="phone" name="phone" placeholder="请输入联系电话">
		  </div>
		  <input type="button" class="btn btn-default" onclick="registerUser();" value="提交"style="margin-left: auto;margin-right: auto"/>
		</div>
	</form>
	<p>${userName }</p>
  </body>
</html>
