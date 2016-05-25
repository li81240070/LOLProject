package com.example.dllo.lolproject.tools;

import android.widget.ImageView;

/**
 * Created by dllo on 16/5/24.
 */
public class Picasso {

    public void Picasso(String url, ImageView adress){

        com.squareup.picasso.Picasso.with(MyAPP.context).load(url).into(adress);
    }



}
