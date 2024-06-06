package com.example.myapplication3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;
                textView.setText("计数器： " + counter);
            }
        });

        button.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                // 将计数器重置为0
                counter = 0;
                // 更新TextView的显示内容
                textView.setText("计数器： " + counter);
                // 显示一个短暂的提示信息
                Toast.makeText(MainActivity.this, "长按后清零", Toast.LENGTH_SHORT).show();
                // 返回true表示事件已被处理
                return true;
            }
        });

    }
}