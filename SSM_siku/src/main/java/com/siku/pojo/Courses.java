package com.siku.pojo;


import lombok.Data;

@Data
public class Courses {

    private String sno;
    private String tec;
    private String sub;
    private String addr;
    private String date;
    private String odate;
    private String weekday;
    private String startime;
    private String endtime;
    private String go_year;
    private String go_month;

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getTec() {
        return tec;
    }

    public void setTec(String tec) {
        this.tec = tec;
    }

    public String getSub() {
        return sub;
    }

    public void setSub(String sub) {
        this.sub = sub;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
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

    public String getWeekday() {
        return weekday;
    }

    public void setWeekday(String weekday) {
        this.weekday = weekday;
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

    public String getGo_year() {
        return go_year;
    }

    public void setGo_year(String go_year) {
        this.go_year = go_year;
    }

    public String getGo_month() {
        return go_month;
    }

    public void setGo_month(String go_month) {
        this.go_month = go_month;
    }

    public Courses() {
    }

    public Courses(String sno, String tec, String sub, String addr, String date, String odate, String weekday, String startime, String endtime, String go_year, String go_month) {
        this.sno = sno;
        this.tec = tec;
        this.sub = sub;
        this.addr = addr;
        this.date = date;
        this.odate = odate;
        this.weekday = weekday;
        this.startime = startime;
        this.endtime = endtime;
        this.go_year = go_year;
        this.go_month = go_month;
    }

    @Override
    public String toString() {
        return "Courses{" +
                "sno='" + sno + '\'' +
                ", tec='" + tec + '\'' +
                ", sub='" + sub + '\'' +
                ", addr='" + addr + '\'' +
                ", date='" + date + '\'' +
                ", odate='" + odate + '\'' +
                ", weekday='" + weekday + '\'' +
                ", startime='" + startime + '\'' +
                ", endtime='" + endtime + '\'' +
                ", go_year='" + go_year + '\'' +
                ", go_month='" + go_month + '\'' +
                '}';
    }
}
