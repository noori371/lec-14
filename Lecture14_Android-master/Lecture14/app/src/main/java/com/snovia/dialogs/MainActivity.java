package com.snovia.dialogs;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button= findViewById(R.id.btnDialog);
    }

    public void showDialog(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);

        builder.setTitle("Dialog Title");
        builder.setMessage("It is message of my Dialog");

        builder.setCancelable(false);

        LayoutInflater inflater = this.getLayoutInflater();
        builder.setView(inflater.inflate(R.layout.my_new_dialog,null));

        builder.setPositiveButton("Positive",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this, "Positive Button was Clicked", Toast.LENGTH_LONG).show();
                    }
                }
        );

        builder.setNegativeButton("Negative",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this, "Negative Button was Clicked", Toast.LENGTH_LONG).show();

                    }
                }

        );

        AlertDialog alertDialog = builder.create();
        alertDialog.show();

    }
}