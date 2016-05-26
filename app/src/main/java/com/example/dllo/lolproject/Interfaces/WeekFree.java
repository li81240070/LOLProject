package com.example.dllo.lolproject.interfaces;

import com.android.volley.VolleyError;
import com.example.dllo.lolproject.bean.NewNewsJsonBeans;
import com.example.dllo.lolproject.bean.WeekFreeHeroList;

/**
 * Created by dllo on 16/5/26.
 */
public interface WeekFree {


    void  onSuccess(WeekFreeHeroList weekFreeHeroList);

    void onFailed(VolleyError error);
}
