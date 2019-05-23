package com.softhans.mycalculator;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TemperatureConverter extends AppCompatActivity {

    private Button celsiusButton;
    private Button kelvinButton;
    private Button fahButton;

    private EditText enterUnit;
    private TextView resultTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature_converter);


        enterUnit = (EditText) findViewById(R.id.unitEditText);
        resultTextView = (TextView) findViewById(R.id.resultId);


        celsiusButton = (Button) findViewById(R.id.celsiusButtonID);
        celsiusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

/*
formula for Celsius (C) to
	Fahrenheits =(C * 1.8) + 32	 // Celsius= C //	kelvin = C + 273.15
 */
                double result = 0.0;


                if (enterUnit.getText().toString().equals("")) {

                    resultTextView.setText(R.string.error_message);
                    resultTextView.setTextColor(Color.RED);
                } else {
                    double cValue = Double.parseDouble(enterUnit.getText().toString());

                    double result1 = cValue * 1;
                    double result2 = (cValue * 1.8) + 32;
                    double result3 = cValue + 273.15;


                    resultTextView.setTextColor(Color.DKGRAY);
                    resultTextView.setText((String.format("%.2f", result1) + " " + "Celsius" + " " + "Is equal to:")
                            + System.getProperty("line.separator") + (String.format("%.2f", result2) + " " + "Fahrenheit .")
                            + System.getProperty("line.separator") + (String.format("%.2f", result3) + " " + "Kelvin.")
                            + System.getProperty("line.separator") + "Results to 2dp."
                    );

                }
            }
        });

        kelvinButton = (Button) findViewById(R.id.kelvinButtonID);
        kelvinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

/*
formula for Kelvin (K) to
	Fahrenheits =(K - 273.15) * 1.8 + 32 // Celsius= K - 273.15 //	kelvin = K
 */
                double result = 0.0;


                if (enterUnit.getText().toString().equals("")) {

                    resultTextView.setText(R.string.error_message);
                    resultTextView.setTextColor(Color.RED);
                } else {
                    double kValue = Double.parseDouble(enterUnit.getText().toString());

                    double result4 = (kValue - 273.15) * 1.8;
                    double result5 = kValue - 273.15;
                    double result6 = kValue *1;


                    resultTextView.setTextColor(Color.DKGRAY);
                    resultTextView.setText((String.format("%.2f", result6) + " " + "Kelvin" + " " + "Is equal to:")
                            + System.getProperty("line.separator") + (String.format("%.2f", result5) + " " + "Celsius.")
                            + System.getProperty("line.separator") + (String.format("%.2f", result4) + " " + "Fahrenheit .")
                            + System.getProperty("line.separator") + "Results to 2dp."
                    );

                }
            }
        });

        fahButton = (Button) findViewById(R.id.fahrenheitButtonID);
      fahButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

/*
formula for Fahrenheits (F) to

	Fahrenheits = F // Celsius= (F - 32) * 0.5555555556 //	kelvin = (F - 32) * 0.5555555556 + 273.15
 */
                double result = 0.0;


                if (enterUnit.getText().toString().equals("")) {

                    resultTextView.setText(R.string.error_message);
                    resultTextView.setTextColor(Color.RED);
                } else {
                    double fValue = Double.parseDouble(enterUnit.getText().toString());

                    double result7 = fValue * 1;
                    double result8 = (fValue - 32) * 0.5555555556;
                    double result9 = (fValue - 32) * 0.5555555556 + 273.15;


                    resultTextView.setTextColor(Color.DKGRAY);
                    resultTextView.setText((String.format("%.2f", result7) + " " + "Fahrenheit" + " " + "Is equal to:")
                            + System.getProperty("line.separator") + (String.format("%.2f", result9) + " " + "Kelvin.")
                            + System.getProperty("line.separator") + (String.format("%.2f", result8) + " " + "Celsius.")
                            + System.getProperty("line.separator") + "Results to 2dp."
                    );

                }
            }
        });


    }
}
