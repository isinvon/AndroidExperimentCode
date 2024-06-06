package com.example.myapplication4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements
        CompoundButton.OnCheckedChangeListener {
    private TextView hobby; // 定义一个TextView用于显示选中的爱好
    private String hobbys; // 定义一个字符串用于存放选中的CheckBox的文本信息

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 初始化CheckBox控件
        CheckBox shuttlecock = findViewById(R.id.like_shuttlecock);
        CheckBox basketball =  findViewById(R.id.like_basketball);
        CheckBox pingpong = findViewById(R.id.like_pingpong);
        shuttlecock.setOnCheckedChangeListener(this); // 为CheckBox设置监听器
        basketball.setOnCheckedChangeListener(this);
        pingpong.setOnCheckedChangeListener(this);
        hobby = findViewById(R.id.hobby); // 获取TextView控件
        hobbys = new String(); // 初始化存放选中的CheckBox的文本信息的字符串
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        String motion = buttonView.getText().toString(); // 获取当前点击的CheckBox的文本信息
        if(isChecked){ // 如果CheckBox被选中
            if(!hobbys.contains(motion)){ // 如果hobbys字符串中不包含当前点击的CheckBox的文本信息
                hobbys = hobbys + motion; // 将当前点击的CheckBox的文本信息添加到hobbys字符串中
                hobby.setText(hobbys); // 更新TextView的显示内容
            }
        }else { // 如果CheckBox未被选中
            if (hobbys.contains(motion)) { // 如果hobbys字符串中包含当前点击的CheckBox的文本信息
                hobbys = hobbys.replace(motion, ""); // 从hobbys字符串中移除当前点击的CheckBox的文本信息
                hobby.setText(hobbys); // 更新TextView的显示内容
            }
        }
    }
}
