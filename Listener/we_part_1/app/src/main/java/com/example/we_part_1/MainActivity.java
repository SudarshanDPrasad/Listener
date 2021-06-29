package com.example.we_part_1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView mtvWelcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mtvWelcome = findViewById(R.id.tvWelcome);
        mtvWelcome.setText("Welcome to Masai School");
        Log.d("Main Activity", "onCreate");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Main Activity", "onDestroy");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Main Activity", "onStop");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Main Activity", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Main Activity", "onPause");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Main Activity", "onStart");
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("key", "Screen Rotated");
        Log.d("Main Activity", "onSaveInstanceState");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Main Activity", "onRestart");
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        String data = savedInstanceState.getString("key");
        mtvWelcome.setText(data);
        Log.d("Main Activity", "onRestoreInstanceState");
    }
}