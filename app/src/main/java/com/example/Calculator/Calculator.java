package com.example.Calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class Calculator extends AppCompatActivity {

    Button textZero;
    Button textOne;
    Button textTwo;
    Button textThree;
    Button textFour;
    Button textFive;
    Button textSix;
    Button textSeven;
    Button textEight;
    Button textNine;
    Button textPoint;
    Button textRemoval;
    Button textEqually;
    Button textPlus;
    Button textMultiplication;
    Button textMinus;
    Button textDivision;
    ImageButton textDelete;
    EditText textResult;

    float mValueOne, mValueTwo;

    boolean textAddition, textSubtract, crunchifyMultiplication, crunchifyRemoval;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textZero = findViewById(R.id.zero);
        textOne = findViewById(R.id.one);
        textTwo = findViewById(R.id.two);
        textThree = findViewById(R.id.three);
        textFour = findViewById(R.id.four);
        textFive = findViewById(R.id.five);
        textSix = findViewById(R.id.six);
        textSeven = findViewById(R.id.seven);
        textEight = findViewById(R.id.eight);
        textNine = findViewById(R.id.nine);
        textPoint = findViewById(R.id.point);
        textPlus = findViewById(R.id.plus);
        textMultiplication = findViewById(R.id.multiplication);
        textRemoval = findViewById(R.id.removal);
        textEqually = findViewById(R.id.equally);
        textMinus = findViewById(R.id.minus);
        textDivision = findViewById(R.id.division);
        textDelete = findViewById(R.id.imageButton);
        textResult = findViewById(R.id.result);


            textZero.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    textResult.setText(textResult.getText() + "0");
                }
            });

            textOne.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    textResult.setText(textResult.getText() + "1");
                }
            });

            textTwo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    textResult.setText(textResult.getText() + "2");
                }
            });

            textThree.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    textResult.setText(textResult.getText() + "3");
                }
            });

            textFour.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    textResult.setText(textResult.getText() + "4");
                }
            });

            textFive.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    textResult.setText(textResult.getText() + "5");
                }
            });

            textSix.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    textResult.setText(textResult.getText() + "6");
                }
            });

            textSeven.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    textResult.setText(textResult.getText() + "7");
                }
            });

            textEight.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    textResult.setText(textResult.getText() + "8");
                }
            });

            textNine.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    textResult.setText(textResult.getText() + "9");
                }
            });


            textRemoval.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mValueOne = Float.parseFloat(textResult.getText() + "");
                    crunchifyRemoval = true;
                    textResult.setText(null);
                }
            });

            textPlus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (textResult == null) {
                        textResult.setText("");
                    } else {
                        mValueOne = Float.parseFloat(textResult.getText() + "");
                        textAddition = true;
                        textResult.setText(null);
                    }
                }
            });

            textMinus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mValueOne = Float.parseFloat(textResult.getText() + "");
                    textSubtract = true;
                    textResult.setText(null);
                }
            });

            textMultiplication.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mValueOne = Float.parseFloat(textResult.getText() + "");
                    crunchifyMultiplication = true;
                    textResult.setText(null);
                }
            });


            textEqually.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mValueTwo = Float.parseFloat(textResult.getText() + "");

                    if (textAddition == true) {
                        textResult.setText(mValueOne + mValueTwo + "");
                        textAddition = false;
                    }

                    if (textSubtract == true) {
                        textResult.setText(mValueOne - mValueTwo + "");
                        textSubtract = false;
                    }

                    if (crunchifyMultiplication == true) {
                        textResult.setText(mValueOne * mValueTwo + "");
                        crunchifyMultiplication = false;
                    }

                    if (crunchifyRemoval == true) {
                        textResult.setText(mValueOne / mValueTwo + "");
                        crunchifyRemoval = false;
                    }
                }
            });

            textDelete.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    textResult.setText("");
                }
            });

            textPoint.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    textResult.setText(textResult.getText() + ".");
                }
            });


        }
    }