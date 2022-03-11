package com.example.demo41;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class demo04 extends HttpServlet {
    @Override@SuppressWarnings("all")
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            resp.setCharacterEncoding("gbk");
            req.setCharacterEncoding("gbk");

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection coon = DriverManager.getConnection("jdbc:mysql://localhost:3306/comp", "root", "20021111aA#");
            String name=req.getParameter("name");
            String num=req.getParameter("num");
            String password=req.getParameter("password");
            String department=req.getParameter("department");
            String deapnum=req.getParameter("deapnum");
            String pass="aaaaa";
            switch (department)
            {
                case "C":
                {
                    department = "嵌入式";
                    if(deapnum.equals("A01"))
                    {
                        break;
                    }
                    else
                    {
                        coon.close();
                        req.getRequestDispatcher("/wrong.html").forward(req,resp);
                    }
                }
                case "J":
                {
                    department = "平台技术部";
                    if(deapnum.equals("A02"))
                    {
                        break;
                    }
                    else
                    {
                        coon.close();
                        req.getRequestDispatcher("/wrong.html").forward(req,resp);
                    }
                }
                case "P":
                {
                    department = "行政人事部";
                    if(deapnum.equals("A03"))
                    {
                        break;
                    }
                    else
                    {
                        coon.close();
                        req.getRequestDispatcher("/wrong.html").forward(req,resp);
                    }
                }
                case "I":
                {
                    department = "网络安全部门";
                    if(deapnum.equals("A04"))
                    {
                        break;
                    }
                    else
                    {
                        coon.close();
                        req.getRequestDispatcher("/wrong.html").forward(req,resp);
                    }
                }
                case "X":
                {
                    department = "产品机械组";
                    if(deapnum.equals("A05"))
                    {
                        break;
                    }
                    else
                    {
                        coon.close();
                        req.getRequestDispatcher("/wrong.html").forward(req,resp);
                    }
                }
            }
            System.out.println("hhhhhhh");
            String sql="insert into mianshiguan(num,name,password,department,pass) values("+"'"+num+"',"+"'"+name+"','"+password+"','"+department+"','"+pass+"')";
            System.out.println("hello world!");
            Statement stmt= coon.createStatement();
            int m=stmt.executeUpdate(sql);
            if(m>0)
            {
                PrintWriter pw=resp.getWriter();
                pw.print("恭喜您，面试官"+name+"注册成功！");
                coon.close();
                stmt.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
