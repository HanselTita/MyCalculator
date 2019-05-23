package com.softhans.mycalculator;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AreaFormulae extends AppCompatActivity {

    private Button sqButton;
    private Button recButton;
    private Button cirButton;
    private Button triButton;
    private Button rhoButton;
    private Button coButton;
    private Button traButton;
    private Button ellButton;
    private Button sphButton;
    private Button regpolButton;



    private TextView resultTextView;
    private TextView noteTextView;
    private TextView titleTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area_formulae);

        resultTextView = (TextView)  findViewById(R.id.resultID);
        noteTextView = (TextView) findViewById(R.id.noteTextViewID);
        titleTextView = (TextView) findViewById(R.id.titleTextViewID);

        // code for the area of a square.

        sqButton = (Button) findViewById(R.id.magButtonID);
        sqButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                titleTextView.setText(("Area of Square:" ));
                resultTextView.setTextColor(Color.BLUE);
                resultTextView.setText(("\n" + "\n" + " Area = a x a ( or a-squared)" + "\n ") );

                noteTextView.setTextColor(Color.DKGRAY);
                noteTextView.setText( ( "\n" + "a = one side of  the square"));
            }
        });

// code for the area of a circle.

        cirButton = (Button) findViewById(R.id.dirButtonID);
        cirButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                titleTextView.setText(("Area of a Circle:" ));
                resultTextView.setTextColor(Color.BLUE);
                resultTextView.setText(("\n" + "\n" +  "\n" + " Area = π(rxr)" + "\n ") );

                noteTextView.setTextColor(Color.DKGRAY);
                noteTextView.setText( ( "\n" + "r = the radius of the circle."
                        +"\n" + " π = 22/7 0r 3.14 to 2 dp."));
            }
        });
// code for the area of a rectangle.

        recButton = (Button) findViewById(R.id.regprButtonID);
        recButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                titleTextView.setText(("Area of a Rectangle:" ));
                resultTextView.setTextColor(Color.BLUE);
                resultTextView.setText(("\n" + "\n" + " Area = L x W" + "\n ") );

                noteTextView.setTextColor(Color.DKGRAY);
                noteTextView.setText( ( "\n" + "L = the length of the rectangle." + "\n" + "W = the width of the rectangle."));
            }
        });
// code for the area of a rhombus.

        rhoButton = (Button) findViewById(R.id.cylinderButtonID);
        rhoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                titleTextView.setText(("Area of a Rhombus:" ));
                resultTextView.setTextColor(Color.BLUE);
                resultTextView.setText(("\n" + "\n" + " Area = (pq)/2. Or"
                                             + "\n" + " Area = ba. Or"
                                             + "\n" + " Area = (s x s) sin y." + "\n ") );

                noteTextView.setTextColor(Color.DKGRAY);
                noteTextView.setText( ( "\n" + "p = the length of a diagonal and, q = the length of the other diagonal.(diagonal method)" +
                        "\n" + "b = the length of the base and, a = altitude(height).(base x height method)"  +
                        "\n" + "s = the length of any side and, y = any interior angle.(trigonometry method)"));
            }
        });
// code for the area of a Cone.

        coButton = (Button) findViewById(R.id.conePyramidButtonID);
        coButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                titleTextView.setText(("Area of a Cone:" ));
                resultTextView.setTextColor(Color.BLUE);
                resultTextView.setText(( "\n" + " Lateral surface Area = " + "\n" + " " +" " +" " +" " +" " +" πrl" + "\n"
                                              + "\n" + " Total surface Area =" + "\n" + " " +" " +" " +" " +"πrl + π(r x r)" ) );

                noteTextView.setTextColor(Color.DKGRAY);
                noteTextView.setText( ( "\n" + "l = is the slant height of the cone and r = the radius of the circular base. "));
            }
        });
// code for the area of a Triangle.

        triButton = (Button) findViewById(R.id.sphereButtonID);
        triButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                titleTextView.setText(("Area of a Triangle:" ));
                resultTextView.setTextColor(Color.BLUE);
                resultTextView.setText(("\n" + "\n" + " Area = (b x h)/2" + "\n ") );

                noteTextView.setTextColor(Color.DKGRAY);
                noteTextView.setText( ( "\n" + "b = the base"
                        +"\n" + "h = the height"));
            }
        });
// code for the area of a Trapezoid.

        traButton = (Button) findViewById(R.id.sequencesButtonID);
        traButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                titleTextView.setText(("Area of a Trapezoid:" ));
                resultTextView.setTextColor(Color.BLUE);
                resultTextView.setText(("\n" + "\n" + " Area =((b1+b2)h)/2" + "\n ") );

                noteTextView.setTextColor(Color.DKGRAY);
                noteTextView.setText( ( "\n" + "b1 = a base"
                        +"\n" + "b2 = the second base" + "\n" + " h = the height"));
            }
        });
// code for the area of a ellipse.

        ellButton = (Button) findViewById(R.id.derivativesButtonID);
        ellButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                titleTextView.setText(("Area of an Ellipse:" ));
                resultTextView.setTextColor(Color.BLUE);
                resultTextView.setText(("\n" + "\n" + " Area = A=π(r1 x r2)" + "\n ") );

                noteTextView.setTextColor(Color.DKGRAY);
                noteTextView.setText( ( "\n" + "r1 = first radius"
                        +"\n" + "r2 = second radius" + "\n" + " π = 22/7 0r 3.14 to 2 dp ."));
            }
        });
// code for the area of a sphere.

        sphButton = (Button) findViewById(R.id.logarithmButtonID);
        sphButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                titleTextView.setText(("Area of a Sphere:" ));
                resultTextView.setTextColor(Color.BLUE);
                resultTextView.setText(("\n" + "\n" + " Area = 4 x π x (r x r)" + "\n ") );

                noteTextView.setTextColor(Color.DKGRAY);
                noteTextView.setText( ( "\n" + "r = the radius"
                         + "\n" + "  π = 22/7 0r 3.14 to 2 dp."));
            }
        });
// code for the area of a regular polygon.

        regpolButton = (Button) findViewById(R.id.setProbabilitiesButtonID);
        regpolButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                titleTextView.setText(( " Area of a Reg.Pol:" ));
                resultTextView.setTextColor(Color.BLUE);
                resultTextView.setText(("\n" + "\n" + " Area = (a x p)/2 " + "\n ") );

                noteTextView.setTextColor(Color.DKGRAY);
                noteTextView.setText( ( "\n" + "a = the length of the apothem"
                        + "\n" + "  p =  the perimeter of the polygon."));
            }
        });


    }
}
