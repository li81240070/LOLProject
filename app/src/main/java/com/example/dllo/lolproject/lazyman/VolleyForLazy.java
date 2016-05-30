package com.example.dllo.lolproject.lazyman;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.dllo.lolproject.bean.ShowHowToPlayBean;
import com.example.dllo.lolproject.interfaces.GodLikeInterFace;
import com.example.dllo.lolproject.tools.MyAPP;
import com.google.gson.Gson;

/**
 * Created by dllo on 16/5/30.
 */
public class VolleyForLazy {

    public void getLazyData(String url, final GodLikeInterFace godLikeInterFace) {

        RequestQueue queue = Volley.newRequestQueue(MyAPP.context);
        StringRequest stringRequest = new StringRequest(url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {

                Gson gson=new Gson();
                ShowHowToPlayBean showHowToPlayBean=gson.fromJson(response,ShowHowToPlayBean.class);


                godLikeInterFace.onSuccess(showHowToPlayBean);




            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {


                godLikeInterFace.onFailed(error);

            }
        });

        queue.add(stringRequest);
    }

}
