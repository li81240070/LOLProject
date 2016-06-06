package com.example.dllo.lolproject.tools;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PixelFormat;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;

/**
 * Created by dllo on 16/6/6.
 */
public class RoundDrawable extends ImageView{
    private boolean isround =false;




    public RoundDrawable(Context context) {
        super(context);
    }

    public RoundDrawable(Context context, AttributeSet attrs) {
        super(context, attrs);

        TypedArray   typedArray=context.obtainStyledAttributes(attrs,R.styleable.roundimage);

        isround=typedArray.getBoolean(R.styleable.roundimage_is_round,false);

    }



    public RoundDrawable(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public RoundDrawable(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }
}
