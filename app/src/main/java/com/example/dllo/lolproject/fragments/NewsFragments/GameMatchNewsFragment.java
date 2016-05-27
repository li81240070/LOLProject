package com.example.dllo.lolproject.fragments.newsfragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.android.volley.VolleyError;
import com.example.dllo.lolproject.WebviewForNews;
import com.example.dllo.lolproject.adapters.AdapterForNewNewsFragment;
import com.example.dllo.lolproject.bean.NewNewsJsonBeans;
import com.example.dllo.lolproject.interfaces.InterfaceForGetNetData;
import com.example.dllo.lolproject.NetDataAdress;
import com.example.dllo.lolproject.R;
import com.example.dllo.lolproject.tools.Volley;

/**
 * Created by dllo on 16/5/19.
 */
public class GameMatchNewsFragment extends Fragment{


    private ListView gamematchNewsListview;
    private AdapterForNewNewsFragment adapter;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.gamematchnewspage,container,false);

        gamematchNewsListview= (ListView) view.findViewById(R.id.gamematchNewsListview);
        adapter=new AdapterForNewNewsFragment(getContext());

        Volley volley=new Volley();
        volley.getNetData(NetDataAdress.GameMatchNewsAdress, new InterfaceForGetNetData() {
            @Override
            public void onSuccess(NewNewsJsonBeans newNewsJsonBeans1) {

                adapter.setData(newNewsJsonBeans1);
                gamematchNewsListview.setAdapter(adapter);

            }

            @Override
            public void onFailed(VolleyError error) {

            }
        });

        //为新闻页面添加点击事件
        gamematchNewsListview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String newNewsUrl="http://lol.zhangyoubao.com/mobiles/item/"+id+"?user_id=&token=&i_=EAC1B788-00BC-454A-A9B9-460852CFC011&t_=1438755282&p_=18191&v_=40050303&d_=ios&osv_=8.3&version=0&a_=lol&size=middle";

                Log.i("ooooo",position+"*****");

                Intent intent=new Intent();
                intent.putExtra("urlForNews",newNewsUrl);
                intent.setClass(getActivity(), WebviewForNews.class);
                startActivity(intent);


            }
        });




        return view;
    }
}
