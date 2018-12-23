package com.example.master_jan.sharex;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

public class MentorActivity extends AppCompatActivity {

    LinearLayout l1, l2, l3, l4, l5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mentor);

        l1 = findViewById(R.id.b1);
        l2 = findViewById(R.id.b2);
        l3 = findViewById(R.id.b3);
        l4 = findViewById(R.id.b4);
        l5 = findViewById(R.id.b5);


        l1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MentorActivity.this, MentorDetailActivity.class);
                startActivity(intent);
            }


        });

        l2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MentorActivity.this, MentorDetailActivity.class);
                startActivity(intent);
            }


        });

        l3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MentorActivity.this, MentorDetailActivity.class);
                startActivity(intent);
            }


        });

        l4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MentorActivity.this, MentorDetailActivity.class);
                startActivity(intent);
            }


        });

    }


}
