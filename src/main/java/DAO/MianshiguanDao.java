package DAO;


import Connect.Connect;
import POJI.Mianshiguan;

import java.sql.*;
import java.util.ArrayList;
public class MianshiguanDao {
    public ArrayList findUser(String sql) throws Exception {
            System.out.println("hh");
            ArrayList<Mianshiguan> list=new ArrayList<>();
            /*以下三行为连接数据库的操作*/
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection coon= Connect.co();
            Statement stmt=coon.createStatement();
            ResultSet rr=stmt.executeQuery(sql);

            //响应传递的sql语句
            Mianshiguan m;
            String aa;
            String bb;
            String department;
            String pass;
            while (rr.next()) {
                /*找到对应的用户*/
                System.out.println("ppppppp");
                aa = rr.getString("num");
                System.out.println(aa);
                String ee = rr.getString("name");
                bb = rr.getString("password");
                System.out.println(bb);
                department = rr.getString("department");
                pass= rr.getString("pass");
                    /*希望返回对应的用户*/
                m = new Mianshiguan();
                m.setNum(aa);
                m.setPassword(bb);
                m.setDepartment(department);
                m.setPass(pass);
                list.add(m);
            }
            coon.close();
            stmt.close();
            rr.close();
            /*返回一个Arraylist对象*/
        if(list.size()>0) {
            return list;
        }
        else
        {
            return null;
        }
    }
}
