package com.example.pup;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;


public class SecondActivity extends AppCompatActivity {

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        imageView = findViewById(R.id.imageView_frame_animation);
        imageView.setVisibility(View.INVISIBLE); // Скрываем изображение

        // Анимация появления
        imageView.setVisibility(View.VISIBLE);
        imageView.startAnimation(android.view.animation.AnimationUtils.loadAnimation(this, R.anim.fade_in));

        // Запуск Frame Animation
        imageView.setBackgroundResource(R.drawable.animation_frame);
        imageView.post(new Runnable() {
            @Override
            public void run() {
                ((AnimationDrawable) imageView.getBackground()).start();
            }
        });
    }
}