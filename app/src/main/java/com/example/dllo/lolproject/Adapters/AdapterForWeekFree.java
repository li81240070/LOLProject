package com.example.dllo.lolproject.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.volley.VolleyError;
import com.example.dllo.lolproject.NetDataAdress;
import com.example.dllo.lolproject.R;
import com.example.dllo.lolproject.bean.AllHeroBean;
import com.example.dllo.lolproject.bean.NetAdress;
import com.example.dllo.lolproject.bean.WeekFreeHeroList;
import com.example.dllo.lolproject.interfaces.WeekFree;
import com.example.dllo.lolproject.tools.MyAPP;
import com.example.dllo.lolproject.tools.VolleyForWeekFree;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dllo on 16/5/26.
 */
public class AdapterForWeekFree extends RecyclerView.Adapter<AdapterForWeekFree.myViewHolder> {
    private Context context;
     private List<AllHeroBean.DataBean> datas;



    public AdapterForWeekFree(Context context) {
        this.context = context;
    }

    public void setDatas(List datas) {
        this.datas = datas;
        notifyDataSetChanged();
    }

    @Override
    public myViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView= LayoutInflater.from(context).inflate(R.layout.weekfreepage,parent,false);

        myViewHolder viewHolder=new myViewHolder(itemView);



        return viewHolder;
    }

    @Override
    public void onBindViewHolder(myViewHolder holder, int position) {




        Picasso.with(context).load(datas.get(position).getUrl()).into(holder.imageViewWeekFree);
        holder.TextviewWeekFree.setText(datas.get(position).getName());


    }

    @Override
    public int getItemCount() {
        return datas!=null&&datas.size()>0?datas.size():0;
    }

    class myViewHolder extends RecyclerView.ViewHolder {

        private ImageView imageViewWeekFree;
        private TextView TextviewWeekFree,dpsWeekFree,hpWeekFree;

        public myViewHolder(View itemView) {
            super(itemView);

            imageViewWeekFree= (ImageView) itemView.findViewById(R.id.imageViewWeekFree);
            TextviewWeekFree= (TextView) itemView.findViewById(R.id.TextviewWeekFree);

        }
    }
}
