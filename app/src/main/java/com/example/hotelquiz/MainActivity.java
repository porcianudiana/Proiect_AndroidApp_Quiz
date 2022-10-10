package com.example.hotelquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn_start_quiz;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_start_quiz=findViewById(R.id.porcianu_andreea_diana_start_quiz);
        btn_start_quiz.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, QuizActivity.class );
                startActivity(intent);
            }
        });
    }
}