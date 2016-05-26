package com.example.dllo.lolproject.adapters;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by dllo on 16/5/26.
 */
public class AdapterForHerolistWeekfree extends FragmentPagerAdapter{
    private ArrayList fragments;
    private String[]titles={"周免","折扣"};
    private Context context;

    public ArrayList getFragments() {
        return fragments;
    }

    public AdapterForHerolistWeekfree(FragmentManager fm) {
        super(fm);
    }

    public void setFragments(ArrayList fragments) {
        this.fragments = fragments;
        notifyDataSetChanged();
    }


    @Override
    public Fragment getItem(int position) {
        return fragments!=null&&fragments.size()>0? (Fragment) fragments.get(position) :null;
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    //写标题


    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }

    public Context getContext() {
        return context;
    }
}
