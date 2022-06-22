package com.example.constraintlayoutseminar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.helper.widget.Carousel;
import androidx.constraintlayout.utils.widget.ImageFilterView;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import com.example.constraintlayoutseminar.databinding.ActivityCarouselBinding;
import com.google.android.material.card.MaterialCardView;

import java.util.ArrayList;

public class CarouselActivity extends AppCompatActivity {
    private ActivityCarouselBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCarouselBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        int images[] = {
                R.drawable.img_nui,
                R.drawable.img_new_york,
                R.drawable.img_trung_khanh,
                R.drawable.img_thai_lan,
                R.drawable.img_halan
        };

        binding.carousel.setAdapter(new Carousel.Adapter() {
            @Override
            public int count() {
                return images.length;
            }

            @Override
            public void populate(View view, int index) {
                if (view instanceof ImageFilterView){
                    ((ImageFilterView) view).setImageResource(images[index]);
                }
            }

            @Override
            public void onNewItem(int index) {

            }
        });
    }
}