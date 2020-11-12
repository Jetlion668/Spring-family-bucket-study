<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/uploads" method="post" enctype="multipart/form-data">
	    file1:<input type="file" name="imgs"><br />
	    file2:<input type="file" name="imgs"><br /> 
	    file3:<input type="file" name="imgs"><br />  
	    <input type="submit" name="提交">
	</form>
	<c:if test="${filePaths!=null }">
		<h1>上传的图片</h1><br /> 
		<c:forEach items="${filePaths }" var="filePath">
			<img width="300px" src="<%=basePath %>${filePath}"/>
		</c:forEach>
	</c:if>
</body>
</html>