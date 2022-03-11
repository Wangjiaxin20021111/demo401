<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 25043
  Date: 2022/3/8
  Time: 15:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach items="${pageben1.list}" var="Mianshiguan">
    <h1>${Mianshiguan.list}</h1>
    <h1>${Mianshiguan.totalPage}</h1>
    <h1>${Mianshiguan.rows}</h1>
</c:forEach>
</body>
</html>
