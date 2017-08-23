package com.example.mrsang.spinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Spinner spinner;
    private List<String>  list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initWedget();
    }
    public void initWedget(){
        spinner = (Spinner)findViewById(R.id.spnLanguage);
        list.add("Java");
        list.add("PHP");
        list.add("C++");
        list.add("C#");
        list.add("Java Scrip");
        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,list);
        stringArrayAdapter.setDropDownViewResource(android.R.layout.simple_list_item_single_choice);
        spinner.setAdapter(stringArrayAdapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, spinner.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}
