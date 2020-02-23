package com.gdg.volunteer;

import java.io.Serializable;

public class VolunteerList implements Serializable {
    String email;
    String name;
    String college;
    String yostudy;
    String number;
    String Gender;
    String expertise;
    String technologies;
    String specialisations;
    int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public VolunteerList(String email, String name, int age, String college, String yostudy, String number, String gender, String expertise, String technologies, String specialisations) {
        this.email = email;
        this.name = name;
        this.college = college;
        this.yostudy = yostudy;
        this.number = number;
        Gender = gender;
        this.expertise = expertise;
        this.technologies = technologies;
        this.specialisations = specialisations;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getYostudy() {
        return yostudy;
    }

    public void setYostudy(String yostudy) {
        this.yostudy = yostudy;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getExpertise() {
        return expertise;
    }

    public void setExpertise(String expertise) {
        this.expertise = expertise;
    }

    public String getTechnologies() {
        return technologies;
    }

    public void setTechnologies(String technologies) {
        this.technologies = technologies;
    }

    public String getSpecialisations() {
        return specialisations;
    }

    public void setSpecialisations(String specialisations) {
        this.specialisations = specialisations;
    }
}
