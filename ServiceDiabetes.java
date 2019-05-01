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

public class ServiceDiabetes extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner medicalServicesSpinner;
    ImageButton homeBtn, doctorsBtn, servicesBtn, visitBtn, billsBtn, emailBtn, aboutBtn, careersBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.service_diabetes);

        homeBtn = (ImageButton) findViewById(R.id.home);
        homeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newActivity = new Intent(v.getContext(), MainActivity.class);
                finish();
                startActivity(newActivity);
            }
        });

        doctorsBtn = (ImageButton) findViewById(R.id.doctors);
        doctorsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newActivity = new Intent(v.getContext(), DoctorsNearYou_Placeholder.class);
                finish();
                startActivity(newActivity);
            }
        });

        servicesBtn = (ImageButton) findViewById(R.id.services);
        servicesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newActivity = new Intent(v.getContext(), MedicalServices.class);
                finish();
                startActivity(newActivity);
            }
        });

        visitBtn = (ImageButton) findViewById(R.id.visit);
        visitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newActivity = new Intent(v.getContext(), PatientsAndVisitors_Placeholder.class);
                finish();
                startActivity(newActivity);
            }
        });

        billsBtn = (ImageButton) findViewById(R.id.bills);
        billsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newActivity = new Intent(v.getContext(), PayYourBill_Placeholder.class);
                finish();
                startActivity(newActivity);
            }
        });

        emailBtn = (ImageButton) findViewById(R.id.email);
        emailBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newActivity = new Intent(v.getContext(), ContactUs_Placeholder.class);
                finish();
                startActivity(newActivity);
            }
        });

        aboutBtn = (ImageButton) findViewById(R.id.about);
        aboutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newActivity = new Intent(v.getContext(), AboutUs.class);
                finish();
                startActivity(newActivity);
            }
        });

        careersBtn = (ImageButton) findViewById(R.id.careers);
        careersBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newActivity = new Intent(v.getContext(), Careers_Placeholder.class);
                finish();
                startActivity(newActivity);
            }
        });


        medicalServicesSpinner = (Spinner) findViewById(R.id.spinner1);

        medicalServicesSpinner.setOnItemSelectedListener(this);

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

        ArrayAdapter<String> medicalServicesAdapter = new ArrayAdapter<String>(this, R.layout.spinner_text,categories);

        medicalServicesAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        medicalServicesSpinner.setAdapter(medicalServicesAdapter);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        if (position == 1){
            Intent newActivity = new Intent(view.getContext(), ServiceBariatric.class);
            startActivity(newActivity);
        }
        if (position == 2){
            Intent newActivity = new Intent(view.getContext(), ServiceCancer.class);
            startActivity(newActivity);
        }
        if (position == 3){
            Intent newActivity = new Intent(view.getContext(), ServiceDiabetes.class);
            startActivity(newActivity);
        }
        if (position == 4){
            Intent newActivity = new Intent(view.getContext(), ServiceDiagnostic.class);
            startActivity(newActivity);
        }
        if (position == 5){
            Intent newActivity = new Intent(view.getContext(), ServiceEmergency.class);
            startActivity(newActivity);
        }
        if (position == 6){
            Intent newActivity = new Intent(view.getContext(), ServiceEndovascular.class);
            startActivity(newActivity);
        }
        if (position == 7){
            Intent newActivity = new Intent(view.getContext(), ServiceGastroenterology.class);
            startActivity(newActivity);
        }
        if (position == 8){
            Intent newActivity = new Intent(view.getContext(), ServiceKidney.class);
            startActivity(newActivity);
        }
        if (position == 9){
            Intent newActivity = new Intent(view.getContext(), ServiceNutritional.class);
            startActivity(newActivity);
        }
        if (position == 10){
            Intent newActivity = new Intent(view.getContext(), ServiceSubstanceAbuse.class);
            startActivity(newActivity);
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> arg0) {

    }
}
