package com.example.editor3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class Day18A extends AppCompatActivity {
    TextView t1,t2,t3,t4,t5,t6;
    ImageView img1,img2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day18);
        img1=(ImageView)findViewById(R.id.imageView8);
        img2=(ImageView)findViewById(R.id.imageView9);
        t1=(TextView)findViewById(R.id.textView29);
        t2=(TextView)findViewById(R.id.textView2);
        t3=(TextView)findViewById(R.id.textView3);
        t4=(TextView)findViewById(R.id.textView4);
        t5=(TextView)findViewById(R.id.textView5);
        t6=(TextView)findViewById(R.id.textView1);
        YoYo.with(Techniques.Landing).duration(3000).repeat(0).playOn(img1);
        YoYo.with(Techniques.Landing).duration(3000).repeat(0).playOn(img2);
        YoYo.with(Techniques.Landing).duration(3000).repeat(0).playOn(t6);
        YoYo.with(Techniques.Landing).duration(3000).repeat(0).playOn(t2);
        YoYo.with(Techniques.Landing).duration(3000).repeat(0).playOn(t5);
        YoYo.with(Techniques.Landing).duration(3000).repeat(0).playOn(t3);
        YoYo.with(Techniques.Landing).duration(3000).repeat(0).playOn(t4);
        YoYo.with(Techniques.ZoomInLeft).duration(3000).repeat(0).playOn(t1);
      
    }
}
