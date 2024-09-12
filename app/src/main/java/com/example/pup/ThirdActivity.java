package com.example.pup;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;


public class ThirdActivity extends AppCompatActivity {
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        textView = findViewById(R.id.textView_tween_animation);
        textView.setVisibility(View.INVISIBLE); // Скрываем текст

        // Анимация появления
        textView.setVisibility(View.VISIBLE);
        textView.startAnimation(AnimationUtils.loadAnimation(this, R.anim.fade_in));
    }
}