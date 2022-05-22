package com.chengoconnell.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText firstNumber = findViewById(R.id.number1);
        EditText secondNumber = findViewById(R.id.number2);
        RadioGroup operators = findViewById(R.id.radioGroup);
        RadioButton add = findViewById(R.id.add);
        RadioButton subtract = findViewById(R.id.subtract);
        Button equals = findViewById(R.id.equals);
        TextView result = findViewById(R.id.result);

        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstNumberValue = Integer.parseInt(firstNumber.getText().toString());
                int secondNumberValue = Integer.parseInt(secondNumber.getText().toString());
                Integer operatorButtonId = operators.getCheckedRadioButtonId();
                Integer answer;
                if (operatorButtonId == add.getId()) {
                    answer = firstNumberValue + secondNumberValue;
                } else {
                    answer = firstNumberValue - secondNumberValue;
                }
                result.setText(answer.toString());
            }
        });

    }
}