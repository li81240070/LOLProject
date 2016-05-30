package com.example.dllo.lolproject.interfaces;

import com.android.volley.VolleyError;
import com.example.dllo.lolproject.bean.AllHeroBean;
import com.example.dllo.lolproject.bean.ShowHowToPlayBean;

/**
 * Created by dllo on 16/5/30.
 */
public interface ShowHowToPlay {


    void  onSuccess(ShowHowToPlayBean showHowToPlayBean);

    void  onFailed(VolleyError error);

}
