package com.example.dllo.lolproject.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by dllo on 16/5/19.
 */
//英雄列表的适配器
public class AdapterForHerolist extends FragmentPagerAdapter{
    //声明fragment的集合
    private ArrayList fragments;
    //设置标题显示的内容
    private String[]titles={"周免/折扣","我的英雄","全部英雄"};







    public AdapterForHerolist(FragmentManager fm) {
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

    //设置标题


    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }


    public void setFragments(ArrayList fragments) {
        this.fragments = fragments;
        notifyDataSetChanged();
    }
}
