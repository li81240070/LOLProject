package com.example.dllo.lolproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.volley.VolleyError;
import com.example.dllo.lolproject.bean.VideoBeanForPic;
import com.example.dllo.lolproject.interfaces.GetNetDataPic;
import com.example.dllo.lolproject.tools.MyAPP;
import com.example.dllo.lolproject.tools.Volley;
import com.example.dllo.lolproject.tools.VolleyForPic;
import com.squareup.picasso.Picasso;

/**
 * Created by dllo on 16/5/27.
 */
public class other extends Activity{
    private ImageView videoIntentPicture;
    private TextView videoIntentName,videoIntentDesc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.videointentinother);
        videoIntentPicture= (ImageView) findViewById(R.id.videoIntentPicture);
        videoIntentDesc= (TextView) findViewById(R.id.videoIntentDesc);
        videoIntentName= (TextView) findViewById(R.id.videoIntentName);

        Intent intent=getIntent();
     String VideoUrlForName=intent.getStringExtra("VideoUrlForName");
        String VideoUrlForDesc=intent.getStringExtra("VideoUrlForDesc");
        String VideoUrlForPicture=intent.getStringExtra("VideoUrlForPicture");


        videoIntentName.setText(VideoUrlForName);
        videoIntentDesc.setText(VideoUrlForDesc);
        Picasso.with(MyAPP.context).load(VideoUrlForPicture).into(videoIntentPicture);










    }
}
