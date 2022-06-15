package com.example.instagramproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        Log.e("TAG", "onCreate: ==>"+"onCreate" );
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.e("TAG", "onStart: ==>"+"onstart" );
    }

    @Override
    protected void onResume() {
        super.onResume();
        
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("TAG", "onPause: ==>"+"onpause" );
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("TAG", "onStop: ==>"+"onstop" );
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("TAG", "onDestroy: ==>"+"ondestroy" );
    }

    private void initView() {
        btnRegister = findViewById(R.id.btnRegister);
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String myName = "ssuart";
                String address = "yogichok";

                Intent i = new Intent(MainActivity.this, RegisterActivity.class);
                i.putExtra("name",myName);
                i.putExtra("address",address);
                startActivity(i);
            }
        });

    }
}