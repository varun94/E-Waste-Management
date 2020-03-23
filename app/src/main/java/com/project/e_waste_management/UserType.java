package com.project.e_waste_management;

//get  string from string xml
public enum UserType {
    TENANT("Tenant")
    , RECYCLER("Recycler");

    private String val;

    UserType(String val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return  this.val;
    }
}

