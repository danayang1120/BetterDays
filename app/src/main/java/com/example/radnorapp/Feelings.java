package com.example.radnorapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.util.Log;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;


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

        InputStream is = getResources().openRawResource(R.raw.positive_affirmations);
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(is, Charset.forName("UTF-8"))
        );
        try {
            //CSVReader reader = new CSVReader(new FileReader("positive_affirmations.csv"));
            quotes1 = reader.readLine().split("\\t");
            quotes2 = reader.readLine().split("\\t");
            quotes3 = reader.readLine().split("\\t");
            quotes4 = reader.readLine().split("\\t");
            quotes5 = reader.readLine().split("\\t");
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
                    Log.d("scale 1:", PosAffirmation);
                    break;
                case R.id.feelingTwo:
                    randomNum = (int)(Math.random() * quotes2.length);
                    PosAffirmation = quotes2[randomNum];
                    Log.d("scale 2:", PosAffirmation);
                    break;
                case R.id.feelingThree:
                    randomNum = (int)(Math.random() * quotes3.length);
                    PosAffirmation = quotes3[randomNum];
                    Log.d("scale 3:", PosAffirmation);
                    break;
                case R.id.feelingFour:
                    randomNum = (int)(Math.random() * quotes4.length);
                    PosAffirmation = quotes4[randomNum];
                    Log.d("scale 4:", PosAffirmation);
                    break;
                case R.id.feelingFive:
                    randomNum = (int)(Math.random() * quotes5.length);
                    PosAffirmation = quotes5[randomNum];
                    Log.d("scale 5:", PosAffirmation);
                    break;
            }
            Intent click = new Intent(getApplicationContext(), QuotesActivity.class);
            click.putExtra("Positive_Affirmation", PosAffirmation);
            startActivity(click);
        }

    }




}