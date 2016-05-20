package com.example.dllo.lolproject.Bean;

import android.support.v4.app.Fragment;

/**
 * Created by dllo on 16/5/19.
 */
public class MainActivityFragmentBean {

    private Fragment CommunityFragment,HeroListFragment,MoreFragment,NewsFragment,VedioFragment;


    public MainActivityFragmentBean(Fragment communityFragment, Fragment heroListFragment, Fragment moreFragment, Fragment newsFragment, Fragment vedioFragment) {
        CommunityFragment = communityFragment;
        HeroListFragment = heroListFragment;
        MoreFragment = moreFragment;
        NewsFragment = newsFragment;
        VedioFragment = vedioFragment;
    }

    public MainActivityFragmentBean() {
    }

    public Fragment getCommunityFragment() {
        return CommunityFragment;
    }


    public void setCommunityFragment(Fragment communityFragment) {
        CommunityFragment = communityFragment;
    }

    public Fragment getHeroListFragment() {
        return HeroListFragment;
    }

    public void setHeroListFragment(Fragment heroListFragment) {
        HeroListFragment = heroListFragment;
    }

    public Fragment getMoreFragment() {
        return MoreFragment;
    }

    public void setMoreFragment(Fragment moreFragment) {
        MoreFragment = moreFragment;
    }

    public Fragment getNewsFragment() {
        return NewsFragment;
    }

    public void setNewsFragment(Fragment newsFragment) {
        NewsFragment = newsFragment;
    }

    public Fragment getVedioFragment() {
        return VedioFragment;
    }

    public void setVedioFragment(Fragment vedioFragment) {
        VedioFragment = vedioFragment;
    }
}
