package com.example.dllo.lolproject.fragments.vediofragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dllo.lolproject.R;
import com.example.dllo.lolproject.adapters.AdapterForVideoRecyclerview;

/**
 * Created by dllo on 16/5/19.
 */
public class CommentateVedioFragment extends Fragment{

    private RecyclerView recyclerviewviewForVideocommentate;
    private AdapterForVideoRecyclerview adapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.vediocommentatepage,container,false);

        recyclerviewviewForVideocommentate= (RecyclerView) view.findViewById(R.id.recyclerviewviewForVideocommentate);
        adapter=new AdapterForVideoRecyclerview()



        return view;
    }
}
