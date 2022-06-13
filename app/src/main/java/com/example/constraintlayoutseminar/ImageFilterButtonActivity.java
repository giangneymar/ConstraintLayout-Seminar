package com.example.constraintlayoutseminar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.adapters.ImageViewBindingAdapter;

import android.os.Bundle;

import com.example.constraintlayoutseminar.databinding.ActivityImageFilterButtonBinding;

public class ImageFilterButtonActivity extends AppCompatActivity {
    private ActivityImageFilterButtonBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityImageFilterButtonBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        onClickListener();
    }

    private void onClickListener() {
        binding.crossFadeMinus.setOnClickListener(view -> {
            int i = 0;
            binding.imageFilterButton.setCrossfade(i);
            i+=0.1;
        });
    }
}