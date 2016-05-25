package com.example.dllo.lolproject.fragments.newsfragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.android.volley.VolleyError;
import com.example.dllo.lolproject.adapters.AdapterForNewNewsFragment;
import com.example.dllo.lolproject.bean.NewNewsJsonBeans;
import com.example.dllo.lolproject.interfaces.InterfaceForGetNetData;
import com.example.dllo.lolproject.NetDataAdress;
import com.example.dllo.lolproject.R;
import com.example.dllo.lolproject.tools.Volley;

/**
 * Created by dllo on 16/5/19.
 */
public class GameMatchNewsFragment extends Fragment{


    private ListView gamematchNewsListview;
    private AdapterForNewNewsFragment adapter;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.gamematchnewspage,container,false);

        gamematchNewsListview= (ListView) view.findViewById(R.id.gamematchNewsListview);
        adapter=new AdapterForNewNewsFragment(getContext());

        Volley volley=new Volley();
        volley.getNetData(NetDataAdress.GameMatchNewsAdress, new InterfaceForGetNetData() {
            @Override
            public void onSuccess(NewNewsJsonBeans newNewsJsonBeans1) {

                adapter.setData(newNewsJsonBeans1);
                gamematchNewsListview.setAdapter(adapter);

            }

            @Override
            public void onFailed(VolleyError error) {

            }
        });




        return view;
    }
}
