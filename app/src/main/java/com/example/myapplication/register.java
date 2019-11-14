package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class register extends AppCompatActivity implements View.OnClickListener {

    Button bSignUp;
    EditText etName, etEmail, etDateOfBirth, etPassword;

    etEmail = (EditText) findViewById(R.id.etEmail);
    etName = (EditText) findViewById(R.id.etName);
    etDateOfBirth = (EditText) findViewById(R.id.etDateOfBirth);
    etPassword = (EditText) findViewById(R.id.etPassword);
    bSignUp = (Button) findViewById(R.id.bSignup);

    bSignUp.setOnClickListener(This);



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        @Override
        public void onClick (View v) {
            switch(v.getId()){


                break;
            }
        }
    }
}
