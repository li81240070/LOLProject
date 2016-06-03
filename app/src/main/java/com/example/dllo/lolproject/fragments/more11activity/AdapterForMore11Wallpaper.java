package com.example.dllo.lolproject.fragments.more11activity;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.example.dllo.lolproject.R;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by dllo on 16/6/2.
 */
public class AdapterForMore11Wallpaper extends RecyclerView.Adapter<AdapterForMore11Wallpaper.myViewHolder>{

    private Context context;
    private List<More11WallpaperBean.DataBean>data;


    public AdapterForMore11Wallpaper(Context context) {
        this.context = context;
    }

    public void setData(List<More11WallpaperBean.DataBean> data) {
        this.data = data;
        notifyDataSetChanged();
    }

    @Override
    public myViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView=LayoutInflater.from(context).inflate(R.layout.more11recyclerviewpage,parent,false);

        myViewHolder viewHolder=new myViewHolder(itemView);
        return  viewHolder;


    }

    @Override
    public void onBindViewHolder(myViewHolder holder, int position) {

        Picasso.with(context).load(data.get(position).getPic_thumb_url()).into(holder.more11RecyclerviewPicture);



    }

    @Override
    public int getItemCount() {
        return data!=null&&data.size()>0?data.size():0;
    }

    class myViewHolder extends RecyclerView.ViewHolder{


            ImageView more11RecyclerviewPicture;


            public myViewHolder(View itemView) {
                super(itemView);

                more11RecyclerviewPicture= (ImageView) itemView.findViewById(R.id.more11RecyclerviewPictures);


            }
        }

}
