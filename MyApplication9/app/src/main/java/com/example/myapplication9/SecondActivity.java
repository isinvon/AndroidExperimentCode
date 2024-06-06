package com.example.myapplication9;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
// 导入所需的包和类
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

// 定义SecondActivity类，继承自AppCompatActivity
public class SecondActivity extends AppCompatActivity {

    // 重写onCreate方法，该方法在Activity被创建时被调用
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // 调用父类的onCreate方法，传递保存的实例状态（如有的话）
        super.onCreate(savedInstanceState);

        // 设置当前Activity的布局文件为activity_second.xml
        setContentView(R.layout.activity_second);

        // 通过findViewById根据ID查找Button视图
        Button buttonToMain = findViewById(R.id.button_to_main);

        // 为找到的Button设置点击事件监听器
        buttonToMain.setOnClickListener(new View.OnClickListener() {
            // 重写onClick方法，该方法在按钮被点击时触发
            @Override
            public void onClick(View v) {
                // 当按钮被点击时，调用自定义的方法openMainActivity
                openMainActivity();
            }
        });
    }

    // 自定义方法用于打开MainActivity
    private void openMainActivity() {
        // 创建一个意图(Intent)，用于从当前Activity导航到MainActivity
        Intent intent = new Intent(this, MainActivity.class);

        // 启动新Activity并执行意图
        startActivity(intent);

        // 可选：如果你想关闭当前Activity（SecondActivity），可以在这里调用finish()
        // finish();
    }
}