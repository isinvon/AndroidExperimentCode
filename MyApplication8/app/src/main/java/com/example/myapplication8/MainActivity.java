package com.example.myapplication8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private LinearLayout questionsLinearLayout; // 定义一个线性布局用于存放问题
    private TextView answerTextView; // 定义一个文本视图用于显示答案
    private ScrollView scrollView; // 定义一个滚动视图用于滚动页面

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // 设置布局文件

        questionsLinearLayout = findViewById(R.id.questionsLinearLayout); // 获取线性布局实例
        answerTextView = findViewById(R.id.answerTextView); // 获取文本视图实例
        scrollView = findViewById(R.id.scrollView); // 获取滚动视图实例

        addQuestions(); // 调用添加问题的函数
    }

    private void addQuestions() {
        String[] questions = new String[]{
                "什么门永远关不上？",
                "什么东西没人爱吃？",
                "什么瓜不能吃？",
                "什么布切不断？",
                "什么鼠最爱干净？",
                "偷为什么不犯法？"
        };
        String[] answers = new String[]{
                "球门",
                "垃圾",
                "傻瓜",
                "瀑布",
                "米老鼠",
                "偷笑"
        };

        for (int i = 0; i < questions.length; i++) {
            final int index = i;
            TextView questionTextView = new TextView(this); // 创建一个文本视图用于显示问题
            questionTextView.setText(questions[i]); // 设置文本视图的文本为问题
            questionTextView.setOnClickListener(new View.OnClickListener() { // 设置点击事件监听器
                @Override
                public void onClick(View v) {
                    answerTextView.setText(answers[index]); // 设置答案文本视图的文本为对应的答案
                    scrollView.fullScroll(View.FOCUS_DOWN); // 滚动到底部
                }
            });
            questionsLinearLayout.addView(questionTextView); // 将问题文本视图添加到线性布局中
        }
    }
}
