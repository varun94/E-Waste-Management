package com.project.e_waste_management;


import android.util.Log;
import android.view.View;
import android.widget.AdapterView;

public class DropDownListener implements AdapterView.OnItemSelectedListener {

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
       String item = parent.getItemAtPosition(position).toString();
       Log.i("CustomOnItemSelectedListener","onItemSelected :" +  item);
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}