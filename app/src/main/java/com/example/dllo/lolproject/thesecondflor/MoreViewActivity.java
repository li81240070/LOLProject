package com.example.dllo.lolproject.thesecondflor;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import com.android.volley.Request;
import com.android.volley.VolleyError;
import com.example.dllo.lolproject.NetDataAdress;
import com.example.dllo.lolproject.R;
import com.example.dllo.lolproject.bean.More8SkillsRecyclerviewBean;
import com.example.dllo.lolproject.fragments.more10activity.AdapterForMore10Music;
import com.example.dllo.lolproject.fragments.more10activity.More10MusicBean;
import com.example.dllo.lolproject.fragments.more11activity.AdapterForMore11Wallpaper;
import com.example.dllo.lolproject.fragments.more11activity.More11WallpaperBean;
import com.example.dllo.lolproject.fragments.more12activity.AdapterForMore12Novel;
import com.example.dllo.lolproject.fragments.more12activity.More12NovelBean;
import com.example.dllo.lolproject.fragments.more2fragment.More2ImportantNews;
import com.example.dllo.lolproject.fragments.more2fragment.More2MatchDate;
import com.example.dllo.lolproject.fragments.more3activity.AdapterForMore3HeroCount;
import com.example.dllo.lolproject.fragments.more3activity.More3HeroCountBean;
import com.example.dllo.lolproject.fragments.more4activity.AdapterForMore4BigGod;
import com.example.dllo.lolproject.fragments.more4activity.More4BigGodBean;
import com.example.dllo.lolproject.fragments.more5activity.AdapterForMore5Column;
import com.example.dllo.lolproject.fragments.more5activity.More5ColumnBean;
import com.example.dllo.lolproject.fragments.more5activity.More5Intent;
import com.example.dllo.lolproject.fragments.more6fors6.AdapterForMore6Fragment;
import com.example.dllo.lolproject.fragments.more6fors6.More6Ferocious1Fragment;
import com.example.dllo.lolproject.fragments.more6fors6.More6Ferocious2Fragment;
import com.example.dllo.lolproject.fragments.more6fors6.More6Firm3Fragment;
import com.example.dllo.lolproject.fragments.more8activity.AdapterForMore8Skills;
import com.example.dllo.lolproject.interfaces.ForMore;
import com.example.dllo.lolproject.lazyman.AdapterForMoreFragment;
import com.example.dllo.lolproject.lazyman.VolleyForMore;
import com.example.dllo.lolproject.lazyman.VolleyForPostMore;
import com.example.dllo.lolproject.tools.Volley;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by dllo on 16/5/31.
 */
public class MoreViewActivity extends AppCompatActivity{
    //界面2赛事内容
    private TabLayout more2Tablayout;
    private ViewPager more2ViewPager;
    private AdapterForMoreFragment adapter;
    private ArrayList fragmentArrayList;
    //界面13商城内容
    private RecyclerView more13Recyclerview;
    //界面3英雄榜内容
    private ListView more3ListView;
    private AdapterForMore3HeroCount adaper3;
    //界面4大神榜内容
    private ListView more4ListView;
    private AdapterForMore4BigGod adapter4;
    //界面12小说内容
    private ListView more12ListView;
    private AdapterForMore12Novel adapter12;
    //界面11壁纸内容
    private RecyclerView more11RecyclerView;
    private AdapterForMore11Wallpaper adapter11;
    //界面10铃声
    private ListView more10List;
    private AdapterForMore10Music adapter10;

    //界面5精彩专栏
    private ListView more5ListView;
    private AdapterForMore5Column adapter5;
    //界面8召唤师技能
    private RecyclerView more8Recyclerview;
    private AdapterForMore8Skills adapter8;
    private List<More8SkillsRecyclerviewBean> data8;
    //界面6S6赛季天赋模拟
    private ViewPager more6ViewPager;
    private TabLayout more6TabLayout;
    private AdapterForMore6Fragment adapter6;
    private ArrayList fragmentArrayListForMore6;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        Intent intent=getIntent();
       int a= Integer.parseInt(intent.getStringExtra("PassWord"));

        switch (a){

            case 0:
            setContentView(R.layout.more1lookforhistory);



                break;
            case 1:
                setContentView(R.layout.more2formatch);
                more2Tablayout= (TabLayout) findViewById(R.id.more2Tablayout);
                more2ViewPager= (ViewPager) findViewById(R.id.more2ViewPager);
                adapter=new AdapterForMoreFragment(getSupportFragmentManager());
                fragmentArrayList=new ArrayList();
                fragmentArrayList.add(new More2MatchDate());
                fragmentArrayList.add(new More2ImportantNews());

                adapter.setFragments(fragmentArrayList);
                more2ViewPager.setAdapter(adapter);
                more2Tablayout.setupWithViewPager(more2ViewPager);
                int color22 = getResources().getColor(R.color.mycolor);
                more2Tablayout.setTabTextColors(Color.WHITE,color22);

                int color222 = getResources().getColor(R.color.seekcolor);
                more2Tablayout.setSelectedTabIndicatorColor(color222);




                break;
            case 2:

                setContentView(R.layout.more3forherolist);
                more3ListView= (ListView) findViewById(R.id.more3ListView);
                adaper3=new AdapterForMore3HeroCount(getBaseContext());

                final VolleyForMore volleyForMore=new VolleyForMore();
                volleyForMore.getDataForMore(NetDataAdress.HeroCountAdress, More3HeroCountBean.class, new ForMore<More3HeroCountBean>() {
                    @Override
                    public void onSuccess(More3HeroCountBean more3HeroCountBean) {

                        List<More3HeroCountBean.DataBean>data=more3HeroCountBean.getData();
                        adaper3.setData(data);
                        more3ListView.setAdapter(adaper3);

                    }

                    @Override
                    public void onFailed(VolleyError error) {

                    }
                });



                break;
            case 3:
                setContentView(R.layout.more4forbiggod);
                more4ListView= (ListView) findViewById(R.id.more4ListView);
                HashMap head=new HashMap();
                head.put("Host","lol.service.zhangyoubao.com");
                head.put("Content-Length","281");
                head.put("If-Modified-Since","Thu, 02 Jun 2016 02:37:48 GMT+00:00");
                head.put("Content-Type","application/x-www-form-urlencoded; charset=UTF-8");
                head.put("User-Agent","Dalvik/2.1.0 (Linux; U; Android 5.0.2");

                String s = "sign=&time=1464835439795&params%5Bversion%5D=0&userId=23372828&api=rank.getgodlist&apiVersion=v1&userToken=124ed620f45642a19ac055296e55e1c1a0&params%5BpageSize%5D=50&game=lol&os=android&params%5BlastId%5D=0&platformVersion=400801&platform=android&osVersion=21&params%5BareaId%5D=1&";


                adapter4=new AdapterForMore4BigGod(getBaseContext());

                VolleyForPostMore volleyForPostMore=new VolleyForPostMore();
                volleyForPostMore.getDataForMore(NetDataAdress.BigGodAdress, More4BigGodBean.class, new ForMore<More4BigGodBean>() {
                    @Override
                    public void onSuccess(More4BigGodBean more4BigGodBean) {

                        List<More4BigGodBean.DataBean>data=more4BigGodBean.getData();
                        adapter4.setData(data);
                        more4ListView.setAdapter(adapter4);


                    }

                    @Override
                    public void onFailed(VolleyError error) {

                    }
                },head,s);


                break;
            case 4:

                setContentView(R.layout.more5forcolumn);

                more5ListView= (ListView) findViewById(R.id.more5ListView);
                adapter5=new AdapterForMore5Column(getBaseContext());

                VolleyForMore volleyForMore5=new VolleyForMore();
                volleyForMore5.getDataForMore(NetDataAdress.ColumnAdress, More5ColumnBean.class, new ForMore<More5ColumnBean>() {
                    @Override
                    public void onSuccess(More5ColumnBean more5ColumnBean) {

                        List<More5ColumnBean.DataBean>data=more5ColumnBean.getData();
                        adapter5.setData(data);
                        more5ListView.setAdapter(adapter5);


                    }

                    @Override
                    public void onFailed(VolleyError error) {

                    }
                });

//                more5ListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//                    @Override
//                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//
//
//
//
//
////
////                        Intent intent5=new Intent();
////                        String more5=position+"";
////                        intent5.putExtra("more5",more5);
////                        intent5.setClass(MoreViewActivity.this, More5Intent.class);
////                        startActivity(intent5);
//
//
//                    }
//                });



                break;
            case 5:
                setContentView(R.layout.more6fors6);

                more6TabLayout= (TabLayout) findViewById(R.id.more6TabLayout);
                more6ViewPager= (ViewPager) findViewById(R.id.more6ViewPager);
                adapter6=new AdapterForMore6Fragment(getSupportFragmentManager());
                fragmentArrayListForMore6=new ArrayList();
                fragmentArrayListForMore6.add(new More6Ferocious1Fragment());
                fragmentArrayListForMore6.add(new More6Ferocious2Fragment());
                fragmentArrayListForMore6.add(new More6Firm3Fragment());
                adapter6.setFragments(fragmentArrayListForMore6);
                more6ViewPager.setAdapter(adapter6);
                more6TabLayout.setupWithViewPager(more6ViewPager);
                int color = getResources().getColor(R.color.mycolor);
                more6TabLayout.setTabTextColors(Color.WHITE,color);

                int color2 = getResources().getColor(R.color.seekcolor);
                more6TabLayout.setSelectedTabIndicatorColor(color2);






                break;
            case 6:
                setContentView(R.layout.more7formock);






                break;
            case 7:
                setContentView(R.layout.more8forskill);

                more8Recyclerview= (RecyclerView) findViewById(R.id.more8Recyclerview);
                adapter8=new AdapterForMore8Skills(getBaseContext());
                data8=new ArrayList();

                data8.add(new More8SkillsRecyclerviewBean("屏障",R.mipmap.more81));
                data8.add(new More8SkillsRecyclerviewBean("净化",R.mipmap.more82));
                data8.add(new More8SkillsRecyclerviewBean("洞察",R.mipmap.more83));
                data8.add(new More8SkillsRecyclerviewBean("引燃",R.mipmap.more84));
                data8.add(new More8SkillsRecyclerviewBean("虚弱",R.mipmap.more85));
                data8.add(new More8SkillsRecyclerviewBean("闪现",R.mipmap.more86));
                data8.add(new More8SkillsRecyclerviewBean("幽灵疾步",R.mipmap.more87));
                data8.add(new More8SkillsRecyclerviewBean("治疗术",R.mipmap.more88));
                data8.add(new More8SkillsRecyclerviewBean("清晰术",R.mipmap.more89));
                data8.add(new More8SkillsRecyclerviewBean("卫戍部队",R.mipmap.more810));
                data8.add(new More8SkillsRecyclerviewBean("护驾!",R.mipmap.more811));
                data8.add(new More8SkillsRecyclerviewBean("魄罗投掷",R.mipmap.more812));
                data8.add(new More8SkillsRecyclerviewBean("惩戒",R.mipmap.more813));
                data8.add(new More8SkillsRecyclerviewBean("标记",R.mipmap.more814));
                data8.add(new More8SkillsRecyclerviewBean("传送",R.mipmap.more815));


                adapter8.setData(data8);
                more8Recyclerview.setLayoutManager(new StaggeredGridLayoutManager(4,StaggeredGridLayoutManager.VERTICAL));
                more8Recyclerview.setAdapter(adapter8);



                break;
            case 8:
                setContentView(R.layout.more9forequipment);





                break;
            case 9:
                setContentView(R.layout.more10formusic);
                more10List= (ListView) findViewById(R.id.more10List);
                adapter10=new AdapterForMore10Music(getBaseContext());



                VolleyForMore volleyForMore10=new VolleyForMore();
                volleyForMore10.getDataForMore(NetDataAdress.MuscicAdress, More10MusicBean.class, new ForMore<More10MusicBean>() {
                    @Override
                    public void onSuccess(More10MusicBean more10MusicBean) {

                        List<More10MusicBean.DataBean>data=more10MusicBean.getData();
                        adapter10.setData(data);
                        more10List.setAdapter(adapter10);


                    }

                    @Override
                    public void onFailed(VolleyError error) {

                    }
                });



                break;
            case 10:
                setContentView(R.layout.more11forwallpaper);
                more11RecyclerView= (RecyclerView) findViewById(R.id.more11RecyclerView);

                adapter11=new AdapterForMore11Wallpaper(getBaseContext());

                VolleyForMore volleyForMore2=new VolleyForMore();
                volleyForMore2.getDataForMore(NetDataAdress.WallpaperAdress, More11WallpaperBean.class, new ForMore<More11WallpaperBean>() {
                    @Override
                    public void onSuccess(More11WallpaperBean more11WallpaperBean) {
                        List<More11WallpaperBean.DataBean>data=more11WallpaperBean.getData();
                        adapter11.setData(data);

                        more11RecyclerView.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));
                        more11RecyclerView.setAdapter(adapter11);
                    }

                    @Override
                    public void onFailed(VolleyError error) {

                    }
                });




                break;
            case 11:
                setContentView(R.layout.more12forstory);
                more12ListView= (ListView) findViewById(R.id.more12ListView);
                adapter12=new AdapterForMore12Novel(getBaseContext());

                VolleyForMore volleyForMore1=new VolleyForMore();
                volleyForMore1.getDataForMore(NetDataAdress.NovelAdress, More12NovelBean.class, new ForMore<More12NovelBean>() {
                    @Override
                    public void onSuccess(More12NovelBean more12NovelBean) {
                        List<More12NovelBean.DataBean.CatwordIdBean>data=more12NovelBean.getData().get(0).getCatword_id();

                        adapter12.setData(data);
                        more12ListView.setAdapter(adapter12);





                    }

                    @Override
                    public void onFailed(VolleyError error) {

                    }
                });


                break;
            case 12:
                setContentView(R.layout.more13forshop);

                break;
            case 13:
                setContentView(R.layout.more14forhappy);




                break;




        }
    }
}
