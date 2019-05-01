package com.example.hospitalapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.Spinner;
import java.util.ArrayList;
import java.util.List;

public class DoctorNutritional extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    // spinner, dropdown menu
    Spinner aboutUsSpinner;
    // button variables, 1 each for navigation buttons
    private ImageButton homeBtn, doctorsBtn, servicesBtn, visitBtn, billsBtn, emailBtn, aboutBtn, careersBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.doctor_nutritional);

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

        //set spinner to spinner in layout
        aboutUsSpinner = (Spinner) findViewById(R.id.spinner1);
        //listener on this spinner
        aboutUsSpinner.setOnItemSelectedListener(this);

        //build array for spinner
        List<String> categories = new ArrayList<String>();
        categories.add("Make Selection");
        categories.add("Bariatric");
        categories.add("Cancer");
        categories.add("Diabetes");
        categories.add("Diagnostic Imaging");
        categories.add("Emergency Services");
        categories.add("Endovascular");
        categories.add("Gastroenterology");
        categories.add("Kidney Transplant");
        categories.add("Nutritional Support");
        categories.add("Substance Abuse Treatment");

        //adapter load array into spinner
        ArrayAdapter<String> aboutUsAdapter = new ArrayAdapter<String>(this, R.layout.spinner_text,categories);
        aboutUsAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        aboutUsSpinner.setAdapter(aboutUsAdapter);
    }

    @Override
    // method takes paramater(position of the index of array item user selected)
    // and starts activity based on user selection
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        if (position == 1){
            Intent newActivity = new Intent(view.getContext(), DoctorBiriatric.class);
            startActivity(newActivity);
        }
        if (position == 2){
            Intent newActivity = new Intent(view.getContext(), DoctorCancer.class);
            startActivity(newActivity);
        }
        if (position == 3){
            Intent newActivity = new Intent(view.getContext(), DoctorDiabetes.class);
            startActivity(newActivity);
        }
        if (position == 4){
            Intent newActivity = new Intent(view.getContext(), DoctorDiagnostic.class);
            startActivity(newActivity);
        }
        if (position == 5){
            Intent newActivity = new Intent(view.getContext(), DoctorEmergency.class);
            startActivity(newActivity);
        }
        if (position == 6){
            Intent newActivity = new Intent(view.getContext(), DoctorEndovscular.class);
            startActivity(newActivity);
        }
        if (position == 7){
            Intent newActivity = new Intent(view.getContext(), DoctorGastroenterology.class);
            startActivity(newActivity);
        }
        if (position == 8){
            Intent newActivity = new Intent(view.getContext(), DoctorKidney.class);
            startActivity(newActivity);
        }
        if (position == 9){
            Intent newActivity = new Intent(view.getContext(), DoctorNutritional.class);
            startActivity(newActivity);
        }
        if (position == 10){
            Intent newActivity = new Intent(view.getContext(), DoctorSubstanceAbuse.class);
            startActivity(newActivity);
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> arg0) {

    }
}
