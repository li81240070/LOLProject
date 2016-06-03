package com.example.dllo.lolproject.fragments.more6fors6;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by dllo on 16/6/3.
 */
public class AdapterForMore6Fragment extends FragmentPagerAdapter{

    private ArrayList fragments;
    private String[]title={"凶猛","诡诈","坚决"};





    public void setFragments(ArrayList fragments) {
        this.fragments = fragments;
        notifyDataSetChanged();
    }

    public AdapterForMore6Fragment(FragmentManager fm) {
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


    @Override
    public CharSequence getPageTitle(int position) {
        return title[position];
    }
}
