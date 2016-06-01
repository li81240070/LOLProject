package com.example.dllo.lolproject.fragments.more2fragment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.android.volley.VolleyError;
import com.example.dllo.lolproject.NetDataAdress;
import com.example.dllo.lolproject.R;
import com.example.dllo.lolproject.interfaces.ForMore;
import com.example.dllo.lolproject.lazyman.VolleyForMore;
import com.example.dllo.lolproject.tools.MyAPP;

import java.util.List;

/**
 * Created by dllo on 16/6/1.
 */
public class AdapterForMore2Match extends BaseAdapter {

    private Context context;
    private List<More2MatchBean.DataBean> data;
    private AdapterForMore2MatchListview adapter;






    public AdapterForMore2Match(Context context) {
        this.context = context;
    }

    public void setData(List<More2MatchBean.DataBean> data) {
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


            convertView= LayoutInflater.from(context).inflate(R.layout.sonmore2listview,parent,false);
            viewHolder1=new viewHolder(convertView);
            convertView.setTag(viewHolder1);


        }else{


            viewHolder1= (viewHolder) convertView.getTag();

        }
        viewHolder1.sonMore2Date.setText(data.get(position).getTitle());
        adapter=new AdapterForMore2MatchListview(MyAPP.context);
        VolleyForMore volleyForMore=new VolleyForMore();


        final viewHolder finalViewHolder = viewHolder1;
        volleyForMore.getDataForMore(NetDataAdress.MatchDateAdress, More2MatchBean.class, new ForMore<More2MatchBean>() {
            @Override
            public void onSuccess(More2MatchBean more2MatchBean) {


                List<More2MatchBean.DataBean.MatchBean>data1=more2MatchBean.getData().get(position).getMatch();
                adapter.setData(data1);

                finalViewHolder.sonMore2Listview.setAdapter(adapter);





            }

            @Override
            public void onFailed(VolleyError error) {

            }
        });
        return convertView;






    }


    public class viewHolder {

        TextView sonMore2Date;
        ListView sonMore2Listview;


        public viewHolder(View itemView){
            sonMore2Date= (TextView) itemView.findViewById(R.id.sonMore2Date);
            sonMore2Listview= (ListView) itemView.findViewById(R.id.sonMore2Listview);


        }


    }
}