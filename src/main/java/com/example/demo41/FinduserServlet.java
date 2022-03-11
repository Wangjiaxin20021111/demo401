package com.example.demo41;

import POJI.Xuesheng1;
import Service.MianshiguanService2;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

public class FinduserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            String ss= req.getParameter("num");
            MianshiguanService2 mm=new MianshiguanService2();
            Xuesheng1 xx= null;
            xx = mm.Finduserbyid(ss);
            req.setAttribute("Xuesheng1",xx);
            String mianshiguan=req.getParameter("mianshiguan");
            req.setAttribute("numb",mianshiguan);
            req.getRequestDispatcher("/Update.jsp").forward(req,resp);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
