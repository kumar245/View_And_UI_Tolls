package com.kumar.user.viewanduitolls;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class spinner extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);
        Spinner sp1= (Spinner) findViewById(R.id.spinner1);
        List<String> arr = new ArrayList<String>();
        arr.add("admin");
        arr.add("developer");
        arr.add("tester");
        arr.add("backend");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,arr);
        sp1.setAdapter(arrayAdapter);
    }
}
