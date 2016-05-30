package com.example.dllo.lolproject.tools;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.*;
import com.example.dllo.lolproject.bean.ShowHowToPlayBean;
import com.example.dllo.lolproject.interfaces.ShowHowToPlay;
import com.google.gson.Gson;

/**
 * Created by dllo on 16/5/30.
 */
public class VolleyForShowHowToPlay {


    public  void   getShowData(String url, final ShowHowToPlay showHowToPlay){

        RequestQueue queue= com.android.volley.toolbox.Volley.newRequestQueue(MyAPP.context);

        StringRequest stringRequest=new StringRequest(url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {


                Gson gson=new Gson();
                ShowHowToPlayBean showHowToPlayBean=gson.fromJson(response,ShowHowToPlayBean.class);

                showHowToPlay.onSuccess(showHowToPlayBean);


            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

                showHowToPlay.onFailed(error);

            }
        });

        queue.add(stringRequest);


    }
}
