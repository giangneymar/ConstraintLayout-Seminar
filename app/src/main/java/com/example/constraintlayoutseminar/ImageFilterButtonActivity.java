package com.example.constraintlayoutseminar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.constraintlayoutseminar.databinding.ActivityImageFilterButtonBinding;

public class ImageFilterButtonActivity extends AppCompatActivity {
    private ActivityImageFilterButtonBinding binding;
    private static float crossFade = 0;
    private static float zoom = (float) 0.9;
    private static float brightness = 1;
    private static float rotate = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityImageFilterButtonBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        onClickListener();
    }

    private void onClickListener() {
        binding.crossFadeMinus.setOnClickListener(view -> {
            crossFade = crossFade - (float) 0.1;
            if (0 <= crossFade && crossFade <= 1) {
                binding.imageFilterButton.setCrossfade(crossFade);
            } else
                Toast.makeText(getApplicationContext(), "Ngoài giới hạn", Toast.LENGTH_SHORT).show();
        });

        binding.crossFadePlus.setOnClickListener(view -> {
            crossFade = crossFade + (float) 0.1;
            if (0 <= crossFade && crossFade <= 1) {
                binding.imageFilterButton.setCrossfade(crossFade);
            } else
                Toast.makeText(getApplicationContext(), "Ngoài giới hạn", Toast.LENGTH_SHORT).show();
        });

        binding.conTrastMinus.setOnClickListener(view -> {
            binding.imageFilterButton.setContrast(binding.imageFilterButton.getContrast() - (float) 0.1);
        });

        binding.conTrastPlus.setOnClickListener(view -> {
            binding.imageFilterButton.setContrast(binding.imageFilterButton.getContrast() + (float) 0.1);
        });

        binding.zoomMinus.setOnClickListener(view -> {
            zoom = zoom - (float) 0.1;
            binding.imageFilterButton.setImageZoom(zoom);
        });

        binding.zoomPlus.setOnClickListener(view -> {
            zoom = zoom + (float) 0.1;
            binding.imageFilterButton.setImageZoom(zoom);
            Log.d("aaaaaa", zoom + "");
        });

        binding.roundPercentMinus.setOnClickListener(view -> {
            binding.imageFilterButton.setRoundPercent(binding.imageFilterButton.getRoundPercent() - (float) 0.1);
        });

        binding.roundPercentPlus.setOnClickListener(view -> {
            binding.imageFilterButton.setRoundPercent(binding.imageFilterButton.getRoundPercent() + (float) 0.1);
        });

        binding.saturationMinus.setOnClickListener(view -> {
            binding.imageFilterButton.setSaturation(binding.imageFilterButton.getSaturation() - (float) 0.1);
        });

        binding.saturationPlus.setOnClickListener(view -> {
            binding.imageFilterButton.setSaturation(binding.imageFilterButton.getSaturation() + (float) 0.1);
        });

        binding.brightnessMinus.setOnClickListener(view -> {
            brightness = brightness - (float) 0.1;
            binding.imageFilterButton.setBrightness(brightness);
        });

        binding.brightnessPlus.setOnClickListener(view -> {
            brightness = brightness + (float) 0.1;
            binding.imageFilterButton.setBrightness(brightness);
        });

        binding.rotateMinus.setOnClickListener(view -> {
            rotate = rotate - 15;
            binding.imageFilterButton.setImageRotate(rotate);
        });

        binding.rotatePlus.setOnClickListener(view -> {
            rotate = rotate + 15;
            binding.imageFilterButton.setImageRotate(rotate);
        });
    }
}