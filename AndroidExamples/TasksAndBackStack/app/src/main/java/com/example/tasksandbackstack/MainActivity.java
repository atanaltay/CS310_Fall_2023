package com.example.tasksandbackstack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    //Action Bar is enabled at resources/themes
    //Parent activities are set in AndroidManifest.xml
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        //getSupportActionBar().setTitle("Home");
        setContentView(R.layout.activity_main);
        Button btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener(v->{

            Intent i = new Intent(MainActivity.this,Activity2.class);
            startActivity(i);

        });


        Button btnBack = findViewById(R.id.btnbackmain);
        btnBack.setOnClickListener(v->{
            finish();
        });

        getSupportActionBar().setTitle("Home");

    }
}