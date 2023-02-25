package com.siku.pojo;

public class SelfCountDown {
    private String countDownName;
    private String endTime;
    private String  sno;

    private String countDownId;

    public SelfCountDown(String countDownName, String endTime, String sno, String countDownId) {
        this.countDownName = countDownName;
        this.endTime = endTime;
        this.sno = sno;
        this.countDownId = countDownId;
    }

    public SelfCountDown(String countDownName, String endTime, String sno) {
        this.countDownName = countDownName;
        this.endTime = endTime;
        this.sno = sno;
    }

    public SelfCountDown() {
    }

    public String getCountDownName() {
        return countDownName;
    }

    public void setCountDownName(String countDownName) {
        this.countDownName = countDownName;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String sno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getCountDownId() {
        return countDownId;
    }

    public void setCountDownId(String countDownId) {
        this.countDownId = countDownId;
    }

    public String getSno() {
        return sno;
    }

    @Override
    public String toString() {
        return "SelfCountDown{" +
                "countDownName='" + countDownName + '\'' +
                ", endTime='" + endTime + '\'' +
                ", sno='" + sno + '\'' +
                ", countDownId='" + countDownId + '\'' +
                '}';
    }
}
