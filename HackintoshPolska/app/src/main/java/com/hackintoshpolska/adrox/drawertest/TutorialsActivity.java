package com.hackintoshpolska.adrox.drawertest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class TutorialsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorials);
    }


    public void homeWV(){
        WebView WebViewHome = (WebView) findViewById(R.id.tutorweb);
        WebViewHome.loadUrl("https://poradniki-hackintosh-polska.pl");
    }}
