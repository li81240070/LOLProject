package com.example.dllo.lolproject;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;

/**
 * Created by dllo on 16/5/27.
 */
public class WebviewForNews extends Activity implements View.OnClickListener {
    private WebView wenWebViewForNews;
    private Button buttonForBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        setContentView(R.layout.webviewfornewnews);
        buttonForBack= (Button) findViewById(R.id.backButtonInWebview);
        Intent intent=getIntent();
        String webviewForNewsUrl=intent.getStringExtra("urlForNews");

        //添加返回按钮的返回事件
        buttonForBack.setOnClickListener(this);



        wenWebViewForNews= (WebView) findViewById(R.id.webviewForNewNewsView);
        wenWebViewForNews.getSettings().setJavaScriptEnabled(true);
        wenWebViewForNews.setScrollBarStyle(0);
        WebSettings webSettings=wenWebViewForNews.getSettings();
        webSettings.setAllowFileAccess(true);
        webSettings.setBuiltInZoomControls(true);
        wenWebViewForNews.loadUrl(webviewForNewsUrl);
        //加载数据
        wenWebViewForNews.setWebChromeClient(new WebChromeClient(){

            @Override
            public void onProgressChanged(WebView view, int newProgress) {
                if (newProgress==100){

                    WebviewForNews.this.setTitle("加载完成");
                }else{
                    WebviewForNews.this.setTitle("加载中....");
                }
            }
        });

//        Uri uri=Uri.parse(webviewForNewsUrl);
//        Intent it=new Intent(Intent.ACTION_VIEW,uri);
//        startActivity(it);
 }


    @Override
    public void onClick(View v) {

        finish();

    }
}
