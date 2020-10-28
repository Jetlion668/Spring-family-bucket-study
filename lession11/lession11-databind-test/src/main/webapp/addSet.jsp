<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="setType" method="post">
		用户1姓名：<input type="text" name="users[0].name"/><br/>
		用户1年龄：<input type="text" name="users[0].age"/><br/>
		用户2姓名：<input type="text" name="users[1].name"/><br/>
		用户2年龄：<input type="text" name="users[1].age"/><br/>
		用户3姓名：<input type="text" name="users[2].name"/><br/>
		用户3年龄：<input type="text" name="users[2].age"/><br/>
		<input type="submit" value="提交"/>
	</form>
</body>
</html>