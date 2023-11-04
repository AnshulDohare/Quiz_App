package com.example.quizapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    TextView question,heading;
    RadioGroup options;
    RadioButton option1,option2,option3,option4;
    Button next;
    ArrayList<Questions>questions;
    ArrayList<String>answers;
    static int i;
    static int currect;
    static int numberOfQuestions;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        question = findViewById(R.id.txt_question);
        heading = findViewById(R.id.txt_topicNameHeading);
        options = findViewById(R.id.radioGroup);
        option1 = findViewById(R.id.radioButton1);
        option2 = findViewById(R.id.radioButton2);
        option3 = findViewById(R.id.radioButton3);
        option4 = findViewById(R.id.radioButton4);
        next = findViewById(R.id.btn_next);
        i = 0;
        currect = 0;
        numberOfQuestions = 0;

        int index = getIntent().getIntExtra("index",0);
        String topic = getIntent().getStringExtra("topic");
        heading.setText(topic);
        switch (index){
            case 0:
                questions = ApplicationClass.worldGeographyQuestions;
                answers = ApplicationClass.worldGeographyAnswers;
                break;
            case 1:
                questions = ApplicationClass.indianPoliticsQuestions;
                answers = ApplicationClass.indianPoliticsAnswers;
                break;
            case 2:
                questions = ApplicationClass.indianHistoryQuestions;
                answers = ApplicationClass.indianHistoryAnswers;
                break;
            case 3:
                questions = ApplicationClass.indianEconomyQuestions;
                answers = ApplicationClass.indianEconomyAnswers;
                break;
            case 4:
                questions = ApplicationClass.indianGeographyQuestions;
                answers = ApplicationClass.indianGeographyAnswers;
                break;
            case 5:
                questions = ApplicationClass.generalKnowledgeQuestions;
                answers = ApplicationClass.generalKnowledgeAnswers;
                break;
            default:
                question.setVisibility(View.GONE);
                options.setVisibility(View.GONE);
                next.setVisibility(View.GONE);
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setTitle("No Questions Available\nTry Another Topic").setPositiveButton("OK", (dialog, which) -> finish()).setCancelable(false).show();
        }
        if(questions.size()>i) {
            numberOfQuestions++;
            question.setText(questions.get(0).getQuestions());
            option1.setText(questions.get(0).getOption1());
            option2.setText(questions.get(0).getOption2());
            option3.setText(questions.get(0).getOption3());
            option4.setText(questions.get(0).getOption4());
        }
        else{
            question.setVisibility(View.GONE);
            options.setVisibility(View.GONE);
            next.setVisibility(View.GONE);
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setTitle("No Questions Available\nTry Another Topic").setPositiveButton("OK", (dialog, which) -> finish()).setCancelable(false).show();
        }
        next.setOnClickListener(v->{
            if(option1.isChecked()||option2.isChecked()||option3.isChecked()||option4.isChecked()){
                if(option1.isChecked()){
                    if(answers.get(i).equals(option1.getText().toString())){
                        currect++;
                    }
                    option1.setChecked(false);
                    option1.setEnabled(true);
                }
                else if(option2.isChecked()){
                    if(answers.get(i).equals(option2.getText().toString())){
                        currect++;
                    }
                    option2.setChecked(false);
                    option2.setEnabled(true);
                }
                else if(option3.isChecked()){
                    if(answers.get(i).equals(option3.getText().toString())){
                        currect++;
                    }
                    option3.setChecked(false);
                    option3.setEnabled(true);
                }
                else if(option4.isChecked()){
                    if(answers.get(i).equals(option4.getText().toString())){
                        currect++;
                    }
                    option4.setChecked(false);
                    option4.setActivated(true);
                }
                i++;
                if(questions.size()>i) {
                    numberOfQuestions++;
                    question.setText(questions.get(i).getQuestions());
                    option1.setText(questions.get(i).getOption1());
                    option2.setText(questions.get(i).getOption2());
                    option3.setText(questions.get(i).getOption3());
                    option4.setText(questions.get(i).getOption4());
                }
                else {
                    Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                    intent.putExtra("currect",currect+"");
                    intent.putExtra("numberOfQuestions",numberOfQuestions+"");
                    intent.putExtra("index",index);
                    intent.putExtra("topic",ApplicationClass.topics.get(index).getTopicName());
                    startActivity(intent);
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                    finish();

                }
            }
            else{
                Toast.makeText(this, "Options not selected", Toast.LENGTH_SHORT).show();
            }

        });

    }
}