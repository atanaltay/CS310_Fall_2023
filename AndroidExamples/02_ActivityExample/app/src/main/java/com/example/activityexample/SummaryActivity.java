package com.example.activityexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SummaryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);

        TextView txtName = findViewById(R.id.txtNameSummary);
        TextView txtCity = findViewById(R.id.txtCitySummary);

       String name = getIntent().getStringExtra("name");
        String city = getIntent().getStringExtra("city");


        txtName.setText(name);
        txtCity.setText(city);

    }
}