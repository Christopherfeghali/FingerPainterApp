package com.example.fingerpainterapp;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;


public class Brush_Activity extends AppCompatActivity {
boolean RoundorSquare = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brush_);
        //ConfigureBackButton();
        configureConfirmButton();


    }



    private void configureConfirmButton() {
        final Button Confirm = (Button) findViewById(R.id.Confirm);
        final EditText value = (EditText) findViewById(R.id.sizeofbrush);
        final Switch switchstate = (Switch) findViewById(R.id.switch1);

        switchstate.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    RoundorSquare = true;
                } else {
                    RoundorSquare = false;
                }
            }
        });



        Confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               String brushwidthSTR = value.getText().toString();
                int brushwidth = Integer.parseInt(brushwidthSTR);
                Bundle bundle = new Bundle();
                bundle.putInt("BrushWidth",brushwidth);
                bundle.putBoolean("Switch",RoundorSquare);
                Intent brushintent = new Intent();
                brushintent.putExtras(bundle);
                setResult(Activity.RESULT_OK, brushintent);
                finish();

            }
        });
    }






}
