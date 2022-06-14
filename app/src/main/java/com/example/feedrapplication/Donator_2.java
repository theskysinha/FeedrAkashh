package com.example.feedrapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Donator_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donator2);
        Button a = findViewById(R.id.donatef);
        Button b = findViewById(R.id.stats);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(Donator_2.this, DonatorActivity.class);
                startActivity(i);
                finish();
            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(Donator_2.this, Bar_Chart.class);
                startActivity(i);
                finish();
            }
        });
    }
}