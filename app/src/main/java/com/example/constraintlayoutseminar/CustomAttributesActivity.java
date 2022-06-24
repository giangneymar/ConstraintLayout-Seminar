package com.example.constraintlayoutseminar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.constraintlayoutseminar.databinding.ActivityCustomAttributesBinding;

public class CustomAttributesActivity extends AppCompatActivity {

    private ActivityCustomAttributesBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCustomAttributesBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}