package com.example.dllo.lolproject.fragments.vediofragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.volley.VolleyError;
import com.example.dllo.lolproject.NetDataAdress;
import com.example.dllo.lolproject.R;
import com.example.dllo.lolproject.adapters.AdapterForVideoRecyclerview;
import com.example.dllo.lolproject.bean.VideoBeanForPic;
import com.example.dllo.lolproject.interfaces.GetNetDataPic;
import com.example.dllo.lolproject.tools.VolleyForPic;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dllo on 16/5/19.
 */
public class GamematchVedioFragment extends Fragment{
    private RecyclerView recyclerviewviewForVideoGamematch;
    private AdapterForVideoRecyclerview adapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.vediogamematchpage,container,false);
        recyclerviewviewForVideoGamematch= (RecyclerView) view.findViewById(R.id.recyclerviewviewForVideoGamematch);
        adapter=new AdapterForVideoRecyclerview(getContext());

        VolleyForPic volleyForPic=new VolleyForPic();
        volleyForPic.getNetData(NetDataAdress.VideoAdress, new GetNetDataPic() {
            @Override
            public void onSuccess(VideoBeanForPic videoBeanForPic) {
                List<VideoBeanForPic.DataBean.CatwordIdBean> data=videoBeanForPic.getData().get(1).getCatword_id();
                adapter.setData(data);

                recyclerviewviewForVideoGamematch.setLayoutManager(new StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL));
                recyclerviewviewForVideoGamematch.setAdapter(adapter);



            }

            @Override
            public void onFailed(VolleyError error) {

            }
        });




        return  view;
    }
}
