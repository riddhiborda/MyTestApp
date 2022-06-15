package com.example.instagramproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

Spinner sp;

SeekBar seekbar;
EditText edtFirstname;
Button btnProgressshow,btnProgresshide;
ProgressBar progressBar;
    String[] countryNames={"India","China","Australia","Portugle","America","New Zealand"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        initView();

        initView2();

    }

    private void initView2() {

        seekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                Log.e("TAG", "onProgressChanged: "+"onprogress changes   " +i );

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Log.e("TAG", "onStartTrackingTouch: "+"onStartTrackingTouch" );
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Log.e("TAG", "onStopTrackingTouch: "+"onStopTrackingTouch" );
            }
        });


        btnProgressshow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progressBar.setVisibility(View.VISIBLE);
            }
        });



        btnProgresshide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progressBar.setVisibility(View.INVISIBLE);
            }
        });

    }

    private void initView() {

        sp=findViewById(R.id.spinnerCity);
        seekbar=findViewById(R.id.seekbar);
        btnProgressshow=findViewById(R.id.btnProgress);
        btnProgresshide=findViewById(R.id.btnProgresshide);
        progressBar=findViewById(R.id.progressbar);
//        ArrayAdapter adapter=new ArrayAdapter(MainActivity2.this,R.layout.item_spinner,cityArray);
//        spinnerCity.setAdapter(adapter);



        MyAdapter adapter=new MyAdapter(MainActivity2.this,countryNames);
        sp.setAdapter(adapter);

    }






}