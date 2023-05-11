package com.example.beginnersgymapp;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;

public class View_Model_class_A extends ViewModel {

//    ArrayList<exercise_cardView_ModelClass> arrayList = new ArrayList<>();
    MutableLiveData<ArrayList<exercise_cardview_ModelClass>> userLiveData;
    ArrayList<exercise_cardview_ModelClass>   arrayList;

    public void MainViewModel() {
        userLiveData = new MutableLiveData<>();

        // call your Rest API in init method
        init();
    }

    public MutableLiveData<ArrayList<exercise_cardview_ModelClass>> getUserMutableLiveData(){
        return userLiveData;
    }

    public void init(){
        populateList();
        userLiveData.setValue(  arrayList);
    }

    public void populateList() {
//
//        User user = new User();
//        user.setTitle("Darknight");
//        user.setDescription("Best rating movie");

        arrayList = new ArrayList<>();
        arrayList.add(new exercise_cardview_ModelClass("Full Body", "25 Exercises"));
        arrayList.add(new exercise_cardview_ModelClass("Chest", "10 Exercises"));
        arrayList.add(new exercise_cardview_ModelClass("Triceps", "8 Exercises"));
        arrayList.add(new exercise_cardview_ModelClass("Back", "9 Exercises"));
        arrayList.add(new exercise_cardview_ModelClass("Biceps ", "7 Exercises"));
        arrayList.add(new exercise_cardview_ModelClass("Shoulder", "16 Exercises"));
        arrayList.add(new exercise_cardview_ModelClass(" Leg", "12  Exercises"));

    }




//
//
//    String exercise1 = " Full Body  ";
//    String exercise2 = " Chest ";
//    String exercise3 = " Triceps ";
//    String exercise4 = " Back  ";
//    String exercise5 = " Biceps  ";
//    String exercise6 = " Shoulder  ";
//    String exercise7 = " Leg  ";
//
//
//
//
//    String Total_NO_exercise1= "25 Exercises";
//    String Total_NO_exercise2= "10 Exercises";
//    String Total_NO_exercise3= "8 Exercises";
//    String Total_NO_exercise4= "9 Exercises";
//    String Total_NO_exercise5= " 7 Exercises";
//    String Total_NO_exercise6= "16 Exercises";
//    String Total_NO_exercise7= "12  Exercises";



}
