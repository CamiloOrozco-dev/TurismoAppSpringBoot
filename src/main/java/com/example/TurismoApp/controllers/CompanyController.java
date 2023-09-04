package com.example.TurismoApp.controllers;

import com.example.TurismoApp.models.Company;
import com.example.TurismoApp.repositories.CompanyRepository;
import com.example.TurismoApp.services.CompanyServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/company")
public class CompanyController {

    @Autowired
    CompanyServices companyServices;

    @Autowired
    CompanyRepository companyRepository;
@PostMapping
    public ResponseEntity <?> registerCompany(@RequestBody Company dataToRegister) throws Exception {
    try {
        return  ResponseEntity
                .status(HttpStatus.OK)
                .body(this.companyServices.registerCompany(dataToRegister));
    } catch (Exception error){
        return  ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(error.getMessage());
    }

    }
    @PutMapping ("{idCompany}")
    public  ResponseEntity <?> editCompany(@RequestBody Company newDataModify, @PathVariable Integer idCompany){
        try {
            return  ResponseEntity
                    .status(HttpStatus.OK)
                    .body(this.companyServices.editCompany( idCompany, newDataModify));
        } catch (Exception error){
            return  ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }

    }
    @GetMapping ("{idCompany}")
    public ResponseEntity<?> searchCompanyById (@PathVariable Integer idCompany){

        try {
            return  ResponseEntity
                    .status(HttpStatus.OK)
                    .body(this.companyServices.searchCompanyById( idCompany));
        } catch (Exception error){
            return  ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }
    @GetMapping
    public  ResponseEntity <?> searchAllCompanys (){


        try {
            return  ResponseEntity
                    .status(HttpStatus.OK)
                    .body(this.companyServices.searchAllCompanys());
        } catch (Exception error){
            return  ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }

    @DeleteMapping ("{idCompany}")

    public ResponseEntity <?> deleteCompany (@PathVariable Integer idCompany){

        try {
            return  ResponseEntity
                    .status(HttpStatus.OK)
                    .body(this.companyServices.deleteCompany( idCompany));
        } catch (Exception error){
            return  ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }
}
