package com.example.dllo.lolproject.Fragment;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dllo.lolproject.Adapters.AdapterForNews;
import com.example.dllo.lolproject.Adapters.AdapterForNewsPicture;
import com.example.dllo.lolproject.Fragment.NewsFragments.GameMatchNewsFragment;
import com.example.dllo.lolproject.Fragment.NewsFragments.HappyNewsFragment;
import com.example.dllo.lolproject.Fragment.NewsFragments.NewNewsFragment;
import com.example.dllo.lolproject.Fragment.NewsFragments.ReportNewsFragment;
import com.example.dllo.lolproject.R;

import java.util.ArrayList;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

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
    private ArrayList<Integer> data;
    //声明驱动图片转动的适配器
    private AdapterForNewsPicture adapterForNewsPicture;
    //声明与轮播图相关的计时器
    private CountDownTimer timer;
    //声明信使
    public android.os.Handler handler;

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


        //实例化pictures的集合
        data = new ArrayList<>();
        data.add(R.mipmap.community1);
        data.add(R.mipmap.community2);
        data.add(R.mipmap.community3);
        data.add(R.mipmap.ic_launcher);


        //想适配器中增加集合
        adapterForNewsPicture = new AdapterForNewsPicture(getContext());

        adapterForNewsPicture.setData(data);

        newsPicturesViewpager.setAdapter(adapterForNewsPicture);







        return view;
    }




}









