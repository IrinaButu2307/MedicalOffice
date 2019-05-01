package com.medicaloffice.models;

import com.medicaloffice.models.Diagnosis;

import java.util.List;

public class MedicalFile {
    Long id;
    List<Diagnosis> diagnosisList;

    public MedicalFile(){

    }
    public MedicalFile(Long id, List<Diagnosis> diagnosisList) {
        this.id = id;
        this.diagnosisList = diagnosisList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Diagnosis> getDiagnosisList() {
        return diagnosisList;
    }

    public void setDiagnosisList(List<Diagnosis> diagnosisList) {
        this.diagnosisList = diagnosisList;
    }

    @Override
    public String toString() {
        return "MedicalFile{" +
                "id=" + id +
                ", diagnosisList=" + diagnosisList +
                '}';
    }
}
