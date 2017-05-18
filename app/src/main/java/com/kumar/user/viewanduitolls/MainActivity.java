package com.kumar.user.viewanduitolls;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void inflate(View view) {
        Intent inflateIntent=new Intent(this,Layout_inflater.class);
        startActivity(inflateIntent);
    }

    public void listView(View view) {
        Intent listIntent=new Intent(this,List_View.class);
        startActivity(listIntent);

    }

    public void dropdown(View view) {
        Intent dropdown=new Intent(this,spinner.class);
        startActivity(dropdown);
    }
}
