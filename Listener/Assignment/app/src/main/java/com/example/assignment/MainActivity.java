package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView mtvview;
    private EditText metenter;
    private Button mbtnclick;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mtvview = findViewById(R.id.tvview);
        mbtnclick = findViewById(R.id.btnclick);
        mbtnclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mtvview.setText("Button Clicked");
            }
        });



        metenter = findViewById(R.id.etenter);
        metenter.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                Log.d("Tag", "before text" + s.toString());
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                Log.d("Tag", "on text" + s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {
                Log.d("Tag", "after text" + s.toString());
                if (s.toString().length() >= 6) {
                    Toast.makeText(MainActivity.this, s.toString(), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}