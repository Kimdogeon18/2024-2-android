package com.example.adapterview_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = findViewById(R.id.list);
        String[] data = {"111111111","222222222","333333333","444444444","5555555555"};

        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(MainActivity.this,
                        android.R.layout.simple_list_item_1,data);


        list.setAdapter(adapter);
    }//oncreate
}//class
