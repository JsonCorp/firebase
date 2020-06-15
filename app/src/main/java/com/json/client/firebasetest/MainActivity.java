package com.json.client.firebasetest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.crashlytics.android.Crashlytics;

import io.fabric.sdk.android.Fabric;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Fabric.with(this, new Crashlytics());
        setContentView(R.layout.activity_main);

        // Crashlytics 테스트를 위해 강제로 crash 발생
//        Crashlytics.getInstance().crash(); // Force a crash
    }
}
