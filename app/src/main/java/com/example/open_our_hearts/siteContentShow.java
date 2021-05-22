package com.example.open_our_hearts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class siteContentShow extends AppCompatActivity {

    WebView siteView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_site_content_show);

        String url = getIntent().getExtras().getString("siteURL");
        int scroll = getIntent().getExtras().getInt("scroll");

        siteView = (WebView) findViewById(R.id.siteShow);
        siteView.getSettings().setJavaScriptEnabled(true);
        siteView.loadUrl(url);

        siteView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
            @Override
            public void onPageFinished(WebView view, String url) {
                //use the param "view", and call getContentHeight in scrollTo
                view.scrollTo(0, scroll);
            }
        });
    }
}