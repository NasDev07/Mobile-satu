package com.example.projectuas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.os.Bundle;
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
        carousel.setPageCount(3);
        carousel.setImageListener(new ImageListener() {
            @Override
            public void setImageForPosition(int position, ImageView imageView) {
                switch (position){
                    case 0:
                        imageView.setImageResource(R.drawable.unimal);
                        break;
                    case 1:
                        imageView.setImageResource(R.drawable.unimall);
                        break;
                    default:
                        imageView.setImageResource(R.drawable.unimalll);
                }
            }
        });

        list = (RecyclerView)findViewById(R.id.list);
        String[] data = {"Test 1", "Test 2", "Test 3", "Test 4"};
        RecyclerViewAdapter adapter = new  RecyclerViewAdapter(menu.this, data);
        list.setAdapter(adapter);
        list.setLayoutManager(new LinearLayoutManager(this));

    }
}