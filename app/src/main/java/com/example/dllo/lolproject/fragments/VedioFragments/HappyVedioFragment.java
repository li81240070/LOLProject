package com.example.dllo.lolproject.fragments.vediofragments;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
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
import com.example.dllo.lolproject.bean.VideoRecyclerviewBean;
import com.example.dllo.lolproject.interfaces.GetNetDataPic;
import com.example.dllo.lolproject.tools.VolleyForPic;

import java.io.InputStream;
import java.util.ArrayList;

/**
 * Created by dllo on 16/5/19.
 */
public class HappyVedioFragment extends Fragment{
    private RecyclerView recyclerviewviewForVideoHappy;
    private AdapterForVideoRecyclerview adapter;
    private ArrayList<VideoRecyclerviewBean>data;

    private  Bitmap bitmap;
    private ArrayList<String>picurlData;



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.vediohappypage, container, false);

        recyclerviewviewForVideoHappy = (RecyclerView) view.findViewById(R.id.recyclerviewviewForVideoHappy);
        adapter = new AdapterForVideoRecyclerview(getContext());

        picurlData=new ArrayList<>();


        //解析数据
        VolleyForPic volleyForPic=new VolleyForPic();
        volleyForPic.getNetData(NetDataAdress.VideoAdress, new GetNetDataPic() {
            @Override
            public void onSuccess(VideoBeanForPic videoBeanForPic) {

                for (int i = 0; i < videoBeanForPic.getData().get(0).getCatword_id().size(); i++) {


                  picurlData.add(videoBeanForPic.getData().get(0).getCatword_id().get(i).getPic_url());


                }

            }

            @Override
            public void onFailed(VolleyError error) {

            }
        });





        return view;
    }}
