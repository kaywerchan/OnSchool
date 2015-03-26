<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="zh-CN">
<head>
<title>iRing</title>
<script type="text/javascript" src="js/jquery-2.1.3.min.js"></script>
<script type="text/javascript" src="js/bootstrap.js"></script>
<script type="text/javascript" src="js/user.js"></script>
<script type="text/javascript" src="js/chat.js"></script>
<script type="text/javascript" src="js/friend.js"></script>
<link href="css/bootstrap.css" rel="stylesheet">
<link href="css/bootstrap-theme.css" rel="stylesheet">
<link rel="stylesheet" href="css/index.css" type="text/css"></link>
</head>

<script>
	$(function() {
		$("[data-toggle='tooltip']").tooltip();
		$("[data-toggle='popover']").popover();
	});

	var userName = "${userName}";
	var userId = "${userId}";
	
	function iFrameHeight() {
		var ifm = document.getElementById("mainframe");
		var subWeb = document.frames ? document.frames["mainframe"].document
				: ifm.contentDocument;
		if (ifm != null && subWeb != null) {
			ifm.height = subWeb.body.scrollHeight;
		}
	}
	
</script>

<body>

	<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
		<div class="navbar-header">
			<a class="navbar-brand" href="#">iRing</a>
		</div>
		<div>
			<ul class="nav navbar-nav">
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown"> 圈子 <b class="caret"></b> </a>
					<ul class="dropdown-menu">
						<li><a href="goToPersonalInfoPage">我的圈子</a>
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
					<li><a href="#" data-target="#registerModal"
						data-toggle="modal">注册</a></li>
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
						</ul>
					</li>
				</ul>
			</c:if>
		</div>
	</nav>
	<br>
	<br>
	<c:if test="${empty userName }">
		<iframe src="mainPage.jsp" id="mainframe" name="iframepage"
			width="100%" height="10000px"  ></iframe>
	</c:if>
	<c:if test="${!empty userName }">
		<iframe src="goToMyRings" id="mainframe" name="iframepage"
			width="100%" height="10000px"   ></iframe>
	</c:if>

	<!--右下角聊天控制按钮  -->
	<a href="#" data-toggle="tooltip" title="..." class="chatButton"
		style="z-index: 9999" id="chatRoomTips"></a>
	<img src="images/touxiang.png" class="chatButton"
		onclick="checkChatRoom();">

	<!--引入页面  -->
	<c:if test="${!empty userName }">
		<jsp:include page="chatRoom.jsp"></jsp:include>
	</c:if>
	<jsp:include page="user.jsp"></jsp:include>




</body>
</html>
