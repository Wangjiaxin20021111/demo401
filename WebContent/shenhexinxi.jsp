<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="Service.MianshiguanService2" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="POJI.Mianshiguan" %>
<%@ page import="java.io.PrintWriter" %><%--
  Created by IntelliJ IDEA.
  User: 25043
  Date: 2022/3/10
  Time: 19:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    MianshiguanService2 mm=new MianshiguanService2();
    ArrayList<Mianshiguan> list=mm.lookupxinxi();
    request.setAttribute("list",list);
%>

<table border="1px" style="width: 100%" >
        <tr>
            <td>信息序号</td>
            <td>面试官号码</td>
            <td>面试官的信息</td>
            <td>部门</td>
            <td>点击通过审核</td>
        </tr>
        <c:forEach items="${requestScope.list}" var="emp">
            <tr>
                <td>${emp.number}</td>
                <td>${emp.num}</td>
                <td>${emp.neirong}</td>
                <td>${emp.department}</td>
                <td>
                    <a href="shemhexinxi2.jsp?num=${emp.num}">
                        点击这里审核通过
                    </a>
                </td>
            </tr>
        </c:forEach>
</table>
</body>
</html>
