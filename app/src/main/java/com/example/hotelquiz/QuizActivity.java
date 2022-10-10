package com.example.hotelquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class QuizActivity extends AppCompatActivity {

    public static final String KEY = "Key";
    private RadioButton b1,b5,b9,b11,b15,b16,b19;
    int score=0;
    private Button btn;
    private String rightAnswer1, rightAnswer2,rightAnswer3,rightAnswer4,rightAnswer5,rightAnswer6,rightAnswer7;
    private RadioGroup rg1,rg2,rg3,rg4,rg5,rg6,rg7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        b1 = findViewById(R.id.porcianu_andreea_diana_b1);
        b5 = findViewById(R.id.porcianu_andreea_diana_b5);
        b9 = findViewById(R.id.porcianu_andreea_diana_b9);
        b11 = findViewById(R.id.porcianu_andreea_diana_b11);
        b15 = findViewById(R.id.porcianu_andreea_diana_b15);
        b16 = findViewById(R.id.porcianu_andreea_diana_b16);
        b19 = findViewById(R.id.porcianu_andreea_diana_b19);
        btn=findViewById(R.id.porcianu_andreea_diana_see_score);
        rightAnswer1=b1.getText().toString();
        rightAnswer2=b5.getText().toString();
        rightAnswer3=b9.getText().toString();
        rightAnswer4=b11.getText().toString();
        rightAnswer5=b15.getText().toString();
        rightAnswer6=b16.getText().toString();
        rightAnswer7=b19.getText().toString();


        rg1=findViewById(R.id.porcianu_andreea_diana_radio_group1);
        rg2=findViewById(R.id.porcianu_andreea_diana_radio_group2);
        rg3=findViewById(R.id.porcianu_andreea_diana_radio_group3);
        rg4=findViewById(R.id.porcianu_andreea_diana_radio_group4);
        rg5=findViewById(R.id.porcianu_andreea_diana_radio_group5);
        rg6=findViewById(R.id.porcianu_andreea_diana_radio_group6);
        rg7=findViewById(R.id.porcianu_andreea_diana_radio_group7);




        btn.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v) {
                checkButton();
                Intent intent=new Intent(QuizActivity.this, ScoreActivity.class );
                intent.putExtra(KEY,score);
                startActivity(intent);


            }
        });



    }

    private int checkButton()
    {

        int selectedId_rg1 = rg1.getCheckedRadioButtonId();
        RadioButton selectedRadioButton1 = (RadioButton)findViewById(selectedId_rg1);
        String btnText1=selectedRadioButton1.getText().toString();
        if(btnText1.equals(rightAnswer1)){
            score++;
        }
        int selectedId_rg2 = rg2.getCheckedRadioButtonId();
        RadioButton selectedRadioButton2 = (RadioButton)findViewById(selectedId_rg2);
        String btnText2=selectedRadioButton2.getText().toString();
        if(btnText2.equals(rightAnswer2)){
            score++;
        }
        int selectedId_rg3 = rg3.getCheckedRadioButtonId();
        RadioButton selectedRadioButton3 = (RadioButton)findViewById(selectedId_rg3);
        String btnText3=selectedRadioButton3.getText().toString();
        if(btnText3.equals(rightAnswer3)){
            score++;
        }
        int selectedId_rg4 = rg4.getCheckedRadioButtonId();
        RadioButton selectedRadioButton4 = (RadioButton)findViewById(selectedId_rg4);
        String btnText4=selectedRadioButton4.getText().toString();
        if(btnText4.equals(rightAnswer4)){
            score++;
        }
        int selectedId_rg5 = rg5.getCheckedRadioButtonId();
        RadioButton selectedRadioButton5 = (RadioButton)findViewById(selectedId_rg5);
        String btnText5=selectedRadioButton5.getText().toString();
        if(btnText5.equals(rightAnswer5)){
            score++;
        }
        int selectedId_rg6 = rg6.getCheckedRadioButtonId();
        RadioButton selectedRadioButton6 = (RadioButton)findViewById(selectedId_rg6);
        String btnText6=selectedRadioButton6.getText().toString();
        if(btnText6.equals(rightAnswer6)){
            score++;
        }
        int selectedId_rg7 = rg7.getCheckedRadioButtonId();
        RadioButton selectedRadioButton7 = (RadioButton)findViewById(selectedId_rg7);
        String btnText7=selectedRadioButton7.getText().toString();
        if(btnText7.equals(rightAnswer7)){
            score++;
        }


        return score;

    }





}