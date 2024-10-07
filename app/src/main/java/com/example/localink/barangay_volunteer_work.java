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

public class barangay_volunteer_work extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_barangay_volunteer_work);
        Button Barangay_Volunteer_HiringBtn = findViewById(R.id.Barangay_Volunteer_HiringBtn);
        ImageButton Barangay_Volunteer_BackBtn = findViewById(R.id.Barangay_Volunteer_BackBtn);

        Barangay_Volunteer_HiringBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(barangay_volunteer_work.this, Barangay_Hiring.class);
                startActivity(intent);
            }
        });

        Barangay_Volunteer_BackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(barangay_volunteer_work.this, Dashboard.class);
                startActivity(intent);
            }
        });
    }
}