package com.example.cambiodecolor;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void colorRojo(View view) {
        findViewById(R.id.fondo).setBackgroundColor(0xffff0007);

    }


    public void colorAzul(View view) {
        findViewById(R.id.fondo).setBackgroundColor(0xff5b39c6);

    }

    public void colorAmarillo(View view) {
        findViewById(R.id.fondo).setBackgroundColor(0xfffbff00);

    }

    public void colorVerde(View view) {
        findViewById(R.id.fondo).setBackgroundColor(0xffbfb95c);

    }
}
