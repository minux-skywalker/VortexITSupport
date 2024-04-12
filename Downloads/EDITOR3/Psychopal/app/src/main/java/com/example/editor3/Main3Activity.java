package com.example.editor3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class Main3Activity extends AppCompatActivity {
    CardView c1,c2,c3,c4,c5,c6,c7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        c1=(CardView)findViewById(R.id.day15);
        YoYo.with(Techniques.FlipInX).duration(3000).repeat(0).playOn(c1);
        c2=(CardView)findViewById(R.id.day16);
        YoYo.with(Techniques.FlipInX).duration(3000).repeat(0).playOn(c2);
        c3=(CardView)findViewById(R.id.day17);
        YoYo.with(Techniques.FlipInX).duration(3000).repeat(0).playOn(c3);
        c4=(CardView)findViewById(R.id.day18);
        YoYo.with(Techniques.FlipInX).duration(3000).repeat(0).playOn(c4);
        c5=(CardView)findViewById(R.id.day19);
        YoYo.with(Techniques.FlipInX).duration(3000).repeat(0).playOn(c5);
        c6=(CardView)findViewById(R.id.day20);
        YoYo.with(Techniques.FlipInX).duration(3000).repeat(0).playOn(c6);
        c7=(CardView)findViewById(R.id.day21);
        YoYo.with(Techniques.FlipInX).duration(3000).repeat(0).playOn(c7);

    }
    public void day15(View view)
    {
        Intent i1=new Intent(getApplicationContext(),Day15A.class);
        startActivity(i1);
    }
    public void day16(View view)
    {
        Intent i1=new Intent(getApplicationContext(),Day16A.class);
        startActivity(i1);
    }
    public void day17(View view)
    {
        Intent i1=new Intent(getApplicationContext(),Day17A.class);
        startActivity(i1);
    }
    public void day18(View view)
    {
        Intent i1=new Intent(getApplicationContext(),Day18A.class);
        startActivity(i1);
    }
    public void day19(View view)
    {
        Intent i1=new Intent(getApplicationContext(),Day19A.class);
        startActivity(i1);
    }
    public void day20(View view)
    {
        Intent i1=new Intent(getApplicationContext(),Day20A.class);
        startActivity(i1);
    }
    public void day21(View view)
    {
        Intent i1=new Intent(getApplicationContext(),Day21A.class);
        startActivity(i1);
    }
}
