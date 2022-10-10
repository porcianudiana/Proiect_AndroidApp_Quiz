package com.example.hotelquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.security.Key;

public class ScoreActivity extends AppCompatActivity {




    private Intent intent;

    private int final_scor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);


        TextView tv=(TextView) findViewById(R.id.porcianu_andreea_diana_score_tv2);

        intent=getIntent();
        final_scor=intent.getIntExtra(QuizActivity.KEY,0);


        tv.setText(String.valueOf(final_scor));

    }



}