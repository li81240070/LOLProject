package com.example.dllo.lolproject.bean;

import android.widget.ImageView;

/**
 * Created by dllo on 16/6/8.
 */
public class More8SkillsRecyclerviewBean {


    private String name;
    private int picture;

    public More8SkillsRecyclerviewBean(String name, int picture) {
        this.name = name;
        this.picture = picture;
    }

    public More8SkillsRecyclerviewBean() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPicture() {
        return picture;
    }

    public void setPicture(int picture) {
        this.picture = picture;
    }
}
