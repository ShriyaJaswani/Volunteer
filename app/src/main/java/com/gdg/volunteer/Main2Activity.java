package com.gdg.volunteer;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    ArrayList<VolunteerList> gfList;
    VolunteerAdapter fadapter;
    RecyclerView feedbackRCV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        gfList= new ArrayList<VolunteerList>();

        VolunteerList gf = (VolunteerList) getIntent().getSerializableExtra("feedback");
        gfList.add(gf);
        fadapter = new VolunteerAdapter(this,gfList);
        feedbackRCV = (RecyclerView)findViewById(R.id.volunteerRecyclerView);
        feedbackRCV.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        feedbackRCV.setAdapter(fadapter);
        fadapter.notifyDataSetChanged();

    }
}
