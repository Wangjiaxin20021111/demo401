<%--
  Created by IntelliJ IDEA.
  User: 25043
  Date: 2022/2/28
  Time: 20:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<%
    /*前两行获取前端输入的数据*/
    String name1=request.getParameter("name");
    String password1=request.getParameter("password");
    /*请求转发*/
    request.setAttribute("name",name1);
    request.setAttribute("password",password1);
%>
                  <h3>您的姓名是：<%=name1%></h3>
<c:if test="${requestScope.name=='张三'&&requestScope.password=='20031111'}">
    <h2>${requestScope.name} welcome!</h2>
</c:if>
  <c:forEach begin="1" end="10" var="item">
      <h1>第${item}次打印输出</h1>
  </c:forEach>
</body>
</html>
