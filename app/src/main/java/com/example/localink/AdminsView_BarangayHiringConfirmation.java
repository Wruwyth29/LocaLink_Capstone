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

public class AdminsView_BarangayHiringConfirmation extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.barangayhiring_adminsview_confirmation); // Your first XML layout

    Button YesBtn = findViewById(R.id.YesBtn);
    Button NoBtn = findViewById(R.id.NoBtn);

    YesBtn.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Intent intent = new Intent(AdminsView_BarangayHiringConfirmation.this, AdminsView_BarangayHiring.class);
        startActivity(intent);
      }
    });

    NoBtn.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        finish();
      }
    });
  }
}