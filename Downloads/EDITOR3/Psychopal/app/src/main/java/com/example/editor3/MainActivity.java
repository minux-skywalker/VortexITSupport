package com.example.editor3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class MainActivity extends AppCompatActivity {

    CardView c1,c2,c3,c4,c5,c6,c7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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



    public void onClick8(View view) {
        Intent i1 = new Intent(getApplicationContext(), Day8A.class);
        startActivity(i1);
    }
    public void onClick9(View view) {
        Intent i1 = new Intent(getApplicationContext(), Day9A.class);
        startActivity(i1);
    }
    public void onClick10(View view) {
        Intent i1 = new Intent(getApplicationContext(), Day10A.class);
        startActivity(i1);
    }
    public void onClick11(View view) {
        Intent i1 = new Intent(getApplicationContext(), Day11A.class);
        startActivity(i1);
    }
    public void onClick12(View view) {
        Intent i1 = new Intent(getApplicationContext(), Day12A.class);
        startActivity(i1);
    }
        public void onClick13(View view) {
            Intent i1 = new Intent(getApplicationContext(), Day13A.class);
            startActivity(i1);
    }
    public void onClick14(View view) {
        Intent i1 = new Intent(getApplicationContext(), Day14A.class);
        startActivity(i1);
    }
}