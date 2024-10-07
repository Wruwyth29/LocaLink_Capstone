package com.example.localink;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class sign_up_second extends AppCompatActivity {

    FirebaseAuth mAuth;

    @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();
        if (currentUser != null) {
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sign_up_second);
        Button Confirm_SignUp2 = findViewById(R.id.Confirm_SignUp2);
        EditText emailadd = findViewById(R.id.SignUp2_EmailAddress);
        EditText password = findViewById(R.id.SignUp2_Password);
        mAuth = FirebaseAuth.getInstance();

        Confirm_SignUp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String email, pass;
                email = String.valueOf(emailadd.getText());
                pass = String.valueOf(password.getText());

                if(TextUtils.isEmpty(email)){
                    Toast.makeText(sign_up_second.this,"Enter Your Email Address", Toast.LENGTH_SHORT).show();
                    return;
                }

                if(TextUtils.isEmpty(pass)){
                    Toast.makeText(sign_up_second.this,"Enter Your Password", Toast.LENGTH_SHORT).show();
                    return;
                }
                mAuth.createUserWithEmailAndPassword(email, pass)
                        .addOnCompleteListener( new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful()) {
                                    Intent intent = new Intent(sign_up_second.this, sign_up_third.class);
                                    startActivity(intent);
                                } else {
                                    // If sign in fails, display a message to the user.

                                    Toast.makeText(sign_up_second.this, "Authentication failed.",
                                            Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
            }
        });

    }
}