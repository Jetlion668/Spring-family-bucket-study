<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <h1>学生登录</h1>
    <form:form modelAttribute="student" action="login" method="post">
        学生姓名：<form:input path="name" /><form:errors path="name"/><br/>
        学生密码：<form:password path="password" /><form:errors path="password"/><br/>
        <input type="submit" value="提交"/>
    </form:form>
</body>
</html>