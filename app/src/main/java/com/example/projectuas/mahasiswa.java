package com.example.projectuas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class mahasiswa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mahasiswa);

    }

    public void datadiri(View view) {
        Intent intent = new Intent(this,datadiri.class);
        startActivity(intent);
    }

    public void krs(View view) {
        Intent intent = new Intent(this,krs.class);
        startActivity(intent);
    }

    public void transkipnilai(View view) {
        Intent intent = new Intent(this,transkipnilai.class);
        startActivity(intent);
    }

    public void KelenderAkademik(View view) {
        Intent intent = new Intent(this,kelender_akademik.class);
        startActivity(intent);
    }

}