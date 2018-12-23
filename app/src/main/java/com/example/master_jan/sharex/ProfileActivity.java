package com.example.master_jan.sharex;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;

public class ProfileActivity extends AppCompatActivity {

    FloatingActionButton addMentor;
    Button showAnalys;
    ImageView mentor_s;
    private ListView listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);


        addMentor = findViewById(R.id.fa_addmentor);
        showAnalys = findViewById(R.id.bt_analysis);
        mentor_s = findViewById(R.id.tik);


        mentor_s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ProfileActivity.this, TasksActivity.class);
                startActivity(intent);
            }


        });

        showAnalys.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ProfileActivity.this, AnalysisActivity.class);
                startActivity(intent);
            }


        });

        addMentor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ProfileActivity.this, MentorActivity.class);
                startActivity(intent);
            }


        });
    }
}

