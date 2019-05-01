package com.dzaki.sierra.shalatsunnah;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Deskripsi extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deskripsi);

        webView = findViewById(R.id.webView);

        Intent deskripsi = getIntent();

        String link = deskripsi.getStringExtra("salat");
        webView.getSettings().setLoadsImagesAutomatically(true);
        webView.loadUrl(link);


    }
}
