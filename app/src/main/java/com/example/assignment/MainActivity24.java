package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity24 extends AppCompatActivity {

    TextView tx;
    ImageView im;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main24);

        tx = findViewById(R.id.textView24);
        im = findViewById(R.id.imageView23);
    }
}