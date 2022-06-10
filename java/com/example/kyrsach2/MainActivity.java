package com.example.kyrsach2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void klap(View view) {
        Intent intent = new Intent(this, pivo.class);
        startActivity(intent);
    }

    public void FitBackRazrab(View view) {
        Intent intent = new Intent(this, RazrabKlasssss.class);
        startActivity(intent);
    }

    public void sidr(View view) {
        Intent intent = new Intent(this, sidr.class);
        startActivity(intent);
    }

    public void medovyx(View view) {
        Intent intent = new Intent(this, medovyx.class);
        startActivity(intent);
    }

    public void lager(View view) {
        Intent intent = new Intent(this, lager.class);
        startActivity(intent);
    }

    public void ele(View view) {
        Intent intent = new Intent(this, ele.class);
        startActivity(intent);
    }

    public void bd(View view) {
        Intent intent = new Intent(this, EmailPasswordActivity.class);
        startActivity(intent);
    }
}