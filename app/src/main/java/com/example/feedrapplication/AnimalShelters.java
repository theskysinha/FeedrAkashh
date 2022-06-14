package com.example.feedrapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class AnimalShelters extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal_shelters);
        Button AnidonatebtnA = findViewById(R.id.AnidonateA);
        Button AnidonatebtnB = findViewById(R.id.AnidonateB);
        Button AnidonatebtnC = findViewById(R.id.AnidonateC);

        AnidonatebtnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(AnimalShelters.this, ThankYou.class);
                startActivity(i);
                finish();
            }
        });
        AnidonatebtnB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(AnimalShelters.this, ThankYou.class);
                startActivity(i);
                finish();
            }
        });
        AnidonatebtnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(AnimalShelters.this, ThankYou.class);
                startActivity(i);
                finish();
            }
        });
    }
}