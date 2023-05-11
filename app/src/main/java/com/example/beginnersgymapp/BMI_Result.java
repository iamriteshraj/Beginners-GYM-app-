package com.example.beginnersgymapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link BMI_Result#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BMI_Result extends Fragment {


    EditText etweight;
    EditText etheight, etheight2;
    TextView tvresult;
    Button btncalculate;
    LinearLayout linearLayout;


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment BMI_Result.
     */
    // TODO: Rename and change types and number of parameters
    public static BMI_Result newInstance(String param1, String param2) {
        BMI_Result fragment = new BMI_Result();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    public BMI_Result() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_b_m_i__result, container, false);
        View view = inflater.inflate(R.layout.fragment_b_m_i__result, container, false);


        etweight = view.findViewById(R.id.et1);
        etheight2 = view.findViewById(R.id.et2);
        etheight = view.findViewById(R.id.et3);
        tvresult = view.findViewById(R.id.tv1);
        btncalculate = view.findViewById(R.id.btn1);
      // llmain = view.findViewById(R.id.llmain);
       // linearLayout=view.findViewById(R.id.llmain);


        btncalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int wt = Integer.parseInt(etweight.getText().toString());

                int ft = Integer.parseInt(etheight.getText().toString());

                int in = Integer.parseInt(etheight2.getText().toString());


                int totalIN = ft * 12 + in;
                double totalCm = totalIN * 2.53;


                double totalM = totalCm / 100;
                double bmi = wt / (totalM * totalM);


                if (bmi > 25) {

                    tvresult.setText("You are over weight");
                    //   llmain.setBackgroundColor(getResources().getColor(R.color.xred));


                } else if (bmi < 18) {
                    tvresult.setText(" You are under weight ");
                    //  llmain.setBackgroundColor(getResources().getColor(R.color.xyellow));


                } else {
                    tvresult.setText(" You are healthy");
                     //  llmain.setBackgroundColor(getResources().getColor(R.color.xgreen));

                }


            }


        });


        return view;
    }
}