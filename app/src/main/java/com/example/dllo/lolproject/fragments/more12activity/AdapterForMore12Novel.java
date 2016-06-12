package com.example.dllo.lolproject.fragments.more12activity;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.dllo.lolproject.R;
import com.example.dllo.lolproject.tools.MyAPP;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by dllo on 16/6/2.
 */
public class AdapterForMore12Novel extends BaseAdapter{
    private Context context;
    private List<More12NovelBean.DataBean.CatwordIdBean>data;


    public AdapterForMore12Novel(Context context) {
        this.context = context;
    }

    public void setData(List<More12NovelBean.DataBean.CatwordIdBean> data) {
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


            convertView= LayoutInflater.from(context).inflate(R.layout.more12novellistview,parent,false);

            viewHolder1=new viewHolder(convertView);
            convertView.setTag(viewHolder1);





        }
        else{


            viewHolder1= (viewHolder) convertView.getTag();

        }
        viewHolder1.more12ListViewContent.setText(data.get(position).getDesc());
        viewHolder1.more12ListViewTitle.setText(data.get(position).getName());
        Picasso.with(context).load(data.get(position).getPic_url()).into(viewHolder1.more12ListViewPicture);

        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent();
                intent.putExtra("more12title",data.get(position).getName()+"");
                intent.putExtra("more12desc",data.get(position).getDesc()+"");
                intent.putExtra("more12picurl",data.get(position).getPic_url()+"");
                intent.putExtra("more12id",data.get(position).getId()+"");
                intent.setClass(context,More12Intent.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
            }
        });



        return convertView;




    }




    public class viewHolder{



        ImageView more12ListViewPicture;
        TextView more12ListViewTitle,more12ListViewContent,more12ListViewTime;


        public viewHolder (View itemView){

            more12ListViewPicture= (ImageView) itemView.findViewById(R.id.more12ListViewPicture);
            more12ListViewTitle= (TextView) itemView.findViewById(R.id.more12ListViewTitle);
            more12ListViewContent= (TextView) itemView.findViewById(R.id.more12ListViewContent);
            more12ListViewTime= (TextView) itemView.findViewById(R.id.more12ListViewTime);
        }
    }


}
