package com.example.dllo.lolproject.adapters;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.dllo.lolproject.R;
import com.example.dllo.lolproject.bean.NewsPictureBean;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dllo on 16/5/20.
 */
public class AdapterForNewsPicture extends PagerAdapter{

    private List<NewsPictureBean.DataBean>data;
    private Context context;
    private  ImageView imageView;


    public AdapterForNewsPicture(Context context) {
        this.context = context;
    }

    public void setData(List<NewsPictureBean.DataBean> data) {
        this.data = data;
        notifyDataSetChanged();
    }



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

        View view=LayoutInflater.from(context).inflate(R.layout.newsadapterforpicturespage,container,false);
        imageView= (ImageView) view.findViewById(R.id.newsAdapterForPictures);


        Picasso.with(context).load(data.get(position).getPic_ad_url()).into(imageView);


        container.addView(view);

        return view;






    }


    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {

    }
}
