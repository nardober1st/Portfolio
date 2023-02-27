package com.bernardooechsler.bernardosandroidportfolio;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView list = findViewById(R.id.recycler_view_projects);

        Project[] projects = {
                new Project("Bernardo's Quote", "A simple layout app with a motivational quote", R.drawable.image_quote),
                new Project("BMI Calculator", "A real life working BMI calculator teaching me Variables, Methods and Conditional Logic", R.drawable.image_calculator),
                new Project("Inches Converter", "A basic converter to convert inches to meters", R.drawable.image_tape),
                new Project("The Hungry Developer", "A menu app for a fictional restaurant, learning about Activities, Classes & Objects, Arrays, Intents and List Views", R.drawable.image_hungry_developer)
        };

        ProjectsAdapter adapter = new ProjectsAdapter(projects);

        list.setAdapter(adapter);
    }
}