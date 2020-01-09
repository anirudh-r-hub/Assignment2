package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class activity2 extends AppCompatActivity {
    TextView show_name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2);
        show_name=(TextView)findViewById(R.id.show_name);
        Bundle bundle= getIntent().getExtras();
        String name=bundle.getString("name");
        show_name.setText(name);

    }
}
