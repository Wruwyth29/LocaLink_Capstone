package com.example.localink;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AdminsView_BarangayHiring extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.barangayhiring_adminsviewq);
        Button Plus = findViewById(R.id.Plus);
        Button VolunteerBtn = findViewById(R.id.VolunteerBtn);
        ScrollView ApplicantsScrollView = findViewById(R.id.ApplicantsScrollView);
        TextView pendingapplicants_seemore = findViewById(R.id.pendingapplicants_seemore);

        Plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminsView_BarangayHiring.this, AdminsView_BarangayHiringConfirmation.class);
                startActivity(intent);
            }
        });

        VolunteerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminsView_BarangayHiring.this, barangay_volunteer_work.class);
                startActivity(intent);
            }
        });

        ApplicantsScrollView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminsView_BarangayHiring.this, AdminsView_BarangayHiringApplicants.class);
                startActivity(intent);
            }
        });

        pendingapplicants_seemore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminsView_BarangayHiring.this,AdminsView_BarangayHiringPending.class);
                startActivity(intent);
            }
        });








    }}