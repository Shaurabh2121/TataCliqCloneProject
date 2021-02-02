package com.example.tatacliq;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    private TextView mTvV1, mTvV2, mTvV3;
    private ImageView mIvCliq;
    private Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        mTvV1 = findViewById(R.id.v1);
        mTvV2 = findViewById(R.id.v2);
        mTvV3 = findViewById(R.id.v3);
        mIvCliq = findViewById(R.id.ivCliq);

        handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, SecondActivity.class);
                startActivity(intent);
                finish();
            }
        }, 1000);

    }
}