package com.example.instagramproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class DashbordActivity extends AppCompatActivity {

    String name, email, password;
    TextView txtUsername, txtEmail, txtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashbord);


        txtUsername=findViewById(R.id.txtUsername);
        txtEmail=findViewById(R.id.txtEmail);
        txtPassword=findViewById(R.id.txtPassword);


        if (getIntent() != null) {
            name = getIntent().getStringExtra("username");
            email = getIntent().getStringExtra("email");
            password = getIntent().getStringExtra("password");

            Log.e("TAG", "onCreate:dashbots " + name + " " + email + " " + password);



            txtUsername.setText(name);
            txtEmail.setText(email);
            txtPassword.setText(password);



        }

    }
}