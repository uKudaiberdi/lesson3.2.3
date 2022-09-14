package com.example.lesson32;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int mValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView valueTv = findViewById(R.id.textView);

        findViewById(R.id.btn_plus).setOnClickListener(v -> {
           mValue++;
           valueTv.setText(String.valueOf(mValue));
        });
        findViewById(R.id.btn_minus).setOnClickListener(v -> {
            mValue--;
            valueTv.setText(String.valueOf(mValue));
        });
    }
}