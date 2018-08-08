package com.hackintoshpolska.adrox.drawertest;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class HomePageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        WebView WebViewHome = (WebView) findViewById(R.id.homewebview);

        WebSettings webSettings = WebViewHome.getSettings();
        webSettings.setJavaScriptEnabled(true);

        WebViewHome.loadUrl("https://hackintosh-polska.pl");
    }
}

