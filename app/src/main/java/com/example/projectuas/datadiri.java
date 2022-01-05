package com.example.projectuas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class datadiri extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datadiri);

        PDFView pdfView = findViewById(R.id.pdfview);
        pdfView.fromAsset("datadiri.pdf")
                .enableSwipe(true)
                .enableDoubletap(false)
                .load();
    }
}