package com.example.TurismoApp.models;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.stream.Stream;
@Entity
@Table (name = "companys")
public class Company {
    @Id ()
   @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nit;
    private String name;
    private Integer location;
    private String description;

    public Company() {
    }

    public Company(Integer id, String nit, String name, Integer location, String description) {
        this.id = id;
        this.nit = nit;
        this.name = name;
        this.location = location;
        this.description = description;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLocation() {
        return location;
    }

    public void setLocation(Integer location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
