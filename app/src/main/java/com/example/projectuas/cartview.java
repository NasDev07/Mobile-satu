package com.example.projectuas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class cartview extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cartview);

    }

    public void datasatu(View view) {
        Intent intent = new Intent(this,dosensatu.class);
        startActivity(intent);
    }

    public void datadua(View view) {
        Intent intent = new Intent(this,dosendua.class);
        startActivity(intent);
    }

    public void datatiga(View view) {
        Intent intent = new Intent(this,dosentiga.class);
        startActivity(intent);
    }
}