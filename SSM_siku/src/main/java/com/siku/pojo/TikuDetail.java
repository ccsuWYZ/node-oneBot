package com.siku.pojo;


import lombok.Data;

@Data
public class TikuDetail {

    private int detail_id;
    private String bank_id;
    private String title;
    private String type;
    private String chapter;
    private String question_parse;
    private String question_difficulty;
    private String answer_A;
    private String answer_B;
    private String answer_C;
    private String answer_D;
    private String answer_E;
    private String answer_F;
    private String answer_G;
    private String answer_H;
    private String right_answer;

    public TikuDetail(int detail_id, String bank_id, String title, String type, String chapter, String question_parse, String question_difficulty, String answer_A, String answer_B, String answer_C, String answer_D, String answer_E, String answer_F, String answer_G, String answer_H, String right_answer) {
        this.detail_id = detail_id;
        this.bank_id = bank_id;
        this.title = title;
        this.type = type;
        this.chapter = chapter;
        this.question_parse = question_parse;
        this.question_difficulty = question_difficulty;
        this.answer_A = answer_A;
        this.answer_B = answer_B;
        this.answer_C = answer_C;
        this.answer_D = answer_D;
        this.answer_E = answer_E;
        this.answer_F = answer_F;
        this.answer_G = answer_G;
        this.answer_H = answer_H;
        this.right_answer = right_answer;
    }

    public TikuDetail() {
    }

    public int getDetail_id() {
        return detail_id;
    }

    public void setDetail_id(int detail_id) {
        this.detail_id = detail_id;
    }

    public String getBank_id() {
        return bank_id;
    }

    public void setBank_id(String bank_id) {
        this.bank_id = bank_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getChapter() {
        return chapter;
    }

    public void setChapter(String chapter) {
        this.chapter = chapter;
    }

    public String getQuestion_parse() {
        return question_parse;
    }

    public void setQuestion_parse(String question_parse) {
        this.question_parse = question_parse;
    }

    public String getQuestion_difficulty() {
        return question_difficulty;
    }

    public void setQuestion_difficulty(String question_difficulty) {
        this.question_difficulty = question_difficulty;
    }

    public String getAnswer_A() {
        return answer_A;
    }

    public void setAnswer_A(String answer_A) {
        this.answer_A = answer_A;
    }

    public String getAnswer_B() {
        return answer_B;
    }

    public void setAnswer_B(String answer_B) {
        this.answer_B = answer_B;
    }

    public String getAnswer_C() {
        return answer_C;
    }

    public void setAnswer_C(String answer_C) {
        this.answer_C = answer_C;
    }

    public String getAnswer_D() {
        return answer_D;
    }

    public void setAnswer_D(String answer_D) {
        this.answer_D = answer_D;
    }

    public String getAnswer_E() {
        return answer_E;
    }

    public void setAnswer_E(String answer_E) {
        this.answer_E = answer_E;
    }

    public String getAnswer_F() {
        return answer_F;
    }

    public void setAnswer_F(String answer_F) {
        this.answer_F = answer_F;
    }

    public String getAnswer_G() {
        return answer_G;
    }

    public void setAnswer_G(String answer_G) {
        this.answer_G = answer_G;
    }

    public String getAnswer_H() {
        return answer_H;
    }

    public void setAnswer_H(String answer_H) {
        this.answer_H = answer_H;
    }

    public String getRight_answer() {
        return right_answer;
    }

    public void setRight_answer(String right_answer) {
        this.right_answer = right_answer;
    }

    @Override
    public String toString() {
        return "TikuDetail{" +
                "detail_id=" + detail_id +
                ", bank_id='" + bank_id + '\'' +
                ", title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", chapter='" + chapter + '\'' +
                ", question_parse='" + question_parse + '\'' +
                ", question_difficulty='" + question_difficulty + '\'' +
                ", answer_A='" + answer_A + '\'' +
                ", answer_B='" + answer_B + '\'' +
                ", answer_C='" + answer_C + '\'' +
                ", answer_D='" + answer_D + '\'' +
                ", answer_E='" + answer_E + '\'' +
                ", answer_F='" + answer_F + '\'' +
                ", answer_G='" + answer_G + '\'' +
                ", answer_H='" + answer_H + '\'' +
                ", right_answer='" + right_answer + '\'' +
                '}';
    }

    public String whichAnswer(String which){
        switch (which){
            case "A":return answer_A;
            case "B":return answer_B;
            case "C":return answer_C;
            case "D":return answer_D;
            case "E":return answer_E;
            case "F":return answer_F;
            default:return "";

        }

    }
}
