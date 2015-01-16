<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="zh-CN">
<head>
<title>校内网首页</title>
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
	
	


	<div id="myCarousel" class="carousel slide" >
		<!-- 轮播（Carousel）指标 -->
		<ol class="carousel-indicators">
			<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
			<li data-target="#myCarousel" data-slide-to="1"></li>
			<li data-target="#myCarousel" data-slide-to="2"></li>
		</ol>
		<!-- 轮播（Carousel）项目 -->
		<div class="carousel-inner">
			<div class="item active">
				<img src="images/1.jpg" alt="First slide">
				<div class="carousel-caption">标题 1</div>
			</div>
			<div class="item">
				<img src="images/2.jpg" alt="Second slide">
				<div class="carousel-caption">标题 2</div>
			</div>
			<div class="item">
				<img src="images/3.jpg" alt="Third slide">
				<div class="carousel-caption">标题 3</div>
			</div>
		</div>
		<!-- 轮播（Carousel）导航 -->
		<a class="carousel-control left" href="#myCarousel" data-slide="prev">&lsaquo;</a>
		<a class="carousel-control right" href="#myCarousel" data-slide="next">&rsaquo;</a>
	</div>


	<div class="row">
		<div class="col-sm-6 col-md-4">
			<div class="thumbnail">
				<img src="images/1.jpg" data-src="holder.js/300x300" alt="...">
				<div class="caption">
					<h3>Thumbnail label</h3>
					<p>...</p>
					<p>
						<a href="#" class="btn btn-primary" role="button">Button</a> <a
							href="#" class="btn btn-default" role="button">Button</a>
					</p>
				</div>
			</div>
		</div>
		<div class="col-sm-6 col-md-4">
			<div class="thumbnail">
				<img src="images/2.jpg" data-src="holder.js/300x300" alt="...">
				<div class="caption">
					<h3>Thumbnail label</h3>
					<p>...</p>
					<p>
						<a href="#" class="btn btn-primary" role="button">Button</a> <a
							href="#" class="btn btn-default" role="button">Button</a>
					</p>
				</div>
			</div>
		</div>
		<div class="col-sm-6 col-md-4">
			<div class="thumbnail">
				<img src="images/3.jpg" data-src="holder.js/300x300" alt="...">
				<div class="caption">
					<h3>Thumbnail label</h3>
					<p>...</p>
					<p>
						<a href="#" class="btn btn-primary" role="button">Button</a> <a
							href="#" class="btn btn-default" role="button">Button</a>
					</p>
				</div>
			</div>
		</div>
	</div>
	<div class="container" style="text-align: center;margin-right: auto">
		<ul class="pagination  pagination-lg">
			<li><a href="#">&laquo;</a>
			</li>
			<li><a href="#">1</a>
			</li>
			<li><a href="#">2</a>
			</li>
			<li><a href="#">3</a>
			</li>
			<li><a href="#">4</a>
			</li>
			<li><a href="#">5</a>
			</li>
			<li><a href="#">&raquo;</a>
			</li>
		</ul>
	</div>


	<!-- 登录模态框（Modal） -->
	<div class="modal fade" id="loginModal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog" style="width:40%; height:50%;">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">&times;</button>
					<h4 class="modal-title" id="loginModalLabel"><b>登录</b></h4>
				</div>
				<div class="modal-body">
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
					</form>
				</div>
				<div class="modal-footer"
					style="text-align: center;margin-left: auto;margin-right: auto;">
					<button type="button" class="btn btn-default" data-dismiss="modal">关闭
					</button>
					<button type="button" class="btn btn-primary" onclick="login()">登录</button>
				</div>

			</div>
			<!-- /.modal-content -->
		</div>
		</div>


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
