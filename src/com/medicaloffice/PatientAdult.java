package com.medicaloffice;

public class PatientAdult extends Patient {
    private boolean smoker;
    public static final int minarterialTension =200;
    public static final int maxarterialTension =400;

    public PatientAdult() {

    }

    public PatientAdult(Long id, String CNP, String firstName, String lastName, String telephoneNumber, String email, int age, MedicalFile medicalFile, int arterialTension, boolean smoker) {
        super(id, CNP, firstName, lastName, telephoneNumber, email, age, medicalFile, arterialTension);
        this.smoker = smoker;
    }

    public boolean isSmoker() {
        return smoker;
    }

    public void setSmoker(boolean smoker) {
        this.smoker = smoker;
    }

    public static int getMinarterialTension() {
        return minarterialTension;
    }

    public static int getMaxarterialTension() {
        return maxarterialTension;
    }

    @Override
    public boolean hasHeartDiseaseRisk() {
        if(smoker == true || this.getArterialTension()>maxarterialTension || this.getArterialTension() < minarterialTension)
            return true;
        return false;
    }

    @Override
    public String toString() {
        return super.toString() +
                "PatientAdult{" +
                "smoker=" + smoker +
                ", id=" + id +
                '}';
    }
}
