package com.example.editor3;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class Day16A extends AppCompatActivity {
int counter=0;
TextView t1,t2,t3,t4,t5,t6;
ImageView img1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day16);
        MediaPlayer player = MediaPlayer.create(this, R.raw.fbnot);
        final MediaPlayer player2 = MediaPlayer.create(this, R.raw.twitters);
        img1=(ImageView)findViewById(R.id.imageView6);
        t1=(TextView)findViewById(R.id.textView9);
        t2=(TextView)findViewById(R.id.textView22);
        t3=(TextView)findViewById(R.id.textView23);
        t4=(TextView)findViewById(R.id.textView24);
        t5=(TextView)findViewById(R.id.textView25);
        t6=(TextView)findViewById(R.id.textView26);
        YoYo.with(Techniques.Landing).duration(3000).repeat(0).playOn(img1);

        YoYo.with(Techniques.Tada).duration(3000).repeat(0).playOn(t6);
        YoYo.with(Techniques.FadeIn).duration(3000).repeat(0).playOn(t2);
        YoYo.with(Techniques.FadeIn).duration(3000).repeat(0).playOn(t5);
        YoYo.with(Techniques.Landing).duration(3000).repeat(0).playOn(t3);
        YoYo.with(Techniques.Landing).duration(3000).repeat(0).playOn(t4);
        YoYo.with(Techniques.ZoomInLeft).duration(3000).repeat(0).playOn(t1);

                player.start();
                player.setLooping(false);
        Thread timer=new Thread(){
            public void run(){
                try{
                    sleep(2000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                finally {
                    player2.start();
                    player2.setLooping(false);

                }
            }
        };
        timer.start();
    }




}
