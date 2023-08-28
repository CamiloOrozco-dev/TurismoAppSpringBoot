package com.example.TurismoApp.services;

import com.example.TurismoApp.models.Company;
import com.example.TurismoApp.models.Offer;
import com.example.TurismoApp.repositories.OfferRepository;
import com.example.TurismoApp.util.MessageEnum;
import org.springframework.beans.factory.annotation.Autowired;

public class OfferServices {

    @Autowired
    OfferRepository offerRepository;
    public Offer registerOffer (Offer dataToRegister) throws  Exception{
        try {

            return(this.offerRepository.save(dataToRegister));
        } catch ( Exception error){
            throw new Exception(error.getMessage());
        }
    }
}
