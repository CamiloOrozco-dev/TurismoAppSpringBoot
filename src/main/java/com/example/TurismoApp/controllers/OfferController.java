package com.example.TurismoApp.controllers;

import com.example.TurismoApp.models.Company;
import com.example.TurismoApp.models.Offer;
import com.example.TurismoApp.repositories.CompanyRepository;
import com.example.TurismoApp.repositories.OfferRepository;
import com.example.TurismoApp.services.CompanyServices;
import com.example.TurismoApp.services.OfferServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/offer")
public class OfferController {

    @Autowired
    OfferServices offerServices;

    @Autowired
    OfferRepository offerRepository;
    @PostMapping
    public ResponseEntity<?> registerOffer(@RequestBody Offer dataToRegister){
        try {
            return  ResponseEntity
                    .status(HttpStatus.OK)
                    .body(this.offerServices.registerOffer(dataToRegister));
        } catch (Exception error){
            return  ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }

    }
    @PutMapping("{idOffer}")
    public  ResponseEntity <?> editOffer(@RequestBody Offer newDataModify, @PathVariable Integer idOffer){
        try {
            return  ResponseEntity
                    .status(HttpStatus.OK)
                    .body(this.offerServices.editOffer(idOffer,newDataModify));
        } catch (Exception error){
            return  ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }

    }
    @GetMapping ("{idOffer}")
    public ResponseEntity<?> searchOfferById (@PathVariable Integer idOffer){
        try {
            return  ResponseEntity
                    .status(HttpStatus.OK)
                    .body(this.offerServices.searchOfferById(idOffer));
        } catch (Exception error){
            return  ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }
    @GetMapping
    public  ResponseEntity <?> searchAllOffer (){
        try {
            return  ResponseEntity
                    .status(HttpStatus.OK)
                    .body(this.offerServices.searchAllOffers());
        } catch (Exception error){
            return  ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }

    @DeleteMapping ("{idOffer}")

    public ResponseEntity <?> deleteOffer (@PathVariable Integer idOffer){
        try {
            return  ResponseEntity
                    .status(HttpStatus.OK)
                    .body(this.offerServices.deleteOffer(idOffer));
        } catch (Exception error){
            return  ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }
}
