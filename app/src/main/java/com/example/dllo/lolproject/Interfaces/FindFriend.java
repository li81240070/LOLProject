package com.example.dllo.lolproject.interfaces;

import com.android.volley.VolleyError;
import com.example.dllo.lolproject.bean.FindFriendBean;
import com.example.dllo.lolproject.bean.VideoBeanForPic;

/**
 * Created by dllo on 16/5/30.
 */
public interface FindFriend {

    void  onSuccess(FindFriendBean findFriendBean);

    void onFailed(VolleyError error);
}
