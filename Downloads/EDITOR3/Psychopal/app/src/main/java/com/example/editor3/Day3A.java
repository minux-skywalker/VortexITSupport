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

public class Day3A extends AppCompatActivity {
    CheckBox c1, c2, c3, c4;
    Button b1;
    TextView t1;
    ImageView img1;
    int counter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day3);
        c1=(CheckBox)findViewById(R.id.checkBox);
        c2=(CheckBox)findViewById(R.id.checkBox2);
        c3=(CheckBox)findViewById(R.id.checkBox3);
        c4=(CheckBox)findViewById(R.id.checkBox4);
        img1=(ImageView)findViewById(R.id.imageView);
        t1=(TextView)findViewById(R.id.textView3);
        YoYo.with(Techniques.FlipInX).duration(3000).repeat(0).playOn(c1);
        YoYo.with(Techniques.FlipInX).duration(3000).repeat(0).playOn(c2);
        YoYo.with(Techniques.FlipInX).duration(3000).repeat(0).playOn(c3);
        YoYo.with(Techniques.FlipInX).duration(3000).repeat(0).playOn(c4);
        YoYo.with(Techniques.FlipInX).duration(3000).repeat(0).playOn(t1);
        img1=(ImageView)findViewById(R.id.imageView);
        YoYo.with(Techniques.Landing).duration(3000).repeat(0).playOn(img1);
        b1=(Button)findViewById(R.id.button2);
        YoYo.with(Techniques.ZoomInLeft).duration(3000).repeat(0).playOn(b1);
    }
    public void OnSelect(View v) {
        boolean checked = ((CheckBox) v).isChecked();
        switch (v.getId()) {
            case R.id.checkBox:
                if (checked) {
                    counter++;
                } else {
                    counter--;
                }
                break;
            case R.id.checkBox2:
                if (checked) {
                    counter++;
                } else {
                    counter--;
                }
                break;
            case R.id.checkBox3:
                if (checked) {
                    counter++;
                } else {
                    counter--;
                }
                break;
            case R.id.checkBox4:
                if (checked) {
                    counter++;
                } else {
                    counter--;
                }
                break;
}
    }
    public void done(View v) {
        if (counter == 4) {
            Toast.makeText(getApplicationContext(), "Activity Completed", Toast.LENGTH_SHORT).show();
            Intent i1=new Intent(getApplicationContext(),Dashboard.class);
            startActivity(i1);
            finish();
        } else {
            Toast.makeText(getApplicationContext(), "Please complete the activity", Toast.LENGTH_SHORT).show();
        }

    }
}