package com.example.activityexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //view initialization
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("DEV","----------ON CREATE CALLED----------");

        TextView txtWelcome =  findViewById(R.id.txtWelcome);
        txtWelcome.setText("Dummy App");

        Spinner spCities = findViewById(R.id.spCities);

        //ArrayAdapter

        ArrayAdapter<String> adp
                = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1);


        adp.add("ISTANBUL");
        adp.add("ANKARA");
        adp.add("IZMIR");
        adp.add("BURSA");

        spCities.setAdapter(adp);



    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("DEV","----------ON START CALLED----------");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.i("DEV","----------ON RESUME CALLED----------");

    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.i("DEV","----------ON PAUSE CALLED----------");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("DEV","----------ON STOP CALLED----------");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("DEV","----------ON DESTROY CALLED----------");


    }
}