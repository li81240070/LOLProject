package com.example.dllo.lolproject.fragments.more4activity;

import android.content.Context;
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
public class AdapterForMore4BigGod extends BaseAdapter{

    private Context context;
    private List<More4BigGodBean.DataBean>data;


    public AdapterForMore4BigGod(Context context) {
        this.context = context;
    }

    public void setData(List<More4BigGodBean.DataBean> data) {
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
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        viewHolder viewHolder1=null;
        if (convertView==null){


            convertView= LayoutInflater.from(context).inflate(R.layout.more4listviewpage,parent,false);

            viewHolder1=new viewHolder(convertView);
            convertView.setTag(viewHolder1);

        }else{

            viewHolder1= (viewHolder) convertView.getTag();

        }

        int a=position+1;
        String b=a+"";

        viewHolder1.more4ListviewName.setText(data.get(position).getUsername());
        viewHolder1.more4ListviewLevel.setText(data.get(position).getTierQueue());
        viewHolder1.more4ListviewRank.setText(b);
        Picasso.with(context).load(data.get(position).getAvatar_url()).into(viewHolder1.more4ListviewPicture);

        return convertView;





    }







    public class viewHolder{


ImageView more4ListviewPicture;
        TextView more4ListviewRank,more4ListviewName,more4ListviewLevel;


        public viewHolder(View itemView){

            more4ListviewPicture= (ImageView) itemView.findViewById(R.id.more4ListviewPicture);
            more4ListviewRank= (TextView) itemView.findViewById(R.id.more4ListviewRank);
            more4ListviewName= (TextView) itemView.findViewById(R.id.more4ListviewName);
            more4ListviewLevel= (TextView) itemView.findViewById(R.id.more4ListviewLevel);


        }


    }
}
