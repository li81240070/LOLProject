package com.example.dllo.lolproject.thesecondflor;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.android.volley.VolleyError;
import com.example.dllo.lolproject.R;
import com.example.dllo.lolproject.adapters.AdapterForVideoIntentListview;
import com.example.dllo.lolproject.bean.OtherVideoIntentBean;
import com.example.dllo.lolproject.bean.VideoBeanForPic;
import com.example.dllo.lolproject.interfaces.GetNetDataPic;
import com.example.dllo.lolproject.interfaces.VideoIntent;
import com.example.dllo.lolproject.tools.MyAPP;
import com.example.dllo.lolproject.tools.Volley;
import com.example.dllo.lolproject.tools.VolleyForPic;
import com.example.dllo.lolproject.tools.VolleyForVideoIntent;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by dllo on 16/5/27.
 */
public class other extends Activity{
    private ImageView videoIntentPicture;
    private TextView videoIntentName,videoIntentDesc;
    private ListView videoIntentListview;
    private AdapterForVideoIntentListview adapter;
    private String urlAdress ="http://lol.zhangyoubao.com/apis/rest/ItemsService/videos?catwordid=146&page=1&i_=EAC1B788-00BC-454A-A9B9-460852CFC011&t_=1438760575&p_=4070&v_=40050303&d_=ios&osv_=8.3&version=0&a_=lol";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.videointentinother);
        adapter=new AdapterForVideoIntentListview(getBaseContext());
        videoIntentListview= (ListView) findViewById(R.id.videoIntentListview);
        videoIntentPicture= (ImageView) findViewById(R.id.videoIntentPicture);
        videoIntentDesc= (TextView) findViewById(R.id.videoIntentDesc);
        videoIntentName= (TextView) findViewById(R.id.videoIntentName);

        Intent intent=getIntent();
     String VideoUrlForName=intent.getStringExtra("VideoUrlForName");
        String VideoUrlForDesc=intent.getStringExtra("VideoUrlForDesc");
        String VideoUrlForPicture=intent.getStringExtra("VideoUrlForPicture");
        String VideoId=intent.getStringExtra("VideoId");
        String urlAdress ="http://lol.zhangyoubao.com/apis/rest/ItemsService/videos?catwordid="+VideoId+"&page=1&i_=EAC1B788-00BC-454A-A9B9-460852CFC011&t_=1438760163&p_=2834&v_=40050303&d_=ios&osv_=8.3&version=0&a_=lol";


        videoIntentName.setText(VideoUrlForName);
        videoIntentDesc.setText(VideoUrlForDesc);
        Picasso.with(MyAPP.context).load(VideoUrlForPicture).into(videoIntentPicture);

        VolleyForVideoIntent volleyForVideoIntent=new VolleyForVideoIntent();
        volleyForVideoIntent.getVideoIntentData(urlAdress, new VideoIntent() {
            @Override
            public void onSuccess(OtherVideoIntentBean otherVideoIntentBean) {
                List<OtherVideoIntentBean.DataBean>data=otherVideoIntentBean.getData();


                adapter.setData(data);
                videoIntentListview.setAdapter(adapter);

            }

            @Override
            public void onFailed(VolleyError error) {

            }
        });



        videoIntentListview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long myPosition) {

                Intent intent1=new Intent();
                String a="http://video.magnet.zhangyoubao.com/apis/rest/VideoService/get?cache=0&params[ver]=0&id="+myPosition+"&userId=23372828&token=124ed620f45642a19ac055296e55e1c1a0&i_=04:e6:76:88:95:96&t_=1464420168829&p_=28832&v_=400801&a_=lol&pkg_=com.anzogame.lol&d_=android&osv_=21&u_=23372828&modle_=N1&%20HTTP/1.1";
                intent1.putExtra("VideoPlayerUrl",a);
                intent1.setClass(other.this,VideoPlayer.class);


                startActivity(intent1);



            }
        });





    }


}
