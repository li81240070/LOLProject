package com.example.dllo.lolproject.interfaces;

import com.android.volley.VolleyError;
import com.example.dllo.lolproject.bean.AllHeroBean;
import com.example.dllo.lolproject.bean.VideoPlayerAdressBean;

/**
 * Created by dllo on 16/5/28.
 */
public interface ForPlayerAdress {


    void  onSuccess(VideoPlayerAdressBean videoPlayerAdressBean);

    void  onFailed(VolleyError error);
}
