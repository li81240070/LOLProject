package com.example.dllo.lolproject.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dllo.lolproject.Adapters.AdapterForMore;
import com.example.dllo.lolproject.R;

import java.util.ArrayList;

//更多fragment的主页面

/**
 * Created by dllo on 16/5/19.
 */

//更多页面Fragment

public class MoreFragment extends Fragment{
    //声明网格布局格式
    private RecyclerView moreRecyclerView;
    //声明网格适配器
    private AdapterForMore adapterForMore;
    //声明网格中数据集合
    private ArrayList datas;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.morebiggestpage,null);


        moreRecyclerView= (RecyclerView) view.findViewById(R.id.moreRecyclerView);

        adapterForMore=new AdapterForMore(getActivity());

        //添加数据
        datas=new ArrayList();

        for (int i = 0; i < 14; i++) {
            datas.add("模拟数据"+i);
        }

        adapterForMore.setDatas(datas);
        //设置线性布局管理器
        moreRecyclerView.setLayoutManager(new StaggeredGridLayoutManager(4,StaggeredGridLayoutManager.VERTICAL));

        moreRecyclerView.setAdapter(adapterForMore);




        return view;
    }
}
