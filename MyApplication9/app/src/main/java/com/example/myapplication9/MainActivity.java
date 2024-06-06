package com.example.myapplication9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

// 定义MainActivity类，继承自AppCompatActivity
public class MainActivity extends AppCompatActivity {

    // 重写onCreate方法，该方法在Activity被创建时被调用
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // 调用父类的onCreate方法，传递保存的实例状态（如有的话）
        super.onCreate(savedInstanceState);

        // 设置当前Activity的布局文件为activity_main.xml
        setContentView(R.layout.activity_main);

        // 通过findViewById根据ID查找Button视图
        Button buttonToSecond = findViewById(R.id.button_to_second);

        // 为找到的Button设置点击事件监听器
        buttonToSecond.setOnClickListener(new View.OnClickListener() {
            // 重写onClick方法，该方法在按钮被点击时触发
            @Override
            public void onClick(View v) {
                // 当按钮被点击时，调用自定义的方法openSecondActivity
                openSecondActivity();
            }
        });
    }

    // 自定义方法用于打开SecondActivity（第二页面）
    private void openSecondActivity() {
        // 创建一个意图(Intent)，用于从当前Activity导航到SecondActivity
        Intent intent = new Intent(this, SecondActivity.class);

        // 启动新Activity并执行意图
        startActivity(intent);
    }
}