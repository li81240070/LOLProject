package com.example.dllo.lolproject.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dllo.lolproject.bean.VideoRecyclerviewBean;
import com.example.dllo.lolproject.R;

import java.util.ArrayList;

/**
 * Created by dllo on 16/5/24.
 */
public class AdapterForVideoRecyclerview extends RecyclerView.Adapter<myViewHolder>{
        private Context context;
    private ArrayList<VideoRecyclerviewBean>data;


    public AdapterForVideoRecyclerview(ArrayList<VideoRecyclerviewBean> data) {
        this.data = data;
    }

    @Override
    public com.example.dllo.lolproject.adapters.myViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView= LayoutInflater.from(context).inflate(R.layout.recyclerviewforvideopage,parent,false);

        com.example.dllo.lolproject.adapters.myViewHolder holder=new com.example.dllo.lolproject.adapters.myViewHolder(itemView);
        return holder;



    }

    @Override
    public void onBindViewHolder(com.example.dllo.lolproject.adapters.myViewHolder holder, int position) {


        holder.moreRecyclerView.setImageBitmap(data.get(position).getPicBitmap());
        holder.moreTextView.setText(data.get(position).getName());


    }

    @Override
    public int getItemCount() {
        return data!=null&&data.size()>0?data.size():0;
    }

    class myViewHolder extends RecyclerView.ViewHolder{

            ImageView videoPciture;
            TextView videoText;


          public myViewHolder(View itemView) {
              super(itemView);

              videoPciture= (ImageView) itemView.findViewById(R.id.videoPciture);
              videoText= (TextView) itemView.findViewById(R.id.videoText);
          }
      }

    public void setData(ArrayList<VideoRecyclerviewBean> data) {
        this.data = data;
    }

    public AdapterForVideoRecyclerview(Context context) {
        this.context = context;
    }
}
