package com.example.constraintlayoutseminar;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.constraintlayoutseminar.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        onClickG();
    }

    /**
     * code cua Dat
     * /
     * <p>
     * /*
     * code cua Giang
     */
    private void onClickG() {
        binding.motionScene.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, MotionActivity.class);
            startActivity(intent);
        });
    }
}