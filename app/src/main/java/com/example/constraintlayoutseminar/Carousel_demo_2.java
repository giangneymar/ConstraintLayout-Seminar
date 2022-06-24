package com.example.constraintlayoutseminar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.helper.widget.Carousel;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.constraintlayoutseminar.databinding.ActivityCarouselDemo2Binding;

public class Carousel_demo_2 extends AppCompatActivity {
    ActivityCarouselDemo2Binding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCarouselDemo2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        int images[] = {
                R.drawable.img_nui,
                R.drawable.img_new_york,
                R.drawable.img_trung_khanh,
                R.drawable.img_thai_lan,
                R.drawable.img_halan,
                R.drawable.img_new_york,
                R.drawable.img_trung_khanh,
                R.drawable.img_thai_lan,
                R.drawable.img_halan,
                R.drawable.img_nui,
                R.drawable.img_new_york,
                R.drawable.img_trung_khanh
        };

        binding.button.setOnClickListener(v -> {
            int numItems = binding.carousel.getCount();
            int lastItem = numItems - 1;
            if (binding.carousel.getCurrentIndex() == 0) {
                binding.carousel.transitionToIndex(lastItem, 200);
            } else {
                binding.carousel.transitionToIndex(0, 200);
            }
        });

        binding.carousel.setAdapter(new Carousel.Adapter() {
            @Override
            public int count() {
                return images.length;
            }

            @Override
            public void populate(View view, int index) {
                if (view instanceof ImageView) {
                    ImageView imageView = (ImageView) view;
                    imageView.setImageResource(images[index]);
                }
            }

            @Override
            public void onNewItem(int index) {
                binding.label.setText("#" + (index + 1));
                if (index == binding.carousel.getCount() - 1) {
                    binding.button.setText("Go to first item");
                }
                if (index == 0) {
                    binding.button.setText("Go to last item");
                }
            }
        });
    }
    }
