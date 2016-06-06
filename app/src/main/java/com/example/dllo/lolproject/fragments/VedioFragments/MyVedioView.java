package com.example.dllo.lolproject.fragments.vediofragments;

import android.content.Context;
import android.content.pm.ActivityInfo;
import android.util.AttributeSet;
import android.widget.VideoView;

/**
 * Created by dllo on 16/6/6.
 */
public class MyVedioView extends VideoView{
    public MyVedioView(Context context) {
        super(context);
    }

    public MyVedioView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyVedioView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public MyVedioView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
       int width =getDefaultSize(0,widthMeasureSpec);
        int height =getDefaultSize(0,heightMeasureSpec);
        setMeasuredDimension(width,height);
    }


}
