package com.example.localink;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

    public class AdminsView_BarangayHiringPending extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.adminsview_pendingapplicants); // Your first XML layout

            Button BackBtn = findViewById(R.id.BackBtn);

            BackBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(AdminsView_BarangayHiringPending.this, AdminsView_BarangayHiring.class);
                    startActivity(intent);
                }
            });
        }
}
