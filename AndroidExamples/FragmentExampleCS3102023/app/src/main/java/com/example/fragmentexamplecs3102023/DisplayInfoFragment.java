package com.example.fragmentexamplecs3102023;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fragmentexamplecs3102023.databinding.FragmentDisplayInfoBinding;
import com.example.fragmentexamplecs3102023.databinding.FragmentSecondBinding;

public class DisplayInfoFragment extends Fragment {

    FragmentDisplayInfoBinding binding;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentDisplayInfoBinding.inflate(getLayoutInflater());

        String name = getArguments().getString("name");
        binding.txtOutput.setText(name);


        return binding.getRoot();
    }



}