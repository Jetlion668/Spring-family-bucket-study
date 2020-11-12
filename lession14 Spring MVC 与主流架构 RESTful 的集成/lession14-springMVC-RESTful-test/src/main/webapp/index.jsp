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
<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
</head>
<body>
    <button id="addBtn">添加</button>
    <table border="1">
        <tr>
            <td>编号</td>
            <td>名称</td>
            <td>价格</td>
            <td>操作</td>
        </tr>
        <c:forEach items="${courses}" var="course">
            <tr>
                <td>${course.id}</td>
                <td>${course.name}</td>
                <td>${course.price}</td>
                <td>
                     <button onclick="update(${course.id})" >修改</button>
                     <button onclick="del(${course.id})" >删除</button>
                </td>
             </tr>
         </c:forEach>
    </table>
</body>
<script>

    $("#addBtn").click(function(){
        window.location.href="/add";
    });




    function update(id){
            window.location.href="/update/"+id;
     }

    function del(id){
            $.ajax({
                url:"/delete/"+id,
                type:"delete",
                dataType:"text",
                success:function(data){
                    alert(data);
                    window.location.reload()
                }
            })
        }
</script>
</html>