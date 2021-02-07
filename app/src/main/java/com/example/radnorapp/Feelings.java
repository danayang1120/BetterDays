package com.example.radnorapp;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;


public class Feelings extends AppCompatActivity {

    Button feeling1;
    Button feeling2;
    Button feeling3;
    Button feeling4;
    Button feeling5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feelings);

        // feeling scale 1
        feeling1 = findViewById(R.id.feelingOne);
        feeling1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent clickOne = new Intent(getApplicationContext(), QuotesActivity.class);
                startActivity(clickOne);
            }
        });

        // feeling scale 2
        feeling2 = findViewById(R.id.feelingTwo);
        feeling2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent clickTwo = new Intent(getApplicationContext(), QuotesActivity.class);
                startActivity(clickTwo);
            }
        });

        // feeling scale 3
        feeling3 = findViewById(R.id.feelingThree);
        feeling3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent clickThree = new Intent(getApplicationContext(), QuotesActivity.class);
                startActivity(clickThree);
            }
        });
         // feeling scale 4
        feeling4 = findViewById(R.id.feelingFour);
        feeling4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent clickFour = new Intent(getApplicationContext(), QuotesActivity.class);
                startActivity(clickFour);
            }
        });

        // feeling scale 5
        feeling5 = findViewById(R.id.feelingFive);
        feeling5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent clickFive = new Intent(getApplicationContext(), QuotesActivity.class);
                startActivity(clickFive);
            }
        });
    }





}