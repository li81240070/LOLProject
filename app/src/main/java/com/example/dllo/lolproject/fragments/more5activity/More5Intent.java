package com.example.dllo.lolproject.fragments.more5activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

import com.android.volley.VolleyError;
import com.example.dllo.lolproject.NetDataAdress;
import com.example.dllo.lolproject.R;
import com.example.dllo.lolproject.interfaces.ForMore;
import com.example.dllo.lolproject.lazyman.VolleyForMore;
import com.example.dllo.lolproject.tools.MyAPP;
import com.example.dllo.lolproject.tools.Volley;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by dllo on 16/6/2.
 */
public class More5Intent extends Activity{
    private ListView more5IntentListView;
    private AdapterForMore5Intent adapter;
    private ImageView headListViewPicture;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.more5intent);

        Intent intent=getIntent();
        final String a=intent.getStringExtra("more5");

       final int b=Integer.parseInt(a);

        more5IntentListView= (ListView) findViewById(R.id.more5IntentListView);
        adapter=new AdapterForMore5Intent(getBaseContext());

        VolleyForMore volleyForMore=new VolleyForMore();
        volleyForMore.getDataForMore(NetDataAdress.ColumnAdress, More5ColumnBean.class, new ForMore<More5ColumnBean>() {
            @Override
            public void onSuccess(More5ColumnBean more5ColumnBean) {

                List<More5ColumnBean.DataBean.ItemsBean>data=more5ColumnBean.getData().get(b).getItems();
                adapter.setData(data);

                more5IntentListView.setAdapter(adapter);

                View view= LayoutInflater.from(MyAPP.context).inflate(R.layout.headlistviewpicture,null);
                headListViewPicture= (ImageView) view.findViewById(R.id.headListViewPicture);
                Picasso.with(MyAPP.context).load(more5ColumnBean.getData().get(b).getPic_url()).into(headListViewPicture);
                more5IntentListView.addHeaderView(view);




            }

            @Override
            public void onFailed(VolleyError error) {

            }
        });






    }
}
