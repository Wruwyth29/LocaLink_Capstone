package com.example.localink;

import android.content.Intent;
import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

    public class AdminsView_BarangayPage extends AppCompatActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.barangaypage_admin); // Your first XML layout
            TextView edit_details = findViewById(R.id.edit_details);
            TextView edit_details2 = findViewById(R.id.edit_details2);
            TextView edit_details3 = findViewById(R.id.edit_details3);
            Button BackBtn = findViewById(R.id.BackBtn);

            BackBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(AdminsView_BarangayPage.this, Dashboard.class);
                    startActivity(intent);
                }
            });

            edit_details.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(AdminsView_BarangayPage.this, ObjectiveAdmin.class);
                    startActivity(intent);
                }
            });

            edit_details2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(AdminsView_BarangayPage.this, ObjectiveAdmin2.class);
                    startActivity(intent);
                }
            });


            edit_details3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(AdminsView_BarangayPage.this, ObjectiveAdmin3.class);
                    startActivity(intent);
                }
            });







        }
    }

