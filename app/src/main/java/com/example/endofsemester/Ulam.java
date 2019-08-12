package com.example.endofsemester;

import android.widget.ImageView;
import android.widget.TextView;

public class Ulam {
 private int price;
 private int muzmanim;
 private String city;
 private  int image;




    public Ulam(int price, int muzmanim, String city, int image) {
        this.price = price;
        this.muzmanim = muzmanim;
        this.city = city;
        this.image = image;


    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getMuzmanim() {
        return muzmanim;
    }

    public void setMuzmanim(int muzmanim) {
        this.muzmanim = muzmanim;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }




}
