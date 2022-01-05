package com.example.projectuas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class akasitiga extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akasitiga);

        PDFView pdfView = findViewById(R.id.pdfview);
        pdfView.fromAsset("peraturan_rektor_nomor_12.pdf")
                .enableSwipe(true)
                .enableDoubletap(false)
                .load();
    }
}