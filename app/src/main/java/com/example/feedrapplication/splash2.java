package com.example.feedrapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class splash2 extends AppCompatActivity {

    private Button getstarted;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash2);

        getstarted = findViewById(R.id.idBtngetstart);
        getstarted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(splash2.this, LoginActivity.class);
                startActivity(i);
            }
        });
    }
}