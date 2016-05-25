package com.example.dllo.lolproject.tools;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.widget.ImageView;

import com.example.dllo.lolproject.NetDataAdress;

import org.greenrobot.eventbus.EventBus;

import java.io.IOException;

/**
 * Created by dllo on 16/5/24.
 */
public class Picasso extends AsyncTask<String,Void,Bitmap>{

    private Bitmap bitmap;
    private EventBus eventBus;





    @Override
    protected Bitmap doInBackground(String... params) {
        eventBus=EventBus.getDefault();


        try {
            bitmap=com.squareup.picasso.Picasso.with(MyAPP.context).load(params[0]).get();
        } catch (IOException e) {
            e.printStackTrace();
        }


        return bitmap;
    }

    @Override
    protected void onPostExecute(Bitmap bitmap) {
        super.onPostExecute(bitmap);

        if (bitmap!=null){

        eventBus.post(bitmap);

    }
}






}
