package com.example.administrator.myanim;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //    private Button btn;
    private ImageView mIv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
        mIv = (ImageView) findViewById(R.id.iv_pic);
        mIv.setAnimation(animation);


        Animation.AnimationListener animationd = new Animation.AnimationListener() {
            //动画开始
            @Override
            public void onAnimationStart(Animation animation) {

            }
            @Override
            public void onAnimationEnd(Animation animation) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent);
                finish();
            }
       
            @Override
            public void onAnimationRepeat(Animation animation) {}
        };animation.setAnimationListener(animationd);
    }
    }

