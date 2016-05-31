package com.example.dllo.lolproject.thesecondflor;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.android.volley.VolleyError;
import com.example.dllo.lolproject.NetDataAdress;
import com.example.dllo.lolproject.R;
import com.example.dllo.lolproject.bean.VideoBeanForPic;
import com.example.dllo.lolproject.fragments.morefragment.More2ImportantNews;
import com.example.dllo.lolproject.fragments.morefragment.More2MatchDate;
import com.example.dllo.lolproject.interfaces.ForMore;
import com.example.dllo.lolproject.lazyman.AdapterForMoreFragment;
import com.example.dllo.lolproject.lazyman.VolleyForMore;
import com.example.dllo.lolproject.tools.MyAPP;

import java.net.URL;
import java.util.ArrayList;

/**
 * Created by dllo on 16/5/31.
 */
public class MoreViewActivity extends AppCompatActivity{
    //界面二内容
    private TabLayout more2Tablayout;
    private ViewPager more2ViewPager;
    private AdapterForMoreFragment adapter;
    private ArrayList fragmentArrayList;


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




                break;
            case 2:

                setContentView(R.layout.more3forherolist);
                break;
            case 3:
                setContentView(R.layout.more4forbiggod);

                break;
            case 4:

                setContentView(R.layout.more5forcolumn);
                break;
            case 5:


                break;
            case 6:
                setContentView(R.layout.more6fors6);

                break;
            case 7:

                setContentView(R.layout.more7formock);
                break;
            case 8:
                setContentView(R.layout.more8forskill);

                break;
            case 9:
                setContentView(R.layout.more9forequipment);

                break;
            case 10:
                setContentView(R.layout.more10formusic);

                break;
            case 11:
                setContentView(R.layout.more11forwallpaper);

                break;
            case 12:
                setContentView(R.layout.more12forstory);

                break;
            case 13:
                setContentView(R.layout.more13forshop);

                break;
            case 14:
                setContentView(R.layout.more14forhappy);

                break;



        }
    }
}
