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

}
