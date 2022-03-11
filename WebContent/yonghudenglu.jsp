<%--
  Created by IntelliJ IDEA.
  User: 25043
  Date: 2022/3/5
  Time: 20:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="7" width="70%">
    <form action="http://localhost:8080/demo41_war_exploded/demo06" method="get">
        <tr>
            <td>请输入您的账号</td>
            <td><input type="text" name="num" value="${cookie.num.value}">
        </tr>
        <tr>
            <td>请输入您的密码</td>
            <td><input type="text" name="password"value="${cookie.password.value}"></td>
        </tr>
        <tr>
            <td>找回密码</td>
            <td>
                <a href="findbackpassword.html">
                    点击这里找回密码
                </a>
            </td>
        </tr>
        <tr>
            <td>记住密码</td>
            <td>
                <input type="radio" name="remember" value="是">是
                <input type="radio" name="remember" value="否">否<br>
            </td>
        </tr>
        <tr>
            点击这里提交<input type="submit" value="提交">
        </tr>
    </form>
</table>
</body>
</html>
