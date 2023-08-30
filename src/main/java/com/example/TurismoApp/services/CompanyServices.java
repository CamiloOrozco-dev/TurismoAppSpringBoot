package com.example.TurismoApp.services;

import com.example.TurismoApp.models.Company;
import com.example.TurismoApp.repositories.CompanyRepository;
import com.example.TurismoApp.util.MessageEnum;
import com.example.TurismoApp.util.validations.CompanyValidation;
import org.apache.logging.log4j.message.Message;
import org.hibernate.service.spi.InjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.*;
import java.util.List;
import java.util.Optional;
@Service
public class CompanyServices {
    @Autowired
     CompanyRepository companyRepository;
    @Autowired
    CompanyValidation companyValidation;
    public Company registerCompany (Company dataToRegister) throws  Exception{
        try {
                if (!this.companyValidation.nameValidation(dataToRegister.getName())) {
                    throw new Exception(MessageEnum.ERROR_SERVICE.getMessage());
                }
              return(this.companyRepository.save(dataToRegister));
        } catch ( Exception error){
            throw new Exception(error.getMessage());
        }
    }

    public Company editCompany(Integer id, Company dataModify) throws Exception {

    try {
        if (!this.companyValidation.nameValidation(dataModify.getName())){
            throw new Exception(MessageEnum.INVALID_LENGTH_MAYOR_THIRTY.getMessage());
        }
      Optional<Company> companyFound =  this.companyRepository.findById(id);
        if (companyFound.isEmpty()){
            throw new Exception(MessageEnum.COMPANY_NOT_FOUND.getMessage());
        }
        Company companyExists = companyFound.get();
        companyExists.setName(dataModify.getName());
      return  ( this.companyRepository.save(companyExists));
    } catch (Exception error) {
        throw new Exception(error.getMessage());
    }
    }

    public Company searchCompanyById(Integer id) throws Exception{
     try {
        Optional<Company> optionalCompany = this.companyRepository.findById(id);
        if(optionalCompany.isEmpty()){
          throw new Exception(MessageEnum.COMPANY_NOT_FOUND.getMessage());
        }
         return optionalCompany.get();
     }catch (Exception error){
         throw new Exception(error.getMessage());
     }
    }

    public List<Company> searchAllCompanys () throws  Exception{
     try {
       List<Company> companyList = this.companyRepository.findAll();
       return companyList;
     }catch ( Exception error){
         throw new Exception(error.getMessage());
     }
    }

    public  Boolean deleteCompany (Integer id) throws Exception{

      try {

          Optional<Company> optionalCompany = this.companyRepository.findById(id);
          if (optionalCompany.isPresent()){
              this.companyRepository.deleteById(id);
              return true;
          } else {
              throw new Exception(MessageEnum.COMPANY_NOT_FOUND.getMessage());
          }

      }catch (Exception error){
          throw new Exception(error.getMessage());
      }
    }
}


