package com.example.dllo.lolproject.interfaces;

import android.graphics.Bitmap;

import com.android.volley.VolleyError;
import com.example.dllo.lolproject.bean.NewNewsJsonBeans;
import com.example.dllo.lolproject.bean.VideoBeanForPic;
import com.example.dllo.lolproject.bean.VideoRecyclerviewBean;

/**
 * Created by dllo on 16/5/24.
 */
public interface GetNetDataPic {

    void  onSuccess(VideoBeanForPic videoBeanForPic);

    void onFailed(VolleyError error);


}
