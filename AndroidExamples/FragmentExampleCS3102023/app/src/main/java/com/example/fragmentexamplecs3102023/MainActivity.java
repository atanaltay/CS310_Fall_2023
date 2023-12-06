package com.example.fragmentexamplecs3102023;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.Toast;

import com.example.fragmentexamplecs3102023.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());


        setContentView(binding.getRoot());

        SecondFragment secondFragment = new SecondFragment();
        DisplayInfoFragment displayInfoFragment = new DisplayInfoFragment();
        HomeFragment homeFragment = new HomeFragment(time->{
           // Toast.makeText(MainActivity.this, "Button clicked at " + time, Toast.LENGTH_SHORT).show();
            secondFragment.setListener(name->{

                Bundle bundle = new Bundle();
                bundle.putString("name",name);
                displayInfoFragment.setArguments(bundle);

                FragmentTransaction trans = getSupportFragmentManager().beginTransaction();
                trans.replace(R.id.container,displayInfoFragment);
                trans.commit();
                trans.addToBackStack("");

            });

            FragmentTransaction trans = getSupportFragmentManager().beginTransaction();
            trans.replace(R.id.container,secondFragment);
            trans.commit();
            trans.addToBackStack("");


        });

         FragmentTransaction trans = getSupportFragmentManager().beginTransaction();

        trans.add(R.id.container,homeFragment);
        trans.commit();
        trans.addToBackStack("");












    }
}