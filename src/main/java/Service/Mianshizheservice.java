package Service;

import DAO.MianshizheDao;
import POJI.Xuesheng1;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

public class Mianshizheservice {
    MianshizheDao mm=new MianshizheDao();
    public ArrayList<Xuesheng1> login(String num, String password) throws SQLException, IOException /*throws SQLException*/ {
        String sql="select*from mianshizhe where num='"+num+"' and password='"+password+"'";
        ArrayList<Xuesheng1> xx = mm.findMianshizheBysql(sql);
        if(xx==null)
        {
            return null;
        }
        else {
            return xx;
        }
    }

    public int zhuce(String num, String name, String university, int age, String selfintroduce, String password, String email, String xueli, String department,String time) throws SQLException, ClassNotFoundException {
        String sql = "insert into mianshizhe(num,name,university,age,selfintroduce,password,email,xueli,department,time) " + " values('" + num + "',"+"'" + name + "','" + university + "'," + age + ",'" + selfintroduce + "','" + password + "','" + email + "','" + xueli+"','" +department+"','"+time+"')";
        int a=mm.insert(sql);
        System.out.println("llllllll");
        return a;
    }
}
