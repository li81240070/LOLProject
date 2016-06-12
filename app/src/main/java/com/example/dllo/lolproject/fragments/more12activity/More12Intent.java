package com.example.dllo.lolproject.fragments.more12activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.android.volley.VolleyError;
import com.example.dllo.lolproject.R;
import com.example.dllo.lolproject.interfaces.ForMore;
import com.example.dllo.lolproject.lazyman.VolleyForMore;
import com.example.dllo.lolproject.tools.MyAPP;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by dllo on 16/6/12.
 */
public class More12Intent extends Activity{

    private ImageView videoIntentPicture;
    private TextView videoIntentName,videoIntentDesc;
    private ListView videoIntentListview;
    private More12IntentAdapter adapter;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.videointentinother);
        videoIntentPicture= (ImageView) findViewById(R.id.videoIntentPicture);
        videoIntentName= (TextView) findViewById(R.id.videoIntentName);
        videoIntentDesc= (TextView) findViewById(R.id.videoIntentDesc);
        videoIntentListview= (ListView) findViewById(R.id.videoIntentListview);

        Intent intent=getIntent();
        String more12title=intent.getStringExtra("more12title");
        String more12desc= intent.getStringExtra("more12desc");
       String more12picurl= intent.getStringExtra("more12picurl");
       String more12id= intent.getStringExtra("more12id");

        Picasso.with(MyAPP.context).load(more12picurl).into(videoIntentPicture);
        videoIntentName.setText(more12title);
        videoIntentDesc.setText(more12desc);
        adapter=new More12IntentAdapter(getBaseContext());
        VolleyForMore volleyForMore=new VolleyForMore();


        String urldata="http://lol.zhangyoubao.com/apis/rest/ItemsService/novels?catid=10195&catwordid="+more12id+"&page=1&i_=04%3Ae6%3A76%3A88%3A95%3A96&t_=1465694467264&p_=24137&v_=400801&a_=lol&pkg_=com.anzogame.lol&d_=android&osv_=21&cha=360Martket&u_=23372828&modle_=N1&";
        volleyForMore.getDataForMore(urldata, More12IntentBean.class, new ForMore<More12IntentBean>() {
            @Override
            public void onSuccess(More12IntentBean more12IntentBean) {

                List<More12IntentBean.DataBean>data=more12IntentBean.getData();

                adapter.setData(data);
                videoIntentListview.setAdapter(adapter);



            }

            @Override
            public void onFailed(VolleyError error) {

            }
        });



    }
}
