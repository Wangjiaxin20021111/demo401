package com.example.demo41;

import POJI.Xuesheng1;
import Service.MianshiguanService2;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class updateUser extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("gbk");
        resp.setCharacterEncoding("gbk");
        String Pingjia=req.getParameter("Pingjia");
        //Xuesheng1 xx=new Xuesheng1(Pingjia);
        MianshiguanService2 mm=new MianshiguanService2();
        resp.sendRedirect("userList");
    }
}
