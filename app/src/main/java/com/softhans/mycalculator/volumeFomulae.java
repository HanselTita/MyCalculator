package com.softhans.mycalculator;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class volumeFomulae extends AppCompatActivity {

    private TextView resultTextView;
    private TextView noteTextView;
    private TextView titleTextView;

    private Button cubeButton;
    private Button paraButton;
    private Button regprButton;
    private Button cylinderButton;
    private Button conpyrButton;
    private Button sphereButton;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volume_fomulae);

        resultTextView = (TextView)  findViewById(R.id.resultID);
        noteTextView = (TextView) findViewById(R.id.noteTextViewID);
        titleTextView = (TextView) findViewById(R.id.titleTextViewID);

        cubeButton = (Button) findViewById(R.id.magButtonID);
        paraButton = (Button) findViewById(R.id.dirButtonID);
        regprButton = (Button) findViewById(R.id.regprButtonID);
        cylinderButton = (Button) findViewById(R.id.cylinderButtonID);
        conpyrButton = (Button) findViewById(R.id.conePyramidButtonID);
        sphereButton = (Button) findViewById(R.id.sphereButtonID);


        //code for Volume of cube.

       
        cubeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                titleTextView.setText(("Volume of Cube:" ));
                resultTextView.setTextColor(Color.BLUE);
                resultTextView.setText(("\n" + "\n" +  "\n" + " Volume = a x a x a " + "\n ") );

                noteTextView.setTextColor(Color.DKGRAY);
                noteTextView.setText( ( "\n" + "or = a-cubed. Or a raised to the power 3"
                        +"\n" + " where a = the value of an edge of the cube."));
            }
        });
// code for the Volume of  a parallelepiped.

      
        paraButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                titleTextView.setText(("Parallelepiped:" ));
                resultTextView.setTextColor(Color.BLUE);
                resultTextView.setText(("\n" + "\n" + " Volume = ( a x b ) x c." + "\n ") );

                noteTextView.setTextColor(Color.DKGRAY);
                noteTextView.setText( ( "\n" + "a, b, c, are three vectors that  form three edges of a parallelepiped"
                        + "\n" + "The Volume = the scalar triple product u.(v.w)"));
            }
        });
// code for the Volume of  a regular prism.

      
        regprButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                titleTextView.setText(("Volume of Reg Prism:" ));
                resultTextView.setTextColor(Color.BLUE);
                resultTextView.setText(("\n" + "\n" + " Volume = V= B x h , "));


                noteTextView.setTextColor(Color.DKGRAY);
                noteTextView.setText( ( "\n" + "B =  the base area." +
                        "\n" + "h =  the height"));
            }
        });
// code for the Volume of  a Cylinder.

      
        cylinderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                titleTextView.setText(("Volume of Cylinder:" ));
                resultTextView.setTextColor(Color.BLUE);
                resultTextView.setText(( "\n" + "Volume = π x (r x r) x h") );

                noteTextView.setTextColor(Color.DKGRAY);
                noteTextView.setText( ( "\n" + "h = height; r = radius;  π= 22/7 or 3.1 to 1dp. "));
            }
        });
// code for the Volume of  a cone or pyramid.

     
        conpyrButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                titleTextView.setText(("Cone/Pyramid:" ));
                resultTextView.setTextColor(Color.BLUE);
                resultTextView.setText(("\n" + "\n" + " Volume of cone = π x (r x r) x (h/3)" +
                        "\n" + "Volume of pyramid  = (l x w x h)/3") );

                noteTextView.setTextColor(Color.DKGRAY);
                noteTextView.setText( ( "\n" + "l = the base length; w = base width;"
                        +"\n" + "h = the height; r = radius"));
            }
        });
// code for the Volume of  a sphere.

       
        sphereButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                titleTextView.setText(("Volume of Sphere:" ));
                resultTextView.setTextColor(Color.BLUE);
                resultTextView.setText(("\n" + "\n" + " Volume =(4/3)π x (r x r x r)" + "\n ") );

                noteTextView.setTextColor(Color.DKGRAY);
                noteTextView.setText( ( "\n" + "r = radius"
                        +"\n" + "π = 22/7 or 3.1 to 1 dp"));
            }
        });

    }
}
