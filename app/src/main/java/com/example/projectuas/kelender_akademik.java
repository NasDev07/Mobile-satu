package com.example.projectuas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class kelender_akademik extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kelender_akademik);

        PDFView pdfView = findViewById(R.id.pdfview);
        pdfView.fromAsset("Kalender_Akademik.pdf")
                .enableSwipe(true)
                .enableDoubletap(false)
                .load();
    }
}