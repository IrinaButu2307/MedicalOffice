package com.medicaloffice;

import com.medicaloffice.utils.DiagnosisType;

public class Diagnosis {

    Long id;
    private Prescription prescription;
    private String disease;
    private int nextAppointment;
    private DiagnosisType diagnosisType;

    public Diagnosis(){

    }
    public Diagnosis(Long id, Prescription prescription, String disease, int nextAppointment, DiagnosisType diagnosisType) {
        this.id = id;
        this.prescription = prescription;
        this.disease = disease;
        this.nextAppointment = nextAppointment;
        this.diagnosisType = diagnosisType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Prescription getPrescription() {
        return prescription;
    }

    public void setPrescription(Prescription prescription) {
        this.prescription = prescription;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public int getNextAppointment() {
        return nextAppointment;
    }

    public void setNextAppointment(int nextAppointment) {
        this.nextAppointment = nextAppointment;
    }

    public DiagnosisType getDiagnosisType() {
        return diagnosisType;
    }

    public void setDiagnosisType(DiagnosisType diagnosisType) {
        this.diagnosisType = diagnosisType;
    }

    @Override
    public String toString() {
        return "Diagnosis{" +
                "id=" + id +
                ", prescription=" + prescription +
                ", disease='" + disease + '\'' +
                ", nextAppointment=" + nextAppointment +
                ", diagnosisType=" + diagnosisType +
                '}';
    }
}
