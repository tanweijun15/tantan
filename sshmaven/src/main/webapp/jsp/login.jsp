<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set  value="${pageContext.request.contextPath}" var="ctx"/>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<!-- Bootstrap 核心 CSS 文件 -->
<link rel="stylesheet" type="text/css" href="${ctx }/css/bootstrap.min.css" />
<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script type="text/javascript" src="${ctx }/js/jquery-2.1.4.min.js"></script>
<!-- Bootstrap 核心 JavaScript 文件 -->
<script type="text/javascript" src="${ctx }/js/bootstrap.min.js"></script>

<title>用户登录</title>
<style type="text/css">
input {
	margin-bottom: 5px;
}
</style>
</head>
<body>
	<div class="container" style="margin-top: 100px">
		<form action="#" class="well" method="post"
			style="width: 220px; margin: 0px auto;">
			<h2 class="forn-signin-heading">欢迎登陆</h2>
			<input type="text" name="username" class="form-control"
				placeholder="username" required autofocus /> 
			<input type="password" name="password" class="form-control" 
				placeholder="password" required />
			<button type="submit" class="btn btn-lg btn-primary btn-block">登陆系统</button>
		</form>
	</div>
</body>
</html>