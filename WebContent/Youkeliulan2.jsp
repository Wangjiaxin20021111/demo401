<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="POJI.Mianshiguan" %>
<%@ page import="Service.MianshiguanService2" %>
<%@ page import="java.sql.SQLException" %>
<%@ page import="Connect.Condition" %><%--
  Created by IntelliJ IDEA.
  User: 25043
  Date: 2022/3/7
  Time: 21:24
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
        String department= request.getParameter("department");
        String mianshiguan=request.getParameter("num");
        String neirong=request.getParameter("neirong");

        System.out.println(neirong);

        Condition cd=new Condition(department,mianshiguan,neirong);
        ArrayList<Mianshiguan> list= null;
        list = mm.findxinxi(cd);
        request.setAttribute("listt",list);
    } catch (SQLException e) {
        e.printStackTrace();
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    }

        //ArrayList<Mianshiguan> list=mm.pingjia();
        //request.setAttribute("listt",list);
    /*
        request.setCharacterEncoding("gbk");
        response.setCharacterEncoding("gbk");
        //MianshiguanService2 mm=new MianshiguanService2();
        String department= request.getParameter("department");
        String mianshiguan=request.getParameter("num");
        String neirong=request.getParameter("neirong");
        */
    /*
    MianshiguanService2 mmm = new MianshiguanService2();
    ArrayList<Mianshiguan> list = mmm.pingjia();
    request.setAttribute("listt", list);*/

%>

<table border="1px" style="width: 100%" >
    <tr>
       <td>信息序号</td>
       <td>面试官号码</td>
       <td>面试官的信息</td>
        <td>部门</td>
    </tr>
<c:forEach items="${requestScope.listt}" var="emp">
      <tr>
          <td>${emp.number}</td>
          <td>${emp.num}</td>
          <td>${emp.neirong}</td>
          <td>${emp.department}</td>
      </tr>
</c:forEach>
    <center>
        <form action="http://localhost:8080/demo41_war_exploded/Youkeliulan2.jsp" method="post">
            <input type="radio" name="department" value="平台技术部">平台技术部<br>
            <input type="radio" name="department" value="嵌入式">嵌入书<br>
            <input type="radio" name="department" value="网络安全部门">网络安全部门<br>
            <input type="radio" name="department" value="产品机械组">产品机械组<br>
            <input type="radio" name="department" value="行政人事部">行政人事部<br>
            <input type="text" name="num"><br>
            <input type="text" name="neirong"><br>
            <input type="submit" value="提交">

        </form>
    </center>
</table>
</body>
</html>
