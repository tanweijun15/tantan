<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set  value="${pageContext.request.contextPath}" var="ctx"/>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<!-- 包含头部信息用于适应不同设备 -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- Bootstrap 核心 CSS 文件 -->
<link rel="stylesheet" type="text/css" href="${ctx }/static/css/bootstrap.min.css" />
<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script type="text/javascript" src="${ctx }/static/js/jquery-2.1.4.min.js"></script>
<!-- Bootstrap 核心 JavaScript 文件 -->
<script type="text/javascript" src="${ctx }/static/js/bootstrap.min.js"></script>

<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<h3 align="center">欢迎使用学生管理系统</h3>
		<div class="table-responsive">          
			<table class="table table-striped table-bordered">
	         	<thead>
					<tr>
						<th>学号</th>
						<th>姓名</th>
						<th>性别</th>
						<th>专业</th>
						<th>年级</th>
						<th>操作</th>
					</tr>
				</thead>
         		<tbody>
         			<c:forEach items="${stuList}" var="stu" varStatus="status">
		        	<tr>
		        		<td>${stu.stuNo}</td>
		        		<td>${stu.stuName}</td>
		        		<td>${stu.stuSex}</td>
		        		<td>${stu.stuSpecialty}</td>
		        		<td>${stu.stuGrade}</td>
		        		<td>
		        			<a href="{ctx}/student/removeStu?stuid=${stu.stuId}">删除</a>
		        			<a href="{ctx}/student/updateStu?stuid=${stu.stuId}">修改</a>
		        		</td>
		        	</tr>
		        	</c:forEach>
         		</tbody>
			</table>
		</div>
	</div>
</body>
</html>