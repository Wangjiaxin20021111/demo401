package com.example.demo41;

import POJI.Xuesheng1;
import Service.Mianshizheservice;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class demo06 extends HttpServlet {
    @Override@SuppressWarnings("all")
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            Mianshizheservice mm=new Mianshizheservice();
            resp.setCharacterEncoding("gbk");
            req.setCharacterEncoding("gbk");
            String num=req.getParameter("num");
            String password=req.getParameter("password");
            String remember=req.getParameter("remember");
            ArrayList<Xuesheng1> xx= null;
            xx = mm.login(num,password);
            if(xx!=null)
            {
                if(remember.equals("是"))
                {
                    Cookie co=new Cookie("num",num);
                    co.setMaxAge(100);
                    resp.addCookie(co);
                    Cookie co1=new Cookie("password",password);
                    co1.setMaxAge(100);
                    resp.addCookie(co1);
                    req.setAttribute("xx", xx);
                    req.getRequestDispatcher("/Mianshizhedenglu.jsp").forward(req, resp);
                }
                else
                {
                    req.setAttribute("xx", xx);
                    req.getRequestDispatcher("/Mianshizhedenglu.jsp").forward(req, resp);
                }
            }
            else
            {
                PrintWriter pw=resp.getWriter();
                pw.print("用户名不存在或者密码错误！");
                pw.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
