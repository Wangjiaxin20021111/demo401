<%@ page import="Connect.Condition" %><%--
  Created by IntelliJ IDEA.
  User: 25043
  Date: 2022/3/10
  Time: 13:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    request.setCharacterEncoding("gbk");
    response.setCharacterEncoding("gbk");
    String numb=request.getParameter("numb");
    String password=request.getParameter("password");
    Condition co=new Condition(numb,password);
    if(co.numb.equals("123")&&co.password.equals("121"))
    {

        request.setAttribute("numb",numb);
        request.setAttribute("password",password);
        request.getRequestDispatcher("Managerwork.jsp").forward(request,response);
    }
    else
    {
        out.print("您输入的账号密码有错误!");
    }
%>
<html>
<head>
    <title>Title</title>
</head>
<body>

</body>
</html>
