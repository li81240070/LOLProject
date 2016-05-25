package com.example.dllo.lolproject.tools;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.*;
import com.android.volley.toolbox.Volley;
import com.example.dllo.lolproject.bean.NewNewsJsonBeans;
import com.example.dllo.lolproject.bean.VideoBeanForPic;
import com.example.dllo.lolproject.bean.VideoRecyclerviewBean;
import com.example.dllo.lolproject.interfaces.GetNetDataPic;
import com.example.dllo.lolproject.interfaces.InterfaceForGetNetData;
import com.google.gson.Gson;

/**
 * Created by dllo on 16/5/24.
 */
public class VolleyForPic {


    public void getNetData(String url, final GetNetDataPic getNetDataPic){

        RequestQueue queue= com.android.volley.toolbox.Volley.newRequestQueue(MyAPP.context);

        StringRequest stringRequest=new StringRequest(url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Gson gson=new Gson();
                VideoBeanForPic videoBeanForPic=gson.fromJson(response,VideoBeanForPic.class);



                getNetDataPic.onSuccess(videoBeanForPic);



            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                getNetDataPic.onFailed(error);

            }
        });


        queue.add(stringRequest);
    }

    }














