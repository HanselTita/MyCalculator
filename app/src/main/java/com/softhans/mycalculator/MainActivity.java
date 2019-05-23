package com.softhans.mycalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.DecimalFormat;


public class MainActivity extends AppCompatActivity {

    /**
     * HOW TO PROGRAM A SIMPLY CALCULATOR
     * 1. Declare all your component created in the activity_main.xml.
     */
  
    private TextView result;
    private TextView display;
    private  Button unitConverter;
    private Button formulae;



    // since there are many buttons, we declare one variable and fit in all the rest.

    private Button cancelBtn, bckspaceBtn, percentBtn, divideBtn, btn7, btn8, btn9, multiplyBtn,
                   btn4, btn5, btn6, subtractBtn, btn1, btn2, btn3, addBtn, btn0, dotBtn, negBtn,
                   equalBtn;

    // Give names to the first and second values shall click, when using the arithmetic operation

    private double val1 = Double.NaN, val2;

    /** Val1 stands for the first value we type and val2 for the second value after our
     * arithmetic operation. example val1 + val2
     * Use double because the values can be a large or small number &  can possibly have a decimal point.
     *NaN means "Not a Number".
     */

    private final char ADDITION = '+', SUBTRACTION ='-', MULTIPLICATION ='*', DIVISION = '/';
    private char ACTION;


    DecimalFormat decimalFormat = new DecimalFormat("#.##########");

    /** Import java.text.DecimalFormat so as to format the output of our calculator.
     * The decimal format constructor permits displaying up to ten decimal places.
     *it helps to delete the .0 that will appear behind whole numbers.
     *
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

/**
 * 2. We identify the different component we created in the activity_main.xml with the identities
 * which we gave.
 */
        result = (TextView) findViewById(R.id.result);
        display = (TextView) findViewById(R.id.display);

        unitConverter = (Button) findViewById(R.id.converterBtn);
        formulae = (Button) findViewById(R.id.formulaeBtn);

        //code for the unitconverter and formulae button to take us to a new window.

        unitConverter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            startActivity(new Intent(MainActivity.this, UnitConversion.class));
            }
        });

        formulae.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Formulae.class));
            }
        });

/**the above code emplies, my component called "result" is a textview. look for its identity in resource (R)
 * the id name is "result".. as i gave in activity_main.xml.
 * We give similar expression to all the rest.
 */




        cancelBtn = (Button) findViewById(R.id.cancelBtn);
        bckspaceBtn = (Button) findViewById(R.id.backspaceBtn);
        percentBtn = (Button) findViewById(R.id.percentBtn);
        divideBtn = (Button) findViewById(R.id.divideBtn);
        subtractBtn = (Button) findViewById(R.id.subtractBtn);
        addBtn = (Button) findViewById(R.id.addBtn);
        dotBtn = (Button) findViewById(R.id.dotBtn);
        negBtn = (Button) findViewById(R.id.negBtn);
        equalBtn = (Button) findViewById(R.id.equalBtn);
        multiplyBtn = (Button) findViewById(R.id.multiplyBtn);
        btn9 = (Button) findViewById(R.id.btn9);
        btn8 = (Button) findViewById(R.id.btn8);
        btn7 = (Button) findViewById(R.id.btn7);
        btn6 = (Button) findViewById(R.id.btn6);
        btn5 = (Button) findViewById(R.id.btn5);
        btn4 = (Button) findViewById(R.id.btn4);
        btn3 = (Button) findViewById(R.id.btn3);
        btn2 = (Button) findViewById(R.id.btn2);
        btn1 = (Button) findViewById(R.id.btn1);
        btn0 = (Button) findViewById(R.id.btn0);


        /**
         * 3. We create a setOnClickListener Method for each components or buttons.
         * This method emplies,...when a button/component is clicked, let the following happened.
         * In the calculator, is emplies, when a particular button is clicked, let it result
         * in the textview whose id is "result".
         * To do that;
         * a) type the button.
         * b) follow by a dot (.)
         * c) type setOnClickListener(new View.OnclickListener()...
         * most of the time android studio will give you options in a pop up menu which helps you
         * finish the coding.
         */
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "0");
            }
        });
/**
 * // the above code reads: " in the "display" textView, display(i.e.setText) whatever was first typed
 * (i.e.display.getText()) if any and at 0 to it.
 * the code is similar for the rest of the number buttons.
 */
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "9");
            }
        });
        dotBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + ".");
            }
        });
        negBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText("-" + display.getText());
            }
        });
        bckspaceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (display.getText().length() > 0) {
                    CharSequence name =display.getText().toString();
                    display.setText(name.subSequence(0, name.length()-1));
                    result.setText(" ");
                }
            }
        });

        cancelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText("");
                result.setText(" ");// Clear the screens.


            }
        });


        equalBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               result.setText(result.getText().toString() + String.valueOf(val2) + " = " + String.valueOf(val1));
                display.setText(null);


            }
        });
       addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                ACTION = ADDITION;
                result.setText(decimalFormat.format(val1) + "+");// Get whatever was firs typed and add a "+" after it
                display.setText(null);

            }
        });

       subtractBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                ACTION = SUBTRACTION;
                result.setText(decimalFormat.format(val1) + "-");
                display.setText(null);
            }
        });

        multiplyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                ACTION = MULTIPLICATION;
                result.setText(decimalFormat.format(val1) + "*");
                display.setText(null);
            }
        });

        divideBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                ACTION = DIVISION;
                result.setText(decimalFormat.format(val1) + "/");
                display.setText(null);
            }
        });

        equalBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();

                result.setText(result.getText().toString() +
                        decimalFormat.format(val2) + " = " + decimalFormat.format(val1));
                display.setText(null);
                val1 = Double.NaN;
                ACTION = '0';
            }
        });

        percentBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION = DIVISION;
                result.setText(String.valueOf(val1 / 100));
                display.setText(null);

            }
        });

    }

    private void compute() {

        /**
         * 4. The compute method is  created for the arithmetic operations.
         * the method is equally needed in the percentage and equal to. method.
         */

        if (!Double.isNaN(val1)) {
            val2 = Double.parseDouble(display.getText().toString());

            switch (ACTION) {

                case ADDITION:
                    val1 = this.val1 + val2;
                    break;

                case SUBTRACTION:
                    val1 = this.val1 - val2;
                    break;
                case MULTIPLICATION:
                    val1 = this.val1 * val2;
                    break;
                case DIVISION:
                    val1 = this.val1 / val2;
                    break;
            }


        } else {
            val1 = Double.parseDouble(display.getText().toString());
        }

    }

    /**A switch allows a variable to be tested for equality against a list of values.
     * Each value is called a case, and the variable being switched on is checked for each case.
     * A break statement ends the switch case.
     * Case statement ends with a colon (:) not semi colon (;)
     * we use "val1 =" instead of "display.getText" because our answer automatically becomes
     * a value and can be further calculated upon.
     */






}
