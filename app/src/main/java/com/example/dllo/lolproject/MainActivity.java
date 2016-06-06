package com.example.dllo.lolproject;

import android.content.SharedPreferences;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.android.volley.VolleyError;
import com.example.dllo.lolproject.adapters.AdapterForMainViewpager;
import com.example.dllo.lolproject.bean.AllHeroBean;
import com.example.dllo.lolproject.bean.MainActivityFragmentBean;
import com.example.dllo.lolproject.bean.NewNewsJsonBeans;
import com.example.dllo.lolproject.bean.WeekFreeHeroList;
import com.example.dllo.lolproject.fragments.CommunityFragment;
import com.example.dllo.lolproject.fragments.HeroListFragment;
import com.example.dllo.lolproject.fragments.MoreFragment;
import com.example.dllo.lolproject.fragments.NewsFragment;
import com.example.dllo.lolproject.fragments.VedioFragment;
import com.example.dllo.lolproject.interfaces.HeroList;
import com.example.dllo.lolproject.interfaces.WeekFree;
import com.example.dllo.lolproject.tools.VolleyForHeroList;
import com.example.dllo.lolproject.tools.VolleyForWeekFree;


import java.io.File;
import java.util.ArrayList;


//主界面


public class MainActivity extends AppCompatActivity {


    //声明全局页面tablayout
    private TabLayout tabLayoutForBigView;
    //声明全局viewpager
    private ViewPager viewPagerForBigView;
    //声明主函数的适配器
    private AdapterForMainViewpager mainAdapter;
    //声明fragment的集合
    private ArrayList mainFragmentList;
    //声明mainactivity中所拥有的fragment
    private MainActivityFragmentBean mainActivityFragmentBean;

    //声明实体类集合
    private ArrayList<NewNewsJsonBeans>data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);




        //绑定布局中的按钮
        tabLayoutForBigView= (TabLayout) findViewById(R.id.mainTablayout);
        viewPagerForBigView= (ViewPager) findViewById(R.id.mainViewpager);

        //实例化适配器
        mainAdapter=new AdapterForMainViewpager(getSupportFragmentManager());

        //实例化fragment集合
        mainFragmentList=new ArrayList();
        //向fragment集合中加入各个Fragment
        mainFragmentList.add(new NewsFragment());
        mainFragmentList.add(new VedioFragment());
        mainFragmentList.add(new HeroListFragment());
        mainFragmentList.add(new CommunityFragment());
        mainFragmentList.add(new MoreFragment());


        //向适配器中加入fragment集合
        mainAdapter.setFragments(mainFragmentList);
        //向滑动页面中绑定适配器
        viewPagerForBigView.setAdapter(mainAdapter);
        //将Tablayout与滑动页面绑定
        tabLayoutForBigView.setupWithViewPager(viewPagerForBigView);
        //设置Tablayout图标
        tabLayoutForBigView.getTabAt(0).setIcon(R.drawable.newsbutton);
        tabLayoutForBigView.getTabAt(1).setIcon(R.drawable.vediobutton);
        tabLayoutForBigView.getTabAt(2).setIcon(R.drawable.herolistbutton);
        tabLayoutForBigView.getTabAt(3).setIcon(R.drawable.communitybutton);
        tabLayoutForBigView.getTabAt(4).setIcon(R.drawable.morebutton);
        int color = getResources().getColor(R.color.nonecolor);
        tabLayoutForBigView.setSelectedTabIndicatorColor(color);





        //解析周免英雄数据
        VolleyForWeekFree volleyForWeekFree=new VolleyForWeekFree();
        volleyForWeekFree.getWeekFree(NetDataAdress.WeekFreeAdress, new WeekFree() {
            @Override
            public void onSuccess(WeekFreeHeroList weekFreeHeroList) {
                //将周免英雄本地持久化
                SharedPreferences sp=getSharedPreferences("WeekFree",MODE_PRIVATE);

                SharedPreferences.Editor editor=sp.edit();

                for (int i = 0; i < weekFreeHeroList.getData().getCurrentperiod().size(); i++) {
                    editor.putString(weekFreeHeroList.getData().getCurrentperiod().get(i).getId(),"本周免费英雄"+i);


                }

//                for (int i = 0; i < weekFreeHeroList.getData().getNextperiod().size(); i++) {
//                    editor.putString("next"+weekFreeHeroList.getData().getNextperiod().get(i).getId(),"本周免费英雄"+i);
//
//
//                }
              editor.commit();


            }

            @Override
            public void onFailed(VolleyError error) {

            }
        });




    }



}

