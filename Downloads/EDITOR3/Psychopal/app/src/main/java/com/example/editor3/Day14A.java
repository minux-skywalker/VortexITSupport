package com.example.editor3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class Day14A extends AppCompatActivity {
    TextView t1,t2,t3,t4,t5,t6,t7,t8,t9;
    ImageView img1,img2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day14);
        img1=(ImageView)findViewById(R.id.imageView10);
        img2=(ImageView)findViewById(R.id.imageView15);
        t1=(TextView)findViewById(R.id.textView17);
        t2=(TextView)findViewById(R.id.textView50);
        t3=(TextView)findViewById(R.id.textView66);
        t4=(TextView)findViewById(R.id.textView67);
        t5=(TextView)findViewById(R.id.textView68);
        t6=(TextView)findViewById(R.id.textView69);
        t7=(TextView)findViewById(R.id.textView70);
        t8=(TextView)findViewById(R.id.textView71);
        t9=(TextView)findViewById(R.id.textView65);
        YoYo.with(Techniques.Landing).duration(3000).repeat(0).playOn(img1);
        YoYo.with(Techniques.Landing).duration(3000).repeat(0).playOn(img2);
        YoYo.with(Techniques.FlipInX).duration(3000).repeat(0).playOn(t7);
        YoYo.with(Techniques.FlipInX).duration(3000).repeat(0).playOn(t8);
        YoYo.with(Techniques.FlipInX).duration(3000).repeat(0).playOn(t9);
        YoYo.with(Techniques.FlipInX).duration(3000).repeat(0).playOn(t6);
        YoYo.with(Techniques.FlipInX).duration(3000).repeat(0).playOn(t2);
        YoYo.with(Techniques.FlipInX).duration(3000).repeat(0).playOn(t5);
        YoYo.with(Techniques.FlipInX).duration(3000).repeat(0).playOn(t3);
        YoYo.with(Techniques.FlipInX).duration(3000).repeat(0).playOn(t4);
        YoYo.with(Techniques.Tada).duration(3000).repeat(0).playOn(t1);

    }
}
