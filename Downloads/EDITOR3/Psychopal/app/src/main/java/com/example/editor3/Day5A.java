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

public class Day5A extends AppCompatActivity {
    int counter;
    TextView t1,t2,t3,t4,t5,t6;
    CheckBox c1;
    Button b1;
    ImageView i1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day5);
        c1=(CheckBox)findViewById(R.id.checkBox8);
        b1=(Button)findViewById(R.id.button2);
        t1=(TextView)findViewById(R.id.textView7);
        t2=(TextView)findViewById(R.id.textView3);
        t3=(TextView)findViewById(R.id.textView4);
        t4=(TextView)findViewById(R.id.textView6);
        t5=(TextView)findViewById(R.id.textView);
        t6=(TextView)findViewById(R.id.textView2);
        i1=(ImageView)findViewById(R.id.imageView);
        YoYo.with(Techniques.Landing).duration(3000).repeat(0).playOn(i1);
        YoYo.with(Techniques.FlipInX).duration(3000).repeat(0).playOn(c1);
        YoYo.with(Techniques.Tada).duration(3000).repeat(0).playOn(t6);
        YoYo.with(Techniques.FadeIn).duration(3000).repeat(0).playOn(t2);
        YoYo.with(Techniques.FadeIn).duration(3000).repeat(0).playOn(t5);
        YoYo.with(Techniques.FadeIn).duration(3000).repeat(0).playOn(t3);
        YoYo.with(Techniques.FadeIn).duration(3000).repeat(0).playOn(t4);
        YoYo.with(Techniques.FadeIn).duration(3000).repeat(0).playOn(t1);
        YoYo.with(Techniques.RubberBand).duration(3000).repeat(0).playOn(b1);
    }
    public void OnSelect(View v) {
        boolean checked = ((CheckBox) v).isChecked();
        switch (v.getId()) {
            case R.id.checkBox8:
                if (checked) {
                    counter++;
                } else {
                    counter--;
                }
                break;}}
    public void done(View v) {
        if (counter == 1) {
            Toast.makeText(getApplicationContext(), "Activity Completed", Toast.LENGTH_SHORT).show();
            Intent i1=new Intent(getApplicationContext(),Dashboard.class);
            startActivity(i1);
            finish();
        } else {
            Toast.makeText(getApplicationContext(), "Please complete the activity", Toast.LENGTH_SHORT).show();
        }

    }
}
