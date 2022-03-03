package com.example.deepakscalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Initialize variable to store functionality of views
    EditText firstValue, secondValue;
    TextView answer;
    Button add, subtract, multiply, divide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Find view and store it in variables to work with it
        //R.id means res i.e resource, all ids are there
        firstValue = findViewById(R.id.editFirstValue);
        secondValue = findViewById(R.id.editSecondValue);

        answer = findViewById(R.id.textViewAnswer);

        add = findViewById(R.id.btnAdd);
        subtract = findViewById(R.id.btnSub);
        multiply = findViewById(R.id.btnMultiply);
        divide = findViewById(R.id.btnDivision);

        //Create functions to Make some functionality, which buttons should do

        //Functionality For Addition Button
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Whichever text is getting as an input, convert that text into string, and that string into int
                //Create int Variables to store that two values
                int fValue, sValue, ans;

                fValue = Integer.parseInt(firstValue.getText().toString());
                sValue = Integer.parseInt(secondValue.getText().toString());

                ans = fValue + sValue;

                //Set or Pass above "ans" value in variable answer
                answer.setText("Answer is : " + ans);
            }
        });


        //Functionality For Subtraction Button
        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Whichever text is getting as an input, convert that text into string, and that string into int
                //Create int Variables to store that two values
                int fValue, sValue, ans;

                fValue = Integer.parseInt(firstValue.getText().toString());
                sValue = Integer.parseInt(secondValue.getText().toString());

                ans = fValue - sValue;

                //Set or Pass above "ans" value in variable answer
                answer.setText("Answer is : " + ans);
            }
        });


        //Functionality For Multiplication Button
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Whichever text is getting as an input, convert that text into string, and that string into int
                //Create int Variables to store that two values
                int fValue, sValue, ans;

                fValue = Integer.parseInt(firstValue.getText().toString());
                sValue = Integer.parseInt(secondValue.getText().toString());

                ans = fValue * sValue;

                //Set or Pass above "ans" value in variable answer
                answer.setText("Answer is : " + ans);
            }
        });


        //Functionality For Division Button
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Whichever text is getting as an input, convert that text into string, and that string into int
                //Create int Variables to store that two values
                int fValue, sValue, ans;

                fValue = Integer.parseInt(firstValue.getText().toString());
                sValue = Integer.parseInt(secondValue.getText().toString());

                ans = fValue / sValue;

                //Set or Pass above "ans" value in variable answer
                answer.setText("Answer is : " + ans);
            }
        });


    }
}