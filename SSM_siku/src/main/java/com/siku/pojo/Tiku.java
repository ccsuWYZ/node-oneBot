package com.siku.pojo;

import lombok.Data;

import java.sql.Timestamp;


@Data
public class Tiku {

    private String bank_id;
    private String bank_title;
    private int count;
    private String owner;
    private Timestamp create_time;

    public String getBank_id() {
        return bank_id;
    }

    public void setBank_id(String bank_id) {
        this.bank_id = bank_id;
    }

    public String getBank_title() {
        return bank_title;
    }

    public void setBank_title(String bank_title) {
        this.bank_title = bank_title;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Timestamp getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Timestamp create_time) {
        this.create_time = create_time;
    }

    public Tiku() {
    }

    public Tiku(String bank_id, String bank_title, int count, String owner, Timestamp create_time) {
        this.bank_id = bank_id;
        this.bank_title = bank_title;
        this.count = count;
        this.owner = owner;
        this.create_time = create_time;
    }
}
