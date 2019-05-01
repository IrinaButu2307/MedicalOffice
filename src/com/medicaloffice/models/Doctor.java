package com.medicaloffice.models;

public class Doctor implements Comparable<Doctor>{

    Long id;
    private String cnp;
    private String firstName;
    private String lastName;
    private String specialisation;
    private int yearsExperience;

    public Doctor(){

    }

    public Doctor(Long id, String cnp, String firstName, String lastName, String specialisation, int yearsExperience) {
        this.id = id;
        this.cnp = cnp;
        this.firstName = firstName;
        this.lastName = lastName;
        this.specialisation = specialisation;
        this.yearsExperience = yearsExperience;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSpecialisation() {
        return specialisation;
    }

    public void setSpecialisation(String specialisation) {
        this.specialisation = specialisation;
    }

    public int getYearsExperience() {
        return yearsExperience;
    }

    public void setYearsExperience(int yearsExperience) {
        this.yearsExperience = yearsExperience;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "id=" + id +
                ", cnp='" + cnp + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", specialisation='" + specialisation + '\'' +
                ", yearsExperience=" + yearsExperience +
                '}';
    }

    @Override
    public int compareTo(Doctor o) {
        return Integer.compare(this.getYearsExperience(), o.getYearsExperience());
    }
}

