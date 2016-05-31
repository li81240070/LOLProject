package com.example.dllo.lolproject.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dllo.lolproject.R;
import com.example.dllo.lolproject.thesecondflor.MoreViewActivity;

import java.util.ArrayList;

/**
 * Created by dllo on 16/5/19.
 */
public class AdapterForMore extends  RecyclerView.Adapter<myViewHolder>{

    private Context context;
    private ArrayList datas;

    //声明图片集合
    private int[]pictures={R.mipmap.more1,R.mipmap.more2,R.mipmap.more3,R.mipmap.more4,R.mipmap.more5,R.mipmap.more6,R.mipmap.more7,R.mipmap.more8,R.mipmap.more9,R.mipmap.more10,R.mipmap.more11,R.mipmap.more12,R.mipmap.more13,R.mipmap.more14};

    //声明more中的模块文字内容
    String []moreTitles={"战绩查询","赛事","英雄榜","大神榜","精彩专栏","S6天赋模拟","符文模拟","召唤师技能","装备查询","铃声","壁纸","小说","商城","娱乐"};


    public AdapterForMore(Context context) {
        this.context = context;
    }

    public void setDatas(ArrayList datas) {
        this.datas = datas;
        notifyDataSetChanged();


    }


    @Override
    public myViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView=LayoutInflater.from(context).inflate(R.layout.morerecyclerviewpage,parent,false);




        myViewHolder holder=new myViewHolder(itemView);
        return holder;
    }

    @Override
    public void onBindViewHolder(myViewHolder holder, final int position) {


        //添加具体内容
        holder.moreTextView.setText(moreTitles[position]);
        final ViewGroup.LayoutParams params=holder.moreTextView.getLayoutParams();

        holder.moreRecyclerView.setImageResource(pictures[position]);





        params.height=100;
        params.width=100;
        holder.moreRecyclerView.setLayoutParams(params);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.putExtra("PassWord",position+"");
                intent.setClass(context, MoreViewActivity.class);
                context.startActivity(intent);
            }
        });




    }

    @Override
    public int getItemCount() {
        return datas!=null&&datas.size()>0?datas.size():0;
    }
}

class myViewHolder extends  RecyclerView.ViewHolder{

    ImageView moreRecyclerView;
    TextView moreTextView;
    public myViewHolder(View itemView) {
        super(itemView);
        moreRecyclerView= (ImageView) itemView.findViewById(R.id.moreRecyclerView);
        moreTextView= (TextView) itemView.findViewById(R.id.moreTextView);
    }
}
