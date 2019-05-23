package com.softhans.mycalculator;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class WeightConverter extends AppCompatActivity {

    private EditText enterUnit;

    private Button gButton;
    private Button kgButton;
    private Button lbButton;
    private Button ozButton;
    private Button caratButton;
    private Button stButton;
    private Button ltButton;
    private Button tButton;
    private Button grButton;


    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight_converter);

        enterUnit = (EditText) findViewById(R.id.unitEditText);
        resultTextView = (TextView) findViewById(R.id.resultId);



        //code for gram

        gButton = (Button) findViewById(R.id.gButtonID);
        gButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                double multipliera1 = 1;//g
                double multipliera2 = 0.001;//kg
                double multipliera3 = 0.0022046226218488;//lb
                double multipliera4 = 0.03527396194958;//oz
                double multipliera5 = 5;//carat(s)
                double multipliera6 = 0.0000011023113109244;//st
                double multipliera7 = 0.00000098420652761106;//lt
                double multipliera8 = 0.000001;//t
                double multipliera9 = 15.432358352941;//gr


                double result = 0.0;


                if (enterUnit.getText().toString().equals("")) {

                    resultTextView.setText(R.string.error_message);
                    resultTextView.setTextColor(Color.RED);
                } else {
                    double gValue = Double.parseDouble(enterUnit.getText().toString());

                    double resulta1 = gValue * multipliera1;
                    double resulta2 = gValue * multipliera2;
                    double resulta3 = gValue * multipliera3;
                    double resulta4 = gValue * multipliera4;
                    double resulta5 = gValue * multipliera5;
                    double resulta6 = gValue * multipliera6;
                    double resulta7 = gValue * multipliera7;
                    double resulta8 = gValue * multipliera8;
                    double resulta9 =gValue * multipliera9;

                    resultTextView.setTextColor(Color.DKGRAY);
                    resultTextView.setText((String.format("%.2f", resulta1) + " " + "gram(s)" + " " + "Is equal to:")
                            + System.getProperty("line.separator") + (String.format("%.2f", resulta2) + " " + "kilogram(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", resulta3) + " " + "pound(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", resulta4) + " " + "ounce(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", resulta5) + " " + "carat(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", resulta6) + " " + "short ton(US).")
                            + System.getProperty("line.separator") + (String.format("%.2f", resulta7) + " " + "long ton (Uk).")
                            + System.getProperty("line.separator") + (String.format("%.2f", resulta8) + " " + "ton(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", resulta9) + " " + "grain(s).")
                            + System.getProperty("line.separator") + "Results to 2dp."
                    );


                }
            }
        });


        //code for kilogram

        kgButton = (Button) findViewById(R.id.kgButtonID);
        kgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                double multiplieraa = 1000;//g
                double multipliera9 = 1;//kg
                double multipliera11 = 2.2046226218488;//lb
                double multipliera12= 5000;//oz
                double multipliera13 = 0.0011023113109244;//carat(s)
                double multipliera14 = 2.1133764188652;//st
                double multipliera15 = 0.00098420652761106;//lt
                double multipliera16 = 0.001;//t
                double multipliera17 = 15432.358352941;//gr




                double result = 0.0;



                if (enterUnit.getText().toString().equals("")) {

                    resultTextView.setText(R.string.error_message);
                    resultTextView.setTextColor(Color.RED);
                } else {
                    double kgValue = Double.parseDouble(enterUnit.getText().toString());
                    double resultaa = kgValue * multiplieraa;
                    double resulta9 = kgValue * multipliera9;
                    double resulta11 = kgValue * multipliera11;
                    double resulta12 = kgValue * multipliera12;
                    double resulta13 = kgValue * multipliera13;
                    double resulta14 = kgValue * multipliera14;
                    double resulta15= kgValue * multipliera15;
                    double resulta16 = kgValue * multipliera16;
                    double resulta17 =kgValue * multipliera17;


                    resultTextView.setTextColor(Color.DKGRAY);
                    resultTextView.setText((String.format("%.2f", resulta9) + " " + "kilogram" + " " + "Is equal to:")
                            + System.getProperty("line.separator") + (String.format("%.2f", resultaa) + " " + "gram.")
                            + System.getProperty("line.separator") + (String.format("%.2f", resulta11) + " " + "pound(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", resulta12) + " " + "ounce(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", resulta13) + " " + "carat(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", resulta14) + " " + "short ton (US).")
                            + System.getProperty("line.separator") + (String.format("%.2f", resulta15) + " " + "long ton (Uk).")
                            + System.getProperty("line.separator") + (String.format("%.2f", resulta16) + " " + "ton(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", resulta17) + " " + "grain(s).")
                            + System.getProperty("line.separator") + "Results to 2dp."
                    );


                }
            }
        });

        //Code for pound(s)s

        lbButton = (Button) findViewById(R.id.lbButtonID);
        lbButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                double multiplierab = 453.59237;//g
                double multipliera17 = 0.45359237;//l
                double multipliera18 = 1;//lb
                double multipliera19 = 16;//oz
                double multipliera20= 2267.96185;//carat(s)
                double multipliera21 = 0.0005;//st
                double multipliera22 = 0.00044642857142857;//lt
                double multipliera23 = 0.00045359237;//t
                double multipliera24 = 7000;//gr


                double result = 0.0;



                if (enterUnit.getText().toString().equals("")) {

                    resultTextView.setText(R.string.error_message);
                    resultTextView.setTextColor(Color.RED);
                } else {
                    double lbValue = Double.parseDouble(enterUnit.getText().toString());
                    double resultab = lbValue * multiplierab;
                    double resulta17 = lbValue * multipliera17;
                    double resulta18 = lbValue * multipliera18;
                    double resulta19 = lbValue * multipliera19;
                    double resulta20 = lbValue * multipliera20;
                    double resulta21 = lbValue * multipliera21;
                    double resulta22 = lbValue * multipliera22;
                    double resulta23 = lbValue * multipliera23;
                    double resulta24 = lbValue * multipliera24;

                    resultTextView.setTextColor(Color.DKGRAY);
                    resultTextView.setText((String.format("%.2f", resulta18) + " " + "pound(s)" + " " + "Is equal to:")
                            + System.getProperty("line.separator") + (String.format("%.2f", resultab) + " " + "gram.")
                            + System.getProperty("line.separator") + (String.format("%.2f", resulta17) + " " + "kilogram(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", resulta19) + " " + "ounce(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", resulta20) + " " + "carat(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", resulta21) + " " + "short ton (US).")
                            + System.getProperty("line.separator") + (String.format("%.2f", resulta22) + " " + "long ton (Uk).")
                            + System.getProperty("line.separator") + (String.format("%.2f", resulta23) + " " + "ton(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", resulta24) + " " + "grain(s).")
                            + System.getProperty("line.separator") + "Results to 2dp."
                    );


                }
            }
        });


        //code for ounce(s)

        ozButton = (Button) findViewById(R.id.ozButtonID);
        ozButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                double multipliera25 = 28.349523125;//g
                double multipliera26 = 0.028349523125;//kg
                double multipliera27 = 0.0625;//lb
                double multipliera28 = 1;//oz
                double multipliera29= 141.747615625;//carat(s)
                double multipliera30 = 0.00003125;//st
                double multipliera31 = 0.000027901785714286;//lt
                double multipliera32 = 0.000028349523125;//t
                double multipliera33 = 437.5;//gr


                double result = 0.0;




                if (enterUnit.getText().toString().equals("")) {

                    resultTextView.setText(R.string.error_message);
                    resultTextView.setTextColor(Color.RED);
                } else {
                    double ozValue = Double.parseDouble(enterUnit.getText().toString());
                    double resulta25 = ozValue * multipliera25;
                    double resulta26 = ozValue * multipliera26;
                    double resulta27 = ozValue * multipliera27;
                    double resulta28 = ozValue * multipliera28;
                    double resulta29 = ozValue * multipliera29;
                    double resulta30 = ozValue * multipliera30;
                    double resulta31 = ozValue * multipliera31;
                    double resulta32 = ozValue * multipliera32;
                    double resulta33 = ozValue * multipliera33;



                    resultTextView.setTextColor(Color.DKGRAY);
                    resultTextView.setText((String.format("%.2f", resulta28) + " " + "ounce(s)" + " " + "Is equal to:")
                            + System.getProperty("line.separator") + (String.format("%.2f", resulta25) + " " + "gram.")
                            + System.getProperty("line.separator") + (String.format("%.2f", resulta26) + " " + "kilogram(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", resulta27) + " " + "pound(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", resulta29) + " " + "carat(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", resulta30) + " " + "short ton (US).")
                            + System.getProperty("line.separator") + (String.format("%.2f", resulta31) + " " + "long ton (Uk).")
                            + System.getProperty("line.separator") + (String.format("%.2f", resulta32) + " " + "ton(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", resulta33) + " " + "grain(s).")
                            + System.getProperty("line.separator") + "Results to 2dp."
                    );



                }
            }
        });

        //code for carat(s)

        caratButton = (Button) findViewById(R.id.caratButtonID);
        caratButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                double multipliera34 = 0.2;//g
                double multipliera35 = 0.0002;//kg
                double multipliera36 = 0.00044092452436976;//lb
                double multipliera37 = 0.0070547923899161;//oz
                double multipliera38 = 1;//carat(s)
                double multipliera39 = 0.00000022046226218488;//st
                double multipliera40 = 0.00000019684130552221;//lt
                double multipliera41 = 0.0000002;//t
                double multipliera42 = 3.0864716705883;//gr


                double result = 0.0;


                if (enterUnit.getText().toString().equals("")) {

                    resultTextView.setText(R.string.error_message);
                    resultTextView.setTextColor(Color.RED);
                } else {
                    double caratValue = Double.parseDouble(enterUnit.getText().toString());

                    double resulta34 = caratValue * multipliera34;
                    double resulta35= caratValue * multipliera35;
                    double resulta36 = caratValue * multipliera36;
                    double resulta37= caratValue * multipliera37;
                    double resulta38 = caratValue * multipliera38;
                    double resulta39 = caratValue * multipliera39;
                    double resulta40 = caratValue * multipliera40;
                    double resulta41 = caratValue * multipliera41;
                    double resulta42 =caratValue * multipliera42;

                    resultTextView.setTextColor(Color.DKGRAY);
                    resultTextView.setText((String.format("%.2f", resulta38) + " " + "carat(s)" + " " + "Is equal to:")
                            + System.getProperty("line.separator") + (String.format("%.2f", resulta34) + " " + "gram.")
                            + System.getProperty("line.separator") + (String.format("%.2f", resulta35) + " " + "kilogram(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", resulta36) + " " + "pound(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", resulta37) + " " + "ounce(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", resulta39) + " " + "short ton (US).")
                            + System.getProperty("line.separator") + (String.format("%.2f", resulta40) + " " + "long ton (Uk).")
                            + System.getProperty("line.separator") + (String.format("%.2f", resulta41) + " " + "ton(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", resulta42) + " " + "grain(s).")
                            + System.getProperty("line.separator") + "Results to 2dp."
                    );


                }
            }
        });


        //code for Short ton (US)

        stButton = (Button) findViewById(R.id.stButtonID);
        stButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

// conversion logic: 1

                double multipliera43 = 907184.74;//g
                double multipliera44 = 907.18474;//kg
                double multipliera45 = 2000;//lb
                double multipliera46= 32000;//oz
                double multipliera47 = 4535923.7;//carat(s)
                double multipliera48 = 1;//st
                double multipliera49 = 0.89285714285714;//lt
                double multipliera50 = 0.90718474;//t
                double multipliera51 = 14000000;//gr


                double result = 0.0;




                if (enterUnit.getText().toString().equals("")) {

                    resultTextView.setText(R.string.error_message);
                    resultTextView.setTextColor(Color.RED);
                } else {
                    double stValue = Double.parseDouble(enterUnit.getText().toString());
                    double resulta43 = stValue * multipliera43;
                    double resulta44 = stValue * multipliera44;
                    double resulta45 = stValue * multipliera45;
                    double resulta46 = stValue * multipliera46;
                    double resulta47 = stValue * multipliera47;
                    double resulta48 = stValue * multipliera48;
                    double resulta49= stValue * multipliera49;
                    double resulta50 = stValue * multipliera50;
                    double resulta51 =stValue * multipliera51;


                    resultTextView.setTextColor(Color.DKGRAY);
                    resultTextView.setText((String.format("%.2f", resulta48) + " " + "short ton (US)" + " " + "Is equal to:")
                            + System.getProperty("line.separator") + (String.format("%.2f", resulta43) + " " + "gram.")
                            + System.getProperty("line.separator") + (String.format("%.2f", resulta44) + " " + "kilogram(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", resulta45) + " " + "pound(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", resulta46) + " " + "ounce(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", resulta47) + " " + "carat(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", resulta49) + " " + "long ton (Uk).")
                            + System.getProperty("line.separator") + (String.format("%.2f", resulta50) + " " + "ton(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", resulta51) + " " + "grain(s).")
                            + System.getProperty("line.separator") + "Results to 2dp."
                    );


                }
            }
        });

        //Code for Long ton (UK)

        ltButton = (Button) findViewById(R.id.ltButtonID);
        ltButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                double multipliera52 = 1016046.9088;//g
                double multipliera53 = 1016.0469088;//kg
                double multipliera54= 2240;//lb
                double multipliera55 = 35840;//oz
                double multipliera56= 5080234.544;//carat(s)
                double multipliera57 = 1.12;//st
                double multipliera58 = 1;//lt
                double multipliera59 = 1.0160469088;//t
                double multipliera60= 15680000;//gr


                double result = 0.0;




                if (enterUnit.getText().toString().equals("")) {

                    resultTextView.setText(R.string.error_message);
                    resultTextView.setTextColor(Color.RED);
                } else {
                    double ltValue = Double.parseDouble(enterUnit.getText().toString());
                    double resulta52 = ltValue * multipliera52;
                    double resulta53 = ltValue * multipliera53;
                    double resulta54 = ltValue * multipliera54;
                    double resulta55 = ltValue * multipliera55;
                    double resulta56 = ltValue * multipliera56;
                    double resulta57 = ltValue * multipliera57;
                    double resulta58 = ltValue * multipliera58;
                    double resulta59 = ltValue * multipliera59;
                    double resulta60 = ltValue * multipliera60;

                    resultTextView.setTextColor(Color.DKGRAY);
                    resultTextView.setText((String.format("%.2f", resulta58) + " " + "long ton (Uk)" + " " + "Is equal to:")
                            + System.getProperty("line.separator") + (String.format("%.2f", resulta52) + " " + "gram.")
                            + System.getProperty("line.separator") + (String.format("%.2f", resulta53) + " " + "kilogram(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", resulta54) + " " + "pound(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", resulta55) + " " + "ounce(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", resulta56) + " " + "carat(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", resulta57) + " " + "short ton (US).")
                            + System.getProperty("line.separator") + (String.format("%.2f", resulta59) + " " + "ton(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", resulta60) + " " + "grain(s).")
                            + System.getProperty("line.separator") + "Results to 2dp."
                    );


                }
            }
        });


        //code for Ton

        tButton = (Button) findViewById(R.id.tButtonID);
        tButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                double multipliera70 = 1000000;//g
                double multipliera71 = 1000;//kg
                double multipliera72 = 2204.6226218488;//lb
                double multipliera73 = 35273.96194958;//oz
                double multipliera74= 5000000;//carat(s)
                double multipliera75 = 1.1023113109244;//st
                double multipliera76 = 0.984206527611061106;//lt
                double multipliera77 = 1;//t
                double multipliera78= 15432358.352941;//gr


                double result = 0.0;



                if (enterUnit.getText().toString().equals("")) {

                    resultTextView.setText(R.string.error_message);
                    resultTextView.setTextColor(Color.RED);
                } else {
                    double tValue = Double.parseDouble(enterUnit.getText().toString());
                    double resulta70 = tValue * multipliera70;
                    double resulta71 = tValue * multipliera71;
                    double resulta72 = tValue * multipliera72;
                    double resulta73 = tValue * multipliera73;
                    double resulta74 = tValue * multipliera74;
                    double resulta75 = tValue * multipliera75;
                    double resulta76 = tValue * multipliera76;
                    double resulta77 = tValue * multipliera77;
                    double resulta78 = tValue * multipliera78;



                    resultTextView.setTextColor(Color.DKGRAY);
                    resultTextView.setText((String.format("%.2f", resulta77) + " " + "ton(s)" + " " + "Is equal to:")
                            + System.getProperty("line.separator") + (String.format("%.2f", resulta70) + " " + "gram.")
                            + System.getProperty("line.separator") + (String.format("%.2f", resulta71) + " " + "kilogram(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", resulta72) + " " + "pound(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", resulta73) + " " + "ounce(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", resulta74) + " " + "carat(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", resulta75) + " " + "short ton (US).")
                            + System.getProperty("line.separator") + (String.format("%.2f", resulta76) + " " + "long ton (Uk).")
                            + System.getProperty("line.separator") + (String.format("%.2f", resulta78) + " " + "grain(s).")
                            + System.getProperty("line.separator") + "Results to 2dp."
                    );



                }
            }
        });
        //code for grain(s)

        grButton = (Button) findViewById(R.id.grButtonID);
        grButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                double multipliera61 = 0.06479891;//g
                double multipliera62= 0.00006479891;//l
                double multipliera63 = 0.00014285714285714;//lb
                double multipliera64 = 0.0022857142857143;//oz
                double multipliera65= 0.13368055555556;//carat(s)
                double multipliera66 = 0.32399455;//st
                double multipliera67 = 0.000000063775510204082;//lt
                double multipliera68 = 0.00000006479891;//t
                double multipliera69 = 1;//gr


                double result = 0.0;




                if (enterUnit.getText().toString().equals("")) {

                    resultTextView.setText(R.string.error_message);
                    resultTextView.setTextColor(Color.RED);
                } else {
                    double grValue = Double.parseDouble(enterUnit.getText().toString());
                    double resulta61 = grValue * multipliera61;
                    double resulta62 = grValue * multipliera62;
                    double resulta63 = grValue * multipliera63;
                    double resulta64 = grValue * multipliera64;
                    double resulta65 = grValue * multipliera65;
                    double resulta66 = grValue * multipliera66;
                    double resulta67 = grValue * multipliera67;
                    double resulta68 = grValue * multipliera68;
                    double resulta69 = grValue * multipliera69;



                    resultTextView.setTextColor(Color.DKGRAY);
                    resultTextView.setText((String.format("%.2f", resulta69) + " " + "grain(s)" + " " + "Is equal to:")
                            + System.getProperty("line.separator") + (String.format("%.2f", resulta61) + " " + "gram.")
                            + System.getProperty("line.separator") + (String.format("%.2f", resulta62) + " " + "kilogram(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", resulta63) + " " + "pound(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", resulta64) + " " + "ounce(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", resulta65) + " " + "carat(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", resulta66) + " " + "short ton (US).")
                            + System.getProperty("line.separator") + (String.format("%.2f", resulta67) + " " + "long ton (Uk).")
                            + System.getProperty("line.separator") + (String.format("%.2f", resulta68) + " " + "ton(s).")
                            + System.getProperty("line.separator") + "Results to 2dp."
                    );



                }
            }
        });


    }
}
