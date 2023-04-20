package com.siku.pojo;

public class Course {
    private String tname;
    private String cname;
    private String address;
    private String date;
    private String odate;
    private String startime;
    private String endtime;

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getOdate() {
        return odate;
    }

    public void setOdate(String odate) {
        this.odate = odate;
    }

    public String getStartime() {
        return startime;
    }

    public void setStartime(String startime) {
        this.startime = startime;
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }


    public Course(String tname, String cname, String address, String date, String odate, String startime, String endtime) {
        this.tname = tname;
        this.cname = cname;
        this.address = address;
        this.date = date;
        this.odate = odate;
        this.startime = startime;
        this.endtime = endtime;
    }

    public Course() {
    }

    @Override
    public String toString() {
        return "Course{" +
                "tname='" + tname + '\'' +
                ", cname='" + cname + '\'' +
                ", address='" + address + '\'' +
                ", date='" + date + '\'' +
                ", odate='" + odate + '\'' +
                ", startime='" + startime + '\'' +
                ", endtime='" + endtime + '\'' +
                '}';
    }
}
