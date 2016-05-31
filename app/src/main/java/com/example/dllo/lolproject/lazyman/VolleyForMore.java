package com.example.dllo.lolproject.lazyman;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.dllo.lolproject.interfaces.ForMore;
import com.example.dllo.lolproject.tools.MyAPP;
import com.google.gson.Gson;

import java.net.URL;

/**
 * Created by dllo on 16/5/31.
 */
public class VolleyForMore {




    public  <T>void  getDataForMore(String url, final  Class<T> clazz, final ForMore<T> forMore){

        RequestQueue queue= Volley.newRequestQueue(MyAPP.context);
        StringRequest stringRequest=new StringRequest(url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {



                Gson gson=new Gson();
               T t =  gson.fromJson(response,clazz);
                forMore.onSuccess(t);


            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });

        queue.add(stringRequest);



    }
}
