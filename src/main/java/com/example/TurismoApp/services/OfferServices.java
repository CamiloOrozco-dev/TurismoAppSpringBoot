package com.example.TurismoApp.services;

import com.example.TurismoApp.models.Company;
import com.example.TurismoApp.models.Offer;
import com.example.TurismoApp.repositories.OfferRepository;
import com.example.TurismoApp.util.MessageEnum;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class OfferServices {

    @Autowired
    OfferRepository offerRepository;

    public Offer registerOffer(Offer dataToRegister) throws Exception {
        try {
            //TODO:: need to validate the nit
            return (this.offerRepository.save(dataToRegister));
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }

    }

    public Offer editOffer(Integer id, Offer dataModify) throws Exception {

        try {
            //TODO:: need to validate the title
            Optional<Offer> offerFound = this.offerRepository.findById(id);
            if (offerFound.isEmpty()) {
                throw new Exception(MessageEnum.COMPANY_NOT_FOUND.getMessage());
            }
            Offer offerExists = offerFound.get();
            offerExists.setTitle(dataModify.getTitle());
            offerExists.setDescription(dataModify.getDescription());
            return (this.offerRepository.save(offerExists));
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    public Offer searchOfferById(Integer id) throws Exception {
        try {
        Optional<Offer> offerFound = this.offerRepository.findById(id);
        if (offerFound.isEmpty()) {
            throw new Exception(MessageEnum.OFFER_NOT_FOUND.getMessage());
        }
        return offerFound.get();
    }catch(Exception error){
        throw new Exception(error.getMessage());
    }
}
}
