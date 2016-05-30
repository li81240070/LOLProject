package com.example.dllo.lolproject.tools;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.*;
import com.example.dllo.lolproject.bean.OtherVideoIntentBean;
import com.example.dllo.lolproject.interfaces.VideoIntent;
import com.google.gson.Gson;

/**
 * Created by dllo on 16/5/28.
 */
public class VolleyForVideoIntent {


    public void getVideoIntentData(String url, final VideoIntent videoIntent){

        RequestQueue queue= com.android.volley.toolbox.Volley.newRequestQueue(MyAPP.context);

        StringRequest stringRequest=new StringRequest(url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {

                Gson gson =new Gson();
                OtherVideoIntentBean otherVideoIntentBean=gson.fromJson(response,OtherVideoIntentBean.class);

                videoIntent.onSuccess(otherVideoIntentBean);


            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

                videoIntent.onFailed(error);

            }
        });
        queue.add(stringRequest);
    }
}
