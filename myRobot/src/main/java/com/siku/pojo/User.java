package com.siku.pojo;

public class User {
    private String sno;
    private String qqNumber;

    public User(String sno, String qqNumber) {
        this.sno = sno;
        this.qqNumber = qqNumber;
    }

    public User() {
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getQqNumber() {
        return qqNumber;
    }

    public void setQqNumber(String qqNumber) {
        this.qqNumber = qqNumber;
    }

    @Override
    public String toString() {
        return "User{" +
                "sno='" + sno + '\'' +
                ", qqNumber='" + qqNumber + '\'' +
                '}';
    }
}
