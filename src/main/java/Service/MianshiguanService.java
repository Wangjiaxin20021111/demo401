package Service;

import DAO.MianshiguanDao;
import POJI.Mianshiguan;

import java.util.ArrayList;
@SuppressWarnings("all")
public class MianshiguanService {
    MianshiguanDao dd=new MianshiguanDao();
    public Mianshiguan login(String num, String password, String department) throws Exception {
        //Mianshiguan nn=null;
        String sa = "select * from mianshiguan where num='" + num + "' and password='" + password + "'" + " and department='" + department + "'";
        ArrayList<Mianshiguan> ll = dd.findUser(sa);

        Mianshiguan nn = null;
        if (ll != null) {
            System.out.println("OK");
            nn = ll.get(0);
            System.out.println("hehe");
            return nn;
        }
        else {
            nn =new Mianshiguan();
            nn.pass="aaaaaaa";
            return nn;
        }
    }
}
