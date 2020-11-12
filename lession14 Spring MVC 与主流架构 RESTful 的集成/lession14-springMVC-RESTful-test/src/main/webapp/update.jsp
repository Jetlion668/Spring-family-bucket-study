<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/update" method="post">
	id:   <input type="text" name="id"/ value="${course.id}" disabled="true"><br/>
	名称： <input type="text" name="name"/ value="${course.name}"><br/>
    价格： <input type="text" name="price" value="${course.price}"/><br/>
          <input type="hidden" name="_method" value="PUT"/>
          <input type="submit" value="修改"/>
    </form>
</body>
</html>