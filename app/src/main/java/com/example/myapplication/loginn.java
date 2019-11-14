package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;

public class loginn extends AppCompatActivity implements View.OnClickListener {

    Button bLogin, bSignUp;
    EditText etusername, etpassword;
    CheckBox etcheckbox;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginn);

        etusername = (EditText) findViewById(R.id.etusername);
        etpassword = (EditText) findViewById(R.id.etpassword);
        bLogin = (Button) findViewById(R.id.bLogin);
        bSignUp = (Button) findViewById(R.id.bSignUp);
        etcheckbox = (CheckBox) findViewById(R.id.etcheckbox);

        bLogin.setOnClickListener(This);



    }

    @Override
    public void onClick (View v) {
        switch(v.getId()){
            case R.id.bLogin:


                break;


            case R.id.bSignUp

                startActivity(new Intent(this, register.class))

                break;

        }
    }
}
