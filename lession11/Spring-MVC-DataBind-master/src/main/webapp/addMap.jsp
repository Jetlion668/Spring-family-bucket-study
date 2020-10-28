<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="mapType" method="post">
		用户1姓名：<input type="text" name="users['a'].name"/><br/>
		用户1年龄：<input type="text" name="users['a'].age"/><br/>
		用户2姓名：<input type="text" name="users['b'].name"/><br/>
		用户2年龄：<input type="text" name="users['b'].age"/><br/>
		用户3姓名：<input type="text" name="users['c'].name"/><br/>
		用户3年龄：<input type="text" name="users['c'].age"/><br/>
		<input type="submit" value="提交"/>
	</form>
</body>
</html>