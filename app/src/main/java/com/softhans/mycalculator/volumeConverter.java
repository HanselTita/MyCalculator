package com.softhans.mycalculator;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class volumeConverter extends AppCompatActivity {

    private EditText enterUnit;

    private Button mlButton;
    private Button lButton;
    private Button m3Button;
    private Button in3Button;
    private Button ft3Button;
    private Button ptButton;
    private Button qtButton;
    private Button galButton;
    private Button bblButton;

    private TextView resultTextView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volume_converter);

        enterUnit = (EditText) findViewById(R.id.unitEditText);
        resultTextView = (TextView) findViewById(R.id.resultId);




        //code for milliliter(s)

        mlButton = (Button) findViewById(R.id.mlButtonID);
        mlButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                double multiplier1 = 1;//ml
                double multiplier2 = 0.001;//l
                double multiplier3 = 0.000001;//m3
                double multiplier4 = 0.061023744094732;//in3
                double multiplier5 = 0.000035314666721489;//ft3
                double multiplier6 = 0.0021133764188652;//pt
                double multiplier7 = 0.0010566882094326;//qt
                double multiplier8 = 0.00026417205235815;//gal
                double multiplier9 = 0.0000083864143605761;//bbl




                double result = 0.0;


                if (enterUnit.getText().toString().equals("")) {

                    resultTextView.setText(R.string.error_message);
                    resultTextView.setTextColor(Color.RED);
                } else {
                    double mlValue = Double.parseDouble(enterUnit.getText().toString());

                    double result1 = mlValue * multiplier1;
                    double result2 = mlValue * multiplier2;
                    double result3 = mlValue * multiplier3;
                    double result4 = mlValue * multiplier4;
                    double result5 = mlValue * multiplier5;
                    double result6 = mlValue * multiplier6;
                    double result7 = mlValue * multiplier7;
                    double result8 = mlValue * multiplier8;
                    double result9 =mlValue * multiplier9;

                    resultTextView.setTextColor(Color.DKGRAY);
                    resultTextView.setText((String.format("%.2f", result1) + " " + "milliliter(s)" + " " + "Is equal to:")
                            + System.getProperty("line.separator") + (String.format("%.2f", result2) + " " + "liter(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", result3) + " " + "cubic meter(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", result4) + " " + "cubic inch(es).")
                            + System.getProperty("line.separator") + (String.format("%.2f", result5) + " " + "cubic foot/feet.")
                            + System.getProperty("line.separator") + (String.format("%.2f", result6) + " " + "pint(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", result7) + " " + "quart(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", result8) + " " + "gallon(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", result9) + " " + "barrel(s).")
                            + System.getProperty("line.separator") + "Results to 2dp."
                    );


                }
            }
        });


        //code for liter(s)

        lButton = (Button) findViewById(R.id.lButtonID);
        lButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

// conversion logic: 1

                double multipliera = 1000;//ml
                double multiplier9 = 1;//l
                double multiplier11 = 0.001;//m3
                double multiplier12= 61.023744094732;//in3
                double multiplier13 = 0.035314666721489;//ft3
                double multiplier14 = 2.1133764188652;//pt
                double multiplier15 = 1.0566882094326;//qt
                double multiplier16 = 0.26417205235815;//gal
                double multiplier17 = 0.0083864143605761;//bbl

                double result = 0.0;



                if (enterUnit.getText().toString().equals("")) {

                    resultTextView.setText(R.string.error_message);
                    resultTextView.setTextColor(Color.RED);
                } else {
                    double lValue = Double.parseDouble(enterUnit.getText().toString());
                    double resulta = lValue * multipliera;
                    double result9 = lValue * multiplier9;
                    double result11 = lValue * multiplier11;
                    double result12 = lValue * multiplier12;
                    double result13 = lValue * multiplier13;
                    double result14 = lValue * multiplier14;
                    double result15= lValue * multiplier15;
                    double result16 = lValue * multiplier16;
                    double result17 =lValue * multiplier17;


                    resultTextView.setTextColor(Color.DKGRAY);
                    resultTextView.setText((String.format("%.2f", result9) + " " + "liter(s)" + " " + "Is equal to:")
                            + System.getProperty("line.separator") + (String.format("%.2f", resulta) + " " + "milliliter(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", result11) + " " + "cubic meter(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", result12) + " " + "cubic inch(es).")
                            + System.getProperty("line.separator") + (String.format("%.2f", result13) + " " + "cubic foot/feet.")
                            + System.getProperty("line.separator") + (String.format("%.2f", result14) + " " + "pint(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", result15) + " " + "quart(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", result16) + " " + "gallon(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", result17) + " " + "barrel(s).")
                            + System.getProperty("line.separator") + "Results to 2dp."
                    );


                }
            }
        });

        //Code for cubic meter(s)s

        m3Button = (Button) findViewById(R.id.m3ButtonID);
        m3Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                double multiplierb = 1000000;//ml
                double multiplier17 = 1000;//l
                double multiplier18 = 1;//m3
                double multiplier19 = 61023.744094732;//in3
                double multiplier20= 35.314666721489;//ft3
                double multiplier21 = 2113.3764188652;//pt
                double multiplier22 = 1056.6882094326;//qt
                double multiplier23= 264.17205235815;//gal
                double multiplier24 = 8.3864143605761;//bbl

                double result = 0.0;



                if (enterUnit.getText().toString().equals("")) {

                    resultTextView.setText(R.string.error_message);
                    resultTextView.setTextColor(Color.RED);
                } else {
                    double m3Value = Double.parseDouble(enterUnit.getText().toString());
                    double resultb = m3Value * multiplierb;
                    double result17 = m3Value * multiplier17;
                    double result18 = m3Value * multiplier18;
                    double result19 = m3Value * multiplier19;
                    double result20 = m3Value * multiplier20;
                    double result21 = m3Value * multiplier21;
                    double result22 = m3Value * multiplier22;
                    double result23 = m3Value * multiplier23;
                    double result24 = m3Value * multiplier24;

                    resultTextView.setTextColor(Color.DKGRAY);
                    resultTextView.setText((String.format("%.2f", result18) + " " + "cubic meter(s)" + " " + "Is equal to:")
                            + System.getProperty("line.separator") + (String.format("%.2f", resultb) + " " + "milliliter(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", result17) + " " + "liter(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", result19) + " " + "cubic inch(es).")
                            + System.getProperty("line.separator") + (String.format("%.2f", result20) + " " + "cubic foot/feet.")
                            + System.getProperty("line.separator") + (String.format("%.2f", result21) + " " + "pint(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", result22) + " " + "quart(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", result23) + " " + "gallon(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", result24) + " " + "barrel(s).")
                            + System.getProperty("line.separator") + "Results to 2dp."
                    );


                }
            }
        });


        //code for cubic inch(es)es

        in3Button = (Button) findViewById(R.id.in3ButtonID);
        in3Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                double multiplier25 = 16.387064;//ml
                double multiplier26 = 0.016387064;//l
                double multiplier27 = 0.000016387064;//m3
                double multiplier28 = 1;//in3
                double multiplier29= 0.0005787037037037;//ft3
                double multiplier30 = 0.034632034632035;//pt
                double multiplier31 = 0.017316017316017;//qt
                double multiplier32= 0.0043290043290043;//gal
                double multiplier33 = 0.00013742870885728;//bbl

                double result = 0.0;




                if (enterUnit.getText().toString().equals("")) {

                    resultTextView.setText(R.string.error_message);
                    resultTextView.setTextColor(Color.RED);
                } else {
                    double in3Value = Double.parseDouble(enterUnit.getText().toString());
                    double result25 = in3Value * multiplier25;
                    double result26 = in3Value * multiplier26;
                    double result27 = in3Value * multiplier27;
                    double result28 = in3Value * multiplier28;
                    double result29 = in3Value * multiplier29;
                    double result30 = in3Value * multiplier30;
                    double result31 = in3Value * multiplier31;
                    double result32 = in3Value * multiplier32;
                    double result33 = in3Value * multiplier33;



                    resultTextView.setTextColor(Color.DKGRAY);
                    resultTextView.setText((String.format("%.2f", result28) + " " + "cubic inch(es)" + " " + "Is equal to:")
                            + System.getProperty("line.separator") + (String.format("%.2f", result25) + " " + "milliliter(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", result26) + " " + "liter(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", result27) + " " + "cubic meter(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", result29) + " " + "cubic foot/feet.")
                            + System.getProperty("line.separator") + (String.format("%.2f", result30) + " " + "pint(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", result31) + " " + "quart(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", result32) + " " + "gallon(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", result33) + " " + "barrel(s).")
                            + System.getProperty("line.separator") + "Results to 2dp."
                    );



                }
            }
        });

        //code for Cubic Foot/feet

        ft3Button = (Button) findViewById(R.id.ft3ButtonID);
        ft3Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                double multiplier34 = 28316.846592;//ml
                double multiplier35 = 28.316846592;//l
                double multiplier36 = 0.028316846592;//m3
                double multiplier37 = 1728;//in3
                double multiplier38 = 1;//ft3
                double multiplier39 = 59.844155844156;//pt
                double multiplier40 = 29.922077922078;//qt
                double multiplier41 = 7.4805194805195;//gal
                double multiplier42 = 0.23747680890538;//bbl

                double result = 0.0;


                if (enterUnit.getText().toString().equals("")) {

                    resultTextView.setText(R.string.error_message);
                    resultTextView.setTextColor(Color.RED);
                } else {
                    double ft3Value = Double.parseDouble(enterUnit.getText().toString());

                    double result34 = ft3Value * multiplier34;
                    double result35= ft3Value * multiplier35;
                    double result36 = ft3Value * multiplier36;
                    double result37= ft3Value * multiplier37;
                    double result38 = ft3Value * multiplier38;
                    double result39 = ft3Value * multiplier39;
                    double result40 = ft3Value * multiplier40;
                    double result41 = ft3Value * multiplier41;
                    double result42 =ft3Value * multiplier42;

                    resultTextView.setTextColor(Color.DKGRAY);
                    resultTextView.setText((String.format("%.2f", result38) + " " + "cubic foot/feet" + " " + "Is equal to:")
                            + System.getProperty("line.separator") + (String.format("%.2f", result34) + " " + "milliliter(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", result35) + " " + "liter(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", result36) + " " + "cubic meter(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", result37) + " " + "cubic inch(es).")
                            + System.getProperty("line.separator") + (String.format("%.2f", result39) + " " + "pint(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", result40) + " " + "quart(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", result41) + " " + "gallon(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", result42) + " " + "barrel(s).")
                            + System.getProperty("line.separator") + "Results to 2dp."
                    );


                }
            }
        });


        //code for pint(s)

        ptButton = (Button) findViewById(R.id.ptButtonID);
        ptButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

// conversion logic: 1

                double multiplier43 = 473.176473;//ml
                double multiplier44 = 0.473176473;//l
                double multiplier45 = 0.000473176473;//m3
                double multiplier46= 28.875;//in3
                double multiplier47 = 0.016710069444444;//ft3
                double multiplier48 = 1;//pt
                double multiplier49 = 0.5;//qt
                double multiplier50 = 0.125;//gal
                double multiplier51 = 0.003968253968254;//bbl

                double result = 0.0;




                if (enterUnit.getText().toString().equals("")) {

                    resultTextView.setText(R.string.error_message);
                    resultTextView.setTextColor(Color.RED);
                } else {
                    double ptValue = Double.parseDouble(enterUnit.getText().toString());
                    double result43 = ptValue * multiplier43;
                    double result44 = ptValue * multiplier44;
                    double result45 = ptValue * multiplier45;
                    double result46 = ptValue * multiplier46;
                    double result47 = ptValue * multiplier47;
                    double result48 = ptValue * multiplier48;
                    double result49= ptValue * multiplier49;
                    double result50 = ptValue * multiplier50;
                    double result51 =ptValue * multiplier51;


                    resultTextView.setTextColor(Color.DKGRAY);
                    resultTextView.setText((String.format("%.2f", result48) + " " + "pint(s)" + " " + "Is equal to:")
                            + System.getProperty("line.separator") + (String.format("%.2f", result43) + " " + "milliliter(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", result44) + " " + "liter(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", result45) + " " + "cubic meter(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", result46) + " " + "cubic inch(es).")
                            + System.getProperty("line.separator") + (String.format("%.2f", result47) + " " + "cubic foot/feet.")
                            + System.getProperty("line.separator") + (String.format("%.2f", result49) + " " + "quart(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", result50) + " " + "gallon(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", result51) + " " + "barrel(s).")
                            + System.getProperty("line.separator") + "Results to 2dp."
                    );


                }
            }
        });

        //Code for quart(s)

        qtButton = (Button) findViewById(R.id.qtButtonID);
        qtButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                double multiplier52 = 946.352946;//ml
                double multiplier53 = 0.946352946;//l
                double multiplier54= 0.000946352946;//m3
                double multiplier55 = 57.75;//in3
                double multiplier56= 0.033420138888889;//ft3
                double multiplier57 = 2;//pt
                double multiplier58 = 1;//qt
                double multiplier59= 0.25;//gal
                double multiplier60 = 0.0079365079365079;//bbl

                double result = 0.0;




                if (enterUnit.getText().toString().equals("")) {

                    resultTextView.setText(R.string.error_message);
                    resultTextView.setTextColor(Color.RED);
                } else {
                    double qtValue = Double.parseDouble(enterUnit.getText().toString());
                    double result52 = qtValue * multiplier52;
                    double result53 = qtValue * multiplier53;
                    double result54 = qtValue * multiplier54;
                    double result55 = qtValue * multiplier55;
                    double result56 = qtValue * multiplier56;
                    double result57 = qtValue * multiplier57;
                    double result58 = qtValue * multiplier58;
                    double result59 = qtValue * multiplier59;
                    double result60 = qtValue * multiplier60;

                    resultTextView.setTextColor(Color.DKGRAY);
                    resultTextView.setText((String.format("%.2f", result58) + " " + "quart(s)" + " " + "Is equal to:")
                            + System.getProperty("line.separator") + (String.format("%.2f", result52) + " " + "milliliter(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", result53) + " " + "liter(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", result54) + " " + "cubic meter(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", result55) + " " + "cubic inch(es).")
                            + System.getProperty("line.separator") + (String.format("%.2f", result56) + " " + "cubic foot/feet.")
                            + System.getProperty("line.separator") + (String.format("%.2f", result57) + " " + "pint(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", result59) + " " + "gallon(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", result60) + " " + "barrel(s).")
                            + System.getProperty("line.separator") + "Results to 2dp."
                    );


                }
            }
        });


        //code for gallon(s)

        galButton = (Button) findViewById(R.id.galButtonID);
        galButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                double multiplier61 = 3785.411784;//ml
                double multiplier62= 3.785411784;//l
                double multiplier63 = 0.003785411784;//m3
                double multiplier64 = 231;//in3
                double multiplier65= 0.13368055555556;//ft3
                double multiplier66 = 8;//pt
                double multiplier67 = 4;//qt
                double multiplier68= 1;//gal
                double multiplier69 = 0.031746031746032;//bbl

                double result = 0.0;




                if (enterUnit.getText().toString().equals("")) {

                    resultTextView.setText(R.string.error_message);
                    resultTextView.setTextColor(Color.RED);
                } else {
                    double galValue = Double.parseDouble(enterUnit.getText().toString());
                    double result61 = galValue * multiplier61;
                    double result62 = galValue * multiplier62;
                    double result63 = galValue * multiplier63;
                    double result64 = galValue * multiplier64;
                    double result65 = galValue * multiplier65;
                    double result66 = galValue * multiplier66;
                    double result67 = galValue * multiplier67;
                    double result68 = galValue * multiplier68;
                    double result69 = galValue * multiplier69;



                    resultTextView.setTextColor(Color.DKGRAY);
                    resultTextView.setText((String.format("%.2f", result68) + " " + "gallon(s)" + " " + "Is equal to:")
                            + System.getProperty("line.separator") + (String.format("%.2f", result61) + " " + "milliliter(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", result62) + " " + "liter(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", result63) + " " + "cubic meter(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", result64) + " " + "cubic inch(es).")
                            + System.getProperty("line.separator") + (String.format("%.2f", result65) + " " + "cubic foot/feet.")
                            + System.getProperty("line.separator") + (String.format("%.2f", result66) + " " + "pint(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", result67) + " " + "quart(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", result69) + " " + "barrel(s).")
                            + System.getProperty("line.separator") + "Results to 2dp."
                    );



                }
            }
        });

        //code for barrel(s)

        bblButton = (Button) findViewById(R.id.bblButtonID);
        bblButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                double multiplier70 = 119240.471196;//ml
                double multiplier71 = 119.240471196;//l
                double multiplier72 = 0.119240471196;//m3
                double multiplier73 = 7276.5;//in3
                double multiplier74= 4.2109375;//ft3
                double multiplier75 = 252;//pt
                double multiplier76 = 126;//qt
                double multiplier77= 31.5;//gal
                double multiplier78 = 1;//bbl

                double result = 0.0;



                if (enterUnit.getText().toString().equals("")) {

                    resultTextView.setText(R.string.error_message);
                    resultTextView.setTextColor(Color.RED);
                } else {
                    double in3Value = Double.parseDouble(enterUnit.getText().toString());
                    double result70 = in3Value * multiplier70;
                    double result71 = in3Value * multiplier71;
                    double result72 = in3Value * multiplier72;
                    double result73 = in3Value * multiplier73;
                    double result74 = in3Value * multiplier74;
                    double result75 = in3Value * multiplier75;
                    double result76 = in3Value * multiplier76;
                    double result77 = in3Value * multiplier77;
                    double result78 = in3Value * multiplier78;



                    resultTextView.setTextColor(Color.DKGRAY);
                    resultTextView.setText((String.format("%.2f", result78) + " " + "barrel(s)" + " " + "Is equal to:")
                            + System.getProperty("line.separator") + (String.format("%.2f", result70) + " " + "milliliter(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", result71) + " " + "liter(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", result72) + " " + "cubic meter(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", result73) + " " + "cubic inch(es).")
                            + System.getProperty("line.separator") + (String.format("%.2f", result74) + " " + "cubic foot/feet.")
                            + System.getProperty("line.separator") + (String.format("%.2f", result75) + " " + "pint(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", result76) + " " + "quart(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", result77) + " " + "gallon(s).")
                            + System.getProperty("line.separator") + "Results to 2dp."
                    );



                }
            }
        });
    }
}
