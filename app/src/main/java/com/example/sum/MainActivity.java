package com.example.sum;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText firstNumber, secondNumber;
    Button findSum;
    TextView answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstNumber = findViewById(R.id.num1);
        secondNumber = findViewById(R.id.num2);
        findSum = findViewById(R.id.btn1);
        answer = findViewById(R.id.answer);
        findAdd(findSum);
    }
        public void findAdd(Button btn){
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int a=Integer.parseInt(firstNumber.getText().toString());
                    int b=Integer.parseInt(secondNumber.getText().toString());
                    answer.setText(Integer.toString(a+b));
                }
            });
        }
    }
