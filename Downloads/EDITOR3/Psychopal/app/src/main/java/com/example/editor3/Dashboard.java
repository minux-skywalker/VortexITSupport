package com.example.editor3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class Dashboard extends AppCompatActivity {
TextView t1,t2,t3;
CardView c1,c2,c3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        t1=(TextView)findViewById(R.id.textView72);
        t2=(TextView)findViewById(R.id.textView75);
        t3=(TextView)findViewById(R.id.textView76);
        c1=(CardView) findViewById(R.id.card1);
        c2=(CardView) findViewById(R.id.card2);
        c3=(CardView) findViewById(R.id.card3);
        Animation mynaim= AnimationUtils.loadAnimation(this,R.anim.mytrans);
        Animation mynaim1= AnimationUtils.loadAnimation(this,R.anim.bottom);
        Animation mynaim2= AnimationUtils.loadAnimation(this,R.anim.just);

        t1.startAnimation(mynaim);
        t2.startAnimation(mynaim2);
        t2.startAnimation(mynaim1);
        t1.startAnimation(mynaim1);
        t3.startAnimation(mynaim2);
        t3.startAnimation(mynaim1);
        c1.startAnimation(mynaim1);
        c2.startAnimation(mynaim1);
        c3.startAnimation(mynaim1);


    }

    public void onClick(View view){
        Intent i1=new Intent(getApplicationContext(),Main2Activity.class);
        startActivity(i1);
    }
    public void onClick2(View view){
        Intent i1=new Intent(getApplicationContext(),MainActivity.class);
        startActivity(i1);
    }

    public void phase3(View view){
        Intent i1=new Intent(getApplicationContext(),Main3Activity.class);
        startActivity(i1);
    }

}
