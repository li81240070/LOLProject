package com.example.dllo.lolproject.fragments;

import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.volley.VolleyError;
import com.example.dllo.lolproject.NetDataAdress;
import com.example.dllo.lolproject.adapters.AdapterForNews;
import com.example.dllo.lolproject.adapters.AdapterForNewsPicture;
import com.example.dllo.lolproject.bean.NewsPictureBean;
import com.example.dllo.lolproject.fragments.newsfragments.GameMatchNewsFragment;
import com.example.dllo.lolproject.fragments.newsfragments.HappyNewsFragment;
import com.example.dllo.lolproject.fragments.newsfragments.NewNewsFragment;
import com.example.dllo.lolproject.fragments.newsfragments.ReportNewsFragment;
import com.example.dllo.lolproject.R;
import com.example.dllo.lolproject.interfaces.ForMore;
import com.example.dllo.lolproject.lazyman.VolleyForMore;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dllo on 16/5/19.
 */
public class NewsFragment extends Fragment {
    //声明News中的Tablayout
    private TabLayout tabLayoutForNews;
    //声明newNews中的Viewpager
    private ViewPager newsViewpager, newsPicturesViewpager;
    //声明news转动适配器
    private AdapterForNews adapterForNews;
    //声明新闻下各个fragment的集合
    private ArrayList fragmentArraylist;
    //声明驱动pictures的集合

    //声明驱动图片转动的适配器
    private AdapterForNewsPicture adapterForNewsPicture;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.newsbiggestpage, container, false);


        //绑定页面中的按钮
        tabLayoutForNews = (TabLayout) view.findViewById(R.id.newsTablayout);
        newsViewpager = (ViewPager) view.findViewById(R.id.newsViewpager);
        newsPicturesViewpager = (ViewPager) view.findViewById(R.id.newsPicturesViewpager);
        //实例化适配器
        adapterForNews = new AdapterForNews(getChildFragmentManager());
        adapterForNewsPicture = new AdapterForNewsPicture(getContext());
        //实例化fragment集合
        fragmentArraylist = new ArrayList();

        //向fragment集合中加载fragment实例
        fragmentArraylist.add(new NewNewsFragment());
        fragmentArraylist.add(new ReportNewsFragment());
        fragmentArraylist.add(new GameMatchNewsFragment());
        fragmentArraylist.add(new HappyNewsFragment());
        //向适配器中增加fragment集合
        adapterForNews.setFragments(fragmentArraylist);
        //向viewpager中加入适配器
        newsViewpager.setAdapter(adapterForNews);
        //将tablayout与滑动页面进行绑定
        tabLayoutForNews.setupWithViewPager(newsViewpager);
        int color = getResources().getColor(R.color.mycolor);
        tabLayoutForNews.setTabTextColors(Color.WHITE,color);

        int color2 = getResources().getColor(R.color.seekcolor);
       tabLayoutForNews.setSelectedTabIndicatorColor(color2);




        //实例化pictures的集合

       VolleyForMore volleyForMore=new VolleyForMore();
        volleyForMore.getDataForMore(NetDataAdress.NewsPictureAdress, NewsPictureBean.class, new ForMore<NewsPictureBean>() {
            @Override
            public void onSuccess(NewsPictureBean newsPictureBean) {

                List<NewsPictureBean.DataBean>dataForAdress=newsPictureBean.getData();
                adapterForNewsPicture.setData(dataForAdress);

                newsPicturesViewpager.setAdapter(adapterForNewsPicture);


            }

            @Override
            public void onFailed(VolleyError error) {

            }
        });















        return view;
    }






}









