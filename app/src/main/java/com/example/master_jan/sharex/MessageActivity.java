package com.example.master_jan.sharex;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MessageActivity extends AppCompatActivity {

    private ListView listview;


    private int image;
    private String title = "Jeff Bezos";
    private String description;

    private ArrayList<BeanClass> beanClassArrayList;
    private com.example.master_jan.sharex.CustomAdapter customAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);

        listview = findViewById(R.id.Mesajlar);

        beanClassArrayList = new ArrayList<BeanClass>();

        BeanClass beanClass = new BeanClass(image, title, description);
        beanClassArrayList.add(beanClass);

        customAdapter = new CustomAdapter(MessageActivity.this, beanClassArrayList);
        listview.setAdapter(customAdapter);


    }
}
