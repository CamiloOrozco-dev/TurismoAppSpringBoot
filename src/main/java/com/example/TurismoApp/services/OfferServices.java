package com.example.TurismoApp.services;

import com.example.TurismoApp.models.Company;
import com.example.TurismoApp.models.Offer;
import com.example.TurismoApp.repositories.OfferRepository;
import com.example.TurismoApp.util.MessageEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
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
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }
    public List<Offer> searchAllOffers () throws  Exception{
        try {
            List<Offer> offerList = this.offerRepository.findAll();
            return offerList;
        }catch ( Exception error){
            throw new Exception(error.getMessage());
        }
    }

    public Boolean deleteOffer (Integer id) throws Exception {
        try {
            Optional<Offer> optionalOffer = this.offerRepository.findById(id);
            if (optionalOffer.isPresent()) {
                this.offerRepository.deleteById(id);
                return true;
            } else {
                throw new Exception(MessageEnum.OFFER_NOT_FOUND.getMessage());
            }

        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }

    }
}
