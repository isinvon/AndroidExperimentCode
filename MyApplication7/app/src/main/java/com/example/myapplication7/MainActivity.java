package com.example.myapplication7;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.view.View;
import android.widget.AdapterView;

import com.example.myapplication7.R;

public class MainActivity extends Activity {
    private ListView listView; // 声明一个ListView对象
    private TextView textView; // 声明一个TextView对象

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // 设置布局文件

        listView = (ListView) findViewById(R.id.listView); // 通过ID找到ListView对象
        textView = (TextView) findViewById(R.id.textView); // 通过ID找到TextView对象

        String[] menuItems = new String[]{"奶茶", "汉堡", "奶茶", "薯条", "可乐", "玉米浓汤"}; // 定义菜单项数组
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, menuItems); // 创建适配器
        listView.setAdapter(adapter); // 为ListView设置适配器

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // 为ListView设置点击事件监听器
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = (String) parent.getItemAtPosition(position); // 获取点击的菜单项
                String currentText = textView.getText().toString(); // 获取当前TextView的文本内容
                if (!currentText.isEmpty()) {
                    currentText += ","; // 如果当前文本不为空，添加逗号分隔符
                }
                if (currentText.isEmpty()) {
                    textView.setText("你点了：" + selectedItem); // 如果当前文本为空，设置新的文本内容
                } else {
                    currentText +=  selectedItem; // 如果当前文本不为空，添加选中的菜单项
                    textView.setText(currentText); // 更新TextView的文本内容
                }

            }
        });
    }
}
