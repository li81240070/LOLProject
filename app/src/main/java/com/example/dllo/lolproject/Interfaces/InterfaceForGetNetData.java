package com.example.dllo.lolproject.interfaces;

import com.android.volley.VolleyError;
import com.example.dllo.lolproject.bean.NewNewsJsonBeans;

/**
 * Created by dllo on 16/5/24.
 */
public interface InterfaceForGetNetData {

    void  onSuccess(NewNewsJsonBeans newNewsJsonBeans1);

    void onFailed(VolleyError error);
}
