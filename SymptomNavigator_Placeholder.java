package com.example.hospitalapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class SymptomNavigator_Placeholder extends AppCompatActivity {

    // button variables, 1 each for navigation buttons
    private ImageButton homeBtn, doctorsBtn, servicesBtn, visitBtn, billsBtn, emailBtn, aboutBtn, careersBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_symptom_navigator__placeholder);

        //var set to xml id
        homeBtn = (ImageButton) findViewById(R.id.home);
        homeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            //when this button clicked, go to new activity
            public void onClick(View v) {
                Intent newActivity = new Intent(v.getContext(), MainActivity.class);
                finish();
                startActivity(newActivity);
            }
        });

        //var set to xml id
        doctorsBtn = (ImageButton) findViewById(R.id.doctors);
        doctorsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            //when this button clicked, go to new activity
            public void onClick(View v) {
                Intent newActivity = new Intent(v.getContext(), DoctorsNearYou_Placeholder.class);
                finish();
                startActivity(newActivity);
            }
        });

        //var set to xml id
        servicesBtn = (ImageButton) findViewById(R.id.services);
        servicesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            //when this button clicked, go to new activity
            public void onClick(View v) {
                Intent newActivity = new Intent(v.getContext(), MedicalServices.class);
                finish();
                startActivity(newActivity);
            }
        });

        //var set to xml id
        visitBtn = (ImageButton) findViewById(R.id.visit);
        visitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            //when this button clicked, go to new activity
            public void onClick(View v) {
                Intent newActivity = new Intent(v.getContext(), PatientsAndVisitors_Placeholder.class);
                finish();
                startActivity(newActivity);
            }
        });

        //var set to xml id
        billsBtn = (ImageButton) findViewById(R.id.bills);
        billsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            //when this button clicked, go to new activity
            public void onClick(View v) {
                Intent newActivity = new Intent(v.getContext(), PayYourBill_Placeholder.class);
                finish();
                startActivity(newActivity);
            }
        });

        //var set to xml id
        emailBtn = (ImageButton) findViewById(R.id.email);
        emailBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            //when this button clicked, go to new activity
            public void onClick(View v) {
                Intent newActivity = new Intent(v.getContext(), ContactUs_Placeholder.class);
                finish();
                startActivity(newActivity);
            }
        });

        //var set to xml id
        aboutBtn = (ImageButton) findViewById(R.id.about);
        aboutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            //when this button clicked, go to new activity
            public void onClick(View v) {
                Intent newActivity = new Intent(v.getContext(), AboutUs.class);
                finish();
                startActivity(newActivity);
            }
        });

        //var set to xml id
        careersBtn = (ImageButton) findViewById(R.id.careers);
        careersBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            //when this button clicked, go to new activity
            public void onClick(View v) {
                Intent newActivity = new Intent(v.getContext(), Careers_Placeholder.class);
                finish();
                startActivity(newActivity);
            }
        });

    }
}
