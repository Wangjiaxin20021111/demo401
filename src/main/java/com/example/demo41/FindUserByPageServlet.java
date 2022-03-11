package com.example.demo41;

import POJI.Mianshiguan;
import POJI.Pageben1;
import Service.MianshiguanService2;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

public class FindUserByPageServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        try {
            //获取参数
            req.setCharacterEncoding("gbk");
            resp.setCharacterEncoding("gbk");
            String currentPage=req.getParameter("currentPage");//当前页码
            String rows=req.getParameter("rows");//每页显示的条数
            //调用Service查询
            MianshiguanService2 mm=new MianshiguanService2();
            Pageben1<Mianshiguan> pageben1=mm.findUserByPage(currentPage,rows);
            System.out.println(pageben1);

            req.setAttribute("pageben1",pageben1);
            req.getRequestDispatcher("/Pagenean.jsp").forward(req,resp);

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
