package com.example.dllo.lolproject.fragments.more2fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.android.volley.VolleyError;
import com.example.dllo.lolproject.NetDataAdress;
import com.example.dllo.lolproject.R;
import com.example.dllo.lolproject.interfaces.ForMore;
import com.example.dllo.lolproject.lazyman.VolleyForMore;
import com.google.gson.Gson;

import java.util.List;

/**
 * Created by dllo on 16/5/31.
 */
public class More2MatchDate extends Fragment{
    private ListView more2MatchDateListview;
    private AdapterForMore2Match adapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.more2matchdatefragment,container,false);

        more2MatchDateListview= (ListView) view.findViewById(R.id.more2MatchDateListview);

        adapter=new AdapterForMore2Match(getContext());

        VolleyForMore volleyForMore=new VolleyForMore();
        volleyForMore.getDataForMore(NetDataAdress.MatchDateAdress, More2MatchBean.class, new ForMore<More2MatchBean>() {
            @Override
            public void onSuccess(More2MatchBean more2MatchBean) {


                Gson gson=new Gson();
                List<More2MatchBean.DataBean>data=more2MatchBean.getData();

                adapter.setData(data);
                more2MatchDateListview.setAdapter(adapter);


            }

            @Override
            public void onFailed(VolleyError error) {

            }
        });



        return view;



    }
}
