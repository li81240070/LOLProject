package com.example.dllo.lolproject.tools;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.*;
import com.example.dllo.lolproject.bean.WeekFreeHeroList;
import com.example.dllo.lolproject.interfaces.WeekFree;
import com.google.gson.Gson;

/**
 * Created by dllo on 16/5/26.
 */
public class VolleyForWeekFree {

    public void getWeekFree(String url, final WeekFree weekFree){

        RequestQueue queue= com.android.volley.toolbox.Volley.newRequestQueue(MyAPP.context);

        StringRequest stringRequest=new StringRequest(url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {

                Gson gson=new Gson();
                WeekFreeHeroList weekFreeHeroList=gson.fromJson(response,WeekFreeHeroList.class);

                weekFree.onSuccess(weekFreeHeroList);


            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

                weekFree.onFailed(error);

            }
        });


        queue.add(stringRequest);
    }
}
