<%--
  Created by IntelliJ IDEA.
  User: 25043
  Date: 2022/3/3
  Time: 18:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<center>
<form action="UpdateUserServlet.jsp" method="get">
    <table border="1px" style="width: 90%">
        <tr>
            <td>请在这里输入评价</td>
        <td><input type="text" name="Pingjia"></td>
        </tr>
    <input type="hidden" name="num" value="${Xuesheng1.num}"><br>
    <input type="hidden" name="numb" value="${requestScope.numb}">
        <!--
        <tr>
            <td>请选择面试时间</td>
            <td>
                   <input type="datetime-local" name="time">
            </td>
        </tr>
        -->
        <tr>
            <td>请给出是否录取的决定，如果您不填写则默认员工暂未面试</td>
            <td>
                <input type="radio" name="luqu" value="是">是
                <input type="radio" name="luqu" value="否">否
            </td>
        </tr>
    <input type="submit" value="提交">
    </table>
</form>
</center>
</body>
</html>
.