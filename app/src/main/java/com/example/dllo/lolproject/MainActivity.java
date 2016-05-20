package com.example.dllo.lolproject;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.dllo.lolproject.Adapters.AdapterForMainViewpager;
import com.example.dllo.lolproject.Bean.MainActivityFragmentBean;
import com.example.dllo.lolproject.Fragment.CommunityFragment;
import com.example.dllo.lolproject.Fragment.HeroListFragment;
import com.example.dllo.lolproject.Fragment.MoreFragment;
import com.example.dllo.lolproject.Fragment.NewsFragment;
import com.example.dllo.lolproject.Fragment.VedioFragment;

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






    }
}
