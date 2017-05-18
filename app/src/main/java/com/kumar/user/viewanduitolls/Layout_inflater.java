package com.kumar.user.viewanduitolls;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Layout_inflater extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_inflater);
    }

    public void inflater(View view) {
        LayoutInflater inflater=getLayoutInflater();
        View view1=inflater.inflate(R.layout.layout_inflate_example,null);
        EditText et= (EditText) view1.findViewById(R.id.wel);
        et.setText("Welcome");
       Toast toast=new Toast(getApplicationContext());
        toast.setView(view1);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER_VERTICAL,0,0);
        toast.show();
    }
}
