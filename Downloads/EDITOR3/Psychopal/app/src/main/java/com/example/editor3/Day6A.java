package com.example.editor3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class Day6A extends AppCompatActivity {
    TextView t1,t2,t3;
    CheckBox c1,c2;
    Button b1;
   int counter;
    ImageView i1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day6);
       c1=(CheckBox)findViewById(R.id.chbx9);
       c2=(CheckBox)findViewById(R.id.chbx11);
        b1=(Button)findViewById(R.id.button2);
        t1=(TextView)findViewById(R.id.textView);
        t2=(TextView)findViewById(R.id.textView2);
        t3=(TextView)findViewById(R.id.textView3);
        i1=(ImageView)findViewById(R.id.imageView);
        YoYo.with(Techniques.Landing).duration(3000).repeat(0).playOn(i1);
        YoYo.with(Techniques.FlipInX).duration(3000).repeat(0).playOn(c1);
        YoYo.with(Techniques.FlipInX).duration(3000).repeat(0).playOn(c2);
        YoYo.with(Techniques.Tada).duration(3000).repeat(0).playOn(t2);
        YoYo.with(Techniques.FadeIn).duration(3000).repeat(0).playOn(t3);
        YoYo.with(Techniques.FadeIn).duration(3000).repeat(0).playOn(t1);
        YoYo.with(Techniques.RubberBand).duration(3000).repeat(0).playOn(b1);
    }
    public void click(View v){
        boolean checked=((CheckBox)v).isChecked();
        switch (v.getId()){
            case R.id.chbx9:
                if(checked){
                    counter++;
                }else{
                    counter--;
                }
                break;
            case R.id.chbx11:
                if(checked){
                    counter++;
                }else{
                    counter--;
                }
                break;
        }
    }
    public void done(View v) {
        if (counter == 2) {
            Toast.makeText(getApplicationContext(), "Activity Completed", Toast.LENGTH_SHORT).show();
            Intent i1=new Intent(getApplicationContext(),Dashboard.class);
            startActivity(i1);
            finish();
        } else {
            Toast.makeText(getApplicationContext(), "Please complete the activity", Toast.LENGTH_SHORT).show();
        }

    }
}