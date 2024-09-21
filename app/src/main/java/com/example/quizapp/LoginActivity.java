package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;

public class LoginActivity extends AppCompatActivity {

    private TextInputLayout email, password;

    private MaterialTextView signuptext, fgpass;

    private Button login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        signuptext = findViewById(R.id.signuptext);
        fgpass = findViewById(R.id.fgpass);
        login = findViewById(R.id.loginbtn);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(validateData()){
                    login();
                }
            }
        });

        signuptext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, SignUpActivity.class);
                startActivity(intent);
            }
        });



    }

    private boolean validateData(){
        boolean status =false;

        if(email.getEditText().getText().toString().isEmpty()){
            email.setError("Enter Email id");
            return false;
        }
        if(password.getEditText().getText().toString().isEmpty()){
            password.setError("Enter Password Correctly");
            return false;
        }
        return true;
    }

    private void login(){

    }
}