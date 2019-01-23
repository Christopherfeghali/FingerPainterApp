package com.example.fingerpainterapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.graphics.Paint;
public class MainActivity extends AppCompatActivity {

    private FingerPainterView FPV;
    //public int SBW;
    //Button brush;
    final static int  brushreturn = 2;
    final static int  colourreturn  = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FPV = (FingerPainterView) findViewById(R.id.canvas);
        ConfigureBrushButton();
        ConfigureColourButton();
        //ConfigureClearButton();
        Intent intent = getIntent();
        FPV.load(intent.getData());

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Bundle bundle = data.getExtras();
        if(requestCode == brushreturn){
            FPV.setBrushWidth(bundle.getInt("BrushWidth"));
            if(bundle.getBoolean("Switch") == true){
                FPV.setBrush(Paint.Cap.SQUARE);
            }
            else{
                FPV.setBrush(Paint.Cap.ROUND);
            }
        }
        if(requestCode == colourreturn)
        {
            if(bundle.getInt("RED")==1)
            {
                FPV.setColour(Color.RED);
            }
            if(bundle.getInt("BLUE")==2)
            {
                FPV.setColour(Color.BLUE);
            }
            if(bundle.getInt("GREEN")==3)
            {
                FPV.setColour(Color.GREEN);
            }
            if(bundle.getInt("BLACK")==4)
            {
                FPV.setColour(Color.BLACK);
            }

            if(bundle.getInt("GREY")==5)
            {
                FPV.setColour(Color.GRAY);
            }
            if(bundle.getInt("YELLOW")==6)
            {
                FPV.setColour(Color.YELLOW);
            }
            if(bundle.getInt("WHITE")==7)
            {
                FPV.setColour(Color.WHITE);
            }
        }
    }

    public void ConfigureBrushButton()
    {
        Button Brush = (Button)findViewById(R.id.Brushbutton);
        Brush.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Brush_Activity.class);
                startActivityForResult(intent,brushreturn);
            }
        });


    }

    public void ConfigureColourButton()
    {
        Button Colour = (Button)findViewById(R.id.ColourButton);
        Colour.setOnClickListener(new View.OnClickListener() {
        @Override
         public void onClick(View view) {
        Intent intent = new Intent(MainActivity.this,Colour_Activity.class);
        startActivityForResult(intent,colourreturn);
        }
        });
    }

    public void ConfigureClearButton(View view)
    {
        FPV.ClearCanvas();
    }

}
