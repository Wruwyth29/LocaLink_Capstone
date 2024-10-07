package com.example.localink;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Barangay_Hiring extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_barangay_hiring);
        Button Barangay_Hiring_AvailableContractsBtn = findViewById(R.id.Barangay_Hiring_AvailableContractsBtn);
        Button Barangay_Hiring_VolunteerBtn = findViewById(R.id.Barangay_Hiring_VolunteerBtn);
        ImageButton Backbtn = findViewById(R.id.Barangay_Hiring_BackBtn);


        Barangay_Hiring_AvailableContractsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Barangay_Hiring.this, barangay_hiring_available_contracts.class);
                startActivity(intent);
            }
        });

        Barangay_Hiring_VolunteerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Barangay_Hiring.this, barangay_volunteer_work.class);
                startActivity(intent);
            }
        });

        Backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Barangay_Hiring.this, Dashboard.class);
                startActivity(intent);
            }
        });
    }
}