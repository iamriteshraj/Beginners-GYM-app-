package com.example.beginnersgymapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.airbnb.lottie.LottieAnimationView;

public class Splash_Screen extends AppCompatActivity {

    LottieAnimationView lottieAnimationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);



        lottieAnimationView=findViewById(R.id.Lotianimation_view_01);
        lottieAnimationView.setAnimation(R.raw.la1);
        lottieAnimationView.playAnimation();
        lottieAnimationView.loop(true);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

//
                Intent i= new Intent(Splash_Screen.this,Login_Page.class);
                startActivity(i);
            }
        },1500);

    }
}