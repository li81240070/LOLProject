package com.example.dllo.lolproject.lazyman;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by dllo on 16/5/31.
 */
public class AdapterForMoreFragment extends FragmentPagerAdapter{

    private  ArrayList fragments;
    private  String[]titles={"赛程","要闻"};




    public AdapterForMoreFragment(FragmentManager fm) {
        super(fm);
    }


    public void setFragments(ArrayList fragments) {
        this.fragments = fragments;
    }

    @Override
    public Fragment getItem(int position) {
        return fragments!=null&&fragments.size()>0? (Fragment) fragments.get(position) :null;
    }

    @Override
    public int getCount() {
        return fragments.size();
    }


    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }
}
