package com.example.dllo.lolproject.fragments.vediofragments.herolist;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.volley.VolleyError;
import com.example.dllo.lolproject.NetDataAdress;
import com.example.dllo.lolproject.R;
import com.example.dllo.lolproject.adapters.AdapterForWeekFree;
import com.example.dllo.lolproject.bean.AllHeroBean;
import com.example.dllo.lolproject.bean.WeekFreeHeroList;
import com.example.dllo.lolproject.interfaces.HeroList;
import com.example.dllo.lolproject.interfaces.WeekFree;
import com.example.dllo.lolproject.tools.VolleyForHeroList;
import com.example.dllo.lolproject.tools.VolleyForWeekFree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dllo on 16/5/26.
 */
public class WeekFreeFragment extends Fragment{
    private MyRecyclerView thisWeekFreeRecyclerview,nextWeekFreeRecyclerview;
    private AdapterForWeekFree adapter,adapterForNextWeek;




    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.herolistweekfreeforfree,container,false);



        thisWeekFreeRecyclerview= (MyRecyclerView) view.findViewById(R.id.thisWeekFreeRecyclerview);
       // nextWeekFreeRecyclerview= (RecyclerView) view.findViewById(R.id.nextWeekFreeRecyclerview);


        adapter=new AdapterForWeekFree(getContext());
        //adapterForNextWeek=new AdapterForWeekFree(getContext());

        VolleyForHeroList volleyForHeroList=new VolleyForHeroList();
        volleyForHeroList.getrHeroList(NetDataAdress.AllHeroAdress, new HeroList() {
            @Override
            public void onSuccess(AllHeroBean allHeroBean) {

                List<AllHeroBean.DataBean>data=new ArrayList<AllHeroBean.DataBean>();
                List<AllHeroBean.DataBean>dataForNextWeek=new ArrayList<AllHeroBean.DataBean>();


                SharedPreferences getSp=getActivity().getSharedPreferences("WeekFree", Context.MODE_PRIVATE);
                for (int i = 0; i < allHeroBean.getData().size(); i++) {


                    if ((getSp.getString(allHeroBean.getData().get(i).getRole_id(),"默认"))!="默认"){
                        data.add(allHeroBean.getData().get(i));
                    }
                }

//                //下周周免英雄导入
//                for (int i = 0; i < allHeroBean.getData().size(); i++) {
//
//
//                    if ((getSp.getString("next"+allHeroBean.getData().get(i).getRole_id(),"默认"))!="默认"){
//                        dataForNextWeek.add(allHeroBean.getData().get(i));
//                    }
//                }




                adapter.setDatas(data);
               // adapterForNextWeek.setDatas(dataForNextWeek);
                thisWeekFreeRecyclerview.setLayoutManager(new StaggeredGridLayoutManager(4,StaggeredGridLayoutManager.VERTICAL));
                thisWeekFreeRecyclerview.setAdapter(adapter);
               // nextWeekFreeRecyclerview.setLayoutManager(new StaggeredGridLayoutManager(4,StaggeredGridLayoutManager.VERTICAL));
               // nextWeekFreeRecyclerview.setAdapter(adapterForNextWeek);


            }

            @Override
            public void onFailed(VolleyError error) {

            }
        });





        return view;
    }
}
