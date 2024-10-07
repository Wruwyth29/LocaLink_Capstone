package com.example.localink;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.lang.reflect.Array;

public class gig_work_employer extends AppCompatActivity {

    private Spinner dropl;

  //  String [] item = {"Minor Repairs","Laundry","Small Deliveries"};
   // ArrayAdapter<String> adapterItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_gig_work_employer);

        ImageButton GigworkEmployer_BackBtn = findViewById(R.id.GigworkEmployer_BackBtn);
        Button GigWork_CreateBtn = findViewById(R.id.GigWork_CreateBtn);

       dropl = findViewById(R.id.GigWork_DropList);
        ArrayAdapter<CharSequence> list = ArrayAdapter.createFromResource(this,R.array.Jobs,android.R.layout.simple_spinner_item);
       // adapterItems =  new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, item);
        list.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        dropl.setAdapter(list);

        GigworkEmployer_BackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(gig_work_employer.this, Dashboard.class);
                startActivity(intent);
            }
        });

        GigWork_CreateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(gig_work_employer.this, employer_job_posting.class);
                startActivity(intent);
            }
        });


        }

}