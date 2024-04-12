package com.example.editor3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class Day21A extends AppCompatActivity {
    TextView t1,t2,t3,t4,t5,t6,t7;
    ImageView img1;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day21);
        img1=(ImageView)findViewById(R.id.imageView14);
        t1=(TextView)findViewById(R.id.textView58);
        t2=(TextView)findViewById(R.id.textView59);
        t3=(TextView)findViewById(R.id.textView60);
        t4=(TextView)findViewById(R.id.textView61);
        t5=(TextView)findViewById(R.id.textView62);
        t6=(TextView)findViewById(R.id.textView63);
        t7=(TextView)findViewById(R.id.textView64);
        YoYo.with(Techniques.Landing).duration(3000).repeat(0).playOn(img1);
        YoYo.with(Techniques.Landing).duration(3000).repeat(0).playOn(t7);
        YoYo.with(Techniques.Landing).duration(3000).repeat(0).playOn(t6);
        YoYo.with(Techniques.Landing).duration(3000).repeat(0).playOn(t2);
        YoYo.with(Techniques.Landing).duration(3000).repeat(0).playOn(t5);
        YoYo.with(Techniques.Landing).duration(3000).repeat(0).playOn(t3);
        YoYo.with(Techniques.Landing).duration(3000).repeat(0).playOn(t4);
        YoYo.with(Techniques.ZoomInLeft).duration(3000).repeat(0).playOn(t1);
    }
}
