package com.example.constraintlayoutseminar;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.constraintlayoutseminar.databinding.ActivityMotionBinding;

public class MotionActivity extends AppCompatActivity {

    private ActivityMotionBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMotionBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        onClick();
    }

    private void onClick() {
        binding.buttonPress.setOnClickListener(view -> binding.motionSceneContainer.transitionToEnd());
        binding.buttonReset.setOnClickListener(view -> binding.motionSceneContainer.transitionToStart());
    }

}