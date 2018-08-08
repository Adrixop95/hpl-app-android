package com.hackintoshpolska.adrox.drawertest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class HomePageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
    }


    public void homeWV(){
        WebView WebViewHome = (WebView) findViewById(R.id.homewebview);
        WebViewHome.loadUrl("https://hackintosh-polska.pl");
    }

}

