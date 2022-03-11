<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="Service.MianshiguanService2" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="POJI.Mianshiguan" %><%--
  Created by IntelliJ IDEA.
  User: 25043
  Date: 2022/3/10
  Time: 13:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<h1>您好，欢迎您${requestScope.numb}登录</h1>
<%
    MianshiguanService2 mm=new MianshiguanService2();
    ArrayList<Mianshiguan> list=mm.findMianshiguan();
    request.setAttribute("list",list);
%>
<table border="1px" style="width: 100%">
    <tr>
         <td>面试官编号</td>
          <td>面试官姓名</td>
          <td>面试官部门</td>
          <td>通过审核</td>
    </tr>
<c:forEach items="${requestScope.list}" var="Mianshiguan">
    <tr>
        <td>${Mianshiguan.num}</td>
        <td>${Mianshiguan.name}</td>
        <td>${Mianshiguan.department}</td>
        <td>
            <a href="Passmianshiguan.jsp?num=${Mianshiguan.num}">
                通过审核点击这里
            </a>
        </td>
    </tr>
</c:forEach>
       <a href="shenhexinxi.jsp">
           点击这里审核发布了的招聘信息
       </a>
</table>
</body>
</html>
