package com.example.dllo.lolproject.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by dllo on 16/5/19.
 *
 * 主页面ViewPager的适配器
 */

public class AdapterForMainViewpager extends FragmentPagerAdapter{
    //声明需要显示的fragment集合
    private ArrayList fragments;
    //设置Tablayout的标题栏
    private String[]titles={"资讯","视频","英雄","社区","更多"};




    public AdapterForMainViewpager(FragmentManager fm) {
        super(fm);
    }


    //通过集合下标取得对应的fragment
    @Override
    public Fragment getItem(int position) {
        return fragments!=null&&fragments.size()>0? (Fragment) fragments.get(position) :null;
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    //设置载入标题

    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }


    public ArrayList getFragments() {
        return fragments;
    }


    public void setFragments(ArrayList fragments) {
        this.fragments = fragments;
        //实时刷新
        notifyDataSetChanged();
    }
}
