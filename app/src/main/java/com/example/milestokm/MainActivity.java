package com.example.milestokm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         Button ctk;
         Button ctm;
        ctk=findViewById(R.id.ctk);
        ctm=findViewById(R.id.ctm);

        ctk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText miles=findViewById(R.id.miles);
                EditText km=findViewById(R.id.km);

                Double v_miles=Double.valueOf(miles.getText().toString());
                Double v_km=v_miles/0.62173;
                DecimalFormat formatvalue=new DecimalFormat("##.##");
                    km.setText(formatvalue.format(v_km));

            }
        });

        ctm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText miles=findViewById(R.id.miles);
                EditText km=findViewById(R.id.km);

                Double v_km=Double.valueOf(km.getText().toString());
                Double v_miles=v_km*0.62173;
                DecimalFormat formatvalue=new DecimalFormat("##.##");
                miles.setText(formatvalue.format(v_miles));

            }
        });

            }

    }
