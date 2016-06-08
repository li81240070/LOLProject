package com.example.dllo.lolproject.fragments.more10activity;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.dllo.lolproject.R;
import com.example.dllo.lolproject.tools.MyAPP;
import com.squareup.picasso.Picasso;

/**
 * Created by dllo on 16/6/8.
 */
public class More10MusicIntnet extends Activity{

    private ImageView more11IntentPicture;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.more10musicintent);
        more11IntentPicture= (ImageView) findViewById(R.id.more10IntentPicture);


        Intent intent=getIntent();
      String picturedata=  intent.getStringExtra("picturedata");

        Picasso.with(MyAPP.context).load(picturedata).into(more11IntentPicture);




    }
    @Override
    protected void onResume() {
        if(getRequestedOrientation()!= ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE){
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        }
        super.onResume();
    }
}
