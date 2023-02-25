package com.siku.pojo;

/**
 * @author lee
 * @date 2022-11-24 15:37:26
 * @description
 */
public class LostFound {
    int id;
    private String sno;
    private String type;
    private  String connect;
    private String img;
    private  String content;
    private String avatar;
    private String nickname;
    private String pubtime;
    private int status;

    public LostFound(int id, String sno, String type, String connect, String img, String content, String avatar, String nickname, String pubtime, int status) {
        this.id = id;
        this.sno = sno;
        this.type = type;
        this.connect = connect;
        this.img = img;
        this.content = content;
        this.avatar = avatar;
        this.nickname = nickname;
        this.pubtime = pubtime;
        this.status = status;
    }

    public LostFound() {
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getConnect() {
        return connect;
    }

    public void setConnect(String connect) {
        this.connect = connect;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPubtime() {
        return pubtime;
    }

    public void setPubtime(String pubtime) {
        this.pubtime = pubtime;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "LostFound{" +
                "id=" + id +
                ", sno='" + sno + '\'' +
                ", type='" + type + '\'' +
                ", connect='" + connect + '\'' +
                ", img='" + img + '\'' +
                ", content='" + content + '\'' +
                ", avatar='" + avatar + '\'' +
                ", nickname='" + nickname + '\'' +
                ", pubtime='" + pubtime + '\'' +
                ", status=" + status +
                '}';
    }
}
