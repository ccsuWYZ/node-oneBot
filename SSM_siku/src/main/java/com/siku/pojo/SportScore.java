package com.siku.pojo;

/**
 * @author lee
 * @date 2022-11-17 23:40:22
 * @description
 */
public class SportScore {
    private String sno;
    private String sname;
    private String s_scare;
    private String scare;
    private String line;
    private String ty_team;

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getS_scare() {
        return s_scare;
    }

    public void setS_scare(String s_scare) {
        this.s_scare = s_scare;
    }

    public String getScare() {
        return scare;
    }

    public void setScare(String scare) {
        this.scare = scare;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public String getTy_team() {
        return ty_team;
    }

    public void setTy_team(String ty_team) {
        this.ty_team = ty_team;
    }

    public SportScore() {
    }

    public SportScore(String sno, String sname, String s_scare, String scare, String line, String ty_team) {
        this.sno = sno;
        this.sname = sname;
        this.s_scare = s_scare;
        this.scare = scare;
        this.line = line;
        this.ty_team = ty_team;
    }
}
