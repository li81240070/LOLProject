package com.example.dllo.lolproject.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;

import com.example.dllo.lolproject.R;

import java.util.ArrayList;

/**
 * Created by dllo on 16/5/19.
 */
public class AdapterForMore extends  RecyclerView.Adapter<myViewHolder>{

    private Context context;
    private ArrayList datas;


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
    public void onBindViewHolder(myViewHolder holder, int position) {


        //添加具体内容
        holder.moreRecyclerView.setText("测试内容");
        ViewGroup.LayoutParams params=holder.moreRecyclerView.getLayoutParams();

        

        params.height=300;        holder.moreRecyclerView.setLayoutParams(params);



    }

    @Override
    public int getItemCount() {
        return datas!=null&&datas.size()>0?datas.size():0;
    }
}

class myViewHolder extends  RecyclerView.ViewHolder{

    TextView moreRecyclerView;
    public myViewHolder(View itemView) {
        super(itemView);
        moreRecyclerView= (TextView) itemView.findViewById(R.id.moreRecyclerView);
    }
}
