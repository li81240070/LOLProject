package com.example.dllo.lolproject.adapters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.dllo.lolproject.R;
import com.example.dllo.lolproject.bean.ReallyPeopleShowBean;
import com.example.dllo.lolproject.tools.MyAPP;
import com.example.dllo.lolproject.tools.RoundDrawable;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dllo on 16/5/30.
 */
public class AdapterForReallyPeopleShow extends BaseAdapter{
    private Context context;
    private List<ReallyPeopleShowBean.DataBean> data;


    public void setData(List<ReallyPeopleShowBean.DataBean> data) {
        this.data = data;
    }

    public AdapterForReallyPeopleShow(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return data!=null&&data.size()>0?data.size():0;
    }

    @Override
    public Object getItem(int position) {
        return data!=null&&data.size()>0?data.get(position):0;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        viewHolder viewHolder=null;
        if (convertView==null){


            convertView= LayoutInflater.from(context).inflate(R.layout.reallypeopleshowlistviewpage,parent,false);
            viewHolder=new viewHolder(convertView);
            convertView.setTag(viewHolder);
        }else{

            viewHolder= (AdapterForReallyPeopleShow.viewHolder) convertView.getTag();
        }
        viewHolder.reallyPeopleShowName.setText(data.get(position).getSummoner());
        viewHolder.reallyPeopleShowBB.setText(data.get(position).getDesc());
        viewHolder.reallyPeopleShowTime.setText(data.get(position).getCreated());
        viewHolder.reallyPeopleShowWhereAndWho.setText(data.get(position).getArea()+":"+data.get(position).getNickname());
        Picasso.with(context).load(data.get(position).getPic_url()).into(viewHolder.reallyPeopleShowShowFace);
        Picasso.with(context).load(data.get(position).getAvatar()).transform(new RoundDrawable()).into(viewHolder.reallyPeopleShowLittleFace);
        int a= Integer.parseInt(data.get(position).getSex());

        if (a==1){

            viewHolder.reallyPeopleShowSex.setImageResource(R.mipmap.boy);

        }else{
            viewHolder.reallyPeopleShowSex.setImageResource(R.mipmap.girl);

        }

        return convertView;

    }



    public class viewHolder{

        ImageView reallyPeopleShowLittleFace,reallyPeopleShowShowFace,reallyPeopleShowSex;
        TextView reallyPeopleShowName,reallyPeopleShowTime,reallyPeopleShowWhereAndWho,reallyPeopleShowBB;
        LinearLayout reallyPeopleShowBackground;

        public viewHolder(View itemView){
            reallyPeopleShowShowFace= (ImageView) itemView.findViewById(R.id.reallyPeopleShowShowFace);
            reallyPeopleShowLittleFace= (ImageView) itemView.findViewById(R.id.reallyPeopleShowLittleFace);
            reallyPeopleShowName= (TextView) itemView.findViewById(R.id.reallyPeopleShowName);
            reallyPeopleShowTime= (TextView) itemView.findViewById(R.id.reallyPeopleShowTime);
            reallyPeopleShowWhereAndWho= (TextView) itemView.findViewById(R.id.reallyPeopleShowWhereAndWho);
            reallyPeopleShowBB= (TextView) itemView.findViewById(R.id.reallyPeopleShowBB);
            reallyPeopleShowSex= (ImageView) itemView.findViewById(R.id.reallyPeopleShowSex);




        }


    }


}
