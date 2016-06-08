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
import com.example.dllo.lolproject.bean.NetAdress;
import com.example.dllo.lolproject.bean.morebean.More5IntestingBean;
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

        Intent intent = getIntent();
        final String a = intent.getStringExtra("picData");

       String id=intent.getStringExtra("netAdress");

        String netAdress="http://lol.zhangyoubao.com/apis/rest/TopicsService/items?topicid="+id+"&page=1&i_=04%3Ae6%3A76%3A88%3A95%3A96&t_=1465356535023&p_=17414&v_=400801&a_=lol&pkg_=com.anzogame.lol&d_=android&osv_=21&cha=360Martket&u_=23372828&modle_=N1&%20HTTP/1.1";


        more5IntentListView = (ListView) findViewById(R.id.more5IntentListView);
        adapter = new AdapterForMore5Intent(getBaseContext());

        VolleyForMore volleyForMore = new VolleyForMore();

        volleyForMore.getDataForMore(netAdress, More5IntestingBean.class, new ForMore<More5IntestingBean>() {
            @Override
            public void onSuccess(More5IntestingBean more5IntestingBean) {

                List<More5IntestingBean.DataBean>data=more5IntestingBean.getData();


                adapter.setData(data);

                more5IntentListView.setAdapter(adapter);

                View view= LayoutInflater.from(MyAPP.context).inflate(R.layout.headlistviewpicture,null);
                headListViewPicture= (ImageView) view.findViewById(R.id.headListViewPicture);
                Picasso.with(MyAPP.context).load(a).into(headListViewPicture);
                more5IntentListView.addHeaderView(view);


            }

            @Override
            public void onFailed(VolleyError error) {

            }
        });
    }}