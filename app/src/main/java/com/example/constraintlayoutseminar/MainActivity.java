package com.example.constraintlayoutseminar;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.constraintlayoutseminar.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        onClickG();
        onClickDat();
    }

    /*
     * code cua Dat
     */
    private void onClickDat() {
        binding.ImageFilterButton.setOnClickListener(view -> {
            startActivity(new Intent(this, ImageFilterButtonActivity.class));
        });

        binding.mockView.setOnClickListener(view -> {
            startActivity(new Intent(this, MockViewActivity.class));
        });
    }

    /*
     * code cua Giang
     */
    private void onClickG() {
        binding.motionScene.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, MotionActivity.class);
            startActivity(intent);
        });
        binding.viewTransition.setOnClickListener(view -> startActivity(new Intent(MainActivity.this, ViewTransitionActivity.class)));
        binding.constraintBasic.setOnClickListener(view -> startActivity(new Intent(MainActivity.this, BasicActivity.class)));
        binding.motionEffect.setOnClickListener(view -> startActivity(new Intent(MainActivity.this, MotionEffectActivity.class)));
    }
}