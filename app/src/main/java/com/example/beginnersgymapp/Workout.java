package com.example.beginnersgymapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;


public class Workout extends Fragment implements RecyclerViewInterface{

    ArrayList<exercise_cardview_ModelClass> arrayList = new ArrayList<>();
    RecyclerView recyclerView;

    View_Model_class_A view_model_class_a;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_workout, container, false);

        recyclerView = view.findViewById(R.id.RV001);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

//
//        arrayList.add(new exercise_cardview_ModelClass(view_model_class_a.exercise1, view_model_class_a.Total_NO_exercise1));
//        arrayList.add(new exercise_cardview_ModelClass(view_model_class_a.exercise2, view_model_class_a.Total_NO_exercise2));
//        arrayList.add(new exercise_cardview_ModelClass(view_model_class_a.exercise3, view_model_class_a.Total_NO_exercise3));
//        arrayList.add(new exercise_cardview_ModelClass(view_model_class_a.exercise4, view_model_class_a.Total_NO_exercise4));
//        arrayList.add(new exercise_cardview_ModelClass(view_model_class_a.exercise5, view_model_class_a.Total_NO_exercise5));
//        arrayList.add(new exercise_cardview_ModelClass(view_model_class_a.exercise6, view_model_class_a.Total_NO_exercise6));
//        arrayList.add(new exercise_cardview_ModelClass(view_model_class_a.exercise7, view_model_class_a.Total_NO_exercise7));
//


        arrayList.clear();
        arrayList.add(new exercise_cardview_ModelClass("Full Body", "23 Exercises"));
        arrayList.add(new exercise_cardview_ModelClass("Chest", "10 Exercises"));
        arrayList.add(new exercise_cardview_ModelClass("Triceps", "6 Exercises"));
        arrayList.add(new exercise_cardview_ModelClass("Back", "7 Exercises"));
        arrayList.add(new exercise_cardview_ModelClass("Biceps", "10 Exercises"));
        arrayList.add(new exercise_cardview_ModelClass("Shoulder", "8 Exercises"));
        arrayList.add(new exercise_cardview_ModelClass("Leg", "6 Exercises"));


        AdapterClass_for_Workout adapter = new AdapterClass_for_Workout(getContext(), arrayList,this::onItemClick);
        recyclerView.setAdapter(adapter);
        return view;

    }

    @Override
    public void onItemClick(int position) {


      if (position==0)
      {


          Fragment secondfragment = new FULL_BODY_KWORKOUT_A();
          FragmentTransaction fm = getActivity().getSupportFragmentManager().beginTransaction();
          fm.replace(R.id.FL1, secondfragment).addToBackStack(null).commit();


      }
        if (position==1)
        {


            Fragment secondfragment = new CHEST_WORKOUT_A();
            FragmentTransaction fm = getActivity().getSupportFragmentManager().beginTransaction();
            fm.replace(R.id.FL1, secondfragment).addToBackStack(null).commit();


        }

        if (position==2)
        {


            Fragment secondfragment = new TRICEPS_WORKOUT_A();
            FragmentTransaction fm = getActivity().getSupportFragmentManager().beginTransaction();
            fm.replace(R.id.FL1, secondfragment).addToBackStack(null).commit();


        }

        if (position==3)
        {


            Fragment secondfragment = new BACK_WORKOUT_A();
            FragmentTransaction fm = getActivity().getSupportFragmentManager().beginTransaction();
            fm.replace(R.id.FL1, secondfragment).addToBackStack(null).commit();


        }

        if (position==4)
        {


            Fragment secondfragment = new BICEPS_WORKOUT_A();
            FragmentTransaction fm = getActivity().getSupportFragmentManager().beginTransaction();
            fm.replace(R.id.FL1, secondfragment).addToBackStack(null).commit();


        }

        if (position==5)
        {


            Fragment secondfragment = new SHOULDER_WORKOUT_A();
            FragmentTransaction fm = getActivity().getSupportFragmentManager().beginTransaction();
            fm.replace(R.id.FL1, secondfragment).addToBackStack(null).commit();


        }

        if (position==6)
        {


            Fragment secondfragment = new LEG_WORKOUT_A();
            FragmentTransaction fm = getActivity().getSupportFragmentManager().beginTransaction();
            fm.replace(R.id.FL1, secondfragment).addToBackStack(null).commit();


        }






    }
}