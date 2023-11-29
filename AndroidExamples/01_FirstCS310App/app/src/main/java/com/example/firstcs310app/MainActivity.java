package com.example.firstcs310app;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Entry point to an activity
        //1) Load the layout
        //2) Interact with UI components

        setContentView(R.layout.layout_main_activity);

        TextView txtHello = findViewById(R.id.txtWelcome);

        txtHello.setText("Hello World!!");

    }
}
