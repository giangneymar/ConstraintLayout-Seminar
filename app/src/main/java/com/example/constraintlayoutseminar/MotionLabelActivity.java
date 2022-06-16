package com.example.constraintlayoutseminar;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.constraintlayoutseminar.databinding.ActivityMotionLabelBinding;

public class MotionLabelActivity extends AppCompatActivity {
    private ActivityMotionLabelBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMotionLabelBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}
