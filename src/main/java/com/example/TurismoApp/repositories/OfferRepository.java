package com.example.TurismoApp.repositories;

import com.example.TurismoApp.models.Offer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OfferRepository extends JpaRepository<Offer,Integer> {
}
