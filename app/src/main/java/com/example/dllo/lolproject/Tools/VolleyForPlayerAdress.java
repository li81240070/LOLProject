package com.example.dllo.lolproject.tools;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.*;
import com.example.dllo.lolproject.bean.VideoPlayerAdressBean;
import com.example.dllo.lolproject.interfaces.ForPlayerAdress;
import com.google.gson.Gson;

/**
 * Created by dllo on 16/5/28.
 */
public class VolleyForPlayerAdress {

    public void getPlayerAdress(String url, final ForPlayerAdress forPlayerAdress){

        RequestQueue queue= com.android.volley.toolbox.Volley.newRequestQueue(MyAPP.context);
        StringRequest stringRequest=new StringRequest(url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Gson gson=new Gson();
                VideoPlayerAdressBean videoPlayerAdressBean=gson.fromJson(response,VideoPlayerAdressBean.class);

                forPlayerAdress.onSuccess(videoPlayerAdressBean);


            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                forPlayerAdress.onFailed(error);

            }
        });


        queue.add(stringRequest);
    }
}
