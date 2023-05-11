package com.example.beginnersgymapp;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.jar.Attributes;

public class Profile extends Fragment {



    TextView AGE,HEIGHT,WEIGHT;
    CardView cardView;

    ImageView imageView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        // return inflater.inflate(R.layout.fragment_profile, container, false);
        View view = inflater.inflate(R.layout.fragment_profile, container, false);


        AGE=view.findViewById(R.id.AGE);
        HEIGHT=view.findViewById(R.id.HEIGHT);
        WEIGHT=view.findViewById(R.id.WEIGHT);


        imageView = view.findViewById(R.id.setting99);


        cardView = view.findViewById(R.id.CV1);


        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Setting_Edit_Profile setting_edit_profile = new Setting_Edit_Profile();
                setting_edit_profile.show(getChildFragmentManager(), setting_edit_profile.getTag());

            }
        });


        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Fragment secondfragment = new BMI_Result();
                FragmentTransaction fm = getActivity().getSupportFragmentManager().beginTransaction();
                fm.replace(R.id.FL1, secondfragment).addToBackStack(null).commit();

                //
                Toast.makeText(getActivity(), "hi", Toast.LENGTH_SHORT).show();


            }
        });


        return view;



        ///////





//        SharedPreferences sharedPreferences;
//        sharedPreferences = getActivity().getSharedPreferences("SharedPreferences", Context.MODE_PRIVATE);
//        AGE.setText(sharedPreferences.getString("ET11",""));
//        WEIGHT.setText(sharedPreferences.getString("ET12",""));
//        HEIGHT.setText((sharedPreferences.getString("ET13","")));





    }
}