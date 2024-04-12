package com.example.editor3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class Main2Activity extends AppCompatActivity {
    CardView c1,c2,c3,c4,c5,c6,c7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        c1=(CardView)findViewById(R.id.Day8);
        YoYo.with(Techniques.FlipInX).duration(3000).repeat(0).playOn(c1);
        c2=(CardView)findViewById(R.id.Day2);
        YoYo.with(Techniques.FlipInX).duration(3000).repeat(0).playOn(c2);
        c3=(CardView)findViewById(R.id.Day3);
        YoYo.with(Techniques.FlipInX).duration(3000).repeat(0).playOn(c3);
        c4=(CardView)findViewById(R.id.Day4);
        YoYo.with(Techniques.FlipInX).duration(3000).repeat(0).playOn(c4);
        c5=(CardView)findViewById(R.id.Day51);
        YoYo.with(Techniques.FlipInX).duration(3000).repeat(0).playOn(c5);
        c6=(CardView)findViewById(R.id.Day6);
        YoYo.with(Techniques.FlipInX).duration(3000).repeat(0).playOn(c6);
        c7=(CardView)findViewById(R.id.Day7);
        YoYo.with(Techniques.FlipInX).duration(3000).repeat(0).playOn(c7);

    }
    public void onClick(View view){
        Intent i1=new Intent(getApplicationContext(),MainActivity.class);
        startActivity(i1);
    }
    public void onClick2(View view){
        Intent i1=new Intent(getApplicationContext(),Day1A.class);
        startActivity(i1);
            }
    public void onClick3(View view){
        Intent i1=new Intent(getApplicationContext(),Day2A.class);
        startActivity(i1);
}
    public void onClick4(View view){
        Intent i1=new Intent(getApplicationContext(),Day3A.class);
        startActivity(i1);

    }public void onClick5(View view){
        Intent i1=new Intent(getApplicationContext(),Day4A.class);
        startActivity(i1);

    }
    public void onClick6(View view){
        Intent i1=new Intent(getApplicationContext(),Day5A.class);
        startActivity(i1);

    }
    public void onClick7(View view){
        Intent i1=new Intent(getApplicationContext(),Day6A.class);
        startActivity(i1);

    }
    public void onClick8(View view){
        Intent i1=new Intent(getApplicationContext(),Day7A.class);
        startActivity(i1);

    }
    }
