package POJI;

public class Mianshiguan{
    public String num;
    public String password;
    public String department;
    public String neirong;
    public String name;
    int number;
    public String pass;
    /*
    public Mianshiguan(String m,String password, String department) {
        this.num = m;
        this.password=password;
        this.department=department;
    }*/

    public String getPass() {
        return pass;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getNum() {
        return num;
    }

    public String getDepartment() {
        return department;
    }

    public String getNeirong() {
        return neirong;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setNeirong(String neirong) {
        this.neirong = neirong;
    }
}
