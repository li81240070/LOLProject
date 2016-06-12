package com.example.dllo.lolproject.fragments.more12activity;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dllo.lolproject.R;
import com.example.dllo.lolproject.bean.OtherVideoIntentBean;
import com.example.dllo.lolproject.tools.MyAPP;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by dllo on 16/6/12.
 */
public class More12IntentAdapter extends BaseAdapter{

    private Context context;
    private List<More12IntentBean.DataBean> data;


    public More12IntentAdapter(Context context) {
        this.context = context;
    }


    public void setData(List<More12IntentBean.DataBean> data) {
        this.data = data;
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
      return   position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        viewHolder viewHolder1=null;
        if (convertView==null){

            convertView=LayoutInflater.from(context).inflate(R.layout.othervideointentpage,parent,false);
            viewHolder1=new viewHolder(convertView);
            convertView.setTag(viewHolder1);



        }else{

            viewHolder1= (viewHolder) convertView.getTag();


        }


            viewHolder1.imageViewInVideoOther.setVisibility(View.GONE);




        viewHolder1.descInVideoOther.setText(data.get(position).getDesc());
        viewHolder1.titleInVideoOther.setText(data.get(position).getTitle());


        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent();
                intent.putExtra("more12WebId",data.get(position).getItem_id());
                intent.putExtra("more12WebId2",data.get(position).getPublished());
                intent.setClass(context,More12NevolClass.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);


            }
        });

        return  convertView;


    }





    public class viewHolder{


        TextView titleInVideoOther,descInVideoOther;
        ImageView imageViewInVideoOther;

        public  viewHolder(View itemView){

            titleInVideoOther= (TextView) itemView.findViewById(R.id.titleInVideoOther);
            descInVideoOther= (TextView) itemView.findViewById(R.id.descInVideoOther);
            imageViewInVideoOther= (ImageView) itemView.findViewById(R.id.imageViewInVideoOther);


        }



    }

}
