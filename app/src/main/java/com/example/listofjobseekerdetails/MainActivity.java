package com.example.listofjobseekerdetails;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView simpleList;

    String seekerDetails[] = {"androidDeveloper", "companyName", "location",};
    int icons[] = {R.drawable.ic_person, R.drawable.ic_location,R.drawable.ic_company,};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        simpleList = (ListView) findViewById(R.id.simpleListView);
        SeekerAdapter SeekerAdapter = new SeekerAdapter(getApplicationContext(), seekerDetails, icons);
        simpleList.setAdapter(SeekerAdapter);
    }
}


