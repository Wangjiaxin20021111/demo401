<%--
  Created by IntelliJ IDEA.
  User: 25043
  Date: 2022/3/1
  Time: 14:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%><!--用来遍历的-->
<html>
<head>
    <title>Title</title>
</head>
<body>
<center>
     <%
         String name=request.getParameter("name");
         String password=request.getParameter("password");
         request.setAttribute("name",name);
         request.setAttribute("password",password);
     %>
    <c:if test="$requestScope.name=='张三'&&requestScope.password=='20031111'">
        <h2>${requestScope.name}登陆成功！</h2>
    </c:if>

</center>
</body>
</html>
