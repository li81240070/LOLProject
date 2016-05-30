package com.example.dllo.lolproject.thesecondflor;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import com.android.volley.VolleyError;
import com.example.dllo.lolproject.NetDataAdress;
import com.example.dllo.lolproject.R;
import com.example.dllo.lolproject.adapters.AdapterForReallyPeopleShow;
import com.example.dllo.lolproject.bean.ReallyPeopleShowBean;
import com.example.dllo.lolproject.interfaces.ReallyPeopleShow;
import com.example.dllo.lolproject.tools.Volley;
import com.example.dllo.lolproject.tools.VolleyForReallyPeopleShow;

import java.util.List;

/**
 * Created by dllo on 16/5/30.
 */
public class ReallyPeopleShowActivity extends Activity{
    private ListView reallyPeopleshowListView;
    private AdapterForReallyPeopleShow adapter;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reallypeopleshowpage);
        reallyPeopleshowListView= (ListView) findViewById(R.id.reallyPeopleshowListView);

        adapter=new AdapterForReallyPeopleShow(getBaseContext());

        VolleyForReallyPeopleShow volleyForReallyPeopleShow=new VolleyForReallyPeopleShow();
        volleyForReallyPeopleShow.getReallyPeopleShow(NetDataAdress.ReallyPeopleShow, new ReallyPeopleShow() {
            @Override
            public void onSuccess(ReallyPeopleShowBean reallyPeopleShowBean) {

                List<ReallyPeopleShowBean.DataBean>data=reallyPeopleShowBean.getData();

                Log.i("yyyyy",data.toString());

                adapter.setData(data);

                reallyPeopleshowListView.setAdapter(adapter);

            }

            @Override
            public void onFailed(VolleyError error) {

            }
        });



    }
}
