package com.example.instagramproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    AppCompatButton btnSubmit;
    EditText edtUsername,edtPassword,edtEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        initView();

    }

    private void initView() {
        btnSubmit = findViewById(R.id.btnSubmit);
        edtUsername = findViewById(R.id.edtUsername);
        edtEmail = findViewById(R.id.edtEmail);
        edtPassword = findViewById(R.id.edtPassword);



        btnSubmit.setOnClickListener(v ->{

            String username=edtUsername.getText().toString();
            String email=edtEmail.getText().toString();
            String password=edtPassword.getText().toString();

            if(username.isEmpty())
            {
                Toast.makeText(this, "Please enter username", Toast.LENGTH_SHORT).show();
            }
            else if(username.length() < 10  && username.length() > 15)
            {
                Toast.makeText(this, "Please eneter username between 10 to 15 character", Toast.LENGTH_SHORT).show();
            }
            else if(email.isEmpty())
            {
                Toast.makeText(this, "Please enter email", Toast.LENGTH_SHORT).show();
            }
            else if(password.isEmpty())
            {
                Toast.makeText(this, "Please enter Password", Toast.LENGTH_SHORT).show();
            }
            else if(password.length() < 6)
            {
                Toast.makeText(this, "Please enter minimum 6 character password", Toast.LENGTH_SHORT).show();
            }
            else {
                Toast.makeText(this, "success", Toast.LENGTH_SHORT).show();

                Intent i=new Intent(RegisterActivity.this,DashbordActivity.class);
                i.putExtra("username",username);
                i.putExtra("email",email);
                i.putExtra("password",password);
                startActivity(i);

            }



            



        });

    }
}