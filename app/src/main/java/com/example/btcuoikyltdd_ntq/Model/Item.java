package com.example.btcuoikyltdd_ntq.Model;
public class Item {
    private int imageResId;
    private String title;

    public Item(int imageResId, String title, String price) {
        this.imageResId = imageResId;
        this.title = title;
    }

    public int getImageResId() {
        return imageResId;
    }

    public void setImageResId(int imageResId) {
        this.imageResId = imageResId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}