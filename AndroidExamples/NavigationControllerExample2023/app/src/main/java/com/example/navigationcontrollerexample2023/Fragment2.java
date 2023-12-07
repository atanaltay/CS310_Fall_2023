package com.example.navigationcontrollerexample2023;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.navigationcontrollerexample2023.databinding.FragmenttwoBinding;


public class Fragment2 extends Fragment {

    FragmenttwoBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmenttwoBinding.inflate(getLayoutInflater());

        binding.btnBackFragment2.setOnClickListener(v->{

            NavController navController = Navigation.findNavController(getActivity(),R.id.fragmentContainerView);

            navController.popBackStack();

        });

        binding.btnShowData.setOnClickListener(v->{


            Person p = new Person(binding.txtName.getText().toString(),
                    binding.txtLastname.getText().toString());

            PersonViewModel personModel = new ViewModelProvider(getActivity()).get(PersonViewModel.class);


            personModel.setPersonData(p);



            /*
            Bundle bundle = new Bundle();
            bundle.putSerializable("person",p);
            */
            NavController navController= Navigation.findNavController(getActivity(),R.id.fragmentContainerView);

            //navController.navigate(R.id.action_fragment2_to_summaryFragment,bundle);

            navController.navigate(R.id.action_fragment2_to_summaryFragment);

        });



        return binding.getRoot();
    }
}