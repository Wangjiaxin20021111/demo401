<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 25043
  Date: 2022/3/5
  Time: 10:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1px" style="width: 100%">
    <tr>
        <td>编号</td>
        <td>毕业院校</td>
        <td>学历</td>
        <td>年龄</td>
        <td>简历</td>
        <td>是否录取</td>
        <td>邮箱</td>
        <td>学历</td>
        <td>姓名</td>
        <td>面试时间</td>
        <td>面试部门</td>
        <td>面试官</td>
        <td>评价</td>
        <td>前面的排队人数</td>
    </tr>
    <!--
    xx.setNum(num);
            xx.setPassword(password);
            xx.setAge(age);
            xx.setDepartment(department);
            xx.setMianshiguan(mianshiguan);
            xx.setPingjia(Pingjia);
            xx.setUniversity(university);
            xx.setSelfintroduce(selfintroduce);
            xx.setName(name);
            xx.setLuqu(luqu);
            xx.setTime(time);
    -->
    <c:forEach items="${requestScope.xx}" var="emp">
        <tr>
            <td>${emp.num}</td>
            <td>${emp.university}</td>
            <td>${emp.xueli}</td>
            <td>${emp.age}</td>
            <td>${emp.selfintroduce}</td>
            <td>${emp.luqu}</td>
            <td>${emp.email}</td>
            <td>${emp.xueli}</td>
            <td>${emp.name}</td>
            <td>${emp.time}</td>
            <td>${emp.department}</td>
            <td>${emp.mianshiguan}</td>
            <td>${emp.pingjia}</td>
            <td>${emp.counttime}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
