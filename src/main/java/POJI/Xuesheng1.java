package POJI;

import java.sql.Blob;

@SuppressWarnings("all")
public class Xuesheng1 {
     public String university;
     public String department;
     public String num;
     public String name;
     public String age;
     public String selfintroduce;
     public String email;
     public String xueli;
     public String mianshiguan;
     public String pingjia;
     public String luqu;
     public String password;
     public String time;
     public int counttime;
     String time1;
    public void setCounttime(int counttime) {
        this.counttime = counttime;
    }
    //Blob blob;
     //public String Pingjia;
    /*
    public Xuesheng1(String university, String department,String num,int age,String selfintroduce,String email,String xueli,String name) {
        this.university = university;
        this.department=department;
        this.num=num;
        this.age=age;
        this.selfintroduce=selfintroduce;
        this.email=email;
        this.xueli=xueli;
        this.name=name;
    }*/
/*
    public Blob getBlob() {
        return blob;
    }*/

    public String getTime1() {
        return time1;
    }

    public String getTime() {
        return time;
    }
    public String getPingjia() {
        return pingjia;
    }
    public String getUniversity() {
        return university;
    }

    public String getDepartment() {
        return this.department;
    }

    public String getNum() {
        return this.num;
    }

    public String getAge() {
        return this.age;
    }

    public String getEmail() {
        return email;
    }

    public String getSelfintroduce() {
        return selfintroduce;
    }

    public String getXueli() {
        return xueli;
    }

    public void setAge(String age) {
        this.age = age;
    }
/*
    public void setBlob(Blob blob) {
        this.blob = blob;
    }*/

    public int getCounttime() {
        return counttime;
    }

    public void setTime1(String time1) {
        this.time1 = time1;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public void setSelfintroduce(String selfintroduce) {
        this.selfintroduce = selfintroduce;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public void setXueli(String xueli) {
        this.xueli = xueli;
    }

    public void setName(String name) {
        this.name = name;
    }



    /*
    **
    *
     */


    public void setTime(String time) {
        this.time = time;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    public String getLuqu() {
        return luqu;
    }

    public String getMianshiguan() {
        return mianshiguan;
    }


    public void setPingjia(String pingjia) {
        this.pingjia= pingjia;
    }

    public void setLuqu(String luqu) {
        this.luqu = luqu;
    }

    public void setMianshiguan(String mianshiguan) {
        this.mianshiguan = mianshiguan;
    }


   /* public Blob getBlob() {
        return blob;
    }*/
}
