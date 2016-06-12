package com.example.dllo.lolproject.fragments.more12activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.example.dllo.lolproject.R;

/**
 * Created by dllo on 16/6/12.
 */
public class More12NevolClass extends Activity{

    private WebView webView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.webviewfornewnews);


        Intent intent=getIntent();
       String a= intent.getStringExtra("more12WebId");
       String b= intent.getStringExtra("more12WebId2");

        webView= (WebView) findViewById(R.id.webviewForNewNewsView);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setScrollBarStyle(0);
        WebSettings webSettings=webView.getSettings();
        webSettings.setAllowFileAccess(true);
        webSettings.setBuiltInZoomControls(true);
        webView.loadUrl("http://lol.zhangyoubao.com/mobiles/item/"+a+"?v_=400801&token=124ed620f45642a19ac055296e55e1c1a0&user_id=23372828&size=middle&t=1465694529 HTTP/1.1");
        //加载数据
        webView.setWebChromeClient(new WebChromeClient(){

            @Override
            public void onProgressChanged(WebView view, int newProgress) {
                if (newProgress==100){

                    More12NevolClass.this.setTitle("加载完成");
                }else{
                    More12NevolClass.this.setTitle("加载中....");
                }
            }
        });



    }
}
