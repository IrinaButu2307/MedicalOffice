package com.medicaloffice.models;

import java.util.Objects;

public class Pill {
    Long id;
    private String name;
    private String prospect;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return prospect;
    }

    public void setDescription(String description) {
        this.prospect = description;
    }


    public Pill (){

    }

    public Pill(Long id, String name, String prospect) {
        this.id = id;
        this.name = name;
        this.prospect = prospect;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProspect() {
        return prospect;
    }

    public void setProspect(String prospect) {
        this.prospect = prospect;
    }

    @Override
    public String toString() {
        return "Pill{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", prospect='" + prospect + '\'' +
                '}';
    }
}

