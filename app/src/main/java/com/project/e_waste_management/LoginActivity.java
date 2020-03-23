package com.project.e_waste_management;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


public class LoginActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener  {

    private Spinner spinner1;
    private UserType selectedUserType;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        addListenersOnSpinner();
    }

    public void addListenersOnSpinner() {
        spinner1 = (Spinner) findViewById(R.id.drop_down);
        spinner1.setOnItemSelectedListener(this);
    }

    public void loginAction(View view) {

        Log.d("LoginActivity" , "loginAction : "+spinner1.getSelectedItem().toString());
        handleLogin();
    }

    public void handleLogin() {
        switch (selectedUserType) {
            case TENANT:
                openTenantHome();
                break;
            case RECYCLER:
                break;
            default:
                break;
        }
    }

    public void openTenantHome() {
        Intent intent = new Intent(this, TenetMainActivity.class);
        startActivity(intent);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String item = parent.getItemAtPosition(position).toString();
        selectedUserType = UserType.valueOf(item.toUpperCase());
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }


}
