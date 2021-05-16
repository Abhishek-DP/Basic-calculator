package com.example.calculatorbasic;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView result;
    Button one,two,three,four,five,six,seven,eight,nine,zero,plus,minus,divide,multiply,clear,decimal,equals,back;


    String calculate_string(String newdata, int start, int end)
    {
        StringBuilder value2_string= new StringBuilder();
        for (int i = start; i<end; i++)
        {
            if (newdata.charAt(i)=='/' || newdata.charAt(i)=='x' || newdata.charAt(i)=='-' || newdata.charAt(i)=='+')
            {
                break;
            }
            else
            {
                value2_string.append(newdata.charAt(i));
            }
        }
        return value2_string.toString();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Output will be displayed in the result edit box
        result = findViewById(R.id.result);

        // Numbers representing the grid layout from xml layout
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        zero = findViewById(R.id.zero);
        decimal = findViewById(R.id.decimal);

        // Basic arithmatic operations performed by calculator
        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        divide = findViewById(R.id.divide);
        multiply = findViewById(R.id.multiply);
        equals = findViewById(R.id.equals);

        // To clear screen
        clear = findViewById(R.id.clear);
        back = findViewById(R.id.back);

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("");
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence newdata = result.getText();
                if (newdata.length()>0)
                {
                    result.setText(newdata.subSequence(0,newdata.length()-1));
                }
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence newdata = result.getText();
                result.setText(new StringBuilder().append(newdata).append("1").toString());
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence newdata = result.getText();
                result.setText(new StringBuilder().append(newdata).append("2").toString());
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence newdata = result.getText();
                result.setText(new StringBuilder().append(newdata).append("3").toString());
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence newdata = result.getText();
                result.setText(new StringBuilder().append(newdata).append("4").toString());
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence newdata = result.getText();
                result.setText(new StringBuilder().append(newdata).append("5").toString());
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence newdata = result.getText();
                result.setText(new StringBuilder().append(newdata).append("6").toString());
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence newdata = result.getText();
                result.setText(new StringBuilder().append(newdata).append("7").toString());
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence newdata = result.getText();
                result.setText(new StringBuilder().append(newdata).append("8").toString());
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence newdata = result.getText();
                result.setText(new StringBuilder().append(newdata).append("9").toString());
            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence newdata = result.getText();
                result.setText(new StringBuilder().append(newdata).append("0").toString());
            }
        });

        decimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence newdata = result.getText();
                if (newdata.length()>0)
                {
                    result.setText(new StringBuilder().append(newdata).append(".").toString());
                }
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence newdata = result.getText();
                if (newdata.length()>0)
                {
                    result.setText(new StringBuilder().append(newdata).append("/").toString());
                }
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence newdata = result.getText();
                if (newdata.length()>0)
                {
                    result.setText(new StringBuilder().append(newdata).append("x").toString());
                }
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence newdata = result.getText();
                if (newdata.length()>0)
                {
                    result.setText(new StringBuilder().append(newdata).append("-").toString());
                }
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CharSequence newdata = result.getText();
                if (newdata.length()>0)
                {
                    result.setText(new StringBuilder().append(newdata).append("+").toString());
                }
            }
        });

        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder value1_string= new StringBuilder();
                String value2_string="";
                String newdata = result.getText().toString();
                float value1=0f;
                boolean value1_set=false;

                for (int i =0;i<newdata.length();i++)
                {
                    if (newdata.charAt(i)=='/' || newdata.charAt(i)=='x' || newdata.charAt(i)=='-' || newdata.charAt(i)=='+')
                    {
                        System.out.println("Value1_string: "+value1_string);
                        value2_string=calculate_string(newdata,i+1,newdata.length());
                        System.out.println("Value2_string: "+value2_string);
                        if (value2_string=="")break;
                        if (value1_set)
                        {
                            if (newdata.charAt(i)=='/') {
                                value1 = value1 / Float.parseFloat(value2_string);
                            }
                            else if (newdata.charAt(i)=='x') {
                                value1 = value1 * Float.parseFloat(value2_string);
                            }
                            else if (newdata.charAt(i)=='-') {
                                value1 = value1 - Float.parseFloat(value2_string);
                            }
                            else if (newdata.charAt(i)=='+') {
                                value1 = value1 + Float.parseFloat(value2_string);
                            }
                        }
                        else
                        {
                            if (newdata.charAt(i)=='/') {
                                value1 = Float.parseFloat(value1_string.toString()) / Float.parseFloat(value2_string);
                            }
                            else if (newdata.charAt(i)=='x') {
                                value1 = Float.parseFloat(value1_string.toString()) * Float.parseFloat(value2_string);
                            }
                            else if (newdata.charAt(i)=='-') {
                                value1 = Float.parseFloat(value1_string.toString()) - Float.parseFloat(value2_string);
                            }
                            else if (newdata.charAt(i)=='+') {
                                value1 = Float.parseFloat(value1_string.toString()) + Float.parseFloat(value2_string);
                            }
                            value1_set = true;
                        }
                        System.out.println("Value1: "+value1);
                    }
                    if (!value1_set)
                    {
                        value1_string.append(newdata.charAt(i));
                    }
                }
                if (!value1_set)
                {
                    result.setText(newdata);
                }
                else {
                    result.setText(String.valueOf(value1));
                }
            }
        });
    }


}