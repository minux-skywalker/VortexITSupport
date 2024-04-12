package com.example.editor3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class main_launcher extends AppCompatActivity {
private TextView t1,t2;
ImageView im1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_launcher);
        t1=(TextView)findViewById(R.id.textView72);
        t2=(TextView)findViewById(R.id.textView73);
        Animation mynaim= AnimationUtils.loadAnimation(this,R.anim.mytrans);
        Animation mynaim1= AnimationUtils.loadAnimation(this,R.anim.bottom);
        Animation mynaim2= AnimationUtils.loadAnimation(this,R.anim.just);
        im1=(ImageView)findViewById(R.id.imageView17);
        t1.startAnimation(mynaim);
        t2.startAnimation(mynaim2);
        t1.startAnimation(mynaim1);
        im1.startAnimation(mynaim);
        im1.startAnimation(mynaim1);
       final Intent i1=new Intent(getApplicationContext(),Dashboard.class);
       Thread timer=new Thread(){
            public void run(){
                try{
                    sleep(5000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                finally {
                startActivity(i1);
                finish();
                }
            }
        };
        timer.start();
    }
}
