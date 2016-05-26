package com.example.dllo.lolproject.interfaces;

import com.android.volley.VolleyError;
import com.example.dllo.lolproject.bean.AllHeroBean;
import com.example.dllo.lolproject.bean.VideoBeanForPic;

/**
 * Created by dllo on 16/5/26.
 */
public interface HeroList {


    void  onSuccess(AllHeroBean allHeroBean);

    void  onFailed(VolleyError error);
}
