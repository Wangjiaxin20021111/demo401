<%@ page import="Service.MianshiguanService2" %>
<%@ page import="javax.xml.crypto.Data" %>
<%@ page import="Connect.Connect" %>
<%@ page import="java.sql.*" %><%--
  Created by IntelliJ IDEA.
  User: 25043
  Date: 2022/3/3
  Time: 23:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String ss=request.getParameter("Pingjia");
    String yy=request.getParameter("num");
    //String time= request.getParameter("time");
    String mianshiguan=request.getParameter("numb");
    String luqu=request.getParameter("luqu");
    out.print(ss + yy + mianshiguan+"time");
    Connection coon = Connect.co();//DriverManager.getConnection("jdbc:mysql://localhost:3306/comp", "root", "20021111aA#");
    Statement stmt = coon.createStatement();
    String sql = " update mianshizhe set Pingjia ='" + ss + "'" + " where num='" + yy + "'";
    int n = stmt.executeUpdate(sql);
    sql = "update mianshizhe set mianshiguan='" + mianshiguan + "' " + "where num='" + yy + "'";
    int n1 = stmt.executeUpdate(sql);
    //sql="update mianshizhe set time='"+time+"' where num='"+yy+"'";
    //int n2=stmt.executeUpdate(sql);
        //MianshiguanService2 mm=new MianshiguanService2();
    if(luqu!=null)
    {
        sql = "update mianshizhe set luqu='" + luqu + "' where num='" + yy + "'";
        int n3 = stmt.executeUpdate(sql);
        System.out.println(n3);
    }
%>
</body>
</html>
