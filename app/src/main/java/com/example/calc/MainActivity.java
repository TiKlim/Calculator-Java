package com.example.calc;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    String firstOperand;
    String secondOperand;

    EditText editText;
    TextView textPreviously;
    Button zero;
    Button one;
    Button two;
    Button three;
    Button four;
    Button five;
    Button six;
    Button seven;
    Button eight;
    Button nine;
    Button addition;
    Button minus;
    Button multiplication;
    Button division;
    Button coma;
    Button sign;
    Button percentage;
    Button subtraction;
    Button clear;
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.in);
        textPreviously = findViewById(R.id.out);
        zero = findViewById(R.id.zero);
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        back = findViewById(R.id.back);
        clear = findViewById(R.id.clear);
        sign = findViewById(R.id.sign);
        addition = findViewById(R.id.addition);
        minus = findViewById(R.id.minus);
        multiplication = findViewById(R.id.multiplication);
        division = findViewById(R.id.division);
        percentage = findViewById(R.id.percentage);
        coma = findViewById(R.id.coma);
        subtraction = findViewById(R.id.subtraction);



        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = v.getTag().toString();
                PrintNumber(s);
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = v.getTag().toString();
                PrintNumber(s);
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = v.getTag().toString();
                PrintNumber(s);
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = v.getTag().toString();
                PrintNumber(s);
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = v.getTag().toString();
                PrintNumber(s);
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = v.getTag().toString();
                PrintNumber(s);
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = v.getTag().toString();
                PrintNumber(s);
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = v.getTag().toString();
                PrintNumber(s);
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = v.getTag().toString();
                PrintNumber(s);
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = v.getTag().toString();
                PrintNumber(s);
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String clearT  = editText.getText().toString().equals("0") ? "" : editText.getText().toString();
                editText.setText(clearT, TextView.BufferType.EDITABLE);
                if (!editText.getText().toString().equals("")){
                    editText.setText(editText.getText().toString().substring(0, editText.getText().toString().length() - 1), TextView.BufferType.EDITABLE);
                }
                String clearTafter  = editText.getText().toString().equals("") ? "0" : editText.getText().toString();
                editText.setText(clearTafter, TextView.BufferType.EDITABLE);
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText("", TextView.BufferType.EDITABLE);
                String clearTafter  = editText.getText().toString().equals("") ? "0" : editText.getText().toString();
                editText.setText(clearTafter, TextView.BufferType.EDITABLE);
                textPreviously.setText("", TextView.BufferType.EDITABLE);
                firstOperand = secondOperand = null;
            }
        });

        coma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String clearT  = editText.getText().toString().equals("0") ? "" : editText.getText().toString();
                editText.setText(clearT, TextView.BufferType.EDITABLE);
                if(!editText.getText().toString().contains(".")){
                    if(editText.getText().toString().equals("")){
                        editText.setText(editText.getText()+"0.", TextView.BufferType.EDITABLE);
                    }
                    else{
                        editText.setText(editText.getText()+".", TextView.BufferType.EDITABLE);
                    }
                }
            }
        });

        sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!editText.getText().toString().equals("0") && !editText.getText().toString().equals("0.")){
                    char sym = editText.getText().toString().charAt(0);
                    String string = sym == '-' ? editText.getText().toString().substring(1) : "-" + editText.getText().toString();
                    editText.setText(string, TextView.BufferType.EDITABLE);
                }
            }
        });

        percentage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!editText.getText().toString().equals("0") && !editText.getText().toString().equals("0.")){
                    String a = editText.getText().toString();
                    double s = Integer.parseInt(a) /100;
                    editText.setText(String.valueOf(s));
                }
            }
        });

        addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = v.getTag().toString();
                Operation(s);
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = v.getTag().toString();
                Operation(s);
            }
        });

        multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = v.getTag().toString();
                Operation(s);
            }
        });

        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = v.getTag().toString();
                Operation(s);
            }
        });
    }
    public void PrintNumber(String btn){
        String clearT  = editText.getText().toString().equals("0") ? "" : editText.getText().toString();
        switch (btn){
            case "0":
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
            case "7":
            case "8":
            case "9":
                editText.setText(clearT, TextView.BufferType.EDITABLE);
                editText.setText(editText.getText()+btn, TextView.BufferType.EDITABLE);
                break;

        }
    }
    public void Operation(String btn){
        if (textPreviously.getText().toString().isEmpty()){
            firstOperand = editText.getText().toString();
            switch (btn){
                case "+":
                case "-":
                case "/":
                case "*":
                    textPreviously.setText(editText.getText().toString() + " " + btn, TextView.BufferType.EDITABLE);
                    break;
                case "=":
                    if(!textPreviously.getText().toString().equals("")){
                        secondOperand = firstOperand;
                        Equal();
                    }
                    break;
            }
        }
        else {
            secondOperand = editText.getText().toString();
            Equal();
        }
    }
    public void Equal(){
        double num1 = Double.valueOf(firstOperand);
        double num2 = Double.valueOf(secondOperand);
        double equation = 0;
        switch (textPreviously.getText().toString().charAt(textPreviously.getText().toString().length()-1)){
            case '+':
                equation = num1 + num2;
                break;
            case '-':
                equation = num1 - num2;
                break;
            case '*':
                equation = num1 * num2;
                break;
            case '/':
                equation = num1 / num2;
                break;
        }
        editText.setText(String.valueOf(equation),TextView.BufferType.EDITABLE);
    }
}