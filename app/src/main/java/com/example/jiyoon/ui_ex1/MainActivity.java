package com.example.jiyoon.ui_ex1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    protected void onStart() {
        // TODO Auto-generated method stub
        super.onStart();

        Log.d("test", "onStart");

    }


    @Override
    protected void onRestart() {
        // TODO Auto-generated method stub
        super.onRestart();
        Log.d("test", "onRestart");
    }


    @Override
    protected void onResume() {
        // TODO Auto-generated method stub
        super.onResume();
        Log.d("test", "onResume");
    }


    @Override
    protected void onPause() {
        // TODO Auto-generated method stub
        super.onPause();
        Log.d("test", "onPause");
    }


    @Override
    protected void onStop() {
        // TODO Auto-generated method stub
        super.onStop();
        Log.d("test", "onStop");
    }


    @Override
    protected void onDestroy() {
        // TODO Auto-generated method stub
        super.onDestroy();
        Log.d("test", "onDestroy");
    }

}
