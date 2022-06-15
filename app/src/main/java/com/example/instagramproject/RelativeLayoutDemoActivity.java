package com.example.instagramproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class RelativeLayoutDemoActivity extends AppCompatActivity {
    Button btnRegister;
    EditText edtFirstname;
    EditText edtLatname;
    EditText edtEmail;
    EditText edtPassword;
    RadioGroup radioGroup;
    RadioButton rbFemale, rbMale, rbOther;
    CheckBox chkDance, chkCooking, chkCoding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative_layout_demo);
        initView();

    }

    private void initView() {
        btnRegister = findViewById(R.id.btnRegister);
        edtFirstname = findViewById(R.id.edtFirstname);
        edtLatname = findViewById(R.id.edtLatname);
        edtEmail = findViewById(R.id.edtEmail);
        edtPassword = findViewById(R.id.edtPassword);
        radioGroup = findViewById(R.id.radioGroup);
        rbFemale = findViewById(R.id.rbFemale);
        chkDance = findViewById(R.id.chkDance);
        chkCooking = findViewById(R.id.chkCooking);
        chkCoding = findViewById(R.id.chkCoding);

        chkCoding.setChecked(true);


        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String firstname = edtFirstname.getText().toString();
                String lastname = edtLatname.getText().toString();
                String email = edtEmail.getText().toString();
                String password = edtPassword.getText().toString();








//
//                if (firstname.isEmpty()) {
//                    Toast.makeText(RelativeLayoutDemoActivity.this, "Please enter firstname", Toast.LENGTH_SHORT).show();
//                } else if (firstname.length() >= 5 && firstname.length() <= 15) {
//
//                } else if (lastname.isEmpty()) {
//                    Toast.makeText(RelativeLayoutDemoActivity.this, "Please enter laastname", Toast.LENGTH_SHORT).show();
//                } else if (email.isEmpty()) {
//                    Toast.makeText(RelativeLayoutDemoActivity.this, "Please enter email", Toast.LENGTH_SHORT).show();
//                } else if (password.isEmpty()) {
//                    Toast.makeText(RelativeLayoutDemoActivity.this, "Please enter password", Toast.LENGTH_SHORT).show();
//                } else {
//                    Toast.makeText(RelativeLayoutDemoActivity.this, "succes", Toast.LENGTH_SHORT).show();
//                }


                if (chkDance.isChecked()) {
                    Toast.makeText(RelativeLayoutDemoActivity.this, "dance", Toast.LENGTH_SHORT).show();
                }
                if (chkCooking.isChecked()) {
                    Toast.makeText(RelativeLayoutDemoActivity.this, "cooking", Toast.LENGTH_SHORT).show();
                }
                if (chkCoding.isChecked()) {
                    Toast.makeText(RelativeLayoutDemoActivity.this, "coding", Toast.LENGTH_SHORT).show();
                }


            }
        });


        rbFemale.setChecked(true);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                int id = radioGroup.getCheckedRadioButtonId();
                if (id != -1) {
                    if (id == R.id.rbFemale) {
                        Toast.makeText(RelativeLayoutDemoActivity.this, "female", Toast.LENGTH_SHORT).show();
                    } else if (id == R.id.rbMale) {
                        Toast.makeText(RelativeLayoutDemoActivity.this, "male", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(RelativeLayoutDemoActivity.this, "other", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(RelativeLayoutDemoActivity.this, "invalid data", Toast.LENGTH_SHORT).show();
                }

            }
        });


    }


}