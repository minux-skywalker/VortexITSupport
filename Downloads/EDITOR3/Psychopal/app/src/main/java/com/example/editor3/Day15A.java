package com.example.editor3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.TextView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class Day15A extends AppCompatActivity {
    MediaPlayer player;
    TextView t1,t2,t3,t4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day15);
        t1=(TextView)findViewById(R.id.textView5);
        t2=(TextView)findViewById(R.id.textView30);
        t3=(TextView)findViewById(R.id.textView31);
        t4=(TextView)findViewById(R.id.textView32);
        YoYo.with(Techniques.ZoomInLeft).duration(3000).repeat(0).playOn(t2);
        YoYo.with(Techniques.ZoomInLeft).duration(3000).repeat(0).playOn(t3);
        YoYo.with(Techniques.ZoomInLeft).duration(3000).repeat(0).playOn(t4);
        YoYo.with(Techniques.Tada).duration(3000).repeat(0).playOn(t1);
        final MediaPlayer player=MediaPlayer.create(this,R.raw.vivaldi);
        player.start();
        player.setLooping(false);


    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent i1=new Intent(getApplicationContext(),Dashboard.class);
        finish();
        startActivity(i1);
        player.stop();
    }
}
