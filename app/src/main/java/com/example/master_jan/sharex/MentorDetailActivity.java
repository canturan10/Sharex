package com.example.master_jan.sharex;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class MentorDetailActivity extends AppCompatActivity {

    Button mprogram;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mentordetail);

        mprogram = findViewById(R.id.bt_program);


        mprogram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MentorDetailActivity.this, MProgramActivity.class);
                startActivity(intent);
            }


        });
    }
}
