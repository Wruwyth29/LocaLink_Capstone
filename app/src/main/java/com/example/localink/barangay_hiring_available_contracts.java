package com.example.localink;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class barangay_hiring_available_contracts extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_barangay_hiring_available_contracts);
        ImageButton Barangay_Hiring_AvailableContract_BackBtn = findViewById(R.id.Barangay_Hiring_AvailableContract_BackBtn);

        Barangay_Hiring_AvailableContract_BackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(barangay_hiring_available_contracts.this, Barangay_Hiring.class);
                startActivity(intent);
            }
        });
    }
}