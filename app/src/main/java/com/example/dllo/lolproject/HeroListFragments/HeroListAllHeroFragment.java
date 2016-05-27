package com.example.dllo.lolproject.heroListfragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.volley.VolleyError;
import com.example.dllo.lolproject.NetDataAdress;
import com.example.dllo.lolproject.R;
import com.example.dllo.lolproject.adapters.AdapterForWeekFree;
import com.example.dllo.lolproject.bean.AllHeroBean;
import com.example.dllo.lolproject.interfaces.HeroList;
import com.example.dllo.lolproject.tools.VolleyForHeroList;

import java.util.List;

/**
 * Created by dllo on 16/5/19.
 */
public class HeroListAllHeroFragment extends Fragment{

    private RecyclerView allHeroListRecyclerview;
    private AdapterForWeekFree adapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.herolistallheropage,container,false);
        allHeroListRecyclerview= (RecyclerView) view.findViewById(R.id.allHeroListRecyclerview);
        adapter=new AdapterForWeekFree(getContext());

        VolleyForHeroList volleyForHeroList=new VolleyForHeroList();
        volleyForHeroList.getrHeroList(NetDataAdress.AllHeroAdress, new HeroList() {
            @Override
            public void onSuccess(AllHeroBean allHeroBean) {
                List<AllHeroBean.DataBean>data=allHeroBean.getData();
                adapter.setDatas(data);
                allHeroListRecyclerview.setLayoutManager(new StaggeredGridLayoutManager(4,StaggeredGridLayoutManager.VERTICAL));
                allHeroListRecyclerview.setAdapter(adapter);
            }

            @Override
            public void onFailed(VolleyError error) {

            }
        });



        return view;
    }
}
