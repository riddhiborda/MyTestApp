package com.example.instagramproject;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Toast;

public class AlertDialogfActivity extends AppCompatActivity {
    AppCompatButton btnCLick, btnSingleChoice,btnMultiChoice,btnCustomeDialog;

    String[] list = new String[4];
    boolean[] selectedItemList=new boolean[4];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_dialogf);

        initView();


    }

    private void initView() {
        btnCLick = findViewById(R.id.btnCLick);
        btnSingleChoice = findViewById(R.id.btnSingleChoice);
        btnMultiChoice = findViewById(R.id.btnMultiChoice);
        btnCustomeDialog = findViewById(R.id.btnCustomeDialog);
        btnCLick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialog();
            }
        });

        btnSingleChoice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openSingleChoiceDialog();
            }
        });

        btnMultiChoice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMultiChoiceDialog();
            }
        });


        btnCustomeDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opencustomeDialog();
            }
        });

    }

    private void opencustomeDialog() {
        Dialog d=new Dialog(AlertDialogfActivity.this);
        d.requestWindowFeature(Window.FEATURE_NO_TITLE);
        d.setContentView(R.layout.dialog_error);
        d.show();

    }

    private void openMultiChoiceDialog() {

        list[0] = "Pizza";
        list[1] = "Burger";
        list[2] = "Dhosa";
        list[3] = "Sandwich";

        selectedItemList[0]=true;
        selectedItemList[1]=false;
        selectedItemList[2]=false;
        selectedItemList[3]=true;

        AlertDialog.Builder dialog=new AlertDialog.Builder(AlertDialogfActivity.this);
        dialog.setTitle("Multi Choice Dialog");
        dialog.setMultiChoiceItems(list, selectedItemList, new DialogInterface.OnMultiChoiceClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i, boolean b) {

                Log.e("TAG", "onClick: "+list[i] + " ==>" + b );
            }
        });
        dialog.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });

        dialog.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        dialog.show();


    }

    private void openSingleChoiceDialog() {

        list[0] = "Pizza";
        list[1] = "Burger";
        list[2] = "Dhosa";
        list[3] = "Sandwich";

        AlertDialog.Builder dialog = new AlertDialog.Builder(AlertDialogfActivity.this);

        dialog.setTitle("Select Item");
        dialog.setSingleChoiceItems(list, 0, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                Log.e("TAG", "onClick: " + list[i]);

            }
        });

        dialog.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });

        dialog.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        dialog.show();


    }


    public void openDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(AlertDialogfActivity.this);

        builder.setTitle("Login Alert");
        builder.setMessage("Are you sure you want to continue?");


        builder.setPositiveButton("yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                Toast.makeText(AlertDialogfActivity.this, "yes button click", Toast.LENGTH_SHORT).show();
            }
        });

        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(AlertDialogfActivity.this, "no button click", Toast.LENGTH_SHORT).show();
            }
        });

        builder.setNeutralButton("Remind me later", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(AlertDialogfActivity.this, "netrusl button button click", Toast.LENGTH_SHORT).show();
            }
        });

        AlertDialog d = builder.create();
        d.setCancelable(false);
        d.show();

    }
}