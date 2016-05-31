package com.example.dllo.lolproject.thesecondflor;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.android.volley.VolleyError;
import com.example.dllo.lolproject.NetDataAdress;
import com.example.dllo.lolproject.R;
import com.example.dllo.lolproject.adapters.AdapterForFindFriend;
import com.example.dllo.lolproject.bean.FindFriendBean;
import com.example.dllo.lolproject.interfaces.FindFriend;
import com.example.dllo.lolproject.tools.VolleyForFindFriend;

import java.util.List;

/**
 * Created by dllo on 16/5/30.
 */
public class FindFriendActivity extends Activity{
    private ListView FindFriendForListview;
    private AdapterForFindFriend adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.findfriend);

        FindFriendForListview= (ListView) findViewById(R.id.FindFriendForListview);
        adapter=new AdapterForFindFriend(getBaseContext());

        VolleyForFindFriend volleyForFindFriend=new VolleyForFindFriend();
        volleyForFindFriend.getFindFriend(NetDataAdress.FindFriendAdress, new FindFriend() {
            @Override
            public void onSuccess(FindFriendBean findFriendBean) {
                List<FindFriendBean.DataBean>data=findFriendBean.getData();
                adapter.setData(data);
                FindFriendForListview.setAdapter(adapter);
            }

            @Override
            public void onFailed(VolleyError error) {

            }
        });




    }
}
