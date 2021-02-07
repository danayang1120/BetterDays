package com.example.radnorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.widget.Button;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class QuotesActivity extends AppCompatActivity {

    Button exitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quotes);

        String posAffirmation = getIntent().getStringExtra("Positive_Affirmation");

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