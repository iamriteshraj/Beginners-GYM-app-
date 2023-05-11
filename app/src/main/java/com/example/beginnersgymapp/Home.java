package com.example.beginnersgymapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Home extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    Workout workout = new Workout();
    Records records = new Records();
    Bmi bmi = new Bmi();
    Profile profile = new Profile();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);





        bottomNavigationView = findViewById(R.id.BNV1);
        getSupportFragmentManager().beginTransaction().replace(R.id.FL1,workout).commit();

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {


                if (item.getItemId() == R.id.ITEM1) {


                    getSupportFragmentManager().beginTransaction().replace(R.id.FL1, workout).commit();
                    return true;

                } else if (item.getItemId() == R.id.ITEM2) {

                    getSupportFragmentManager().beginTransaction().replace(R.id.FL1, records).commit();
                    return true;


                } else if (item.getItemId() == R.id.ITEM3) {

                    getSupportFragmentManager().beginTransaction().replace(R.id.FL1, bmi).commit();
                    return true;
                } else if (item.getItemId() == R.id.ITEM4) {


                    getSupportFragmentManager().beginTransaction().replace(R.id.FL1, profile).commit();
                    return true;
                }

                return false;

            }
        });


    }
}
