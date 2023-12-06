package com.example.tasksandbackstack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        //getSupportActionBar().setTitle("Activity 2");
        Button btn2 = findViewById(R.id.btn2);
        btn2.setOnClickListener(v->{

            Intent i = new Intent(Activity2.this,Activity3.class);
            startActivity(i);

        });
        getSupportActionBar().setTitle("Activity 2");

    }
}