package com.example.editor3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class Day13A extends AppCompatActivity {
TextView t1,t2,t3,t4,t5;
ImageView im3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day13);
        im3=(ImageView)findViewById(R.id.imageView3);
        t1=(TextView)findViewById(R.id.textView25);
        t2=(TextView)findViewById(R.id.textView16);
        t3=(TextView)findViewById(R.id.textView19);
        t4=(TextView)findViewById(R.id.textView24);
        t5=(TextView)findViewById(R.id.textView13);
        YoYo.with(Techniques.Landing).duration(3000).repeat(0).playOn(im3);
        YoYo.with(Techniques.Wave).duration(3000).repeat(0).playOn(t2);
        YoYo.with(Techniques.Wave).duration(3000).repeat(0).playOn(t3);
        YoYo.with(Techniques.Wave).duration(3000).repeat(0).playOn(t4);
        YoYo.with(Techniques.Wave).duration(3000).repeat(0).playOn(t5);
        YoYo.with(Techniques.Bounce).duration(3000).repeat(100).playOn(t1);
        t1.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
