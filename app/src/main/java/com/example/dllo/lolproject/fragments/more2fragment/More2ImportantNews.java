package com.example.dllo.lolproject.fragments.more2fragment;

import android.media.midi.MidiInputPort;
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
public class More2ImportantNews extends Fragment{
    private ListView importantNewsListview;
    private AdapterForImportantNews adapter;



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.more2importantnewsfragment,container,false);

        importantNewsListview= (ListView) view.findViewById(R.id.importantNewsListview);
        adapter=new AdapterForImportantNews(getContext());

        VolleyForMore volleyForMore=new VolleyForMore();
        volleyForMore.getDataForMore(NetDataAdress.ImportantNewsAdress, ImportantNewsBean.class, new ForMore<ImportantNewsBean>() {
            @Override
            public void onSuccess(ImportantNewsBean importantNewsBean) {

                Gson gson=new Gson();
                List<ImportantNewsBean.DataBean>data=importantNewsBean.getData();

                adapter.setData(data);
                importantNewsListview.setAdapter(adapter);


            }

            @Override
            public void onFailed(VolleyError error) {

            }
        });





        return view;
    }
}
