package com.example.editor3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class Day12A extends AppCompatActivity {
TextView t1,t2,t3,t4,t5,t6,t7;
ImageView img1,img2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day12);
        img1=(ImageView)findViewById(R.id.imageView4);
        img2=(ImageView)findViewById(R.id.imageView5);
        t1=(TextView)findViewById(R.id.textView26);
        t2=(TextView)findViewById(R.id.textView20);
        t3=(TextView)findViewById(R.id.textView21);
        t4=(TextView)findViewById(R.id.textView23);
        t5=(TextView)findViewById(R.id.textView27);
        t6=(TextView)findViewById(R.id.textView1);
        t7=(TextView)findViewById(R.id.textView28);

        t1.setMovementMethod(LinkMovementMethod.getInstance());
        YoYo.with(Techniques.Bounce).duration(3000).repeat(100).playOn(t1);
        YoYo.with(Techniques.ZoomIn).duration(3000).repeat(0).playOn(t2);
        YoYo.with(Techniques.ZoomIn).duration(3000).repeat(0).playOn(t3);
        YoYo.with(Techniques.ZoomIn).duration(3000).repeat(0).playOn(t4);
        YoYo.with(Techniques.ZoomIn).duration(3000).repeat(0).playOn(t5);
        YoYo.with(Techniques.ZoomIn).duration(3000).repeat(0).playOn(t6);
        YoYo.with(Techniques.ZoomIn).duration(3000).repeat(0).playOn(t7);
        YoYo.with(Techniques.ZoomIn).duration(3000).repeat(0).playOn(img1);
        YoYo.with(Techniques.ZoomIn).duration(3000).repeat(0).playOn(img2);


    }
    @Override
    public void onBackPressed(){
        finish();
        super.onBackPressed();
    }

}
