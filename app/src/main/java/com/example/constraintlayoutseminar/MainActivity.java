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
            startActivity(new Intent(this, MotionLabelActivity.class));
        });

        binding.Carouse.setOnClickListener(view -> {
            startActivity(new Intent(this, CarouselActivity.class));
        });
    }

    /*
     * code cua Giang
     */
    private void onClickG() {
        binding.basicMotion.setOnClickListener(view -> startActivity(new Intent(MainActivity.this, MotionActivity.class)));
        binding.customAttributes.setOnClickListener(view -> startActivity(new Intent(MainActivity.this, CustomAttributesActivity.class)));
        binding.keyframePosition.setOnClickListener(view -> startActivity(new Intent(MainActivity.this, KeyFramePositionActivity.class)));
        binding.keyframeInterpolation.setOnClickListener(view -> startActivity(new Intent(MainActivity.this, KeyFrameInterpolationActivity.class)));
        binding.viewTransition.setOnClickListener(view -> startActivity(new Intent(MainActivity.this, ViewTransitionActivity.class)));
        binding.motionEffect.setOnClickListener(view -> startActivity(new Intent(MainActivity.this, MotionEffectActivity.class)));
    }
}