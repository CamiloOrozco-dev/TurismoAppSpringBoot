package com.example.TurismoApp.models;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table (name = "offers")
public class Offer {
    @Id ()
    @GeneratedValue (strategy = GenerationType.IDENTITY)

    private Integer id;
    private String title;
    private String description;
    private LocalDate startDate;
    private LocalDate endDate;
    private Double personCost;

    public Offer() {
    }

    public Offer(Integer id, String title, String description, LocalDate startDate, LocalDate endDate, Double personCost) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
        this.personCost = personCost;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public Double getPersonCost() {
        return personCost;
    }

    public void setPersonCost(Double personCost) {
        this.personCost = personCost;
    }
}
