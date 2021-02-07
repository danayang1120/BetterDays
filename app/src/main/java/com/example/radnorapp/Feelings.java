package com.example.radnorapp;

import android.content.Intent;
import android.os.Bundle;

import com.opencsv.CSVReader;

import androidx.appcompat.app.AppCompatActivity;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;

import android.util.Log;
import android.view.View;
import android.widget.Button;


public class Feelings extends AppCompatActivity implements View.OnClickListener {

    String PosAffirmation;
    String[] quotes1;
    String[] quotes2;
    String[] quotes3;
    String[] quotes4;
    String[] quotes5;
    int randomNum;

    @Override
    protected void onCreate(Bundle savedInstanceState){

        try {
            CSVReader reader = new CSVReader(new FileReader("positive_affirmations.csv"));
            quotes1 = reader.readNext();
            quotes2 = reader.readNext();
            quotes3 = reader.readNext();
            quotes4 = reader.readNext();
            quotes5 = reader.readNext();
            Log.d("confirm", quotes1[0]);
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

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
            switch (v.getId()) {
                case R.id.feelingOne:
                    randomNum = (int)(Math.random() * quotes1.length);
                    PosAffirmation = quotes1[randomNum];
                    Log.d("confirm",PosAffirmation);
                    break;
                case R.id.feelingTwo:
                    randomNum = (int)(Math.random() * quotes2.length);
                    PosAffirmation = quotes2[randomNum];
                    break;
                case R.id.feelingThree:
                    randomNum = (int)(Math.random() * quotes3.length);
                    PosAffirmation = quotes3[randomNum];
                    break;
                case R.id.feelingFour:
                    randomNum = (int)(Math.random() * quotes4.length);
                    PosAffirmation = quotes4[randomNum];
                    break;
                case R.id.feelingFive:
                    randomNum = (int)(Math.random() * quotes5.length);
                    PosAffirmation = quotes5[randomNum];
                    break;
            }

            Intent click = new Intent(getApplicationContext(), QuotesActivity.class);
            //click.putExtra("Positive_Affimation", PosAffirmation);
            startActivity(click);
        }

    }




}