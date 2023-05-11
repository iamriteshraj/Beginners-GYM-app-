package com.example.beginnersgymapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterClass_for_Workout extends RecyclerView.Adapter<AdapterClass_for_Workout.Viewholder> implements RecyclerViewInterface {

    private final RecyclerViewInterface recyclerViewInterface;
    Context context;
    ArrayList<exercise_cardview_ModelClass> arrayList;


    AdapterClass_for_Workout(Context context, ArrayList<exercise_cardview_ModelClass> arrayList, RecyclerViewInterface recyclerViewInterface) {
        this.context = context;
        this.arrayList = arrayList;
        this.recyclerViewInterface = recyclerViewInterface;
    }


    public AdapterClass_for_Workout.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.exercise_cardview, parent, false);
        Viewholder viewholder = new Viewholder(view,recyclerViewInterface);
        return viewholder;


    }


    @Override
    public void onBindViewHolder(@NonNull AdapterClass_for_Workout.Viewholder holder, int position) {


        holder.exerciseName.setText(arrayList.get(position).ExerciseName);
        holder.exerciseCount.setText(arrayList.get(position).TotalExercise);
    }


    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    @Override
    public void onItemClick(int position) {

    }


    public static class Viewholder extends RecyclerView.ViewHolder {

        TextView exerciseName;
        TextView exerciseCount;


        public Viewholder(@NonNull View itemView, RecyclerViewInterface recyclerViewInterface) {
            super(itemView);
            exerciseName = itemView.findViewById(R.id.workoutnames001);
            exerciseCount = itemView.findViewById(R.id.exercisecount001);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    if (recyclerViewInterface != null) {
                        int pos = getAdapterPosition();


                        if (pos != RecyclerView.NO_POSITION) {
                            recyclerViewInterface.onItemClick(pos);

                        }
                    }


                }
            });

        }
    }
}
