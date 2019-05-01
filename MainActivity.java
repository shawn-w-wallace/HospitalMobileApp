package com.example.hospitalapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnGroupExpandListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ExpandableListView listView;
    private ExpandableListAdapter listAdapter;
    private List<String> listDataHeader;
    private HashMap<String, List<String>> listHash;
    private int lastExpandedPosition = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ExpandableListView)findViewById(R.id.lvExp);
        initData();
        listAdapter = new com.example.hospitalapp.ExpandableListAdapter(this,listDataHeader,listHash);
        listView.setAdapter(listAdapter);

        /*
        listView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
            }
        });

        listView.setOnGroupCollapseListener(new ExpandableListView.OnGroupCollapseListener() {
            }
        );
        */

        /*
           method takes paramater(position of the index of array item user selected) and starts
           activity based on user selection.  i = main menu tabs, i1 = sub menu tabs
        */
        listView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView viewGroup, View view, int i, int i1, long id) {

                if  (i1 == 0 && i == 0) {
                    Intent newActivity = new Intent(view.getContext(), Submenu_Placeholder.class);
                    finish();
                    startActivity(newActivity);
                }
                if  (i1 == 1 && i == 0) {
                    Intent newActivity = new Intent(view.getContext(), Submenu_Placeholder.class);
                    finish();
                    startActivity(newActivity);
                }
                if  (i1 == 2 && i == 0) {
                    Intent newActivity = new Intent(view.getContext(), Submenu_Placeholder.class);
                    finish();
                    startActivity(newActivity);
                }
                if  (i1 == 3 && i == 0) {
                    Intent newActivity = new Intent(view.getContext(), Submenu_Placeholder.class);
                    finish();
                    startActivity(newActivity);
                }
                if  (i1 == 4 && i == 0) {
                    Intent newActivity = new Intent(view.getContext(), SymptomNavigator_Placeholder.class);
                    finish();
                    startActivity(newActivity);
                }
                if  (i1 == 0 && i == 1) {
                    Intent newActivity = new Intent(view.getContext(), Submenu_Placeholder.class);
                    finish();
                    startActivity(newActivity);
                }
                if  (i1 == 1 && i == 1) {
                    Intent newActivity = new Intent(view.getContext(), Submenu_Placeholder.class);
                    finish();
                    startActivity(newActivity);
                }
                if  (i1 == 2 && i == 1) {
                    Intent newActivity = new Intent(view.getContext(), Submenu_Placeholder.class);
                    finish();
                    startActivity(newActivity);
                }
                if  (i1 == 3 && i == 1) {
                    Intent newActivity = new Intent(view.getContext(), Submenu_Placeholder.class);
                    finish();
                    startActivity(newActivity);
                }
                if  (i1 == 4 && i == 1) {
                    Intent newActivity = new Intent(view.getContext(), SymptomNavigator_Placeholder.class);
                    finish();
                    startActivity(newActivity);
                }
                if  (i1 == 0 && i == 2) {
                    Intent newActivity = new Intent(view.getContext(), Submenu_Placeholder.class);
                    finish();
                    startActivity(newActivity);
                }
                if  (i1 == 1 && i == 2) {
                    Intent newActivity = new Intent(view.getContext(), Submenu_Placeholder.class);
                    finish();
                    startActivity(newActivity);
                }
                if  (i1 == 2 && i == 2) {
                    Intent newActivity = new Intent(view.getContext(), Submenu_Placeholder.class);
                    finish();
                    startActivity(newActivity);
                }
                if  (i1 == 3 && i == 2) {
                    Intent newActivity = new Intent(view.getContext(), Submenu_Placeholder.class);
                    finish();
                    startActivity(newActivity);
                }
                if  (i1 == 4 && i == 2) {
                    Intent newActivity = new Intent(view.getContext(), SymptomNavigator_Placeholder.class);
                    finish();
                    startActivity(newActivity);
                }
                if  (i1 == 0 && i == 3) {
                    Intent newActivity = new Intent(view.getContext(), Submenu_Placeholder.class);
                    finish();
                    startActivity(newActivity);
                }
                if  (i1 == 1 && i == 3) {
                    Intent newActivity = new Intent(view.getContext(), Submenu_Placeholder.class);
                    finish();
                    startActivity(newActivity);
                }
                if  (i1 == 2 && i == 3) {
                    Intent newActivity = new Intent(view.getContext(), Submenu_Placeholder.class);
                    finish();
                    startActivity(newActivity);
                }
                if  (i1 == 3 && i == 3) {
                    Intent newActivity = new Intent(view.getContext(), Submenu_Placeholder.class);
                    finish();
                    startActivity(newActivity);
                }
                if  (i1 == 4 && i == 3) {
                    Intent newActivity = new Intent(view.getContext(), SymptomNavigator_Placeholder.class);
                    finish();
                    startActivity(newActivity);
                }
                if  (i1 == 0 && i == 4) {
                    Intent newActivity = new Intent(view.getContext(), DoctorsNearYou_Placeholder.class);
                    finish();
                    startActivity(newActivity);
                }
                if  (i1 == 0 && i == 5) {
                    Intent newActivity = new Intent(view.getContext(), MedicalServices.class);
                    finish();
                    startActivity(newActivity);
                }
                if  (i1 == 0 && i == 6) {
                    Intent newActivity = new Intent(view.getContext(), PatientsAndVisitors_Placeholder.class);
                    finish();
                    startActivity(newActivity);
                }
                if  (i1 == 0 && i == 7) {
                    Intent newActivity = new Intent(view.getContext(), Careers_Placeholder.class);
                    finish();
                    startActivity(newActivity);
                }
                if  (i1 == 0 && i == 8) {
                    Intent newActivity = new Intent(view.getContext(), PayYourBill_Placeholder.class);
                    finish();
                    startActivity(newActivity);
                }
                if  (i1 == 0 && i == 9) {
                    Intent newActivity = new Intent(view.getContext(), AboutUs.class);
                    finish();
                    startActivity(newActivity);
                }
                if  (i1 == 0 && i == 10){
                    Intent newActivity = new Intent(view.getContext(), ContactUs_Placeholder.class);
                    finish();
                    startActivity(newActivity);
                }
                return false;
            }
        });

        //closes open tab when new tab is opened
        listView.setOnGroupExpandListener(new OnGroupExpandListener() {
            @Override
            public void onGroupExpand(int i) {
                if (lastExpandedPosition != -1 && i != lastExpandedPosition) {
                    listView.collapseGroup(lastExpandedPosition);
                }
                lastExpandedPosition = i;
            }
        });
    }

    //generate and load data in to expandable list
    private void initData() {
        listDataHeader = new ArrayList<>();
        listHash = new HashMap<>();

        listDataHeader.add("Cardiac");
        listDataHeader.add("Orthopedic");
        listDataHeader.add("Neurosciences");
        listDataHeader.add("Cancer");
        listDataHeader.add("Find a Doctor");
        listDataHeader.add("Medical Services");
        listDataHeader.add("Patients and Visitors");
        listDataHeader.add("Careers");
        listDataHeader.add("Pay Your Bill");
        listDataHeader.add("About Us");
        listDataHeader.add("Contact Us");

        List<String> cardiac = new ArrayList<>();
        cardiac.add("Arrhythmia");
        cardiac.add("Cardiac Surgery");
        cardiac.add("Heart Failure");
        cardiac.add("Heart Disease");
        cardiac.add("Symptom Navigator");

        List<String> orthopedic = new ArrayList<>();
        orthopedic.add("Foot and Ankle");
        orthopedic.add("Hands");
        orthopedic.add("Knees");
        orthopedic.add("Spine");
        orthopedic.add("Symptom Navigator");

        List<String> neurosciences = new ArrayList<>();
        neurosciences.add("Back and Spine");
        neurosciences.add("Cerebral Vascular Disorders");
        neurosciences.add("Epilepsy");
        neurosciences.add("Multiple Sclerosis");
        neurosciences.add("Symptom Navigator");

        List<String> cancer = new ArrayList<>();
        cancer.add("Types of Cancer");
        cancer.add("Preventing Cancer");
        cancer.add("Detecting Cancer");
        cancer.add("Treating Cancer");
        cancer.add("Symptom Navigator");

        List<String> findADoctor = new ArrayList<>();
        findADoctor.add("Doctors Near You");

        List<String> medicalServices = new ArrayList<>();
        medicalServices.add("Service Details");

        List<String> patientsAndVisitors = new ArrayList<>();
        patientsAndVisitors.add("You and the Hospital");

        List<String> careers = new ArrayList<>();
        careers.add("Current Job Listings");

        List<String> payYourBill = new ArrayList<>();
        payYourBill.add("Billing");

        List<String> aboutUs = new ArrayList<>();
        aboutUs.add("Our Medical Team");

        List<String> contactUs = new ArrayList<>();
        contactUs.add("Contact Us Directly");

        listHash.put(listDataHeader.get(0),cardiac);
        listHash.put(listDataHeader.get(1),orthopedic);
        listHash.put(listDataHeader.get(2),neurosciences);
        listHash.put(listDataHeader.get(3),cancer);
        listHash.put(listDataHeader.get(4),findADoctor);
        listHash.put(listDataHeader.get(5),medicalServices);
        listHash.put(listDataHeader.get(6),patientsAndVisitors);
        listHash.put(listDataHeader.get(7),careers);
        listHash.put(listDataHeader.get(8),payYourBill);
        listHash.put(listDataHeader.get(9),aboutUs);
        listHash.put(listDataHeader.get(10),contactUs);
    }
}