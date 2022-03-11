<%@ page import="Service.MianshiguanService2" %>
<%@ page import="POJI.Xuesheng1" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="Connect.Condition" %><%--
  Created by IntelliJ IDEA.
  User: 25043
  Date: 2022/3/3
  Time: 10:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    MianshiguanService2 mmm=new MianshiguanService2();
    request.setCharacterEncoding("gbk");
    response.setCharacterEncoding("gbk");
    String university=request.getParameter("university");
    String any=request.getParameter("any");
    String department = "产品机械组";
    String mianshiguan=request.getParameter("num");
    String age= request.getParameter("age");
    String time=request.getParameter("date");
    String sametimenumber= request.getParameter("sametimenumber");
    int qqq=3;
    Condition co=new Condition(university,any,age,qqq,department,time,sametimenumber);
    ArrayList<Xuesheng1> list= null;
    list = mmm.findxinxi2(co);
    request.setAttribute("mianshiguan",mianshiguan);
    request.setAttribute("ssss",list);
%>
<table border="1px" style="width: 100%">
    <tr>
        <td>编号</td>
        <td>面试官的评价</td>
        <td>毕业院校</td>
        <td>年龄</td>
        <td>简历</td>
        <td>邮箱</td>
        <td>学历</td>
        <td>姓名</td>
        <td>面试时间</td>
        <td>面试部门</td>
    </tr>
    <c:forEach items="${requestScope.ssss}" var="emp">
    <tr>
        <td>${emp.num}</td>
        <td>
            <a href="http://localhost:8080/demo41_war_exploded/FinduserServlet?num=${emp.num}&mianshiguan=${requestScope.mianshiguan}">
                点击这里进行评价
            </a>
        </td>
        <td>${emp.university}</td>
        <td>${emp.age}</td>
        <td>${emp.selfintroduce}</td>
        <td>${emp.email}</td>
        <td>${emp.xueli}</td>
        <td>${emp.name}</td>
        <td>${emp.time1}</td>
        <td>${emp.department}</td>
    </tr>
    </c:forEach>
</body>
</html>
