package com.example.activityexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

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


        Button btnOk = findViewById(R.id.btnOk);

        //Anonymous implementation of the event
        /*
        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        */


        //Lambda expression way of implementing an event
        /*
        btnOk.setOnClickListener(v->{

            Toast.makeText(MainActivity.this,"Button is clicked!",
                    Toast.LENGTH_SHORT).show();


        });
        */

        TextView txtOut = findViewById(R.id.txtOutput);
        TextView txtName = findViewById(R.id.txtName);
        btnOk.setOnClickListener(v -> {

            String output ="Name:" + txtName.getText().toString()
                    + ", City: " + spCities.getSelectedItem().toString();

            txtOut.setText(output);


        });


        ConstraintLayout container = findViewById(R.id.container);

        container.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                String output = "X: " + event.getRawX() + ", Y:" + event.getRawY();

                Toast.makeText(MainActivity.this,
                        output, Toast.LENGTH_SHORT).show();

                return true;
            }
        });


        Button btnToSummary = findViewById(R.id.btnToSummary);

        btnToSummary.setOnClickListener(v->{

            Intent i = new Intent(MainActivity.this,
                    SummaryActivity.class);

            i.putExtra("name",txtName.getText().toString());
            i.putExtra("city",spCities.getSelectedItem().toString());


            startActivity(i);


        });




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