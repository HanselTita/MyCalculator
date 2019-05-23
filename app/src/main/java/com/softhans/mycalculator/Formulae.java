package com.softhans.mycalculator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Formulae extends AppCompatActivity {

    private Button areaButton;
    private Button volButton;
    private Button vecButton;
    private Button comButton;
    private Button triButton;
    private Button geoButton;
    private Button seqButton;
    private Button derButton;
    private Button logButton;
    private Button setproButton;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulae);

// linking button names to the buttons

        areaButton = (Button) findViewById(R.id.magButtonID);
        volButton = (Button) findViewById(R.id.regprButtonID);
        vecButton = (Button) findViewById(R.id.dirButtonID);
        comButton = (Button) findViewById(R.id.sphereButtonID);
        triButton = (Button) findViewById(R.id.cylinderButtonID);
        geoButton = (Button) findViewById(R.id.conePyramidButtonID);
        seqButton = (Button) findViewById(R.id.sequencesButtonID);
        derButton = (Button) findViewById(R.id.derivativesButtonID);
        logButton = (Button) findViewById(R.id.logarithmButtonID);
        setproButton = (Button) findViewById(R.id.setProbabilitiesButtonID);


        //code for their different functions. which sending the user to another window or activity

        areaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Formulae.this, AreaFormulae.class));
            }
        });


        volButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Formulae.this,volumeFomulae.class));
            }
        });



        /*
        comButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Formulae.this, ComFormulae.class));
            }
        });
        triButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Formulae.this, TriFormulae.class));
            }
        });
       geoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Formulae.this, GeoFormulae.class));
            }
        });
        seqButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Formulae.this, SeqFormulae.class));
            }
        });
        derButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Formulae.this, DerFormulae.class));
            }
        });
        logButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Formulae.this, LogFormulae.class));
            }
        });
        setproButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Formulae.this, SetProFormulae.class));
            }
        });
       eqfuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Formulae.this, EqFuFormulae.class));
            }
        });
        exButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Formulae.this, ExFormulae.class));
            }
        });
        */

    }
}
