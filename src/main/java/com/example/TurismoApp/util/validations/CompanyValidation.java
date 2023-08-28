package com.example.TurismoApp.util.validations;

import com.example.TurismoApp.models.Company;
import com.example.TurismoApp.util.MessageEnum;
import org.hibernate.annotations.Comments;
import org.springframework.stereotype.Component;

@Component
public class CompanyValidation {

    Company company = new Company();

    public Boolean nameValidation (String name)throws Exception{
        if ( name.length() <30 ){
            throw new Exception(MessageEnum.INVALID_LENGTH_MAYOR_THIRTY.getMessage());
        } else {
            return true;
        }
    }
}
