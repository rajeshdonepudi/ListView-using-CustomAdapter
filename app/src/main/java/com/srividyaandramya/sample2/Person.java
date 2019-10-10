package com.srividyaandramya.sample2;

public class Person {

    private String name;
    private String dob;
    private String gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    Person(String name, String dob, String gender) {
        this.name = name;
        this.dob = dob;
        this.gender = gender;

    }
}
