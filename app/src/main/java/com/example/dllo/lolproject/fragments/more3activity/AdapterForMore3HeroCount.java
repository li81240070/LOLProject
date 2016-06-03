package com.example.dllo.lolproject.fragments.more3activity;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dllo.lolproject.R;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by dllo on 16/6/2.
 */
public class AdapterForMore3HeroCount extends BaseAdapter{

    private Context context;
    private List<More3HeroCountBean.DataBean>data;


    public AdapterForMore3HeroCount(Context context) {
        this.context = context;
    }

    public void setData(List<More3HeroCountBean.DataBean> data) {
        this.data = data;
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

        viewHolder viewHolder1=null;
        if (convertView==null){


            convertView= LayoutInflater.from(context).inflate(R.layout.more3listviewpage,parent,false);

            viewHolder1=new viewHolder(convertView);
            convertView.setTag(viewHolder1);

        }else{


            viewHolder1= (viewHolder) convertView.getTag();

        }

     Integer a= position+1;
       String b= a.toString();


        Picasso.with(context).load(data.get(position).getUrl()).into(viewHolder1.more3HandPicture);
        viewHolder1.more3HeroName.setText(data.get(position).getName());
        viewHolder1.more3Rank.setText(b);
        viewHolder1.more3LoadNum.setText(data.get(position).getDebut());
        viewHolder1.more3VictoryNum.setText(data.get(position).getWin());


        return convertView;





    }

    public class viewHolder{

        ImageView more3HandPicture;
        TextView more3Rank,more3HeroName,more3LoadPicture,more3VictoryPicture,
                more3LoadNum,more3VictoryNum;


        public  viewHolder (View itemView){
            more3HandPicture= (ImageView) itemView.findViewById(R.id.more3HandPicture);
            more3Rank= (TextView) itemView.findViewById(R.id.more3Rank);
            more3HeroName= (TextView) itemView.findViewById(R.id.more3HeroName);
            more3LoadPicture= (TextView) itemView.findViewById(R.id.more3LoadPicture);
            more3VictoryPicture= (TextView) itemView.findViewById(R.id.more3VictoryPicture);
            more3LoadNum= (TextView) itemView.findViewById(R.id.more3LoadNum);
            more3VictoryNum= (TextView) itemView.findViewById(R.id.more3VictoryNum);



        }


    }


}
