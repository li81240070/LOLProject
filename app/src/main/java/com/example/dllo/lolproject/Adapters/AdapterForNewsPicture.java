package com.example.dllo.lolproject.Adapters;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.dllo.lolproject.R;

import java.util.ArrayList;

/**
 * Created by dllo on 16/5/20.
 */
public class AdapterForNewsPicture extends PagerAdapter{

    private ArrayList<Integer> data;
    private Context context;
    private ImageView newsAdapterForPicture;




    @Override
    public int getCount() {
        return data!=null&&data.size()>0?data.size():0;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

       View view= LayoutInflater.from(context).inflate(R.layout.newsadapterforpicturespage,container,false);

        newsAdapterForPicture= (ImageView) view.findViewById(R.id.newsAdapterForPictures);

        newsAdapterForPicture.setImageResource(data.get(position));
        container.addView(view);

        return view;
    }

    public AdapterForNewsPicture(ArrayList<Integer> data, Context context) {
        this.data = data;
        this.context = context;
    }

    public void setData(ArrayList<Integer> data) {
        this.data = data;

    }

    public AdapterForNewsPicture(Context context) {
        this.context = context;
    }

    public void setNewsAdapterForPicture(ImageView newsAdapterForPicture) {
        this.newsAdapterForPicture = newsAdapterForPicture;
    }






    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {



    }
}
