package Connect;

public class Condition {
    public String department;
    public String mianshiguan;
    public String neirong;
    public String university;
    public String any;
    public String age;
    public int qqq;
    public String numb;
    public String password;

    public String time;
    public String sametimenumber;

    public Condition(String department,String mianshiguan,String neirong)
    {
        this.department=department;
        this.mianshiguan=mianshiguan;
        this.neirong=neirong;
    }
    public Condition(String university,String any,String age,int qqq,String department,String time,String sametimenumber)
    {
        this.university=university;
        this.any=any;
        this.age=age;
        this.qqq=qqq;
        this.department=department;
        this.time=time;
        this.sametimenumber=sametimenumber;
    }

    public Condition(String numb, String password) {
        this.numb=numb;
        this.password=password;
    }
}
