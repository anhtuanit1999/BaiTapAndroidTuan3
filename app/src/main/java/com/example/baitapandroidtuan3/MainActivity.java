package com.example.baitapandroidtuan3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private int reqCode = 1412;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = new Intent(MainActivity.this, ChonMuaActivity.class);
//        startActivityForResult(intent, reqCode);
        startActivity(intent);
    }
}