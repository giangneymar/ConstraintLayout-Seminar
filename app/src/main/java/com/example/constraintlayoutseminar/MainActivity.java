package com.example.constraintlayoutseminar;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.helper.widget.Carousel;

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

        binding.Carouse2.setOnClickListener(view -> {
            startActivity(new Intent(this, Carousel_demo_2.class));
        });
    }

    /*
     * code cua Giang
     */
    private void onClickG() {
        binding.customAttributes.setOnClickListener(view -> startActivity(new Intent(MainActivity.this, CustomAttributesActivity.class)));
        binding.keyframePosition.setOnClickListener(view -> startActivity(new Intent(MainActivity.this, KeyFramePositionActivity.class)));
        binding.keyframeInterpolation.setOnClickListener(view -> startActivity(new Intent(MainActivity.this, KeyFrameInterpolationActivity.class)));
        binding.keyframeCycle.setOnClickListener(view -> startActivity(new Intent(MainActivity.this, KeyframeCycleActivity.class)));
        binding.parallax.setOnClickListener(view -> startActivity(new Intent(MainActivity.this, ParallaxActivity.class)));
        binding.youTubeLikeMotion.setOnClickListener(view -> startActivity(new Intent(MainActivity.this, YouTubeLikeMotionActivity.class)));
        binding.multiState.setOnClickListener(view -> startActivity(new Intent(MainActivity.this, MultiStateActivity.class)));
        binding.complexMotion.setOnClickListener(view -> startActivity(new Intent(MainActivity.this, ComplexMotionActivity.class)));
        binding.viewTransition.setOnClickListener(view -> startActivity(new Intent(MainActivity.this, ViewTransitionActivity.class)));
        binding.motionEffect.setOnClickListener(view -> startActivity(new Intent(MainActivity.this, MotionEffectActivity.class)));
    }
}