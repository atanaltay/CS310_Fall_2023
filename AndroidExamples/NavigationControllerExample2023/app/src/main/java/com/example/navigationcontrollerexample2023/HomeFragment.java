package com.example.navigationcontrollerexample2023;

import android.os.Bundle;


import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.navigationcontrollerexample2023.databinding.FragmentHomeBinding;


public class HomeFragment extends Fragment {

    FragmentHomeBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(getActivity().getLayoutInflater(),container,false);

        binding.btnFragment2.setOnClickListener(v->{

             NavController navController =
                     Navigation.findNavController(getActivity(),R.id.fragmentContainerView);


             navController.navigate(R.id.action_homeFragment_to_fragment2);




        });

        PersonViewModel viewModel = new ViewModelProvider(getActivity()).get(PersonViewModel.class);

        viewModel.getPersonData().observe(getActivity(),person->{
            String output = person.getName() + " " + person.getLastName();
            binding.txtSummaryHome.setText(output);
        });





        return binding.getRoot();
    }
}