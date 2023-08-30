package com.example.TurismoApp.controllers;

import com.example.TurismoApp.models.Company;
import com.example.TurismoApp.repositories.CompanyRepository;
import com.example.TurismoApp.services.CompanyServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/companys")
public class CompanyController {

    @Autowired
    CompanyServices companyServices;

    @Autowired
    CompanyRepository companyRepository;
@PostMapping
    public ResponseEntity <?> registerCompany(@RequestBody Company dataToRegister){
    return null;

    }
    @PutMapping ()
    public  ResponseEntity <?> editCompany(@RequestBody Company newDataModify, @PathVariable Integer idCompany){
    return null;

    }
    @GetMapping
    public ResponseEntity<?> searchCompanyById (@PathVariable Integer idCompany){
    return null;
    }
    @GetMapping
    public  ResponseEntity <?> searchAllCompanys (){
    return null;
    }

    @DeleteMapping

    public ResponseEntity <?> deleteCompany (@PathVariable Integer idCompany){
        return null;
    }
}
