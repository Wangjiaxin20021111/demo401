package Service;

import Connect.Condition;
import DAO.MianshiguanDao2;
import POJI.Mianshiguan;
import POJI.Pageben1;
import POJI.Xuesheng1;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("all")
public class MianshiguanService2 {
    MianshiguanDao2 ddq=new MianshiguanDao2();


    public Xuesheng1 Finduserbyid(String ss) throws SQLException, ClassNotFoundException {
        return ddq.findBynum(ss);
    }
    //查询页码的工具
    public Pageben1 findUserByPage(String _currentPage, String _rows) throws SQLException, ClassNotFoundException {
        Pageben1<Mianshiguan> pageben1=new Pageben1<Mianshiguan>();
        int currentpage=Integer.parseInt(_currentPage);
        int rows=Integer.parseInt(_rows);
        pageben1.setCurrentPage(currentpage);
        pageben1.setRows(rows);
        int totalCount=ddq.findTotalCount();
        pageben1.setTotalCount(totalCount);
        int start=(currentpage-1)*rows;
        List<Mianshiguan> list= ddq.findByPage(start,rows);
        pageben1.setList(list);
        int totalPage=(totalCount % rows) ==0?totalCount/rows:(totalCount/rows)+1;
        pageben1.setTotalPage(totalPage);
        return pageben1;
    }

    public void insert(String num,String neirong,String department1,String pass) throws ClassNotFoundException, SQLException {
        String dql="insert into zhaopinxinxi(mianshiguan,neirong,department,pass) values('"+num+"','"+"  "+neirong+"  "+"','"+department1+"','"+pass+"')";
        ddq.insertinot(dql);
    }

    public ArrayList<Mianshiguan> pingjia() throws SQLException, ClassNotFoundException {
        String qq="select*from zhaopinxinxi";
       ArrayList<Mianshiguan> listt= ddq.findxinxi(qq);
       return listt;
    }

    /*
    public ArrayList<Mianshiguan> chaxun(String department, String mianshiguan, String neirong) throws Exception {
        if(neirong==null)
        {
            if (department == null && mianshiguan == null) {
                String qq = "select*from zhaopinxinxi";
                ArrayList<Mianshiguan> list = ddq.findxinxi(qq);
                System.out.println("查找");
                return list;
            }
            if (department != null && mianshiguan == null) {
                String qq = "select*from zhaopinxinxi where department ='" + department + "'";
                ArrayList<Mianshiguan> list = ddq.findxinxi(qq);
                return list;
            }
            if (department == null && mianshiguan != null) {
                String qq = "select*from zhaopinxinxi where mianshiguan ='" + mianshiguan + "'";
                ArrayList<Mianshiguan> list = ddq.findxinxi(qq);
                return list;
            }
            if (department != null && mianshiguan != null) {
                String qq = "select*from zhaopinxinxi where department ='" + department + "' and " + mianshiguan ;
                ArrayList<Mianshiguan> list = ddq.findxinxi(qq);
                return list;
            }
        }
        else
        {
            String qq = "select*from zhaopinxinxi where neirong like '%"+neirong+"%'";
            ArrayList<Mianshiguan> list = ddq.findxinxi(qq);
            return list;
        }
        return null;
    }
*/
    public ArrayList<Mianshiguan> findxinxi(Condition cd) throws SQLException, ClassNotFoundException {
        ArrayList<Mianshiguan> listt= new ArrayList<>();
        String sql="select*from zhaopinxinxi where 1=1 and pass='P'";
        System.out.println("查询条件是："+cd.neirong+",,"+cd.mianshiguan+".."+cd.department+"..");
        if(cd.department!=null&&cd.department!="")
        {
            sql=sql+" and department='"+cd.department+"'";
        }
        if(cd.mianshiguan!=null&&cd.mianshiguan!="")
        {
            sql=sql+" and mianshiguan='"+cd.mianshiguan+"'";
        }
        if(cd.neirong!=null&&cd.neirong!="")
        {
            sql=sql+" and neirong like '%"+cd.neirong+"%'";
        }
        System.out.println(sql);
         listt=ddq.findxinxi(sql);
        return listt;
    }
    public ArrayList<Xuesheng1> findxinxi2(Condition co) throws Exception {
        ArrayList<Xuesheng1> list=new ArrayList<>();
        String sql="select*from mianshizhe where 1=1 and department='"+co.department+"'";
        System.out.println("查询条件是："+co.university+"..."+co.age+"..."+co.any+"..."+co.department+"..."+co.sametimenumber+"..."+co.time);
        if(co.university!=null&&co.university!="")
        {
            sql=sql+" and university='"+co.university+"'";
        }
        if(co.age!=null&&co.age!="")
        {
            sql=sql+" and age<"+co.age+"";
        }
        if(co.sametimenumber!=null&&co.sametimenumber!=""&&co.time!=null&&co.time!="")
        {
            sql=sql+" and time like '"+co.time+"%' order by time limit 0,"+co.sametimenumber;
            System.out.println(sql+"kkkkk");
        }
        if(co.any!=null&&co.any!="")
        {
            sql="select*from mianshizhe where department='"+co.department+"'";
        }
        list=ddq.findUser(sql);
        return list;
    }

    public ArrayList<Mianshiguan> findMianshiguan() throws SQLException, ClassNotFoundException {
        ArrayList<Mianshiguan> list=new ArrayList<>();
        String sql="select*from mianshiguan";
        list=ddq.findMianshiguan(sql);
        return list;
    }

    public void setPass(String num) throws SQLException, ClassNotFoundException {
        String sql="update mianshiguan set pass='P"+"' where num='"+num+"'";
        ddq.passM(sql);
    }

    public ArrayList<Mianshiguan> lookupxinxi() throws SQLException, ClassNotFoundException {
        String sql="select*from zhaopinxinxi";
        ArrayList<Mianshiguan> list=ddq.findxinxi3(sql);
        return list;
    }

    public void passs(String haoma) throws SQLException, ClassNotFoundException {
        String sql="update zhaopinxinxi set pass='P' where mianshiguan='"+haoma+"'";
        ddq.pass(sql);
    }
}
