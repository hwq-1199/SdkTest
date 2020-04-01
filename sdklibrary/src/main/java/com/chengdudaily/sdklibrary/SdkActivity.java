package com.chengdudaily.sdklibrary;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import okhttp3.OkHttpClient;

public class SdkActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sdk);
        OkHttpClient okHttpClient = new OkHttpClient();
    }
}
