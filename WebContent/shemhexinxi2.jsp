<%@ page import="Service.MianshiguanService2" %>
<%@ page import="java.sql.SQLException" %><%--
  Created by IntelliJ IDEA.
  User: 25043
  Date: 2022/3/10
  Time: 19:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%

    try {
        MianshiguanService2 mm=new MianshiguanService2();
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        String haoma=request.getParameter("num");
        mm.passs(haoma);
        out.print("<h1>设置成功！</h1>");
    } catch (SQLException e) {
        e.printStackTrace();
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    }

%>
</body>
</html>
