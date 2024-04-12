package com.example.editor3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class Day11A extends AppCompatActivity {
    int counter;
    TextView t1,t2;
    ImageView im1;
    CheckBox c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day11);
        t1=(TextView)findViewById(R.id.textView12);
        t2=(TextView)findViewById(R.id.textView14);
        im1=(ImageView) findViewById(R.id.imageView2);
        c1=(CheckBox)findViewById(R.id.checkBox10);
        c2=(CheckBox)findViewById(R.id.checkBox11);
        c3=(CheckBox)findViewById(R.id.checkBox12);
        c4=(CheckBox)findViewById(R.id.checkBox13);
        c5=(CheckBox)findViewById(R.id.checkBox14);
        c6=(CheckBox)findViewById(R.id.checkBox15);
        c7=(CheckBox)findViewById(R.id.checkBox16);
        c8=(CheckBox)findViewById(R.id.checkBox17);
        c9=(CheckBox)findViewById(R.id.checkBox18);
        c10=(CheckBox)findViewById(R.id.checkBox19);
        c11=(CheckBox)findViewById(R.id.checkBox20);
        c12=(CheckBox)findViewById(R.id.checkBox21);
        YoYo.with(Techniques.RotateIn).duration(3000).repeat(0).playOn(t1);
        YoYo.with(Techniques.RotateIn).pivot(3.0f,3.0f).duration(3000).repeat(0).playOn(t2);
        YoYo.with(Techniques.FlipInY).duration(3000).repeat(0).playOn(c1);
        YoYo.with(Techniques.FlipInY).duration(3000).repeat(0).playOn(c2);
        YoYo.with(Techniques.FlipInY).duration(3000).repeat(0).playOn(c3);
        YoYo.with(Techniques.FlipInY).duration(3000).repeat(0).playOn(c4);
        YoYo.with(Techniques.FlipInY).duration(3000).repeat(0).playOn(c5);
        YoYo.with(Techniques.FlipInY).duration(3000).repeat(0).playOn(c6);
        YoYo.with(Techniques.FlipInX).duration(3000).repeat(0).playOn(c7);
        YoYo.with(Techniques.FlipInX).duration(3000).repeat(0).playOn(c8);
        YoYo.with(Techniques.FlipInX).duration(3000).repeat(0).playOn(c9);
        YoYo.with(Techniques.FlipInX).duration(3000).repeat(0).playOn(c10);
        YoYo.with(Techniques.FlipInX).duration(3000).repeat(0).playOn(c11);
        YoYo.with(Techniques.FlipInX).duration(3000).repeat(0).playOn(c12);
        YoYo.with(Techniques.Landing).duration(3000).repeat(0).playOn(im1);
    }
    public void OnSelect(View v) {
        boolean checked = ((CheckBox) v).isChecked();
        switch (v.getId()) {
            case R.id.checkBox10:
                if (checked) {
                    counter++;
                } else {
                    counter--;
                }
                break;
            case R.id.checkBox11:
                if (checked) {
                    counter++;
                } else {
                    counter--;
                }
                break;
            case R.id.checkBox12:
                if (checked) {
                    counter++;
                } else {
                    counter--;
                }
                break;
            case R.id.checkBox13:
                if (checked) {
                    counter++;
                } else {
                    counter--;
                }
                break;
            case R.id.checkBox14:
                if (checked) {
                    counter++;
                } else {
                    counter--;
                }
                break;
            case R.id.checkBox15:
                if (checked) {
                    counter++;
                } else {
                    counter--;
                }
                break;
            case R.id.checkBox16:
                if (checked) {
                    counter++;
                } else {
                    counter--;
                }
                break;
            case R.id.checkBox17:
                if (checked) {
                    counter++;
                } else {
                    counter--;
                }
                break;
            case R.id.checkBox18:
                if (checked) {
                    counter++;
                } else {
                    counter--;
                }
                break;
            case R.id.checkBox19:
                if (checked) {
                    counter++;
                } else {
                    counter--;
                }
                break;
            case R.id.checkBox20:
                if (checked) {
                    counter++;
                } else {
                    counter--;
                }
                break;
            case R.id.checkBox21:
                if (checked) {
                    counter++;
                } else {
                    counter--;
                }
                break;
        }


    }
    public void done(View v) {
        if (counter == 12) {
            Toast.makeText(getApplicationContext(), "Activity Completed", Toast.LENGTH_SHORT).show();
            Intent i1=new Intent(getApplicationContext(),Dashboard.class);
            startActivity(i1);
            finish();
        } else {
            Toast.makeText(getApplicationContext(), "Please complete the activity", Toast.LENGTH_SHORT).show();
        }

    }

}
