package com.example.dllo.lolproject.thesecondflor;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.android.volley.VolleyError;
import com.example.dllo.lolproject.NetDataAdress;
import com.example.dllo.lolproject.R;
import com.example.dllo.lolproject.adapters.AdapterForListViewShowHowToPlay;
import com.example.dllo.lolproject.bean.ShowHowToPlayBean;
import com.example.dllo.lolproject.interfaces.ShowHowToPlay;
import com.example.dllo.lolproject.tools.VolleyForShowHowToPlay;

import java.util.List;

/**
 * Created by dllo on 16/5/30.
 */
public class ShowHowToPlayActivity extends Activity{
    private ListView showHowToPlayListView;
    private AdapterForListViewShowHowToPlay adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.showhowtoplaypage);

        adapter=new AdapterForListViewShowHowToPlay(getBaseContext());
        showHowToPlayListView= (ListView) findViewById(R.id.showHowToPlayListView);

        VolleyForShowHowToPlay volleyForShowHowToPlay=new VolleyForShowHowToPlay();
        volleyForShowHowToPlay.getShowData(NetDataAdress.HowToPlayAdress, new ShowHowToPlay() {
            @Override
            public void onSuccess(ShowHowToPlayBean showHowToPlayBean) {
                List<ShowHowToPlayBean.DataBean>data=showHowToPlayBean.getData();
                adapter.setData(data);
                showHowToPlayListView.setAdapter(adapter);

            }

            @Override
            public void onFailed(VolleyError error) {

            }
        });






    }
}
