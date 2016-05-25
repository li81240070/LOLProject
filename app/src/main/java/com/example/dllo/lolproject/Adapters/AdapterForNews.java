package com.example.dllo.lolproject.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by dllo on 16/5/19.
 */

//新闻页左右滑动适配器
public class AdapterForNews extends FragmentPagerAdapter{
    //声明新闻页内fragment的集合
    private ArrayList fragments;

    //声明fragment的标题
    private String[]titles={"最新","新闻","赛事","娱乐"};



    public AdapterForNews(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return fragments!=null&&fragments.size()>0? (Fragment) fragments.get(position) :null;
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    //载入标题
    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }

    public void setFragments(ArrayList fragments) {
        this.fragments = fragments;
        notifyDataSetChanged();
    }

}
