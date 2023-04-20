package com.siku.pojo;

public class qqUser {
           private String user_id;
           private String nickname;
           private String sex;
           private String age;
           private String area;
           private String remark;

    @Override
    public String toString() {
        return "qqUser{" +
                "user_id='" + user_id + '\'' +
                ", nickname='" + nickname + '\'' +
                ", sex='" + sex + '\'' +
                ", age='" + age + '\'' +
                ", area='" + area + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }

    public qqUser() {
    }

    public qqUser(String user_id, String nickname, String sex, String age, String area, String remark) {
        this.user_id = user_id;
        this.nickname = nickname;
        this.sex = sex;
        this.age = age;
        this.area = area;
        this.remark = remark;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
