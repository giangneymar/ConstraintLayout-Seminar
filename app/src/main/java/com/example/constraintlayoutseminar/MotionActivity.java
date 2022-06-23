package com.example.constraintlayoutseminar;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.constraintlayoutseminar.databinding.ActivityMotionBinding;

public class MotionActivity extends AppCompatActivity {

    private ActivityMotionBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMotionBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}