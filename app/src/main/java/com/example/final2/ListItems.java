package com.example.final2;

public class ListItems {

    String name;
    String text;
    String time;
    int image;

    public ListItems(String name, String time, int image, String text) {
        this.name = name;
        this.time = time;
        this.image = image;
        this.text = text;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void settime(String name) {
        this.time = name;
    }

    public void setImage(int name) {
        this.image = name;
    }

    public String getName() {
        return name;
    }

    public String gettime() {
        return time;
    }

    public int getImage() {
        return image;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
