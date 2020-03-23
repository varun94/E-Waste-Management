package com.project.e_waste_management;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenersOnSpinner();
    }

    public void addListenersOnSpinner() {
        spinner1 = (Spinner) findViewById(R.id.drop_down);
        spinner1.setOnItemSelectedListener(new DropDownListener());
    }



}
