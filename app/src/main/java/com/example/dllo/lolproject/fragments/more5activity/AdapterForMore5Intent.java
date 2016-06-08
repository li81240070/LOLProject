package com.example.dllo.lolproject.fragments.more5activity;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dllo.lolproject.R;
import com.example.dllo.lolproject.bean.morebean.More5IntestingBean;
import com.example.dllo.lolproject.thesecondflor.VideoPlayer;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by dllo on 16/6/2.
 */
public class AdapterForMore5Intent extends BaseAdapter {
    private Context context;
    private List<More5IntestingBean.DataBean>data;


    public AdapterForMore5Intent(Context context) {
        this.context = context;
    }

    public void setData(List<More5IntestingBean.DataBean> data) {
        this.data = data;
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return data != null && data.size() > 0 ? data.size() : 0;
    }

    @Override
    public Object getItem(int position) {
        return data != null && data.size() > 0 ? data.get(position) : 0;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        viewHolder viewHolder1=null;
        if (convertView==null){
            convertView= LayoutInflater.from(context).inflate(R.layout.more5intentlistviewpage,parent,false);

            viewHolder1=new viewHolder(convertView);
            convertView.setTag(viewHolder1);




        }else{

            viewHolder1= (viewHolder) convertView.getTag();

        }
        viewHolder1.more5IntentTitle.setText(data.get(position).getTitle());
        viewHolder1.more5IntentDesc.setText(data.get(position).getDesc());
        if (data.get(position).getPic_url()!=null) {
            Picasso.with(context).load(data.get(position).getPic_url()).into(viewHolder1.more5IntentPicture);
        }else{
            viewHolder1.more5IntentPicture.setVisibility(View.GONE);
        }
        //点击事件
        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent();
                intent.putExtra("VideoPlayerUrl",data.get(position).getVideo_url()+"");
                intent.setClass(context, VideoPlayer.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        context.startActivity(intent);


            }
        });
        return  convertView;



    }



    public class viewHolder{

        TextView more5IntentTitle,more5IntentDesc;
        ImageView more5IntentPicture;


        public viewHolder(View itemView){

            more5IntentTitle= (TextView) itemView.findViewById(R.id.more5IntentTitle);
            more5IntentDesc= (TextView) itemView.findViewById(R.id.more5IntentDesc);
            more5IntentPicture= (ImageView) itemView.findViewById(R.id.more5IntentPicture);
        }


    }


}
