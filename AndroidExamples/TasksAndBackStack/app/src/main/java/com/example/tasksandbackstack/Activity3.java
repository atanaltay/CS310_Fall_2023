package com.example.tasksandbackstack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

public class Activity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        //getSupportActionBar().setTitle("Activity 3");

        Button btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(v->{
            finish();
        });

        Button btnRestart = findViewById(R.id.btnRestart);

        btnRestart.setOnClickListener(v->{
            Intent i = new Intent(Activity3.this,Activity3.class);
            i.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
            startActivity(i);
        });

        Button btnHome = findViewById(R.id.btnHome);

        btnHome.setOnClickListener(v->{
            Intent i = new Intent(Activity3.this,MainActivity.class);
            i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(i);
        });

        getSupportActionBar().setTitle("Activity 3");
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.i("DEV","-----------ON NEW INTENT------------");
    }
}