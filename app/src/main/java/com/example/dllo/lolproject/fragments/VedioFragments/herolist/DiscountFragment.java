package com.example.dllo.lolproject.fragments.vediofragments.herolist;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dllo.lolproject.R;

/**
 * Created by dllo on 16/5/26.
 */
public class DiscountFragment extends Fragment{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.herolistweekfreefordiscount,container,false);

        return view;
    }
}
