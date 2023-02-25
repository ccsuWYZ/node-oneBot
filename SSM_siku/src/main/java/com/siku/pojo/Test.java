package com.siku.pojo;


import lombok.Data;

@Data
public class Test {

    private String sno;
    private String cname;
    private String date_test;
    private String address;
    private String seat;

    public Test() {
    }

    public Test(String sno, String cname, String date_test, String address, String seat) {
        this.sno = sno;
        this.cname = cname;
        this.date_test = date_test;
        this.address = address;
        this.seat = seat;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getDate_test() {
        return date_test;
    }

    public void setDate_test(String date_test) {
        this.date_test = date_test;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }
}
