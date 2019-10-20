package com.example.endofsemester;

import android.widget.ImageView;
import android.widget.TextView;

public class Ulam {
 private int price;
 private int muzmanim;
 private String city;
 private  int image;
 private String link;




    public Ulam(int price, int muzmanim, String city, int image,String link) {
        this.price = price;
        this.muzmanim = muzmanim;
        this.city = city;
        this.image = image;
        this.link=link;

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

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
