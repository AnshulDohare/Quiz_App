package com.example.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity implements TopicsAdapter.topicClicked {
    RecyclerView recyclerView;
    TopicsAdapter topicsAdapter;
    RecyclerView.LayoutManager layoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerview_topics);
        recyclerView.setHasFixedSize(true);
        layoutManager = new GridLayoutManager(this,1,GridLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
        topicsAdapter = new TopicsAdapter(ApplicationClass.topics,this);
        recyclerView.setAdapter(topicsAdapter);
    }

    @Override
    public void OnTopicClicked(int index) {
        Toast.makeText(this, ApplicationClass.topics.get(index).getTopicName(), Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("index",index);
        intent.putExtra("topic",ApplicationClass.topics.get(index).getTopicName());
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }
}