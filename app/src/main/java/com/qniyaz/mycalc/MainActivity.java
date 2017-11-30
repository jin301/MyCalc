package com.qniyaz.mycalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.app.AlertDialog;

public class MainActivity extends AppCompatActivity {
    Button button1 = null;
    Button button2 = null;
    Button button3 = null;
    Button button4 = null;
    Button button5 = null;
    Button button6 = null;
    Button button7 = null;
    EditText editText1 = null;
    EditText editText2 = null;
    EditText editText3 = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        editText1 = (EditText) findViewById(R.id.editText1);
        editText2 = (EditText) findViewById(R.id.editText2);
        editText3 = (EditText) findViewById(R.id.editText3);

        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                double num1;
                double num2;
                String Result;
                num1 = Double.parseDouble(editText1.getText().toString());
                num2 = Double.parseDouble(editText2.getText().toString());
                Result = Double.toString(num1 + num2);
                editText3.setText(Result.toCharArray(), 0, Result.length());
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                double num1;
                double num2;
                String Result;
                num1 = Double.parseDouble(editText1.getText().toString());
                num2 = Double.parseDouble(editText2.getText().toString());
                Result = Double.toString(num1 - num2);
                editText3.setText(Result.toCharArray(), 0, Result.length());
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                double num1;
                double num2;
                String Result;
                num1 = Double.parseDouble(editText1.getText().toString());
                num2 = Double.parseDouble(editText2.getText().toString());
                Result = Double.toString(num1 * num2);
                editText3.setText(Result.toCharArray(), 0, Result.length());
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                double num1;
                double num2;
                String Result;
                num1 = Double.parseDouble(editText1.getText().toString());
                num2 = Double.parseDouble(editText2.getText().toString());

                if (num2 == 0) {
                    new AlertDialog.Builder(MainActivity.this)
                            .setTitle("Error!")
                            .setMessage("Operand2 can't be zero.")
                            .setPositiveButton("OK", null)
                            .show();
                } else {
                    Result = Double.toString(num1 / num2);
                    editText3.setText(Result.toCharArray(), 0, Result.length());
                }
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                double num1;
                double num2;
                String Result;

                num1 = Double.parseDouble(editText1.getText().toString());
                num2 = Double.parseDouble(editText2.getText().toString());

                if ((num2 % 2 == 0) && num1 < 0) {
                    new AlertDialog.Builder(MainActivity.this)
                            .setTitle("Error!")
                            .setMessage("Operand 1 should be greater than or equal to zero.")
                            .setPositiveButton("OK", null)
                            .show();
                } else {
                    Result = Double.toString(Math.pow(num1, 1d / num2));
                    editText3.setText(Result.toCharArray(), 0, Result.length());
                }
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                double num1;
                double num2;
                String Result;
                num1 = Double.parseDouble(editText1.getText().toString());
                num2 = Double.parseDouble(editText2.getText().toString());
                Result = Double.toString(Math.pow(num1, num2));
                editText3.setText(Result.toCharArray(), 0, Result.length());
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                editText1.setText("");
                editText2.setText("");
                editText3.setText("");
            }
        });
    }
}