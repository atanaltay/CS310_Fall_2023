package com.example.navigationcontrollerexample2023;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.navigationcontrollerexample2023.databinding.FragmentSummaryBinding;


public class SummaryFragment extends Fragment {

    FragmentSummaryBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding =FragmentSummaryBinding.inflate(getLayoutInflater());



        binding.btnBackSummary.setOnClickListener(v->{

            NavController navController = Navigation.findNavController(getActivity(),R.id.fragmentContainerView);

            navController.popBackStack();

        });

        binding.btnHomeSummary.setOnClickListener(v->{
            NavController navController = Navigation.findNavController(getActivity(),R.id.fragmentContainerView);

            navController.navigate(R.id.homeFragment);

        });

        //Person  p =  (Person)getArguments().getSerializable("person");

        PersonViewModel viewModel = new ViewModelProvider(getActivity()).get(PersonViewModel.class);

        viewModel.getPersonData().observe(getActivity(),person->{
            binding.txtNameOut.setText(person.getName());
            binding.txtLastNameOut.setText(person.getLastName());
        });



        return binding.getRoot();
    }
}