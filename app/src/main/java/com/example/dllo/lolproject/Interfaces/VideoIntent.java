package com.example.dllo.lolproject.interfaces;

import com.android.volley.VolleyError;
import com.example.dllo.lolproject.bean.AllHeroBean;
import com.example.dllo.lolproject.bean.OtherVideoIntentBean;

/**
 * Created by dllo on 16/5/28.
 */
public interface VideoIntent {

    void  onSuccess(OtherVideoIntentBean otherVideoIntentBean);

    void  onFailed(VolleyError error);
}
