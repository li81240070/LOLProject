package com.example.dllo.lolproject.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
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

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dllo on 16/5/28.
 */
public class AdapterForVideoIntentListview extends BaseAdapter{
    private Context context;
    private List<OtherVideoIntentBean.DataBean> data;


    public void setData(List<OtherVideoIntentBean.DataBean> data) {
        this.data = data;
    }


    public AdapterForVideoIntentListview(Context context) {
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
        return Long.parseLong(data.get(position).getItem_id());
   }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        viewHolder viewholder=null;
        if (convertView==null){

            convertView= LayoutInflater.from(context).inflate(R.layout.othervideointentpage,parent,false);
            viewholder=new viewHolder(convertView);
            convertView.setTag(viewholder);


        }else{

            viewholder= (viewHolder) convertView.getTag();

        }
        Picasso.with(MyAPP.context).load(data.get(position).getPic_url()).into(viewholder.imageViewInVideoOther);
        viewholder.descInVideoOther.setText(data.get(position).getDesc());
        viewholder.titleInVideoOther.setText(data.get(position).getTitle());


        return  convertView;
    }


    public class viewHolder{
        ImageView imageViewInVideoOther;
        TextView titleInVideoOther,descInVideoOther;


        public viewHolder(View itemView){

            imageViewInVideoOther= (ImageView) itemView.findViewById(R.id.imageViewInVideoOther);

            titleInVideoOther= (TextView) itemView.findViewById(R.id.titleInVideoOther  );
            descInVideoOther= (TextView) itemView.findViewById(R.id.descInVideoOther);




        }

    }



}
