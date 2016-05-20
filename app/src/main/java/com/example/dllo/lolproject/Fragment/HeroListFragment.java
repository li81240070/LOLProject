package com.example.dllo.lolproject.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dllo.lolproject.Adapters.AdapterForHerolist;
import com.example.dllo.lolproject.HeroListFragments.HeroListAllHeroFragment;
import com.example.dllo.lolproject.HeroListFragments.HeroListMyHeroFragment;
import com.example.dllo.lolproject.HeroListFragments.HeroListWeekFreeFragment;
import com.example.dllo.lolproject.R;

import java.util.ArrayList;

/**
 * Created by dllo on 16/5/19.
 */

//英雄列表Fragment页面

public class HeroListFragment extends Fragment{
    //声明fragment的集合
    private ArrayList fragmentArraylist;
    //声明英雄列表的适配器
    private AdapterForHerolist adapterForHerolist;
    //声明滑动按钮
    private TabLayout herolistTablayout;
    //声明滑动显示组件
    private ViewPager herolistViewpager;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.herobiggestpage,container,false);
        //绑定视图中的组件
        herolistTablayout= (TabLayout) view.findViewById(R.id.herolistTablayout);
        herolistViewpager= (ViewPager) view.findViewById(R.id.herolistViewpager);

        //初始化适配器
        adapterForHerolist=new AdapterForHerolist(getChildFragmentManager());
        //初始化fragment集合
        fragmentArraylist=new ArrayList();
        //将fragment放入集合中
        fragmentArraylist.add(new HeroListWeekFreeFragment());
        fragmentArraylist.add(new HeroListMyHeroFragment());
        fragmentArraylist.add(new HeroListAllHeroFragment());
        //将fragment集合放入适配器中
        adapterForHerolist.setFragments(fragmentArraylist);
        //将适配器与viewpager进行对应
        herolistViewpager.setAdapter(adapterForHerolist);
        //将滑动组件与显示内容进行对应
        herolistTablayout.setupWithViewPager(herolistViewpager);




        return view;
    }
}
