package com.example.dllo.lolproject.interfaces;

import com.android.volley.VolleyError;
import com.example.dllo.lolproject.bean.AllHeroBean;

/**
 * Created by dllo on 16/5/31.
 */
public interface ForMore<T> {


    void  onSuccess(T t);

    void  onFailed(VolleyError error);
}
