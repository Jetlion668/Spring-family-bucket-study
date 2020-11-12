<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
<script type="text/javascript">
	$(function(){
		
		$("#get").click(function(){
			var id = $("#get_id").val();
			$.ajax({
				url:"httpGet/"+id,
				type:"get",
				dataType:"json",
				success:function(data){
					if(data == null){
						alert("该用户不存在");
					}else{
						alert(data.id+"---"+data.name+"---"+data.age);
					}
				}
			})
		});
		
		$("#post").click(function(){
			var id = $("#post_id").val();
			var name = $("#post_name").val();
			var age = $("#post_age").val();
			$.ajax({
				url:"httpPost/"+id+"/"+name+"/"+age,
				type:"post",
				dataType:"json",
				success:function(data){
					alert(data.id+"---"+data.name+"---"+data.age);
				}
			})
		});
		
		$("#put").click(function(){
			var id = $("#put_id").val();
			var name = $("#put_name").val();
			var age = $("#put_age").val();
			$.ajax({
				url:"httpPut/"+id+"/"+name+"/"+age,
				type:"put",
				dataType:"json",
				success:function(data){
					alert(data.id+"---"+data.name+"---"+data.age);
				}
			})
		});
		
		$("#delete").click(function(){
			var id = $("#delete_id").val();
			$.ajax({
				url:"httpDelete/"+id,
				type:"delete",
				dataType:"text",
				success:function(data){
					alert(data);
				}
			})
		});
	})
</script>
</head>
<body>
	POST:<br/>
	编号：<input type="text" id="post_id"/><br/>
	姓名：<input type="text" id="post_name"/><br/>
	年龄：<input type="text" id="post_age"/><br/>
	<input type="button" value="提交" id="post"/>
	<hr/>
	GET：<input type="text" id="get_id"/><br/>
	<input type="button" value="获取" id="get"/>
	<hr/>
	PUT:<br/>
  	编号：<input type="text" id="put_id"/><br/>
	姓名：<input type="text" id="put_name"/><br/>
	年龄：<input type="text" id="put_age"/><br/>
	<input type="button" value="修改" id="put"/>
	<hr/>
	DELETE:
	<input type="text" id="delete_id"/><br/>
	<input type="button" value="删除" id="delete"/>
</body>
</html>