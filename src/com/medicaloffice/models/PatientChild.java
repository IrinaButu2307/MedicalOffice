package com.medicaloffice.models;

public class PatientChild extends Patient{

    public static final int minarterialTension =200;
    public static final int maxarterialTension =400;

    public PatientChild() {
    }

    public PatientChild(Long id, String CNP, String firstName, String lastName, String telephoneNumber, String email, int age, MedicalFile medicalFile, int arterialTension) {
        super(id, CNP, firstName, lastName, telephoneNumber, email, age, medicalFile, arterialTension);
    }

    public static int getMinarterialTension() {
        return minarterialTension;
    }

    public static int getMaxarterialTension() {
        return maxarterialTension;
    }

    @Override
    public boolean hasHeartDiseaseRisk() {
            if(this.getArterialTension()>maxarterialTension || this.getArterialTension() < minarterialTension)
                return true;
            return false;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "PatientChild{" +
                "id=" + id +
                '}';
    }
}
