package com.siku.pojo;

import java.util.List;
import java.util.Map;

/**
 * @author lee
 * @date 2022-11-24 21:35:44
 * @description
 */
public class TikuDetailFormate {
    private boolean isStore;
    private int isAnswer;
    private int id;
    private String q;
    private String bank_id;
    private String type;
    private String chap;
    private String parse;
    private String diff;
    private List<Map<String,String>> options;
    private String a;

    public TikuDetailFormate() {
    }

    public TikuDetailFormate(boolean isStore, int isAnswer, int id, String q, String bank_id, String type, String chap, String parse, String diff, List<Map<String, String>> options, String a) {
        this.isStore = isStore;
        this.isAnswer = isAnswer;
        this.id = id;
        this.q = q;
        this.bank_id = bank_id;
        this.type = type;
        this.chap = chap;
        this.parse = parse;
        this.diff = diff;
        this.options = options;
        this.a = a;
    }



    public boolean isStore() {
        return isStore;
    }

    public void setStore(boolean store) {
        isStore = store;
    }

    public int getIsAnswer() {
        return isAnswer;
    }

    public void setIsAnswer(int isAnswer) {
        this.isAnswer = isAnswer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQ() {
        return q;
    }

    public void setQ(String q) {
        this.q = q;
    }

    public String getBank_id() {
        return bank_id;
    }

    public void setBank_id(String bank_id) {
        this.bank_id = bank_id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getChap() {
        return chap;
    }

    public void setChap(String chap) {
        this.chap = chap;
    }

    public String getParse() {
        return parse;
    }

    public void setParse(String parse) {
        this.parse = parse;
    }

    public String getDiff() {
        return diff;
    }

    public List<Map<String, String>> getOptions() {
        return options;
    }

    public void setOptions(List<Map<String, String>> options) {
        this.options = options;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public void setDiff(String diff) {
        this.diff = diff;
    }

    @Override
    public String toString() {
        return "TikuDetailFormate{" +
                "isStore=" + isStore +
                ", isAnswer=" + isAnswer +
                ", id=" + id +
                ", q='" + q + '\'' +
                ", bank_id='" + bank_id + '\'' +
                ", type='" + type + '\'' +
                ", chap='" + chap + '\'' +
                ", parse='" + parse + '\'' +
                ", diff='" + diff + '\'' +
                ", options=" + options +
                ", a='" + a + '\'' +
                '}';
    }
}
