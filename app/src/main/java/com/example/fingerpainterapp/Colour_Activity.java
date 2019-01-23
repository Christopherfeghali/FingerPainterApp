package com.example.fingerpainterapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Colour_Activity extends AppCompatActivity {
    int colour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colour_2);
    }

    public void ConfigureRedButton(View view) {
                Button red = (Button) findViewById(R.id.RedButton);
                colour=1;
                Bundle bundle = new Bundle();
                bundle.putInt("RED",colour);
                Intent colourintent = new Intent();
                colourintent.putExtras(bundle);
                setResult(Activity.RESULT_OK, colourintent);
                finish();
    }

    public void ConfigureBlueButton(View view) {
                Button blue = (Button) findViewById(R.id.BlueButton);
                colour = 2;
                Bundle bundle = new Bundle();
                bundle.putInt("BLUE",colour);
                Intent colourintent = new Intent();
                colourintent.putExtras(bundle);
                setResult(Activity.RESULT_OK, colourintent);
                finish();
    }

    public void ConfigureGreenButton(View view) {
                Button green = (Button) findViewById(R.id.GreenButton);
                colour = 3;
                Bundle bundle = new Bundle();
                bundle.putInt("GREEN",colour);
                Intent colourintent = new Intent();
                colourintent.putExtras(bundle);
                setResult(Activity.RESULT_OK, colourintent);
                finish();
    }

    public void ConfigureBlackButton(View view) {
                Button black = (Button) findViewById(R.id.BlackButton);
                colour = 4;
                Bundle bundle = new Bundle();
                bundle.putInt("BLACK",colour);
                Intent colourintent = new Intent();
                colourintent.putExtras(bundle);
                setResult(Activity.RESULT_OK, colourintent);
                finish();
    }

    public void ConfigureGreyButton(View view) {
                Button grey = (Button) findViewById(R.id.GreyButton);
                colour = 5;
                Bundle bundle = new Bundle();
                bundle.putInt("GREY",colour);
                Intent colourintent = new Intent();
                colourintent.putExtras(bundle);
                setResult(Activity.RESULT_OK, colourintent);
                finish();
    }

    public void ConfigureYellowButton(View view) {
                Button yellow = (Button) findViewById(R.id.YellowButton);
                colour = 6;
                Bundle bundle = new Bundle();
                bundle.putInt("YELLOW",colour);
                Intent colourintent = new Intent();
                colourintent.putExtras(bundle);
                setResult(Activity.RESULT_OK, colourintent);
                finish();
    }

    public void ConfigureWhiteButton(View view) {
                Button white = (Button) findViewById(R.id.WhiteButton);
                colour = 7;
                Bundle bundle = new Bundle();
                bundle.putInt("WHITE",colour);
                Intent colourintent = new Intent();
                colourintent.putExtras(bundle);
                setResult(Activity.RESULT_OK, colourintent);
                finish();
    }

}
