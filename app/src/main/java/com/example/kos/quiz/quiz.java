package com.example.kos.quiz;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class quiz extends AppCompatActivity {

    private Button mTtueButton;
    private Button mFalseButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        mTtueButton = (Button) findViewById(R.id.true_button);
        mTtueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(quiz.this, R.string.correct_toast,Toast.LENGTH_LONG).show();
            }
        });

        mFalseButton = (Button) findViewById(R.id.false_button);
        mFalseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(quiz.this, R.string.incorrect_toast,Toast.LENGTH_LONG).show();
            }
        });
    }
}
