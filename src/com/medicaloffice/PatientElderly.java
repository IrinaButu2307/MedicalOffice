package com.medicaloffice;

public class PatientElderly extends Patient {

    public static final int minarterialTension =200;
    public static final int maxarterialTension =400;
    private boolean sedentarism;

    public PatientElderly(){

    }
    public PatientElderly(Long id, String CNP, String firstName, String lastName, String telephoneNumber, String email, int age, MedicalFile medicalFile, int arterialTension, boolean sedentarism) {
        super(id, CNP, firstName, lastName, telephoneNumber, email, age, medicalFile, arterialTension);
        this.sedentarism = sedentarism;
    }

    public static int getMinarterialTension() {
        return minarterialTension;
    }

    public static int getMaxarterialTension() {
        return maxarterialTension;
    }

    public boolean isSedentarism() {
        return sedentarism;
    }

    public void setSedentarism(boolean sedentarism) {
        this.sedentarism = sedentarism;
    }

    @Override
    public boolean hasHeartDiseaseRisk() {
        if(sedentarism == true || this.getArterialTension()>maxarterialTension || this.getArterialTension() < minarterialTension)
            return true;
        return false;
    }

    @Override
    public String toString() {
        return
               super.toString() +
                "PatientElderly{" +
                "sedentarism=" + sedentarism +
                ", id=" + id +
                '}';
    }
}
