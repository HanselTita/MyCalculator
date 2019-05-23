package com.softhans.mycalculator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class UnitConversion extends AppCompatActivity {

 private Button goToLength;
 private Button goToVolume;
 private Button goToTemp;
 private Button goToWeight;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit_conversion);

        goToLength = (Button) findViewById(R.id.lengthButtonID);
        goToLength.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(UnitConversion.this, lengthConverter.class));
            }
        });

        goToVolume = (Button) findViewById(R.id.regprButtonID);
        goToVolume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(UnitConversion.this, volumeConverter.class));
            }
        });

        goToTemp = (Button) findViewById(R.id.tempButtonID);
        goToTemp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(UnitConversion.this, TemperatureConverter.class));
            }
        });


        goToWeight = (Button) findViewById(R.id.weightButtonID);
        goToWeight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(UnitConversion.this, WeightConverter.class));
            }
        });
    }
}
