package com.example.dllo.lolproject.lazyman;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.dllo.lolproject.interfaces.ForMore;
import com.example.dllo.lolproject.tools.MyAPP;
import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by dllo on 16/6/2.
 */
public class VolleyForPostMore {



    public  <T>void  getDataForMore(String url, final  Class<T> clazz, final ForMore<T> forMore, HashMap head, final String s){



        RequestQueue queue= Volley.newRequestQueue(MyAPP.context);
        //自己传进来的hashmap
        final HashMap finalHead = head;
        StringRequest stringRequest=new StringRequest(Request.Method.POST,url, new Response.Listener<String>() {
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
        }){
            @Override
            public byte[] getBody() throws AuthFailureError {

                return s.getBytes();
            }

            @Override
            public Map<String, String> getHeaders() throws AuthFailureError {



                return finalHead;





            }


        };







        queue.add(stringRequest);



    }
}
