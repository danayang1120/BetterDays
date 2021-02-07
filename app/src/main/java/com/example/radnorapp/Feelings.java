package com.example.radnorapp;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;


public class Feelings extends AppCompatActivity implements View.OnClickListener {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button feeling1;
        Button feeling2;
        Button feeling3;
        Button feeling4;
        Button feeling5;
        Button exitButton2;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feelings);

        feeling1 = findViewById(R.id.feelingOne);
        feeling2 = findViewById(R.id.feelingTwo);
        feeling3 = findViewById(R.id.feelingThree);
        feeling4 = findViewById(R.id.feelingFour);
        feeling5 = findViewById(R.id.feelingFive);
        exitButton2 = findViewById(R.id.exitButton2);

        feeling1.setOnClickListener(this);
        feeling2.setOnClickListener(this);
        feeling3.setOnClickListener(this);
        feeling4.setOnClickListener(this);
        feeling5.setOnClickListener(this);
        exitButton2.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.exitButton2){
            Intent exit = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(exit);
        }
        else {
            Intent click = new Intent(getApplicationContext(), QuotesActivity.class);
            startActivity(click);
        }

    }




}