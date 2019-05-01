package com.medicaloffice.models;

public abstract class Patient implements Comparable<Patient>{

    Long id;
    private String CNP;
    private String firstName;
    private String lastName;
    private String telephoneNumber;
    private String email;
    private int age;
    private MedicalFile medicalFile;
    private int arterialTension;

    public abstract boolean hasHeartDiseaseRisk();

    public  Patient (){

    }
    public Patient(Long id, String CNP, String firstName, String lastName, String telephoneNumber, String email, int age, MedicalFile medicalFile, int arterialTension) {
        this.id = id;
        this.CNP = CNP;
        this.firstName = firstName;
        this.lastName = lastName;
        this.telephoneNumber = telephoneNumber;
        this.email = email;
        this.age = age;
        this.medicalFile = medicalFile;
        this.arterialTension = arterialTension;
    }

    public Patient(Long id, String CNP, String firstName, String lastName, String telephoneNumber, String email, int age, int arterialTension) {
        this.id = id;
        this.CNP = CNP;
        this.firstName = firstName;
        this.lastName = lastName;
        this.telephoneNumber = telephoneNumber;
        this.email = email;
        this.age = age;
        this.arterialTension = arterialTension;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCNP() {
        return CNP;
    }

    public void setCNP(String CNP) {
        this.CNP = CNP;
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

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public MedicalFile getMedicalFile() {
        return medicalFile;
    }

    public void setMedicalFile(MedicalFile medicalFile) {
        this.medicalFile = medicalFile;
    }

    public int getArterialTension() {
        return arterialTension;
    }

    public void setArterialTension(int arterialTension) {
        this.arterialTension = arterialTension;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", CNP='" + CNP + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", telephoneNumber='" + telephoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", medicalFile=" + medicalFile +
                ", arterialTension=" + arterialTension +
                '}';
    }

//    @Override
//    public int compareTo(Patient o) {
//        return Integer.compare(this.getMedicalFile().getDiagnosisList().size(), o.getMedicalFile().getDiagnosisList().size() );
//    }

    @Override
    public int compareTo(Patient o) {
        return this.getLastName().compareTo(o.getLastName());
    }
}
