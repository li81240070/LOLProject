package com.example.dllo.lolproject.thesecondflor;

import android.app.Activity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.VideoView;

import com.android.volley.VolleyError;
import com.example.dllo.lolproject.R;
import com.example.dllo.lolproject.bean.VideoPlayerAdressBean;
import com.example.dllo.lolproject.fragments.vediofragments.MyVedioView;
import com.example.dllo.lolproject.interfaces.ForPlayerAdress;
import com.example.dllo.lolproject.tools.MyAPP;
import com.example.dllo.lolproject.tools.VolleyForPlayerAdress;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Target;

import java.util.List;

/**
 * Created by dllo on 16/5/28.
 */
public class VideoPlayer extends Activity{
    private MyVedioView videoviewInVideoPlayer;
    private ImageView pictureInVideoPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.videoplayerpage);

        Intent intent=getIntent();

       String playerUrl=intent.getStringExtra("VideoPlayerUrl");

       // pictureInVideoPlayer= (ImageView) findViewById(R.id.pictureInVideoPlayer);



        //解析网站地址
        VolleyForPlayerAdress volleyForPlayerAdress=new VolleyForPlayerAdress();
        volleyForPlayerAdress.getPlayerAdress(playerUrl, new ForPlayerAdress() {
            @Override
            public void onSuccess(VideoPlayerAdressBean videoPlayerAdressBean) {

                String adress=videoPlayerAdressBean.getData().getVideo_urls().getSd();

                videoviewInVideoPlayer= (MyVedioView) findViewById(R.id.videoviewInVideoPlayer);

                Uri uri=Uri.parse(adress);
               // Picasso.with(MyAPP.context).load(videoPlayerAdressBean.getData().getImage_url()).into(pictureInVideoPlayer);

                videoviewInVideoPlayer.setMediaController(new MediaController(VideoPlayer.this));
                videoviewInVideoPlayer.setVideoURI(uri);


                //videoviewInVideoPlayer.start();
                videoviewInVideoPlayer.requestFocus();

            }

            @Override
            public void onFailed(VolleyError error) {

            }
        });







    }

    @Override
    protected void onResume() {
        if(getRequestedOrientation()!= ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE){
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        }
        super.onResume();
    }
}
