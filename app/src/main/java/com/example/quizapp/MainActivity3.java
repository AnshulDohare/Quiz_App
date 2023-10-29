package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    TextView result,topicName;
    Button tryAgain;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        result = findViewById(R.id.txt_result);
        tryAgain = findViewById(R.id.btn_tryAgain);
        topicName = findViewById(R.id.txt_topicName);
        String currectAnswer = getIntent().getStringExtra("currect");
        String numberOfQuestions = getIntent().getStringExtra("numberOfQuestions");
        int index = getIntent().getIntExtra("index",0);
        String topic = getIntent().getStringExtra("topic");
        result.setText(currectAnswer+"/"+numberOfQuestions);
        topicName.setText(topic);
        tryAgain.setOnClickListener(v->{
            Intent intent = new Intent(this, MainActivity2.class);
            intent.putExtra("index",index);
            intent.putExtra("topic",ApplicationClass.topics.get(index).getTopicName());
            startActivity(intent);
            finish();
        });
    }
}