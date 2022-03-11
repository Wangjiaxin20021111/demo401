package DAO;

import Connect.Connect;
import POJI.Mianshiguan;
import POJI.Xuesheng1;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("all")
public class MianshiguanDao2 {
    public ArrayList findUser(String sql) throws Exception {
        System.out.println("hh");
        ArrayList<Xuesheng1> list=new ArrayList<>();
        /*以下三行为连接数据库的操作*/
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection coon= DriverManager.getConnection("jdbc:mysql://localhost:3306/comp","root","20021111aA#");
        Statement stmt=coon.createStatement();
        ResultSet rr=stmt.executeQuery(sql);//响应传递的sql语句
        String university;
        String department;
        String num;
        String age;
        String selfintroduce;
        String email;
        String xueli;
        String name;
        String time;
        Xuesheng1 m=null;
        while(rr.next())
        {
            /*找到对应的用户*/
            university=rr.getString("university");
            department=rr.getString("department");
            /*希望返回对应的用户*/
            num=rr.getString("num");
            age=rr.getString("age");
            name=rr.getString("name");
            selfintroduce=rr.getString("selfintroduce");
            email=rr.getString("email");
            xueli=rr.getString("xueli");
            time=rr.getString("time");
            //m=new Xuesheng1(university,department,num,age,selfintroduce,email,xueli,name);
            m=new Xuesheng1();
            m.setUniversity(university);
            m.setDepartment(department);
            m.setNum(num);
            m.setAge(age);
            m.setName(name);
            m.setEmail(email);
            m.setXueli(xueli);
            m.setSelfintroduce(selfintroduce);
            m.setTime1(time);
            list.add(m);
        }
        coon.close();
        stmt.close();
        rr.close();
        /*返回一个Arraylist对象*/
        return list;
    }



    public Xuesheng1 findBynum(String ss) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection coon= DriverManager.getConnection("jdbc:mysql://localhost:3306/comp","root","20021111aA#");
        Statement stmt=coon.createStatement();
        String sql="select*from mianshizhe where num ='"+ss+"'";
        ArrayList<Xuesheng1> list=new ArrayList<>();
        ResultSet rr=stmt.executeQuery(sql);
        while (rr.next())
        {
            String university = rr.getString("university");
            String department = rr.getString("department");
            /*希望返回对应的用户*/
            String num = rr.getString("num");
            String age = rr.getString("age");
            String name = rr.getString("name");
            String selfintroduce = rr.getString("selfintroduce");
            String email = rr.getString("email");
            String xueli = rr.getString("xueli");
            //m=new Xuesheng1(university,department,num,age,selfintroduce,email,xueli,name);
            String mianshiguan=rr.getString("mianshiguan");
            String Pingjia= rr.getString("pingjia");
            String luqu=rr.getString("luqu");
            Xuesheng1 m = new Xuesheng1();
            m.setUniversity(university);
            m.setDepartment(department);
            m.setNum(num);
            m.setAge(age);
            m.setName(name);
            m.setEmail(email);
            m.setXueli(xueli);
            m.setSelfintroduce(selfintroduce);
            m.setMianshiguan(mianshiguan);
            m.setPingjia(Pingjia);
            m.setLuqu(luqu);
            list.add(m);
        }
        Xuesheng1 qq=list.get(0);
        return qq;
    }

    public void insertinot(String dql) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection= Connect.co();
        Statement statement=connection.createStatement();
        int n=statement.executeUpdate(dql);
    }

    public ArrayList<Mianshiguan> findxinxi(String qq) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection= Connect.co();
        Statement statement=connection.createStatement();
        ResultSet rr=statement.executeQuery(qq);
        ArrayList<Mianshiguan> list=new ArrayList<>();
        Mianshiguan m=null;
        int n1;
        String mianshiguan;
        String neirong;
        String department;
        while (rr.next())
        {
           m=new Mianshiguan();
           n1=rr.getInt(1);
           mianshiguan= rr.getString("mianshiguan");
           neirong=rr.getString("neirong");
           department=rr.getString("department");
           m.setNumber(n1);
           m.setNum(mianshiguan);
           m.setNeirong(neirong);
           m.setDepartment(department);
           System.out.println(m.getNeirong()+"..."+m.getNum());
           list.add(m);
        }
        connection.close();
        statement.close();
        rr.close();
        return list;
    }



    public int findTotalCount() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection= Connect.co();
        Statement statement=connection.createStatement();
        String sql="select count(*) from zhaopinxinxi";
        ResultSet rr=statement.executeQuery(sql);
        int a = 0;
        while(rr.next())
        {
           a= rr.getInt(1);
        }
        connection.close();
        statement.close();
        rr.close();
        return a;
    }
   //找到当前页码的方法
    public List<Mianshiguan> findByPage(int start, int rows) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection= Connect.co();
        Statement statement=connection.createStatement();
        String sql="select*from zhaopinxinxi limit "+start+","+rows;
        ResultSet rr=statement.executeQuery(sql);
        List<Mianshiguan> list=new ArrayList<>();
        Mianshiguan mm;
        int numb;
        String mianshiguan;
        String neirong;
        String department;
        while (rr.next())
        {
            mm=new Mianshiguan();
            numb=rr.getInt(1);
            mianshiguan=rr.getString("mianshiguan");
           neirong=rr.getString("neirong");
           department=rr.getString("department");
           mm.setDepartment(department);
           mm.setNumber(numb);
           mm.setNeirong(neirong);
           mm.setNum(mianshiguan);
           list.add(mm);
        }
        return list;
    }

    public ArrayList<Mianshiguan> findMianshiguan(String sql) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection= Connect.co();
        Statement statement=connection.createStatement();
        ResultSet rr=statement.executeQuery(sql);
        String num;
        String name;
        String department;
        String pass;
        ArrayList<Mianshiguan> list=new ArrayList<>();
        Mianshiguan mm;
        while (rr.next())
        {
             mm=new Mianshiguan();
             num=rr.getString("num");
             name=rr.getString("name");
             department=rr.getString("department");
             mm.setNum(num);
             mm.setName(name);
             mm.setDepartment(department);
             list.add(mm);
        }
        connection.close();
        statement.close();
        rr.close();
        if(list!=null) {
            return list;
        }
        else {
            return null;
        }
    }

    public void passM(String sql) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection= Connect.co();
        Statement statement=connection.createStatement();
        int n=statement.executeUpdate(sql);
    }

    public ArrayList<Mianshiguan> findxinxi3(String sql) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection= Connect.co();
        Statement statement=connection.createStatement();
        ArrayList<Mianshiguan> list=new ArrayList<>();
        ResultSet rr=statement.executeQuery(sql);
        int numb;
        String mianshiguan;
        String pass;
        String department;
        String neirong;
        Mianshiguan mm;
        while (rr.next())
        {
             mm=new Mianshiguan();
             numb=rr.getInt(1);
             pass=rr.getString("pass");
             department=rr.getString("department");
             neirong=rr.getString("neirong");
             mianshiguan=rr.getString("mianshiguan");
             mm.setNum(mianshiguan);
             mm.setNeirong(neirong);
             mm.setNumber(numb);
             mm.setDepartment(department);
             mm.setPass(pass);
             list.add(mm);
        }
        connection.close();
        statement.close();
        rr.close();
        return list;
    }

    public void pass(String sql) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection= Connect.co();
        Statement statement=connection.createStatement();
        int n=statement.executeUpdate(sql);
    }
}
