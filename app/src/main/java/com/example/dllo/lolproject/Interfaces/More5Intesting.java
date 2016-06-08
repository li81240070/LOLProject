package com.example.dllo.lolproject.interfaces;

import com.android.volley.VolleyError;
import com.example.dllo.lolproject.bean.NewNewsJsonBeans;
import com.example.dllo.lolproject.bean.morebean.More5IntestingBean;

/**
 * Created by dllo on 16/6/8.
 */
public interface More5Intesting {
    void  onSuccess(More5IntestingBean more5IntestingBean);

    void onFailed(VolleyError error);
}
