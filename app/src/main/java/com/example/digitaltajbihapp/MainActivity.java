package com.example.digitaltajbihapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView countpress;
    Button addone;
    Button subone;
    Button resset;
    int count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countpress=(TextView) findViewById(R.id.count);
        addone=(Button) findViewById(R.id.addone);
        subone = (Button) findViewById(R.id.subone);
        resset=(Button) findViewById(R.id.reset);



        addone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                countpress.setText(""+count);

            }

        }
        );

        subone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count--;
                countpress.setText(""+count);


            }
        });

        resset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count=0;
                countpress.setText(""+count);

            }
        });




    }
}