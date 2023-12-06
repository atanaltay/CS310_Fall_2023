package com.example.fragmentexamplecs3102023;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.fragmentexamplecs3102023.databinding.FragmenthomelayoutBinding;

import java.time.LocalDateTime;

public class HomeFragment extends Fragment {


    interface HomeFragmentListener{

        public void secondFragmentButtonClicked(LocalDateTime time);

    }

    HomeFragmentListener listener;

    FragmenthomelayoutBinding binding;


    public HomeFragment(HomeFragmentListener listener){
        this.listener = listener;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        //View root = inflater.inflate(R.layout.fragmenthomelayout,container,false);
        //Button btn1 = root.findViewById(R.id.btn1);


        binding = FragmenthomelayoutBinding.inflate(getLayoutInflater());

        binding.btn1.setOnClickListener(v->{
            //Toast.makeText(getActivity(), "Button clicked",
             //       Toast.LENGTH_SHORT).show();

            listener.secondFragmentButtonClicked(LocalDateTime.now());

        });


        return binding.getRoot();
    }
}
