package com.example.android_week06;

import java.io.Serializable;

public class Shoes implements Serializable {
    private int id;
    private String describe;
    private String name;
    private String showText;
    private int img;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShowText() {
        return showText;
    }

    public void setShowText(String showText) {
        this.showText = showText;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public Shoes(int id, String describe, String name, String showText, int img) {
        this.id = id;
        this.describe = describe;
        this.name = name;
        this.showText = showText;
        this.img = img;
    }
}
