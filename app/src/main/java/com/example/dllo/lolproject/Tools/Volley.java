package com.example.dllo.lolproject.tools;

import android.content.Context;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.example.dllo.lolproject.bean.NewNewsJsonBeans;
import com.example.dllo.lolproject.interfaces.InterfaceForGetNetData;
import com.google.gson.Gson;

/**
 * Created by dllo on 16/5/24.
 */


//获取文字类网络数据
public class Volley {



    public void getNetData(String url, final InterfaceForGetNetData interfaceForGetNetData){

        RequestQueue queue= com.android.volley.toolbox.Volley.newRequestQueue(MyAPP.context);

        StringRequest stringRequest=new StringRequest(url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Gson gson=new Gson();
                NewNewsJsonBeans newNewsJsonBean=gson.fromJson(response,NewNewsJsonBeans.class);

                interfaceForGetNetData.onSuccess(newNewsJsonBean);


            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                interfaceForGetNetData.onFailed(error);

            }
        });


        queue.add(stringRequest);
    }


}
