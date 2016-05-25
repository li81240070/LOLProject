package com.example.dllo.lolproject.adapters;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dllo.lolproject.bean.VideoBeanForPic;
import com.example.dllo.lolproject.bean.VideoRecyclerviewBean;
import com.example.dllo.lolproject.R;
import com.squareup.picasso.Picasso;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dllo on 16/5/24.
 */
public class AdapterForVideoRecyclerview extends RecyclerView.Adapter<AdapterForVideoRecyclerview.myViewHolder>{
        private Context context;

    List<VideoBeanForPic.DataBean.CatwordIdBean> data;




    @Override
    public AdapterForVideoRecyclerview.myViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView= LayoutInflater.from(context).inflate(R.layout.recyclerviewforvideopage,parent,false);


        myViewHolder holder=new myViewHolder(itemView);
        return holder;



    }

    @Subscribe
    public void getInternetData(Bitmap bitmap){




    }

    @Override
    public void onBindViewHolder(AdapterForVideoRecyclerview.myViewHolder holder, int position) {



        Picasso.with(context).load(data.get(position).getPic_url()).into(holder.videoPciture);

        holder.videoText.setText(data.get(position).getName());






    }

    @Override
    public int getItemCount() {
        return data!=null?data.size():0;
    }

    public void setData(List<VideoBeanForPic.DataBean.CatwordIdBean> data) {
        this.data = data;
        notifyDataSetChanged();
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



    public AdapterForVideoRecyclerview(Context context) {
        this.context = context;
    }
}
