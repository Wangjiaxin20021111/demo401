<%--
  Created by IntelliJ IDEA.
  User: 25043
  Date: 2022/3/7
  Time: 15:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    request.setCharacterEncoding("utf-8");
    response.setCharacterEncoding("utf-8");
    String num=request.getParameter("num");
    String department1=request.getParameter("department1");
    request.setAttribute("num",num);
    request.setAttribute("department1",department1);
%>
<center>
    <form action="Youkeliulan.jsp"method="get">
    <table>
        <tr>
               <td>请直接输入您需要发布的招聘信息</td>
               <td><input type="text" name="neirong"></td>
        </tr>
        <tr>
                <input type="hidden" name="num" value="${requestScope.num}">
                <input type="hidden" name="department1" value="${requestScope.department1}">
        </tr>
        <tr>
            <td>点击这里提交信息</td>
            <td><input type="submit" value="提交"></td>
        </tr>
    </table>
    </form>
</center>
</body>
</html>
