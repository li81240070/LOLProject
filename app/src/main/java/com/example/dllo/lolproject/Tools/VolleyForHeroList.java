package com.example.dllo.lolproject.tools;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.*;

import com.android.volley.toolbox.Volley;
import com.example.dllo.lolproject.bean.AllHeroBean;
import com.example.dllo.lolproject.interfaces.HeroList;
import com.google.gson.Gson;

/**
 * Created by dllo on 16/5/26.
 */
public class VolleyForHeroList {



    public void getrHeroList(String url, final HeroList heroList) {

            RequestQueue queue= Volley.newRequestQueue(MyAPP.context);

        StringRequest stringRequest=new StringRequest(url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {

                Gson gson =new Gson();
                AllHeroBean allHeroBean=gson.fromJson(response,AllHeroBean.class);
                heroList.onSuccess(allHeroBean);

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

                heroList.onFailed(error);

            }
        });


            queue.add(stringRequest);

    }
}