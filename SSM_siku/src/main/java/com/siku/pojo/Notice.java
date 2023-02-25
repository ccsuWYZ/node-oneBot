package com.siku.pojo;

/**
 * @author lee
 * @date 2022-11-24 14:11:53
 * @description
 */
public class Notice {
    private String text;
    private String color;
    private String backgroundColor;

    public Notice(String text, String color, String backgroundColor) {
        this.text = text;
        this.color = color;
        this.backgroundColor = backgroundColor;
    }

    public Notice() {
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }


}
