<%@ page import="Service.MianshiguanService2" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="POJI.Mianshiguan" %>
<%@ page import="java.io.PrintWriter" %>
<%@ page import="java.sql.SQLException" %><%--
  Created by IntelliJ IDEA.
  User: 25043
  Date: 2022/3/7
  Time: 15:47
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
     request.setCharacterEncoding("utf-8");
     request.setCharacterEncoding("utf-8");
     String num=request.getParameter("num");
     String neirong=request.getParameter("neirong");
     String department1=request.getParameter("department1");
     String pass="aaaaa";
     switch (department1)
     {
         case "C":
         {
             department1="嵌入式";
             break;
         }
         case "J":
         {
             department1="平台技术部";
             break;
         }
         case "P":
         {
             department1="行政人事部";
             break;
         }
         case "I":
         {
             department1="网络安全部门";
             break;
         }
         case "X":
         {
             department1="产品机械组";
             break;
         }
     }
     if(num!=null&&neirong!=null) {
         try {
              mm.insert(num,neirong,department1,pass);
              PrintWriter printWriter=response.getWriter();
              printWriter.print("您已经成功录入信息！");
         } catch (ClassNotFoundException e) {
             e.printStackTrace();
         } catch (SQLException e) {
             e.printStackTrace();
         }
     }
     else
     {
         PrintWriter printWriter=response.getWriter();
         printWriter.print("您输入的内容是空！");
         printWriter.close();
     }
 %>
</body>
</html>
