package com.hackintoshpolska.adrox.drawertest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        WebView WebViewTutorials = (WebView) findViewById(R.id.homeweb);

        WebSettings webSettings = WebViewTutorials.getSettings();
        webSettings.setJavaScriptEnabled(true);

        WebViewTutorials.loadUrl("https://hackintosh-polska.pl");

    }

}
