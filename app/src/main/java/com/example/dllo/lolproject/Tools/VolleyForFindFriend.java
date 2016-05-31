package com.example.dllo.lolproject.tools;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.*;
import com.example.dllo.lolproject.bean.FindFriendBean;
import com.example.dllo.lolproject.interfaces.FindFriend;
import com.google.gson.Gson;

/**
 * Created by dllo on 16/5/31.
 */
public class VolleyForFindFriend {


    public void getFindFriend(String url, final FindFriend findFriend){

        RequestQueue queue= com.android.volley.toolbox.Volley.newRequestQueue(MyAPP.context);
        StringRequest stringRequest=new StringRequest(url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {

                Gson gson =new Gson();
                FindFriendBean findFriendBean=gson.fromJson(response,FindFriendBean.class);
                findFriend.onSuccess(findFriendBean);


            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

                findFriend.onFailed(error);



            }
        });

        queue.add(stringRequest);

    }
}
