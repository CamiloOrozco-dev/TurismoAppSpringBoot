package com.example.TurismoApp.controllers;

import com.example.TurismoApp.models.Company;
import com.example.TurismoApp.models.Offer;
import com.example.TurismoApp.repositories.CompanyRepository;
import com.example.TurismoApp.repositories.OfferRepository;
import com.example.TurismoApp.services.CompanyServices;
import com.example.TurismoApp.services.OfferServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/Offers")
public class OfferController {

    @Autowired
    OfferServices offerServices;

    @Autowired
    OfferRepository offerRepository;
    @PostMapping
    public ResponseEntity<?> registerOffer(@RequestBody Offer dataToRegister){
        return null;

    }
    @PutMapping()
    public  ResponseEntity <?> editOffer(@RequestBody Offer newDataModify, @PathVariable Integer idOffer){
        return null;

    }
    @GetMapping
    public ResponseEntity<?> searchOfferById (@PathVariable Offer idOffer){
        return null;
    }
    @GetMapping
    public  ResponseEntity <?> searchAllOffer (){
        return null;
    }

    @DeleteMapping

    public ResponseEntity <?> deleteOffer (@PathVariable Integer idOffer){
        return null;
    }
}
