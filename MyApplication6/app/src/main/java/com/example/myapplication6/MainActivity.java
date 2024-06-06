package com.example.myapplication6; // 定义包名为com.example.myapplication6

import androidx.appcompat.app.AppCompatActivity; // 导入AppCompatActivity类

import android.os.Bundle; // 导入Bundle类
import android.view.View; // 导入View类
import android.widget.AdapterView; // 导入AdapterView类
import android.widget.ArrayAdapter; // 导入ArrayAdapter类
import android.widget.Spinner; // 导入Spinner类
import android.widget.TextView; // 导入TextView类
import android.widget.Toast; // 导入Toast类

public class MainActivity extends AppCompatActivity { // 定义一个名为MainActivity的类，继承自AppCompatActivity

    TextView txv; // 定义一个TextView对象txv
    Spinner cinema; // 定义一个Spinner对象cinema，用于显示戏院列表

    @Override
    protected void onCreate(Bundle savedInstanceState) { // 重写onCreate方法
        super.onCreate(savedInstanceState); // 调用父类的onCreate方法
        setContentView(R.layout.activity_main); // 设置布局文件为activity_main.xml

        txv = (TextView) findViewById(R.id.textView); // 通过ID找到布局文件中的TextView对象，并赋值给txv
        cinema = (Spinner) findViewById(R.id.cinema); // 通过ID找到布局文件中的Spinner对象，并赋值给cinema
    }

    // 当用户点击按钮时，执行此方法
    public void order(View v) {
        String[] cinemas =
                getResources().getStringArray(R.array.cinemas); // 获取字符串资源中的字符串数组

        int index = cinema.getSelectedItemPosition(); // 获取被选取的项目的位置
        txv.setText("订" + cinemas[index] + "的票"); // 设置TextView显示的内容为“订”+选中的戏院名称+“的票”
    }
}
