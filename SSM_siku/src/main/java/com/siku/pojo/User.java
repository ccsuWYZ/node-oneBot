package com.siku.pojo;

public class User {
    private String sno;
    private String nickName;
    private String tel;
    private String pwd;
    private String openId;
    private String qqnumber;
    private String isww;

    public User() {
    }

    public User(String sno, String nickName, String tel, String pwd, String openId, String qqnumber, String isww) {
        this.sno = sno;
        this.nickName = nickName;
        this.tel = tel;
        this.pwd = pwd;
        this.openId = openId;
        this.qqnumber = qqnumber;
        this.isww = isww;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getQqnumber() {
        return qqnumber;
    }

    public void setQqnumber(String qqnumber) {
        this.qqnumber = qqnumber;
    }

    public String getIsww() {
        return isww;
    }

    public void setIsww(String isww) {
        this.isww = isww;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "User{" +
                "sno='" + sno + '\'' +
                ", nickName='" + nickName + '\'' +
                ", tel='" + tel + '\'' +
                ", pwd='" + pwd + '\'' +
                ", openId='" + openId + '\'' +
                ", qqnumber='" + qqnumber + '\'' +
                ", isww='" + isww + '\'' +
                '}';
    }
}
