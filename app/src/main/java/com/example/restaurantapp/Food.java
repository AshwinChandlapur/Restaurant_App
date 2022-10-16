package com.example.restaurantapp;

public class Food {

    private String mImgUrl;
    private String mName;
    private String mPrice;

    public Food() { } // Needed for Firebase

    public Food(String imgUrl, String name, String price) {
        mImgUrl = imgUrl;
        mName = name;
        mPrice = price;
    }

    public String getName() { return mName; }

    public void setName(String name) { mName = name; }

    public String getPrice() { return mPrice; }

    public void setPrice(String price) { mPrice = price; }

    public String getImgUrl() { return mImgUrl; }

    public void setImgUrl(String imgUrl) { mImgUrl = imgUrl; }

}
