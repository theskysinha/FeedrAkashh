package com.example.feedrapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HumanShelters extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_human_shelters);
        Button donatebtnA = findViewById(R.id.donateA);
        Button donatebtnB = findViewById(R.id.donateB);
        Button donatebtnC = findViewById(R.id.donateC);

        donatebtnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HumanShelters.this, ThankYou.class);
                startActivity(i);
                finish();
            }
        });
        donatebtnB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HumanShelters.this, ThankYou.class);
                startActivity(i);
                finish();
            }
        });
        donatebtnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HumanShelters.this, ThankYou.class);
                startActivity(i);
                finish();
            }
        });
    }
}