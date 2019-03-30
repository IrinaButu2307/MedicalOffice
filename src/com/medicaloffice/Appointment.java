package com.medicaloffice;

import javax.print.Doc;
import java.time.LocalDate;
import java.util.Date;

public class Appointment {
    Long id;
    LocalDate date;
    private String hour;
    Doctor doctor;
    Patient patient;
    MedicalCentre medicalCentre;

    public Appointment() {

    }

    public Appointment(Long id, LocalDate date, String hour, Doctor doctor, Patient patient, MedicalCentre medicalCentre) {
        this.id = id;
        this.date = date;
        this.hour = hour;
        this.doctor = doctor;
        this.patient = patient;
        this.medicalCentre = medicalCentre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public MedicalCentre getMedicalCentre() {
        return medicalCentre;
    }

    public void setMedicalCentre(MedicalCentre medicalCentre) {
        this.medicalCentre = medicalCentre;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "id=" + id +
                ", date=" + date +
                ", hour='" + hour + '\'' +
                ", doctor=" + doctor +
                ", patient=" + patient +
                ", medicalCentre=" + medicalCentre +
                '}';
    }
}
