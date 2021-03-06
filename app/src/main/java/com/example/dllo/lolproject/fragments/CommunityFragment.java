package com.example.dllo.lolproject.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.dllo.lolproject.R;
import com.example.dllo.lolproject.thesecondflor.FindFriendActivity;
import com.example.dllo.lolproject.thesecondflor.ReallyPeopleShowActivity;
import com.example.dllo.lolproject.thesecondflor.ShowHowToPlayActivity;

/**
 * Created by dllo on 16/5/19.
 */

//社区fragment页面

public class CommunityFragment extends Fragment implements View.OnClickListener {
    private ImageView reallyPeopleShow,showHowToPlay,findFriend;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.communitybiggestpage,container,false);

        reallyPeopleShow= (ImageView) view.findViewById(R.id.reallyPeopleShow);
        showHowToPlay= (ImageView) view.findViewById(R.id.showHowToPlay);
        findFriend= (ImageView) view.findViewById(R.id.findFriend);

        reallyPeopleShow.setOnClickListener(this);
        showHowToPlay.setOnClickListener(this);
        findFriend.setOnClickListener(this);

        return  view;
    }


    //设置各个图片点击事件
    @Override
    public void onClick(View v) {

        switch (v.getId()){

            //真人秀跳转页面
            case R.id.reallyPeopleShow:

                Intent intent=new Intent();
                intent.setClass(getActivity(), ReallyPeopleShowActivity.class);
                startActivity(intent);



                break;

            //晒玩法跳转页面
            case R.id.showHowToPlay:
                Intent intent1=new Intent();
                intent1.setClass(getActivity(), ShowHowToPlayActivity.class);
                startActivity(intent1);



                break;
            //找战友跳转页面
            case R.id.findFriend:
                Intent intent2=new Intent();
                intent2.setClass(getActivity(), FindFriendActivity.class);
                startActivity(intent2);



                break;



        }

    }
}
