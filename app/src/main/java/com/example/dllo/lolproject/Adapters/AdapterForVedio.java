package com.example.dllo.lolproject.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by dllo on 16/5/19.
 */

//视频页面适配器
public class AdapterForVedio extends FragmentPagerAdapter{
    //声明视频页面fragment的集合
    private ArrayList fragments;
    //设置tablayout匹配的按钮显示文字
    private String[]titles={"娱乐","解说","赛事"};


    public AdapterForVedio(FragmentManager fm) {
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

    //配置标题


    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }

    public void setFragments(ArrayList fragments) {
        this.fragments = fragments;
        notifyDataSetChanged();
    }
}
