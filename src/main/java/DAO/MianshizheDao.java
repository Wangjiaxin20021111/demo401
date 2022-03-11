package DAO;

import Connect.Connect;
import POJI.Xuesheng1;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
@SuppressWarnings("all")
public class MianshizheDao {
    public ArrayList<Xuesheng1> findMianshizheBysql(String sql) throws SQLException, IOException {
        Connection coon = Connect.co();
        Statement stmt = coon.createStatement();
        ResultSet rr = stmt.executeQuery(sql);
        Xuesheng1 xx = null;
        String num;
        String password;
        String university;
        ArrayList<Xuesheng1> list =null;
        int n = 0;
        while (rr.next()) {
            list = new ArrayList<>();
            num = rr.getString("num");
            password = rr.getString("password");
            university = rr.getString("university");
            String department = rr.getString("department");
            String name = rr.getString("name");
            String age = rr.getString("age");
            String selfintroduce = rr.getString("selfintroduce");
            String email = rr.getString("email");
            String xueli = rr.getString("xueli");
            String mianshiguan = rr.getString("mianshiguan");
            String pingjia = rr.getString("pingjia");
            String luqu = rr.getString("luqu");
            String time = rr.getString("time");
            /*
             * 获取头像信息*/
            //Blob b= rr.getBlob("photo");
            //xx.setBlob(b);
            /* */
            xx = new Xuesheng1();
            xx.setNum(num);
            xx.setPassword(password);
            xx.setAge(age);
            xx.setDepartment(department);
            xx.setMianshiguan(mianshiguan);
            xx.setPingjia(pingjia);
            xx.setUniversity(university);
            xx.setSelfintroduce(selfintroduce);
            xx.setName(name);
            xx.setLuqu(luqu);
            xx.setXueli(xueli);
            xx.setTime(time);
            xx.setEmail(email);



            Connection coon1 = Connect.co();
            Statement stmt1 = coon.createStatement();
            String sql1 = "select count(time) from mianshizhe where time<'" + time + "' and department='" +department+ "'";
            ResultSet r1 = stmt1.executeQuery(sql1);
            System.out.println("hehe");
            while (r1.next())
            {
                n = r1.getInt(1);
            }
            coon1.close();
            stmt1.close();
            r1.close();


            xx.setCounttime(n);
            list.add(xx);
        }
        coon.close();
        stmt.close();
        rr.close();
        if(list!=null){
            return list;
        }
        else {
            return null;
        }
    }

    public int insert(String sql) throws ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection coon = null;
        try {
            int n=0;
            coon = Connect.co();
            Statement stmt = coon.createStatement();
            n = stmt.executeUpdate(sql);
            if(n==1)
            {
                coon.close();
                stmt.close();
                return n;
            }
            else {
                coon.close();
                stmt.close();
                return n;
            }
        } catch (SQLException e) {
            return 0;
        }
    }
}
