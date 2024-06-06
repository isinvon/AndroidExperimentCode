package com.example.myapplication1;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private float scale = 1.0f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        Button shrinkButton = findViewById(R.id.shrinkButton);
        Button enlargeButton = findViewById(R.id.enlargeButton);

        shrinkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scale -= 0.1f;
                updateTextSize();
            }
        });

        enlargeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scale += 0.1f;
                updateTextSize();
            }
        });
    }

    private void updateTextSize() {
        float newSize = textView.getTextSize() * scale;
        textView.setTextSize(TypedValue.COMPLEX_UNIT_PX, newSize);
    }
}
