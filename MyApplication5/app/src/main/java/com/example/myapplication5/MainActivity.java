package com.example.myapplication5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int[] chk_id = {R.id.chk1, R.id.chk2, R.id.chk3, R.id.chk4};
        for (int id : chk_id) {
            ((CheckBox) findViewById(id)).setOnCheckedChangeListener(this);
        }
    }

    int items = 0; // 记录当前选取餐点的数量

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        int visible;
        if (isChecked) { // 被选取时
            items++; // 数量加1
            visible = View.VISIBLE; // 将图片设为可见
        } else { // 被取消时
            items--; // 数量减1
            visible = View.GONE; // 将图片设为不可见
        }
        switch (buttonView.getId()) { // 按项目ID, 决定要更改的ImageView ID
            case R.id.chk1:
                findViewById(R.id.output1).setVisibility(visible);
                break;
            case R.id.chk2:
                findViewById(R.id.output2).setVisibility(visible);
                break;
            case R.id.chk3:
                findViewById(R.id.output3).setVisibility(visible);
                break;
            case R.id.chk4:
                findViewById(R.id.output4).setVisibility(visible);
                break;
        }

        String msg;
        if (items > 0) //选取项目大于0,显示有点餐的信息
            msg = "你点的餐点如下";
        else //否则显示请点餐的信息
            msg = "请点餐！";
        ((TextView) findViewById(R.id.showOrder)).setText(msg);
    }
}