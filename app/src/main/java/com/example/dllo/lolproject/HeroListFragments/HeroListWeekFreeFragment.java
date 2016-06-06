package com.example.dllo.lolproject.heroListfragments;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dllo.lolproject.R;
import com.example.dllo.lolproject.adapters.AdapterForHerolistWeekfree;
import com.example.dllo.lolproject.fragments.vediofragments.herolist.DiscountFragment;
import com.example.dllo.lolproject.fragments.vediofragments.herolist.WeekFreeFragment;

import java.util.ArrayList;

/**
 * Created by dllo on 16/5/19.
 */
public class HeroListWeekFreeFragment extends Fragment{

    private TabLayout herolistWeekfreeForTablayout;
    private ViewPager herolistWeekfreeForViewpager;
    private AdapterForHerolistWeekfree adapter;
    private ArrayList fragmentArrayList;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.herolistweekfreepage,container,false);

        herolistWeekfreeForTablayout= (TabLayout) view.findViewById(R.id.herolistWeekfreeForTablayout);
        herolistWeekfreeForViewpager= (ViewPager) view.findViewById(R.id.herolistWeekfreeForViewpager);

        adapter=new AdapterForHerolistWeekfree(getChildFragmentManager());

        fragmentArrayList=new ArrayList();


        fragmentArrayList.add(new WeekFreeFragment());
        fragmentArrayList.add(new DiscountFragment());



        adapter.setFragments(fragmentArrayList);



        herolistWeekfreeForViewpager.setAdapter(adapter);
        herolistWeekfreeForTablayout.setupWithViewPager(herolistWeekfreeForViewpager);
        int color = getResources().getColor(R.color.mycolor);

        herolistWeekfreeForTablayout.setTabTextColors(Color.BLACK,Color.WHITE);
        herolistWeekfreeForTablayout.setBackgroundResource(R.drawable.weekfreetablayout);



        return  view;
    }
}
