package com.introtoandroid.calculator_durham;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    CardView button0, button1, button2, button3, button4, button5, button6, button7, button8,
            button9, equals, decimal, plus, minus, divide, multiply, clear, clearAll, plusMinus;

    TextView calcView;

    Float valueOne;
    Float valueTwo;

    String operation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = (CardView) findViewById(R.id.button0);
        button1 = (CardView) findViewById(R.id.button1);
        button2 = (CardView) findViewById(R.id.button2);
        button3 = (CardView) findViewById(R.id.button3);
        button4 = (CardView) findViewById(R.id.button4);
        button5 = (CardView) findViewById(R.id.button5);
        button6 = (CardView) findViewById(R.id.button6);
        button7 = (CardView) findViewById(R.id.button7);
        button8 = (CardView) findViewById(R.id.button8);
        button9 = (CardView) findViewById(R.id.button9);
        equals = (CardView) findViewById(R.id.equals);
        decimal = (CardView) findViewById(R.id.decimal);
        plus = (CardView) findViewById(R.id.plus);
        minus = (CardView) findViewById(R.id.min);
        divide = (CardView) findViewById(R.id.div);
        multiply = (CardView) findViewById(R.id.mult);
        clear = (CardView) findViewById(R.id.clear);
        clearAll = (CardView) findViewById(R.id.clearOp);
        plusMinus = (CardView) findViewById(R.id.plusMin);

        calcView = (TextView) findViewById(R.id.viewCalc);

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcView.setText(calcView.getText() + "0");
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcView.setText(calcView.getText() + "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcView.setText(calcView.getText() + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcView.setText(calcView.getText() + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcView.setText(calcView.getText() + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcView.setText(calcView.getText() + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcView.setText(calcView.getText() + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcView.setText(calcView.getText() + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcView.setText(calcView.getText() + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcView.setText(calcView.getText() + "9");
            }
        });

        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!calcView.getText().toString().equals("")) {
                    valueTwo = Float.parseFloat(calcView.getText().toString());
                }
                if(operation == null){
                    //do nothing
                }

                else if(operation.equals("plus") && valueTwo != null){

                    valueOne += valueTwo;
                    calcView.setText(valueOne.toString() );
                    operation=null;
                    valueOne=null;
                    valueTwo=null;
                }
                else if(operation.equals("minus") && valueTwo != null){

                    valueOne -= valueTwo;
                    calcView.setText(valueOne.toString());
                    operation=null;
                    valueOne=null;
                    valueTwo=null;
                }
                else if(operation.equals("divide") && valueTwo != null){

                    valueOne = valueOne/valueTwo;
                    calcView.setText(valueOne.toString());
                    operation=null;
                    valueOne=null;
                    valueTwo=null;
                }
                else if(operation.equals("multiply") && valueTwo != null){

                    valueOne = valueOne * valueTwo;
                    calcView.setText(valueOne.toString());
                    operation=null;
                    valueOne=null;
                    valueTwo=null;
                }
                else{
                    //case: user puts in number then presses = without operation
                        //should do nothing --> moved to first case statement
                    //case: user puts in number and operation with out second number
                        //apple makes valuetwo equal to valueOne and does the operation
                        //I think you should prompt for another number
                    Toast t = Toast.makeText(getApplicationContext(), "Enter Another Number", Toast.LENGTH_LONG);
                    t.show();
                }

            }
        });

        decimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcView.setText(calcView.getText() + ".");
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!calcView.getText().toString().equals("")) {
                    operation = "plus";
                    valueOne = Float.parseFloat(calcView.getText().toString());
                    calcView.setText(null);

                }

            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!calcView.getText().toString().equals("")) {
                    operation = "minus";
                    valueOne = Float.parseFloat(calcView.getText().toString());
                    calcView.setText(null);

                }
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!calcView.getText().toString().equals("")) {
                    operation = "divide";
                    valueOne = Float.parseFloat(calcView.getText().toString());
                    calcView.setText(null);

                }
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!calcView.getText().toString().equals("")) {
                    operation = "multiply";
                    valueOne = Float.parseFloat(calcView.getText().toString());
                    calcView.setText(null);

                }
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcView.setText(null);
            }
        });

        clearAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcView.setText(null);
                operation = null;
                valueOne = null;
            }
        });

        plusMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Float temp = Float.parseFloat(calcView.getText().toString()) * -1;
                calcView.setText(temp.toString());
            }
        });


    }
}
