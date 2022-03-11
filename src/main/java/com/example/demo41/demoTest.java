package com.example.demo41;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class demoTest extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("gbk");
        resp.setCharacterEncoding("gbk");
        String a=req.getParameter("username");
        String b=req.getParameter("password");
        Cookie cookie=new Cookie("number",a);
        cookie.setMaxAge(1000);
        resp.addCookie(cookie);
        Cookie cookie2=new Cookie("number1",b);
        cookie.setMaxAge(1000);
        resp.addCookie(cookie2);
        if(a.equals("张三")&&b.equals("123"))
        {
            System.out.println("login succeed!");
        }
    }
}
