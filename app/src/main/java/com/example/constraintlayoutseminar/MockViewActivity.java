package com.example.constraintlayoutseminar;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import com.example.constraintlayoutseminar.databinding.ActivityMockViewBinding;

public class MockViewActivity extends AppCompatActivity {
    private ActivityMockViewBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMockViewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}
