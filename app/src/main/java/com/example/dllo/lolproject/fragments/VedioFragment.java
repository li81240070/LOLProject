package com.example.dllo.lolproject.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dllo.lolproject.adapters.AdapterForVedio;
import com.example.dllo.lolproject.fragments.vediofragments.CommentateVedioFragment;
import com.example.dllo.lolproject.fragments.vediofragments.GamematchVedioFragment;
import com.example.dllo.lolproject.fragments.vediofragments.HappyVedioFragment;
import com.example.dllo.lolproject.R;

import java.util.ArrayList;

/**
 * Created by dllo on 16/5/19.
 */

//视频主页面
public class VedioFragment extends Fragment{
    //声明视频页面中的tablayout
    private TabLayout vedioTablayout;
    //声明视频页面的viewpager
    private ViewPager vedioViewpager;
    //声明视频页面的适配器
    private AdapterForVedio adapterForVedio;
    //声明视频页面fragment的集合
    private ArrayList fragmentArraylist;




    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.vediobiggestpage,container,false);
        //绑定视频页面的各个组件
        vedioTablayout= (TabLayout) view.findViewById(R.id.vedioTablayout);
        vedioViewpager= (ViewPager) view.findViewById(R.id.vedioViewpager);

        //实例化适配器
        adapterForVedio=new AdapterForVedio(getChildFragmentManager());
        //实例化fragment集合
        fragmentArraylist=new ArrayList();
        fragmentArraylist.add(new HappyVedioFragment());

        fragmentArraylist.add(new GamematchVedioFragment());
        fragmentArraylist.add(new CommentateVedioFragment());

        //向适配器中加入fragment集合
        adapterForVedio.setFragments(fragmentArraylist);
        //向viewpager中指定适配器
        vedioViewpager.setAdapter(adapterForVedio);
        //将tabalayout与viewpager进行绑定
        vedioTablayout.setupWithViewPager(vedioViewpager);





        return view;
    }
}
