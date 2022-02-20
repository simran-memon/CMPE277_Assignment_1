package com.example.android.testapp;
import androidx.appcompat.app.AppCompatActivity;
//import android.app.Activity;
//import android.os.Bundle;
//import android.util.Log;

import android.os.Bundle;
//import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ActivityB extends AppCompatActivity {


    int counter = MainActivity.getCounterValue();
    private Button buttonB;

//public class AnotherActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);

        buttonB = findViewById(R.id.buttonB);
        buttonB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
//        Log.e("onCreate ------ ", "AnotherActivity: onCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("tag", "Activity B: Started");
//        Log.e("onStart ------ ", "AnotherActivity: onStart()");
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.d("tag", "Activity B: Resumed");
//        Log.e("onResume ------ ", "AnotherActivity: onResume()");
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.d("tag", "Activity B: Paused");
//        Log.e("onPause ------ ", "AnotherActivity: onPause()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        counter++;
        Log.d("tag", "Activity B: ReStarted");
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.d("tag", "Activity B: Stopped");
//        Log.e("onStop ------ ", "AnotherActivity: onStop()");
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("tag", "Activity B: Destroyed");
//        Log.e("onDestroy ------ ", "AnotherActivity: onDestroy()");
    }
}

//    @Override
//    protected void onRestart() {
//        super.onRestart();
//        Log.e("onRestart ------ ", "AnotherActivity: onRestart()");
//
//    }


