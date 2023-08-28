package com.example.TurismoApp.repositories;

import com.example.TurismoApp.models.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository  extends JpaRepository <Company,Integer>{
}
