package com.example.beginnersgymapp;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class Setting_Edit_Profile extends BottomSheetDialogFragment {


    EditText ETname, ETage, ETweight, ETheightinfeet, EThieghtininch;
    Button button98;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_setting__edit__profile, container, false);

        ETname = view.findViewById(R.id.ETname);
        ETage = view.findViewById(R.id.ETage);
        ETweight = view.findViewById(R.id.ETweight);
        ETheightinfeet = view.findViewById(R.id.ETheightinfeet);
        EThieghtininch = view.findViewById(R.id.ETheightininch);
        button98 = view.findViewById(R.id.BTNsave98);






        button98.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                SharedPreferences sharedPreferences= getActivity().getSharedPreferences("SharedPreferences", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor=sharedPreferences.edit();
                editor.putString("ET11",ETname.getText().toString());
                editor.putString("ET12",ETage.getText().toString());
                editor.putString("ET13",ETweight.getText().toString());
//                editor.putString("ET14",ETheightinfeet.getText().toString());
//                editor.putString("ET15",EThieghtininch.getText().toString());
                editor.apply();
                Toast.makeText(getActivity(), "Saved", Toast.LENGTH_SHORT).show();

            //    SharedPreferences sharedPreferences=getSharedPreferences("sharedpreferance",MODE_PRIVATE);
            //    SharedPreferences.Editor editor=sharedPreferences.edit();
               // editor.putString("text",binding.tv1.getText().toString());
              //  editor.putBoolean("switch",binding.switch1.isChecked());
              //  editor.apply();




            }
        });
        return view;








    }
}