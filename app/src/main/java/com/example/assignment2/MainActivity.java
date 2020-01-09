package com.example.assignment2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "main activity";
    EditText name_field;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name_field=(EditText)findViewById(R.id.name_field);

        submit=(Button)findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Intent intent=new Intent(getApplicationContext(),activity2.class);
                //startActivity(intent);
                intent.putExtra("name",name_field.getText().toString());
                //startActivity(intent);
                //don't use getApplicationContext()
                final AlertDialog.Builder dlgAlert=new AlertDialog.Builder(MainActivity.this);
                dlgAlert.setMessage("Do you want to go to next page");
                dlgAlert.setTitle("Success");
                dlgAlert.setPositiveButton("YES", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        startActivity(intent);
                        //dlgAlert.create().show();
                    }
                });
                dlgAlert.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                //dlgAlert.setCancelable(true);
                dlgAlert.show();
                Log.d(TAG,"on create");


            }
        });



    }
}
