<%--
  Created by IntelliJ IDEA.
  User: 25043
  Date: 2022/3/5
  Time: 19:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="http://localhost:8080/demo41_war_exploded/demoTest"method="get">
       <input type="text" name="username"value="${cookie.a.value}"><br>
    <input type="text" name="password" value="${cookie.b.value}"><br>
       <input type="submit" value="提交">
</form>
</body>
</html>
