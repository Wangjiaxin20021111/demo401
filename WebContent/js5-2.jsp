<%@ page import="java.sql.DriverManager" %>
<%@ page import="Service.MianshiguanService" %>
<%@ page import="POJI.Mianshiguan" %><%--
  Created by IntelliJ IDEA.
  User: 25043
  Date: 2022/2/28
  Time: 20:18
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
    @SuppressWarnings("all")
    MianshiguanService nn=new MianshiguanService();
    request.setCharacterEncoding("gbk");
    response.setCharacterEncoding("gbk");
    String num=request.getParameter("num");
    String password=request.getParameter("password");
    String department=request.getParameter("department");

    String department1=department;

    Mianshiguan m=null;
    switch (department)
    {
        case "C":
        {
            department="嵌入式";
            break;
        }
        case "J":
        {
            department="平台技术部";
            break;
        }
        case "P":
        {
            department="行政人事部";
            break;
        }
        case "I":
        {
            department="网络安全部门";
            break;
        }
        case "X":
        {
            department="产品机械组";
            break;
        }
    }
    m=nn.login(num,password,department);
    if(m.pass.equals("P"))
    {
        if(m!=null)
        {
                switch (m.department)
                {
                    case "嵌入式":
                    {
                        request.setAttribute("num", m.getNum());
                        request.setAttribute("department", m.getDepartment());
                        request.setAttribute("department1", department1);
                        break;
                    }
                    case "平台技术部":
                    {
                        request.setAttribute("num", m.getNum());
                        request.setAttribute("department", m.getDepartment());
                        request.setAttribute("department1", department1);
                        break;
                    }
                    case "行政人事部":
                    {
                        request.setAttribute("num", m.getNum());
                        request.setAttribute("department", m.getDepartment());
                        request.setAttribute("department1", department1);
                        break;
                    }
                    case "网络安全部门":
                    {
                        request.setAttribute("num", m.getNum());
                        request.setAttribute("department", m.getDepartment());
                        request.setAttribute("department1", department1);
                        break;
                    }
                    case "产品机械组":
                    {
                        request.setAttribute("num", m.getNum());
                        request.setAttribute("department", m.getDepartment());
                        request.setAttribute("department1", department1);
                        break;
                    }
                }
        }
        else
        {
            out.print("您输入的账户名与密码对应不正确，请重新输入！");
        }
    }
    else
    {
    out.print("您尚未通过审核");
    }

%>
<center>
    <c:if test="${requestScope.department=='平台技术部'}">
        <h1>欢迎平台技术部的面试官登录！</h1>
        <h1>您有以下的权限，可以根据您的需求查看有哪些人在面试，并且给予他们评价</h1>
         <table>
             <form action="http://localhost:8080/demo41_war_exploded/pingtaijishu.jsp" method="post">
             <tr>
                 <td>根据学校查看学生简历，请输入具体学校</td>
                 <td>
                     <input type="text" name="university">
                 </td>
             </tr>
             <tr>
                 <td>根据年龄查看信息，请输入最高年龄限制</td>
                 <td><input type="text" name="age"></td>
             </tr>
             <tr>
                 <td>您也查看默认所有信息，如果您点击是，默认查看所有</td>
                 <td>
                     <input type="radio" name="any" value="Y">
                 </td>
             </tr>
             <tr>
                 <td>点击这里进行提交</td>
                 <td><input type="submit" value="提交"></td>
             </tr>
                 <tr>
                     <td><input type="hidden" name="num" value="${requestScope.num}"></td>
                 </tr>
                 <tr>
                      <a href="Mianshixinxi.jsp?num=${requestScope.num}&department1=${requestScope.department1}">
                          点击这里进行面试信息的发布
                      </a>
                 </tr>
                  <!--新增的面试官功能-->
                 <tr>
                     <td>请输入您想同一时间面试的人数</td>
                     <td><input type="text" name="sametimenumber"></td>
                 </tr>
                  <tr>
                      <td>请输入您想面试的日期</td>
                      <td><input type="date" name="date"></td>
                  </tr>
                 <!---->
             </form>
         </table>
    </c:if>
    <c:if test="${requestScope.department=='嵌入式'}">
        <h1>欢迎嵌入式的面试官登录！</h1>
        <table>
            <form action="http://localhost:8080/demo41_war_exploded/qianrushi.jsp" method="post">
                <tr>
                    <td>根据学校查看学生简历，请输入具体学校</td>
                    <td>
                        <input type="text" name="university">
                    </td>
                </tr>
                <tr>
                    <td>根据年龄查看信息，请输入最高年龄限制</td>
                    <td><input type="text" name="age"></td>
                </tr>
                <tr>
                    <td>您也查看默认所有信息，如果您点击是，默认查看所有</td>
                    <td>
                        <input type="radio" name="any" value="是">
                    </td>
                </tr>
                <!--新增的面试官功能-->
                <tr>
                    <td>请输入您想同一时间面试的人数</td>
                    <td><input type="text" name="sametimenumber"></td>
                </tr>
                <tr>
                    <td>请输入您想面试的日期</td>
                    <td><input type="date" name="date"></td>
                </tr>
                <!---->
                <tr>
                    <td>点击这里进行提交</td>
                    <td><input type="submit" value="提交"></td>
                </tr>
                <tr>
                    <td><input type="hidden" name="num" value="${requestScope.num}&department1=${requestScope.department1}"></td>
                </tr>
                <a href="Mianshixinxi.jsp?num=${requestScope.num}&department1=${requestScope.department1}">
                    点击这里进行面试信息的发布
                </a>
            </form>
        </table>
    </c:if>
    <c:if test="${requestScope.department=='行政人事部'}">
        <h1>欢迎行政人事部的面试官登录！</h1>
        <table>
            <form action="http://localhost:8080/demo41_war_exploded/xingzhengrenshibu.jsp" method="post">
                <tr>
                    <td>根据学校查看学生简历，请输入具体学校</td>
                    <td>
                        <input type="text" name="university">
                    </td>
                </tr>
                <tr>
                    <td>根据年龄查看信息，请输入最高年龄限制</td>
                    <td><input type="text" name="age"></td>
                </tr>
                <tr>
                    <td>您也查看默认所有信息，如果您点击是，默认查看所有</td>
                    <td>
                        <input type="radio" name="any" value="是">
                    </td>
                </tr>
                <!--新增的面试官功能-->
                <tr>
                    <td>请输入您想同一时间面试的人数</td>
                    <td><input type="text" name="sametimenumber"></td>
                </tr>
                <tr>
                    <td>请输入您想面试的日期</td>
                    <td><input type="date" name="date"></td>
                </tr>
                <!---->
                <tr>
                    <td>点击这里进行提交</td>
                    <td><input type="submit" value="提交"></td>
                </tr>
                <tr>
                    <td><input type="hidden" name="num" value="${requestScope.num}&department1=${requestScope.department1}"></td>
                </tr>
                <a href="Mianshixinxi.jsp?num=${requestScope.num}&department1=${requestScope.department1}">
                    点击这里进行面试信息的发布
                </a>
            </form>
        </table>
    </c:if>
    <c:if test="${requestScope.department=='网络安全部门'}">
        <h1>欢迎网络安全部门的面试官登录！</h1>
        <table>
            <form action="http://localhost:8080/demo41_war_exploded/Wangluoanquanbumen.jsp" method="post">
                <tr>
                    <td>根据学校查看学生简历，请输入具体学校</td>
                    <td>
                        <input type="text" name="university">
                    </td>
                </tr>
                <tr>
                    <td>根据年龄查看信息，请输入最高年龄限制</td>
                    <td><input type="text" name="age"></td>
                </tr>
                <tr>
                    <td>您也查看默认所有信息，如果您点击是，默认查看所有</td>
                    <td>
                        <input type="radio" name="any" value="是">
                    </td>
                </tr>
                <!--新增的面试官功能-->
                <tr>
                    <td>请输入您想同一时间面试的人数</td>
                    <td><input type="text" name="sametimenumber"></td>
                </tr>
                <tr>
                    <td>请输入您想面试的日期</td>
                    <td><input type="date" name="date"></td>
                </tr>
                <!---->
                <tr>
                    <td>点击这里进行提交</td>
                    <td><input type="submit" value="提交"></td>
                </tr>
                <tr>
                    <td><input type="hidden" name="num" value="${requestScope.num}&department1=${requestScope.department1}"></td>
                </tr>
                <a href="Mianshixinxi.jsp?num=${requestScope.num}&department1=${requestScope.department1}">
                    点击这里进行面试信息的发布
                </a>
            </form>
        </table>
    </c:if>
    <c:if test="${requestScope.department=='产品机械组'}">
        <h1>欢迎产品机械组的面试官登录！</h1>
        <table>
            <form action="http://localhost:8080/demo41_war_exploded/chanpinjixiezu.jsp" method="post">
                <tr>
                    <td>根据学校查看学生简历，请输入具体学校</td>
                    <td>
                        <input type="text" name="university">
                    </td>
                </tr>
                <tr>
                    <td>根据年龄查看信息，请输入最高年龄限制</td>
                    <td><input type="text" name="age"></td>
                </tr>
                <tr>
                    <td>您也查看默认所有信息，如果您点击是，默认查看所有</td>
                    <td>
                        <input type="radio" name="any" value="是">
                    </td>
                </tr>
                <!--新增的面试官功能-->
                <tr>
                    <td>请输入您想同一时间面试的人数</td>
                    <td><input type="text" name="sametimenumber"></td>
                </tr>
                <tr>
                    <td>请输入您想面试的日期</td>
                    <td><input type="date" name="date"></td>
                </tr>
                <!---->
                <tr>
                    <td>点击这里进行提交</td>
                    <td><input type="submit" value="提交"></td>
                </tr>
                <a href="Mianshixinxi.jsp?num=${requestScope.num}&department1=${requestScope.department1}">
                    点击这里进行面试信息的发布
                </a>
                <tr>
                    <td><input type="hidden" name="num" value="${requestScope.num}&department1=${requestScope.department1}"></td>
                </tr>
            </form>
        </table>
    </c:if>
</center>
</body>
</html>
