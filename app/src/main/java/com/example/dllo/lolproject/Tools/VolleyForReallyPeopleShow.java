package com.example.dllo.lolproject.tools;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.*;
import com.example.dllo.lolproject.bean.ReallyPeopleShowBean;
import com.example.dllo.lolproject.interfaces.ReallyPeopleShow;
import com.google.gson.Gson;

/**
 * Created by dllo on 16/5/30.
 */
public class VolleyForReallyPeopleShow {


   public  void   getReallyPeopleShow(String url, final ReallyPeopleShow reallyPeopleShow){
       RequestQueue queue= com.android.volley.toolbox.Volley.newRequestQueue(MyAPP.context);

       StringRequest stringRequest=new StringRequest(url, new Response.Listener<String>() {
           @Override
           public void onResponse(String response) {

               Gson gson=new Gson();
               ReallyPeopleShowBean reallyPeopleShowBean=gson.fromJson(response,ReallyPeopleShowBean.class);

               reallyPeopleShow.onSuccess(reallyPeopleShowBean);

           }
       }, new Response.ErrorListener() {
           @Override
           public void onErrorResponse(VolleyError error) {

               reallyPeopleShow.onFailed(error);

           }
       });

       queue.add(stringRequest);

   }


}
