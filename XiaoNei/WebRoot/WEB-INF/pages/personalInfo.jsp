<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>个人信息</title>
    <script type="text/javascript" src="js/jquery-2.1.3.min.js"></script>
	<script type="text/javascript" src="js/bootstrap.js"></script>
	<script type="text/javascript" src="js/user.js"></script>

	<link href="css/bootstrap.css" rel="stylesheet">
	<link href="css/bootstrap-theme.css" rel="stylesheet">
  </head>
  
  <body>
  <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
		<div class="navbar-header">
			<a class="navbar-brand" href="#">OnSchool</a>
		</div>
		<div>
			<ul class="nav navbar-nav">
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown"> 我的校内 <b class="caret"></b> </a>
					<ul class="dropdown-menu">
						<li><a href="goToPersonalInfoPage">个人信息</a>
						</li>
						<li class="divider"></li>
						<li><a href="#">我的商品</a>
						</li>
						<li class="divider"></li>
						<li><a href="#">我的关注</a>
						</li>
						<li class="divider"></li>
						<li><a href="#">我的集资</a>
						</li>
						<li class="divider"></li>
						<li><a href="#">分离的链接</a>
						</li>
					</ul>
				</li>
				<li><a href="#">购物车</a>
				</li>
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown">校园互动<b class="caret"></b> </a>
					<ul class="dropdown-menu">
						<li><a href="#">新事件</a>
						</li>
						<li class="divider"></li>
						<li><a href="#">趣闻</a>
						</li>
						<li class="divider"></li>
						<li><a href="#">扎堆</a>
						</li>
						<li class="divider"></li>
						<li><a href="#">活动召集</a>
						</li>
					</ul>
				</li>
			</ul>
		</div>
		<div class="navbar-right">
			<c:if test="${empty userName }">
				<ul class="nav navbar-nav">
					<li><a href="#" data-target="#registerModal" data-toggle="modal">注册</a></li>
					<li><a href="#" data-target="#loginModal" data-toggle="modal">登录</a>
					</li>
				</ul>
			</c:if>
			<c:if test="${!empty userName }">
				<ul class="nav navbar-nav">
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown">欢迎你：${userName } <b class="caret"></b>
					</a>
						<ul class="dropdown-menu">
							<li><a href="logout">注销</a>
							</li>
						</ul></li>
				</ul>
			</c:if>
		</div>
	</nav>
	
    <div class="modal fade" id="registerModal" tabindex="-1" role="dialog"
			aria-labelledby="myModalLabel" aria-hidden="true">
			<div class="modal-dialog" style="width:40%; height:50%;">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal"
							aria-hidden="true">&times;</button>
						<h4 class="modal-title" id="registerModalLabel"><b>注册</b></h4>
					</div>
					<div class="modal-body">
						<form role="form" id="registerUserForm">
								<div class="form-group">
									<label for="registerUserName">用户名：</label> <input type="text"
										class="form-control" id="registerUserName" name="userName"
										placeholder="请输入用户名">
								</div>
								<div class="form-group">
									<label for="registerPassword">密码：</label> <input type="password"
										class="form-control" id="registerPassword" name="password"
										placeholder="请输入密码">
								</div>
								<div class="form-group">
									<label for="registerPassword_">确认密码：</label> <input type="password"
										class="form-control" id="registerPassword_" name="password_"
										placeholder="请 输入确认密码">
								</div>
								<div class="form-group">
									<label for="registerEmail">邮箱：</label> <input type="email"
										class="form-control" id="registerEmail" name="email"
										placeholder="请输入邮箱地址">
								</div>
								<div class="form-group">
									<label for="registerPhone">联系电话：</label> <input type="text"
										class="form-control" id="registerPhone" name="phone"
										placeholder="请输入联系电话">
								</div>
								<div class="form-group">
									<label for="registerSchool">学校：</label> <input type="email"
										class="form-control" id="registerSchool" name="school"
										placeholder="请输入学校">
								</div>
								<div class="form-group">
									<label for="registerMajor">邮箱：</label> <input type="email"
										class="form-control" id="registerMajor" name="major"
										placeholder="请输入邮箱地址">
								</div>
						</form>
					</div>
					<div class="modal-footer"
						style="text-align: center;margin-left: auto;margin-right: auto;">
						<button type="button" class="btn btn-default" data-dismiss="modal">关闭
						</button>
						<button type="button" class="btn btn-primary" onclick="registerUser()">注册</button>
					</div>

				</div>
				<!-- /.modal-content -->
			</div>
		</div>
  </body>
</html>
