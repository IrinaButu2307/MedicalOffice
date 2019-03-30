package com.medicaloffice;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Prescription {
    Long id;
    List<Pill> pills;
    LocalDate startDate;
    LocalDate endDate;

    public Prescription(){

    }

    public Prescription(Long id, List<Pill> pills, LocalDate startDate, LocalDate endDate) {
        this.id = id;
        this.pills = pills;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Pill> getPills() {
        return pills;
    }

    public void setPills(List<Pill> pills) {
        this.pills = pills;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Prescription{" +
                "id=" + id +
                ", pills=" + pills +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}
