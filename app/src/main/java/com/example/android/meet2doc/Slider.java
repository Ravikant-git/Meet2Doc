package com.example.android.meet2doc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Slider extends AppCompatActivity {

    ViewPager viewPager;
    ImageButton btnNext;
    int[] layouts;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slider);

        viewPager = findViewById(R.id.pager);
        btnNext = findViewById(R.id.btnNext);

        layouts = new int[]{
                R.layout.slider1,
                R.layout.slider2,
                R.layout.slider3,
        };

        adapter = new Adapter(this, layouts);
        viewPager.setAdapter(adapter);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (viewPager.getCurrentItem() + 1 < layouts.length) {
                    viewPager.setCurrentItem(viewPager.getCurrentItem() + 1);
                } else {
                        startActivity(new Intent(getApplicationContext(),MainActivity.class));
                }
            }
        });

//        viewPager.addOnPageChangeListener();


    }

//    ViewPager.OnPageChangeListener viewPagerChangerListener = new ViewPager.OnPageChangeListener() {
//        @Override
//        public void onPageScrolled(int i, float v, int i1) {
//
//        }
//
//        @Override
//        public void onPageSelected(int i) {
//            if (i == layouts.length - 1) {
//                btnNext.
//
//            }
//
//        }
//
//        @Override
//        public void onPageScrollStateChanged(int state) {
//
//        }
//    };
}