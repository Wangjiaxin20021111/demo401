package com.example.demo41;

import Service.Mianshizheservice;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.IOException;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
@SuppressWarnings("all")@MultipartConfig
public class demo01 extends HttpServlet {
    @Override
    //面试者注册
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            Mianshizheservice mm=new Mianshizheservice();
            resp.setCharacterEncoding("gbk");
            req.setCharacterEncoding("gbk");
            String num = req.getParameter("num");
            String dep = req.getParameter("department");
            String time=req.getParameter("time");
            String department = null;
            switch (dep) {
                case "C":
                {
                    department = "嵌入式";
                    break;
                }
                case "J":
                {
                    department = "平台技术部";
                    break;
                }
                case "P":
                {
                    department = "行政人事部";
                    break;
                }
                case "I":
                {
                    department = "网络安全部门";
                    break;
                }
                case "X":
                {
                    department = "产品机械组";
                    break;
                }
                default:
                {
                    department=null;
                }
            }
            String name = req.getParameter("name");
            String university = req.getParameter("university");
            int age = Integer.parseInt(req.getParameter("age"));
            String selfintroduce = req.getParameter("selfintroduce");
            String password = req.getParameter("password");
            String email = req.getParameter("email");
            String x = req.getParameter("xueli");
            String xueli=null;
            switch (x)
            {
                case "0":
                {
                    xueli="低于专科";
                    break;
                }

                case "1":
                {
                    xueli="专科";
                    break;
                }
                case "2":
                {
                    xueli="本科";
                    break;
                }
                case "3":
                {
                    xueli="研究生";
                    break;
                }
                case "4":
                {
                    xueli="博士生";
                    break;
                }
                case "5":
                {
                    xueli="高于博士生";
                    break;
                }
                default:{
                    xueli=null;
                }
            }
                int n1 = mm.zhuce(num, name, university, age, selfintroduce, password, email, xueli, department,time);
                if (n1 > 0) {
                    PrintWriter pw = resp.getWriter();
                    pw.print("恭喜你" + name + "注册成功！");
                } else {
                    PrintWriter p1 = resp.getWriter();
                    p1.print("该用户已经存在，不能注册或者您的邮箱与他人的重名，无法注册");
                }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
