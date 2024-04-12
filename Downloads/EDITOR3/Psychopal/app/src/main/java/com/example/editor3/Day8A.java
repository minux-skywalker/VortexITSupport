package com.example.editor3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class Day8A extends AppCompatActivity {
    WebView wb;
    TextView t1,t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day8);
        t1=(TextView)findViewById(R.id.textViewa5);
        t2=(TextView)findViewById(R.id.textViewa9);
        wb = (WebView) findViewById(R.id.webview);
        YoYo.with(Techniques.Landing).duration(8000).repeat(0).playOn(wb);
        YoYo.with(Techniques.FlipInX).duration(3000).repeat(0).playOn(t2);
        YoYo.with(Techniques.Tada).duration(3000).repeat(0).playOn(t1);

        wb.setWebViewClient(new WebViewClient());
        wb.loadUrl("https://www.higherawareness.com/awareness-level-test.php");
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
