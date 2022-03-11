package com.example.demo41;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;

public class demo05 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection coon = DriverManager.getConnection("jdbc:mysql://localhost:3306/comp", "root", "20021111aA#");
            Statement stmt = coon.createStatement();
            req.setCharacterEncoding("gbk");
            resp.setCharacterEncoding("gbk");
            String num = req.getParameter("num");
            String password = req.getParameter("password");
            String department = req.getParameter("department");
            String ss = "select * from mianshiguan where num='" + num + "' and password='" + password + "'" + " and department='" + department + "'";
            ResultSet rr = stmt.executeQuery(ss);
            while (rr.next()) {
                String a = rr.getString("num");
                System.out.println(a);
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
