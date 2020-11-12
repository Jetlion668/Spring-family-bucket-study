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
    <h1>用户注册</h1>
    <form:form modelAttribute="user" action="register" method="post">
        用户名：<form:input path="username" /><form:errors path="username" /><br/>
        密码：<form:password path="password" /><form:errors path="password" /><br/>
        邮箱：<form:input path="email" /><form:errors path="email" /><br/>
        电话：<form:input path="phone" /><form:errors path="phone" /><br/>
        <input type="submit" value="提交"/>
    </form:form>
</body>
</html>