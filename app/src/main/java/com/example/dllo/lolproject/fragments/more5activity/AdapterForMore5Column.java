package com.example.dllo.lolproject.fragments.more5activity;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dllo.lolproject.NetDataAdress;
import com.example.dllo.lolproject.R;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by dllo on 16/6/2.
 */
public class AdapterForMore5Column extends BaseAdapter{

    private Context context;
    private List<More5ColumnBean.DataBean>data;


    public AdapterForMore5Column(Context context) {
        this.context = context;
    }

    public void setData(List<More5ColumnBean.DataBean> data) {
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
            convertView= LayoutInflater.from(context).inflate(R.layout.more5listviewpage,parent,false);



            viewHolder1=new viewHolder(convertView);
            convertView.setTag(viewHolder1);



        }else{


            viewHolder1= (viewHolder) convertView.getTag();

        }
        viewHolder1.more5Title.setText(data.get(position).getName());

        Picasso.with(context).load(data.get(position).getPic_url()).into(viewHolder1.more5Picture);

        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5=new Intent();
                intent5.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent5.putExtra("picData",data.get(position).getPic_url());
                intent5.putExtra("netAdress",data.get(position).getId()+"");
                intent5.setClass(context, More5Intent.class);
             context.startActivity(intent5);
            }
        });

        return convertView;

    }


    public class  viewHolder{

        TextView more5Title;
        ImageView more5Picture;


        public viewHolder(View itemView){

            more5Title= (TextView) itemView.findViewById(R.id.more5Title);
            more5Picture= (ImageView) itemView.findViewById(R.id.more5Picture);



        }



    }

}
