package com.example.constraintlayoutseminar;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.motion.widget.MotionLayout;

import com.example.constraintlayoutseminar.databinding.ActivityParallaxBinding;

public class ParallaxActivity extends AppCompatActivity {

    private ActivityParallaxBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityParallaxBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.start.setOnClickListener(view -> binding.motionLayout.transitionToEnd());
    }
}