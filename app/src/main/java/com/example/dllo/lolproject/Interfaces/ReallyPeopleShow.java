package com.example.dllo.lolproject.interfaces;

import com.android.volley.VolleyError;
import com.example.dllo.lolproject.bean.ReallyPeopleShowBean;
import com.example.dllo.lolproject.bean.VideoPlayerAdressBean;

/**
 * Created by dllo on 16/5/30.
 */
public interface ReallyPeopleShow {


    void  onSuccess(ReallyPeopleShowBean reallyPeopleShowBean);

    void  onFailed(VolleyError error);
}
