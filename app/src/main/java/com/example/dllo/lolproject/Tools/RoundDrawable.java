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

import com.example.dllo.lolproject.R;
import com.squareup.picasso.Transformation;

/**
 * Created by dllo on 16/6/6.
 */
public class RoundDrawable implements Transformation {
    @Override
    public Bitmap transform(Bitmap source) {
        //获取最小边长
        int size = Math.min(source.getWidth(),source.getHeight());

        //获取圆形图片的宽度和高度
        int x = (source.getWidth()-size) / 2;
        int y = (source.getHeight()-size) / 2;


        //创建一个正方形区域的Bitmap
        Bitmap squaredBitmap = Bitmap.createBitmap(source,x,y,size,size);

        if (squaredBitmap != source){
            //回收source
            source.recycle();
        }

        //创建一张可以操作的正方形图片位置
        Bitmap bitmap = Bitmap.createBitmap(size,size,source.getConfig());

        //创建一个画布
        Canvas canvas = new Canvas(bitmap);
        //创建画笔
        Paint paint = new Paint();

        BitmapShader shader = new BitmapShader(squaredBitmap,BitmapShader.TileMode.CLAMP,
                BitmapShader.TileMode.CLAMP);
        paint.setShader(shader);//设置着色器
        paint.setAntiAlias(true);//开启抗锯齿

        //圆的半径
        float r = size / 2;

        canvas.drawCircle(r,r,r,paint);
        squaredBitmap.recycle();

        return bitmap;
    }

    @Override
    public String key() {
        return "circle";
    }
}
