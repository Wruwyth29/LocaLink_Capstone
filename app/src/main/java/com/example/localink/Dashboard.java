package com.example.localink;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.firebase.auth.FirebaseAuth;

public class Dashboard extends AppCompatActivity {

    Button Gbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_dashboard);

        Button BarangayBtn = findViewById(R.id.BarangayBtn);
        Button OnGoingTransactionBtn = findViewById(R.id.OnGoingTransactionsBtn);
        Button UserProfileBtn = findViewById(R.id.UserProfileBtn);
        Button TransactionHistoryBtn = findViewById(R.id.TransactionHistoryBtn);
        Button CommunityWallBtn = findViewById(R.id.CommunityWallBtn);
        Button LogoutBtn = findViewById(R.id.LogoutBtn);
        Gbtn = findViewById(R.id.GigWorkBtn);


        BarangayBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dashboard.this, barangay_volunteer_work.class);
                startActivity(intent);
            }
        });

        OnGoingTransactionBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dashboard.this, OnGoingTransactions.class);
                startActivity(intent);
            }
        });

        UserProfileBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dashboard.this, account_settings_worker.class);
                startActivity(intent);
            }
        });

        TransactionHistoryBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dashboard.this, transaction_history.class);
                startActivity(intent);
            }
        });

        CommunityWallBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dashboard.this, community_wall.class);
                startActivity(intent);
            }
        });

        Gbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dashboard.this, gig_work_employer.class);
                startActivity(intent);
            }
        });

        LogoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                Intent intent = new Intent(Dashboard.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

}