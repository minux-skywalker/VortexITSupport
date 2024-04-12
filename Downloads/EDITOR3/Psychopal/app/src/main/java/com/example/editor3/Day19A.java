package com.example.editor3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class Day19A extends AppCompatActivity {
    TextView t1,t2,t3,t4,t5,t6,t7,t8,t9;
    ImageView img1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day19);
        img1=(ImageView)findViewById(R.id.imageView11);
        t1=(TextView)findViewById(R.id.textView34);
        t2=(TextView)findViewById(R.id.textView41);
        t3=(TextView)findViewById(R.id.textView42);
        t4=(TextView)findViewById(R.id.textView43);
        t5=(TextView)findViewById(R.id.textView49);
        t6=(TextView)findViewById(R.id.textView45);
        t7=(TextView)findViewById(R.id.textView46);
        t8=(TextView)findViewById(R.id.textView47);
        t9=(TextView)findViewById(R.id.textView48);


        YoYo.with(Techniques.Landing).duration(3000).repeat(0).playOn(img1);
        YoYo.with(Techniques.Landing).duration(3000).repeat(0).playOn(t7);
        YoYo.with(Techniques.Landing).duration(3000).repeat(0).playOn(t8);
        YoYo.with(Techniques.Landing).duration(3000).repeat(0).playOn(t9);
        YoYo.with(Techniques.Landing).duration(3000).repeat(0).playOn(t6);
        YoYo.with(Techniques.Landing).duration(3000).repeat(0).playOn(t2);
        YoYo.with(Techniques.Landing).duration(3000).repeat(0).playOn(t5);
        YoYo.with(Techniques.Landing).duration(3000).repeat(0).playOn(t3);
        YoYo.with(Techniques.Landing).duration(3000).repeat(0).playOn(t4);
        YoYo.with(Techniques.ZoomInLeft).duration(3000).repeat(0).playOn(t1);
    }
}
