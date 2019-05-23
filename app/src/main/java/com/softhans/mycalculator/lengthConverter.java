package com.softhans.mycalculator;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class lengthConverter extends AppCompatActivity {


    private EditText enterUnit;

    private Button mmButton;
    private Button cmButton;
    private Button kmButton;
    private Button inButton;
    private Button ftButton;
    private Button ydButton;
    private Button miButton;
    private Button mButton;

    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length_converter);



        enterUnit = (EditText) findViewById(R.id.unitEditText);
        resultTextView = (TextView) findViewById(R.id.resultId);




        //code for millimeter

        mmButton = (Button) findViewById(R.id.mmButtonID);
        mmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

/*conversion logic:
1 Millimeter
0.1 Centimeter
0.001 Meter
0.000001 Kilometer
0.03937007874015748 Inch
0.0032808398950131233 Feet
0.0010936132983377078 Yard
6.21371192237334e-7 mile(s)

 */
                double multiplier1 = 1;//mm
                double multiplier2 = 0.1;//cm
                double multiplier3 = 0.001;//m
                double multiplier4 = 0.000001;//km
                double multiplier5 = 0.03937007874015748;//in
                double multiplier6 = 0.0032808398950131233;//ft
                double multiplier7 = 0.0010936132983377078;//yd
                double multiplier8 = 6.21371192237334e-7;//mi


                double result = 0.0;


                if (enterUnit.getText().toString().equals("")) {

                    resultTextView.setText(R.string.error_message);
                    resultTextView.setTextColor(Color.RED);
                } else {
                    double mmValue = Double.parseDouble(enterUnit.getText().toString());

                    double result1 = mmValue * multiplier1;
                    double result2 = mmValue * multiplier2;
                    double result3 = mmValue * multiplier3;
                    double result4 = mmValue * multiplier4;
                    double result5 = mmValue * multiplier5;
                    double result6 = mmValue * multiplier6;
                    double result7 = mmValue * multiplier7;
                    double result8 = mmValue * multiplier8;

                    resultTextView.setTextColor(Color.DKGRAY);
                    resultTextView.setText((String.format("%.2f", result1) + " " + "millimeter(s)" + " " + "Is equal to:")
                            + System.getProperty("line.separator") + (String.format("%.2f", result2) + " " + "centimeter(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", result3) + " " + "meter(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", result4) + " " + "kilometer(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", result5) + " " + "inch(es).")
                            + System.getProperty("line.separator") + (String.format("%.2f", result6) + " " + "foot/feet.")
                            + System.getProperty("line.separator") + (String.format("%.2f", result7) + " " + "yard(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", result8) + " " + "mile(s).")
                            + System.getProperty("line.separator") + "Results to 2dp."
                    );




                }
            }
        });


        //code for Centimeter

        cmButton = (Button) findViewById(R.id.cmButtonID);
        cmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

/*conversion logic: 1 Centimeter

10 Millimeter
1 Centimeter
0.01 Meter
0.00001 Kilometer
0.3937007874015748 Inch
0.03280839895013123 Feet
0.010936132983377079 Yard
0.00000621371192237334 mile(s)


 */
                double multipliera = 1;//cm
                double multiplier9 = 10;//mm
                double multiplier11 = 0.01;//m
                double multiplier12 = 0.00001;//km
                double multiplier13 = 0.3937007874015748;//in
                double multiplier14 = 0.032808398950131233;//ft
                double multiplier15 = 0.010936132983377078;//yd
                double multiplier16 = 0.00000621371192237334;//mi


                double result = 0.0;


                if (enterUnit.getText().toString().equals("")) {

                    resultTextView.setText(R.string.error_message);
                    resultTextView.setTextColor(Color.RED);
                } else {
                    double mmValue = Double.parseDouble(enterUnit.getText().toString());
                    double resulta = mmValue * multipliera;
                    double result9 = mmValue * multiplier9;
                    double result11 = mmValue * multiplier11;
                    double result12 = mmValue * multiplier12;
                    double result13 = mmValue * multiplier13;
                    double result14 = mmValue * multiplier14;
                    double result15 = mmValue * multiplier15;
                    double result16 = mmValue * multiplier16;


                    resultTextView.setTextColor(Color.DKGRAY);
                    resultTextView.setText((String.format("%.2f", resulta) + " " + "centimeter(s)" + " " + "Is equal to:")
                            + System.getProperty("line.separator") + (String.format("%.2f", result9) + " " + "millimeter(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", result11) + " " + "meter(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", result12) + " " + "kilometer(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", result13) + " " + "inch(es).")
                            + System.getProperty("line.separator") + (String.format("%.2f", result14) + " " + "foot/feet.")
                            + System.getProperty("line.separator") + (String.format("%.2f", result15) + " " + "yard(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", result16) + " " + "mile(s).")
                            + System.getProperty("line.separator") + "Results to 2dp."
                    );


                }
            }
        });

        //Code for meters

        mButton = (Button) findViewById(R.id.mButtonID);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

/*conversion logic: 1 meter

1000 Millimeter
100 Centimeter
1 Meter
0.001 Kilometer
39.37007874015748 Inch
3.2808398950131235 Feet
1.0936132983377078 Yard
0.0006213711922373339 mile(s)



 */
                double multiplierb = 1;//m
                double multiplier17 = 1000;//mm
                double multiplier18 = 100;//cm
                double multiplier19 = 0.001;//km
                double multiplier20 = 39.37007874015748;//in
                double multiplier21 = 32.808398950131233;//ft
                double multiplier22 = 1.0936132983377078;//yd
                double multiplier23 = 0.000621371192237334;//mi

                double result = 0.0;


                if (enterUnit.getText().toString().equals("")) {

                    resultTextView.setText(R.string.error_message);
                    resultTextView.setTextColor(Color.RED);
                } else {
                    double mmValue = Double.parseDouble(enterUnit.getText().toString());
                    double resultb = mmValue * multiplierb;
                    double result17 = mmValue * multiplier17;
                    double result18 = mmValue * multiplier18;
                    double result19 = mmValue * multiplier19;
                    double result20 = mmValue * multiplier20;
                    double result21 = mmValue * multiplier21;
                    double result22 = mmValue * multiplier22;
                    double result23 = mmValue * multiplier23;


                    resultTextView.setTextColor(Color.DKGRAY);
                    resultTextView.setText((String.format("%.2f", resultb) + " " + "meter(s)" + " " + "Is equal to:")
                            + System.getProperty("line.separator") + (String.format("%.2f", result17) + " " + "millimeter(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", result18) + " " + "centimeter(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", result19) + " " + "kilometer(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", result20) + " " + "inch(es).")
                            + System.getProperty("line.separator") + (String.format("%.2f", result21) + " " + "foot/feet.")
                            + System.getProperty("line.separator") + (String.format("%.2f", result22) + " " + "yard(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", result23) + " " + "mile(s).")
                            + System.getProperty("line.separator") + "Results to 2dp."
                    );


                }
            }
        });


        //code for kilometer

        kmButton = (Button) findViewById(R.id.kmButtonID);
        kmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

/*conversion logic: 1 kilometer

1000000 Millimeter
100000 Centimeter
1000 Meter
39370.078740157485 Inch
3280.839895013123 Feet
1093.6132983377079 Yard
0.621371192237334 mile(s)

 */
                double multiplier24 = 1000000;//mm
                double multiplier25 = 100000;//cm
                double multiplier26 = 1000;//m
                double multiplier27 = 39370.078740157485;//in
                double multiplier28 = 3280.839895013123;//ft
                double multiplier29 = 1093.6132983377079;//yd
                double multiplier30 = 0.621371192237334;//mi
                double multiplier31 = 1;//km

                double result = 0.0;


                if (enterUnit.getText().toString().equals("")) {

                    resultTextView.setText(R.string.error_message);
                    resultTextView.setTextColor(Color.RED);
                } else {
                    double mmValue = Double.parseDouble(enterUnit.getText().toString());
                    double result24 = mmValue * multiplier24;
                    double result25 = mmValue * multiplier25;
                    double result26 = mmValue * multiplier26;
                    double result27 = mmValue * multiplier27;
                    double result28 = mmValue * multiplier28;
                    double result29 = mmValue * multiplier29;
                    double result30 = mmValue * multiplier30;
                    double result31 = mmValue * multiplier31;



                    resultTextView.setTextColor(Color.DKGRAY);
                    resultTextView.setText((String.format("%.2f", result31) + " " + "kilometer(s)" + " " + "Is equal to:")
                            + System.getProperty("line.separator") + (String.format("%.2f", result24) + " " + "millimeter(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", result26) + " " + "meter(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", result27) + " " + "inch(es).")
                            + System.getProperty("line.separator") + (String.format("%.2f", result28) + " " + "foot/feet.")
                            + System.getProperty("line.separator") + (String.format("%.2f", result29) + " " + "yard(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", result30) + " " + "mile(s).")
                            + System.getProperty("line.separator") + "Results to 2dp."
                    );


                }
            }
        });

        // code for inch(es)

        inButton = (Button) findViewById(R.id.inButtonID);
        inButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

/*conversion logic: 1 inch
25.4 Millimeter
2.54 Centimeter
0.0254 Meter
0.000025399999999999997 Kilometer
1 Inch
0.08333333333333333 Feet
0.027777777777777776 Yard
0.000015782828282828283 mile(s)


 */
                double multiplier01 = 1;//in
                double multiplier02 = 25.4;//mm
                double multiplier03 = 2.54;//cm
                double multiplier04 = 0.0254;//m
                double multiplier05 = 0.000025399999999999997;//km
                double multiplier06 = 0.08333333333333333;//ft
                double multiplier07 = 0.027777777777777776;//yd
                double multiplier08 = 0.000015782828282828283;//mi


                double result = 0.0;


                if (enterUnit.getText().toString().equals("")) {

                    resultTextView.setText(R.string.error_message);
                    resultTextView.setTextColor(Color.RED);
                } else {
                    double mmValue = Double.parseDouble(enterUnit.getText().toString());

                    double result01 = mmValue * multiplier01;
                    double result02 = mmValue * multiplier02;
                    double result03 = mmValue * multiplier03;
                    double result04 = mmValue * multiplier04;
                    double result05 = mmValue * multiplier05;
                    double result06 = mmValue * multiplier06;
                    double result07 = mmValue * multiplier07;
                    double result08 = mmValue * multiplier08;

                    resultTextView.setTextColor(Color.DKGRAY);
                    resultTextView.setText((String.format("%.2f", result01) + " " + "inch(es)" + " " + "Is equal to:")
                            + System.getProperty("line.separator") + (String.format("%.2f", result02) + " " + "millimeter(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", result03) + " " + "centimeter(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", result04) + " " + "meter(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", result05) + " " + "kilometer(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", result06) + " " + "foot/feet.")
                            + System.getProperty("line.separator") + (String.format("%.2f", result07) + " " + "yard(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", result08) + " " + "mile(s).")
                            + System.getProperty("line.separator") + "Results to 2dp."
                    );


                }
            }
        });

        //code for feet

        ftButton = (Button) findViewById(R.id.ftButtonID);
        ftButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

/*conversion logic: 1 feet

304.8 Millimeter
30.48 Centimeter
0.3048 Meter
0.00030480000000000004 Kilometer
12.000000000000002 Inch
1 Feet
0.33333333333333337 Yard
0.0001893939393939394 mile(s)



 */
                double multiplier0a = 1;//ft
                double multiplier09 = 304.8;//mm
                double multiplier011 = 30.48;//cm
                double multiplier012 = 0.00001;//m
                double multiplier013 =0.00030480000000000004;//km
                double multiplier014 = 12.000000000000002;//in
                double multiplier015 = 0.33333333333333337;//yd
                double multiplier016 = 0.0001893939393939394;//mi


                double result = 0.0;


                if (enterUnit.getText().toString().equals("")) {

                    resultTextView.setText(R.string.error_message);
                    resultTextView.setTextColor(Color.RED);
                } else {
                    double mmValue = Double.parseDouble(enterUnit.getText().toString());
                    double result0a = mmValue * multiplier0a;
                    double result09 = mmValue * multiplier09;
                    double result011 = mmValue * multiplier011;
                    double result012 = mmValue * multiplier012;
                    double result013 = mmValue * multiplier013;
                    double result014 = mmValue * multiplier014;
                    double result015 = mmValue * multiplier015;
                    double result016 = mmValue * multiplier016;


                    resultTextView.setTextColor(Color.DKGRAY);
                    resultTextView.setText((String.format("%.2f", result0a) + " " + "foot/feet" + " " + "Is equal to:")
                            + System.getProperty("line.separator") + (String.format("%.2f", result09) + " " + "millimeter(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", result011) + " " + "centimeter(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", result012) + " " + "meter(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", result013) + " " + "kilometer(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", result014) + " " + "inch(es).")
                            + System.getProperty("line.separator") + (String.format("%.2f", result015) + " " + "yard(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", result016) + " " + "mile(s).")
                            + System.getProperty("line.separator") + "Results to 2dp."
                    );


                }
            }
        });

        //code for yard

        ydButton = (Button) findViewById(R.id.ydButtonID);
        ydButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

/*conversion logic: 1 yard
914.4 Millimeter
91.44 Centimeter
0.9144 Meter
0.0009144 Kilometer
36 Inch
3 Feet
1 Yard
0.0005681818181818182 mile(s)

 */
                double multiplier001 = 1;//yd
                double multiplier002 = 914.4;//mm
                double multiplier003 =91.44;//cm
                double multiplier004 = 0.9144;//m
                double multiplier005 = 0.0009144;//km
                double multiplier006 = 36;//in
                double multiplier007 = 3;//ft
                double multiplier008 = 0.0005681818181818182;//mi


                double result = 0.0;


                if (enterUnit.getText().toString().equals("")) {

                    resultTextView.setText(R.string.error_message);
                    resultTextView.setTextColor(Color.RED);
                } else {
                    double mmValue = Double.parseDouble(enterUnit.getText().toString());

                    double result001 = mmValue * multiplier001;
                    double result002 = mmValue * multiplier002;
                    double result003 = mmValue * multiplier003;
                    double result004 = mmValue * multiplier004;
                    double result005 = mmValue * multiplier005;
                    double result006 = mmValue * multiplier006;
                    double result007 = mmValue * multiplier007;
                    double result008 = mmValue * multiplier008;

                    resultTextView.setTextColor(Color.DKGRAY);
                    resultTextView.setText((String.format("%.2f", result001) + " " + "yard(s)" + " " + "Is equal to:")
                            + System.getProperty("line.separator") + (String.format("%.2f", result002) + " " + "millimeter(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", result003) + " " + "centimeter(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", result004) + " " + "meter(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", result005) + " " + "kilometer(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", result006) + " " + "inch(es).")
                            + System.getProperty("line.separator") + (String.format("%.2f", result007) + " " + "foot/feet.")
                            + System.getProperty("line.separator") + (String.format("%.2f", result008) + " " + "mile(s).")
                            + System.getProperty("line.separator") + "Results to 2dp."
                    );


                }
            }
        });

        //code for mile(s)

        miButton = (Button) findViewById(R.id.miButtonID);
        miButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

/*conversion logic: 1 mile(s)

1 mile(s) (mi)
	1609344mm
160934.4cm
	1609.344m
1.609344km
63360in
5280ft
1760yd
	1ml

 */
                double multiplier00a = 1;//ml
                double multiplier009 = 1609344;//mm
                double multiplier0011 = 160934.4;//cm
                double multiplier0012 = 1609.344;//m
                double multiplier0013 =1.609344;//km
                double multiplier0014 = 63360;//in
                double multiplier0015 = 5280;//ft
                double multiplier0016 = 1760;//yd


                double result = 0.0;


                if (enterUnit.getText().toString().equals("")) {

                    resultTextView.setText(R.string.error_message);
                    resultTextView.setTextColor(Color.RED);
                } else {
                    double mmValue = Double.parseDouble(enterUnit.getText().toString());
                    double result00a = mmValue * multiplier00a;
                    double result009 = mmValue * multiplier009;
                    double result0011 = mmValue * multiplier0011;
                    double result0012 = mmValue * multiplier0012;
                    double result0013 = mmValue * multiplier0013;
                    double result0014 = mmValue * multiplier0014;
                    double result0015 = mmValue * multiplier0015;
                    double result0016 = mmValue * multiplier0016;


                    resultTextView.setTextColor(Color.DKGRAY);
                    resultTextView.setText((String.format("%.2f", result00a) + " " + "mile(s)" + " " + "Is equal to:")
                            + System.getProperty("line.separator") + (String.format("%.2f", result009) + " " + "millimeter(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", result0011) + " " + "centimeter(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", result0012) + " " + "meter(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", result0013) + " " + "kilometer(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", result0014) + " " + "inch(es).")
                            + System.getProperty("line.separator") + (String.format("%.2f", result0015) + " " + "yard(s).")
                            + System.getProperty("line.separator") + (String.format("%.2f", result0016) + " " + "foot/feet.")
                            + System.getProperty("line.separator") + "Results to 2dp."
                    );


                }
            }
        });

    }
}
