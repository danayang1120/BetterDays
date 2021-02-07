package com.example.radnorapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class QuotesActivity extends AppCompatActivity {

    Button exitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quotes);

        String posAffirmation = getIntent().getStringExtra("Positive_Affirmation");
        Log.d("Confirm", posAffirmation);

        TextView affirmation = (TextView) findViewById(R.id.textAffirmation);
        affirmation.setText(posAffirmation);

        exitButton = findViewById(R.id.exitButton);
        exitButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent exit = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(exit);
            }
        });
    }
}