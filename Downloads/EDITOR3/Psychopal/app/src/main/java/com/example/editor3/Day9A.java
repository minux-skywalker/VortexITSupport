package com.example.editor3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class Day9A extends AppCompatActivity {
    WebView wb;
    TextView t1,t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day9);
        wb = (WebView) findViewById(R.id.webview);
        t1=(TextView)findViewById(R.id.textView10);
        t2=(TextView)findViewById(R.id.textView11);
        YoYo.with(Techniques.Landing).duration(8000).repeat(0).playOn(wb);
        YoYo.with(Techniques.FlipInX).duration(3000).repeat(0).playOn(t2);
        YoYo.with(Techniques.Tada).duration(3000).repeat(0).playOn(t1);
        wb.setWebViewClient(new WebViewClient());
        wb.loadUrl("https://stylesatlife.com/articles/best-yoga-asanas/");
        WebSettings wbs=wb.getSettings();
        wbs.setJavaScriptEnabled(true);
    }
    @Override
    public void onBackPressed() {
        if (wb.canGoBack()) {
            wb.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
