package com.example.dllo.lolproject;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.dllo.lolproject.Adapters.AdapterForMainViewpager;

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



    }
}
