package com.example.projectuas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.projectuas.Adapter.RecyclerViewAdapter;
import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;


public class menu extends AppCompatActivity {
    RecyclerView list;
    private Object menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        CarouselView carousel = (CarouselView) findViewById(R.id.carousel);
        carousel.setPageCount(4);
        carousel.setImageListener(new ImageListener() {
            @Override
            public void setImageForPosition(int position, ImageView imageView) {
                switch (position){
                    case 0:
                        imageView.setImageResource(R.drawable.unimallll);
                        break;
                    case 1:
                        imageView.setImageResource(R.drawable.unimall);
                        break;
                    case 2:
                        imageView.setImageResource(R.drawable.unimall);
                        break;
                    default:
                        imageView.setImageResource(R.drawable.unimal);
                }
            }
        });

        list = (RecyclerView)findViewById(R.id.list);
        String[] data = {
                "Test 1",
                "Test 2",
                "Test 3",
                "Test 4"};
        RecyclerViewAdapter adapter = new  RecyclerViewAdapter(menu.this, data);
        list.setAdapter(adapter);
        list.setLayoutManager(new LinearLayoutManager(this));

    }


    public void dosen(View view) {
        Intent intent = new Intent(this,cartview.class);
        startActivity(intent);
    }

    public void mahasiswa(View view) {
        Intent intent = new Intent(this,mahasiswa.class);
        startActivity(intent);
    }

    public void akademik(View view) {
        Intent intent = new Intent(this,akademik.class);
        startActivity(intent);
    }
}