package com.example.projectuas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class akademik extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akademik);
    }

    public void satu(View view) {
        Intent intent = new Intent(this,akasisatu.class);
        startActivity(intent);
    }

    public void dua(View view) {
        Intent intent = new Intent(this,akasidua.class);
        startActivity(intent);
    }

    public void tiga(View view) {
        Intent intent = new Intent(this,akasitiga.class);
        startActivity(intent);
    }

    public void empat(View view) {
        Intent intent = new Intent(this,akasiempat.class);
        startActivity(intent);
    }

}