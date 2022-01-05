package com.example.projectuas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class akasiempat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akasiempat);

        PDFView pdfView = findViewById(R.id.pdfview);
        pdfView.fromAsset("Sosialisasi_PPKS_Unimal.pdf")
                .enableSwipe(true)
                .enableDoubletap(false)
                .load();
    }
}