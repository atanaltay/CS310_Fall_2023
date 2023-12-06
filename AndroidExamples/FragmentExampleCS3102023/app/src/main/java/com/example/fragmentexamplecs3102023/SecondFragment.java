package com.example.fragmentexamplecs3102023;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

import com.example.fragmentexamplecs3102023.databinding.FragmentSecondBinding;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SecondFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SecondFragment extends Fragment {

    FragmentSecondBinding binding;

    interface DisplayInfoListener{
        public void nameEntered(String name);
    }

    DisplayInfoListener listener;

    public void setListener(DisplayInfoListener listener) {
        this.listener = listener;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSecondBinding.inflate(getLayoutInflater());
        EditText txtName = binding.txtName;

        binding.btnShowInfo.setOnClickListener(v->{

            //Toast.makeText(getActivity(), "Name: " + txtName.getText().toString(),
             //       Toast.LENGTH_SHORT).show();

            listener.nameEntered(txtName.getText().toString());


        });


        return binding.getRoot();
    }
}