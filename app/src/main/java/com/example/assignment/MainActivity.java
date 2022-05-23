package com.example.assignment;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.button);
        Button btn1 = (Button) findViewById(R.id.btnA);
        Button btn2 = findViewById(R.id.btnB);
        Button btn3 = findViewById(R.id.btnC);
        Button btn4 = findViewById(R.id.btnD);
        Button btn5 = findViewById(R.id.btnE);
        Button btn6 = findViewById(R.id.btnF);
        Button btn7 = findViewById(R.id.btnG);
        Button btn8 = findViewById(R.id.btnH);
        Button btn9 = findViewById(R.id.btnI);
        Button btn10 = findViewById(R.id.btnJ);
        Button btn11 = findViewById(R.id.btnK);
        Button btn12 = findViewById(R.id.btnL);
        Button btn13 = findViewById(R.id.btnM);
        Button btn14 = findViewById(R.id.btnN);
        Button btn15 = findViewById(R.id.btnO);
        Button btn16 = findViewById(R.id.btnP);
        Button btn17 = findViewById(R.id.btnQ);
        Button btn18 = findViewById(R.id.btnR);
        Button btn19 = findViewById(R.id.btnS);
        Button btn20 = findViewById(R.id.btnT);
        Button btn21 = findViewById(R.id.btnU);
        Button btn22 = findViewById(R.id.btnV);
        Button btn23 = findViewById(R.id.btnW);
        Button btn24 = findViewById(R.id.btnX);
        Button btn25 = findViewById(R.id.btnY);
        Button btn26 = findViewById(R.id.btnZ);

        btn.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btn10.setOnClickListener(this);
        btn11.setOnClickListener(this);
        btn12.setOnClickListener(this);
        btn13.setOnClickListener(this);
        btn14.setOnClickListener(this);
        btn15.setOnClickListener(this);
        btn16.setOnClickListener(this);
        btn17.setOnClickListener(this);
        btn18.setOnClickListener(this);
        btn19.setOnClickListener(this);
        btn20.setOnClickListener(this);
        btn21.setOnClickListener(this);
        btn22.setOnClickListener(this);
        btn23.setOnClickListener(this);
        btn24.setOnClickListener(this);
        btn25.setOnClickListener(this);
        btn26.setOnClickListener(this);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                Uri uri = Uri.parse("https://github.com/bsef19a522?tab=repositories");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
                break;
            case R.id.btnA:
                Intent int1 = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(int1);
                break;
            case R.id.btnB:
                Intent int2 = new Intent(MainActivity.this, MainActivity3.class);
                startActivity(int2);
                break;
            case R.id.btnC:
                Intent int3 = new Intent(MainActivity.this, MainActivity4.class);
                startActivity(int3);
                break;
            case R.id.btnD:
                Intent int4 = new Intent(MainActivity.this, MainActivity5.class);
                startActivity(int4);
                break;
            case R.id.btnE:
                Intent int5 = new Intent(MainActivity.this, MainActivity6.class);
                startActivity(int5);
                break;
            case R.id.btnF:
                Intent int6 = new Intent(MainActivity.this, MainActivity7.class);
                startActivity(int6);
                break;
            case R.id.btnG:
                Intent int7 = new Intent(MainActivity.this, MainActivity8.class);
                startActivity(int7);
                break;
            case R.id.btnH:
                Intent int8 = new Intent(MainActivity.this, MainActivity9.class);
                startActivity(int8);
                break;
            case R.id.btnI:
                Intent int9 = new Intent(MainActivity.this, MainActivity10.class);
                startActivity(int9);
                break;
            case R.id.btnJ:
                Intent int10 = new Intent(MainActivity.this, MainActivity11.class);
                startActivity(int10);
                break;
            case R.id.btnK:
                Intent int11 = new Intent(MainActivity.this, MainActivity12.class);
                startActivity(int11);
                break;
            case R.id.btnL:
                Intent int12 = new Intent(MainActivity.this, MainActivity13.class);
                startActivity(int12);
                break;
            case R.id.btnM:
                Intent int13 = new Intent(MainActivity.this, MainActivity14.class);
                startActivity(int13);
                break;
            case R.id.btnN:
                Intent int14 = new Intent(MainActivity.this, MainActivity15.class);
                startActivity(int14);
                break;
            case R.id.btnO:
                Intent int15 = new Intent(MainActivity.this, MainActivity16.class);
                startActivity(int15);
                break;
            case R.id.btnP:
                Intent int16 = new Intent(MainActivity.this, MainActivity17.class);
                startActivity(int16);
                break;
            case R.id.btnQ:
                Intent int17 = new Intent(MainActivity.this, MainActivity18.class);
                startActivity(int17);
                break;
            case R.id.btnR:
                Intent int18 = new Intent(MainActivity.this, MainActivity19.class);
                startActivity(int18);
                break;
            case R.id.btnS:
                Intent int19 = new Intent(MainActivity.this, MainActivity20.class);
                startActivity(int19);
                break;
            case R.id.btnT:
                Intent int20 = new Intent(MainActivity.this, MainActivity21.class);
                startActivity(int20);
                break;
            case R.id.btnU:
                Intent int21 = new Intent(MainActivity.this, MainActivity22.class);
                startActivity(int21);
                break;
            case R.id.btnV:
                Intent int22 = new Intent(MainActivity.this, MainActivity23.class);
                startActivity(int22);
                break;
            case R.id.btnW:
                Intent int23 = new Intent(MainActivity.this, MainActivity24.class);
                startActivity(int23);
                break;
            case R.id.btnX:
                Intent int24 = new Intent(MainActivity.this, MainActivity25.class);
                startActivity(int24);
                break;
            case R.id.btnY:
                Intent int25 = new Intent(MainActivity.this, MainActivity26.class);
                startActivity(int25);
                break;
            case R.id.btnZ:
                Intent int26 = new Intent(MainActivity.this, MainActivity27.class);
                startActivity(int26);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + v.getId());
        }
    }
}