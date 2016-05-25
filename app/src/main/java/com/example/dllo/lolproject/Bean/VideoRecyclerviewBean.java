package com.example.dllo.lolproject.bean;

import android.graphics.Bitmap;
import android.widget.ImageView;

/**
 * Created by dllo on 16/5/24.
 */
public class VideoRecyclerviewBean {

    Bitmap picBitmap;
    String name;






    public VideoRecyclerviewBean(Bitmap picBitmap, String name) {
        this.picBitmap = picBitmap;
        this.name = name;
    }

    public VideoRecyclerviewBean() {
    }

    public Bitmap getPicBitmap() {
        return picBitmap;
    }

    public void setPicBitmap(Bitmap picBitmap) {
        this.picBitmap = picBitmap;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
