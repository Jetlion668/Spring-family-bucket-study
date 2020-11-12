<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="<%=basePath %>/js/jquery-1.8.3.min.js"></script>
<script type="text/javascript">
	var user = {
			"name":"张三",
			"age":22
	};
	$.ajax({
		url:"jsonType",
		data:JSON.stringify(user),
		type:"post",
		contentType: "application/json;charse=UTF-8",
		dataType:"text",
		success:function(data){
			var obj = eval("(" + data + ")");
			alert(obj.name+"---"+obj.age);
		}
	})
</script>
</head>
<body>
	
</body>
</html>