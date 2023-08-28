package com.example.TurismoApp.services;

import com.example.TurismoApp.models.Company;
import com.example.TurismoApp.repositories.CompanyRepository;
import com.example.TurismoApp.util.MessageEnum;
import com.example.TurismoApp.util.validations.CompanyValidation;
import org.apache.logging.log4j.message.Message;
import org.hibernate.service.spi.InjectService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

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

    public Company editCompany(Integer Id, Company dataModify) throws Exception {
        return null;
        //    throw new Exception(Message.);
    }

    public Company searchCompanyById(Integer Id) throws Exception{
        return null;
        //    throw new Exception(Message.);
    }

    public List<Company> searchAllCompanys () throws  Exception{
        return null;
        //    throw new Exception(Message.);
    }

    public  Boolean deleteCompany (Integer id) throws Exception{

        return true;
        //    throw new Exception(Message.);
    }
}


